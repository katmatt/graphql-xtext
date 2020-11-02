/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.EnumValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends ConstValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(EnumValueDefinition)
   * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getEnumValue_Value()
   * @model
   * @generated
   */
  EnumValueDefinition getValue();

  /**
   * Sets the value of the '{@link io.github.katmatt.graphql.graphQL.EnumValue#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EnumValueDefinition value);

} // EnumValue