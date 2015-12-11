/**
 * generated by Xtext 2.9.0
 */
package ceronsantiago.oneSharpExpressive;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ceronsantiago.oneSharpExpressive.CallParam#getIntVal <em>Int Val</em>}</li>
 *   <li>{@link ceronsantiago.oneSharpExpressive.CallParam#getStringVal <em>String Val</em>}</li>
 *   <li>{@link ceronsantiago.oneSharpExpressive.CallParam#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getCallParam()
 * @model
 * @generated
 */
public interface CallParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Int Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Val</em>' attribute.
   * @see #setIntVal(int)
   * @see ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getCallParam_IntVal()
   * @model
   * @generated
   */
  int getIntVal();

  /**
   * Sets the value of the '{@link ceronsantiago.oneSharpExpressive.CallParam#getIntVal <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Val</em>' attribute.
   * @see #getIntVal()
   * @generated
   */
  void setIntVal(int value);

  /**
   * Returns the value of the '<em><b>String Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Val</em>' attribute.
   * @see #setStringVal(String)
   * @see ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getCallParam_StringVal()
   * @model
   * @generated
   */
  String getStringVal();

  /**
   * Sets the value of the '{@link ceronsantiago.oneSharpExpressive.CallParam#getStringVal <em>String Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Val</em>' attribute.
   * @see #getStringVal()
   * @generated
   */
  void setStringVal(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference.
   * @see #setParam(ParamDec)
   * @see ceronsantiago.oneSharpExpressive.OneSharpExpressivePackage#getCallParam_Param()
   * @model
   * @generated
   */
  ParamDec getParam();

  /**
   * Sets the value of the '{@link ceronsantiago.oneSharpExpressive.CallParam#getParam <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' reference.
   * @see #getParam()
   * @generated
   */
  void setParam(ParamDec value);

} // CallParam