/**
 */
package org.ceronsantiago.oneSharpExpressive.impl;

import java.util.Collection;

import org.ceronsantiago.oneSharpExpressive.Command;
import org.ceronsantiago.oneSharpExpressive.LoopCase;
import org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.impl.LoopCaseImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.impl.LoopCaseImpl#getCaseOne <em>Case One</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.impl.LoopCaseImpl#getCaseSharp <em>Case Sharp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopCaseImpl extends MinimalEObjectImpl.Container implements LoopCase
{
  /**
   * The default value of the '{@link #getRegister() <em>Register</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected static final String REGISTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRegister() <em>Register</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected String register = REGISTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getCaseOne() <em>Case One</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseOne()
   * @generated
   * @ordered
   */
  protected EList<Command> caseOne;

  /**
   * The cached value of the '{@link #getCaseSharp() <em>Case Sharp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseSharp()
   * @generated
   * @ordered
   */
  protected EList<Command> caseSharp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopCaseImpl()
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
    return OneSharpExpressivePackage.Literals.LOOP_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegister()
  {
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegister(String newRegister)
  {
    String oldRegister = register;
    register = newRegister;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OneSharpExpressivePackage.LOOP_CASE__REGISTER, oldRegister, register));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCaseOne()
  {
    if (caseOne == null)
    {
      caseOne = new EObjectContainmentEList<Command>(Command.class, this, OneSharpExpressivePackage.LOOP_CASE__CASE_ONE);
    }
    return caseOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCaseSharp()
  {
    if (caseSharp == null)
    {
      caseSharp = new EObjectContainmentEList<Command>(Command.class, this, OneSharpExpressivePackage.LOOP_CASE__CASE_SHARP);
    }
    return caseSharp;
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
      case OneSharpExpressivePackage.LOOP_CASE__CASE_ONE:
        return ((InternalEList<?>)getCaseOne()).basicRemove(otherEnd, msgs);
      case OneSharpExpressivePackage.LOOP_CASE__CASE_SHARP:
        return ((InternalEList<?>)getCaseSharp()).basicRemove(otherEnd, msgs);
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
      case OneSharpExpressivePackage.LOOP_CASE__REGISTER:
        return getRegister();
      case OneSharpExpressivePackage.LOOP_CASE__CASE_ONE:
        return getCaseOne();
      case OneSharpExpressivePackage.LOOP_CASE__CASE_SHARP:
        return getCaseSharp();
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
      case OneSharpExpressivePackage.LOOP_CASE__REGISTER:
        setRegister((String)newValue);
        return;
      case OneSharpExpressivePackage.LOOP_CASE__CASE_ONE:
        getCaseOne().clear();
        getCaseOne().addAll((Collection<? extends Command>)newValue);
        return;
      case OneSharpExpressivePackage.LOOP_CASE__CASE_SHARP:
        getCaseSharp().clear();
        getCaseSharp().addAll((Collection<? extends Command>)newValue);
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
      case OneSharpExpressivePackage.LOOP_CASE__REGISTER:
        setRegister(REGISTER_EDEFAULT);
        return;
      case OneSharpExpressivePackage.LOOP_CASE__CASE_ONE:
        getCaseOne().clear();
        return;
      case OneSharpExpressivePackage.LOOP_CASE__CASE_SHARP:
        getCaseSharp().clear();
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
      case OneSharpExpressivePackage.LOOP_CASE__REGISTER:
        return REGISTER_EDEFAULT == null ? register != null : !REGISTER_EDEFAULT.equals(register);
      case OneSharpExpressivePackage.LOOP_CASE__CASE_ONE:
        return caseOne != null && !caseOne.isEmpty();
      case OneSharpExpressivePackage.LOOP_CASE__CASE_SHARP:
        return caseSharp != null && !caseSharp.isEmpty();
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
    result.append(" (register: ");
    result.append(register);
    result.append(')');
    return result.toString();
  }

} //LoopCaseImpl
