/**
 */
package ac.soton.awm.aWM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.Not#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.awm.aWM.AWMPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends State
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' containment reference.
   * @see #setNot(State)
   * @see ac.soton.awm.aWM.AWMPackage#getNot_Not()
   * @model containment="true"
   * @generated
   */
  State getNot();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.Not#getNot <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' containment reference.
   * @see #getNot()
   * @generated
   */
  void setNot(State value);

} // Not
