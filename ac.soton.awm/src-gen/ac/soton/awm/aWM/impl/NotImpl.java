/**
 */
package ac.soton.awm.aWM.impl;

import ac.soton.awm.aWM.AWMPackage;
import ac.soton.awm.aWM.Not;
import ac.soton.awm.aWM.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.impl.NotImpl#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotImpl extends StateImpl implements Not
{
  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected State not;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotImpl()
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
    return AWMPackage.Literals.NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNot(State newNot, NotificationChain msgs)
  {
    State oldNot = not;
    not = newNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AWMPackage.NOT__NOT, oldNot, newNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(State newNot)
  {
    if (newNot != not)
    {
      NotificationChain msgs = null;
      if (not != null)
        msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AWMPackage.NOT__NOT, null, msgs);
      if (newNot != null)
        msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AWMPackage.NOT__NOT, null, msgs);
      msgs = basicSetNot(newNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AWMPackage.NOT__NOT, newNot, newNot));
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
      case AWMPackage.NOT__NOT:
        return basicSetNot(null, msgs);
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
      case AWMPackage.NOT__NOT:
        return getNot();
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
      case AWMPackage.NOT__NOT:
        setNot((State)newValue);
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
      case AWMPackage.NOT__NOT:
        setNot((State)null);
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
      case AWMPackage.NOT__NOT:
        return not != null;
    }
    return super.eIsSet(featureID);
  }

} //NotImpl
