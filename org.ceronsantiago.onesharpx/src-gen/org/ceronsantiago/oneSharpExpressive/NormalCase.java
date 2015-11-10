/**
 */
package org.ceronsantiago.oneSharpExpressive;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getRegister <em>Register</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseOne <em>Case One</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseSharp <em>Case Sharp</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseEmpty <em>Case Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getNormalCase()
 * @model
 * @generated
 */
public interface NormalCase extends EObject
{
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
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getNormalCase_Register()
   * @model
   * @generated
   */
  String getRegister();

  /**
   * Sets the value of the '{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getRegister <em>Register</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Register</em>' attribute.
   * @see #getRegister()
   * @generated
   */
  void setRegister(String value);

  /**
   * Returns the value of the '<em><b>Case One</b></em>' containment reference list.
   * The list contents are of type {@link org.ceronsantiago.oneSharpExpressive.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case One</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case One</em>' containment reference list.
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getNormalCase_CaseOne()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCaseOne();

  /**
   * Returns the value of the '<em><b>Case Sharp</b></em>' containment reference list.
   * The list contents are of type {@link org.ceronsantiago.oneSharpExpressive.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Sharp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Sharp</em>' containment reference list.
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getNormalCase_CaseSharp()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCaseSharp();

  /**
   * Returns the value of the '<em><b>Case Empty</b></em>' containment reference list.
   * The list contents are of type {@link org.ceronsantiago.oneSharpExpressive.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Empty</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Empty</em>' containment reference list.
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getNormalCase_CaseEmpty()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCaseEmpty();

} // NormalCase
