/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL.impl;

import io.github.katmatt.graphql.graphQL.DirectiveLocation;
import io.github.katmatt.graphql.graphQL.DirectiveLocations;
import io.github.katmatt.graphql.graphQL.GraphQLPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directive Locations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.DirectiveLocationsImpl#getDirectiveLocations <em>Directive Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectiveLocationsImpl extends MinimalEObjectImpl.Container implements DirectiveLocations
{
  /**
   * The cached value of the '{@link #getDirectiveLocations() <em>Directive Locations</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectiveLocations()
   * @generated
   * @ordered
   */
  protected EList<DirectiveLocation> directiveLocations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectiveLocationsImpl()
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
    return GraphQLPackage.Literals.DIRECTIVE_LOCATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DirectiveLocation> getDirectiveLocations()
  {
    if (directiveLocations == null)
    {
      directiveLocations = new EDataTypeEList<DirectiveLocation>(DirectiveLocation.class, this, GraphQLPackage.DIRECTIVE_LOCATIONS__DIRECTIVE_LOCATIONS);
    }
    return directiveLocations;
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
      case GraphQLPackage.DIRECTIVE_LOCATIONS__DIRECTIVE_LOCATIONS:
        return getDirectiveLocations();
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
      case GraphQLPackage.DIRECTIVE_LOCATIONS__DIRECTIVE_LOCATIONS:
        getDirectiveLocations().clear();
        getDirectiveLocations().addAll((Collection<? extends DirectiveLocation>)newValue);
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
      case GraphQLPackage.DIRECTIVE_LOCATIONS__DIRECTIVE_LOCATIONS:
        getDirectiveLocations().clear();
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
      case GraphQLPackage.DIRECTIVE_LOCATIONS__DIRECTIVE_LOCATIONS:
        return directiveLocations != null && !directiveLocations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (directiveLocations: ");
    result.append(directiveLocations);
    result.append(')');
    return result.toString();
  }

} //DirectiveLocationsImpl
