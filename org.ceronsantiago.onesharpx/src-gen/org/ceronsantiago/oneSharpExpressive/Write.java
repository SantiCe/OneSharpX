/**
 */
package org.ceronsantiago.oneSharpExpressive;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.Write#getWord <em>Word</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.Write#getRegister <em>Register</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getWrite()
 * @model
 * @generated
 */
public interface Write extends EObject
{
  /**
   * Returns the value of the '<em><b>Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Word</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Word</em>' attribute.
   * @see #setWord(String)
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getWrite_Word()
   * @model
   * @generated
   */
  String getWord();

  /**
   * Sets the value of the '{@link org.ceronsantiago.oneSharpExpressive.Write#getWord <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Word</em>' attribute.
   * @see #getWord()
   * @generated
   */
  void setWord(String value);

  /**
   * Returns the value of the '<em><b>Register</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Register</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Register</em>' attribute.
   * @see #setRegister(String)
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getWrite_Register()
   * @model
   * @generated
   */
  String getRegister();

  /**
   * Sets the value of the '{@link org.ceronsantiago.oneSharpExpressive.Write#getRegister <em>Register</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Register</em>' attribute.
   * @see #getRegister()
   * @generated
   */
  void setRegister(String value);

} // Write
