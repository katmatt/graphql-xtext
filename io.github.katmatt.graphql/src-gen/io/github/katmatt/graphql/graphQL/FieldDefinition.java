/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.FieldDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.FieldDefinition#getName <em>Name</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.FieldDefinition#getArguments <em>Arguments</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.FieldDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getFieldDefinition()
 * @model
 * @generated
 */
public interface FieldDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(StringValue)
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getFieldDefinition_Description()
   * @model containment="true"
   * @generated
   */
  StringValue getDescription();

  /**
   * Sets the value of the '{@link io.github.katmatt.graphql.graphQL.FieldDefinition#getDescription <em>Description</em>}' containment reference.
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
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getFieldDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.github.katmatt.graphql.graphQL.FieldDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(ArgumentsDefinition)
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getFieldDefinition_Arguments()
   * @model containment="true"
   * @generated
   */
  ArgumentsDefinition getArguments();

  /**
   * Sets the value of the '{@link io.github.katmatt.graphql.graphQL.FieldDefinition#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(ArgumentsDefinition value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getFieldDefinition_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link io.github.katmatt.graphql.graphQL.FieldDefinition#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // FieldDefinition
