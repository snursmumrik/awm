/**
 * 
 */
package ac.soton.awm.generator;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextFactory;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachineFactory;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

import ac.soton.awm.aWM.DLoad;
import ac.soton.awm.aWM.DStore;
import ac.soton.awm.aWM.Fence;
import ac.soton.awm.aWM.Instruction;
import ac.soton.awm.aWM.Load;
import ac.soton.awm.aWM.Model;
import ac.soton.awm.aWM.Outcome;
import ac.soton.awm.aWM.Process;
import ac.soton.awm.aWM.State;
import ac.soton.awm.aWM.Store;
import ac.soton.awm.aWM.Wait;

/**
 * Generation job with progress monitor.
 * 
 * @author vitaly
 *
 */
public class GenerateJob extends Job {
	
	// sets
	private static final String MASTER_SET = "MASTER";
	private static final String LOAD_SET = "LOAD";
	private static final String STORE_SET = "STORE";
	private static final String FENCE_SET = "DMB";
	private static final String PROGRAM_SET = "PROGRAM";
	private static final String TRN_SET = "TRN";
	private static final String ISSUER_SET = "issuer";
	private static final String REGISTER_SET = "register";
	private static final String ADDRESS_SET = "address";
	private static final String ADDR_SET = "ADDR";
	private static final String REG_SET = "REG";
	private static final String VALUE_SET = "value";
	private static final String ADDRDEP_SET = "addressdependency";
	private static final String MEMACCESS_SET = "MEMACCESS";
	private static final String CTRLDEP_SET = "controldependency";
	private static final String VAL_SET = "VALUE";
	private static final String VAL_DECLARED_0 = "V0";
	private static final String VAL_DECLARED_1 = "V1";
	private static final String OBSERVED_SET = "observed";
	
	private IStatus ErrorStatus = Status.CANCEL_STATUS;
	private ResourceSet resourceSet;
	private Resource resource;
	private IPath targetPath;

	public GenerateJob(String name, ResourceSet rs, Resource r, IPath path) {
		super(name);
		resourceSet = rs;
		resource = r;
		targetPath = path;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IResource member = workspaceRoot.findMember(targetPath);
		
		try {
			copyTemplates(member.getLocation().toOSString());
			member.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
		} catch (IOException e) {
			MessageDialog.openError(Display.getDefault().getActiveShell(),
					"Generation Error",
					"Cannot copy templates to destination folder.");
			return ErrorStatus;
		} catch (CoreException e) {
			MessageDialog.openError(Display.getDefault().getActiveShell(),
					"Generation Error",
					"Cannot copy templates to destination folder.");
			return ErrorStatus;
		}

		String modelName = resource.getURI().trimFileExtension().lastSegment();
		Model model = (Model) resource.getContents().get(0);
		
		// context
		Context context = generateContext(model, "AC_" + modelName);
		context.getExtends().add((Context) loadContent(targetPath, "AC5.buc"));
		try {
			saveFile(context, targetPath, "buc");
		} catch (IOException e) {
			MessageDialog.openError(Display.getDefault().getActiveShell(),
					"Problem Occured",
					"Error when trying to save generated context.");
			return ErrorStatus;
		}
		
		// machine
		Machine machine = generateMachine(model, "AM_" + modelName);
		machine.getRefines().add((Machine) loadContent(targetPath, "AM5.bum"));
		machine.getSees().add(context);
		copyMachineContent(machine, (Machine) loadContent(targetPath, "AM6.bum"));
		try {
			saveFile(machine, targetPath, "bum");
			deleteFile(targetPath, "AM6.bum");
		} catch (IOException e) {
			MessageDialog.openError(Display.getDefault().getActiveShell(),
					"Problem Occured",
					"Error when trying to save generated machine.");
			return ErrorStatus;
		}
		
		System.gc();	// cleanup
		return Status.OK_STATUS;
	}

