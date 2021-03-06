/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL.impl;

import io.github.katmatt.graphql.graphQL.ConstValue;
import io.github.katmatt.graphql.graphQL.FieldDefinition;
import io.github.katmatt.graphql.graphQL.GraphQLPackage;
import io.github.katmatt.graphql.graphQL.ObjectField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.ObjectFieldImpl#getFieldDefinition <em>Field Definition</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.ObjectFieldImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectFieldImpl extends MinimalEObjectImpl.Container implements ObjectField
{
  /**
   * The cached value of the '{@link #getFieldDefinition() <em>Field Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldDefinition()
   * @generated
   * @ordered
   */
  protected FieldDefinition fieldDefinition;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ConstValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectFieldImpl()
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
    return GraphQLPackage.Literals.OBJECT_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldDefinition getFieldDefinition()
  {
    if (fieldDefinition != null && fieldDefinition.eIsProxy())
    {
      InternalEObject oldFieldDefinition = (InternalEObject)fieldDefinition;
      fieldDefinition = (FieldDefinition)eResolveProxy(oldFieldDefinition);
      if (fieldDefinition != oldFieldDefinition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphQLPackage.OBJECT_FIELD__FIELD_DEFINITION, oldFieldDefinition, fieldDefinition));
      }
    }
    return fieldDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDefinition basicGetFieldDefinition()
  {
    return fieldDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFieldDefinition(FieldDefinition newFieldDefinition)
  {
    FieldDefinition oldFieldDefinition = fieldDefinition;
    fieldDefinition = newFieldDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.OBJECT_FIELD__FIELD_DEFINITION, oldFieldDefinition, fieldDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ConstValue newValue, NotificationChain msgs)
  {
    ConstValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphQLPackage.OBJECT_FIELD__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(ConstValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphQLPackage.OBJECT_FIELD__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphQLPackage.OBJECT_FIELD__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.OBJECT_FIELD__VALUE, newValue, newValue));
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
      case GraphQLPackage.OBJECT_FIELD__VALUE:
        return basicSetValue(null, msgs);
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
      case GraphQLPackage.OBJECT_FIELD__FIELD_DEFINITION:
        if (resolve) return getFieldDefinition();
        return basicGetFieldDefinition();
      case GraphQLPackage.OBJECT_FIELD__VALUE:
        return getValue();
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
      case GraphQLPackage.OBJECT_FIELD__FIELD_DEFINITION:
        setFieldDefinition((FieldDefinition)newValue);
        return;
      case GraphQLPackage.OBJECT_FIELD__VALUE:
        setValue((ConstValue)newValue);
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
      case GraphQLPackage.OBJECT_FIELD__FIELD_DEFINITION:
        setFieldDefinition((FieldDefinition)null);
        return;
      case GraphQLPackage.OBJECT_FIELD__VALUE:
        setValue((ConstValue)null);
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
      case GraphQLPackage.OBJECT_FIELD__FIELD_DEFINITION:
        return fieldDefinition != null;
      case GraphQLPackage.OBJECT_FIELD__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectFieldImpl
