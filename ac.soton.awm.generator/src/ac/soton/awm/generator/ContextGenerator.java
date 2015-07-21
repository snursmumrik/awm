/**
 * 
 */
package ac.soton.awm.generator;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextFactory;

import ac.soton.awm.conversion.EventBSymbols;

/**
 * Simple Event-B Context code generator.
 * 
 * @author vitaly
 *
 */
public enum ContextGenerator implements EventBSymbols {
	INSTANCE;

	// generation structures
	private Set<String> sets = new TreeSet<String>();
	private Set<String> constants = new TreeSet<String>();
	private Map<String, String> types = new TreeMap<String, String>();
	private Map<String, Set<String>> setElements = new TreeMap<String, Set<String>>(String.CASE_INSENSITIVE_ORDER);
	private Map<String, Set<String>> partitionElements = new TreeMap<String, Set<String>>();
	
	/**
	 * Adds set.
	 * @param set
	 * @return
	 */
	public ContextGenerator addSet(String set) {
		sets.add(set);
		return this;
	}

	/**
	 * Adds constant.
	 * @param constant
	 * @return
	 */
	public ContextGenerator addConstant(String constant) {
		constants.add(constant);
		return this;
	}

	/**
	 * Adds simple set type.
	 * @param element
	 * @param type
	 * @return
	 */
	public ContextGenerator addType(String element, String type) {
		types.put(element, type);
		return this;
	}

	/**
	 * Adds function type.
	 * @param element
	 * @param domain
	 * @param range
	 * @return
	 */
	public ContextGenerator addFuncType(String element, String domain,
			String range) {
		types.put(element, domain + B_FUNC + range);
		return this;
	}

	/**
	 * Adds partial function type.
	 * @param element
	 * @param domain
	 * @param range
	 * @return
	 */
	public ContextGenerator addPartFuncType(String element, String domain,
			String range) {
		types.put(element, domain + B_PARTFUNC + range);
		return this;
	}
	
	/**
	 * Adds empty set.
	 * @param set
	 * @return
	 */
	public ContextGenerator addSetEmpty(String set) {
		setElements.put(set, null);
		return this;
	}

	/**
	 * Adds set maplet element.
	 * @param set
	 * @param key
	 * @param value
	 * @return
	 */
	public ContextGenerator addSetMaplet(String set, String key, String value) {
		Set<String> elements = setElements.get(set);
		if (elements == null) {
			elements = new TreeSet<String>();
			setElements.put(set, elements);
		}
		elements.add(key + B_MAPLET + value);
		return this;
	}

	/**
	 * Adds partitioned set element.
	 * @param partition
	 * @param element
	 * @return
	 */
	public ContextGenerator addPartitionSet(String partition, String element) {
		Set<String> elements = partitionElements.get(partition);
		if (elements == null) {
			elements = new TreeSet<String>();
			partitionElements.put(partition, elements);
		}
		elements.add(B_LBRC + element + B_RBRC);
		return this;
	}

	/**
	 * Generates code from previously populated data to the provided context.
	 * @param context
	 * @return
	 */
	public ContextGenerator generateTo(Context context) {
		EList<CarrierSet> eventBSets = context.getSets();
		
		for (String set : sets)
			eventBSets.add(createSet(set));
		
		EList<Constant> eventBConstants = context.getConstants();
		
		for (String constant : constants)
			eventBConstants.add(createConstant(constant));
		
		EList<Axiom> eventBAxioms = context.getAxioms();
		
		for (Entry<String, String> entry : types.entrySet())
			eventBAxioms.add(createAxiom("type_of_" + entry.getKey(),
					entry.getKey() + B_IN + entry.getValue()));
		
		for (Entry<String, Set<String>> entry : setElements.entrySet()) {
			String value = entry.getValue() == null ? B_EMPTYSET : 
				B_LBRC + StringUtils.join(entry.getValue(), B_COM) + B_RBRC;
			eventBAxioms.add(createAxiom(
					entry.getKey() + "_set", 
					entry.getKey() + B_EQ + value));
		}

		for (Entry<String, Set<String>> entry : partitionElements.entrySet())
			eventBAxioms.add(createAxiom(
					entry.getKey() + "_partition",
					"partition" + B_LPAR + entry.getKey() + B_COM
							+ StringUtils.join(entry.getValue(), B_COM) + B_RPAR));
		return this.clear();
	}

	/**
	 * Clears generator data for another generation.
	 * After this the generator can be populated with new data and generate new code.
	 * @return
	 */
	public ContextGenerator clear() {
		sets.clear();
		constants.clear();
		types.clear();
		setElements.clear();
		partitionElements.clear();
		return this;
	}
	
	//--------------------------------------------------
	// Methods for creating Event-B elements
	//--------------------------------------------------

	/**
	 * Creates carrier set.
	 * @param set
	 * @return
	 */
	private CarrierSet createSet(String set) {
		CarrierSet eventBSet = ContextFactory.eINSTANCE.createCarrierSet();
		eventBSet.setName(set);
		return eventBSet;
	}
	
	/**
	 * Creates Event-B constant.
	 * @param constant
	 * @return
	 */
	private Constant createConstant(String constant) {
		Constant eventBConstant = ContextFactory.eINSTANCE.createConstant();
		eventBConstant.setName(constant);
		return eventBConstant;
	}
	
	/**
	 * Creates Event-B axiom.
	 * @param label
	 * @param predicate
	 * @return
	 */
	private Axiom createAxiom(String label, String predicate) {
		Axiom eventBAxiom = ContextFactory.eINSTANCE.createAxiom();
		eventBAxiom.setName(label);
		eventBAxiom.setPredicate(predicate);
		return eventBAxiom;
	}
}