	/**
	 * Deletes a file.
	 * @param path
	 * @param fileName
	 * @throws IOException
	 * @throws RodinDBException 
	 */
	private void deleteFile(IPath path, String fileName) throws IOException {
		String projectName = path.segment(0);
		IRodinProject project = RodinCore.getRodinDB().getRodinProject(projectName);
		IRodinFile file = project.getRodinFile(fileName);
		try {
			file.delete(true, new NullProgressMonitor());
		} catch (RodinDBException e) {
			throw new IOException(e);
		}
	}

	/**
	 * Copies machine content from source to target.
	 * @param target
	 * @param source
	 */
	private void copyMachineContent(Machine target, Machine source) {
		target.getVariables().addAll(source.getVariables());
		target.getInvariants().addAll(source.getInvariants());
		target.getEvents().addAll(source.getEvents());
	}

	/**
	 * Saves EventBNamed element in a file.
	 * @param context
	 * @param path
	 * @param extension
	 * @throws IOException 
	 */
	private void saveFile(EventBNamed element, IPath path, String extension) throws IOException {
		path = path.append(element.getName()).addFileExtension(extension);
		URI uri = URI.createPlatformResourceURI(path.toOSString(), true);
		Resource res = resourceSet.createResource(uri);
		res.getContents().add(element);
		res.save(Collections.EMPTY_MAP);
		res.unload();
	}

	/**
	 * Loads content EObject from a file.
	 * @param path 
	 * @param fileName
	 * @return
	 */
	private EObject loadContent(IPath path, String fileName) {
		URI uri = URI.createPlatformResourceURI(path.append(fileName).toOSString(), true);
		Resource res = resourceSet.getResource(uri, true);
		EObject content = res.getContents().get(0);
		res.unload();
		return content;
	}

