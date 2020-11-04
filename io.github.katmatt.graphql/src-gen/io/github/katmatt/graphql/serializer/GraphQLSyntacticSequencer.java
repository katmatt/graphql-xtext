/*
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.serializer;

import com.google.inject.Inject;
import io.github.katmatt.graphql.services.GraphQLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GraphQLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GraphQLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DirectiveDefinition_VerticalLineKeyword_6_q;
	protected AbstractElementAlias match_DirectiveDefinition___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_Directive___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_EnumTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_FieldDefinition___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_InputObjectTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_InterfaceDefinition_AmpersandKeyword_3_1_q;
	protected AbstractElementAlias match_InterfaceDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	protected AbstractElementAlias match_ObjectTypeDefinition_AmpersandKeyword_3_1_q;
	protected AbstractElementAlias match_ObjectTypeDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	protected AbstractElementAlias match_UnionTypeDefinition_VerticalLineKeyword_4_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GraphQLGrammarAccess) access;
		match_DirectiveDefinition_VerticalLineKeyword_6_q = new TokenAlias(false, true, grammarAccess.getDirectiveDefinitionAccess().getVerticalLineKeyword_6());
		match_DirectiveDefinition___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectiveDefinitionAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDirectiveDefinitionAccess().getRightParenthesisKeyword_3_2()));
		match_Directive___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectiveAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDirectiveAccess().getRightParenthesisKeyword_1_2()));
		match_EnumTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2()));
		match_FieldDefinition___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFieldDefinitionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getFieldDefinitionAccess().getRightParenthesisKeyword_2_2()));
		match_InputObjectTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2()));
		match_InterfaceDefinition_AmpersandKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getInterfaceDefinitionAccess().getAmpersandKeyword_3_1());
		match_InterfaceDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_5_2()));
		match_ObjectTypeDefinition_AmpersandKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getObjectTypeDefinitionAccess().getAmpersandKeyword_3_1());
		match_ObjectTypeDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_5_2()));
		match_UnionTypeDefinition_VerticalLineKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_4_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DirectiveDefinition_VerticalLineKeyword_6_q.equals(syntax))
				emit_DirectiveDefinition_VerticalLineKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DirectiveDefinition___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_DirectiveDefinition___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Directive___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_Directive___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EnumTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_EnumTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FieldDefinition___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_FieldDefinition___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InputObjectTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_InputObjectTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InterfaceDefinition_AmpersandKeyword_3_1_q.equals(syntax))
				emit_InterfaceDefinition_AmpersandKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InterfaceDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_InterfaceDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectTypeDefinition_AmpersandKeyword_3_1_q.equals(syntax))
				emit_ObjectTypeDefinition_AmpersandKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectTypeDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_ObjectTypeDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UnionTypeDefinition_VerticalLineKeyword_4_1_q.equals(syntax))
				emit_UnionTypeDefinition_VerticalLineKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '|'?
	 *
	 * This ambiguous syntax occurs at:
	 *     argumentsDefinition+=InputValueDefinition ')' 'on' (ambiguity) directiveLocations+=DirectiveLocation
	 *     name=DIRECTIVE_NAME ('(' ')')? 'on' (ambiguity) directiveLocations+=DirectiveLocation
	 *     repeatable?='repeatable' 'on' (ambiguity) directiveLocations+=DirectiveLocation
	 */
	protected void emit_DirectiveDefinition_VerticalLineKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=DIRECTIVE_NAME (ambiguity) 'on' '|'? directiveLocations+=DirectiveLocation
	 *     name=DIRECTIVE_NAME (ambiguity) repeatable?='repeatable'
	 */
	protected void emit_DirectiveDefinition___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     directive=[DirectiveDefinition|DIRECTIVE_NAME] (ambiguity) (rule end)
	 */
	protected void emit_Directive___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     directives+=Directive (ambiguity) (rule end)
	 *     name=NAME (ambiguity) (rule end)
	 */
	protected void emit_EnumTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NAME (ambiguity) ':' type=Type
	 */
	protected void emit_FieldDefinition___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     directives+=Directive (ambiguity) (rule end)
	 *     name=NAME (ambiguity) (rule end)
	 */
	protected void emit_InputObjectTypeDefinition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '&'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NAME 'implements' (ambiguity) implementsInterfaces+=[InterfaceDefinition|NAME]
	 */
	protected void emit_InterfaceDefinition_AmpersandKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     directives+=Directive (ambiguity) (rule end)
	 *     implementsInterfaces+=[InterfaceDefinition|NAME] (ambiguity) (rule end)
	 *     name=NAME (ambiguity) (rule end)
	 */
	protected void emit_InterfaceDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '&'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NAME 'implements' (ambiguity) implementsInterfaces+=[InterfaceDefinition|NAME]
	 */
	protected void emit_ObjectTypeDefinition_AmpersandKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     directives+=Directive (ambiguity) (rule end)
	 *     implementsInterfaces+=[InterfaceDefinition|NAME] (ambiguity) (rule end)
	 *     name=NAME (ambiguity) (rule end)
	 */
	protected void emit_ObjectTypeDefinition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '|'?
	 *
	 * This ambiguous syntax occurs at:
	 *     directives+=Directive '=' (ambiguity) memberTypes+=Type
	 *     name=NAME '=' (ambiguity) memberTypes+=Type
	 */
	protected void emit_UnionTypeDefinition_VerticalLineKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
