/*
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.serializer;

import com.google.inject.Inject;
import io.github.katmatt.graphql.graphQL.Argument;
import io.github.katmatt.graphql.graphQL.Arguments;
import io.github.katmatt.graphql.graphQL.ArgumentsDefinition;
import io.github.katmatt.graphql.graphQL.BooleanValue;
import io.github.katmatt.graphql.graphQL.Directive;
import io.github.katmatt.graphql.graphQL.DirectiveDefinition;
import io.github.katmatt.graphql.graphQL.DirectiveLocations;
import io.github.katmatt.graphql.graphQL.EnumTypeDefinition;
import io.github.katmatt.graphql.graphQL.EnumValue;
import io.github.katmatt.graphql.graphQL.EnumValueDefinition;
import io.github.katmatt.graphql.graphQL.FieldDefinition;
import io.github.katmatt.graphql.graphQL.FloatValue;
import io.github.katmatt.graphql.graphQL.GraphQLPackage;
import io.github.katmatt.graphql.graphQL.InputObjectTypeDefinition;
import io.github.katmatt.graphql.graphQL.InputValueDefinition;
import io.github.katmatt.graphql.graphQL.IntValue;
import io.github.katmatt.graphql.graphQL.InterfaceDefinition;
import io.github.katmatt.graphql.graphQL.IntersectionType;
import io.github.katmatt.graphql.graphQL.ListType;
import io.github.katmatt.graphql.graphQL.ListValue;
import io.github.katmatt.graphql.graphQL.NamedType;
import io.github.katmatt.graphql.graphQL.NullValue;
import io.github.katmatt.graphql.graphQL.ObjectField;
import io.github.katmatt.graphql.graphQL.ObjectTypeDefinition;
import io.github.katmatt.graphql.graphQL.ObjectValue;
import io.github.katmatt.graphql.graphQL.RootOperationTypeDefinition;
import io.github.katmatt.graphql.graphQL.ScalarTypeDefinition;
import io.github.katmatt.graphql.graphQL.SchemaDefinition;
import io.github.katmatt.graphql.graphQL.StringValue;
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
			case GraphQLPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case GraphQLPackage.ARGUMENTS:
				sequence_Arguments(context, (Arguments) semanticObject); 
				return; 
			case GraphQLPackage.ARGUMENTS_DEFINITION:
				sequence_ArgumentsDefinition(context, (ArgumentsDefinition) semanticObject); 
				return; 
			case GraphQLPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case GraphQLPackage.DIRECTIVE:
				sequence_Directive(context, (Directive) semanticObject); 
				return; 
			case GraphQLPackage.DIRECTIVE_DEFINITION:
				sequence_DirectiveDefinition(context, (DirectiveDefinition) semanticObject); 
				return; 
			case GraphQLPackage.DIRECTIVE_LOCATIONS:
				sequence_DirectiveLocations(context, (DirectiveLocations) semanticObject); 
				return; 
			case GraphQLPackage.ENUM_TYPE_DEFINITION:
				sequence_EnumTypeDefinition(context, (EnumTypeDefinition) semanticObject); 
				return; 
			case GraphQLPackage.ENUM_VALUE:
				sequence_EnumValue(context, (EnumValue) semanticObject); 
				return; 
			case GraphQLPackage.ENUM_VALUE_DEFINITION:
				sequence_EnumValueDefinition(context, (EnumValueDefinition) semanticObject); 
				return; 
			case GraphQLPackage.FIELD_DEFINITION:
				sequence_FieldDefinition(context, (FieldDefinition) semanticObject); 
				return; 
			case GraphQLPackage.FLOAT_VALUE:
				sequence_FloatValue(context, (FloatValue) semanticObject); 
				return; 
			case GraphQLPackage.INPUT_OBJECT_TYPE_DEFINITION:
				sequence_InputObjectTypeDefinition(context, (InputObjectTypeDefinition) semanticObject); 
				return; 
			case GraphQLPackage.INPUT_VALUE_DEFINITION:
				sequence_InputValueDefinition(context, (InputValueDefinition) semanticObject); 
				return; 
			case GraphQLPackage.INT_VALUE:
				sequence_IntValue(context, (IntValue) semanticObject); 
				return; 
			case GraphQLPackage.INTERFACE_DEFINITION:
				sequence_InterfaceDefinition(context, (InterfaceDefinition) semanticObject); 
				return; 
			case GraphQLPackage.INTERSECTION_TYPE:
				sequence_IntersectionType(context, (IntersectionType) semanticObject); 
				return; 
			case GraphQLPackage.LIST_TYPE:
				sequence_ListType(context, (ListType) semanticObject); 
				return; 
			case GraphQLPackage.LIST_VALUE:
				sequence_ListValue(context, (ListValue) semanticObject); 
				return; 
			case GraphQLPackage.NAMED_TYPE:
				sequence_NamedType(context, (NamedType) semanticObject); 
				return; 
			case GraphQLPackage.NULL_VALUE:
				sequence_NullValue(context, (NullValue) semanticObject); 
				return; 
			case GraphQLPackage.OBJECT_FIELD:
				sequence_ObjectField(context, (ObjectField) semanticObject); 
				return; 
			case GraphQLPackage.OBJECT_TYPE_DEFINITION:
				sequence_ObjectTypeDefinition(context, (ObjectTypeDefinition) semanticObject); 
				return; 
			case GraphQLPackage.OBJECT_VALUE:
				sequence_ObjectValue(context, (ObjectValue) semanticObject); 
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
			case GraphQLPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
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
	 *     Argument returns Argument
	 *
	 * Constraint:
	 *     (argumentDefinition=[InputValueDefinition|NAME] value=ConstValue)
	 */
	protected void sequence_Argument(ISerializationContext context, Argument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.ARGUMENT__ARGUMENT_DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.ARGUMENT__ARGUMENT_DEFINITION));
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.ARGUMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.ARGUMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgumentAccess().getArgumentDefinitionInputValueDefinitionNAMETerminalRuleCall_0_0_1(), semanticObject.eGet(GraphQLPackage.Literals.ARGUMENT__ARGUMENT_DEFINITION, false));
		feeder.accept(grammarAccess.getArgumentAccess().getValueConstValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ArgumentsDefinition returns ArgumentsDefinition
	 *
	 * Constraint:
	 *     argumentDefinitions+=InputValueDefinition*
	 */
	protected void sequence_ArgumentsDefinition(ISerializationContext context, ArgumentsDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Arguments returns Arguments
	 *
	 * Constraint:
	 *     arguments+=Argument*
	 */
	protected void sequence_Arguments(ISerializationContext context, Arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BooleanValue returns BooleanValue
	 *     ConstValue returns BooleanValue
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_BooleanValue(ISerializationContext context, BooleanValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DirectiveDefinition returns DirectiveDefinition
	 *
	 * Constraint:
	 *     (
	 *         description=StringValue? 
	 *         name=DIRECTIVE_NAME 
	 *         argumentDefinitions=ArgumentsDefinition? 
	 *         repeatable?='repeatable'? 
	 *         directiveLocations+=DirectiveLocations
	 *     )
	 */
	protected void sequence_DirectiveDefinition(ISerializationContext context, DirectiveDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DirectiveLocations returns DirectiveLocations
	 *
	 * Constraint:
	 *     (directiveLocations+=DirectiveLocation directiveLocations+=DirectiveLocation*)
	 */
	protected void sequence_DirectiveLocations(ISerializationContext context, DirectiveLocations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns Directive
	 *
	 * Constraint:
	 *     (name=DIRECTIVE_NAME arguments=Arguments?)
	 */
	protected void sequence_Directive(ISerializationContext context, Directive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns EnumTypeDefinition
	 *     EnumTypeDefinition returns EnumTypeDefinition
	 *
	 * Constraint:
	 *     (description=StringValue? name=NAME valueDefinitions+=EnumValueDefinition*)
	 */
	protected void sequence_EnumTypeDefinition(ISerializationContext context, EnumTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumValueDefinition returns EnumValueDefinition
	 *
	 * Constraint:
	 *     (description=StringValue? name=NAME)
	 */
	protected void sequence_EnumValueDefinition(ISerializationContext context, EnumValueDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumValue returns EnumValue
	 *     ConstValue returns EnumValue
	 *
	 * Constraint:
	 *     value=[EnumValueDefinition|NAME]
	 */
	protected void sequence_EnumValue(ISerializationContext context, EnumValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.ENUM_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.ENUM_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumValueAccess().getValueEnumValueDefinitionNAMETerminalRuleCall_0_1(), semanticObject.eGet(GraphQLPackage.Literals.ENUM_VALUE__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FieldDefinition returns FieldDefinition
	 *
	 * Constraint:
	 *     (description=StringValue? name=NAME arguments=ArgumentsDefinition? type=Type)
	 */
	protected void sequence_FieldDefinition(ISerializationContext context, FieldDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FloatValue returns FloatValue
	 *     ConstValue returns FloatValue
	 *
	 * Constraint:
	 *     value=FLOAT_VALUE
	 */
	protected void sequence_FloatValue(ISerializationContext context, FloatValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.FLOAT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.FLOAT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatValueAccess().getValueFLOAT_VALUETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns InputObjectTypeDefinition
	 *     InputObjectTypeDefinition returns InputObjectTypeDefinition
	 *
	 * Constraint:
	 *     (description=StringValue? name=NAME inputsFieldDefinitions+=InputValueDefinition*)
	 */
	protected void sequence_InputObjectTypeDefinition(ISerializationContext context, InputObjectTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InputValueDefinition returns InputValueDefinition
	 *
	 * Constraint:
	 *     (description=StringValue? name=NAME type=Type defaultValue=ConstValue?)
	 */
	protected void sequence_InputValueDefinition(ISerializationContext context, InputValueDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntValue returns IntValue
	 *     ConstValue returns IntValue
	 *
	 * Constraint:
	 *     value=INT_VALUE
	 */
	protected void sequence_IntValue(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.INT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINT_VALUETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns InterfaceDefinition
	 *     InterfaceDefinition returns InterfaceDefinition
	 *
	 * Constraint:
	 *     (description=StringValue? name=NAME implements=IntersectionType? fieldDefinitions+=FieldDefinition*)
	 */
	protected void sequence_InterfaceDefinition(ISerializationContext context, InterfaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntersectionType returns IntersectionType
	 *
	 * Constraint:
	 *     (memberTypes+=Type memberTypes+=Type*)
	 */
	protected void sequence_IntersectionType(ISerializationContext context, IntersectionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns ListType
	 *     ListType returns ListType
	 *
	 * Constraint:
	 *     (type=Type nonNull?='!'?)
	 */
	protected void sequence_ListType(ISerializationContext context, ListType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstValue returns ListValue
	 *     ListValue returns ListValue
	 *
	 * Constraint:
	 *     values+=ConstValue*
	 */
	protected void sequence_ListValue(ISerializationContext context, ListValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns NamedType
	 *     NamedType returns NamedType
	 *
	 * Constraint:
	 *     (typeDefinition=[TypeDefinition|NAME] nonNull?='!'?)
	 */
	protected void sequence_NamedType(ISerializationContext context, NamedType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NullValue returns NullValue
	 *     ConstValue returns NullValue
	 *
	 * Constraint:
	 *     value='null'
	 */
	protected void sequence_NullValue(ISerializationContext context, NullValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.NULL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.NULL_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNullValueAccess().getValueNullKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObjectField returns ObjectField
	 *
	 * Constraint:
	 *     (name=[FieldDefinition|NAME] value=ConstValue)
	 */
	protected void sequence_ObjectField(ISerializationContext context, ObjectField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.OBJECT_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.OBJECT_FIELD__NAME));
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.OBJECT_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.OBJECT_FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectFieldAccess().getNameFieldDefinitionNAMETerminalRuleCall_0_0_1(), semanticObject.eGet(GraphQLPackage.Literals.OBJECT_FIELD__NAME, false));
		feeder.accept(grammarAccess.getObjectFieldAccess().getValueConstValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns ObjectTypeDefinition
	 *     ObjectTypeDefinition returns ObjectTypeDefinition
	 *
	 * Constraint:
	 *     (description=StringValue? name=NAME implements=IntersectionType? directives+=Directive* fieldDefinitions+=FieldDefinition*)
	 */
	protected void sequence_ObjectTypeDefinition(ISerializationContext context, ObjectTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectValue returns ObjectValue
	 *     ConstValue returns ObjectValue
	 *
	 * Constraint:
	 *     fields+=ObjectField*
	 */
	protected void sequence_ObjectValue(ISerializationContext context, ObjectValue semanticObject) {
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
	 *     (description=StringValue? name=NAME)
	 */
	protected void sequence_ScalarTypeDefinition(ISerializationContext context, ScalarTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SchemaDefinition returns SchemaDefinition
	 *
	 * Constraint:
	 *     (description=StringValue? typeDefinitions+=RootOperationTypeDefinition+)
	 */
	protected void sequence_SchemaDefinition(ISerializationContext context, SchemaDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringValue returns StringValue
	 *     ConstValue returns StringValue
	 *
	 * Constraint:
	 *     (value=SL_STRING_VALUE | value=ML_STRING_VALUE)
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeSystemDefinition returns TypeSystemDefinition
	 *
	 * Constraint:
	 *     (schemaDefinitions+=SchemaDefinition | typeDefinitions+=TypeDefinition | directiveDefinitions+=DirectiveDefinition)+
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
	 *     (description=StringValue? name=NAME (memberTypes+=Type memberTypes+=Type*)?)
	 */
	protected void sequence_UnionTypeDefinition(ISerializationContext context, UnionTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
