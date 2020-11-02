/*
 * generated by Xtext 2.23.0
 */
grammar InternalGraphQL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package io.github.katmatt.graphql.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package io.github.katmatt.graphql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import io.github.katmatt.graphql.services.GraphQLGrammarAccess;

}

@parser::members {

 	private GraphQLGrammarAccess grammarAccess;

    public InternalGraphQLParser(TokenStream input, GraphQLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TypeSystemDefinition";
   	}

   	@Override
   	protected GraphQLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTypeSystemDefinition
entryRuleTypeSystemDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeSystemDefinitionRule()); }
	iv_ruleTypeSystemDefinition=ruleTypeSystemDefinition
	{ $current=$iv_ruleTypeSystemDefinition.current; }
	EOF;

// Rule TypeSystemDefinition
ruleTypeSystemDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsSchemaDefinitionParserRuleCall_0_0());
				}
				lv_schemaDefinitions_0_0=ruleSchemaDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeSystemDefinitionRule());
					}
					add(
						$current,
						"schemaDefinitions",
						lv_schemaDefinitions_0_0,
						"io.github.katmatt.graphql.GraphQL.SchemaDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsTypeDefinitionParserRuleCall_1_0());
				}
				lv_typeDefinitions_1_0=ruleTypeDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeSystemDefinitionRule());
					}
					add(
						$current,
						"typeDefinitions",
						lv_typeDefinitions_1_0,
						"io.github.katmatt.graphql.GraphQL.TypeDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRuleSchemaDefinition
entryRuleSchemaDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSchemaDefinitionRule()); }
	iv_ruleSchemaDefinition=ruleSchemaDefinition
	{ $current=$iv_ruleSchemaDefinition.current; }
	EOF;

// Rule SchemaDefinition
ruleSchemaDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='schema'
		{
			newLeafNode(otherlv_0, grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsRootOperationTypeDefinitionParserRuleCall_2_0());
				}
				lv_typeDefinitions_2_0=ruleRootOperationTypeDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSchemaDefinitionRule());
					}
					add(
						$current,
						"typeDefinitions",
						lv_typeDefinitions_2_0,
						"io.github.katmatt.graphql.GraphQL.RootOperationTypeDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getSchemaDefinitionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleRootOperationTypeDefinition
entryRuleRootOperationTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootOperationTypeDefinitionRule()); }
	iv_ruleRootOperationTypeDefinition=ruleRootOperationTypeDefinition
	{ $current=$iv_ruleRootOperationTypeDefinition.current; }
	EOF;

// Rule RootOperationTypeDefinition
ruleRootOperationTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeOperationTypeEnumRuleCall_0_0());
				}
				lv_operationType_0_0=ruleOperationType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootOperationTypeDefinitionRule());
					}
					set(
						$current,
						"operationType",
						lv_operationType_0_0,
						"io.github.katmatt.graphql.GraphQL.OperationType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getRootOperationTypeDefinitionAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRootOperationTypeDefinitionRule());
					}
				}
				otherlv_2=RULE_NAME
				{
					newLeafNode(otherlv_2, grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleTypeDefinition
entryRuleTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeDefinitionRule()); }
	iv_ruleTypeDefinition=ruleTypeDefinition
	{ $current=$iv_ruleTypeDefinition.current; }
	EOF;

// Rule TypeDefinition
ruleTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getScalarTypeDefinitionParserRuleCall_0());
		}
		this_ScalarTypeDefinition_0=ruleScalarTypeDefinition
		{
			$current = $this_ScalarTypeDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getObjectTypeDefinitionParserRuleCall_1());
		}
		this_ObjectTypeDefinition_1=ruleObjectTypeDefinition
		{
			$current = $this_ObjectTypeDefinition_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getInterfaceDefinitionParserRuleCall_2());
		}
		this_InterfaceDefinition_2=ruleInterfaceDefinition
		{
			$current = $this_InterfaceDefinition_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getUnionTypeDefinitionParserRuleCall_3());
		}
		this_UnionTypeDefinition_3=ruleUnionTypeDefinition
		{
			$current = $this_UnionTypeDefinition_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumTypeDefinitionParserRuleCall_4());
		}
		this_EnumTypeDefinition_4=ruleEnumTypeDefinition
		{
			$current = $this_EnumTypeDefinition_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getInputObjectTypeDefinitionParserRuleCall_5());
		}
		this_InputObjectTypeDefinition_5=ruleInputObjectTypeDefinition
		{
			$current = $this_InputObjectTypeDefinition_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleScalarTypeDefinition
entryRuleScalarTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScalarTypeDefinitionRule()); }
	iv_ruleScalarTypeDefinition=ruleScalarTypeDefinition
	{ $current=$iv_ruleScalarTypeDefinition.current; }
	EOF;

// Rule ScalarTypeDefinition
ruleScalarTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='scalar'
		{
			newLeafNode(otherlv_0, grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarTypeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"io.github.katmatt.graphql.GraphQL.NAME");
				}
			)
		)
	)
;

// Entry rule entryRuleObjectTypeDefinition
entryRuleObjectTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectTypeDefinitionRule()); }
	iv_ruleObjectTypeDefinition=ruleObjectTypeDefinition
	{ $current=$iv_ruleObjectTypeDefinition.current; }
	EOF;

