/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directive Locations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.DirectiveLocations#getDirectiveLocations <em>Directive Locations</em>}</li>
 * </ul>
 *
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getDirectiveLocations()
 * @model
 * @generated
 */
public interface DirectiveLocations extends EObject
{
  /**
   * Returns the value of the '<em><b>Directive Locations</b></em>' attribute list.
   * The list contents are of type {@link io.github.katmatt.graphql.graphQL.DirectiveLocation}.
   * The literals are from the enumeration {@link io.github.katmatt.graphql.graphQL.DirectiveLocation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directive Locations</em>' attribute list.
   * @see io.github.katmatt.graphql.graphQL.DirectiveLocation
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getDirectiveLocations_DirectiveLocations()
   * @model unique="false"
   * @generated
   */
  EList<DirectiveLocation> getDirectiveLocations();

} // DirectiveLocations