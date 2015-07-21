/**
 */
package ac.soton.awm.aWM.impl;

import ac.soton.awm.aWM.AWMFactory;
import ac.soton.awm.aWM.AWMPackage;
import ac.soton.awm.aWM.Binary;
import ac.soton.awm.aWM.DLoad;
import ac.soton.awm.aWM.DStore;
import ac.soton.awm.aWM.Fence;
import ac.soton.awm.aWM.Instruction;
import ac.soton.awm.aWM.Load;
import ac.soton.awm.aWM.Model;
import ac.soton.awm.aWM.Not;
import ac.soton.awm.aWM.Outcome;
import ac.soton.awm.aWM.RegState;
import ac.soton.awm.aWM.Register;
import ac.soton.awm.aWM.State;
import ac.soton.awm.aWM.Store;
import ac.soton.awm.aWM.Wait;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AWMFactoryImpl extends EFactoryImpl implements AWMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AWMFactory init()
  {
    try
    {
      AWMFactory theAWMFactory = (AWMFactory)EPackage.Registry.INSTANCE.getEFactory(AWMPackage.eNS_URI);
      if (theAWMFactory != null)
      {
        return theAWMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AWMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AWMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AWMPackage.MODEL: return createModel();
      case AWMPackage.PROCESS: return createProcess();
      case AWMPackage.INSTRUCTION: return createInstruction();
      case AWMPackage.LOAD: return createLoad();
      case AWMPackage.STORE: return createStore();
      case AWMPackage.DLOAD: return createDLoad();
      case AWMPackage.DSTORE: return createDStore();
      case AWMPackage.WAIT: return createWait();
      case AWMPackage.FENCE: return createFence();
      case AWMPackage.REGISTER: return createRegister();
      case AWMPackage.OUTCOME: return createOutcome();
      case AWMPackage.STATE: return createState();
      case AWMPackage.REG_STATE: return createRegState();
      case AWMPackage.BINARY: return createBinary();
      case AWMPackage.NOT: return createNot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ac.soton.awm.aWM.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Load createLoad()
  {
    LoadImpl load = new LoadImpl();
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DLoad createDLoad()
  {
    DLoadImpl dLoad = new DLoadImpl();
    return dLoad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DStore createDStore()
  {
    DStoreImpl dStore = new DStoreImpl();
    return dStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wait createWait()
  {
    WaitImpl wait = new WaitImpl();
    return wait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fence createFence()
  {
    FenceImpl fence = new FenceImpl();
    return fence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Register createRegister()
  {
    RegisterImpl register = new RegisterImpl();
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Outcome createOutcome()
  {
    OutcomeImpl outcome = new OutcomeImpl();
    return outcome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegState createRegState()
  {
    RegStateImpl regState = new RegStateImpl();
    return regState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binary createBinary()
  {
    BinaryImpl binary = new BinaryImpl();
    return binary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AWMPackage getAWMPackage()
  {
    return (AWMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AWMPackage getPackage()
  {
    return AWMPackage.eINSTANCE;
  }

} //AWMFactoryImpl
