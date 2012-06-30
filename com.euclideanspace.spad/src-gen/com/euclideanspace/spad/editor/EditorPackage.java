/**
 */
package com.euclideanspace.spad.editor;

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
 * @see com.euclideanspace.spad.editor.EditorFactory
 * @model kind="package"
 * @generated
 */
public interface EditorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "editor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.euclideanspace.com/spad/Editor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "editor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorPackage eINSTANCE = com.euclideanspace.spad.editor.impl.EditorPackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ModelImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__C = 0;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__P = 1;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__D = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl <em>Category Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.CategoryDefImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getCategoryDef()
   * @generated
   */
  int CATEGORY_DEF = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Shortname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_DEF__SHORTNAME = 1;

  /**
   * The feature id for the '<em><b>Longname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_DEF__LONGNAME = 2;

  /**
   * The feature id for the '<em><b>Longname2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_DEF__LONGNAME2 = 3;

  /**
   * The feature id for the '<em><b>Cp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_DEF__CP = 4;

  /**
   * The feature id for the '<em><b>Impl Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_DEF__IMPL_NAME = 5;

  /**
   * The feature id for the '<em><b>Wh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_DEF__WH = 6;

  /**
   * The number of structural features of the '<em>Category Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_DEF_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.PackageDefImpl <em>Package Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.PackageDefImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPackageDef()
   * @generated
   */
  int PACKAGE_DEF = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Shortname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__SHORTNAME = 1;

  /**
   * The feature id for the '<em><b>Longname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__LONGNAME = 2;

  /**
   * The feature id for the '<em><b>Longname2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__LONGNAME2 = 3;

  /**
   * The feature id for the '<em><b>Cp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__CP = 4;

  /**
   * The feature id for the '<em><b>Export Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__EXPORT_NAME = 5;

  /**
   * The feature id for the '<em><b>Impl Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__IMPL_NAME = 6;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__W = 7;

  /**
   * The number of structural features of the '<em>Package Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.DomainDefImpl <em>Domain Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.DomainDefImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getDomainDef()
   * @generated
   */
  int DOMAIN_DEF = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Shortname5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF__SHORTNAME5 = 1;

  /**
   * The feature id for the '<em><b>Longname5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF__LONGNAME5 = 2;

  /**
   * The feature id for the '<em><b>Longname6</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF__LONGNAME6 = 3;

  /**
   * The feature id for the '<em><b>Cp5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF__CP5 = 4;

  /**
   * The feature id for the '<em><b>Export Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF__EXPORT_NAME = 5;

  /**
   * The feature id for the '<em><b>Impl Name5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF__IMPL_NAME5 = 6;

  /**
   * The feature id for the '<em><b>Wh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF__WH5 = 7;

  /**
   * The number of structural features of the '<em>Domain Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEF_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.WherePartImpl <em>Where Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.WherePartImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getWherePart()
   * @generated
   */
  int WHERE_PART = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_PART__NAME = 0;

  /**
   * The feature id for the '<em><b>Where Assig</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_PART__WHERE_ASSIG = 1;

  /**
   * The feature id for the '<em><b>Longname8</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_PART__LONGNAME8 = 2;

  /**
   * The feature id for the '<em><b>Imp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_PART__IMP = 3;

  /**
   * The feature id for the '<em><b>W8</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_PART__W8 = 4;

  /**
   * The feature id for the '<em><b>Longname9</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_PART__LONGNAME9 = 5;

  /**
   * The feature id for the '<em><b>Add</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_PART__ADD = 6;

  /**
   * The number of structural features of the '<em>Where Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_PART_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.WhereAssignmentsImpl <em>Where Assignments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.WhereAssignmentsImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getWhereAssignments()
   * @generated
   */
  int WHERE_ASSIGNMENTS = 5;

  /**
   * The number of structural features of the '<em>Where Assignments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_ASSIGNMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.WithPartImpl <em>With Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.WithPartImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getWithPart()
   * @generated
   */
  int WITH_PART = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_PART__NAME = 0;

  /**
   * The feature id for the '<em><b>Fundec</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_PART__FUNDEC = 1;

  /**
   * The number of structural features of the '<em>With Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.AddPartImpl <em>Add Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.AddPartImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getAddPart()
   * @generated
   */
  int ADD_PART = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PART__NAME = 0;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PART__T = 1;

  /**
   * The number of structural features of the '<em>Add Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.AddStatementsImpl <em>Add Statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.AddStatementsImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getAddStatements()
   * @generated
   */
  int ADD_STATEMENTS = 8;

  /**
   * The number of structural features of the '<em>Add Statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_STATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.FunctionDefinitionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getFunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 9;

  /**
   * The number of structural features of the '<em>Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = ADD_STATEMENTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl <em>Function Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.FunctionSignatureImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getFunctionSignature()
   * @generated
   */
  int FUNCTION_SIGNATURE = 10;

  /**
   * The feature id for the '<em><b>Par4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__PAR4 = FUNCTION_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Par5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__PAR5 = FUNCTION_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fn Nam</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__FN_NAM = FUNCTION_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Par2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__PAR2 = FUNCTION_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Par3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__PAR3 = FUNCTION_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>T4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__T4 = FUNCTION_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>B1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__B1 = FUNCTION_DEFINITION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>T5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__T5 = FUNCTION_DEFINITION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>B2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__B2 = FUNCTION_DEFINITION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>T6</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__T6 = FUNCTION_DEFINITION_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Function Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE_FEATURE_COUNT = FUNCTION_DEFINITION_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.MacroDefImpl <em>Macro Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.MacroDefImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getMacroDef()
   * @generated
   */
  int MACRO_DEF = 11;

  /**
   * The feature id for the '<em><b>Macroname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_DEF__MACRONAME = WHERE_ASSIGNMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Macro Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_DEF_FEATURE_COUNT = WHERE_ASSIGNMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ImportImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 12;

  /**
   * The feature id for the '<em><b>Impname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPNAME = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.VariableDeclarationImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VAR_NAME = WHERE_ASSIGNMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Typ</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYP = WHERE_ASSIGNMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = WHERE_ASSIGNMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.VariableDeclarationAssignImpl <em>Variable Declaration Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.VariableDeclarationAssignImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getVariableDeclarationAssign()
   * @generated
   */
  int VARIABLE_DECLARATION_ASSIGN = 14;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_ASSIGN__VAR_NAME = ADD_STATEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_ASSIGN__T2 = ADD_STATEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Typ</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_ASSIGN__TYP = ADD_STATEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_ASSIGN__T4 = ADD_STATEMENTS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Variable Declaration Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_ASSIGN_FEATURE_COUNT = ADD_STATEMENTS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.FreeVariableImpl <em>Free Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.FreeVariableImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getFreeVariable()
   * @generated
   */
  int FREE_VARIABLE = 15;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE__VAR = 0;

  /**
   * The number of structural features of the '<em>Free Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.LocalVariableImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 16;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__VAR = 0;

  /**
   * The number of structural features of the '<em>Local Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.TypeExpressionImpl <em>Type Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.TypeExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeExpression()
   * @generated
   */
  int TYPE_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION__T2 = 0;

  /**
   * The feature id for the '<em><b>T3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION__T3 = 1;

  /**
   * The number of structural features of the '<em>Type Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.TypeParameterListImpl <em>Type Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.TypeParameterListImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeParameterList()
   * @generated
   */
  int TYPE_PARAMETER_LIST = 18;

  /**
   * The feature id for the '<em><b>Tyname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER_LIST__TYNAME = 0;

  /**
   * The feature id for the '<em><b>Par</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER_LIST__PAR = 1;

  /**
   * The feature id for the '<em><b>Par2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER_LIST__PAR2 = 2;

  /**
   * The number of structural features of the '<em>Type Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER_LIST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.TypeArgumentsImpl <em>Type Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.TypeArgumentsImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeArguments()
   * @generated
   */
  int TYPE_ARGUMENTS = 19;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T = 0;

  /**
   * The feature id for the '<em><b>T2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T2 = 1;

  /**
   * The feature id for the '<em><b>T3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T3 = 2;

  /**
   * The feature id for the '<em><b>B1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__B1 = 3;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T4 = 4;

  /**
   * The feature id for the '<em><b>T16</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T16 = 5;

  /**
   * The feature id for the '<em><b>T5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T5 = 6;

  /**
   * The feature id for the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T6 = 7;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T7 = 8;

  /**
   * The feature id for the '<em><b>T8</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T8 = 9;

  /**
   * The feature id for the '<em><b>T9</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T9 = 10;

  /**
   * The feature id for the '<em><b>T10</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T10 = 11;

  /**
   * The feature id for the '<em><b>T11</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T11 = 12;

  /**
   * The feature id for the '<em><b>T12</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T12 = 13;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T13 = 14;

  /**
   * The feature id for the '<em><b>T15</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS__T15 = 15;

  /**
   * The number of structural features of the '<em>Type Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTS_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.TypeResultImpl <em>Type Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.TypeResultImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeResult()
   * @generated
   */
  int TYPE_RESULT = 20;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T = 0;

  /**
   * The feature id for the '<em><b>T2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T2 = 1;

  /**
   * The feature id for the '<em><b>Tyname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__TYNAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__NAME = 3;

  /**
   * The feature id for the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T6 = 4;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T7 = 5;

  /**
   * The feature id for the '<em><b>T9</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T9 = 6;

  /**
   * The feature id for the '<em><b>T10</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T10 = 7;

  /**
   * The feature id for the '<em><b>T12</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T12 = 8;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T13 = 9;

  /**
   * The feature id for the '<em><b>T15</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT__T15 = 10;

  /**
   * The number of structural features of the '<em>Type Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESULT_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.TypePrimaryExpressionImpl <em>Type Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.TypePrimaryExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypePrimaryExpression()
   * @generated
   */
  int TYPE_PRIMARY_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T2 = TYPE_EXPRESSION__T2;

  /**
   * The feature id for the '<em><b>T3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T3 = TYPE_EXPRESSION__T3;

  /**
   * The feature id for the '<em><b>T32</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T32 = TYPE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tyname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__TYNAME = TYPE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T5 = TYPE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T7 = TYPE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>T8</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T8 = TYPE_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>T21</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T21 = TYPE_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>T23</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T23 = TYPE_EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>T10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T10 = TYPE_EXPRESSION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>T11</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T11 = TYPE_EXPRESSION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>T24</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T24 = TYPE_EXPRESSION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>T26</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T26 = TYPE_EXPRESSION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T13 = TYPE_EXPRESSION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION__T14 = TYPE_EXPRESSION_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Type Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCallImpl <em>Type Name Or Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCallImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeNameOrFunctionCall()
   * @generated
   */
  int TYPE_NAME_OR_FUNCTION_CALL = 22;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T2 = TYPE_PRIMARY_EXPRESSION__T2;

  /**
   * The feature id for the '<em><b>T3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T3 = TYPE_PRIMARY_EXPRESSION__T3;

  /**
   * The feature id for the '<em><b>T32</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T32 = TYPE_PRIMARY_EXPRESSION__T32;

  /**
   * The feature id for the '<em><b>Tyname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__TYNAME = TYPE_PRIMARY_EXPRESSION__TYNAME;

  /**
   * The feature id for the '<em><b>T5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T5 = TYPE_PRIMARY_EXPRESSION__T5;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T7 = TYPE_PRIMARY_EXPRESSION__T7;

  /**
   * The feature id for the '<em><b>T8</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T8 = TYPE_PRIMARY_EXPRESSION__T8;

  /**
   * The feature id for the '<em><b>T21</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T21 = TYPE_PRIMARY_EXPRESSION__T21;

  /**
   * The feature id for the '<em><b>T23</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T23 = TYPE_PRIMARY_EXPRESSION__T23;

  /**
   * The feature id for the '<em><b>T10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T10 = TYPE_PRIMARY_EXPRESSION__T10;

  /**
   * The feature id for the '<em><b>T11</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T11 = TYPE_PRIMARY_EXPRESSION__T11;

  /**
   * The feature id for the '<em><b>T24</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T24 = TYPE_PRIMARY_EXPRESSION__T24;

  /**
   * The feature id for the '<em><b>T26</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T26 = TYPE_PRIMARY_EXPRESSION__T26;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T13 = TYPE_PRIMARY_EXPRESSION__T13;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T14 = TYPE_PRIMARY_EXPRESSION__T14;

  /**
   * The feature id for the '<em><b>Tfnname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__TFNNAME = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T4 = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T25</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T25 = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL__T6 = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type Name Or Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_OR_FUNCTION_CALL_FEATURE_COUNT = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.TypeLiteralImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeLiteral()
   * @generated
   */
  int TYPE_LITERAL = 23;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T2 = TYPE_PRIMARY_EXPRESSION__T2;

  /**
   * The feature id for the '<em><b>T3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T3 = TYPE_PRIMARY_EXPRESSION__T3;

  /**
   * The feature id for the '<em><b>T32</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T32 = TYPE_PRIMARY_EXPRESSION__T32;

  /**
   * The feature id for the '<em><b>Tyname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__TYNAME = TYPE_PRIMARY_EXPRESSION__TYNAME;

  /**
   * The feature id for the '<em><b>T5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T5 = TYPE_PRIMARY_EXPRESSION__T5;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T7 = TYPE_PRIMARY_EXPRESSION__T7;

  /**
   * The feature id for the '<em><b>T8</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T8 = TYPE_PRIMARY_EXPRESSION__T8;

  /**
   * The feature id for the '<em><b>T21</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T21 = TYPE_PRIMARY_EXPRESSION__T21;

  /**
   * The feature id for the '<em><b>T23</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T23 = TYPE_PRIMARY_EXPRESSION__T23;

  /**
   * The feature id for the '<em><b>T10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T10 = TYPE_PRIMARY_EXPRESSION__T10;

  /**
   * The feature id for the '<em><b>T11</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T11 = TYPE_PRIMARY_EXPRESSION__T11;

  /**
   * The feature id for the '<em><b>T24</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T24 = TYPE_PRIMARY_EXPRESSION__T24;

  /**
   * The feature id for the '<em><b>T26</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T26 = TYPE_PRIMARY_EXPRESSION__T26;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T13 = TYPE_PRIMARY_EXPRESSION__T13;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T14 = TYPE_PRIMARY_EXPRESSION__T14;

  /**
   * The feature id for the '<em><b>T1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T1 = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T22</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T22 = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T34</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T34 = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>T35</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL__T35 = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL_FEATURE_COUNT = TYPE_PRIMARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.StatementImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 24;

  /**
   * The feature id for the '<em><b>S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S1 = 0;

  /**
   * The feature id for the '<em><b>S3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S3 = 1;

  /**
   * The feature id for the '<em><b>S4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S4 = 2;

  /**
   * The feature id for the '<em><b>S5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S5 = 3;

  /**
   * The feature id for the '<em><b>S6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S6 = 4;

  /**
   * The feature id for the '<em><b>S7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S7 = 5;

  /**
   * The feature id for the '<em><b>S8</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S8 = 6;

  /**
   * The feature id for the '<em><b>S9</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S9 = 7;

  /**
   * The feature id for the '<em><b>S10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S10 = 8;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.BlockImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 25;

  /**
   * The feature id for the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STNAME = 0;

  /**
   * The feature id for the '<em><b>Statem Bl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEM_BL = 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl <em>Statement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.StatementExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getStatementExpression()
   * @generated
   */
  int STATEMENT_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__T = 0;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__T2 = 1;

  /**
   * The feature id for the '<em><b>T3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__T3 = 2;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__T4 = 3;

  /**
   * The number of structural features of the '<em>Statement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ForStatementImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 27;

  /**
   * The feature id for the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STNAME = 0;

  /**
   * The feature id for the '<em><b>T1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__T1 = 1;

  /**
   * The feature id for the '<em><b>S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__S1 = 2;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.WhileStatementImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 28;

  /**
   * The feature id for the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STNAME = 0;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__T2 = 1;

  /**
   * The feature id for the '<em><b>S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__S1 = 2;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.DoStatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.DoStatementImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getDoStatement()
   * @generated
   */
  int DO_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__STNAME = 0;

  /**
   * The feature id for the '<em><b>S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__S1 = 1;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__T2 = 2;

  /**
   * The number of structural features of the '<em>Do Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.IterateStatementImpl <em>Iterate Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.IterateStatementImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getIterateStatement()
   * @generated
   */
  int ITERATE_STATEMENT = 30;

  /**
   * The feature id for the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATE_STATEMENT__STNAME = 0;

  /**
   * The number of structural features of the '<em>Iterate Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.BreakStatementImpl <em>Break Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.BreakStatementImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getBreakStatement()
   * @generated
   */
  int BREAK_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_STATEMENT__STNAME = 0;

  /**
   * The number of structural features of the '<em>Break Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ReturnStatementImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 32;

  /**
   * The feature id for the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__STNAME = 0;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__T2 = 1;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.IfStatementImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 33;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__T2 = 0;

  /**
   * The feature id for the '<em><b>S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__S1 = 1;

  /**
   * The feature id for the '<em><b>S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__S2 = 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.PredicateImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 34;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.PredicatePrimaryImpl <em>Predicate Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.PredicatePrimaryImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicatePrimary()
   * @generated
   */
  int PREDICATE_PRIMARY = 35;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PRIMARY__T = PREDICATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PRIMARY__T2 = PREDICATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PRIMARY_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ExprImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 36;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__IFNAME = 0;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__IFPRED = 1;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__THENEXP = 2;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__ELSEEXP = 3;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.MapDefinitionImpl <em>Map Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.MapDefinitionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getMapDefinition()
   * @generated
   */
  int MAP_DEFINITION = 37;

  /**
   * The feature id for the '<em><b>Fn Sig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_DEFINITION__FN_SIG = 0;

  /**
   * The feature id for the '<em><b>Par4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_DEFINITION__PAR4 = 1;

  /**
   * The feature id for the '<em><b>Par5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_DEFINITION__PAR5 = 2;

  /**
   * The number of structural features of the '<em>Map Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.PrimaryPrefixImpl <em>Primary Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.PrimaryPrefixImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPrimaryPrefix()
   * @generated
   */
  int PRIMARY_PREFIX = 38;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_PREFIX__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_PREFIX__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_PREFIX__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_PREFIX__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_PREFIX__T4 = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_PREFIX__T7 = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Primary Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_PREFIX_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.NameOrFunctionCallImpl <em>Name Or Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.NameOrFunctionCallImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getNameOrFunctionCall()
   * @generated
   */
  int NAME_OR_FUNCTION_CALL = 39;

  /**
   * The feature id for the '<em><b>Fnname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_FUNCTION_CALL__FNNAME = 0;

  /**
   * The feature id for the '<em><b>Lsp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_FUNCTION_CALL__LSP = 1;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_FUNCTION_CALL__T4 = 2;

  /**
   * The feature id for the '<em><b>T5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_FUNCTION_CALL__T5 = 3;

  /**
   * The feature id for the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_FUNCTION_CALL__T6 = 4;

  /**
   * The number of structural features of the '<em>Name Or Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_FUNCTION_CALL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.LiteralImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 40;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__IFNAME = PRIMARY_PREFIX__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__IFPRED = PRIMARY_PREFIX__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__THENEXP = PRIMARY_PREFIX__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__ELSEEXP = PRIMARY_PREFIX__ELSEEXP;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__T4 = PRIMARY_PREFIX__T4;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__T7 = PRIMARY_PREFIX__T7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = PRIMARY_PREFIX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__T2 = PRIMARY_PREFIX_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = PRIMARY_PREFIX_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.CharacterLiteralImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getCharacterLiteral()
   * @generated
   */
  int CHARACTER_LITERAL = 41;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__IFNAME = LITERAL__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__IFPRED = LITERAL__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__THENEXP = LITERAL__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__ELSEEXP = LITERAL__ELSEEXP;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__T4 = LITERAL__T4;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__T7 = LITERAL__T7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__VALUE = LITERAL__VALUE;

  /**
   * The feature id for the '<em><b>T2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__T2 = LITERAL__T2;

  /**
   * The feature id for the '<em><b>C1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__C1 = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Character Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.BooleanLiteralImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 42;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__IFNAME = LITERAL__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__IFPRED = LITERAL__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__THENEXP = LITERAL__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__ELSEEXP = LITERAL__ELSEEXP;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__T4 = LITERAL__T4;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__T7 = LITERAL__T7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL__VALUE;

  /**
   * The feature id for the '<em><b>T2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__T2 = LITERAL__T2;

  /**
   * The feature id for the '<em><b>Litname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LITNAME = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ListLiteralImpl <em>List Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ListLiteralImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getListLiteral()
   * @generated
   */
  int LIST_LITERAL = 43;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__IFNAME = LITERAL__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__IFPRED = LITERAL__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__THENEXP = LITERAL__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__ELSEEXP = LITERAL__ELSEEXP;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__T4 = LITERAL__T4;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__T7 = LITERAL__T7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__VALUE = LITERAL__VALUE;

  /**
   * The feature id for the '<em><b>T2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__T2 = LITERAL__T2;

  /**
   * The feature id for the '<em><b>Litname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__LITNAME = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>L2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__L2 = LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__T3 = LITERAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__T14 = LITERAL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>L5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__L5 = LITERAL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>List Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.PredicateOrImpl <em>Predicate Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.PredicateOrImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicateOr()
   * @generated
   */
  int PREDICATE_OR = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OR__LEFT = PREDICATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OR__PRNAME = PREDICATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OR__RIGHT = PREDICATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Predicate Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.PredicateAndImpl <em>Predicate And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.PredicateAndImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicateAnd()
   * @generated
   */
  int PREDICATE_AND = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_AND__LEFT = PREDICATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_AND__PRNAME = PREDICATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_AND__RIGHT = PREDICATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Predicate And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_AND_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.PredicateNotImpl <em>Predicate Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.PredicateNotImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicateNot()
   * @generated
   */
  int PREDICATE_NOT = 46;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_NOT__T2 = PREDICATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Predicate Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_NOT_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ConditionExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getConditionExpression()
   * @generated
   */
  int CONDITION_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Condition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.InnerProdExpressionImpl <em>Inner Prod Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.InnerProdExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getInnerProdExpression()
   * @generated
   */
  int INNER_PROD_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PROD_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PROD_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PROD_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PROD_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PROD_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PROD_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PROD_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Inner Prod Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PROD_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.OuterProdExpressionImpl <em>Outer Prod Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.OuterProdExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getOuterProdExpression()
   * @generated
   */
  int OUTER_PROD_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_PROD_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_PROD_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_PROD_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_PROD_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_PROD_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_PROD_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_PROD_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Outer Prod Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_PROD_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.HasExpressionImpl <em>Has Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.HasExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getHasExpression()
   * @generated
   */
  int HAS_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EXPRESSION__RIGHT_TYPE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Has Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.CaseExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getCaseExpression()
   * @generated
   */
  int CASE_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Case Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.EqualityExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getEqualityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 52;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.RelationalExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getRelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 53;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.IsExpressionImpl <em>Is Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.IsExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getIsExpression()
   * @generated
   */
  int IS_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EXPRESSION__RIGHT_TYPE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Is Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.SegmentExpressionImpl <em>Segment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.SegmentExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getSegmentExpression()
   * @generated
   */
  int SEGMENT_EXPRESSION = 55;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Segment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.AdditiveExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 56;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ExquoExpressionImpl <em>Exquo Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ExquoExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getExquoExpression()
   * @generated
   */
  int EXQUO_EXPRESSION = 57;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUO_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUO_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUO_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUO_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUO_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUO_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUO_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Exquo Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUO_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.DivisionExpressionImpl <em>Division Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.DivisionExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getDivisionExpression()
   * @generated
   */
  int DIVISION_EXPRESSION = 58;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Division Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.QuoExpressionImpl <em>Quo Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.QuoExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getQuoExpression()
   * @generated
   */
  int QUO_EXPRESSION = 59;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUO_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUO_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUO_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUO_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUO_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUO_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUO_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Quo Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUO_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ModExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getModExpression()
   * @generated
   */
  int MOD_EXPRESSION = 60;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mod Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.RemExpressionImpl <em>Rem Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.RemExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getRemExpression()
   * @generated
   */
  int REM_EXPRESSION = 61;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rem Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.MultiplicativeExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getMultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 62;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ExponentExpressionImpl <em>Exponent Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ExponentExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getExponentExpression()
   * @generated
   */
  int EXPONENT_EXPRESSION = 63;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Exponent Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.PretendExpressionImpl <em>Pretend Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.PretendExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPretendExpression()
   * @generated
   */
  int PRETEND_EXPRESSION = 64;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETEND_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETEND_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETEND_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETEND_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETEND_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETEND_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETEND_EXPRESSION__RIGHT_TYPE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Pretend Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETEND_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.HintTypeExpressionImpl <em>Hint Type Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.HintTypeExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getHintTypeExpression()
   * @generated
   */
  int HINT_TYPE_EXPRESSION = 65;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_TYPE_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_TYPE_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_TYPE_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_TYPE_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_TYPE_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_TYPE_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_TYPE_EXPRESSION__RIGHT_TYPE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Hint Type Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HINT_TYPE_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.CoerceExpressionImpl <em>Coerce Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.CoerceExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getCoerceExpression()
   * @generated
   */
  int COERCE_EXPRESSION = 66;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COERCE_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COERCE_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COERCE_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COERCE_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COERCE_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COERCE_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COERCE_EXPRESSION__RIGHT_TYPE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Coerce Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COERCE_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.EltExpressionImpl <em>Elt Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.EltExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getEltExpression()
   * @generated
   */
  int ELT_EXPRESSION = 67;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELT_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELT_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELT_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELT_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELT_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELT_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELT_EXPRESSION__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Elt Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELT_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.ExplicitTypeExpressionImpl <em>Explicit Type Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.ExplicitTypeExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getExplicitTypeExpression()
   * @generated
   */
  int EXPLICIT_TYPE_EXPRESSION = 68;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_TYPE_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_TYPE_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_TYPE_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_TYPE_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_TYPE_EXPRESSION__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_TYPE_EXPRESSION__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_TYPE_EXPRESSION__RIGHT_TYPE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Explicit Type Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_TYPE_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.spad.editor.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.spad.editor.impl.UnaryExpressionImpl
   * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 69;

  /**
   * The feature id for the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__IFNAME = EXPR__IFNAME;

  /**
   * The feature id for the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__IFPRED = EXPR__IFPRED;

  /**
   * The feature id for the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__THENEXP = EXPR__THENEXP;

  /**
   * The feature id for the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__ELSEEXP = EXPR__ELSEEXP;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__UOP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXPR = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.euclideanspace.spad.editor.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Model#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see com.euclideanspace.spad.editor.Model#getC()
   * @see #getModel()
   * @generated
   */
  EReference getModel_C();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Model#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>P</em>'.
   * @see com.euclideanspace.spad.editor.Model#getP()
   * @see #getModel()
   * @generated
   */
  EReference getModel_P();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Model#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see com.euclideanspace.spad.editor.Model#getD()
   * @see #getModel()
   * @generated
   */
  EReference getModel_D();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.CategoryDef <em>Category Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category Def</em>'.
   * @see com.euclideanspace.spad.editor.CategoryDef
   * @generated
   */
  EClass getCategoryDef();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.CategoryDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.spad.editor.CategoryDef#getName()
   * @see #getCategoryDef()
   * @generated
   */
  EAttribute getCategoryDef_Name();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.CategoryDef#getShortname <em>Shortname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shortname</em>'.
   * @see com.euclideanspace.spad.editor.CategoryDef#getShortname()
   * @see #getCategoryDef()
   * @generated
   */
  EAttribute getCategoryDef_Shortname();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.CategoryDef#getLongname <em>Longname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname</em>'.
   * @see com.euclideanspace.spad.editor.CategoryDef#getLongname()
   * @see #getCategoryDef()
   * @generated
   */
  EAttribute getCategoryDef_Longname();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.CategoryDef#getLongname2 <em>Longname2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname2</em>'.
   * @see com.euclideanspace.spad.editor.CategoryDef#getLongname2()
   * @see #getCategoryDef()
   * @generated
   */
  EAttribute getCategoryDef_Longname2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.CategoryDef#getCp <em>Cp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cp</em>'.
   * @see com.euclideanspace.spad.editor.CategoryDef#getCp()
   * @see #getCategoryDef()
   * @generated
   */
  EReference getCategoryDef_Cp();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.CategoryDef#getImplName <em>Impl Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Name</em>'.
   * @see com.euclideanspace.spad.editor.CategoryDef#getImplName()
   * @see #getCategoryDef()
   * @generated
   */
  EAttribute getCategoryDef_ImplName();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.CategoryDef#getWh <em>Wh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wh</em>'.
   * @see com.euclideanspace.spad.editor.CategoryDef#getWh()
   * @see #getCategoryDef()
   * @generated
   */
  EReference getCategoryDef_Wh();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.PackageDef <em>Package Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Def</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef
   * @generated
   */
  EClass getPackageDef();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PackageDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef#getName()
   * @see #getPackageDef()
   * @generated
   */
  EAttribute getPackageDef_Name();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PackageDef#getShortname <em>Shortname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shortname</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef#getShortname()
   * @see #getPackageDef()
   * @generated
   */
  EAttribute getPackageDef_Shortname();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PackageDef#getLongname <em>Longname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef#getLongname()
   * @see #getPackageDef()
   * @generated
   */
  EAttribute getPackageDef_Longname();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PackageDef#getLongname2 <em>Longname2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname2</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef#getLongname2()
   * @see #getPackageDef()
   * @generated
   */
  EAttribute getPackageDef_Longname2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PackageDef#getCp <em>Cp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cp</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef#getCp()
   * @see #getPackageDef()
   * @generated
   */
  EReference getPackageDef_Cp();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PackageDef#getExportName <em>Export Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Export Name</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef#getExportName()
   * @see #getPackageDef()
   * @generated
   */
  EAttribute getPackageDef_ExportName();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PackageDef#getImplName <em>Impl Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Name</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef#getImplName()
   * @see #getPackageDef()
   * @generated
   */
  EAttribute getPackageDef_ImplName();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PackageDef#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>W</em>'.
   * @see com.euclideanspace.spad.editor.PackageDef#getW()
   * @see #getPackageDef()
   * @generated
   */
  EReference getPackageDef_W();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.DomainDef <em>Domain Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Def</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef
   * @generated
   */
  EClass getDomainDef();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.DomainDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef#getName()
   * @see #getDomainDef()
   * @generated
   */
  EAttribute getDomainDef_Name();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.DomainDef#getShortname5 <em>Shortname5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shortname5</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef#getShortname5()
   * @see #getDomainDef()
   * @generated
   */
  EAttribute getDomainDef_Shortname5();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.DomainDef#getLongname5 <em>Longname5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname5</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef#getLongname5()
   * @see #getDomainDef()
   * @generated
   */
  EAttribute getDomainDef_Longname5();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.DomainDef#getLongname6 <em>Longname6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname6</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef#getLongname6()
   * @see #getDomainDef()
   * @generated
   */
  EAttribute getDomainDef_Longname6();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.DomainDef#getCp5 <em>Cp5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cp5</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef#getCp5()
   * @see #getDomainDef()
   * @generated
   */
  EReference getDomainDef_Cp5();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.DomainDef#getExportName <em>Export Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Export Name</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef#getExportName()
   * @see #getDomainDef()
   * @generated
   */
  EAttribute getDomainDef_ExportName();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.DomainDef#getImplName5 <em>Impl Name5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Name5</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef#getImplName5()
   * @see #getDomainDef()
   * @generated
   */
  EAttribute getDomainDef_ImplName5();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.DomainDef#getWh5 <em>Wh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wh5</em>'.
   * @see com.euclideanspace.spad.editor.DomainDef#getWh5()
   * @see #getDomainDef()
   * @generated
   */
  EReference getDomainDef_Wh5();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.WherePart <em>Where Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Part</em>'.
   * @see com.euclideanspace.spad.editor.WherePart
   * @generated
   */
  EClass getWherePart();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.WherePart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.spad.editor.WherePart#getName()
   * @see #getWherePart()
   * @generated
   */
  EAttribute getWherePart_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.WherePart#getWhereAssig <em>Where Assig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Where Assig</em>'.
   * @see com.euclideanspace.spad.editor.WherePart#getWhereAssig()
   * @see #getWherePart()
   * @generated
   */
  EReference getWherePart_WhereAssig();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.WherePart#getLongname8 <em>Longname8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname8</em>'.
   * @see com.euclideanspace.spad.editor.WherePart#getLongname8()
   * @see #getWherePart()
   * @generated
   */
  EAttribute getWherePart_Longname8();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.WherePart#getImp <em>Imp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imp</em>'.
   * @see com.euclideanspace.spad.editor.WherePart#getImp()
   * @see #getWherePart()
   * @generated
   */
  EReference getWherePart_Imp();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.WherePart#getW8 <em>W8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>W8</em>'.
   * @see com.euclideanspace.spad.editor.WherePart#getW8()
   * @see #getWherePart()
   * @generated
   */
  EReference getWherePart_W8();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.WherePart#getLongname9 <em>Longname9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname9</em>'.
   * @see com.euclideanspace.spad.editor.WherePart#getLongname9()
   * @see #getWherePart()
   * @generated
   */
  EAttribute getWherePart_Longname9();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.WherePart#getAdd <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Add</em>'.
   * @see com.euclideanspace.spad.editor.WherePart#getAdd()
   * @see #getWherePart()
   * @generated
   */
  EReference getWherePart_Add();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.WhereAssignments <em>Where Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Assignments</em>'.
   * @see com.euclideanspace.spad.editor.WhereAssignments
   * @generated
   */
  EClass getWhereAssignments();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.WithPart <em>With Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With Part</em>'.
   * @see com.euclideanspace.spad.editor.WithPart
   * @generated
   */
  EClass getWithPart();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.WithPart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.spad.editor.WithPart#getName()
   * @see #getWithPart()
   * @generated
   */
  EAttribute getWithPart_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.WithPart#getFundec <em>Fundec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fundec</em>'.
   * @see com.euclideanspace.spad.editor.WithPart#getFundec()
   * @see #getWithPart()
   * @generated
   */
  EReference getWithPart_Fundec();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.AddPart <em>Add Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Part</em>'.
   * @see com.euclideanspace.spad.editor.AddPart
   * @generated
   */
  EClass getAddPart();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.AddPart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.spad.editor.AddPart#getName()
   * @see #getAddPart()
   * @generated
   */
  EAttribute getAddPart_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.AddPart#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T</em>'.
   * @see com.euclideanspace.spad.editor.AddPart#getT()
   * @see #getAddPart()
   * @generated
   */
  EReference getAddPart_T();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.AddStatements <em>Add Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Statements</em>'.
   * @see com.euclideanspace.spad.editor.AddStatements
   * @generated
   */
  EClass getAddStatements();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Definition</em>'.
   * @see com.euclideanspace.spad.editor.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.FunctionSignature <em>Function Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Signature</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature
   * @generated
   */
  EClass getFunctionSignature();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar4 <em>Par4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Par4</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getPar4()
   * @see #getFunctionSignature()
   * @generated
   */
  EReference getFunctionSignature_Par4();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar5 <em>Par5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Par5</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getPar5()
   * @see #getFunctionSignature()
   * @generated
   */
  EReference getFunctionSignature_Par5();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.FunctionSignature#getFnNam <em>Fn Nam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fn Nam</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getFnNam()
   * @see #getFunctionSignature()
   * @generated
   */
  EAttribute getFunctionSignature_FnNam();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar2 <em>Par2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Par2</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getPar2()
   * @see #getFunctionSignature()
   * @generated
   */
  EReference getFunctionSignature_Par2();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar3 <em>Par3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Par3</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getPar3()
   * @see #getFunctionSignature()
   * @generated
   */
  EReference getFunctionSignature_Par3();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.FunctionSignature#getT4 <em>T4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T4</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getT4()
   * @see #getFunctionSignature()
   * @generated
   */
  EAttribute getFunctionSignature_T4();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.FunctionSignature#getB1 <em>B1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B1</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getB1()
   * @see #getFunctionSignature()
   * @generated
   */
  EAttribute getFunctionSignature_B1();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.FunctionSignature#getT5 <em>T5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T5</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getT5()
   * @see #getFunctionSignature()
   * @generated
   */
  EAttribute getFunctionSignature_T5();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.FunctionSignature#getB2 <em>B2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B2</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getB2()
   * @see #getFunctionSignature()
   * @generated
   */
  EAttribute getFunctionSignature_B2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.FunctionSignature#getT6 <em>T6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T6</em>'.
   * @see com.euclideanspace.spad.editor.FunctionSignature#getT6()
   * @see #getFunctionSignature()
   * @generated
   */
  EAttribute getFunctionSignature_T6();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.MacroDef <em>Macro Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Macro Def</em>'.
   * @see com.euclideanspace.spad.editor.MacroDef
   * @generated
   */
  EClass getMacroDef();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.MacroDef#getMacroname <em>Macroname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Macroname</em>'.
   * @see com.euclideanspace.spad.editor.MacroDef#getMacroname()
   * @see #getMacroDef()
   * @generated
   */
  EAttribute getMacroDef_Macroname();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.euclideanspace.spad.editor.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.Import#getImpname <em>Impname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impname</em>'.
   * @see com.euclideanspace.spad.editor.Import#getImpname()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Impname();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see com.euclideanspace.spad.editor.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.VariableDeclaration#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.euclideanspace.spad.editor.VariableDeclaration#getVarName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_VarName();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.VariableDeclaration#getTyp <em>Typ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typ</em>'.
   * @see com.euclideanspace.spad.editor.VariableDeclaration#getTyp()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Typ();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.VariableDeclarationAssign <em>Variable Declaration Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration Assign</em>'.
   * @see com.euclideanspace.spad.editor.VariableDeclarationAssign
   * @generated
   */
  EClass getVariableDeclarationAssign();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.VariableDeclarationAssign#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.euclideanspace.spad.editor.VariableDeclarationAssign#getVarName()
   * @see #getVariableDeclarationAssign()
   * @generated
   */
  EAttribute getVariableDeclarationAssign_VarName();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.spad.editor.VariableDeclarationAssign#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.VariableDeclarationAssign#getT2()
   * @see #getVariableDeclarationAssign()
   * @generated
   */
  EAttribute getVariableDeclarationAssign_T2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.VariableDeclarationAssign#getTyp <em>Typ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typ</em>'.
   * @see com.euclideanspace.spad.editor.VariableDeclarationAssign#getTyp()
   * @see #getVariableDeclarationAssign()
   * @generated
   */
  EReference getVariableDeclarationAssign_Typ();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.VariableDeclarationAssign#getT4 <em>T4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T4</em>'.
   * @see com.euclideanspace.spad.editor.VariableDeclarationAssign#getT4()
   * @see #getVariableDeclarationAssign()
   * @generated
   */
  EReference getVariableDeclarationAssign_T4();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.FreeVariable <em>Free Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Variable</em>'.
   * @see com.euclideanspace.spad.editor.FreeVariable
   * @generated
   */
  EClass getFreeVariable();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.FreeVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see com.euclideanspace.spad.editor.FreeVariable#getVar()
   * @see #getFreeVariable()
   * @generated
   */
  EAttribute getFreeVariable_Var();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable</em>'.
   * @see com.euclideanspace.spad.editor.LocalVariable
   * @generated
   */
  EClass getLocalVariable();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.LocalVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see com.euclideanspace.spad.editor.LocalVariable#getVar()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_Var();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.TypeExpression <em>Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Expression</em>'.
   * @see com.euclideanspace.spad.editor.TypeExpression
   * @generated
   */
  EClass getTypeExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeExpression#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.TypeExpression#getT2()
   * @see #getTypeExpression()
   * @generated
   */
  EReference getTypeExpression_T2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeExpression#getT3 <em>T3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T3</em>'.
   * @see com.euclideanspace.spad.editor.TypeExpression#getT3()
   * @see #getTypeExpression()
   * @generated
   */
  EReference getTypeExpression_T3();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.TypeParameterList <em>Type Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Parameter List</em>'.
   * @see com.euclideanspace.spad.editor.TypeParameterList
   * @generated
   */
  EClass getTypeParameterList();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeParameterList#getTyname <em>Tyname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tyname</em>'.
   * @see com.euclideanspace.spad.editor.TypeParameterList#getTyname()
   * @see #getTypeParameterList()
   * @generated
   */
  EAttribute getTypeParameterList_Tyname();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeParameterList#getPar <em>Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par</em>'.
   * @see com.euclideanspace.spad.editor.TypeParameterList#getPar()
   * @see #getTypeParameterList()
   * @generated
   */
  EAttribute getTypeParameterList_Par();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.spad.editor.TypeParameterList#getPar2 <em>Par2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Par2</em>'.
   * @see com.euclideanspace.spad.editor.TypeParameterList#getPar2()
   * @see #getTypeParameterList()
   * @generated
   */
  EAttribute getTypeParameterList_Par2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.TypeArguments <em>Type Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Arguments</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments
   * @generated
   */
  EClass getTypeArguments();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeArguments#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeArguments#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT2()
   * @see #getTypeArguments()
   * @generated
   */
  EAttribute getTypeArguments_T2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeArguments#getT3 <em>T3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T3</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT3()
   * @see #getTypeArguments()
   * @generated
   */
  EAttribute getTypeArguments_T3();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeArguments#isB1 <em>B1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B1</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#isB1()
   * @see #getTypeArguments()
   * @generated
   */
  EAttribute getTypeArguments_B1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeArguments#getT4 <em>T4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T4</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT4()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T4();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypeArguments#getT16 <em>T16</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T16</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT16()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T16();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeArguments#getT5 <em>T5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T5</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT5()
   * @see #getTypeArguments()
   * @generated
   */
  EAttribute getTypeArguments_T5();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeArguments#getT6 <em>T6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T6</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT6()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T6();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypeArguments#getT7 <em>T7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T7</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT7()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T7();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeArguments#getT8 <em>T8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T8</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT8()
   * @see #getTypeArguments()
   * @generated
   */
  EAttribute getTypeArguments_T8();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeArguments#getT9 <em>T9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T9</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT9()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T9();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypeArguments#getT10 <em>T10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T10</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT10()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T10();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeArguments#getT11 <em>T11</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T11</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT11()
   * @see #getTypeArguments()
   * @generated
   */
  EAttribute getTypeArguments_T11();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeArguments#getT12 <em>T12</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T12</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT12()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T12();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypeArguments#getT13 <em>T13</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T13</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT13()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T13();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeArguments#getT15 <em>T15</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T15</em>'.
   * @see com.euclideanspace.spad.editor.TypeArguments#getT15()
   * @see #getTypeArguments()
   * @generated
   */
  EReference getTypeArguments_T15();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.TypeResult <em>Type Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Result</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult
   * @generated
   */
  EClass getTypeResult();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeResult#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT()
   * @see #getTypeResult()
   * @generated
   */
  EReference getTypeResult_T();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeResult#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT2()
   * @see #getTypeResult()
   * @generated
   */
  EAttribute getTypeResult_T2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeResult#getTyname <em>Tyname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tyname</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getTyname()
   * @see #getTypeResult()
   * @generated
   */
  EAttribute getTypeResult_Tyname();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeResult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getName()
   * @see #getTypeResult()
   * @generated
   */
  EAttribute getTypeResult_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeResult#getT6 <em>T6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T6</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT6()
   * @see #getTypeResult()
   * @generated
   */
  EReference getTypeResult_T6();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypeResult#getT7 <em>T7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T7</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT7()
   * @see #getTypeResult()
   * @generated
   */
  EReference getTypeResult_T7();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeResult#getT9 <em>T9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T9</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT9()
   * @see #getTypeResult()
   * @generated
   */
  EReference getTypeResult_T9();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypeResult#getT10 <em>T10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T10</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT10()
   * @see #getTypeResult()
   * @generated
   */
  EReference getTypeResult_T10();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeResult#getT12 <em>T12</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T12</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT12()
   * @see #getTypeResult()
   * @generated
   */
  EReference getTypeResult_T12();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypeResult#getT13 <em>T13</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T13</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT13()
   * @see #getTypeResult()
   * @generated
   */
  EReference getTypeResult_T13();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeResult#getT15 <em>T15</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T15</em>'.
   * @see com.euclideanspace.spad.editor.TypeResult#getT15()
   * @see #getTypeResult()
   * @generated
   */
  EReference getTypeResult_T15();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.TypePrimaryExpression <em>Type Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Primary Expression</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression
   * @generated
   */
  EClass getTypePrimaryExpression();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT32 <em>T32</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T32</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT32()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EAttribute getTypePrimaryExpression_T32();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getTyname <em>Tyname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tyname</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getTyname()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EAttribute getTypePrimaryExpression_Tyname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT5 <em>T5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T5</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT5()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T5();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT7 <em>T7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T7</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT7()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T7();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT8 <em>T8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T8</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT8()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T8();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT21 <em>T21</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T21</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT21()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T21();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT23 <em>T23</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T23</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT23()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T23();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT10 <em>T10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T10</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT10()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T10();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT11 <em>T11</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T11</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT11()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T11();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT24 <em>T24</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T24</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT24()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T24();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT26 <em>T26</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T26</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT26()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T26();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT13 <em>T13</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T13</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT13()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T13();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT14 <em>T14</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T14</em>'.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression#getT14()
   * @see #getTypePrimaryExpression()
   * @generated
   */
  EReference getTypePrimaryExpression_T14();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall <em>Type Name Or Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Name Or Function Call</em>'.
   * @see com.euclideanspace.spad.editor.TypeNameOrFunctionCall
   * @generated
   */
  EClass getTypeNameOrFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getTfnname <em>Tfnname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfnname</em>'.
   * @see com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getTfnname()
   * @see #getTypeNameOrFunctionCall()
   * @generated
   */
  EAttribute getTypeNameOrFunctionCall_Tfnname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT4 <em>T4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T4</em>'.
   * @see com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT4()
   * @see #getTypeNameOrFunctionCall()
   * @generated
   */
  EReference getTypeNameOrFunctionCall_T4();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT25 <em>T25</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T25</em>'.
   * @see com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT25()
   * @see #getTypeNameOrFunctionCall()
   * @generated
   */
  EReference getTypeNameOrFunctionCall_T25();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT6 <em>T6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T6</em>'.
   * @see com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT6()
   * @see #getTypeNameOrFunctionCall()
   * @generated
   */
  EReference getTypeNameOrFunctionCall_T6();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.TypeLiteral <em>Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Literal</em>'.
   * @see com.euclideanspace.spad.editor.TypeLiteral
   * @generated
   */
  EClass getTypeLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeLiteral#getT1 <em>T1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T1</em>'.
   * @see com.euclideanspace.spad.editor.TypeLiteral#getT1()
   * @see #getTypeLiteral()
   * @generated
   */
  EAttribute getTypeLiteral_T1();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.TypeLiteral#getT22 <em>T22</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T22</em>'.
   * @see com.euclideanspace.spad.editor.TypeLiteral#getT22()
   * @see #getTypeLiteral()
   * @generated
   */
  EAttribute getTypeLiteral_T22();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeLiteral#getT34 <em>T34</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T34</em>'.
   * @see com.euclideanspace.spad.editor.TypeLiteral#getT34()
   * @see #getTypeLiteral()
   * @generated
   */
  EReference getTypeLiteral_T34();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.TypeLiteral#getT35 <em>T35</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T35</em>'.
   * @see com.euclideanspace.spad.editor.TypeLiteral#getT35()
   * @see #getTypeLiteral()
   * @generated
   */
  EReference getTypeLiteral_T35();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see com.euclideanspace.spad.editor.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS1 <em>S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S1</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS1()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS3 <em>S3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S3</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS3()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S3();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS4 <em>S4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S4</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS4()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S4();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS5 <em>S5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S5</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS5()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S5();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS6 <em>S6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S6</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS6()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S6();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS7 <em>S7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S7</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS7()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S7();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS8 <em>S8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S8</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS8()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S8();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS9 <em>S9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S9</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS9()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S9();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Statement#getS10 <em>S10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S10</em>'.
   * @see com.euclideanspace.spad.editor.Statement#getS10()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_S10();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see com.euclideanspace.spad.editor.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.Block#getStname <em>Stname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stname</em>'.
   * @see com.euclideanspace.spad.editor.Block#getStname()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Stname();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.Block#getStatemBl <em>Statem Bl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statem Bl</em>'.
   * @see com.euclideanspace.spad.editor.Block#getStatemBl()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_StatemBl();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.StatementExpression <em>Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Expression</em>'.
   * @see com.euclideanspace.spad.editor.StatementExpression
   * @generated
   */
  EClass getStatementExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.StatementExpression#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see com.euclideanspace.spad.editor.StatementExpression#getT()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_T();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.StatementExpression#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.StatementExpression#getT2()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_T2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.StatementExpression#getT3 <em>T3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T3</em>'.
   * @see com.euclideanspace.spad.editor.StatementExpression#getT3()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_T3();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.StatementExpression#getT4 <em>T4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T4</em>'.
   * @see com.euclideanspace.spad.editor.StatementExpression#getT4()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_T4();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see com.euclideanspace.spad.editor.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.ForStatement#getStname <em>Stname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stname</em>'.
   * @see com.euclideanspace.spad.editor.ForStatement#getStname()
   * @see #getForStatement()
   * @generated
   */
  EAttribute getForStatement_Stname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ForStatement#getT1 <em>T1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T1</em>'.
   * @see com.euclideanspace.spad.editor.ForStatement#getT1()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_T1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ForStatement#getS1 <em>S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S1</em>'.
   * @see com.euclideanspace.spad.editor.ForStatement#getS1()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_S1();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see com.euclideanspace.spad.editor.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.WhileStatement#getStname <em>Stname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stname</em>'.
   * @see com.euclideanspace.spad.editor.WhileStatement#getStname()
   * @see #getWhileStatement()
   * @generated
   */
  EAttribute getWhileStatement_Stname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.WhileStatement#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.WhileStatement#getT2()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_T2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.WhileStatement#getS1 <em>S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S1</em>'.
   * @see com.euclideanspace.spad.editor.WhileStatement#getS1()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_S1();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see com.euclideanspace.spad.editor.DoStatement
   * @generated
   */
  EClass getDoStatement();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.DoStatement#getStname <em>Stname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stname</em>'.
   * @see com.euclideanspace.spad.editor.DoStatement#getStname()
   * @see #getDoStatement()
   * @generated
   */
  EAttribute getDoStatement_Stname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.DoStatement#getS1 <em>S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S1</em>'.
   * @see com.euclideanspace.spad.editor.DoStatement#getS1()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_S1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.DoStatement#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.DoStatement#getT2()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_T2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.IterateStatement <em>Iterate Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iterate Statement</em>'.
   * @see com.euclideanspace.spad.editor.IterateStatement
   * @generated
   */
  EClass getIterateStatement();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.IterateStatement#getStname <em>Stname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stname</em>'.
   * @see com.euclideanspace.spad.editor.IterateStatement#getStname()
   * @see #getIterateStatement()
   * @generated
   */
  EAttribute getIterateStatement_Stname();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Statement</em>'.
   * @see com.euclideanspace.spad.editor.BreakStatement
   * @generated
   */
  EClass getBreakStatement();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.BreakStatement#getStname <em>Stname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stname</em>'.
   * @see com.euclideanspace.spad.editor.BreakStatement#getStname()
   * @see #getBreakStatement()
   * @generated
   */
  EAttribute getBreakStatement_Stname();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see com.euclideanspace.spad.editor.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.ReturnStatement#getStname <em>Stname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stname</em>'.
   * @see com.euclideanspace.spad.editor.ReturnStatement#getStname()
   * @see #getReturnStatement()
   * @generated
   */
  EAttribute getReturnStatement_Stname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ReturnStatement#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.ReturnStatement#getT2()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_T2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see com.euclideanspace.spad.editor.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.IfStatement#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.IfStatement#getT2()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_T2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.IfStatement#getS1 <em>S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S1</em>'.
   * @see com.euclideanspace.spad.editor.IfStatement#getS1()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_S1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.IfStatement#getS2 <em>S2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S2</em>'.
   * @see com.euclideanspace.spad.editor.IfStatement#getS2()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_S2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see com.euclideanspace.spad.editor.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.PredicatePrimary <em>Predicate Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Primary</em>'.
   * @see com.euclideanspace.spad.editor.PredicatePrimary
   * @generated
   */
  EClass getPredicatePrimary();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PredicatePrimary#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see com.euclideanspace.spad.editor.PredicatePrimary#getT()
   * @see #getPredicatePrimary()
   * @generated
   */
  EReference getPredicatePrimary_T();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PredicatePrimary#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.PredicatePrimary#getT2()
   * @see #getPredicatePrimary()
   * @generated
   */
  EReference getPredicatePrimary_T2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see com.euclideanspace.spad.editor.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.Expr#getIfname <em>Ifname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ifname</em>'.
   * @see com.euclideanspace.spad.editor.Expr#getIfname()
   * @see #getExpr()
   * @generated
   */
  EAttribute getExpr_Ifname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Expr#getIfpred <em>Ifpred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifpred</em>'.
   * @see com.euclideanspace.spad.editor.Expr#getIfpred()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Ifpred();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Expr#getThenexp <em>Thenexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Thenexp</em>'.
   * @see com.euclideanspace.spad.editor.Expr#getThenexp()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Thenexp();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.Expr#getElseexp <em>Elseexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elseexp</em>'.
   * @see com.euclideanspace.spad.editor.Expr#getElseexp()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Elseexp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.MapDefinition <em>Map Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Definition</em>'.
   * @see com.euclideanspace.spad.editor.MapDefinition
   * @generated
   */
  EClass getMapDefinition();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.MapDefinition#getFnSig <em>Fn Sig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fn Sig</em>'.
   * @see com.euclideanspace.spad.editor.MapDefinition#getFnSig()
   * @see #getMapDefinition()
   * @generated
   */
  EReference getMapDefinition_FnSig();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.MapDefinition#getPar4 <em>Par4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Par4</em>'.
   * @see com.euclideanspace.spad.editor.MapDefinition#getPar4()
   * @see #getMapDefinition()
   * @generated
   */
  EReference getMapDefinition_Par4();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.MapDefinition#getPar5 <em>Par5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Par5</em>'.
   * @see com.euclideanspace.spad.editor.MapDefinition#getPar5()
   * @see #getMapDefinition()
   * @generated
   */
  EReference getMapDefinition_Par5();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.PrimaryPrefix <em>Primary Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Prefix</em>'.
   * @see com.euclideanspace.spad.editor.PrimaryPrefix
   * @generated
   */
  EClass getPrimaryPrefix();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PrimaryPrefix#getT4 <em>T4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T4</em>'.
   * @see com.euclideanspace.spad.editor.PrimaryPrefix#getT4()
   * @see #getPrimaryPrefix()
   * @generated
   */
  EReference getPrimaryPrefix_T4();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PrimaryPrefix#getT7 <em>T7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T7</em>'.
   * @see com.euclideanspace.spad.editor.PrimaryPrefix#getT7()
   * @see #getPrimaryPrefix()
   * @generated
   */
  EReference getPrimaryPrefix_T7();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.NameOrFunctionCall <em>Name Or Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Or Function Call</em>'.
   * @see com.euclideanspace.spad.editor.NameOrFunctionCall
   * @generated
   */
  EClass getNameOrFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.NameOrFunctionCall#getFnname <em>Fnname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fnname</em>'.
   * @see com.euclideanspace.spad.editor.NameOrFunctionCall#getFnname()
   * @see #getNameOrFunctionCall()
   * @generated
   */
  EAttribute getNameOrFunctionCall_Fnname();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.NameOrFunctionCall#getLsp <em>Lsp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lsp</em>'.
   * @see com.euclideanspace.spad.editor.NameOrFunctionCall#getLsp()
   * @see #getNameOrFunctionCall()
   * @generated
   */
  EAttribute getNameOrFunctionCall_Lsp();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.NameOrFunctionCall#getT4 <em>T4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T4</em>'.
   * @see com.euclideanspace.spad.editor.NameOrFunctionCall#getT4()
   * @see #getNameOrFunctionCall()
   * @generated
   */
  EReference getNameOrFunctionCall_T4();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.NameOrFunctionCall#getT5 <em>T5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T5</em>'.
   * @see com.euclideanspace.spad.editor.NameOrFunctionCall#getT5()
   * @see #getNameOrFunctionCall()
   * @generated
   */
  EReference getNameOrFunctionCall_T5();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.NameOrFunctionCall#getT6 <em>T6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T6</em>'.
   * @see com.euclideanspace.spad.editor.NameOrFunctionCall#getT6()
   * @see #getNameOrFunctionCall()
   * @generated
   */
  EReference getNameOrFunctionCall_T6();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see com.euclideanspace.spad.editor.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.Literal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.euclideanspace.spad.editor.Literal#getValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Value();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.Literal#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.Literal#getT2()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_T2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.CharacterLiteral <em>Character Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Character Literal</em>'.
   * @see com.euclideanspace.spad.editor.CharacterLiteral
   * @generated
   */
  EClass getCharacterLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.CharacterLiteral#getC1 <em>C1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>C1</em>'.
   * @see com.euclideanspace.spad.editor.CharacterLiteral#getC1()
   * @see #getCharacterLiteral()
   * @generated
   */
  EAttribute getCharacterLiteral_C1();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see com.euclideanspace.spad.editor.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.BooleanLiteral#getLitname <em>Litname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Litname</em>'.
   * @see com.euclideanspace.spad.editor.BooleanLiteral#getLitname()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Litname();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.ListLiteral <em>List Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Literal</em>'.
   * @see com.euclideanspace.spad.editor.ListLiteral
   * @generated
   */
  EClass getListLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.ListLiteral#getLitname <em>Litname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Litname</em>'.
   * @see com.euclideanspace.spad.editor.ListLiteral#getLitname()
   * @see #getListLiteral()
   * @generated
   */
  EAttribute getListLiteral_Litname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ListLiteral#getL2 <em>L2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L2</em>'.
   * @see com.euclideanspace.spad.editor.ListLiteral#getL2()
   * @see #getListLiteral()
   * @generated
   */
  EReference getListLiteral_L2();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.ListLiteral#getT3 <em>T3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T3</em>'.
   * @see com.euclideanspace.spad.editor.ListLiteral#getT3()
   * @see #getListLiteral()
   * @generated
   */
  EReference getListLiteral_T3();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.ListLiteral#getT14 <em>T14</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T14</em>'.
   * @see com.euclideanspace.spad.editor.ListLiteral#getT14()
   * @see #getListLiteral()
   * @generated
   */
  EReference getListLiteral_T14();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.spad.editor.ListLiteral#getL5 <em>L5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>L5</em>'.
   * @see com.euclideanspace.spad.editor.ListLiteral#getL5()
   * @see #getListLiteral()
   * @generated
   */
  EReference getListLiteral_L5();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.PredicateOr <em>Predicate Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Or</em>'.
   * @see com.euclideanspace.spad.editor.PredicateOr
   * @generated
   */
  EClass getPredicateOr();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PredicateOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.PredicateOr#getLeft()
   * @see #getPredicateOr()
   * @generated
   */
  EReference getPredicateOr_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PredicateOr#getPrname <em>Prname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prname</em>'.
   * @see com.euclideanspace.spad.editor.PredicateOr#getPrname()
   * @see #getPredicateOr()
   * @generated
   */
  EAttribute getPredicateOr_Prname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PredicateOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.PredicateOr#getRight()
   * @see #getPredicateOr()
   * @generated
   */
  EReference getPredicateOr_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.PredicateAnd <em>Predicate And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate And</em>'.
   * @see com.euclideanspace.spad.editor.PredicateAnd
   * @generated
   */
  EClass getPredicateAnd();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PredicateAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.PredicateAnd#getLeft()
   * @see #getPredicateAnd()
   * @generated
   */
  EReference getPredicateAnd_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PredicateAnd#getPrname <em>Prname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prname</em>'.
   * @see com.euclideanspace.spad.editor.PredicateAnd#getPrname()
   * @see #getPredicateAnd()
   * @generated
   */
  EAttribute getPredicateAnd_Prname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PredicateAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.PredicateAnd#getRight()
   * @see #getPredicateAnd()
   * @generated
   */
  EReference getPredicateAnd_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.PredicateNot <em>Predicate Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Not</em>'.
   * @see com.euclideanspace.spad.editor.PredicateNot
   * @generated
   */
  EClass getPredicateNot();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PredicateNot#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.spad.editor.PredicateNot#getT2()
   * @see #getPredicateNot()
   * @generated
   */
  EReference getPredicateNot_T2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.ConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Expression</em>'.
   * @see com.euclideanspace.spad.editor.ConditionExpression
   * @generated
   */
  EClass getConditionExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ConditionExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.ConditionExpression#getLeft()
   * @see #getConditionExpression()
   * @generated
   */
  EReference getConditionExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.ConditionExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.ConditionExpression#getOp()
   * @see #getConditionExpression()
   * @generated
   */
  EAttribute getConditionExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ConditionExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.ConditionExpression#getRight()
   * @see #getConditionExpression()
   * @generated
   */
  EReference getConditionExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.InnerProdExpression <em>Inner Prod Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner Prod Expression</em>'.
   * @see com.euclideanspace.spad.editor.InnerProdExpression
   * @generated
   */
  EClass getInnerProdExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.InnerProdExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.InnerProdExpression#getLeft()
   * @see #getInnerProdExpression()
   * @generated
   */
  EReference getInnerProdExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.InnerProdExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.InnerProdExpression#getOp()
   * @see #getInnerProdExpression()
   * @generated
   */
  EAttribute getInnerProdExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.InnerProdExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.InnerProdExpression#getRight()
   * @see #getInnerProdExpression()
   * @generated
   */
  EReference getInnerProdExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.OuterProdExpression <em>Outer Prod Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outer Prod Expression</em>'.
   * @see com.euclideanspace.spad.editor.OuterProdExpression
   * @generated
   */
  EClass getOuterProdExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.OuterProdExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.OuterProdExpression#getLeft()
   * @see #getOuterProdExpression()
   * @generated
   */
  EReference getOuterProdExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.OuterProdExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.OuterProdExpression#getOp()
   * @see #getOuterProdExpression()
   * @generated
   */
  EAttribute getOuterProdExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.OuterProdExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.OuterProdExpression#getRight()
   * @see #getOuterProdExpression()
   * @generated
   */
  EReference getOuterProdExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.HasExpression <em>Has Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Expression</em>'.
   * @see com.euclideanspace.spad.editor.HasExpression
   * @generated
   */
  EClass getHasExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.HasExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.HasExpression#getLeft()
   * @see #getHasExpression()
   * @generated
   */
  EReference getHasExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.HasExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.HasExpression#getOp()
   * @see #getHasExpression()
   * @generated
   */
  EAttribute getHasExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.HasExpression#getRightType <em>Right Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Type</em>'.
   * @see com.euclideanspace.spad.editor.HasExpression#getRightType()
   * @see #getHasExpression()
   * @generated
   */
  EReference getHasExpression_RightType();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Expression</em>'.
   * @see com.euclideanspace.spad.editor.CaseExpression
   * @generated
   */
  EClass getCaseExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.CaseExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.CaseExpression#getLeft()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.CaseExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.CaseExpression#getOp()
   * @see #getCaseExpression()
   * @generated
   */
  EAttribute getCaseExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.CaseExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.CaseExpression#getRight()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see com.euclideanspace.spad.editor.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.EqualityExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.EqualityExpression#getLeft()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.EqualityExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.EqualityExpression#getOp()
   * @see #getEqualityExpression()
   * @generated
   */
  EAttribute getEqualityExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.EqualityExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.EqualityExpression#getRight()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Expression</em>'.
   * @see com.euclideanspace.spad.editor.RelationalExpression
   * @generated
   */
  EClass getRelationalExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.RelationalExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.RelationalExpression#getLeft()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.RelationalExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.RelationalExpression#getOp()
   * @see #getRelationalExpression()
   * @generated
   */
  EAttribute getRelationalExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.RelationalExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.RelationalExpression#getRight()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.IsExpression <em>Is Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Expression</em>'.
   * @see com.euclideanspace.spad.editor.IsExpression
   * @generated
   */
  EClass getIsExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.IsExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.IsExpression#getLeft()
   * @see #getIsExpression()
   * @generated
   */
  EReference getIsExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.IsExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.IsExpression#getOp()
   * @see #getIsExpression()
   * @generated
   */
  EAttribute getIsExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.IsExpression#getRightType <em>Right Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Type</em>'.
   * @see com.euclideanspace.spad.editor.IsExpression#getRightType()
   * @see #getIsExpression()
   * @generated
   */
  EReference getIsExpression_RightType();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.SegmentExpression <em>Segment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Segment Expression</em>'.
   * @see com.euclideanspace.spad.editor.SegmentExpression
   * @generated
   */
  EClass getSegmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.SegmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.SegmentExpression#getLeft()
   * @see #getSegmentExpression()
   * @generated
   */
  EReference getSegmentExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.SegmentExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.SegmentExpression#getOp()
   * @see #getSegmentExpression()
   * @generated
   */
  EAttribute getSegmentExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.SegmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.SegmentExpression#getRight()
   * @see #getSegmentExpression()
   * @generated
   */
  EReference getSegmentExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see com.euclideanspace.spad.editor.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.AdditiveExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.AdditiveExpression#getLeft()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.AdditiveExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.AdditiveExpression#getOp()
   * @see #getAdditiveExpression()
   * @generated
   */
  EAttribute getAdditiveExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.AdditiveExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.AdditiveExpression#getRight()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.ExquoExpression <em>Exquo Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exquo Expression</em>'.
   * @see com.euclideanspace.spad.editor.ExquoExpression
   * @generated
   */
  EClass getExquoExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ExquoExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.ExquoExpression#getLeft()
   * @see #getExquoExpression()
   * @generated
   */
  EReference getExquoExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.ExquoExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.ExquoExpression#getOp()
   * @see #getExquoExpression()
   * @generated
   */
  EAttribute getExquoExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ExquoExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.ExquoExpression#getRight()
   * @see #getExquoExpression()
   * @generated
   */
  EReference getExquoExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.DivisionExpression <em>Division Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division Expression</em>'.
   * @see com.euclideanspace.spad.editor.DivisionExpression
   * @generated
   */
  EClass getDivisionExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.DivisionExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.DivisionExpression#getLeft()
   * @see #getDivisionExpression()
   * @generated
   */
  EReference getDivisionExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.DivisionExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.DivisionExpression#getOp()
   * @see #getDivisionExpression()
   * @generated
   */
  EAttribute getDivisionExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.DivisionExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.DivisionExpression#getRight()
   * @see #getDivisionExpression()
   * @generated
   */
  EReference getDivisionExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.QuoExpression <em>Quo Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quo Expression</em>'.
   * @see com.euclideanspace.spad.editor.QuoExpression
   * @generated
   */
  EClass getQuoExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.QuoExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.QuoExpression#getLeft()
   * @see #getQuoExpression()
   * @generated
   */
  EReference getQuoExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.QuoExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.QuoExpression#getOp()
   * @see #getQuoExpression()
   * @generated
   */
  EAttribute getQuoExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.QuoExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.QuoExpression#getRight()
   * @see #getQuoExpression()
   * @generated
   */
  EReference getQuoExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.ModExpression <em>Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Expression</em>'.
   * @see com.euclideanspace.spad.editor.ModExpression
   * @generated
   */
  EClass getModExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ModExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.ModExpression#getLeft()
   * @see #getModExpression()
   * @generated
   */
  EReference getModExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.ModExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.ModExpression#getOp()
   * @see #getModExpression()
   * @generated
   */
  EAttribute getModExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ModExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.ModExpression#getRight()
   * @see #getModExpression()
   * @generated
   */
  EReference getModExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.RemExpression <em>Rem Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rem Expression</em>'.
   * @see com.euclideanspace.spad.editor.RemExpression
   * @generated
   */
  EClass getRemExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.RemExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.RemExpression#getLeft()
   * @see #getRemExpression()
   * @generated
   */
  EReference getRemExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.RemExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.RemExpression#getOp()
   * @see #getRemExpression()
   * @generated
   */
  EAttribute getRemExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.RemExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.RemExpression#getRight()
   * @see #getRemExpression()
   * @generated
   */
  EReference getRemExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see com.euclideanspace.spad.editor.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.MultiplicativeExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.MultiplicativeExpression#getLeft()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.MultiplicativeExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.MultiplicativeExpression#getOp()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EAttribute getMultiplicativeExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.MultiplicativeExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.MultiplicativeExpression#getRight()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.ExponentExpression <em>Exponent Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exponent Expression</em>'.
   * @see com.euclideanspace.spad.editor.ExponentExpression
   * @generated
   */
  EClass getExponentExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ExponentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.ExponentExpression#getLeft()
   * @see #getExponentExpression()
   * @generated
   */
  EReference getExponentExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.ExponentExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.ExponentExpression#getOp()
   * @see #getExponentExpression()
   * @generated
   */
  EAttribute getExponentExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ExponentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.ExponentExpression#getRight()
   * @see #getExponentExpression()
   * @generated
   */
  EReference getExponentExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.PretendExpression <em>Pretend Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pretend Expression</em>'.
   * @see com.euclideanspace.spad.editor.PretendExpression
   * @generated
   */
  EClass getPretendExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PretendExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.PretendExpression#getLeft()
   * @see #getPretendExpression()
   * @generated
   */
  EReference getPretendExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.PretendExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.PretendExpression#getOp()
   * @see #getPretendExpression()
   * @generated
   */
  EAttribute getPretendExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.PretendExpression#getRightType <em>Right Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Type</em>'.
   * @see com.euclideanspace.spad.editor.PretendExpression#getRightType()
   * @see #getPretendExpression()
   * @generated
   */
  EReference getPretendExpression_RightType();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.HintTypeExpression <em>Hint Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hint Type Expression</em>'.
   * @see com.euclideanspace.spad.editor.HintTypeExpression
   * @generated
   */
  EClass getHintTypeExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.HintTypeExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.HintTypeExpression#getLeft()
   * @see #getHintTypeExpression()
   * @generated
   */
  EReference getHintTypeExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.HintTypeExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.HintTypeExpression#getOp()
   * @see #getHintTypeExpression()
   * @generated
   */
  EAttribute getHintTypeExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.HintTypeExpression#getRightType <em>Right Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Type</em>'.
   * @see com.euclideanspace.spad.editor.HintTypeExpression#getRightType()
   * @see #getHintTypeExpression()
   * @generated
   */
  EReference getHintTypeExpression_RightType();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.CoerceExpression <em>Coerce Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Coerce Expression</em>'.
   * @see com.euclideanspace.spad.editor.CoerceExpression
   * @generated
   */
  EClass getCoerceExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.CoerceExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.CoerceExpression#getLeft()
   * @see #getCoerceExpression()
   * @generated
   */
  EReference getCoerceExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.CoerceExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.CoerceExpression#getOp()
   * @see #getCoerceExpression()
   * @generated
   */
  EAttribute getCoerceExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.CoerceExpression#getRightType <em>Right Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Type</em>'.
   * @see com.euclideanspace.spad.editor.CoerceExpression#getRightType()
   * @see #getCoerceExpression()
   * @generated
   */
  EReference getCoerceExpression_RightType();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.EltExpression <em>Elt Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elt Expression</em>'.
   * @see com.euclideanspace.spad.editor.EltExpression
   * @generated
   */
  EClass getEltExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.EltExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.EltExpression#getLeft()
   * @see #getEltExpression()
   * @generated
   */
  EReference getEltExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.EltExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.EltExpression#getOp()
   * @see #getEltExpression()
   * @generated
   */
  EAttribute getEltExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.EltExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.spad.editor.EltExpression#getRight()
   * @see #getEltExpression()
   * @generated
   */
  EReference getEltExpression_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.ExplicitTypeExpression <em>Explicit Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Type Expression</em>'.
   * @see com.euclideanspace.spad.editor.ExplicitTypeExpression
   * @generated
   */
  EClass getExplicitTypeExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ExplicitTypeExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.spad.editor.ExplicitTypeExpression#getLeft()
   * @see #getExplicitTypeExpression()
   * @generated
   */
  EReference getExplicitTypeExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.ExplicitTypeExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.spad.editor.ExplicitTypeExpression#getOp()
   * @see #getExplicitTypeExpression()
   * @generated
   */
  EAttribute getExplicitTypeExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.ExplicitTypeExpression#getRightType <em>Right Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Type</em>'.
   * @see com.euclideanspace.spad.editor.ExplicitTypeExpression#getRightType()
   * @see #getExplicitTypeExpression()
   * @generated
   */
  EReference getExplicitTypeExpression_RightType();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.spad.editor.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see com.euclideanspace.spad.editor.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.spad.editor.UnaryExpression#getUop <em>Uop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uop</em>'.
   * @see com.euclideanspace.spad.editor.UnaryExpression#getUop()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Uop();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.spad.editor.UnaryExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.euclideanspace.spad.editor.UnaryExpression#getExpr()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Expr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EditorFactory getEditorFactory();

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
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ModelImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__C = eINSTANCE.getModel_C();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__P = eINSTANCE.getModel_P();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__D = eINSTANCE.getModel_D();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl <em>Category Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.CategoryDefImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getCategoryDef()
     * @generated
     */
    EClass CATEGORY_DEF = eINSTANCE.getCategoryDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY_DEF__NAME = eINSTANCE.getCategoryDef_Name();

    /**
     * The meta object literal for the '<em><b>Shortname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY_DEF__SHORTNAME = eINSTANCE.getCategoryDef_Shortname();

    /**
     * The meta object literal for the '<em><b>Longname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY_DEF__LONGNAME = eINSTANCE.getCategoryDef_Longname();

    /**
     * The meta object literal for the '<em><b>Longname2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY_DEF__LONGNAME2 = eINSTANCE.getCategoryDef_Longname2();

    /**
     * The meta object literal for the '<em><b>Cp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY_DEF__CP = eINSTANCE.getCategoryDef_Cp();

    /**
     * The meta object literal for the '<em><b>Impl Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY_DEF__IMPL_NAME = eINSTANCE.getCategoryDef_ImplName();

    /**
     * The meta object literal for the '<em><b>Wh</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY_DEF__WH = eINSTANCE.getCategoryDef_Wh();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.PackageDefImpl <em>Package Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.PackageDefImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPackageDef()
     * @generated
     */
    EClass PACKAGE_DEF = eINSTANCE.getPackageDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DEF__NAME = eINSTANCE.getPackageDef_Name();

    /**
     * The meta object literal for the '<em><b>Shortname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DEF__SHORTNAME = eINSTANCE.getPackageDef_Shortname();

    /**
     * The meta object literal for the '<em><b>Longname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DEF__LONGNAME = eINSTANCE.getPackageDef_Longname();

    /**
     * The meta object literal for the '<em><b>Longname2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DEF__LONGNAME2 = eINSTANCE.getPackageDef_Longname2();

    /**
     * The meta object literal for the '<em><b>Cp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DEF__CP = eINSTANCE.getPackageDef_Cp();

    /**
     * The meta object literal for the '<em><b>Export Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DEF__EXPORT_NAME = eINSTANCE.getPackageDef_ExportName();

    /**
     * The meta object literal for the '<em><b>Impl Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DEF__IMPL_NAME = eINSTANCE.getPackageDef_ImplName();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DEF__W = eINSTANCE.getPackageDef_W();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.DomainDefImpl <em>Domain Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.DomainDefImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getDomainDef()
     * @generated
     */
    EClass DOMAIN_DEF = eINSTANCE.getDomainDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_DEF__NAME = eINSTANCE.getDomainDef_Name();

    /**
     * The meta object literal for the '<em><b>Shortname5</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_DEF__SHORTNAME5 = eINSTANCE.getDomainDef_Shortname5();

    /**
     * The meta object literal for the '<em><b>Longname5</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_DEF__LONGNAME5 = eINSTANCE.getDomainDef_Longname5();

    /**
     * The meta object literal for the '<em><b>Longname6</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_DEF__LONGNAME6 = eINSTANCE.getDomainDef_Longname6();

    /**
     * The meta object literal for the '<em><b>Cp5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_DEF__CP5 = eINSTANCE.getDomainDef_Cp5();

    /**
     * The meta object literal for the '<em><b>Export Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_DEF__EXPORT_NAME = eINSTANCE.getDomainDef_ExportName();

    /**
     * The meta object literal for the '<em><b>Impl Name5</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_DEF__IMPL_NAME5 = eINSTANCE.getDomainDef_ImplName5();

    /**
     * The meta object literal for the '<em><b>Wh5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_DEF__WH5 = eINSTANCE.getDomainDef_Wh5();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.WherePartImpl <em>Where Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.WherePartImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getWherePart()
     * @generated
     */
    EClass WHERE_PART = eINSTANCE.getWherePart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE_PART__NAME = eINSTANCE.getWherePart_Name();

    /**
     * The meta object literal for the '<em><b>Where Assig</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_PART__WHERE_ASSIG = eINSTANCE.getWherePart_WhereAssig();

    /**
     * The meta object literal for the '<em><b>Longname8</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE_PART__LONGNAME8 = eINSTANCE.getWherePart_Longname8();

    /**
     * The meta object literal for the '<em><b>Imp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_PART__IMP = eINSTANCE.getWherePart_Imp();

    /**
     * The meta object literal for the '<em><b>W8</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_PART__W8 = eINSTANCE.getWherePart_W8();

    /**
     * The meta object literal for the '<em><b>Longname9</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE_PART__LONGNAME9 = eINSTANCE.getWherePart_Longname9();

    /**
     * The meta object literal for the '<em><b>Add</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_PART__ADD = eINSTANCE.getWherePart_Add();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.WhereAssignmentsImpl <em>Where Assignments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.WhereAssignmentsImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getWhereAssignments()
     * @generated
     */
    EClass WHERE_ASSIGNMENTS = eINSTANCE.getWhereAssignments();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.WithPartImpl <em>With Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.WithPartImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getWithPart()
     * @generated
     */
    EClass WITH_PART = eINSTANCE.getWithPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WITH_PART__NAME = eINSTANCE.getWithPart_Name();

    /**
     * The meta object literal for the '<em><b>Fundec</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_PART__FUNDEC = eINSTANCE.getWithPart_Fundec();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.AddPartImpl <em>Add Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.AddPartImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getAddPart()
     * @generated
     */
    EClass ADD_PART = eINSTANCE.getAddPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_PART__NAME = eINSTANCE.getAddPart_Name();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_PART__T = eINSTANCE.getAddPart_T();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.AddStatementsImpl <em>Add Statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.AddStatementsImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getAddStatements()
     * @generated
     */
    EClass ADD_STATEMENTS = eINSTANCE.getAddStatements();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.FunctionDefinitionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getFunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl <em>Function Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.FunctionSignatureImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getFunctionSignature()
     * @generated
     */
    EClass FUNCTION_SIGNATURE = eINSTANCE.getFunctionSignature();

    /**
     * The meta object literal for the '<em><b>Par4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_SIGNATURE__PAR4 = eINSTANCE.getFunctionSignature_Par4();

    /**
     * The meta object literal for the '<em><b>Par5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_SIGNATURE__PAR5 = eINSTANCE.getFunctionSignature_Par5();

    /**
     * The meta object literal for the '<em><b>Fn Nam</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_SIGNATURE__FN_NAM = eINSTANCE.getFunctionSignature_FnNam();

    /**
     * The meta object literal for the '<em><b>Par2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_SIGNATURE__PAR2 = eINSTANCE.getFunctionSignature_Par2();

    /**
     * The meta object literal for the '<em><b>Par3</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_SIGNATURE__PAR3 = eINSTANCE.getFunctionSignature_Par3();

    /**
     * The meta object literal for the '<em><b>T4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_SIGNATURE__T4 = eINSTANCE.getFunctionSignature_T4();

    /**
     * The meta object literal for the '<em><b>B1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_SIGNATURE__B1 = eINSTANCE.getFunctionSignature_B1();

    /**
     * The meta object literal for the '<em><b>T5</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_SIGNATURE__T5 = eINSTANCE.getFunctionSignature_T5();

    /**
     * The meta object literal for the '<em><b>B2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_SIGNATURE__B2 = eINSTANCE.getFunctionSignature_B2();

    /**
     * The meta object literal for the '<em><b>T6</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_SIGNATURE__T6 = eINSTANCE.getFunctionSignature_T6();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.MacroDefImpl <em>Macro Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.MacroDefImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getMacroDef()
     * @generated
     */
    EClass MACRO_DEF = eINSTANCE.getMacroDef();

    /**
     * The meta object literal for the '<em><b>Macroname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MACRO_DEF__MACRONAME = eINSTANCE.getMacroDef_Macroname();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ImportImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Impname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPNAME = eINSTANCE.getImport_Impname();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.VariableDeclarationImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__VAR_NAME = eINSTANCE.getVariableDeclaration_VarName();

    /**
     * The meta object literal for the '<em><b>Typ</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYP = eINSTANCE.getVariableDeclaration_Typ();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.VariableDeclarationAssignImpl <em>Variable Declaration Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.VariableDeclarationAssignImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getVariableDeclarationAssign()
     * @generated
     */
    EClass VARIABLE_DECLARATION_ASSIGN = eINSTANCE.getVariableDeclarationAssign();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION_ASSIGN__VAR_NAME = eINSTANCE.getVariableDeclarationAssign_VarName();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION_ASSIGN__T2 = eINSTANCE.getVariableDeclarationAssign_T2();

    /**
     * The meta object literal for the '<em><b>Typ</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION_ASSIGN__TYP = eINSTANCE.getVariableDeclarationAssign_Typ();

    /**
     * The meta object literal for the '<em><b>T4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION_ASSIGN__T4 = eINSTANCE.getVariableDeclarationAssign_T4();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.FreeVariableImpl <em>Free Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.FreeVariableImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getFreeVariable()
     * @generated
     */
    EClass FREE_VARIABLE = eINSTANCE.getFreeVariable();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FREE_VARIABLE__VAR = eINSTANCE.getFreeVariable_Var();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.LocalVariableImpl <em>Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.LocalVariableImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getLocalVariable()
     * @generated
     */
    EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VARIABLE__VAR = eINSTANCE.getLocalVariable_Var();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.TypeExpressionImpl <em>Type Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.TypeExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeExpression()
     * @generated
     */
    EClass TYPE_EXPRESSION = eINSTANCE.getTypeExpression();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__T2 = eINSTANCE.getTypeExpression_T2();

    /**
     * The meta object literal for the '<em><b>T3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__T3 = eINSTANCE.getTypeExpression_T3();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.TypeParameterListImpl <em>Type Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.TypeParameterListImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeParameterList()
     * @generated
     */
    EClass TYPE_PARAMETER_LIST = eINSTANCE.getTypeParameterList();

    /**
     * The meta object literal for the '<em><b>Tyname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_PARAMETER_LIST__TYNAME = eINSTANCE.getTypeParameterList_Tyname();

    /**
     * The meta object literal for the '<em><b>Par</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_PARAMETER_LIST__PAR = eINSTANCE.getTypeParameterList_Par();

    /**
     * The meta object literal for the '<em><b>Par2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_PARAMETER_LIST__PAR2 = eINSTANCE.getTypeParameterList_Par2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.TypeArgumentsImpl <em>Type Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.TypeArgumentsImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeArguments()
     * @generated
     */
    EClass TYPE_ARGUMENTS = eINSTANCE.getTypeArguments();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T = eINSTANCE.getTypeArguments_T();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ARGUMENTS__T2 = eINSTANCE.getTypeArguments_T2();

    /**
     * The meta object literal for the '<em><b>T3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ARGUMENTS__T3 = eINSTANCE.getTypeArguments_T3();

    /**
     * The meta object literal for the '<em><b>B1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ARGUMENTS__B1 = eINSTANCE.getTypeArguments_B1();

    /**
     * The meta object literal for the '<em><b>T4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T4 = eINSTANCE.getTypeArguments_T4();

    /**
     * The meta object literal for the '<em><b>T16</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T16 = eINSTANCE.getTypeArguments_T16();

    /**
     * The meta object literal for the '<em><b>T5</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ARGUMENTS__T5 = eINSTANCE.getTypeArguments_T5();

    /**
     * The meta object literal for the '<em><b>T6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T6 = eINSTANCE.getTypeArguments_T6();

    /**
     * The meta object literal for the '<em><b>T7</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T7 = eINSTANCE.getTypeArguments_T7();

    /**
     * The meta object literal for the '<em><b>T8</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ARGUMENTS__T8 = eINSTANCE.getTypeArguments_T8();

    /**
     * The meta object literal for the '<em><b>T9</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T9 = eINSTANCE.getTypeArguments_T9();

    /**
     * The meta object literal for the '<em><b>T10</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T10 = eINSTANCE.getTypeArguments_T10();

    /**
     * The meta object literal for the '<em><b>T11</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ARGUMENTS__T11 = eINSTANCE.getTypeArguments_T11();

    /**
     * The meta object literal for the '<em><b>T12</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T12 = eINSTANCE.getTypeArguments_T12();

    /**
     * The meta object literal for the '<em><b>T13</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T13 = eINSTANCE.getTypeArguments_T13();

    /**
     * The meta object literal for the '<em><b>T15</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTS__T15 = eINSTANCE.getTypeArguments_T15();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.TypeResultImpl <em>Type Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.TypeResultImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeResult()
     * @generated
     */
    EClass TYPE_RESULT = eINSTANCE.getTypeResult();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RESULT__T = eINSTANCE.getTypeResult_T();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_RESULT__T2 = eINSTANCE.getTypeResult_T2();

    /**
     * The meta object literal for the '<em><b>Tyname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_RESULT__TYNAME = eINSTANCE.getTypeResult_Tyname();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_RESULT__NAME = eINSTANCE.getTypeResult_Name();

    /**
     * The meta object literal for the '<em><b>T6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RESULT__T6 = eINSTANCE.getTypeResult_T6();

    /**
     * The meta object literal for the '<em><b>T7</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RESULT__T7 = eINSTANCE.getTypeResult_T7();

    /**
     * The meta object literal for the '<em><b>T9</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RESULT__T9 = eINSTANCE.getTypeResult_T9();

    /**
     * The meta object literal for the '<em><b>T10</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RESULT__T10 = eINSTANCE.getTypeResult_T10();

    /**
     * The meta object literal for the '<em><b>T12</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RESULT__T12 = eINSTANCE.getTypeResult_T12();

    /**
     * The meta object literal for the '<em><b>T13</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RESULT__T13 = eINSTANCE.getTypeResult_T13();

    /**
     * The meta object literal for the '<em><b>T15</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RESULT__T15 = eINSTANCE.getTypeResult_T15();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.TypePrimaryExpressionImpl <em>Type Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.TypePrimaryExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypePrimaryExpression()
     * @generated
     */
    EClass TYPE_PRIMARY_EXPRESSION = eINSTANCE.getTypePrimaryExpression();

    /**
     * The meta object literal for the '<em><b>T32</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_PRIMARY_EXPRESSION__T32 = eINSTANCE.getTypePrimaryExpression_T32();

    /**
     * The meta object literal for the '<em><b>Tyname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_PRIMARY_EXPRESSION__TYNAME = eINSTANCE.getTypePrimaryExpression_Tyname();

    /**
     * The meta object literal for the '<em><b>T5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T5 = eINSTANCE.getTypePrimaryExpression_T5();

    /**
     * The meta object literal for the '<em><b>T7</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T7 = eINSTANCE.getTypePrimaryExpression_T7();

    /**
     * The meta object literal for the '<em><b>T8</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T8 = eINSTANCE.getTypePrimaryExpression_T8();

    /**
     * The meta object literal for the '<em><b>T21</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T21 = eINSTANCE.getTypePrimaryExpression_T21();

    /**
     * The meta object literal for the '<em><b>T23</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T23 = eINSTANCE.getTypePrimaryExpression_T23();

    /**
     * The meta object literal for the '<em><b>T10</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T10 = eINSTANCE.getTypePrimaryExpression_T10();

    /**
     * The meta object literal for the '<em><b>T11</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T11 = eINSTANCE.getTypePrimaryExpression_T11();

    /**
     * The meta object literal for the '<em><b>T24</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T24 = eINSTANCE.getTypePrimaryExpression_T24();

    /**
     * The meta object literal for the '<em><b>T26</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T26 = eINSTANCE.getTypePrimaryExpression_T26();

    /**
     * The meta object literal for the '<em><b>T13</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T13 = eINSTANCE.getTypePrimaryExpression_T13();

    /**
     * The meta object literal for the '<em><b>T14</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PRIMARY_EXPRESSION__T14 = eINSTANCE.getTypePrimaryExpression_T14();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCallImpl <em>Type Name Or Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCallImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeNameOrFunctionCall()
     * @generated
     */
    EClass TYPE_NAME_OR_FUNCTION_CALL = eINSTANCE.getTypeNameOrFunctionCall();

    /**
     * The meta object literal for the '<em><b>Tfnname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_NAME_OR_FUNCTION_CALL__TFNNAME = eINSTANCE.getTypeNameOrFunctionCall_Tfnname();

    /**
     * The meta object literal for the '<em><b>T4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_NAME_OR_FUNCTION_CALL__T4 = eINSTANCE.getTypeNameOrFunctionCall_T4();

    /**
     * The meta object literal for the '<em><b>T25</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_NAME_OR_FUNCTION_CALL__T25 = eINSTANCE.getTypeNameOrFunctionCall_T25();

    /**
     * The meta object literal for the '<em><b>T6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_NAME_OR_FUNCTION_CALL__T6 = eINSTANCE.getTypeNameOrFunctionCall_T6();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.TypeLiteralImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getTypeLiteral()
     * @generated
     */
    EClass TYPE_LITERAL = eINSTANCE.getTypeLiteral();

    /**
     * The meta object literal for the '<em><b>T1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_LITERAL__T1 = eINSTANCE.getTypeLiteral_T1();

    /**
     * The meta object literal for the '<em><b>T22</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_LITERAL__T22 = eINSTANCE.getTypeLiteral_T22();

    /**
     * The meta object literal for the '<em><b>T34</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_LITERAL__T34 = eINSTANCE.getTypeLiteral_T34();

    /**
     * The meta object literal for the '<em><b>T35</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_LITERAL__T35 = eINSTANCE.getTypeLiteral_T35();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.StatementImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S1 = eINSTANCE.getStatement_S1();

    /**
     * The meta object literal for the '<em><b>S3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S3 = eINSTANCE.getStatement_S3();

    /**
     * The meta object literal for the '<em><b>S4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S4 = eINSTANCE.getStatement_S4();

    /**
     * The meta object literal for the '<em><b>S5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S5 = eINSTANCE.getStatement_S5();

    /**
     * The meta object literal for the '<em><b>S6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S6 = eINSTANCE.getStatement_S6();

    /**
     * The meta object literal for the '<em><b>S7</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S7 = eINSTANCE.getStatement_S7();

    /**
     * The meta object literal for the '<em><b>S8</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S8 = eINSTANCE.getStatement_S8();

    /**
     * The meta object literal for the '<em><b>S9</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S9 = eINSTANCE.getStatement_S9();

    /**
     * The meta object literal for the '<em><b>S10</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S10 = eINSTANCE.getStatement_S10();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.BlockImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Stname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__STNAME = eINSTANCE.getBlock_Stname();

    /**
     * The meta object literal for the '<em><b>Statem Bl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEM_BL = eINSTANCE.getBlock_StatemBl();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl <em>Statement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.StatementExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getStatementExpression()
     * @generated
     */
    EClass STATEMENT_EXPRESSION = eINSTANCE.getStatementExpression();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__T = eINSTANCE.getStatementExpression_T();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__T2 = eINSTANCE.getStatementExpression_T2();

    /**
     * The meta object literal for the '<em><b>T3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__T3 = eINSTANCE.getStatementExpression_T3();

    /**
     * The meta object literal for the '<em><b>T4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__T4 = eINSTANCE.getStatementExpression_T4();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ForStatementImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>Stname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_STATEMENT__STNAME = eINSTANCE.getForStatement_Stname();

    /**
     * The meta object literal for the '<em><b>T1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__T1 = eINSTANCE.getForStatement_T1();

    /**
     * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__S1 = eINSTANCE.getForStatement_S1();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.WhileStatementImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '<em><b>Stname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHILE_STATEMENT__STNAME = eINSTANCE.getWhileStatement_Stname();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__T2 = eINSTANCE.getWhileStatement_T2();

    /**
     * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__S1 = eINSTANCE.getWhileStatement_S1();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.DoStatementImpl <em>Do Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.DoStatementImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getDoStatement()
     * @generated
     */
    EClass DO_STATEMENT = eINSTANCE.getDoStatement();

    /**
     * The meta object literal for the '<em><b>Stname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DO_STATEMENT__STNAME = eINSTANCE.getDoStatement_Stname();

    /**
     * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__S1 = eINSTANCE.getDoStatement_S1();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__T2 = eINSTANCE.getDoStatement_T2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.IterateStatementImpl <em>Iterate Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.IterateStatementImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getIterateStatement()
     * @generated
     */
    EClass ITERATE_STATEMENT = eINSTANCE.getIterateStatement();

    /**
     * The meta object literal for the '<em><b>Stname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITERATE_STATEMENT__STNAME = eINSTANCE.getIterateStatement_Stname();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.BreakStatementImpl <em>Break Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.BreakStatementImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getBreakStatement()
     * @generated
     */
    EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

    /**
     * The meta object literal for the '<em><b>Stname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BREAK_STATEMENT__STNAME = eINSTANCE.getBreakStatement_Stname();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ReturnStatementImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Stname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN_STATEMENT__STNAME = eINSTANCE.getReturnStatement_Stname();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__T2 = eINSTANCE.getReturnStatement_T2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.IfStatementImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__T2 = eINSTANCE.getIfStatement_T2();

    /**
     * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__S1 = eINSTANCE.getIfStatement_S1();

    /**
     * The meta object literal for the '<em><b>S2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__S2 = eINSTANCE.getIfStatement_S2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.PredicateImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.PredicatePrimaryImpl <em>Predicate Primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.PredicatePrimaryImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicatePrimary()
     * @generated
     */
    EClass PREDICATE_PRIMARY = eINSTANCE.getPredicatePrimary();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PRIMARY__T = eINSTANCE.getPredicatePrimary_T();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PRIMARY__T2 = eINSTANCE.getPredicatePrimary_T2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ExprImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Ifname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__IFNAME = eINSTANCE.getExpr_Ifname();

    /**
     * The meta object literal for the '<em><b>Ifpred</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__IFPRED = eINSTANCE.getExpr_Ifpred();

    /**
     * The meta object literal for the '<em><b>Thenexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__THENEXP = eINSTANCE.getExpr_Thenexp();

    /**
     * The meta object literal for the '<em><b>Elseexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__ELSEEXP = eINSTANCE.getExpr_Elseexp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.MapDefinitionImpl <em>Map Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.MapDefinitionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getMapDefinition()
     * @generated
     */
    EClass MAP_DEFINITION = eINSTANCE.getMapDefinition();

    /**
     * The meta object literal for the '<em><b>Fn Sig</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_DEFINITION__FN_SIG = eINSTANCE.getMapDefinition_FnSig();

    /**
     * The meta object literal for the '<em><b>Par4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_DEFINITION__PAR4 = eINSTANCE.getMapDefinition_Par4();

    /**
     * The meta object literal for the '<em><b>Par5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_DEFINITION__PAR5 = eINSTANCE.getMapDefinition_Par5();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.PrimaryPrefixImpl <em>Primary Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.PrimaryPrefixImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPrimaryPrefix()
     * @generated
     */
    EClass PRIMARY_PREFIX = eINSTANCE.getPrimaryPrefix();

    /**
     * The meta object literal for the '<em><b>T4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_PREFIX__T4 = eINSTANCE.getPrimaryPrefix_T4();

    /**
     * The meta object literal for the '<em><b>T7</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_PREFIX__T7 = eINSTANCE.getPrimaryPrefix_T7();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.NameOrFunctionCallImpl <em>Name Or Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.NameOrFunctionCallImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getNameOrFunctionCall()
     * @generated
     */
    EClass NAME_OR_FUNCTION_CALL = eINSTANCE.getNameOrFunctionCall();

    /**
     * The meta object literal for the '<em><b>Fnname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_OR_FUNCTION_CALL__FNNAME = eINSTANCE.getNameOrFunctionCall_Fnname();

    /**
     * The meta object literal for the '<em><b>Lsp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_OR_FUNCTION_CALL__LSP = eINSTANCE.getNameOrFunctionCall_Lsp();

    /**
     * The meta object literal for the '<em><b>T4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_OR_FUNCTION_CALL__T4 = eINSTANCE.getNameOrFunctionCall_T4();

    /**
     * The meta object literal for the '<em><b>T5</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_OR_FUNCTION_CALL__T5 = eINSTANCE.getNameOrFunctionCall_T5();

    /**
     * The meta object literal for the '<em><b>T6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_OR_FUNCTION_CALL__T6 = eINSTANCE.getNameOrFunctionCall_T6();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.LiteralImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__T2 = eINSTANCE.getLiteral_T2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.CharacterLiteralImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getCharacterLiteral()
     * @generated
     */
    EClass CHARACTER_LITERAL = eINSTANCE.getCharacterLiteral();

    /**
     * The meta object literal for the '<em><b>C1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER_LITERAL__C1 = eINSTANCE.getCharacterLiteral_C1();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.BooleanLiteralImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Litname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__LITNAME = eINSTANCE.getBooleanLiteral_Litname();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ListLiteralImpl <em>List Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ListLiteralImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getListLiteral()
     * @generated
     */
    EClass LIST_LITERAL = eINSTANCE.getListLiteral();

    /**
     * The meta object literal for the '<em><b>Litname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_LITERAL__LITNAME = eINSTANCE.getListLiteral_Litname();

    /**
     * The meta object literal for the '<em><b>L2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL__L2 = eINSTANCE.getListLiteral_L2();

    /**
     * The meta object literal for the '<em><b>T3</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL__T3 = eINSTANCE.getListLiteral_T3();

    /**
     * The meta object literal for the '<em><b>T14</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL__T14 = eINSTANCE.getListLiteral_T14();

    /**
     * The meta object literal for the '<em><b>L5</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL__L5 = eINSTANCE.getListLiteral_L5();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.PredicateOrImpl <em>Predicate Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.PredicateOrImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicateOr()
     * @generated
     */
    EClass PREDICATE_OR = eINSTANCE.getPredicateOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_OR__LEFT = eINSTANCE.getPredicateOr_Left();

    /**
     * The meta object literal for the '<em><b>Prname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE_OR__PRNAME = eINSTANCE.getPredicateOr_Prname();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_OR__RIGHT = eINSTANCE.getPredicateOr_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.PredicateAndImpl <em>Predicate And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.PredicateAndImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicateAnd()
     * @generated
     */
    EClass PREDICATE_AND = eINSTANCE.getPredicateAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_AND__LEFT = eINSTANCE.getPredicateAnd_Left();

    /**
     * The meta object literal for the '<em><b>Prname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE_AND__PRNAME = eINSTANCE.getPredicateAnd_Prname();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_AND__RIGHT = eINSTANCE.getPredicateAnd_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.PredicateNotImpl <em>Predicate Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.PredicateNotImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPredicateNot()
     * @generated
     */
    EClass PREDICATE_NOT = eINSTANCE.getPredicateNot();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_NOT__T2 = eINSTANCE.getPredicateNot_T2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ConditionExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getConditionExpression()
     * @generated
     */
    EClass CONDITION_EXPRESSION = eINSTANCE.getConditionExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_EXPRESSION__LEFT = eINSTANCE.getConditionExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_EXPRESSION__OP = eINSTANCE.getConditionExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_EXPRESSION__RIGHT = eINSTANCE.getConditionExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.InnerProdExpressionImpl <em>Inner Prod Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.InnerProdExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getInnerProdExpression()
     * @generated
     */
    EClass INNER_PROD_EXPRESSION = eINSTANCE.getInnerProdExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_PROD_EXPRESSION__LEFT = eINSTANCE.getInnerProdExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PROD_EXPRESSION__OP = eINSTANCE.getInnerProdExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_PROD_EXPRESSION__RIGHT = eINSTANCE.getInnerProdExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.OuterProdExpressionImpl <em>Outer Prod Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.OuterProdExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getOuterProdExpression()
     * @generated
     */
    EClass OUTER_PROD_EXPRESSION = eINSTANCE.getOuterProdExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTER_PROD_EXPRESSION__LEFT = eINSTANCE.getOuterProdExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTER_PROD_EXPRESSION__OP = eINSTANCE.getOuterProdExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTER_PROD_EXPRESSION__RIGHT = eINSTANCE.getOuterProdExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.HasExpressionImpl <em>Has Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.HasExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getHasExpression()
     * @generated
     */
    EClass HAS_EXPRESSION = eINSTANCE.getHasExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_EXPRESSION__LEFT = eINSTANCE.getHasExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAS_EXPRESSION__OP = eINSTANCE.getHasExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_EXPRESSION__RIGHT_TYPE = eINSTANCE.getHasExpression_RightType();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.CaseExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getCaseExpression()
     * @generated
     */
    EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__LEFT = eINSTANCE.getCaseExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_EXPRESSION__OP = eINSTANCE.getCaseExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__RIGHT = eINSTANCE.getCaseExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.EqualityExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getEqualityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__LEFT = eINSTANCE.getEqualityExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY_EXPRESSION__OP = eINSTANCE.getEqualityExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__RIGHT = eINSTANCE.getEqualityExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.RelationalExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getRelationalExpression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__LEFT = eINSTANCE.getRelationalExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONAL_EXPRESSION__OP = eINSTANCE.getRelationalExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__RIGHT = eINSTANCE.getRelationalExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.IsExpressionImpl <em>Is Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.IsExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getIsExpression()
     * @generated
     */
    EClass IS_EXPRESSION = eINSTANCE.getIsExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_EXPRESSION__LEFT = eINSTANCE.getIsExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_EXPRESSION__OP = eINSTANCE.getIsExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_EXPRESSION__RIGHT_TYPE = eINSTANCE.getIsExpression_RightType();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.SegmentExpressionImpl <em>Segment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.SegmentExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getSegmentExpression()
     * @generated
     */
    EClass SEGMENT_EXPRESSION = eINSTANCE.getSegmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEGMENT_EXPRESSION__LEFT = eINSTANCE.getSegmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEGMENT_EXPRESSION__OP = eINSTANCE.getSegmentExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEGMENT_EXPRESSION__RIGHT = eINSTANCE.getSegmentExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.AdditiveExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getAdditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__LEFT = eINSTANCE.getAdditiveExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIVE_EXPRESSION__OP = eINSTANCE.getAdditiveExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__RIGHT = eINSTANCE.getAdditiveExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ExquoExpressionImpl <em>Exquo Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ExquoExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getExquoExpression()
     * @generated
     */
    EClass EXQUO_EXPRESSION = eINSTANCE.getExquoExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXQUO_EXPRESSION__LEFT = eINSTANCE.getExquoExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXQUO_EXPRESSION__OP = eINSTANCE.getExquoExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXQUO_EXPRESSION__RIGHT = eINSTANCE.getExquoExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.DivisionExpressionImpl <em>Division Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.DivisionExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getDivisionExpression()
     * @generated
     */
    EClass DIVISION_EXPRESSION = eINSTANCE.getDivisionExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION_EXPRESSION__LEFT = eINSTANCE.getDivisionExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIVISION_EXPRESSION__OP = eINSTANCE.getDivisionExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION_EXPRESSION__RIGHT = eINSTANCE.getDivisionExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.QuoExpressionImpl <em>Quo Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.QuoExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getQuoExpression()
     * @generated
     */
    EClass QUO_EXPRESSION = eINSTANCE.getQuoExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUO_EXPRESSION__LEFT = eINSTANCE.getQuoExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUO_EXPRESSION__OP = eINSTANCE.getQuoExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUO_EXPRESSION__RIGHT = eINSTANCE.getQuoExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ModExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getModExpression()
     * @generated
     */
    EClass MOD_EXPRESSION = eINSTANCE.getModExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_EXPRESSION__LEFT = eINSTANCE.getModExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_EXPRESSION__OP = eINSTANCE.getModExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_EXPRESSION__RIGHT = eINSTANCE.getModExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.RemExpressionImpl <em>Rem Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.RemExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getRemExpression()
     * @generated
     */
    EClass REM_EXPRESSION = eINSTANCE.getRemExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REM_EXPRESSION__LEFT = eINSTANCE.getRemExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REM_EXPRESSION__OP = eINSTANCE.getRemExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REM_EXPRESSION__RIGHT = eINSTANCE.getRemExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.MultiplicativeExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getMultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__LEFT = eINSTANCE.getMultiplicativeExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATIVE_EXPRESSION__OP = eINSTANCE.getMultiplicativeExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__RIGHT = eINSTANCE.getMultiplicativeExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ExponentExpressionImpl <em>Exponent Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ExponentExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getExponentExpression()
     * @generated
     */
    EClass EXPONENT_EXPRESSION = eINSTANCE.getExponentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPONENT_EXPRESSION__LEFT = eINSTANCE.getExponentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPONENT_EXPRESSION__OP = eINSTANCE.getExponentExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPONENT_EXPRESSION__RIGHT = eINSTANCE.getExponentExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.PretendExpressionImpl <em>Pretend Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.PretendExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getPretendExpression()
     * @generated
     */
    EClass PRETEND_EXPRESSION = eINSTANCE.getPretendExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRETEND_EXPRESSION__LEFT = eINSTANCE.getPretendExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRETEND_EXPRESSION__OP = eINSTANCE.getPretendExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRETEND_EXPRESSION__RIGHT_TYPE = eINSTANCE.getPretendExpression_RightType();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.HintTypeExpressionImpl <em>Hint Type Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.HintTypeExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getHintTypeExpression()
     * @generated
     */
    EClass HINT_TYPE_EXPRESSION = eINSTANCE.getHintTypeExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HINT_TYPE_EXPRESSION__LEFT = eINSTANCE.getHintTypeExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HINT_TYPE_EXPRESSION__OP = eINSTANCE.getHintTypeExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HINT_TYPE_EXPRESSION__RIGHT_TYPE = eINSTANCE.getHintTypeExpression_RightType();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.CoerceExpressionImpl <em>Coerce Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.CoerceExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getCoerceExpression()
     * @generated
     */
    EClass COERCE_EXPRESSION = eINSTANCE.getCoerceExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COERCE_EXPRESSION__LEFT = eINSTANCE.getCoerceExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COERCE_EXPRESSION__OP = eINSTANCE.getCoerceExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COERCE_EXPRESSION__RIGHT_TYPE = eINSTANCE.getCoerceExpression_RightType();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.EltExpressionImpl <em>Elt Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.EltExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getEltExpression()
     * @generated
     */
    EClass ELT_EXPRESSION = eINSTANCE.getEltExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELT_EXPRESSION__LEFT = eINSTANCE.getEltExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELT_EXPRESSION__OP = eINSTANCE.getEltExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELT_EXPRESSION__RIGHT = eINSTANCE.getEltExpression_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.ExplicitTypeExpressionImpl <em>Explicit Type Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.ExplicitTypeExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getExplicitTypeExpression()
     * @generated
     */
    EClass EXPLICIT_TYPE_EXPRESSION = eINSTANCE.getExplicitTypeExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_TYPE_EXPRESSION__LEFT = eINSTANCE.getExplicitTypeExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPLICIT_TYPE_EXPRESSION__OP = eINSTANCE.getExplicitTypeExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_TYPE_EXPRESSION__RIGHT_TYPE = eINSTANCE.getExplicitTypeExpression_RightType();

    /**
     * The meta object literal for the '{@link com.euclideanspace.spad.editor.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.spad.editor.impl.UnaryExpressionImpl
     * @see com.euclideanspace.spad.editor.impl.EditorPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Uop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__UOP = eINSTANCE.getUnaryExpression_Uop();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getUnaryExpression_Expr();

  }

} //EditorPackage