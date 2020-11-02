/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL.util;

import io.github.katmatt.graphql.graphQL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.github.katmatt.graphql.graphQL.GraphQLPackage
 * @generated
 */
public class GraphQLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GraphQLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphQLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GraphQLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphQLSwitch<Adapter> modelSwitch =
    new GraphQLSwitch<Adapter>()
    {
      @Override
      public Adapter caseTypeSystemDefinition(TypeSystemDefinition object)
      {
        return createTypeSystemDefinitionAdapter();
      }
      @Override
      public Adapter caseSchemaDefinition(SchemaDefinition object)
      {
        return createSchemaDefinitionAdapter();
      }
      @Override
      public Adapter caseRootOperationTypeDefinition(RootOperationTypeDefinition object)
      {
        return createRootOperationTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseScalarTypeDefinition(ScalarTypeDefinition object)
      {
        return createScalarTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseObjectTypeDefinition(ObjectTypeDefinition object)
      {
        return createObjectTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseInterfaceDefinition(InterfaceDefinition object)
      {
        return createInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseFieldDefinition(FieldDefinition object)
      {
        return createFieldDefinitionAdapter();
      }
      @Override
      public Adapter caseUnionTypeDefinition(UnionTypeDefinition object)
      {
        return createUnionTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumTypeDefinition(EnumTypeDefinition object)
      {
        return createEnumTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumValueDefinition(EnumValueDefinition object)
      {
        return createEnumValueDefinitionAdapter();
      }
      @Override
      public Adapter caseInputObjectTypeDefinition(InputObjectTypeDefinition object)
      {
        return createInputObjectTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseInputValueDefinition(InputValueDefinition object)
      {
        return createInputValueDefinitionAdapter();
      }
      @Override
      public Adapter caseIntersectionType(IntersectionType object)
      {
        return createIntersectionTypeAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseNamedType(NamedType object)
      {
        return createNamedTypeAdapter();
      }
      @Override
      public Adapter caseListType(ListType object)
      {
        return createListTypeAdapter();
      }
      @Override
      public Adapter caseIntValue(IntValue object)
      {
        return createIntValueAdapter();
      }
      @Override
      public Adapter caseFloatValue(FloatValue object)
      {
        return createFloatValueAdapter();
      }
      @Override
      public Adapter caseNullValue(NullValue object)
      {
        return createNullValueAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseBooleanValue(BooleanValue object)
      {
        return createBooleanValueAdapter();
      }
      @Override
      public Adapter caseEnumValue(EnumValue object)
      {
        return createEnumValueAdapter();
      }
      @Override
      public Adapter caseObjectValue(ObjectValue object)
      {
        return createObjectValueAdapter();
      }
      @Override
      public Adapter caseObjectField(ObjectField object)
      {
        return createObjectFieldAdapter();
      }
      @Override
      public Adapter caseConstValue(ConstValue object)
      {
        return createConstValueAdapter();
      }
      @Override
      public Adapter caseListValue(ListValue object)
      {
        return createListValueAdapter();
      }
      @Override
      public Adapter caseDirectiveDefinition(DirectiveDefinition object)
      {
        return createDirectiveDefinitionAdapter();
      }
      @Override
      public Adapter caseArgumentsDefinition(ArgumentsDefinition object)
      {
        return createArgumentsDefinitionAdapter();
      }
      @Override
      public Adapter caseDirectiveLocations(DirectiveLocations object)
      {
        return createDirectiveLocationsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.TypeSystemDefinition <em>Type System Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.TypeSystemDefinition
   * @generated
   */
  public Adapter createTypeSystemDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.SchemaDefinition <em>Schema Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.SchemaDefinition
   * @generated
   */
  public Adapter createSchemaDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.RootOperationTypeDefinition <em>Root Operation Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.RootOperationTypeDefinition
   * @generated
   */
  public Adapter createRootOperationTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.ScalarTypeDefinition <em>Scalar Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.ScalarTypeDefinition
   * @generated
   */
  public Adapter createScalarTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.ObjectTypeDefinition <em>Object Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.ObjectTypeDefinition
   * @generated
   */
  public Adapter createObjectTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.InterfaceDefinition <em>Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.InterfaceDefinition
   * @generated
   */
  public Adapter createInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.FieldDefinition <em>Field Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.FieldDefinition
   * @generated
   */
  public Adapter createFieldDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.UnionTypeDefinition <em>Union Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.UnionTypeDefinition
   * @generated
   */
  public Adapter createUnionTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.EnumTypeDefinition <em>Enum Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.EnumTypeDefinition
   * @generated
   */
  public Adapter createEnumTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.EnumValueDefinition <em>Enum Value Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.EnumValueDefinition
   * @generated
   */
  public Adapter createEnumValueDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.InputObjectTypeDefinition <em>Input Object Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.InputObjectTypeDefinition
   * @generated
   */
  public Adapter createInputObjectTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.InputValueDefinition <em>Input Value Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.InputValueDefinition
   * @generated
   */
  public Adapter createInputValueDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.IntersectionType <em>Intersection Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.IntersectionType
   * @generated
   */
  public Adapter createIntersectionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.NamedType <em>Named Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.NamedType
   * @generated
   */
  public Adapter createNamedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.ListType
   * @generated
   */
  public Adapter createListTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.IntValue
   * @generated
   */
  public Adapter createIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.FloatValue
   * @generated
   */
  public Adapter createFloatValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.NullValue <em>Null Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.NullValue
   * @generated
   */
  public Adapter createNullValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.BooleanValue
   * @generated
   */
  public Adapter createBooleanValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.EnumValue <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.EnumValue
   * @generated
   */
  public Adapter createEnumValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.ObjectValue <em>Object Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.ObjectValue
   * @generated
   */
  public Adapter createObjectValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.ObjectField <em>Object Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.ObjectField
   * @generated
   */
  public Adapter createObjectFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.ConstValue <em>Const Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.ConstValue
   * @generated
   */
  public Adapter createConstValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.ListValue <em>List Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.ListValue
   * @generated
   */
  public Adapter createListValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.DirectiveDefinition <em>Directive Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.DirectiveDefinition
   * @generated
   */
  public Adapter createDirectiveDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.ArgumentsDefinition <em>Arguments Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.ArgumentsDefinition
   * @generated
   */
  public Adapter createArgumentsDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.katmatt.graphql.graphQL.DirectiveLocations <em>Directive Locations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.katmatt.graphql.graphQL.DirectiveLocations
   * @generated
   */
  public Adapter createDirectiveLocationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GraphQLAdapterFactory
