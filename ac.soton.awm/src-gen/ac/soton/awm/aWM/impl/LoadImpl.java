/**
 */
package ac.soton.awm.aWM.impl;

import ac.soton.awm.aWM.AWMPackage;
import ac.soton.awm.aWM.Load;
import ac.soton.awm.aWM.Register;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.impl.LoadImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.impl.LoadImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadImpl extends InstructionImpl implements Load
{
  /**
   * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected Register register;

  /**
   * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected String address = ADDRESS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AWMPackage.Literals.LOAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Register getRegister()
  {
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegister(Register newRegister, NotificationChain msgs)
  {
    Register oldRegister = register;
    register = newRegister;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AWMPackage.LOAD__REGISTER, oldRegister, newRegister);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegister(Register newRegister)
  {
    if (newRegister != register)
    {
      NotificationChain msgs = null;
      if (register != null)
        msgs = ((InternalEObject)register).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AWMPackage.LOAD__REGISTER, null, msgs);
      if (newRegister != null)
        msgs = ((InternalEObject)newRegister).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AWMPackage.LOAD__REGISTER, null, msgs);
      msgs = basicSetRegister(newRegister, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AWMPackage.LOAD__REGISTER, newRegister, newRegister));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddress(String newAddress)
  {
    String oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AWMPackage.LOAD__ADDRESS, oldAddress, address));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AWMPackage.LOAD__REGISTER:
        return basicSetRegister(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AWMPackage.LOAD__REGISTER:
        return getRegister();
      case AWMPackage.LOAD__ADDRESS:
        return getAddress();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AWMPackage.LOAD__REGISTER:
        setRegister((Register)newValue);
        return;
      case AWMPackage.LOAD__ADDRESS:
        setAddress((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AWMPackage.LOAD__REGISTER:
        setRegister((Register)null);
        return;
      case AWMPackage.LOAD__ADDRESS:
        setAddress(ADDRESS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AWMPackage.LOAD__REGISTER:
        return register != null;
      case AWMPackage.LOAD__ADDRESS:
        return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (address: ");
    result.append(address);
    result.append(')');
    return result.toString();
  }

} //LoadImpl
