/**
 */
package ac.soton.awm.aWM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.awm.aWM.AWMPackage
 * @generated
 */
public interface AWMFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AWMFactory eINSTANCE = ac.soton.awm.aWM.impl.AWMFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load</em>'.
   * @generated
   */
  Load createLoad();

  /**
   * Returns a new object of class '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store</em>'.
   * @generated
   */
  Store createStore();

  /**
   * Returns a new object of class '<em>DLoad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DLoad</em>'.
   * @generated
   */
  DLoad createDLoad();

  /**
   * Returns a new object of class '<em>DStore</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DStore</em>'.
   * @generated
   */
  DStore createDStore();

  /**
   * Returns a new object of class '<em>Wait</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wait</em>'.
   * @generated
   */
  Wait createWait();

  /**
   * Returns a new object of class '<em>Fence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fence</em>'.
   * @generated
   */
  Fence createFence();

  /**
   * Returns a new object of class '<em>Register</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Register</em>'.
   * @generated
   */
  Register createRegister();

  /**
   * Returns a new object of class '<em>Outcome</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Outcome</em>'.
   * @generated
   */
  Outcome createOutcome();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Reg State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reg State</em>'.
   * @generated
   */
  RegState createRegState();

  /**
   * Returns a new object of class '<em>Binary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary</em>'.
   * @generated
   */
  Binary createBinary();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AWMPackage getAWMPackage();

} //AWMFactory
