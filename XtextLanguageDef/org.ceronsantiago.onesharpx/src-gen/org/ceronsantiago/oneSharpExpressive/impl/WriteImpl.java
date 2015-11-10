/**
 */
package org.ceronsantiago.oneSharpExpressive.impl;

import org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage;
import org.ceronsantiago.oneSharpExpressive.Write;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.impl.WriteImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.impl.WriteImpl#getWord <em>Word</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WriteImpl extends MinimalEObjectImpl.Container implements Write
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
   * The default value of the '{@link #getWord() <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWord()
   * @generated
   * @ordered
   */
  protected static final String WORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWord() <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWord()
   * @generated
   * @ordered
   */
  protected String word = WORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WriteImpl()
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
    return OneSharpExpressivePackage.Literals.WRITE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OneSharpExpressivePackage.WRITE__REGISTER, oldRegister, register));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWord()
  {
    return word;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWord(String newWord)
  {
    String oldWord = word;
    word = newWord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OneSharpExpressivePackage.WRITE__WORD, oldWord, word));
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
      case OneSharpExpressivePackage.WRITE__REGISTER:
        return getRegister();
      case OneSharpExpressivePackage.WRITE__WORD:
        return getWord();
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
      case OneSharpExpressivePackage.WRITE__REGISTER:
        setRegister((String)newValue);
        return;
      case OneSharpExpressivePackage.WRITE__WORD:
        setWord((String)newValue);
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
      case OneSharpExpressivePackage.WRITE__REGISTER:
        setRegister(REGISTER_EDEFAULT);
        return;
      case OneSharpExpressivePackage.WRITE__WORD:
        setWord(WORD_EDEFAULT);
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
      case OneSharpExpressivePackage.WRITE__REGISTER:
        return REGISTER_EDEFAULT == null ? register != null : !REGISTER_EDEFAULT.equals(register);
      case OneSharpExpressivePackage.WRITE__WORD:
        return WORD_EDEFAULT == null ? word != null : !WORD_EDEFAULT.equals(word);
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
    result.append(", word: ");
    result.append(word);
    result.append(')');
    return result.toString();
  }

} //WriteImpl
