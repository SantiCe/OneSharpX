/**
 */
package org.ceronsantiago.oneSharpExpressive;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.FunctionHeader#getFuncName <em>Func Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getFunctionHeader()
 * @model
 * @generated
 */
public interface FunctionHeader extends EObject
{
  /**
   * Returns the value of the '<em><b>Func Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func Name</em>' attribute.
   * @see #setFuncName(String)
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getFunctionHeader_FuncName()
   * @model
   * @generated
   */
  String getFuncName();

  /**
   * Sets the value of the '{@link org.ceronsantiago.oneSharpExpressive.FunctionHeader#getFuncName <em>Func Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func Name</em>' attribute.
   * @see #getFuncName()
   * @generated
   */
  void setFuncName(String value);

} // FunctionHeader
