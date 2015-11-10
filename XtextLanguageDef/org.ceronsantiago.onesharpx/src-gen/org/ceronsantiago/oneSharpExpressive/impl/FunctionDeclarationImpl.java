/**
 */
package org.ceronsantiago.oneSharpExpressive.impl;

import java.util.Collection;

import org.ceronsantiago.oneSharpExpressive.Command;
import org.ceronsantiago.oneSharpExpressive.FunctionDeclaration;
import org.ceronsantiago.oneSharpExpressive.FunctionHeader;
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
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.impl.FunctionDeclarationImpl#getFuncHeader <em>Func Header</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.impl.FunctionDeclarationImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends MinimalEObjectImpl.Container implements FunctionDeclaration
{
  /**
   * The cached value of the '{@link #getFuncHeader() <em>Func Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncHeader()
   * @generated
   * @ordered
   */
  protected FunctionHeader funcHeader;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDeclarationImpl()
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
    return OneSharpExpressivePackage.Literals.FUNCTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionHeader getFuncHeader()
  {
    return funcHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuncHeader(FunctionHeader newFuncHeader, NotificationChain msgs)
  {
    FunctionHeader oldFuncHeader = funcHeader;
    funcHeader = newFuncHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER, oldFuncHeader, newFuncHeader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuncHeader(FunctionHeader newFuncHeader)
  {
    if (newFuncHeader != funcHeader)
    {
      NotificationChain msgs = null;
      if (funcHeader != null)
        msgs = ((InternalEObject)funcHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER, null, msgs);
      if (newFuncHeader != null)
        msgs = ((InternalEObject)newFuncHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER, null, msgs);
      msgs = basicSetFuncHeader(newFuncHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER, newFuncHeader, newFuncHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, OneSharpExpressivePackage.FUNCTION_DECLARATION__COMMANDS);
    }
    return commands;
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
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER:
        return basicSetFuncHeader(null, msgs);
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER:
        return getFuncHeader();
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__COMMANDS:
        return getCommands();
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
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER:
        setFuncHeader((FunctionHeader)newValue);
        return;
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
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
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER:
        setFuncHeader((FunctionHeader)null);
        return;
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__COMMANDS:
        getCommands().clear();
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
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__FUNC_HEADER:
        return funcHeader != null;
      case OneSharpExpressivePackage.FUNCTION_DECLARATION__COMMANDS:
        return commands != null && !commands.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionDeclarationImpl
