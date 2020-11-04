/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.EnumTypeDefinition#getEnumValuesDefinition <em>Enum Values Definition</em>}</li>
 * </ul>
 *
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getEnumTypeDefinition()
 * @model
 * @generated
 */
public interface EnumTypeDefinition extends TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Enum Values Definition</b></em>' containment reference list.
   * The list contents are of type {@link io.github.katmatt.graphql.graphQL.EnumValueDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Values Definition</em>' containment reference list.
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getEnumTypeDefinition_EnumValuesDefinition()
   * @model containment="true"
   * @generated
   */
  EList<EnumValueDefinition> getEnumValuesDefinition();

} // EnumTypeDefinition
