/**
 * 
 */
package ac.soton.awm.generator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author vitaly
 *
 */
public class GenerateCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		// find source file either from editor or selection
		IFile sourceFile = null;
		if (editor != null) {
			// WorkspaceSynchronizer.getFile(eResource);
			sourceFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);
		} else {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IFile) {
				sourceFile = (IFile) firstElement;
			}
		}
		
		//error: no source found
		if (sourceFile == null) {
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Generation Error", "No source file is found.");
			return null;
		}
		
		
		// request target path
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				Display.getDefault().getActiveShell(), sourceFile.getProject(), false, "Generate to:");
		dialog.showClosedProjects(false);
		if (dialog.open() != Window.OK)
			return null;
		IPath targetPath = (IPath) dialog.getResult()[0];
		
		// load source model (Xtext)
		URI uri = URI.createPlatformResourceURI(sourceFile.getFullPath().toString(), true);
		ResourceSet rs = new ResourceSetImpl();
		Resource r;
		try {
			r = rs.getResource(uri, true);
		} catch (RuntimeException e) {
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Generation Error", "Cannot load source file.");
			return null;
		}
			
		Job job = new GenerateJob("Generating Event-B", rs, r, targetPath);
	    job.setUser(true);
		job.schedule();
		return null;
	}
}
