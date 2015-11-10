/**
 */
package org.ceronsantiago.oneSharpExpressive;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.FunctionDeclaration#getFuncHeader <em>Func Header</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.FunctionDeclaration#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Func Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func Header</em>' containment reference.
   * @see #setFuncHeader(FunctionHeader)
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getFunctionDeclaration_FuncHeader()
   * @model containment="true"
   * @generated
   */
  FunctionHeader getFuncHeader();

  /**
   * Sets the value of the '{@link org.ceronsantiago.oneSharpExpressive.FunctionDeclaration#getFuncHeader <em>Func Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func Header</em>' containment reference.
   * @see #getFuncHeader()
   * @generated
   */
  void setFuncHeader(FunctionHeader value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.ceronsantiago.oneSharpExpressive.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getFunctionDeclaration_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // FunctionDeclaration
