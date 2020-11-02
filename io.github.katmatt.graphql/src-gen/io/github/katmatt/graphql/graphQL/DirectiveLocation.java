/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Directive Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage#getDirectiveLocation()
 * @model
 * @generated
 */
public enum DirectiveLocation implements Enumerator
{
  /**
   * The '<em><b>QUERY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUERY_VALUE
   * @generated
   * @ordered
   */
  QUERY(0, "QUERY", "QUERY"),

  /**
   * The '<em><b>MUTATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MUTATION_VALUE
   * @generated
   * @ordered
   */
  MUTATION(1, "MUTATION", "MUTATION"),

  /**
   * The '<em><b>SUBSCRIPTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBSCRIPTION_VALUE
   * @generated
   * @ordered
   */
  SUBSCRIPTION(2, "SUBSCRIPTION", "SUBSCRIPTION"),

  /**
   * The '<em><b>FIELD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIELD_VALUE
   * @generated
   * @ordered
   */
  FIELD(3, "FIELD", "FIELD"),

  /**
   * The '<em><b>FRAGMENT DEFINITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRAGMENT_DEFINITION_VALUE
   * @generated
   * @ordered
   */
  FRAGMENT_DEFINITION(4, "FRAGMENT_DEFINITION", "FRAGMENT_DEFINITION"),

  /**
   * The '<em><b>FRAGMENT SPREAD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRAGMENT_SPREAD_VALUE
   * @generated
   * @ordered
   */
  FRAGMENT_SPREAD(5, "FRAGMENT_SPREAD", "FRAGMENT_SPREAD"),

  /**
   * The '<em><b>INLINE FRAGMENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INLINE_FRAGMENT_VALUE
   * @generated
   * @ordered
   */
  INLINE_FRAGMENT(6, "INLINE_FRAGMENT", "INLINE_FRAGMENT"),

  /**
   * The '<em><b>VARIABLE DEFINITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VARIABLE_DEFINITION_VALUE
   * @generated
   * @ordered
   */
  VARIABLE_DEFINITION(7, "VARIABLE_DEFINITION", "VARIABLE_DEFINITION"),

  /**
   * The '<em><b>SCHEMA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SCHEMA_VALUE
   * @generated
   * @ordered
   */
  SCHEMA(8, "SCHEMA", "SCHEMA"),

  /**
   * The '<em><b>SCALAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SCALAR_VALUE
   * @generated
   * @ordered
   */
  SCALAR(9, "SCALAR", "SCALAR"),

  /**
   * The '<em><b>OBJECT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBJECT_VALUE
   * @generated
   * @ordered
   */
  OBJECT(10, "OBJECT", "OBJECT"),

  /**
   * The '<em><b>FIELD DEFINITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIELD_DEFINITION_VALUE
   * @generated
   * @ordered
   */
  FIELD_DEFINITION(11, "FIELD_DEFINITION", "FIELD_DEFINITION"),

  /**
   * The '<em><b>ARGUMENT DEFINITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARGUMENT_DEFINITION_VALUE
   * @generated
   * @ordered
   */
  ARGUMENT_DEFINITION(12, "ARGUMENT_DEFINITION", "ARGUMENT_DEFINITION"),

  /**
   * The '<em><b>INTERFACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERFACE_VALUE
   * @generated
   * @ordered
   */
  INTERFACE(13, "INTERFACE", "INTERFACE"),

  /**
   * The '<em><b>UNION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNION_VALUE
   * @generated
   * @ordered
   */
  UNION(14, "UNION", "UNION"),

  /**
   * The '<em><b>ENUM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENUM_VALUE_
   * @generated
   * @ordered
   */
  ENUM(15, "ENUM", "ENUM"),

  /**
   * The '<em><b>ENUM VALUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENUM_VALUE_VALUE
   * @generated
   * @ordered
   */
  ENUM_VALUE(16, "ENUM_VALUE", "ENUM_VALUE"),

  /**
   * The '<em><b>INPUT OBJECT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_OBJECT_VALUE
   * @generated
   * @ordered
   */
  INPUT_OBJECT(17, "INPUT_OBJECT", "INPUT_OBJECT"),

  /**
   * The '<em><b>INPUT FIELD DEFINITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_FIELD_DEFINITION_VALUE
   * @generated
   * @ordered
   */
  INPUT_FIELD_DEFINITION(18, "INPUT_FIELD_DEFINITION", "INPUT_FIELD_DEFINITION");

  /**
   * The '<em><b>QUERY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUERY
   * @model
   * @generated
   * @ordered
   */
  public static final int QUERY_VALUE = 0;

  /**
   * The '<em><b>MUTATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MUTATION
   * @model
   * @generated
   * @ordered
   */
  public static final int MUTATION_VALUE = 1;

  /**
   * The '<em><b>SUBSCRIPTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBSCRIPTION
   * @model
   * @generated
   * @ordered
   */
  public static final int SUBSCRIPTION_VALUE = 2;

  /**
   * The '<em><b>FIELD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIELD
   * @model
   * @generated
   * @ordered
   */
  public static final int FIELD_VALUE = 3;

