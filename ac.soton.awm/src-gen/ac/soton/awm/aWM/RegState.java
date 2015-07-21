/**
 */
package ac.soton.awm.aWM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reg State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.RegState#getRegister <em>Register</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.RegState#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.awm.aWM.AWMPackage#getRegState()
 * @model
 * @generated
 */
public interface RegState extends State
{
  /**
   * Returns the value of the '<em><b>Register</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Register</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Register</em>' reference.
   * @see #setRegister(Register)
   * @see ac.soton.awm.aWM.AWMPackage#getRegState_Register()
   * @model
   * @generated
   */
  Register getRegister();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.RegState#getRegister <em>Register</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Register</em>' reference.
   * @see #getRegister()
   * @generated
   */
  void setRegister(Register value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see ac.soton.awm.aWM.AWMPackage#getRegState_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.RegState#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // RegState
