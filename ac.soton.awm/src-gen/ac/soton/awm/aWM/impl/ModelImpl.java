/**
 */
package ac.soton.awm.aWM.impl;

import ac.soton.awm.aWM.AWMPackage;
import ac.soton.awm.aWM.Model;
import ac.soton.awm.aWM.Outcome;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.awm.aWM.impl.ModelImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link ac.soton.awm.aWM.impl.ModelImpl#getOutcomes <em>Outcomes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected EList<ac.soton.awm.aWM.Process> processes;

  /**
   * The cached value of the '{@link #getOutcomes() <em>Outcomes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutcomes()
   * @generated
   * @ordered
   */
  protected EList<Outcome> outcomes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return AWMPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ac.soton.awm.aWM.Process> getProcesses()
  {
    if (processes == null)
    {
      processes = new EObjectContainmentEList<ac.soton.awm.aWM.Process>(ac.soton.awm.aWM.Process.class, this, AWMPackage.MODEL__PROCESSES);
    }
    return processes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Outcome> getOutcomes()
  {
    if (outcomes == null)
    {
      outcomes = new EObjectContainmentEList<Outcome>(Outcome.class, this, AWMPackage.MODEL__OUTCOMES);
    }
    return outcomes;
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
      case AWMPackage.MODEL__PROCESSES:
        return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
      case AWMPackage.MODEL__OUTCOMES:
        return ((InternalEList<?>)getOutcomes()).basicRemove(otherEnd, msgs);
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
      case AWMPackage.MODEL__PROCESSES:
        return getProcesses();
      case AWMPackage.MODEL__OUTCOMES:
        return getOutcomes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AWMPackage.MODEL__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends ac.soton.awm.aWM.Process>)newValue);
        return;
      case AWMPackage.MODEL__OUTCOMES:
        getOutcomes().clear();
        getOutcomes().addAll((Collection<? extends Outcome>)newValue);
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
      case AWMPackage.MODEL__PROCESSES:
        getProcesses().clear();
        return;
      case AWMPackage.MODEL__OUTCOMES:
        getOutcomes().clear();
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
      case AWMPackage.MODEL__PROCESSES:
        return processes != null && !processes.isEmpty();
      case AWMPackage.MODEL__OUTCOMES:
        return outcomes != null && !outcomes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