	/**
	 * Generates a context.
	 * @param model
	 * @param name
	 * @return 
	 */
	private Context generateContext(Model model, String name) {
		ContextGenerator ctxGen = ContextGenerator.INSTANCE;
		Context context = ContextFactory.eINSTANCE.createContext();
		context.setName(name);
		
		ctxGen.addConstant(PROGRAM_SET);									// PROGRAM const
		ctxGen.addConstant(ADDRDEP_SET);									// addressdependency const
		ctxGen.addPartFuncType(ADDRDEP_SET, MEMACCESS_SET, MEMACCESS_SET);	// addressdependency : MEMACCESS -|-> MEMACCESS
		ctxGen.addConstant(CTRLDEP_SET);									// controldependency const
		ctxGen.addPartFuncType(CTRLDEP_SET, MEMACCESS_SET, VAL_SET);		// controldependency : MEMACCESS -|-> VALUE
		ctxGen.addPartitionSet(VAL_SET, VAL_DECLARED_0);					// partition(VALUE, {V0},...)
		ctxGen.addPartitionSet(VAL_SET, VAL_DECLARED_1);					// partition(VALUE, {V1},...)
		
		int i = 1;
		for (Process proc : model.getProcesses()) {
			String procNum = proc.getName().substring(1);
			String masterName = "M" + procNum;
			
			ctxGen.addConstant(proc.getName());								// Pn const
			ctxGen.addConstant(masterName);									// Mn const
			ctxGen.addType(masterName, MASTER_SET);							// Mn : MASTER
			ctxGen.addPartitionSet(MASTER_SET, masterName);					// partition(MASTER, {Mn},...)
			ctxGen.addSetMaplet(PROGRAM_SET, masterName, proc.getName());	// PROGRAM = {Mn |-> Pn,...}
			
			for (Instruction instr : proc.getInstructions()) {
				String instrName = "I" + procNum + i;
				String prevInstr = "I" + procNum + (i-1);
				
				ctxGen.addConstant(instrName);								// Inm const
				ctxGen.addPartitionSet(TRN_SET, instrName);					// partition(TRN, {Inm},...)
				ctxGen.addSetMaplet(proc.getName(), Integer.toString(i), instrName);	// Pn = {m |-> Inm,...}
				ctxGen.addSetMaplet(ISSUER_SET, instrName, masterName);		// issuer = {Inm |-> Mn,...}
				
				if (instr instanceof Load) {
					Load load = (Load) instr;								// ld <reg>, <addr>
					String regName = load.getRegister().getName();
					String addrName = load.getAddress();
					
					ctxGen.addType(instrName, LOAD_SET);					// Inm : LOAD
					ctxGen.addConstant(regName);							// Rx const
					ctxGen.addPartitionSet(REG_SET, regName);				// partition(REG, {Rx},...)
					ctxGen.addSetMaplet(REGISTER_SET, instrName, regName);	// register = {Inm |-> Rx}
					ctxGen.addConstant(addrName);							// Ay const
					ctxGen.addPartitionSet(ADDR_SET, addrName);				// partition(ADDR, {Ay},...)
					ctxGen.addSetMaplet(ADDRESS_SET, instrName, addrName);	// address = {Inm |-> Ay,...}
					
				} else if (instr instanceof DLoad) {
					Load dload = (Load) instr;								// d_ld <reg>, <addr>
					String regName = dload.getRegister().getName();
					String addrName = dload.getAddress();
					
					ctxGen.addType(instrName, LOAD_SET);					// Inm : LOAD
					ctxGen.addConstant(regName);							// Rx const
					ctxGen.addPartitionSet(REG_SET, regName);				// partition(REG, {Rx},...)
					ctxGen.addSetMaplet(REGISTER_SET, instrName, regName);	// register = {Inm |-> Rx}
					ctxGen.addConstant(addrName);							// Ay const
					ctxGen.addPartitionSet(ADDR_SET, addrName);				// partition(ADDR, {Ay},...)
					ctxGen.addSetMaplet(ADDRESS_SET, instrName, addrName);	// address = {Inm |-> Ay,...}
					ctxGen.addSetMaplet(ADDRDEP_SET, instrName, prevInstr);	// addressdependency = {Inm |-> In m-1,...}
					
				} else if (instr instanceof Store) {
					Store store = (Store) instr;							// st <val>, <addr>
					String valName = "V" + store.getValue();				// <num> constant becomes V<num>
					String addrName = store.getAddress();
					
					ctxGen.addType(instrName, STORE_SET);					// Inm : STORE
					ctxGen.addSetMaplet(VALUE_SET, instrName, valName);		// value = {Inm |-> Vx}
					ctxGen.addConstant(addrName);							// Ay const
					ctxGen.addPartitionSet(ADDR_SET, addrName);				// partition(ADDR, {Ay},...)
					ctxGen.addSetMaplet(ADDRESS_SET, instrName, addrName);	// address = {Inm |-> Ay,...}
					
					if (!isDeclaredValue(valName)) {
						ctxGen.addConstant(valName);						// Vx const
						ctxGen.addType(valName, VAL_SET);					// Vx : VALUE
						ctxGen.addPartitionSet(VAL_SET, valName);			// partition(VALUE, {Vx},...)
					}
					
				} else if (instr instanceof DStore) {
					DStore dstore = (DStore) instr;							// d_st <val>, <addr>
					String valName = "V" + dstore.getValue();				// <num> constant becomes V<num>
					String addrName = dstore.getAddress();
					
					ctxGen.addType(instrName, STORE_SET);					// Inm : STORE
					ctxGen.addSetMaplet(VALUE_SET, instrName, valName);		// value = {Inm |-> Vx}
					ctxGen.addConstant(addrName);							// Ay const
					ctxGen.addPartitionSet(ADDR_SET, addrName);				// partition(ADDR, {Ay},...)
					ctxGen.addSetMaplet(ADDRESS_SET, instrName, addrName);	// address = {Inm |-> Ay,...}
					ctxGen.addSetMaplet(ADDRDEP_SET, instrName, prevInstr);	// addressdependency = {Inm |-> In m-1,...}
					
					if (!isDeclaredValue(valName)) {
						ctxGen.addConstant(valName);						// Vx const
						ctxGen.addType(valName, VAL_SET);					// Vx : VALUE
						ctxGen.addPartitionSet(VAL_SET, valName);			// partition(VALUE, {Vx},...)
					}
					
				} else if (instr instanceof Wait) {
					Wait wait = (Wait) instr;								// wait <reg>, <addr>, <val>
					String regName = wait.getRegister().getName();
					String addrName = wait.getAddress();
					String valName = "V" + wait.getValue();

					ctxGen.addType(instrName, LOAD_SET);					// Inm : LOAD
					ctxGen.addConstant(regName);							// Rx const
					ctxGen.addPartitionSet(REG_SET, regName);				// partition(REG, {Rx},...)
					ctxGen.addSetMaplet(REGISTER_SET, instrName, regName);	// register = {Inm |-> Rx}
					ctxGen.addConstant(addrName);							// Ay const
					ctxGen.addPartitionSet(ADDR_SET, addrName);				// partition(ADDR, {Ay},...)
					ctxGen.addSetMaplet(ADDRESS_SET, instrName, addrName);	// address = {Inm |-> Ay,...}
					//XXX: not in value set? (value = {Inm |-> Vx,...})
					ctxGen.addSetMaplet(CTRLDEP_SET, instrName, valName);	// controldependency = {Inm |-> Vx,...}
					
					if (!isDeclaredValue(valName)) {
						ctxGen.addConstant(valName);						// Vx const
						ctxGen.addType(valName, VAL_SET);					// Vx : VALUE
						ctxGen.addPartitionSet(VAL_SET, valName);			// partition(VALUE, {Vx},...)
					}
					
				} else if (instr instanceof Fence) {
					ctxGen.addType(instrName, FENCE_SET);					// Inm : FENCE
				}
				i++;
			}
			i = 1;
		}

		ctxGen.generateTo(context);
		return context;
	}

