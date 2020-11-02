/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.UnionTypeDefinition#getMemberTypes <em>Member Types</em>}</li>
 * </ul>
 *
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getUnionTypeDefinition()
 * @model
 * @generated
 */
public interface UnionTypeDefinition extends TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Member Types</b></em>' containment reference list.
   * The list contents are of type {@link io.github.katmatt.graphql.graphQL.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Types</em>' containment reference list.
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getUnionTypeDefinition_MemberTypes()
   * @model containment="true"
   * @generated
   */
  EList<Type> getMemberTypes();

} // UnionTypeDefinition
