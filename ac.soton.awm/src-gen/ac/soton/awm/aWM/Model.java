/**
 */
package ac.soton.awm.aWM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.Model#getProcesses <em>Processes</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.Model#getOutcomes <em>Outcomes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.awm.aWM.AWMPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link ac.soton.awm.aWM.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see ac.soton.awm.aWM.AWMPackage#getModel_Processes()
   * @model containment="true"
   * @generated
   */
  EList<ac.soton.awm.aWM.Process> getProcesses();

  /**
   * Returns the value of the '<em><b>Outcomes</b></em>' containment reference list.
   * The list contents are of type {@link ac.soton.awm.aWM.Outcome}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outcomes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outcomes</em>' containment reference list.
   * @see ac.soton.awm.aWM.AWMPackage#getModel_Outcomes()
   * @model containment="true"
   * @generated
   */
  EList<Outcome> getOutcomes();

} // Model