// Rule ObjectTypeDefinition
ruleObjectTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectTypeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"io.github.katmatt.graphql.GraphQL.NAME");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0());
					}
					lv_fieldDefinitions_3_0=ruleFieldDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
						}
						add(
							$current,
							"fieldDefinitions",
							lv_fieldDefinitions_3_0,
							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_4='}'
			{
				newLeafNode(otherlv_4, grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2());
			}
		)?
	)
;

// Entry rule entryRuleInterfaceDefinition
entryRuleInterfaceDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); }
	iv_ruleInterfaceDefinition=ruleInterfaceDefinition
	{ $current=$iv_ruleInterfaceDefinition.current; }
	EOF;

// Rule InterfaceDefinition
ruleInterfaceDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='interface'
		{
			newLeafNode(otherlv_0, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"io.github.katmatt.graphql.GraphQL.NAME");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0());
					}
					lv_fieldDefinitions_3_0=ruleFieldDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
						}
						add(
							$current,
							"fieldDefinitions",
							lv_fieldDefinitions_3_0,
							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_4='}'
			{
				newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_2_2());
			}
		)?
	)
;

// Entry rule entryRuleFieldDefinition
entryRuleFieldDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldDefinitionRule()); }
	iv_ruleFieldDefinition=ruleFieldDefinition
	{ $current=$iv_ruleFieldDefinition.current; }
	EOF;

// Rule FieldDefinition
ruleFieldDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_NAME
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFieldDefinitionAccess().getNameNAMETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"io.github.katmatt.graphql.GraphQL.NAME");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFieldDefinitionAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldDefinitionRule());
					}
				}
				otherlv_2=RULE_NAME
				{
					newLeafNode(otherlv_2, grammarAccess.getFieldDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleUnionTypeDefinition
entryRuleUnionTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnionTypeDefinitionRule()); }
	iv_ruleUnionTypeDefinition=ruleUnionTypeDefinition
	{ $current=$iv_ruleUnionTypeDefinition.current; }
	EOF;

// Rule UnionTypeDefinition
ruleUnionTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='union'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnionTypeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"io.github.katmatt.graphql.GraphQL.NAME");
				}
			)
		)
		(
			otherlv_2='='
			{
				newLeafNode(otherlv_2, grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUnionTypeDefinitionRule());
						}
					}
					otherlv_3=RULE_NAME
					{
						newLeafNode(otherlv_3, grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionCrossReference_2_1_0());
					}
				)
			)
			(
				otherlv_4='|'
				{
					newLeafNode(otherlv_4, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUnionTypeDefinitionRule());
							}
						}
						otherlv_5=RULE_NAME
						{
							newLeafNode(otherlv_5, grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionCrossReference_2_2_1_0());
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleEnumTypeDefinition
entryRuleEnumTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumTypeDefinitionRule()); }
	iv_ruleEnumTypeDefinition=ruleEnumTypeDefinition
	{ $current=$iv_ruleEnumTypeDefinition.current; }
	EOF;

// Rule EnumTypeDefinition
ruleEnumTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='enum'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnumTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumTypeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"io.github.katmatt.graphql.GraphQL.NAME");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_2_1_0());
					}
					lv_valueDefinitions_3_0=ruleEnumValueDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumTypeDefinitionRule());
						}
						add(
							$current,
							"valueDefinitions",
							lv_valueDefinitions_3_0,
							"io.github.katmatt.graphql.GraphQL.EnumValueDefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4='}'
			{
				newLeafNode(otherlv_4, grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2());
			}
		)?
	)
;

// Entry rule entryRuleEnumValueDefinition
entryRuleEnumValueDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumValueDefinitionRule()); }
	iv_ruleEnumValueDefinition=ruleEnumValueDefinition
	{ $current=$iv_ruleEnumValueDefinition.current; }
	EOF;

// Rule EnumValueDefinition
ruleEnumValueDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_NAME
			{
				newLeafNode(lv_name_0_0, grammarAccess.getEnumValueDefinitionAccess().getNameNAMETerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEnumValueDefinitionRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"io.github.katmatt.graphql.GraphQL.NAME");
			}
		)
	)
;

// Entry rule entryRuleInputObjectTypeDefinition
entryRuleInputObjectTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputObjectTypeDefinitionRule()); }
	iv_ruleInputObjectTypeDefinition=ruleInputObjectTypeDefinition
	{ $current=$iv_ruleInputObjectTypeDefinition.current; }
	EOF;

// Rule InputObjectTypeDefinition
ruleInputObjectTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='input'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInputObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputObjectTypeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"io.github.katmatt.graphql.GraphQL.NAME");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0());
					}
					lv_fieldDefinitions_3_0=ruleFieldDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInputObjectTypeDefinitionRule());
						}
						add(
							$current,
							"fieldDefinitions",
							lv_fieldDefinitions_3_0,
							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_4='}'
			{
				newLeafNode(otherlv_4, grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2());
			}
		)?
	)
;

// Rule OperationType
ruleOperationType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='query'
			{
				$current = grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='mutation'
			{
				$current = grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='subscription'
			{
				$current = grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_NAME : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_COMMA : ',';