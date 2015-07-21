/**
 * 
 */
package ac.soton.awm.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachineFactory;

import ac.soton.awm.aWM.Binary;
import ac.soton.awm.aWM.Not;
import ac.soton.awm.aWM.Process;
import ac.soton.awm.aWM.RegState;
import ac.soton.awm.aWM.Register;
import ac.soton.awm.aWM.State;
import ac.soton.awm.conversion.EventBSymbols;

/**
 * Simple Event-B Context code generator.
 * 
 * @author vitaly
 *
 */
public enum MachineGenerator implements EventBSymbols {
	INSTANCE;
	
	// generation structures
	private Map<String, Set<String>> instructions = new TreeMap<String, Set<String>>();
	private Map<String, State> outcomes = new TreeMap<String, State>();
	
	private static final String REGISTERFILE = "registerfile";
	private static final String MASTER_PREFIX = "M";
	private static final String VALUE_PREFIX = "V";


	/**
	 * Instruction set state, i.e. {instruction1, ...} <: state_set
	 * @param state
	 * @param instruction
	 * @return
	 */
	public MachineGenerator addOutcomeInstructionState(String state, String instruction) {
		Set<String> elements = instructions.get(state);
		if (elements == null) {
			elements = new TreeSet<String>();
			instructions.put(state, elements);
		}
		elements.add(instruction);
		return this;
	}

	/**
	 * @param outcome
	 * @param state
	 * @return
	 */
	public MachineGenerator addOutcomeState(String outcome, State state) {
		outcomes.put(outcome, state);
		return this;
	}

	/**
	 * Generates code from previously populated data to the provided machine.
	 * @param machine
	 * @return
	 */
	public EventBSymbols generateTo(Machine machine) {
		EList<Invariant> eventBInvariants = machine.getInvariants();
		
		List<String> states = new ArrayList<String>();
		for (Entry<String, State> entry : outcomes.entrySet()) {
			for (Entry<String, Set<String>> e : instructions.entrySet()) {
				states.add(B_LBRC + StringUtils.join(e.getValue(), B_COM) + B_RBRC + B_SUBSETEQ + e.getKey());
			}
			
			eventBInvariants.add(createInvariant(entry.getKey(), 
					StringUtils.join(states, B_AND) + B_AND + getStateExpression(entry.getValue())));
		}

		return this.clear();
	}
	
	/**
	 * Register state expression from the state tree.
	 * Uses iterative in-order tree traversal.
	 * @param state
	 * @return
	 */
	private String getStateExpression(State state) {
		String predicate = "";
		Stack<State> stack = new Stack<State>();
		State preState = state;
		
		while (!stack.isEmpty() || state instanceof RegState == false)
			if (state instanceof Binary) {
				stack.push(state);
				state = ((Binary) state).getLeft();
				
			} else if (state instanceof Not) {
				stack.push(state);
				state = ((Not) state).getNot();
				predicate += B_NOT;
				if (state instanceof RegState == false)
					predicate += B_LPAR;
				
			} else {
				predicate += getRegisterState((RegState) state);
				preState = state;
				state = stack.pop();
				
				if (state instanceof Binary) {
					predicate += ((Binary) state).getOp();
					state = ((Binary) state).getRight();
					
				} else if (state instanceof Not) {
					if (((Not) state).getNot() instanceof RegState == false)
						predicate += B_RPAR;
					state = preState;
				}
			}
		return predicate;
	}

	/**
	 * Register state expression, i.e. (registerfile(Mn))(Rx) = Vy
	 * @param state
	 * @return
	 */
	private String getRegisterState(RegState state) {
		Register reg = state.getRegister();
		String masterName = MASTER_PREFIX + ((Process) reg.eContainer().eContainer())
				.getName().substring(1);
		String valueName = VALUE_PREFIX + state.getValue();
		return B_LPAR + REGISTERFILE + B_LPAR + masterName + B_RPAR
				+ B_RPAR + B_LPAR + reg.getName() + B_RPAR + B_EQ
				+ valueName;
	}

	/**
	 * Clears generator data for another generation.
	 * After this the generator can be populated with new data and generate new code.
	 * @return
	 */
	public EventBSymbols clear() {
		instructions.clear();
		outcomes.clear();
		return this;
	}
	
	//--------------------------------------------------
	// Methods for creating Event-B elements
	//--------------------------------------------------
	
	/**
	 * Creates Event-B invariant.
	 * @param label
	 * @param predicate
	 * @return
	 */
	private Invariant createInvariant(String label, String predicate) {
		Invariant eventBInvariant = MachineFactory.eINSTANCE.createInvariant();
		eventBInvariant.setName(label);
		eventBInvariant.setPredicate(predicate);
		return eventBInvariant;
	}
}
