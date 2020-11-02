/*
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.serializer;

import com.google.inject.Inject;
import io.github.katmatt.graphql.graphQL.EnumTypeDefinition;
import io.github.katmatt.graphql.graphQL.EnumValueDefinition;
import io.github.katmatt.graphql.graphQL.FieldDefinition;
import io.github.katmatt.graphql.graphQL.GraphQLPackage;
import io.github.katmatt.graphql.graphQL.InputObjectTypeDefinition;
import io.github.katmatt.graphql.graphQL.InterfaceDefinition;
import io.github.katmatt.graphql.graphQL.ObjectTypeDefinition;
import io.github.katmatt.graphql.graphQL.RootOperationTypeDefinition;
import io.github.katmatt.graphql.graphQL.ScalarTypeDefinition;
import io.github.katmatt.graphql.graphQL.SchemaDefinition;
import io.github.katmatt.graphql.graphQL.TypeSystemDefinition;
import io.github.katmatt.graphql.graphQL.UnionTypeDefinition;
import io.github.katmatt.graphql.services.GraphQLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GraphQLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GraphQLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GraphQLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GraphQLPackage.ENUM_TYPE_DEFINITION:
				sequence_EnumTypeDefinition(context, (EnumTypeDefinition) semanticObject); 
				return; 
			case GraphQLPackage.ENUM_VALUE_DEFINITION:
				sequence_EnumValueDefinition(context, (EnumValueDefinition) semanticObject); 
				return; 
			case GraphQLPackage.FIELD_DEFINITION:
				sequence_FieldDefinition(context, (FieldDefinition) semanticObject); 
				return; 
			case GraphQLPackage.INPUT_OBJECT_TYPE_DEFINITION:
				sequence_InputObjectTypeDefinition(context, (InputObjectTypeDefinition) semanticObject); 
				return; 
			case GraphQLPackage.INTERFACE_DEFINITION:
				sequence_InterfaceDefinition(context, (InterfaceDefinition) semanticObject); 
				return; 
			case GraphQLPackage.OBJECT_TYPE_DEFINITION:
				sequence_ObjectTypeDefinition(context, (ObjectTypeDefinition) semanticObject); 
				return; 
			case GraphQLPackage.ROOT_OPERATION_TYPE_DEFINITION:
				sequence_RootOperationTypeDefinition(context, (RootOperationTypeDefinition) semanticObject); 
				return; 
			case GraphQLPackage.SCALAR_TYPE_DEFINITION:
				sequence_ScalarTypeDefinition(context, (ScalarTypeDefinition) semanticObject); 
				return; 
			case GraphQLPackage.SCHEMA_DEFINITION:
				sequence_SchemaDefinition(context, (SchemaDefinition) semanticObject); 
				return; 
			case GraphQLPackage.TYPE_SYSTEM_DEFINITION:
				sequence_TypeSystemDefinition(context, (TypeSystemDefinition) semanticObject); 
				return; 
			case GraphQLPackage.UNION_TYPE_DEFINITION:
				sequence_UnionTypeDefinition(context, (UnionTypeDefinition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TypeDefinition returns EnumTypeDefinition
	 *     EnumTypeDefinition returns EnumTypeDefinition
	 *
	 * Constraint:
	 *     (name=NAME valueDefinitions+=EnumValueDefinition?)
	 */
	protected void sequence_EnumTypeDefinition(ISerializationContext context, EnumTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumValueDefinition returns EnumValueDefinition
	 *
	 * Constraint:
	 *     name=NAME
	 */
	protected void sequence_EnumValueDefinition(ISerializationContext context, EnumValueDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.ENUM_VALUE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.ENUM_VALUE_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumValueDefinitionAccess().getNameNAMETerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FieldDefinition returns FieldDefinition
	 *
	 * Constraint:
	 *     (name=NAME type=[TypeDefinition|NAME])
	 */
	protected void sequence_FieldDefinition(ISerializationContext context, FieldDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.FIELD_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.FIELD_DEFINITION__NAME));
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.FIELD_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.FIELD_DEFINITION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldDefinitionAccess().getNameNAMETerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFieldDefinitionAccess().getTypeTypeDefinitionNAMETerminalRuleCall_2_0_1(), semanticObject.eGet(GraphQLPackage.Literals.FIELD_DEFINITION__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns InputObjectTypeDefinition
	 *     InputObjectTypeDefinition returns InputObjectTypeDefinition
	 *
	 * Constraint:
	 *     (name=NAME fieldDefinitions+=FieldDefinition*)
	 */
	protected void sequence_InputObjectTypeDefinition(ISerializationContext context, InputObjectTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns InterfaceDefinition
	 *     InterfaceDefinition returns InterfaceDefinition
	 *
	 * Constraint:
	 *     (name=NAME fieldDefinitions+=FieldDefinition*)
	 */
	protected void sequence_InterfaceDefinition(ISerializationContext context, InterfaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns ObjectTypeDefinition
	 *     ObjectTypeDefinition returns ObjectTypeDefinition
	 *
	 * Constraint:
	 *     (name=NAME fieldDefinitions+=FieldDefinition*)
	 */
	protected void sequence_ObjectTypeDefinition(ISerializationContext context, ObjectTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootOperationTypeDefinition returns RootOperationTypeDefinition
	 *
	 * Constraint:
	 *     (operationType=OperationType type=[TypeDefinition|NAME])
	 */
	protected void sequence_RootOperationTypeDefinition(ISerializationContext context, RootOperationTypeDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.ROOT_OPERATION_TYPE_DEFINITION__OPERATION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.ROOT_OPERATION_TYPE_DEFINITION__OPERATION_TYPE));
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.ROOT_OPERATION_TYPE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.ROOT_OPERATION_TYPE_DEFINITION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeOperationTypeEnumRuleCall_0_0(), semanticObject.getOperationType());
		feeder.accept(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionNAMETerminalRuleCall_2_0_1(), semanticObject.eGet(GraphQLPackage.Literals.ROOT_OPERATION_TYPE_DEFINITION__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns ScalarTypeDefinition
	 *     ScalarTypeDefinition returns ScalarTypeDefinition
	 *
	 * Constraint:
	 *     name=NAME
	 */
	protected void sequence_ScalarTypeDefinition(ISerializationContext context, ScalarTypeDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.TYPE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.TYPE_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SchemaDefinition returns SchemaDefinition
	 *
	 * Constraint:
	 *     typeDefinitions+=RootOperationTypeDefinition+
	 */
	protected void sequence_SchemaDefinition(ISerializationContext context, SchemaDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeSystemDefinition returns TypeSystemDefinition
	 *
	 * Constraint:
	 *     (schemaDefinitions+=SchemaDefinition | typeDefinitions+=TypeDefinition)+
	 */
	protected void sequence_TypeSystemDefinition(ISerializationContext context, TypeSystemDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns UnionTypeDefinition
	 *     UnionTypeDefinition returns UnionTypeDefinition
	 *
	 * Constraint:
	 *     (name=NAME (memberTypes+=[TypeDefinition|NAME] memberTypes+=[TypeDefinition|NAME]*)?)
	 */
	protected void sequence_UnionTypeDefinition(ISerializationContext context, UnionTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}