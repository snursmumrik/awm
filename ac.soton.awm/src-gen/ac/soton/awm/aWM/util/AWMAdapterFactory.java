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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.awm.aWM.AWMPackage
 * @generated
 */
public class AWMAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AWMPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AWMAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AWMPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AWMSwitch<Adapter> modelSwitch =
    new AWMSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseProcess(ac.soton.awm.aWM.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseLoad(Load object)
      {
        return createLoadAdapter();
      }
      @Override
      public Adapter caseStore(Store object)
      {
        return createStoreAdapter();
      }
      @Override
      public Adapter caseDLoad(DLoad object)
      {
        return createDLoadAdapter();
      }
      @Override
      public Adapter caseDStore(DStore object)
      {
        return createDStoreAdapter();
      }
      @Override
      public Adapter caseWait(Wait object)
      {
        return createWaitAdapter();
      }
      @Override
      public Adapter caseFence(Fence object)
      {
        return createFenceAdapter();
      }
      @Override
      public Adapter caseRegister(Register object)
      {
        return createRegisterAdapter();
      }
      @Override
      public Adapter caseOutcome(Outcome object)
      {
        return createOutcomeAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseRegState(RegState object)
      {
        return createRegStateAdapter();
      }
      @Override
      public Adapter caseBinary(Binary object)
      {
        return createBinaryAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Load <em>Load</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Load
   * @generated
   */
  public Adapter createLoadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Store
   * @generated
   */
  public Adapter createStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.DLoad <em>DLoad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.DLoad
   * @generated
   */
  public Adapter createDLoadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.DStore <em>DStore</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.DStore
   * @generated
   */
  public Adapter createDStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Wait <em>Wait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Wait
   * @generated
   */
  public Adapter createWaitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Fence <em>Fence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Fence
   * @generated
   */
  public Adapter createFenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Register <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Register
   * @generated
   */
  public Adapter createRegisterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Outcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Outcome
   * @generated
   */
  public Adapter createOutcomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.RegState <em>Reg State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.RegState
   * @generated
   */
  public Adapter createRegStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Binary <em>Binary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Binary
   * @generated
   */
  public Adapter createBinaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ac.soton.awm.aWM.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ac.soton.awm.aWM.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AWMAdapterFactory
