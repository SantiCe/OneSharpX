/**
 */
package org.ceronsantiago.oneSharpExpressive.impl;

import org.ceronsantiago.oneSharpExpressive.FunctionHeader;
import org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.impl.FunctionHeaderImpl#getFuncName <em>Func Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionHeaderImpl extends MinimalEObjectImpl.Container implements FunctionHeader
{
  /**
   * The default value of the '{@link #getFuncName() <em>Func Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncName()
   * @generated
   * @ordered
   */
  protected static final String FUNC_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFuncName() <em>Func Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncName()
   * @generated
   * @ordered
   */
  protected String funcName = FUNC_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionHeaderImpl()
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
    return OneSharpExpressivePackage.Literals.FUNCTION_HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFuncName()
  {
    return funcName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuncName(String newFuncName)
  {
    String oldFuncName = funcName;
    funcName = newFuncName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OneSharpExpressivePackage.FUNCTION_HEADER__FUNC_NAME, oldFuncName, funcName));
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
      case OneSharpExpressivePackage.FUNCTION_HEADER__FUNC_NAME:
        return getFuncName();
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
      case OneSharpExpressivePackage.FUNCTION_HEADER__FUNC_NAME:
        setFuncName((String)newValue);
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
      case OneSharpExpressivePackage.FUNCTION_HEADER__FUNC_NAME:
        setFuncName(FUNC_NAME_EDEFAULT);
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
      case OneSharpExpressivePackage.FUNCTION_HEADER__FUNC_NAME:
        return FUNC_NAME_EDEFAULT == null ? funcName != null : !FUNC_NAME_EDEFAULT.equals(funcName);
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
    result.append(" (funcName: ");
    result.append(funcName);
    result.append(')');
    return result.toString();
  }

} //FunctionHeaderImpl
