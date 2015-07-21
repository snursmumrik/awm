/**
 */
package ac.soton.awm.aWM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.Binary#getLeft <em>Left</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.Binary#getOp <em>Op</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.Binary#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.awm.aWM.AWMPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends State
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(State)
   * @see ac.soton.awm.aWM.AWMPackage#getBinary_Left()
   * @model containment="true"
   * @generated
   */
  State getLeft();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.Binary#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(State value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see ac.soton.awm.aWM.AWMPackage#getBinary_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.Binary#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(State)
   * @see ac.soton.awm.aWM.AWMPackage#getBinary_Right()
   * @model containment="true"
   * @generated
   */
  State getRight();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.Binary#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(State value);

} // Binary
