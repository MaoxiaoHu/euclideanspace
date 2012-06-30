/**
 */
package com.euclideanspace.spad.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.ConditionExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ConditionExpression#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ConditionExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getConditionExpression()
 * @model
 * @generated
 */
public interface ConditionExpression extends Expr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getConditionExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expr getLeft();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ConditionExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expr value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getConditionExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ConditionExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Predicate)
   * @see com.euclideanspace.spad.editor.EditorPackage#getConditionExpression_Right()
   * @model containment="true"
   * @generated
   */
  Predicate getRight();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ConditionExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Predicate value);

} // ConditionExpression