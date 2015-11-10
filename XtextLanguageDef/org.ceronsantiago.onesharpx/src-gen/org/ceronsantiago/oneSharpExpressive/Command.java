/**
 */
package org.ceronsantiago.oneSharpExpressive;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.Command#getLabel <em>Label</em>}</li>
 *   <li>{@link org.ceronsantiago.oneSharpExpressive.Command#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getCommand_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.ceronsantiago.oneSharpExpressive.Command#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(EObject)
   * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getCommand_Command()
   * @model containment="true"
   * @generated
   */
  EObject getCommand();

  /**
   * Sets the value of the '{@link org.ceronsantiago.oneSharpExpressive.Command#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(EObject value);

} // Command
