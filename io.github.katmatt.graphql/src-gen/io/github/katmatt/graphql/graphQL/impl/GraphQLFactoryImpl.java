/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL.impl;

import io.github.katmatt.graphql.graphQL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphQLFactoryImpl extends EFactoryImpl implements GraphQLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GraphQLFactory init()
  {
    try
    {
      GraphQLFactory theGraphQLFactory = (GraphQLFactory)EPackage.Registry.INSTANCE.getEFactory(GraphQLPackage.eNS_URI);
      if (theGraphQLFactory != null)
      {
        return theGraphQLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GraphQLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphQLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GraphQLPackage.TYPE_SYSTEM_DEFINITION: return createTypeSystemDefinition();
      case GraphQLPackage.SCHEMA_DEFINITION: return createSchemaDefinition();
      case GraphQLPackage.ROOT_OPERATION_TYPE_DEFINITION: return createRootOperationTypeDefinition();
      case GraphQLPackage.TYPE_DEFINITION: return createTypeDefinition();
      case GraphQLPackage.SCALAR_TYPE_DEFINITION: return createScalarTypeDefinition();
      case GraphQLPackage.OBJECT_TYPE_DEFINITION: return createObjectTypeDefinition();
      case GraphQLPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
      case GraphQLPackage.FIELD_DEFINITION: return createFieldDefinition();
      case GraphQLPackage.UNION_TYPE_DEFINITION: return createUnionTypeDefinition();
      case GraphQLPackage.ENUM_TYPE_DEFINITION: return createEnumTypeDefinition();
      case GraphQLPackage.ENUM_VALUE_DEFINITION: return createEnumValueDefinition();
      case GraphQLPackage.INPUT_OBJECT_TYPE_DEFINITION: return createInputObjectTypeDefinition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GraphQLPackage.OPERATION_TYPE:
        return createOperationTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GraphQLPackage.OPERATION_TYPE:
        return convertOperationTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeSystemDefinition createTypeSystemDefinition()
  {
    TypeSystemDefinitionImpl typeSystemDefinition = new TypeSystemDefinitionImpl();
    return typeSystemDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SchemaDefinition createSchemaDefinition()
  {
    SchemaDefinitionImpl schemaDefinition = new SchemaDefinitionImpl();
    return schemaDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RootOperationTypeDefinition createRootOperationTypeDefinition()
  {
    RootOperationTypeDefinitionImpl rootOperationTypeDefinition = new RootOperationTypeDefinitionImpl();
    return rootOperationTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScalarTypeDefinition createScalarTypeDefinition()
  {
    ScalarTypeDefinitionImpl scalarTypeDefinition = new ScalarTypeDefinitionImpl();
    return scalarTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectTypeDefinition createObjectTypeDefinition()
  {
    ObjectTypeDefinitionImpl objectTypeDefinition = new ObjectTypeDefinitionImpl();
    return objectTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InterfaceDefinition createInterfaceDefinition()
  {
    InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionImpl();
    return interfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldDefinition createFieldDefinition()
  {
    FieldDefinitionImpl fieldDefinition = new FieldDefinitionImpl();
    return fieldDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnionTypeDefinition createUnionTypeDefinition()
  {
    UnionTypeDefinitionImpl unionTypeDefinition = new UnionTypeDefinitionImpl();
    return unionTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumTypeDefinition createEnumTypeDefinition()
  {
    EnumTypeDefinitionImpl enumTypeDefinition = new EnumTypeDefinitionImpl();
    return enumTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumValueDefinition createEnumValueDefinition()
  {
    EnumValueDefinitionImpl enumValueDefinition = new EnumValueDefinitionImpl();
    return enumValueDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputObjectTypeDefinition createInputObjectTypeDefinition()
  {
    InputObjectTypeDefinitionImpl inputObjectTypeDefinition = new InputObjectTypeDefinitionImpl();
    return inputObjectTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue)
  {
    OperationType result = OperationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GraphQLPackage getGraphQLPackage()
  {
    return (GraphQLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GraphQLPackage getPackage()
  {
    return GraphQLPackage.eINSTANCE;
  }

} //GraphQLFactoryImpl