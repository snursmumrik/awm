package ac.soton.awm.serializer;

import ac.soton.awm.aWM.AWMPackage;
import ac.soton.awm.aWM.Binary;
import ac.soton.awm.aWM.DLoad;
import ac.soton.awm.aWM.DStore;
import ac.soton.awm.aWM.Fence;
import ac.soton.awm.aWM.Load;
import ac.soton.awm.aWM.Model;
import ac.soton.awm.aWM.Not;
import ac.soton.awm.aWM.RegState;
import ac.soton.awm.aWM.Register;
import ac.soton.awm.aWM.Store;
import ac.soton.awm.aWM.Wait;
import ac.soton.awm.services.AWMGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AWMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AWMGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AWMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AWMPackage.BINARY:
				if(context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getOutcomeRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getStateRule()) {
					sequence_Conjunction_Disjunction_Implication(context, (Binary) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.DLOAD:
				if(context == grammarAccess.getDLoadRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_DLoad(context, (DLoad) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.DSTORE:
				if(context == grammarAccess.getDStoreRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_DStore(context, (DStore) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.FENCE:
				if(context == grammarAccess.getFenceRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Fence(context, (Fence) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.LOAD:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoadRule()) {
					sequence_Load(context, (Load) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.NOT:
				if(context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getNegatedRule() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getOutcomeRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getStateRule()) {
					sequence_Negated(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (ac.soton.awm.aWM.Process) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.REG_STATE:
				if(context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getOutcomeRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRegStateRule() ||
				   context == grammarAccess.getStateRule()) {
					sequence_RegState(context, (RegState) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.REGISTER:
				if(context == grammarAccess.getRegisterRule()) {
					sequence_Register(context, (Register) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.STORE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStoreRule()) {
					sequence_Store(context, (Store) semanticObject); 
					return; 
				}
				else break;
			case AWMPackage.WAIT:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getWaitRule()) {
					sequence_Wait(context, (Wait) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (left=Disjunction_Binary_1_0 op=OR right=Disjunction) | 
	 *         (left=Conjunction_Binary_1_0 op=AND right=Conjunction) | 
	 *         (left=Implication_Binary_1_0 op=IMPLY right=Implication)
	 *     )
	 */
	protected void sequence_Conjunction_Disjunction_Implication(EObject context, Binary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (register=Register address=ADDR)
	 */
	protected void sequence_DLoad(EObject context, DLoad semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.DLOAD__REGISTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.DLOAD__REGISTER));
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.DLOAD__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.DLOAD__ADDRESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDLoadAccess().getRegisterRegisterParserRuleCall_1_0(), semanticObject.getRegister());
		feeder.accept(grammarAccess.getDLoadAccess().getAddressADDRTerminalRuleCall_3_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT address=ADDR)
	 */
	protected void sequence_DStore(EObject context, DStore semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.DSTORE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.DSTORE__VALUE));
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.DSTORE__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.DSTORE__ADDRESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDStoreAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getDStoreAccess().getAddressADDRTerminalRuleCall_3_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Fence}
	 */
	protected void sequence_Fence(EObject context, Fence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (register=Register address=ADDR)
	 */
	protected void sequence_Load(EObject context, Load semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.LOAD__REGISTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.LOAD__REGISTER));
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.LOAD__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.LOAD__ADDRESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoadAccess().getRegisterRegisterParserRuleCall_1_0(), semanticObject.getRegister());
		feeder.accept(grammarAccess.getLoadAccess().getAddressADDRTerminalRuleCall_3_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (processes+=Process* outcomes+=Outcome*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     not=Primary
	 */
	protected void sequence_Negated(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.NOT__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.NOT__NOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegatedAccess().getNotPrimaryParserRuleCall_1_0(), semanticObject.getNot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=PROC instructions+=Instruction*)
	 */
	protected void sequence_Process(EObject context, ac.soton.awm.aWM.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (register=[Register|RQN] value=INT)
	 */
	protected void sequence_RegState(EObject context, RegState semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.REG_STATE__REGISTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.REG_STATE__REGISTER));
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.REG_STATE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.REG_STATE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegStateAccess().getRegisterRegisterRQNParserRuleCall_0_0_1(), semanticObject.getRegister());
		feeder.accept(grammarAccess.getRegStateAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=REG
	 */
	protected void sequence_Register(EObject context, Register semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.REGISTER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.REGISTER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegisterAccess().getNameREGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT address=ADDR)
	 */
	protected void sequence_Store(EObject context, Store semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.STORE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.STORE__VALUE));
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.STORE__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.STORE__ADDRESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStoreAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getStoreAccess().getAddressADDRTerminalRuleCall_3_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (register=Register address=ADDR value=INT)
	 */
	protected void sequence_Wait(EObject context, Wait semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.WAIT__REGISTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.WAIT__REGISTER));
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.WAIT__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.WAIT__ADDRESS));
			if(transientValues.isValueTransient(semanticObject, AWMPackage.Literals.WAIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AWMPackage.Literals.WAIT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWaitAccess().getRegisterRegisterParserRuleCall_1_0(), semanticObject.getRegister());
		feeder.accept(grammarAccess.getWaitAccess().getAddressADDRTerminalRuleCall_3_0(), semanticObject.getAddress());
		feeder.accept(grammarAccess.getWaitAccess().getValueINTTerminalRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
}
