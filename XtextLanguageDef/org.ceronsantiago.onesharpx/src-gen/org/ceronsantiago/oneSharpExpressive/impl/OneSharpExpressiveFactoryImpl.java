/**
 */
package org.ceronsantiago.oneSharpExpressive.impl;

import org.ceronsantiago.oneSharpExpressive.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OneSharpExpressiveFactoryImpl extends EFactoryImpl implements OneSharpExpressiveFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OneSharpExpressiveFactory init()
  {
    try
    {
      OneSharpExpressiveFactory theOneSharpExpressiveFactory = (OneSharpExpressiveFactory)EPackage.Registry.INSTANCE.getEFactory(OneSharpExpressivePackage.eNS_URI);
      if (theOneSharpExpressiveFactory != null)
      {
        return theOneSharpExpressiveFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OneSharpExpressiveFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneSharpExpressiveFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OneSharpExpressivePackage.PROGRAM: return createProgram();
      case OneSharpExpressivePackage.WRITE: return createWrite();
      case OneSharpExpressivePackage.NORMAL_CASE: return createNormalCase();
      case OneSharpExpressivePackage.LOOP_CASE: return createLoopCase();
      case OneSharpExpressivePackage.GOTO: return createGoto();
      case OneSharpExpressivePackage.CALL: return createCall();
      case OneSharpExpressivePackage.COMMAND: return createCommand();
      case OneSharpExpressivePackage.FUNCTION_HEADER: return createFunctionHeader();
      case OneSharpExpressivePackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Write createWrite()
  {
    WriteImpl write = new WriteImpl();
    return write;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalCase createNormalCase()
  {
    NormalCaseImpl normalCase = new NormalCaseImpl();
    return normalCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopCase createLoopCase()
  {
    LoopCaseImpl loopCase = new LoopCaseImpl();
    return loopCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goto createGoto()
  {
    GotoImpl goto_ = new GotoImpl();
    return goto_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionHeader createFunctionHeader()
  {
    FunctionHeaderImpl functionHeader = new FunctionHeaderImpl();
    return functionHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneSharpExpressivePackage getOneSharpExpressivePackage()
  {
    return (OneSharpExpressivePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OneSharpExpressivePackage getPackage()
  {
    return OneSharpExpressivePackage.eINSTANCE;
  }

} //OneSharpExpressiveFactoryImpl
