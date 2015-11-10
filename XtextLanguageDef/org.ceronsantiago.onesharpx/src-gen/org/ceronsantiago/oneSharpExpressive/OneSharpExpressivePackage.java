/**
 */
package org.ceronsantiago.oneSharpExpressive;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ceronsantiago.oneSharpExpressive.OneSharpExpressiveFactory
 * @model kind="package"
 * @generated
 */
public interface OneSharpExpressivePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "oneSharpExpressive";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ceronsantiago.org/OneSharpExpressive";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "oneSharpExpressive";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OneSharpExpressivePackage eINSTANCE = org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl.init();

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.ProgramImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__FUNCTIONS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.WriteImpl <em>Write</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.WriteImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getWrite()
   * @generated
   */
  int WRITE = 1;

  /**
   * The feature id for the '<em><b>Register</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE__REGISTER = 0;

  /**
   * The feature id for the '<em><b>Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE__WORD = 1;

  /**
   * The number of structural features of the '<em>Write</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.NormalCaseImpl <em>Normal Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.NormalCaseImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getNormalCase()
   * @generated
   */
  int NORMAL_CASE = 2;

  /**
   * The feature id for the '<em><b>Register</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CASE__REGISTER = 0;

  /**
   * The feature id for the '<em><b>Case One</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CASE__CASE_ONE = 1;

  /**
   * The feature id for the '<em><b>Case Sharp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CASE__CASE_SHARP = 2;

  /**
   * The feature id for the '<em><b>Case Empty</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CASE__CASE_EMPTY = 3;

  /**
   * The number of structural features of the '<em>Normal Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CASE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.LoopCaseImpl <em>Loop Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.LoopCaseImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getLoopCase()
   * @generated
   */
  int LOOP_CASE = 3;

  /**
   * The feature id for the '<em><b>Register</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_CASE__REGISTER = 0;

  /**
   * The feature id for the '<em><b>Case One</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_CASE__CASE_ONE = 1;

  /**
   * The feature id for the '<em><b>Case Sharp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_CASE__CASE_SHARP = 2;

  /**
   * The number of structural features of the '<em>Loop Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_CASE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.GotoImpl <em>Goto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.GotoImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getGoto()
   * @generated
   */
  int GOTO = 4;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO__LABEL = 0;

  /**
   * The number of structural features of the '<em>Goto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.CallImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getCall()
   * @generated
   */
  int CALL = 5;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__FUNCTION = 0;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.CommandImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 6;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__LABEL = 0;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__COMMAND = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.FunctionHeaderImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getFunctionHeader()
   * @generated
   */
  int FUNCTION_HEADER = 7;

  /**
   * The feature id for the '<em><b>Func Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__FUNC_NAME = 0;

  /**
   * The number of structural features of the '<em>Function Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ceronsantiago.oneSharpExpressive.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ceronsantiago.oneSharpExpressive.impl.FunctionDeclarationImpl
   * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Func Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__FUNC_HEADER = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__COMMANDS = 1;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.ceronsantiago.oneSharpExpressive.Program#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Program#getFunctions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Functions();

  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.Write <em>Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Write
   * @generated
   */
  EClass getWrite();

  /**
   * Returns the meta object for the attribute '{@link org.ceronsantiago.oneSharpExpressive.Write#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Register</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Write#getRegister()
   * @see #getWrite()
   * @generated
   */
  EAttribute getWrite_Register();

  /**
   * Returns the meta object for the attribute '{@link org.ceronsantiago.oneSharpExpressive.Write#getWord <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Word</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Write#getWord()
   * @see #getWrite()
   * @generated
   */
  EAttribute getWrite_Word();

  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.NormalCase <em>Normal Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Case</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.NormalCase
   * @generated
   */
  EClass getNormalCase();

  /**
   * Returns the meta object for the attribute '{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Register</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.NormalCase#getRegister()
   * @see #getNormalCase()
   * @generated
   */
  EAttribute getNormalCase_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseOne <em>Case One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case One</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseOne()
   * @see #getNormalCase()
   * @generated
   */
  EReference getNormalCase_CaseOne();

  /**
   * Returns the meta object for the containment reference list '{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseSharp <em>Case Sharp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Sharp</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseSharp()
   * @see #getNormalCase()
   * @generated
   */
  EReference getNormalCase_CaseSharp();

  /**
   * Returns the meta object for the containment reference list '{@link org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseEmpty <em>Case Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Empty</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.NormalCase#getCaseEmpty()
   * @see #getNormalCase()
   * @generated
   */
  EReference getNormalCase_CaseEmpty();

  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.LoopCase <em>Loop Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Case</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.LoopCase
   * @generated
   */
  EClass getLoopCase();

  /**
   * Returns the meta object for the attribute '{@link org.ceronsantiago.oneSharpExpressive.LoopCase#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Register</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.LoopCase#getRegister()
   * @see #getLoopCase()
   * @generated
   */
  EAttribute getLoopCase_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.ceronsantiago.oneSharpExpressive.LoopCase#getCaseOne <em>Case One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case One</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.LoopCase#getCaseOne()
   * @see #getLoopCase()
   * @generated
   */
  EReference getLoopCase_CaseOne();

  /**
   * Returns the meta object for the containment reference list '{@link org.ceronsantiago.oneSharpExpressive.LoopCase#getCaseSharp <em>Case Sharp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Sharp</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.LoopCase#getCaseSharp()
   * @see #getLoopCase()
   * @generated
   */
  EReference getLoopCase_CaseSharp();

  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.Goto <em>Goto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Goto
   * @generated
   */
  EClass getGoto();

  /**
   * Returns the meta object for the attribute '{@link org.ceronsantiago.oneSharpExpressive.Goto#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Goto#getLabel()
   * @see #getGoto()
   * @generated
   */
  EAttribute getGoto_Label();

  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the attribute '{@link org.ceronsantiago.oneSharpExpressive.Call#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Call#getFunction()
   * @see #getCall()
   * @generated
   */
  EAttribute getCall_Function();

  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link org.ceronsantiago.oneSharpExpressive.Command#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Command#getLabel()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.ceronsantiago.oneSharpExpressive.Command#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.Command#getCommand()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Command();

  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.FunctionHeader <em>Function Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Header</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.FunctionHeader
   * @generated
   */
  EClass getFunctionHeader();

  /**
   * Returns the meta object for the attribute '{@link org.ceronsantiago.oneSharpExpressive.FunctionHeader#getFuncName <em>Func Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Func Name</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.FunctionHeader#getFuncName()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_FuncName();

  /**
   * Returns the meta object for class '{@link org.ceronsantiago.oneSharpExpressive.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.ceronsantiago.oneSharpExpressive.FunctionDeclaration#getFuncHeader <em>Func Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func Header</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.FunctionDeclaration#getFuncHeader()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_FuncHeader();

  /**
   * Returns the meta object for the containment reference list '{@link org.ceronsantiago.oneSharpExpressive.FunctionDeclaration#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.ceronsantiago.oneSharpExpressive.FunctionDeclaration#getCommands()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Commands();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OneSharpExpressiveFactory getOneSharpExpressiveFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.ProgramImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__FUNCTIONS = eINSTANCE.getProgram_Functions();

    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.WriteImpl <em>Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.WriteImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getWrite()
     * @generated
     */
    EClass WRITE = eINSTANCE.getWrite();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRITE__REGISTER = eINSTANCE.getWrite_Register();

    /**
     * The meta object literal for the '<em><b>Word</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRITE__WORD = eINSTANCE.getWrite_Word();

    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.NormalCaseImpl <em>Normal Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.NormalCaseImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getNormalCase()
     * @generated
     */
    EClass NORMAL_CASE = eINSTANCE.getNormalCase();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NORMAL_CASE__REGISTER = eINSTANCE.getNormalCase_Register();

    /**
     * The meta object literal for the '<em><b>Case One</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_CASE__CASE_ONE = eINSTANCE.getNormalCase_CaseOne();

    /**
     * The meta object literal for the '<em><b>Case Sharp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_CASE__CASE_SHARP = eINSTANCE.getNormalCase_CaseSharp();

    /**
     * The meta object literal for the '<em><b>Case Empty</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_CASE__CASE_EMPTY = eINSTANCE.getNormalCase_CaseEmpty();

    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.LoopCaseImpl <em>Loop Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.LoopCaseImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getLoopCase()
     * @generated
     */
    EClass LOOP_CASE = eINSTANCE.getLoopCase();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP_CASE__REGISTER = eINSTANCE.getLoopCase_Register();

    /**
     * The meta object literal for the '<em><b>Case One</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_CASE__CASE_ONE = eINSTANCE.getLoopCase_CaseOne();

    /**
     * The meta object literal for the '<em><b>Case Sharp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_CASE__CASE_SHARP = eINSTANCE.getLoopCase_CaseSharp();

    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.GotoImpl <em>Goto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.GotoImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getGoto()
     * @generated
     */
    EClass GOTO = eINSTANCE.getGoto();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOTO__LABEL = eINSTANCE.getGoto_Label();

    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.CallImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL__FUNCTION = eINSTANCE.getCall_Function();

    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.CommandImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__LABEL = eINSTANCE.getCommand_Label();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__COMMAND = eINSTANCE.getCommand_Command();

    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.FunctionHeaderImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getFunctionHeader()
     * @generated
     */
    EClass FUNCTION_HEADER = eINSTANCE.getFunctionHeader();

    /**
     * The meta object literal for the '<em><b>Func Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADER__FUNC_NAME = eINSTANCE.getFunctionHeader_FuncName();

    /**
     * The meta object literal for the '{@link org.ceronsantiago.oneSharpExpressive.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ceronsantiago.oneSharpExpressive.impl.FunctionDeclarationImpl
     * @see org.ceronsantiago.oneSharpExpressive.impl.OneSharpExpressivePackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Func Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__FUNC_HEADER = eINSTANCE.getFunctionDeclaration_FuncHeader();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__COMMANDS = eINSTANCE.getFunctionDeclaration_Commands();

  }

} //OneSharpExpressivePackage
