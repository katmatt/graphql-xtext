/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.EnumValueDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.EnumValueDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getEnumValueDefinition()
 * @model
 * @generated
 */
public interface EnumValueDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(StringValue)
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getEnumValueDefinition_Description()
   * @model containment="true"
   * @generated
   */
  StringValue getDescription();

  /**
   * Sets the value of the '{@link io.github.katmatt.graphql.graphQL.EnumValueDefinition#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(StringValue value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getEnumValueDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.github.katmatt.graphql.graphQL.EnumValueDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EnumValueDefinition