	/**
	 * Generates a machine.
	 * @param model
	 * @param name
	 * @return
	 */
	private Machine generateMachine(Model model, String name) {
		MachineGenerator generator = MachineGenerator.INSTANCE;
		Machine machine = MachineFactory.eINSTANCE.createMachine();
		machine.setName(name);
		
		int i = 1;
		for (Process proc : model.getProcesses()) {
			String procNum = proc.getName().substring(1);
			for (Instruction instr : proc.getInstructions()) {
				String instrName = "I" + procNum + i++;
				if (instr instanceof Load || instr instanceof DLoad) {
					generator.addOutcomeInstructionState(OBSERVED_SET, instrName);	// invariant: {Inm,...} <: observed ...
				}
			}
			i = 1;
		}
		
		i = 1;
		for (Outcome outc : model.getOutcomes()) {
			generator.addOutcomeState("outcome_" + i++, (State) outc);
		}

		generator.generateTo(machine);
		return machine;
	}

	/**
	 * Checks if the value was already declared (in template AC3)
	 * @param valName
	 * @return
	 */
	private boolean isDeclaredValue(String valName) {
		return VAL_DECLARED_0.equals(valName) || VAL_DECLARED_1.equals(valName);
	}

	/**
	 * Copies all template files to given path.
	 * @param path
	 * @throws IOException
	 */
	public void copyTemplates(String path) throws IOException {
		URL base = Platform.getBundle(Activator.PLUGIN_ID).getEntry("templates");
		File srdDir = new File(FileLocator.toFileURL(base).getPath());
		File trgDir = new File(path);
		
		// copy .buc and .bum files to project
		Iterator<File> it = FileUtils.iterateFiles(srdDir, new String[]{"buc","bum"}, false);
		while (it.hasNext()) {
			FileUtils.copyFileToDirectory(it.next(), trgDir);
		}
	}
}
