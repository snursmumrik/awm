/**
 */
package ac.soton.awm.aWM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.awm.aWM.AWMFactory
 * @model kind="package"
 * @generated
 */
public interface AWMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aWM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.soton.ac/awm/AWM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aWM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AWMPackage eINSTANCE = ac.soton.awm.aWM.impl.AWMPackageImpl.init();

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.ModelImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROCESSES = 0;

  /**
   * The feature id for the '<em><b>Outcomes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OUTCOMES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.ProcessImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__INSTRUCTIONS = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.InstructionImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 2;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.LoadImpl <em>Load</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.LoadImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getLoad()
   * @generated
   */
  int LOAD = 3;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__REGISTER = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__ADDRESS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.StoreImpl <em>Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.StoreImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getStore()
   * @generated
   */
  int STORE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__ADDRESS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.DLoadImpl <em>DLoad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.DLoadImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getDLoad()
   * @generated
   */
  int DLOAD = 5;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DLOAD__REGISTER = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DLOAD__ADDRESS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DLoad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DLOAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.DStoreImpl <em>DStore</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.DStoreImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getDStore()
   * @generated
   */
  int DSTORE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSTORE__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSTORE__ADDRESS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DStore</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSTORE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.WaitImpl <em>Wait</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.WaitImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getWait()
   * @generated
   */
  int WAIT = 7;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT__REGISTER = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT__ADDRESS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT__VALUE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Wait</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.FenceImpl <em>Fence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.FenceImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getFence()
   * @generated
   */
  int FENCE = 8;

  /**
   * The number of structural features of the '<em>Fence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FENCE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.RegisterImpl <em>Register</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.RegisterImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getRegister()
   * @generated
   */
  int REGISTER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__NAME = 0;

  /**
   * The number of structural features of the '<em>Register</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.OutcomeImpl <em>Outcome</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.OutcomeImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getOutcome()
   * @generated
   */
  int OUTCOME = 10;

  /**
   * The number of structural features of the '<em>Outcome</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.StateImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getState()
   * @generated
   */
  int STATE = 11;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = OUTCOME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.RegStateImpl <em>Reg State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.RegStateImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getRegState()
   * @generated
   */
  int REG_STATE = 12;

  /**
   * The feature id for the '<em><b>Register</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REG_STATE__REGISTER = STATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REG_STATE__VALUE = STATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reg State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REG_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.BinaryImpl <em>Binary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.BinaryImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getBinary()
   * @generated
   */
  int BINARY = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY__LEFT = STATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY__OP = STATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY__RIGHT = STATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FEATURE_COUNT = STATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ac.soton.awm.aWM.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.awm.aWM.impl.NotImpl
   * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getNot()
   * @generated
   */
  int NOT = 14;

  /**
   * The feature id for the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__NOT = STATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see ac.soton.awm.aWM.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link ac.soton.awm.aWM.Model#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see ac.soton.awm.aWM.Model#getProcesses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Processes();

  /**
   * Returns the meta object for the containment reference list '{@link ac.soton.awm.aWM.Model#getOutcomes <em>Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outcomes</em>'.
   * @see ac.soton.awm.aWM.Model#getOutcomes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Outcomes();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see ac.soton.awm.aWM.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ac.soton.awm.aWM.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ac.soton.awm.aWM.Process#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see ac.soton.awm.aWM.Process#getInstructions()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Instructions();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see ac.soton.awm.aWM.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Load <em>Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load</em>'.
   * @see ac.soton.awm.aWM.Load
   * @generated
   */
  EClass getLoad();

  /**
   * Returns the meta object for the containment reference '{@link ac.soton.awm.aWM.Load#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Register</em>'.
   * @see ac.soton.awm.aWM.Load#getRegister()
   * @see #getLoad()
   * @generated
   */
  EReference getLoad_Register();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.Load#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see ac.soton.awm.aWM.Load#getAddress()
   * @see #getLoad()
   * @generated
   */
  EAttribute getLoad_Address();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Store</em>'.
   * @see ac.soton.awm.aWM.Store
   * @generated
   */
  EClass getStore();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.Store#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ac.soton.awm.aWM.Store#getValue()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Value();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.Store#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see ac.soton.awm.aWM.Store#getAddress()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Address();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.DLoad <em>DLoad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DLoad</em>'.
   * @see ac.soton.awm.aWM.DLoad
   * @generated
   */
  EClass getDLoad();

  /**
   * Returns the meta object for the containment reference '{@link ac.soton.awm.aWM.DLoad#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Register</em>'.
   * @see ac.soton.awm.aWM.DLoad#getRegister()
   * @see #getDLoad()
   * @generated
   */
  EReference getDLoad_Register();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.DLoad#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see ac.soton.awm.aWM.DLoad#getAddress()
   * @see #getDLoad()
   * @generated
   */
  EAttribute getDLoad_Address();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.DStore <em>DStore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DStore</em>'.
   * @see ac.soton.awm.aWM.DStore
   * @generated
   */
  EClass getDStore();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.DStore#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ac.soton.awm.aWM.DStore#getValue()
   * @see #getDStore()
   * @generated
   */
  EAttribute getDStore_Value();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.DStore#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see ac.soton.awm.aWM.DStore#getAddress()
   * @see #getDStore()
   * @generated
   */
  EAttribute getDStore_Address();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Wait <em>Wait</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wait</em>'.
   * @see ac.soton.awm.aWM.Wait
   * @generated
   */
  EClass getWait();

  /**
   * Returns the meta object for the containment reference '{@link ac.soton.awm.aWM.Wait#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Register</em>'.
   * @see ac.soton.awm.aWM.Wait#getRegister()
   * @see #getWait()
   * @generated
   */
  EReference getWait_Register();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.Wait#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see ac.soton.awm.aWM.Wait#getAddress()
   * @see #getWait()
   * @generated
   */
  EAttribute getWait_Address();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.Wait#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ac.soton.awm.aWM.Wait#getValue()
   * @see #getWait()
   * @generated
   */
  EAttribute getWait_Value();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Fence <em>Fence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fence</em>'.
   * @see ac.soton.awm.aWM.Fence
   * @generated
   */
  EClass getFence();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Register <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Register</em>'.
   * @see ac.soton.awm.aWM.Register
   * @generated
   */
  EClass getRegister();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.Register#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ac.soton.awm.aWM.Register#getName()
   * @see #getRegister()
   * @generated
   */
  EAttribute getRegister_Name();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Outcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outcome</em>'.
   * @see ac.soton.awm.aWM.Outcome
   * @generated
   */
  EClass getOutcome();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see ac.soton.awm.aWM.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.RegState <em>Reg State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reg State</em>'.
   * @see ac.soton.awm.aWM.RegState
   * @generated
   */
  EClass getRegState();

  /**
   * Returns the meta object for the reference '{@link ac.soton.awm.aWM.RegState#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Register</em>'.
   * @see ac.soton.awm.aWM.RegState#getRegister()
   * @see #getRegState()
   * @generated
   */
  EReference getRegState_Register();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.RegState#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ac.soton.awm.aWM.RegState#getValue()
   * @see #getRegState()
   * @generated
   */
  EAttribute getRegState_Value();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Binary <em>Binary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary</em>'.
   * @see ac.soton.awm.aWM.Binary
   * @generated
   */
  EClass getBinary();

  /**
   * Returns the meta object for the containment reference '{@link ac.soton.awm.aWM.Binary#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see ac.soton.awm.aWM.Binary#getLeft()
   * @see #getBinary()
   * @generated
   */
  EReference getBinary_Left();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.awm.aWM.Binary#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see ac.soton.awm.aWM.Binary#getOp()
   * @see #getBinary()
   * @generated
   */
  EAttribute getBinary_Op();

  /**
   * Returns the meta object for the containment reference '{@link ac.soton.awm.aWM.Binary#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see ac.soton.awm.aWM.Binary#getRight()
   * @see #getBinary()
   * @generated
   */
  EReference getBinary_Right();

  /**
   * Returns the meta object for class '{@link ac.soton.awm.aWM.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see ac.soton.awm.aWM.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for the containment reference '{@link ac.soton.awm.aWM.Not#getNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Not</em>'.
   * @see ac.soton.awm.aWM.Not#getNot()
   * @see #getNot()
   * @generated
   */
  EReference getNot_Not();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AWMFactory getAWMFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.ModelImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROCESSES = eINSTANCE.getModel_Processes();

    /**
     * The meta object literal for the '<em><b>Outcomes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__OUTCOMES = eINSTANCE.getModel_Outcomes();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.ProcessImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__INSTRUCTIONS = eINSTANCE.getProcess_Instructions();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.InstructionImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.LoadImpl <em>Load</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.LoadImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getLoad()
     * @generated
     */
    EClass LOAD = eINSTANCE.getLoad();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD__REGISTER = eINSTANCE.getLoad_Register();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__ADDRESS = eINSTANCE.getLoad_Address();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.StoreImpl <em>Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.StoreImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getStore()
     * @generated
     */
    EClass STORE = eINSTANCE.getStore();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__VALUE = eINSTANCE.getStore_Value();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__ADDRESS = eINSTANCE.getStore_Address();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.DLoadImpl <em>DLoad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.DLoadImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getDLoad()
     * @generated
     */
    EClass DLOAD = eINSTANCE.getDLoad();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DLOAD__REGISTER = eINSTANCE.getDLoad_Register();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DLOAD__ADDRESS = eINSTANCE.getDLoad_Address();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.DStoreImpl <em>DStore</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.DStoreImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getDStore()
     * @generated
     */
    EClass DSTORE = eINSTANCE.getDStore();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSTORE__VALUE = eINSTANCE.getDStore_Value();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSTORE__ADDRESS = eINSTANCE.getDStore_Address();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.WaitImpl <em>Wait</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.WaitImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getWait()
     * @generated
     */
    EClass WAIT = eINSTANCE.getWait();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WAIT__REGISTER = eINSTANCE.getWait_Register();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAIT__ADDRESS = eINSTANCE.getWait_Address();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAIT__VALUE = eINSTANCE.getWait_Value();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.FenceImpl <em>Fence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.FenceImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getFence()
     * @generated
     */
    EClass FENCE = eINSTANCE.getFence();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.RegisterImpl <em>Register</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.RegisterImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getRegister()
     * @generated
     */
    EClass REGISTER = eINSTANCE.getRegister();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__NAME = eINSTANCE.getRegister_Name();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.OutcomeImpl <em>Outcome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.OutcomeImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getOutcome()
     * @generated
     */
    EClass OUTCOME = eINSTANCE.getOutcome();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.StateImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.RegStateImpl <em>Reg State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.RegStateImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getRegState()
     * @generated
     */
    EClass REG_STATE = eINSTANCE.getRegState();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REG_STATE__REGISTER = eINSTANCE.getRegState_Register();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REG_STATE__VALUE = eINSTANCE.getRegState_Value();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.BinaryImpl <em>Binary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.BinaryImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getBinary()
     * @generated
     */
    EClass BINARY = eINSTANCE.getBinary();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY__LEFT = eINSTANCE.getBinary_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY__OP = eINSTANCE.getBinary_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY__RIGHT = eINSTANCE.getBinary_Right();

    /**
     * The meta object literal for the '{@link ac.soton.awm.aWM.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.awm.aWM.impl.NotImpl
     * @see ac.soton.awm.aWM.impl.AWMPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT__NOT = eINSTANCE.getNot_Not();

  }

} //AWMPackage