  /**
   * The '<em><b>FRAGMENT DEFINITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRAGMENT_DEFINITION
   * @model
   * @generated
   * @ordered
   */
  public static final int FRAGMENT_DEFINITION_VALUE = 4;

  /**
   * The '<em><b>FRAGMENT SPREAD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRAGMENT_SPREAD
   * @model
   * @generated
   * @ordered
   */
  public static final int FRAGMENT_SPREAD_VALUE = 5;

  /**
   * The '<em><b>INLINE FRAGMENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INLINE_FRAGMENT
   * @model
   * @generated
   * @ordered
   */
  public static final int INLINE_FRAGMENT_VALUE = 6;

  /**
   * The '<em><b>VARIABLE DEFINITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VARIABLE_DEFINITION
   * @model
   * @generated
   * @ordered
   */
  public static final int VARIABLE_DEFINITION_VALUE = 7;

  /**
   * The '<em><b>SCHEMA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SCHEMA
   * @model
   * @generated
   * @ordered
   */
  public static final int SCHEMA_VALUE = 8;

  /**
   * The '<em><b>SCALAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SCALAR
   * @model
   * @generated
   * @ordered
   */
  public static final int SCALAR_VALUE = 9;

  /**
   * The '<em><b>OBJECT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBJECT
   * @model
   * @generated
   * @ordered
   */
  public static final int OBJECT_VALUE = 10;

  /**
   * The '<em><b>FIELD DEFINITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIELD_DEFINITION
   * @model
   * @generated
   * @ordered
   */
  public static final int FIELD_DEFINITION_VALUE = 11;

  /**
   * The '<em><b>ARGUMENT DEFINITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARGUMENT_DEFINITION
   * @model
   * @generated
   * @ordered
   */
  public static final int ARGUMENT_DEFINITION_VALUE = 12;

  /**
   * The '<em><b>INTERFACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERFACE
   * @model
   * @generated
   * @ordered
   */
  public static final int INTERFACE_VALUE = 13;

  /**
   * The '<em><b>UNION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNION
   * @model
   * @generated
   * @ordered
   */
  public static final int UNION_VALUE = 14;

  /**
   * The '<em><b>ENUM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENUM
   * @model
   * @generated
   * @ordered
   */
  public static final int ENUM_VALUE_ = 15;

  /**
   * The '<em><b>ENUM VALUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENUM_VALUE
   * @model
   * @generated
   * @ordered
   */
  public static final int ENUM_VALUE_VALUE = 16;

  /**
   * The '<em><b>INPUT OBJECT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_OBJECT
   * @model
   * @generated
   * @ordered
   */
  public static final int INPUT_OBJECT_VALUE = 17;

  /**
   * The '<em><b>INPUT FIELD DEFINITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_FIELD_DEFINITION
   * @model
   * @generated
   * @ordered
   */
  public static final int INPUT_FIELD_DEFINITION_VALUE = 18;

  /**
   * An array of all the '<em><b>Directive Location</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DirectiveLocation[] VALUES_ARRAY =
    new DirectiveLocation[]
    {
      QUERY,
      MUTATION,
      SUBSCRIPTION,
      FIELD,
      FRAGMENT_DEFINITION,
      FRAGMENT_SPREAD,
      INLINE_FRAGMENT,
      VARIABLE_DEFINITION,
      SCHEMA,
      SCALAR,
      OBJECT,
      FIELD_DEFINITION,
      ARGUMENT_DEFINITION,
      INTERFACE,
      UNION,
      ENUM,
      ENUM_VALUE,
      INPUT_OBJECT,
      INPUT_FIELD_DEFINITION,
    };

  /**
   * A public read-only list of all the '<em><b>Directive Location</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DirectiveLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Directive Location</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DirectiveLocation get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DirectiveLocation result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Directive Location</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DirectiveLocation getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DirectiveLocation result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Directive Location</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DirectiveLocation get(int value)
  {
    switch (value)
    {
      case QUERY_VALUE: return QUERY;
      case MUTATION_VALUE: return MUTATION;
      case SUBSCRIPTION_VALUE: return SUBSCRIPTION;
      case FIELD_VALUE: return FIELD;
      case FRAGMENT_DEFINITION_VALUE: return FRAGMENT_DEFINITION;
      case FRAGMENT_SPREAD_VALUE: return FRAGMENT_SPREAD;
      case INLINE_FRAGMENT_VALUE: return INLINE_FRAGMENT;
      case VARIABLE_DEFINITION_VALUE: return VARIABLE_DEFINITION;
      case SCHEMA_VALUE: return SCHEMA;
      case SCALAR_VALUE: return SCALAR;
      case OBJECT_VALUE: return OBJECT;
      case FIELD_DEFINITION_VALUE: return FIELD_DEFINITION;
      case ARGUMENT_DEFINITION_VALUE: return ARGUMENT_DEFINITION;
      case INTERFACE_VALUE: return INTERFACE;
      case UNION_VALUE: return UNION;
      case ENUM_VALUE_: return ENUM;
      case ENUM_VALUE_VALUE: return ENUM_VALUE;
      case INPUT_OBJECT_VALUE: return INPUT_OBJECT;
      case INPUT_FIELD_DEFINITION_VALUE: return INPUT_FIELD_DEFINITION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DirectiveLocation(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DirectiveLocation