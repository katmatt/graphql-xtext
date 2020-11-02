/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.InterfaceDefinition#getFieldDefinitions <em>Field Definitions</em>}</li>
 * </ul>
 *
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getInterfaceDefinition()
 * @model
 * @generated
 */
public interface InterfaceDefinition extends TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Field Definitions</b></em>' containment reference list.
   * The list contents are of type {@link io.github.katmatt.graphql.graphQL.FieldDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Definitions</em>' containment reference list.
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getInterfaceDefinition_FieldDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<FieldDefinition> getFieldDefinitions();

} // InterfaceDefinition
