/**
 */
package ac.soton.awm.aWM.util;

import ac.soton.awm.aWM.AWMPackage;
import ac.soton.awm.aWM.Binary;
import ac.soton.awm.aWM.DLoad;
import ac.soton.awm.aWM.DStore;
import ac.soton.awm.aWM.Fence;
import ac.soton.awm.aWM.Instruction;
import ac.soton.awm.aWM.Load;
import ac.soton.awm.aWM.Model;
import ac.soton.awm.aWM.Not;
import ac.soton.awm.aWM.Outcome;
import ac.soton.awm.aWM.RegState;
import ac.soton.awm.aWM.Register;
import ac.soton.awm.aWM.State;
import ac.soton.awm.aWM.Store;
import ac.soton.awm.aWM.Wait;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ac.soton.awm.aWM.AWMPackage
 * @generated
 */
public class AWMSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AWMPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AWMSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AWMPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AWMPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.PROCESS:
      {
        ac.soton.awm.aWM.Process process = (ac.soton.awm.aWM.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.LOAD:
      {
        Load load = (Load)theEObject;
        T result = caseLoad(load);
        if (result == null) result = caseInstruction(load);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = caseInstruction(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.DLOAD:
      {
        DLoad dLoad = (DLoad)theEObject;
        T result = caseDLoad(dLoad);
        if (result == null) result = caseInstruction(dLoad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.DSTORE:
      {
        DStore dStore = (DStore)theEObject;
        T result = caseDStore(dStore);
        if (result == null) result = caseInstruction(dStore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.WAIT:
      {
        Wait wait = (Wait)theEObject;
        T result = caseWait(wait);
        if (result == null) result = caseInstruction(wait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.FENCE:
      {
        Fence fence = (Fence)theEObject;
        T result = caseFence(fence);
        if (result == null) result = caseInstruction(fence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.REGISTER:
      {
        Register register = (Register)theEObject;
        T result = caseRegister(register);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.OUTCOME:
      {
        Outcome outcome = (Outcome)theEObject;
        T result = caseOutcome(outcome);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = caseOutcome(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.REG_STATE:
      {
        RegState regState = (RegState)theEObject;
        T result = caseRegState(regState);
        if (result == null) result = caseState(regState);
        if (result == null) result = caseOutcome(regState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.BINARY:
      {
        Binary binary = (Binary)theEObject;
        T result = caseBinary(binary);
        if (result == null) result = caseState(binary);
        if (result == null) result = caseOutcome(binary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AWMPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseState(not);
        if (result == null) result = caseOutcome(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(ac.soton.awm.aWM.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoad(Load object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStore(Store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DLoad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DLoad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDLoad(DLoad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DStore</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DStore</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDStore(DStore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWait(Wait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFence(Fence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Register</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegister(Register object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outcome</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outcome</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutcome(Outcome object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reg State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reg State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegState(RegState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinary(Binary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AWMSwitch
