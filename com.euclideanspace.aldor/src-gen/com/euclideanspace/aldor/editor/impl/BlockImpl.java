/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Block;
import com.euclideanspace.aldor.editor.BlockEnclosure;
import com.euclideanspace.aldor.editor.BlockMolecule;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Jleft_Atom;
import com.euclideanspace.aldor.editor.Jright_Atom;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BlockImpl#getRight2 <em>Right2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends SigImpl implements Block
{
  /**
   * The cached value of the '{@link #getRight2() <em>Right2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight2()
   * @generated
   * @ordered
   */
  protected Jright_Atom right2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return EditorPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jright_Atom getRight2()
  {
    return right2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight2(Jright_Atom newRight2, NotificationChain msgs)
  {
    Jright_Atom oldRight2 = right2;
    right2 = newRight2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BLOCK__RIGHT2, oldRight2, newRight2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight2(Jright_Atom newRight2)
  {
    if (newRight2 != right2)
    {
      NotificationChain msgs = null;
      if (right2 != null)
        msgs = ((InternalEObject)right2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BLOCK__RIGHT2, null, msgs);
      if (newRight2 != null)
        msgs = ((InternalEObject)newRight2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BLOCK__RIGHT2, null, msgs);
      msgs = basicSetRight2(newRight2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BLOCK__RIGHT2, newRight2, newRight2));
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
      case EditorPackage.BLOCK__RIGHT2:
        return basicSetRight2(null, msgs);
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
      case EditorPackage.BLOCK__RIGHT2:
        return getRight2();
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
      case EditorPackage.BLOCK__RIGHT2:
        setRight2((Jright_Atom)newValue);
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
      case EditorPackage.BLOCK__RIGHT2:
        setRight2((Jright_Atom)null);
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
      case EditorPackage.BLOCK__RIGHT2:
        return right2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == BlockMolecule.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Jright_Atom.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.BLOCK__RIGHT2: return EditorPackage.JRIGHT_ATOM__RIGHT2;
        default: return -1;
      }
    }
    if (baseClass == Jleft_Atom.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BlockEnclosure.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == BlockMolecule.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Jright_Atom.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.JRIGHT_ATOM__RIGHT2: return EditorPackage.BLOCK__RIGHT2;
        default: return -1;
      }
    }
    if (baseClass == Jleft_Atom.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BlockEnclosure.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //BlockImpl