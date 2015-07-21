/**
 */
package ac.soton.awm.aWM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.Load#getRegister <em>Register</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.Load#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.awm.aWM.AWMPackage#getLoad()
 * @model
 * @generated
 */
public interface Load extends Instruction
{
  /**
   * Returns the value of the '<em><b>Register</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Register</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Register</em>' containment reference.
   * @see #setRegister(Register)
   * @see ac.soton.awm.aWM.AWMPackage#getLoad_Register()
   * @model containment="true"
   * @generated
   */
  Register getRegister();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.Load#getRegister <em>Register</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Register</em>' containment reference.
   * @see #getRegister()
   * @generated
   */
  void setRegister(Register value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see ac.soton.awm.aWM.AWMPackage#getLoad_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.Load#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

} // Load
