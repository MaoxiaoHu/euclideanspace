/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.E11_E12;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Expr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>E11 E12</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.E11_E12Impl#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class E11_E12Impl extends ExprImpl implements E11_E12
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expr left;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected E11_E12Impl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EditorPackage.Literals.E11_E12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expr newLeft, NotificationChain msgs)
  {
    Expr oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.E11_E12__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expr newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.E11_E12__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.E11_E12__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.E11_E12__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EditorPackage.E11_E12__LEFT:
        return basicSetLeft(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EditorPackage.E11_E12__LEFT:
        return getLeft();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.E11_E12__LEFT:
        setLeft((Expr)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EditorPackage.E11_E12__LEFT:
        setLeft((Expr)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EditorPackage.E11_E12__LEFT:
        return left != null;
    }
    return super.eIsSet(featureID);
  }

} //E11_E12Impl
