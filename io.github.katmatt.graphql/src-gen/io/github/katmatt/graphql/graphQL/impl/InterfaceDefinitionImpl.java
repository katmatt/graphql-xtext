/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL.impl;

import io.github.katmatt.graphql.graphQL.FieldDefinition;
import io.github.katmatt.graphql.graphQL.GraphQLPackage;
import io.github.katmatt.graphql.graphQL.InterfaceDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.InterfaceDefinitionImpl#getFieldDefinitions <em>Field Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDefinitionImpl extends TypeDefinitionImpl implements InterfaceDefinition
{
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
  protected InterfaceDefinitionImpl()
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
    return GraphQLPackage.Literals.INTERFACE_DEFINITION;
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
      fieldDefinitions = new EObjectContainmentEList<FieldDefinition>(FieldDefinition.class, this, GraphQLPackage.INTERFACE_DEFINITION__FIELD_DEFINITIONS);
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
      case GraphQLPackage.INTERFACE_DEFINITION__FIELD_DEFINITIONS:
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
      case GraphQLPackage.INTERFACE_DEFINITION__FIELD_DEFINITIONS:
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
      case GraphQLPackage.INTERFACE_DEFINITION__FIELD_DEFINITIONS:
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
      case GraphQLPackage.INTERFACE_DEFINITION__FIELD_DEFINITIONS:
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
      case GraphQLPackage.INTERFACE_DEFINITION__FIELD_DEFINITIONS:
        return fieldDefinitions != null && !fieldDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceDefinitionImpl
