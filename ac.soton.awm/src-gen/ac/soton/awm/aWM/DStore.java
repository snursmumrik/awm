/**
 */
package ac.soton.awm.aWM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DStore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.DStore#getValue <em>Value</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.DStore#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.awm.aWM.AWMPackage#getDStore()
 * @model
 * @generated
 */
public interface DStore extends Instruction
{
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
   * @see ac.soton.awm.aWM.AWMPackage#getDStore_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.DStore#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

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
   * @see ac.soton.awm.aWM.AWMPackage#getDStore_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link ac.soton.awm.aWM.DStore#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

} // DStore
