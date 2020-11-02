/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL.impl;

import io.github.katmatt.graphql.graphQL.GraphQLPackage;
import io.github.katmatt.graphql.graphQL.SchemaDefinition;
import io.github.katmatt.graphql.graphQL.TypeDefinition;
import io.github.katmatt.graphql.graphQL.TypeSystemDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type System Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.TypeSystemDefinitionImpl#getSchemaDefinitions <em>Schema Definitions</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.TypeSystemDefinitionImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeSystemDefinitionImpl extends MinimalEObjectImpl.Container implements TypeSystemDefinition
{
  /**
   * The cached value of the '{@link #getSchemaDefinitions() <em>Schema Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaDefinitions()
   * @generated
   * @ordered
   */
  protected EList<SchemaDefinition> schemaDefinitions;

  /**
   * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinitions()
   * @generated
   * @ordered
   */
  protected EList<TypeDefinition> typeDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeSystemDefinitionImpl()
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
    return GraphQLPackage.Literals.TYPE_SYSTEM_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SchemaDefinition> getSchemaDefinitions()
  {
    if (schemaDefinitions == null)
    {
      schemaDefinitions = new EObjectContainmentEList<SchemaDefinition>(SchemaDefinition.class, this, GraphQLPackage.TYPE_SYSTEM_DEFINITION__SCHEMA_DEFINITIONS);
    }
    return schemaDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TypeDefinition> getTypeDefinitions()
  {
    if (typeDefinitions == null)
    {
      typeDefinitions = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, GraphQLPackage.TYPE_SYSTEM_DEFINITION__TYPE_DEFINITIONS);
    }
    return typeDefinitions;
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
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__SCHEMA_DEFINITIONS:
        return ((InternalEList<?>)getSchemaDefinitions()).basicRemove(otherEnd, msgs);
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__TYPE_DEFINITIONS:
        return ((InternalEList<?>)getTypeDefinitions()).basicRemove(otherEnd, msgs);
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
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__SCHEMA_DEFINITIONS:
        return getSchemaDefinitions();
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__TYPE_DEFINITIONS:
        return getTypeDefinitions();
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
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__SCHEMA_DEFINITIONS:
        getSchemaDefinitions().clear();
        getSchemaDefinitions().addAll((Collection<? extends SchemaDefinition>)newValue);
        return;
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__TYPE_DEFINITIONS:
        getTypeDefinitions().clear();
        getTypeDefinitions().addAll((Collection<? extends TypeDefinition>)newValue);
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
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__SCHEMA_DEFINITIONS:
        getSchemaDefinitions().clear();
        return;
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__TYPE_DEFINITIONS:
        getTypeDefinitions().clear();
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
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__SCHEMA_DEFINITIONS:
        return schemaDefinitions != null && !schemaDefinitions.isEmpty();
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION__TYPE_DEFINITIONS:
        return typeDefinitions != null && !typeDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeSystemDefinitionImpl