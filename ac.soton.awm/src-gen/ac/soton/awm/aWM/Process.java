/**
 */
package ac.soton.awm.aWM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.Process#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.Process#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.awm.aWM.AWMPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ac.soton.awm.aWM.AWMPackage#getProcess_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.Process#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link ac.soton.awm.aWM.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see ac.soton.awm.aWM.AWMPackage#getProcess_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // Process
