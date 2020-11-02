/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL.impl;

import io.github.katmatt.graphql.graphQL.FieldDefinition;
import io.github.katmatt.graphql.graphQL.GraphQLPackage;
import io.github.katmatt.graphql.graphQL.IntersectionType;
import io.github.katmatt.graphql.graphQL.ObjectTypeDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.ObjectTypeDefinitionImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.ObjectTypeDefinitionImpl#getFieldDefinitions <em>Field Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTypeDefinitionImpl extends TypeDefinitionImpl implements ObjectTypeDefinition
{
  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected IntersectionType implements_;

  /**
   * The cached value of the '{@link #getFieldDefinitions() <em>Field Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldDefinitions()
   * @generated
   * @ordered
   */
  protected EList<FieldDefinition> fieldDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectTypeDefinitionImpl()
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
    return GraphQLPackage.Literals.OBJECT_TYPE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntersectionType getImplements()
  {
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImplements(IntersectionType newImplements, NotificationChain msgs)
  {
    IntersectionType oldImplements = implements_;
    implements_ = newImplements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS, oldImplements, newImplements);
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
  public void setImplements(IntersectionType newImplements)
  {
    if (newImplements != implements_)
    {
      NotificationChain msgs = null;
      if (implements_ != null)
        msgs = ((InternalEObject)implements_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS, null, msgs);
      if (newImplements != null)
        msgs = ((InternalEObject)newImplements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS, null, msgs);
      msgs = basicSetImplements(newImplements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS, newImplements, newImplements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FieldDefinition> getFieldDefinitions()
  {
    if (fieldDefinitions == null)
    {
      fieldDefinitions = new EObjectContainmentEList<FieldDefinition>(FieldDefinition.class, this, GraphQLPackage.OBJECT_TYPE_DEFINITION__FIELD_DEFINITIONS);
    }
    return fieldDefinitions;
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
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS:
        return basicSetImplements(null, msgs);
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__FIELD_DEFINITIONS:
        return ((InternalEList<?>)getFieldDefinitions()).basicRemove(otherEnd, msgs);
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
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS:
        return getImplements();
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__FIELD_DEFINITIONS:
        return getFieldDefinitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS:
        setImplements((IntersectionType)newValue);
        return;
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__FIELD_DEFINITIONS:
        getFieldDefinitions().clear();
        getFieldDefinitions().addAll((Collection<? extends FieldDefinition>)newValue);
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
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS:
        setImplements((IntersectionType)null);
        return;
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__FIELD_DEFINITIONS:
        getFieldDefinitions().clear();
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
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__IMPLEMENTS:
        return implements_ != null;
      case GraphQLPackage.OBJECT_TYPE_DEFINITION__FIELD_DEFINITIONS:
        return fieldDefinitions != null && !fieldDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ObjectTypeDefinitionImpl
