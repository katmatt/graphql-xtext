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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_INT_VALUE", "RULE_FLOAT_VALUE", "RULE_SL_STRING_VALUE", "RULE_ML_STRING_VALUE", "RULE_DIRECTIVE_NAME", "RULE_WS", "RULE_SL_COMMENT", "RULE_COMMA", "RULE_STRING_CHARACTER", "'schema'", "'{'", "'}'", "':'", "'scalar'", "'type'", "'implements'", "'&'", "'interface'", "'('", "')'", "'union'", "'='", "'|'", "'enum'", "'input'", "'!'", "'['", "']'", "'null'", "'true'", "'false'", "'directive'", "'repeatable'", "'on'", "'QUERY'", "'MUTATION'", "'SUBSCRIPTION'", "'FIELD'", "'FRAGMENT_DEFINITION'", "'FRAGMENT_SPREAD'", "'INLINE_FRAGMENT'", "'VARIABLE_DEFINITION'", "'SCHEMA'", "'SCALAR'", "'OBJECT'", "'FIELD_DEFINITION'", "'ARGUMENT_DEFINITION'", "'INTERFACE'", "'UNION'", "'ENUM'", "'ENUM_VALUE'", "'INPUT_OBJECT'", "'INPUT_FIELD_DEFINITION'", "'query'", "'mutation'", "'subscription'"
    };
    public static final int RULE_FLOAT_VALUE=6;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_INT_VALUE=5;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_COMMA=12;
    public static final int RULE_ML_STRING_VALUE=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING_CHARACTER=13;
    public static final int RULE_NAME=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_SL_STRING_VALUE=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_DIRECTIVE_NAME=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGraphQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraphQL.g"; }



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




    // $ANTLR start "entryRuleTypeSystemDefinition"
    // InternalGraphQL.g:65:1: entryRuleTypeSystemDefinition returns [EObject current=null] : iv_ruleTypeSystemDefinition= ruleTypeSystemDefinition EOF ;
    public final EObject entryRuleTypeSystemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSystemDefinition = null;


        try {
            // InternalGraphQL.g:65:61: (iv_ruleTypeSystemDefinition= ruleTypeSystemDefinition EOF )
            // InternalGraphQL.g:66:2: iv_ruleTypeSystemDefinition= ruleTypeSystemDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeSystemDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSystemDefinition=ruleTypeSystemDefinition();

            state._fsp--;

             current =iv_ruleTypeSystemDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSystemDefinition"


    // $ANTLR start "ruleTypeSystemDefinition"
    // InternalGraphQL.g:72:1: ruleTypeSystemDefinition returns [EObject current=null] : ( ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) ) | ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) ) | ( (lv_directiveDefinitions_2_0= ruleDirectiveDefinition ) ) )* ;
    public final EObject ruleTypeSystemDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_schemaDefinitions_0_0 = null;

        EObject lv_typeDefinitions_1_0 = null;

        EObject lv_directiveDefinitions_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:78:2: ( ( ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) ) | ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) ) | ( (lv_directiveDefinitions_2_0= ruleDirectiveDefinition ) ) )* )
            // InternalGraphQL.g:79:2: ( ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) ) | ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) ) | ( (lv_directiveDefinitions_2_0= ruleDirectiveDefinition ) ) )*
            {
            // InternalGraphQL.g:79:2: ( ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) ) | ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) ) | ( (lv_directiveDefinitions_2_0= ruleDirectiveDefinition ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case RULE_SL_STRING_VALUE:
                    {
                    switch ( input.LA(2) ) {
                    case 14:
                        {
                        alt1=1;
                        }
                        break;
                    case 18:
                    case 19:
                    case 22:
                    case 25:
                    case 28:
                    case 29:
                        {
                        alt1=2;
                        }
                        break;
                    case 36:
                        {
                        alt1=3;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_ML_STRING_VALUE:
                    {
                    switch ( input.LA(2) ) {
                    case 18:
                    case 19:
                    case 22:
                    case 25:
                    case 28:
                    case 29:
                        {
                        alt1=2;
                        }
                        break;
                    case 14:
                        {
                        alt1=1;
                        }
                        break;
                    case 36:
                        {
                        alt1=3;
                        }
                        break;

                    }

                    }
                    break;
                case 14:
                    {
                    alt1=1;
                    }
                    break;
                case 18:
                case 19:
                case 22:
                case 25:
                case 28:
                case 29:
                    {
                    alt1=2;
                    }
                    break;
                case 36:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalGraphQL.g:80:3: ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) )
            	    {
            	    // InternalGraphQL.g:80:3: ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) )
            	    // InternalGraphQL.g:81:4: (lv_schemaDefinitions_0_0= ruleSchemaDefinition )
            	    {
            	    // InternalGraphQL.g:81:4: (lv_schemaDefinitions_0_0= ruleSchemaDefinition )
            	    // InternalGraphQL.g:82:5: lv_schemaDefinitions_0_0= ruleSchemaDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsSchemaDefinitionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_schemaDefinitions_0_0=ruleSchemaDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeSystemDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"schemaDefinitions",
            	    						lv_schemaDefinitions_0_0,
            	    						"io.github.katmatt.graphql.GraphQL.SchemaDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGraphQL.g:100:3: ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) )
            	    {
            	    // InternalGraphQL.g:100:3: ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) )
            	    // InternalGraphQL.g:101:4: (lv_typeDefinitions_1_0= ruleTypeDefinition )
            	    {
            	    // InternalGraphQL.g:101:4: (lv_typeDefinitions_1_0= ruleTypeDefinition )
            	    // InternalGraphQL.g:102:5: lv_typeDefinitions_1_0= ruleTypeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsTypeDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_typeDefinitions_1_0=ruleTypeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeSystemDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeDefinitions",
            	    						lv_typeDefinitions_1_0,
            	    						"io.github.katmatt.graphql.GraphQL.TypeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGraphQL.g:120:3: ( (lv_directiveDefinitions_2_0= ruleDirectiveDefinition ) )
            	    {
            	    // InternalGraphQL.g:120:3: ( (lv_directiveDefinitions_2_0= ruleDirectiveDefinition ) )
            	    // InternalGraphQL.g:121:4: (lv_directiveDefinitions_2_0= ruleDirectiveDefinition )
            	    {
            	    // InternalGraphQL.g:121:4: (lv_directiveDefinitions_2_0= ruleDirectiveDefinition )
            	    // InternalGraphQL.g:122:5: lv_directiveDefinitions_2_0= ruleDirectiveDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTypeSystemDefinitionAccess().getDirectiveDefinitionsDirectiveDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_directiveDefinitions_2_0=ruleDirectiveDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeSystemDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directiveDefinitions",
            	    						lv_directiveDefinitions_2_0,
            	    						"io.github.katmatt.graphql.GraphQL.DirectiveDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSystemDefinition"


    // $ANTLR start "entryRuleSchemaDefinition"
    // InternalGraphQL.g:143:1: entryRuleSchemaDefinition returns [EObject current=null] : iv_ruleSchemaDefinition= ruleSchemaDefinition EOF ;
    public final EObject entryRuleSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaDefinition = null;


        try {
            // InternalGraphQL.g:143:57: (iv_ruleSchemaDefinition= ruleSchemaDefinition EOF )
            // InternalGraphQL.g:144:2: iv_ruleSchemaDefinition= ruleSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchemaDefinition=ruleSchemaDefinition();

            state._fsp--;

             current =iv_ruleSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaDefinition"


    // $ANTLR start "ruleSchemaDefinition"
    // InternalGraphQL.g:150:1: ruleSchemaDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_description_0_0 = null;

        EObject lv_typeDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:156:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}' ) )
            // InternalGraphQL.g:157:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}' )
            {
            // InternalGraphQL.g:157:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}' )
            // InternalGraphQL.g:158:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}'
            {
            // InternalGraphQL.g:158:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_SL_STRING_VALUE && LA2_0<=RULE_ML_STRING_VALUE)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphQL.g:159:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:159:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:160:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getSchemaDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSchemaDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGraphQL.g:185:3: ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=58 && LA3_0<=60)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGraphQL.g:186:4: (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition )
            	    {
            	    // InternalGraphQL.g:186:4: (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition )
            	    // InternalGraphQL.g:187:5: lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsRootOperationTypeDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_typeDefinitions_3_0=ruleRootOperationTypeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeDefinitions",
            	    						lv_typeDefinitions_3_0,
            	    						"io.github.katmatt.graphql.GraphQL.RootOperationTypeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSchemaDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaDefinition"


    // $ANTLR start "entryRuleRootOperationTypeDefinition"
    // InternalGraphQL.g:212:1: entryRuleRootOperationTypeDefinition returns [EObject current=null] : iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF ;
    public final EObject entryRuleRootOperationTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootOperationTypeDefinition = null;


        try {
            // InternalGraphQL.g:212:68: (iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF )
            // InternalGraphQL.g:213:2: iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getRootOperationTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootOperationTypeDefinition=ruleRootOperationTypeDefinition();

            state._fsp--;

             current =iv_ruleRootOperationTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootOperationTypeDefinition"


    // $ANTLR start "ruleRootOperationTypeDefinition"
    // InternalGraphQL.g:219:1: ruleRootOperationTypeDefinition returns [EObject current=null] : ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) ;
    public final EObject ruleRootOperationTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_operationType_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:225:2: ( ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) )
            // InternalGraphQL.g:226:2: ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:226:2: ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            // InternalGraphQL.g:227:3: ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) )
            {
            // InternalGraphQL.g:227:3: ( (lv_operationType_0_0= ruleOperationType ) )
            // InternalGraphQL.g:228:4: (lv_operationType_0_0= ruleOperationType )
            {
            // InternalGraphQL.g:228:4: (lv_operationType_0_0= ruleOperationType )
            // InternalGraphQL.g:229:5: lv_operationType_0_0= ruleOperationType
            {

            					newCompositeNode(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeOperationTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_operationType_0_0=ruleOperationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootOperationTypeDefinitionRule());
            					}
            					set(
            						current,
            						"operationType",
            						lv_operationType_0_0,
            						"io.github.katmatt.graphql.GraphQL.OperationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRootOperationTypeDefinitionAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:250:3: ( (otherlv_2= RULE_NAME ) )
            // InternalGraphQL.g:251:4: (otherlv_2= RULE_NAME )
            {
            // InternalGraphQL.g:251:4: (otherlv_2= RULE_NAME )
            // InternalGraphQL.g:252:5: otherlv_2= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRootOperationTypeDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootOperationTypeDefinition"


    // $ANTLR start "entryRuleTypeDefinition"
    // InternalGraphQL.g:267:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // InternalGraphQL.g:267:55: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // InternalGraphQL.g:268:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // InternalGraphQL.g:274:1: ruleTypeDefinition returns [EObject current=null] : (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarTypeDefinition_0 = null;

        EObject this_ObjectTypeDefinition_1 = null;

        EObject this_InterfaceDefinition_2 = null;

        EObject this_UnionTypeDefinition_3 = null;

        EObject this_EnumTypeDefinition_4 = null;

        EObject this_InputObjectTypeDefinition_5 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:280:2: ( (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition ) )
            // InternalGraphQL.g:281:2: (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition )
            {
            // InternalGraphQL.g:281:2: (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_SL_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt4=6;
                    }
                    break;
                case 19:
                    {
                    alt4=2;
                    }
                    break;
                case 22:
                    {
                    alt4=3;
                    }
                    break;
                case 28:
                    {
                    alt4=5;
                    }
                    break;
                case 25:
                    {
                    alt4=4;
                    }
                    break;
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ML_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                case 29:
                    {
                    alt4=6;
                    }
                    break;
                case 19:
                    {
                    alt4=2;
                    }
                    break;
                case 22:
                    {
                    alt4=3;
                    }
                    break;
                case 28:
                    {
                    alt4=5;
                    }
                    break;
                case 25:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

                }
                break;
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 28:
                {
                alt4=5;
                }
                break;
            case 29:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGraphQL.g:282:3: this_ScalarTypeDefinition_0= ruleScalarTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getScalarTypeDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarTypeDefinition_0=ruleScalarTypeDefinition();

                    state._fsp--;


                    			current = this_ScalarTypeDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:291:3: this_ObjectTypeDefinition_1= ruleObjectTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getObjectTypeDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectTypeDefinition_1=ruleObjectTypeDefinition();

                    state._fsp--;


                    			current = this_ObjectTypeDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:300:3: this_InterfaceDefinition_2= ruleInterfaceDefinition
                    {

                    			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getInterfaceDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterfaceDefinition_2=ruleInterfaceDefinition();

                    state._fsp--;


                    			current = this_InterfaceDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:309:3: this_UnionTypeDefinition_3= ruleUnionTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getUnionTypeDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnionTypeDefinition_3=ruleUnionTypeDefinition();

                    state._fsp--;


                    			current = this_UnionTypeDefinition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:318:3: this_EnumTypeDefinition_4= ruleEnumTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumTypeDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumTypeDefinition_4=ruleEnumTypeDefinition();

                    state._fsp--;


                    			current = this_EnumTypeDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:327:3: this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getInputObjectTypeDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputObjectTypeDefinition_5=ruleInputObjectTypeDefinition();

                    state._fsp--;


                    			current = this_InputObjectTypeDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleScalarTypeDefinition"
    // InternalGraphQL.g:339:1: entryRuleScalarTypeDefinition returns [EObject current=null] : iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF ;
    public final EObject entryRuleScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarTypeDefinition = null;


        try {
            // InternalGraphQL.g:339:61: (iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF )
            // InternalGraphQL.g:340:2: iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getScalarTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarTypeDefinition=ruleScalarTypeDefinition();

            state._fsp--;

             current =iv_ruleScalarTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarTypeDefinition"


    // $ANTLR start "ruleScalarTypeDefinition"
    // InternalGraphQL.g:346:1: ruleScalarTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* ) ;
    public final EObject ruleScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_description_0_0 = null;

        EObject lv_directives_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:352:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* ) )
            // InternalGraphQL.g:353:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* )
            {
            // InternalGraphQL.g:353:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* )
            // InternalGraphQL.g:354:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )*
            {
            // InternalGraphQL.g:354:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SL_STRING_VALUE && LA5_0<=RULE_ML_STRING_VALUE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphQL.g:355:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:355:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:356:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getScalarTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScalarTypeDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_1());
            		
            // InternalGraphQL.g:377:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:378:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:378:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:379:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:395:3: ( (lv_directives_3_0= ruleDirective ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DIRECTIVE_NAME) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGraphQL.g:396:4: (lv_directives_3_0= ruleDirective )
            	    {
            	    // InternalGraphQL.g:396:4: (lv_directives_3_0= ruleDirective )
            	    // InternalGraphQL.g:397:5: lv_directives_3_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getScalarTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_directives_3_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScalarTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_3_0,
            	    						"io.github.katmatt.graphql.GraphQL.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarTypeDefinition"


    // $ANTLR start "entryRuleObjectTypeDefinition"
    // InternalGraphQL.g:418:1: entryRuleObjectTypeDefinition returns [EObject current=null] : iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF ;
    public final EObject entryRuleObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:418:61: (iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF )
            // InternalGraphQL.g:419:2: iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getObjectTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectTypeDefinition=ruleObjectTypeDefinition();

            state._fsp--;

             current =iv_ruleObjectTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectTypeDefinition"


    // $ANTLR start "ruleObjectTypeDefinition"
    // InternalGraphQL.g:425:1: ruleObjectTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_description_0_0 = null;

        EObject lv_directives_8_0 = null;

        EObject lv_fieldDefinitions_10_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:431:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )? ) )
            // InternalGraphQL.g:432:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )? )
            {
            // InternalGraphQL.g:432:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )? )
            // InternalGraphQL.g:433:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )?
            {
            // InternalGraphQL.g:433:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SL_STRING_VALUE && LA7_0<=RULE_ML_STRING_VALUE)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphQL.g:434:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:434:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:435:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_1());
            		
            // InternalGraphQL.g:456:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:457:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:457:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:458:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:474:3: (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:475:4: otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectTypeDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGraphQL.g:479:4: (otherlv_4= '&' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalGraphQL.g:480:5: otherlv_4= '&'
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getObjectTypeDefinitionAccess().getAmpersandKeyword_3_1());
                            				

                            }
                            break;

                    }

                    // InternalGraphQL.g:485:4: ( (otherlv_5= RULE_NAME ) )
                    // InternalGraphQL.g:486:5: (otherlv_5= RULE_NAME )
                    {
                    // InternalGraphQL.g:486:5: (otherlv_5= RULE_NAME )
                    // InternalGraphQL.g:487:6: otherlv_5= RULE_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectTypeDefinitionRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_NAME,FOLLOW_15); 

                    						newLeafNode(otherlv_5, grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalGraphQL.g:498:4: (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGraphQL.g:499:5: otherlv_6= '&' ( (otherlv_7= RULE_NAME ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getObjectTypeDefinitionAccess().getAmpersandKeyword_3_3_0());
                    	    				
                    	    // InternalGraphQL.g:503:5: ( (otherlv_7= RULE_NAME ) )
                    	    // InternalGraphQL.g:504:6: (otherlv_7= RULE_NAME )
                    	    {
                    	    // InternalGraphQL.g:504:6: (otherlv_7= RULE_NAME )
                    	    // InternalGraphQL.g:505:7: otherlv_7= RULE_NAME
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getObjectTypeDefinitionRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_NAME,FOLLOW_15); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGraphQL.g:518:3: ( (lv_directives_8_0= ruleDirective ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DIRECTIVE_NAME) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraphQL.g:519:4: (lv_directives_8_0= ruleDirective )
            	    {
            	    // InternalGraphQL.g:519:4: (lv_directives_8_0= ruleDirective )
            	    // InternalGraphQL.g:520:5: lv_directives_8_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_directives_8_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_8_0,
            	    						"io.github.katmatt.graphql.GraphQL.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalGraphQL.g:537:3: (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:538:4: otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalGraphQL.g:542:4: ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_NAME||(LA12_0>=RULE_SL_STRING_VALUE && LA12_0<=RULE_ML_STRING_VALUE)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGraphQL.g:543:5: (lv_fieldDefinitions_10_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:543:5: (lv_fieldDefinitions_10_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:544:6: lv_fieldDefinitions_10_0= ruleFieldDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_fieldDefinitions_10_0=ruleFieldDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldDefinitions",
                    	    							lv_fieldDefinitions_10_0,
                    	    							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectTypeDefinition"


    // $ANTLR start "entryRuleInterfaceDefinition"
    // InternalGraphQL.g:570:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalGraphQL.g:570:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalGraphQL.g:571:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // InternalGraphQL.g:577:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_description_0_0 = null;

        EObject lv_directives_8_0 = null;

        EObject lv_fieldDefinitions_10_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:583:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )? ) )
            // InternalGraphQL.g:584:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )? )
            {
            // InternalGraphQL.g:584:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )? )
            // InternalGraphQL.g:585:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )? ( (lv_directives_8_0= ruleDirective ) )* (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )?
            {
            // InternalGraphQL.g:585:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_SL_STRING_VALUE && LA14_0<=RULE_ML_STRING_VALUE)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphQL.g:586:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:586:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:587:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
            		
            // InternalGraphQL.g:608:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:609:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:609:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:610:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInterfaceDefinitionAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:626:3: (otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphQL.g:627:4: otherlv_3= 'implements' (otherlv_4= '&' )? ( (otherlv_5= RULE_NAME ) ) (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getInterfaceDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGraphQL.g:631:4: (otherlv_4= '&' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==21) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGraphQL.g:632:5: otherlv_4= '&'
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getAmpersandKeyword_3_1());
                            				

                            }
                            break;

                    }

                    // InternalGraphQL.g:637:4: ( (otherlv_5= RULE_NAME ) )
                    // InternalGraphQL.g:638:5: (otherlv_5= RULE_NAME )
                    {
                    // InternalGraphQL.g:638:5: (otherlv_5= RULE_NAME )
                    // InternalGraphQL.g:639:6: otherlv_5= RULE_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_NAME,FOLLOW_15); 

                    						newLeafNode(otherlv_5, grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalGraphQL.g:650:4: (otherlv_6= '&' ( (otherlv_7= RULE_NAME ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalGraphQL.g:651:5: otherlv_6= '&' ( (otherlv_7= RULE_NAME ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getInterfaceDefinitionAccess().getAmpersandKeyword_3_3_0());
                    	    				
                    	    // InternalGraphQL.g:655:5: ( (otherlv_7= RULE_NAME ) )
                    	    // InternalGraphQL.g:656:6: (otherlv_7= RULE_NAME )
                    	    {
                    	    // InternalGraphQL.g:656:6: (otherlv_7= RULE_NAME )
                    	    // InternalGraphQL.g:657:7: otherlv_7= RULE_NAME
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_NAME,FOLLOW_15); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGraphQL.g:670:3: ( (lv_directives_8_0= ruleDirective ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DIRECTIVE_NAME) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGraphQL.g:671:4: (lv_directives_8_0= ruleDirective )
            	    {
            	    // InternalGraphQL.g:671:4: (lv_directives_8_0= ruleDirective )
            	    // InternalGraphQL.g:672:5: lv_directives_8_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getDirectivesDirectiveParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_directives_8_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_8_0,
            	    						"io.github.katmatt.graphql.GraphQL.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalGraphQL.g:689:3: (otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphQL.g:690:4: otherlv_9= '{' ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalGraphQL.g:694:4: ( (lv_fieldDefinitions_10_0= ruleFieldDefinition ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_NAME||(LA19_0>=RULE_SL_STRING_VALUE && LA19_0<=RULE_ML_STRING_VALUE)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGraphQL.g:695:5: (lv_fieldDefinitions_10_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:695:5: (lv_fieldDefinitions_10_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:696:6: lv_fieldDefinitions_10_0= ruleFieldDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_fieldDefinitions_10_0=ruleFieldDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldDefinitions",
                    	    							lv_fieldDefinitions_10_0,
                    	    							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleFieldDefinition"
    // InternalGraphQL.g:722:1: entryRuleFieldDefinition returns [EObject current=null] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final EObject entryRuleFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDefinition = null;


        try {
            // InternalGraphQL.g:722:56: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // InternalGraphQL.g:723:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getFieldDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDefinition=ruleFieldDefinition();

            state._fsp--;

             current =iv_ruleFieldDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDefinition"


    // $ANTLR start "ruleFieldDefinition"
    // InternalGraphQL.g:729:1: ruleFieldDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '(' ( (lv_argumentsDefinition_3_0= ruleInputValueDefinition ) )* otherlv_4= ')' )? otherlv_5= ':' ( (lv_type_6_0= ruleType ) ) ) ;
    public final EObject ruleFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_description_0_0 = null;

        EObject lv_argumentsDefinition_3_0 = null;

        EObject lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:735:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '(' ( (lv_argumentsDefinition_3_0= ruleInputValueDefinition ) )* otherlv_4= ')' )? otherlv_5= ':' ( (lv_type_6_0= ruleType ) ) ) )
            // InternalGraphQL.g:736:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '(' ( (lv_argumentsDefinition_3_0= ruleInputValueDefinition ) )* otherlv_4= ')' )? otherlv_5= ':' ( (lv_type_6_0= ruleType ) ) )
            {
            // InternalGraphQL.g:736:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '(' ( (lv_argumentsDefinition_3_0= ruleInputValueDefinition ) )* otherlv_4= ')' )? otherlv_5= ':' ( (lv_type_6_0= ruleType ) ) )
            // InternalGraphQL.g:737:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '(' ( (lv_argumentsDefinition_3_0= ruleInputValueDefinition ) )* otherlv_4= ')' )? otherlv_5= ':' ( (lv_type_6_0= ruleType ) )
            {
            // InternalGraphQL.g:737:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_SL_STRING_VALUE && LA21_0<=RULE_ML_STRING_VALUE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphQL.g:738:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:738:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:739:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGraphQL.g:756:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:757:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:757:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:758:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:774:3: (otherlv_2= '(' ( (lv_argumentsDefinition_3_0= ruleInputValueDefinition ) )* otherlv_4= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGraphQL.g:775:4: otherlv_2= '(' ( (lv_argumentsDefinition_3_0= ruleInputValueDefinition ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getFieldDefinitionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalGraphQL.g:779:4: ( (lv_argumentsDefinition_3_0= ruleInputValueDefinition ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_NAME||(LA22_0>=RULE_SL_STRING_VALUE && LA22_0<=RULE_ML_STRING_VALUE)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGraphQL.g:780:5: (lv_argumentsDefinition_3_0= ruleInputValueDefinition )
                    	    {
                    	    // InternalGraphQL.g:780:5: (lv_argumentsDefinition_3_0= ruleInputValueDefinition )
                    	    // InternalGraphQL.g:781:6: lv_argumentsDefinition_3_0= ruleInputValueDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getFieldDefinitionAccess().getArgumentsDefinitionInputValueDefinitionParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_argumentsDefinition_3_0=ruleInputValueDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"argumentsDefinition",
                    	    							lv_argumentsDefinition_3_0,
                    	    							"io.github.katmatt.graphql.GraphQL.InputValueDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldDefinitionAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getFieldDefinitionAccess().getColonKeyword_3());
            		
            // InternalGraphQL.g:807:3: ( (lv_type_6_0= ruleType ) )
            // InternalGraphQL.g:808:4: (lv_type_6_0= ruleType )
            {
            // InternalGraphQL.g:808:4: (lv_type_6_0= ruleType )
            // InternalGraphQL.g:809:5: lv_type_6_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_6_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"io.github.katmatt.graphql.GraphQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDefinition"


    // $ANTLR start "entryRuleUnionTypeDefinition"
    // InternalGraphQL.g:830:1: entryRuleUnionTypeDefinition returns [EObject current=null] : iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF ;
    public final EObject entryRuleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionTypeDefinition = null;


        try {
            // InternalGraphQL.g:830:60: (iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF )
            // InternalGraphQL.g:831:2: iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getUnionTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionTypeDefinition=ruleUnionTypeDefinition();

            state._fsp--;

             current =iv_ruleUnionTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionTypeDefinition"


    // $ANTLR start "ruleUnionTypeDefinition"
    // InternalGraphQL.g:837:1: ruleUnionTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '=' (otherlv_5= '|' )? ( (lv_memberTypes_6_0= ruleType ) ) (otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) ) )* )? ) ;
    public final EObject ruleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_description_0_0 = null;

        EObject lv_directives_3_0 = null;

        EObject lv_memberTypes_6_0 = null;

        EObject lv_memberTypes_8_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:843:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '=' (otherlv_5= '|' )? ( (lv_memberTypes_6_0= ruleType ) ) (otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) ) )* )? ) )
            // InternalGraphQL.g:844:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '=' (otherlv_5= '|' )? ( (lv_memberTypes_6_0= ruleType ) ) (otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) ) )* )? )
            {
            // InternalGraphQL.g:844:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '=' (otherlv_5= '|' )? ( (lv_memberTypes_6_0= ruleType ) ) (otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) ) )* )? )
            // InternalGraphQL.g:845:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '=' (otherlv_5= '|' )? ( (lv_memberTypes_6_0= ruleType ) ) (otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) ) )* )?
            {
            // InternalGraphQL.g:845:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_SL_STRING_VALUE && LA24_0<=RULE_ML_STRING_VALUE)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphQL.g:846:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:846:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:847:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnionTypeDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_1());
            		
            // InternalGraphQL.g:868:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:869:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:869:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:870:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_23); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnionTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:886:3: ( (lv_directives_3_0= ruleDirective ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DIRECTIVE_NAME) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGraphQL.g:887:4: (lv_directives_3_0= ruleDirective )
            	    {
            	    // InternalGraphQL.g:887:4: (lv_directives_3_0= ruleDirective )
            	    // InternalGraphQL.g:888:5: lv_directives_3_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_directives_3_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUnionTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_3_0,
            	    						"io.github.katmatt.graphql.GraphQL.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalGraphQL.g:905:3: (otherlv_4= '=' (otherlv_5= '|' )? ( (lv_memberTypes_6_0= ruleType ) ) (otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphQL.g:906:4: otherlv_4= '=' (otherlv_5= '|' )? ( (lv_memberTypes_6_0= ruleType ) ) (otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalGraphQL.g:910:4: (otherlv_5= '|' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==27) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalGraphQL.g:911:5: otherlv_5= '|'
                            {
                            otherlv_5=(Token)match(input,27,FOLLOW_21); 

                            					newLeafNode(otherlv_5, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalGraphQL.g:916:4: ( (lv_memberTypes_6_0= ruleType ) )
                    // InternalGraphQL.g:917:5: (lv_memberTypes_6_0= ruleType )
                    {
                    // InternalGraphQL.g:917:5: (lv_memberTypes_6_0= ruleType )
                    // InternalGraphQL.g:918:6: lv_memberTypes_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_memberTypes_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnionTypeDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"memberTypes",
                    							lv_memberTypes_6_0,
                    							"io.github.katmatt.graphql.GraphQL.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphQL.g:935:4: (otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==27) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGraphQL.g:936:5: otherlv_7= '|' ( (lv_memberTypes_8_0= ruleType ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_21); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_4_3_0());
                    	    				
                    	    // InternalGraphQL.g:940:5: ( (lv_memberTypes_8_0= ruleType ) )
                    	    // InternalGraphQL.g:941:6: (lv_memberTypes_8_0= ruleType )
                    	    {
                    	    // InternalGraphQL.g:941:6: (lv_memberTypes_8_0= ruleType )
                    	    // InternalGraphQL.g:942:7: lv_memberTypes_8_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_memberTypes_8_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnionTypeDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"memberTypes",
                    	    								lv_memberTypes_8_0,
                    	    								"io.github.katmatt.graphql.GraphQL.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionTypeDefinition"


    // $ANTLR start "entryRuleEnumTypeDefinition"
    // InternalGraphQL.g:965:1: entryRuleEnumTypeDefinition returns [EObject current=null] : iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF ;
    public final EObject entryRuleEnumTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDefinition = null;


        try {
            // InternalGraphQL.g:965:59: (iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF )
            // InternalGraphQL.g:966:2: iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumTypeDefinition=ruleEnumTypeDefinition();

            state._fsp--;

             current =iv_ruleEnumTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumTypeDefinition"


    // $ANTLR start "ruleEnumTypeDefinition"
    // InternalGraphQL.g:972:1: ruleEnumTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleEnumTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_description_0_0 = null;

        EObject lv_directives_3_0 = null;

        EObject lv_enumValuesDefinition_5_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:978:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition ) )* otherlv_6= '}' )? ) )
            // InternalGraphQL.g:979:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition ) )* otherlv_6= '}' )? )
            {
            // InternalGraphQL.g:979:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition ) )* otherlv_6= '}' )? )
            // InternalGraphQL.g:980:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition ) )* otherlv_6= '}' )?
            {
            // InternalGraphQL.g:980:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_SL_STRING_VALUE && LA29_0<=RULE_ML_STRING_VALUE)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphQL.g:981:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:981:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:982:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnumTypeDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_1());
            		
            // InternalGraphQL.g:1003:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:1004:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:1004:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:1005:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_16); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:1021:3: ( (lv_directives_3_0= ruleDirective ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DIRECTIVE_NAME) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGraphQL.g:1022:4: (lv_directives_3_0= ruleDirective )
            	    {
            	    // InternalGraphQL.g:1022:4: (lv_directives_3_0= ruleDirective )
            	    // InternalGraphQL.g:1023:5: lv_directives_3_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_directives_3_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_3_0,
            	    						"io.github.katmatt.graphql.GraphQL.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalGraphQL.g:1040:3: (otherlv_4= '{' ( (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition ) )* otherlv_6= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGraphQL.g:1041:4: otherlv_4= '{' ( (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalGraphQL.g:1045:4: ( (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_NAME||(LA31_0>=RULE_SL_STRING_VALUE && LA31_0<=RULE_ML_STRING_VALUE)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGraphQL.g:1046:5: (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition )
                    	    {
                    	    // InternalGraphQL.g:1046:5: (lv_enumValuesDefinition_5_0= ruleEnumValueDefinition )
                    	    // InternalGraphQL.g:1047:6: lv_enumValuesDefinition_5_0= ruleEnumValueDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getEnumValuesDefinitionEnumValueDefinitionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_enumValuesDefinition_5_0=ruleEnumValueDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEnumTypeDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"enumValuesDefinition",
                    	    							lv_enumValuesDefinition_5_0,
                    	    							"io.github.katmatt.graphql.GraphQL.EnumValueDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumTypeDefinition"


    // $ANTLR start "entryRuleEnumValueDefinition"
    // InternalGraphQL.g:1073:1: entryRuleEnumValueDefinition returns [EObject current=null] : iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF ;
    public final EObject entryRuleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValueDefinition = null;


        try {
            // InternalGraphQL.g:1073:60: (iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF )
            // InternalGraphQL.g:1074:2: iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnumValueDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValueDefinition=ruleEnumValueDefinition();

            state._fsp--;

             current =iv_ruleEnumValueDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumValueDefinition"


    // $ANTLR start "ruleEnumValueDefinition"
    // InternalGraphQL.g:1080:1: ruleEnumValueDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1086:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGraphQL.g:1087:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:1087:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGraphQL.g:1088:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:1088:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_SL_STRING_VALUE && LA33_0<=RULE_ML_STRING_VALUE)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGraphQL.g:1089:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1089:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1090:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getEnumValueDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnumValueDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGraphQL.g:1107:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:1108:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:1108:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:1109:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumValueDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumValueDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValueDefinition"


    // $ANTLR start "entryRuleInputObjectTypeDefinition"
    // InternalGraphQL.g:1129:1: entryRuleInputObjectTypeDefinition returns [EObject current=null] : iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF ;
    public final EObject entryRuleInputObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:1129:66: (iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF )
            // InternalGraphQL.g:1130:2: iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getInputObjectTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputObjectTypeDefinition=ruleInputObjectTypeDefinition();

            state._fsp--;

             current =iv_ruleInputObjectTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputObjectTypeDefinition"


    // $ANTLR start "ruleInputObjectTypeDefinition"
    // InternalGraphQL.g:1136:1: ruleInputObjectTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleInputObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_description_0_0 = null;

        EObject lv_directives_3_0 = null;

        EObject lv_inputFieldsDefinition_5_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1142:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition ) )* otherlv_6= '}' )? ) )
            // InternalGraphQL.g:1143:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition ) )* otherlv_6= '}' )? )
            {
            // InternalGraphQL.g:1143:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition ) )* otherlv_6= '}' )? )
            // InternalGraphQL.g:1144:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) ( (lv_directives_3_0= ruleDirective ) )* (otherlv_4= '{' ( (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition ) )* otherlv_6= '}' )?
            {
            // InternalGraphQL.g:1144:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_SL_STRING_VALUE && LA34_0<=RULE_ML_STRING_VALUE)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGraphQL.g:1145:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1145:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1146:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInputObjectTypeDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_1());
            		
            // InternalGraphQL.g:1167:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:1168:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:1168:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:1169:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_16); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInputObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputObjectTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:1185:3: ( (lv_directives_3_0= ruleDirective ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_DIRECTIVE_NAME) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGraphQL.g:1186:4: (lv_directives_3_0= ruleDirective )
            	    {
            	    // InternalGraphQL.g:1186:4: (lv_directives_3_0= ruleDirective )
            	    // InternalGraphQL.g:1187:5: lv_directives_3_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_directives_3_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputObjectTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_3_0,
            	    						"io.github.katmatt.graphql.GraphQL.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalGraphQL.g:1204:3: (otherlv_4= '{' ( (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition ) )* otherlv_6= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGraphQL.g:1205:4: otherlv_4= '{' ( (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalGraphQL.g:1209:4: ( (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_NAME||(LA36_0>=RULE_SL_STRING_VALUE && LA36_0<=RULE_ML_STRING_VALUE)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalGraphQL.g:1210:5: (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition )
                    	    {
                    	    // InternalGraphQL.g:1210:5: (lv_inputFieldsDefinition_5_0= ruleInputValueDefinition )
                    	    // InternalGraphQL.g:1211:6: lv_inputFieldsDefinition_5_0= ruleInputValueDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getInputFieldsDefinitionInputValueDefinitionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_inputFieldsDefinition_5_0=ruleInputValueDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInputObjectTypeDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputFieldsDefinition",
                    	    							lv_inputFieldsDefinition_5_0,
                    	    							"io.github.katmatt.graphql.GraphQL.InputValueDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputObjectTypeDefinition"


    // $ANTLR start "entryRuleInputValueDefinition"
    // InternalGraphQL.g:1237:1: entryRuleInputValueDefinition returns [EObject current=null] : iv_ruleInputValueDefinition= ruleInputValueDefinition EOF ;
    public final EObject entryRuleInputValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputValueDefinition = null;


        try {
            // InternalGraphQL.g:1237:61: (iv_ruleInputValueDefinition= ruleInputValueDefinition EOF )
            // InternalGraphQL.g:1238:2: iv_ruleInputValueDefinition= ruleInputValueDefinition EOF
            {
             newCompositeNode(grammarAccess.getInputValueDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputValueDefinition=ruleInputValueDefinition();

            state._fsp--;

             current =iv_ruleInputValueDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputValueDefinition"


    // $ANTLR start "ruleInputValueDefinition"
    // InternalGraphQL.g:1244:1: ruleInputValueDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? ) ;
    public final EObject ruleInputValueDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_description_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_defaultValue_5_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1250:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? ) )
            // InternalGraphQL.g:1251:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? )
            {
            // InternalGraphQL.g:1251:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? )
            // InternalGraphQL.g:1252:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )?
            {
            // InternalGraphQL.g:1252:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_SL_STRING_VALUE && LA38_0<=RULE_ML_STRING_VALUE)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGraphQL.g:1253:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1253:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1254:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getInputValueDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInputValueDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGraphQL.g:1271:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:1272:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:1272:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:1273:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputValueDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputValueDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getInputValueDefinitionAccess().getColonKeyword_2());
            		
            // InternalGraphQL.g:1293:3: ( (lv_type_3_0= ruleType ) )
            // InternalGraphQL.g:1294:4: (lv_type_3_0= ruleType )
            {
            // InternalGraphQL.g:1294:4: (lv_type_3_0= ruleType )
            // InternalGraphQL.g:1295:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getInputValueDefinitionAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputValueDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"io.github.katmatt.graphql.GraphQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphQL.g:1312:3: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGraphQL.g:1313:4: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputValueDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalGraphQL.g:1317:4: ( (lv_defaultValue_5_0= ruleConstValue ) )
                    // InternalGraphQL.g:1318:5: (lv_defaultValue_5_0= ruleConstValue )
                    {
                    // InternalGraphQL.g:1318:5: (lv_defaultValue_5_0= ruleConstValue )
                    // InternalGraphQL.g:1319:6: lv_defaultValue_5_0= ruleConstValue
                    {

                    						newCompositeNode(grammarAccess.getInputValueDefinitionAccess().getDefaultValueConstValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_defaultValue_5_0=ruleConstValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputValueDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_5_0,
                    							"io.github.katmatt.graphql.GraphQL.ConstValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputValueDefinition"


    // $ANTLR start "entryRuleType"
    // InternalGraphQL.g:1341:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGraphQL.g:1341:45: (iv_ruleType= ruleType EOF )
            // InternalGraphQL.g:1342:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGraphQL.g:1348:1: ruleType returns [EObject current=null] : (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_NamedType_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1354:2: ( (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType ) )
            // InternalGraphQL.g:1355:2: (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType )
            {
            // InternalGraphQL.g:1355:2: (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_NAME) ) {
                alt40=1;
            }
            else if ( (LA40_0==31) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalGraphQL.g:1356:3: this_NamedType_0= ruleNamedType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedType_0=ruleNamedType();

                    state._fsp--;


                    			current = this_NamedType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1365:3: this_ListType_1= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getListTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_1=ruleListType();

                    state._fsp--;


                    			current = this_ListType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleNamedType"
    // InternalGraphQL.g:1377:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // InternalGraphQL.g:1377:50: (iv_ruleNamedType= ruleNamedType EOF )
            // InternalGraphQL.g:1378:2: iv_ruleNamedType= ruleNamedType EOF
            {
             newCompositeNode(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;

             current =iv_ruleNamedType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // InternalGraphQL.g:1384:1: ruleNamedType returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nonNull_1_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1390:2: ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) )
            // InternalGraphQL.g:1391:2: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
            {
            // InternalGraphQL.g:1391:2: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
            // InternalGraphQL.g:1392:3: ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )?
            {
            // InternalGraphQL.g:1392:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1393:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1393:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1394:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedTypeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_30); 

            					newLeafNode(otherlv_0, grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalGraphQL.g:1405:3: ( (lv_nonNull_1_0= '!' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGraphQL.g:1406:4: (lv_nonNull_1_0= '!' )
                    {
                    // InternalGraphQL.g:1406:4: (lv_nonNull_1_0= '!' )
                    // InternalGraphQL.g:1407:5: lv_nonNull_1_0= '!'
                    {
                    lv_nonNull_1_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_nonNull_1_0, grammarAccess.getNamedTypeAccess().getNonNullExclamationMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNamedTypeRule());
                    					}
                    					setWithLastConsumed(current, "nonNull", lv_nonNull_1_0 != null, "!");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleListType"
    // InternalGraphQL.g:1423:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalGraphQL.g:1423:49: (iv_ruleListType= ruleListType EOF )
            // InternalGraphQL.g:1424:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalGraphQL.g:1430:1: ruleListType returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_nonNull_3_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1436:2: ( (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? ) )
            // InternalGraphQL.g:1437:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? )
            {
            // InternalGraphQL.g:1437:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? )
            // InternalGraphQL.g:1438:3: otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGraphQL.g:1442:3: ( (lv_type_1_0= ruleType ) )
            // InternalGraphQL.g:1443:4: (lv_type_1_0= ruleType )
            {
            // InternalGraphQL.g:1443:4: (lv_type_1_0= ruleType )
            // InternalGraphQL.g:1444:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"io.github.katmatt.graphql.GraphQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2());
            		
            // InternalGraphQL.g:1465:3: ( (lv_nonNull_3_0= '!' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGraphQL.g:1466:4: (lv_nonNull_3_0= '!' )
                    {
                    // InternalGraphQL.g:1466:4: (lv_nonNull_3_0= '!' )
                    // InternalGraphQL.g:1467:5: lv_nonNull_3_0= '!'
                    {
                    lv_nonNull_3_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_nonNull_3_0, grammarAccess.getListTypeAccess().getNonNullExclamationMarkKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListTypeRule());
                    					}
                    					setWithLastConsumed(current, "nonNull", lv_nonNull_3_0 != null, "!");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleIntValue"
    // InternalGraphQL.g:1483:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalGraphQL.g:1483:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalGraphQL.g:1484:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalGraphQL.g:1490:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT_VALUE ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1496:2: ( ( (lv_value_0_0= RULE_INT_VALUE ) ) )
            // InternalGraphQL.g:1497:2: ( (lv_value_0_0= RULE_INT_VALUE ) )
            {
            // InternalGraphQL.g:1497:2: ( (lv_value_0_0= RULE_INT_VALUE ) )
            // InternalGraphQL.g:1498:3: (lv_value_0_0= RULE_INT_VALUE )
            {
            // InternalGraphQL.g:1498:3: (lv_value_0_0= RULE_INT_VALUE )
            // InternalGraphQL.g:1499:4: lv_value_0_0= RULE_INT_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_INT_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINT_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"io.github.katmatt.graphql.GraphQL.INT_VALUE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalGraphQL.g:1518:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalGraphQL.g:1518:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalGraphQL.g:1519:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalGraphQL.g:1525:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT_VALUE ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1531:2: ( ( (lv_value_0_0= RULE_FLOAT_VALUE ) ) )
            // InternalGraphQL.g:1532:2: ( (lv_value_0_0= RULE_FLOAT_VALUE ) )
            {
            // InternalGraphQL.g:1532:2: ( (lv_value_0_0= RULE_FLOAT_VALUE ) )
            // InternalGraphQL.g:1533:3: (lv_value_0_0= RULE_FLOAT_VALUE )
            {
            // InternalGraphQL.g:1533:3: (lv_value_0_0= RULE_FLOAT_VALUE )
            // InternalGraphQL.g:1534:4: lv_value_0_0= RULE_FLOAT_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueFLOAT_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFloatValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"io.github.katmatt.graphql.GraphQL.FLOAT_VALUE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalGraphQL.g:1553:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGraphQL.g:1553:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGraphQL.g:1554:2: iv_ruleNullValue= ruleNullValue EOF
            {
             newCompositeNode(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;

             current =iv_ruleNullValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalGraphQL.g:1560:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= 'null' ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1566:2: ( ( (lv_value_0_0= 'null' ) ) )
            // InternalGraphQL.g:1567:2: ( (lv_value_0_0= 'null' ) )
            {
            // InternalGraphQL.g:1567:2: ( (lv_value_0_0= 'null' ) )
            // InternalGraphQL.g:1568:3: (lv_value_0_0= 'null' )
            {
            // InternalGraphQL.g:1568:3: (lv_value_0_0= 'null' )
            // InternalGraphQL.g:1569:4: lv_value_0_0= 'null'
            {
            lv_value_0_0=(Token)match(input,33,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNullValueAccess().getValueNullKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNullValueRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "null");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalGraphQL.g:1584:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGraphQL.g:1584:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGraphQL.g:1585:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalGraphQL.g:1591:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1597:2: ( ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) ) )
            // InternalGraphQL.g:1598:2: ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) )
            {
            // InternalGraphQL.g:1598:2: ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) )
            // InternalGraphQL.g:1599:3: ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) )
            {
            // InternalGraphQL.g:1599:3: ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) )
            // InternalGraphQL.g:1600:4: (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE )
            {
            // InternalGraphQL.g:1600:4: (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_SL_STRING_VALUE) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ML_STRING_VALUE) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalGraphQL.g:1601:5: lv_value_0_1= RULE_SL_STRING_VALUE
                    {
                    lv_value_0_1=(Token)match(input,RULE_SL_STRING_VALUE,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getStringValueAccess().getValueSL_STRING_VALUETerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"io.github.katmatt.graphql.GraphQL.SL_STRING_VALUE");
                    				

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1616:5: lv_value_0_2= RULE_ML_STRING_VALUE
                    {
                    lv_value_0_2=(Token)match(input,RULE_ML_STRING_VALUE,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getStringValueAccess().getValueML_STRING_VALUETerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"io.github.katmatt.graphql.GraphQL.ML_STRING_VALUE");
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalGraphQL.g:1636:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGraphQL.g:1636:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGraphQL.g:1637:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalGraphQL.g:1643:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1649:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalGraphQL.g:1650:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalGraphQL.g:1650:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalGraphQL.g:1651:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalGraphQL.g:1651:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalGraphQL.g:1652:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalGraphQL.g:1652:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            else if ( (LA44_0==35) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalGraphQL.g:1653:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1664:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEnumValue"
    // InternalGraphQL.g:1680:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalGraphQL.g:1680:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalGraphQL.g:1681:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalGraphQL.g:1687:1: ruleEnumValue returns [EObject current=null] : ( (otherlv_0= RULE_NAME ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1693:2: ( ( (otherlv_0= RULE_NAME ) ) )
            // InternalGraphQL.g:1694:2: ( (otherlv_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:1694:2: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1695:3: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1695:3: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1696:4: otherlv_0= RULE_NAME
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumValueRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEnumValueAccess().getValueEnumValueDefinitionCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalGraphQL.g:1710:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGraphQL.g:1710:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGraphQL.g:1711:2: iv_ruleObjectValue= ruleObjectValue EOF
            {
             newCompositeNode(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectValue=ruleObjectValue();

            state._fsp--;

             current =iv_ruleObjectValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalGraphQL.g:1717:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1723:2: ( ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) )
            // InternalGraphQL.g:1724:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            {
            // InternalGraphQL.g:1724:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            // InternalGraphQL.g:1725:3: () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}'
            {
            // InternalGraphQL.g:1725:3: ()
            // InternalGraphQL.g:1726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphQL.g:1736:3: ( (lv_fields_2_0= ruleObjectField ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_NAME) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGraphQL.g:1737:4: (lv_fields_2_0= ruleObjectField )
            	    {
            	    // InternalGraphQL.g:1737:4: (lv_fields_2_0= ruleObjectField )
            	    // InternalGraphQL.g:1738:5: lv_fields_2_0= ruleObjectField
            	    {

            	    					newCompositeNode(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_fields_2_0=ruleObjectField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_2_0,
            	    						"io.github.katmatt.graphql.GraphQL.ObjectField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleObjectField"
    // InternalGraphQL.g:1763:1: entryRuleObjectField returns [EObject current=null] : iv_ruleObjectField= ruleObjectField EOF ;
    public final EObject entryRuleObjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectField = null;


        try {
            // InternalGraphQL.g:1763:52: (iv_ruleObjectField= ruleObjectField EOF )
            // InternalGraphQL.g:1764:2: iv_ruleObjectField= ruleObjectField EOF
            {
             newCompositeNode(grammarAccess.getObjectFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectField=ruleObjectField();

            state._fsp--;

             current =iv_ruleObjectField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectField"


    // $ANTLR start "ruleObjectField"
    // InternalGraphQL.g:1770:1: ruleObjectField returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) ;
    public final EObject ruleObjectField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1776:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) )
            // InternalGraphQL.g:1777:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            {
            // InternalGraphQL.g:1777:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            // InternalGraphQL.g:1778:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) )
            {
            // InternalGraphQL.g:1778:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1779:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1779:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1780:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFieldRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectFieldAccess().getFieldDefinitionFieldDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:1795:3: ( (lv_value_2_0= ruleConstValue ) )
            // InternalGraphQL.g:1796:4: (lv_value_2_0= ruleConstValue )
            {
            // InternalGraphQL.g:1796:4: (lv_value_2_0= ruleConstValue )
            // InternalGraphQL.g:1797:5: lv_value_2_0= ruleConstValue
            {

            					newCompositeNode(grammarAccess.getObjectFieldAccess().getValueConstValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleConstValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"io.github.katmatt.graphql.GraphQL.ConstValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectField"


    // $ANTLR start "entryRuleConstValue"
    // InternalGraphQL.g:1818:1: entryRuleConstValue returns [EObject current=null] : iv_ruleConstValue= ruleConstValue EOF ;
    public final EObject entryRuleConstValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstValue = null;


        try {
            // InternalGraphQL.g:1818:51: (iv_ruleConstValue= ruleConstValue EOF )
            // InternalGraphQL.g:1819:2: iv_ruleConstValue= ruleConstValue EOF
            {
             newCompositeNode(grammarAccess.getConstValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstValue=ruleConstValue();

            state._fsp--;

             current =iv_ruleConstValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstValue"


    // $ANTLR start "ruleConstValue"
    // InternalGraphQL.g:1825:1: ruleConstValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_StringValue_4= ruleStringValue | this_EnumValue_5= ruleEnumValue | this_ListValue_6= ruleListValue | this_ObjectValue_7= ruleObjectValue ) ;
    public final EObject ruleConstValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_NullValue_3 = null;

        EObject this_StringValue_4 = null;

        EObject this_EnumValue_5 = null;

        EObject this_ListValue_6 = null;

        EObject this_ObjectValue_7 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1831:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_StringValue_4= ruleStringValue | this_EnumValue_5= ruleEnumValue | this_ListValue_6= ruleListValue | this_ObjectValue_7= ruleObjectValue ) )
            // InternalGraphQL.g:1832:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_StringValue_4= ruleStringValue | this_EnumValue_5= ruleEnumValue | this_ListValue_6= ruleListValue | this_ObjectValue_7= ruleObjectValue )
            {
            // InternalGraphQL.g:1832:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_StringValue_4= ruleStringValue | this_EnumValue_5= ruleEnumValue | this_ListValue_6= ruleListValue | this_ObjectValue_7= ruleObjectValue )
            int alt46=8;
            switch ( input.LA(1) ) {
            case RULE_INT_VALUE:
                {
                alt46=1;
                }
                break;
            case RULE_FLOAT_VALUE:
                {
                alt46=2;
                }
                break;
            case 34:
            case 35:
                {
                alt46=3;
                }
                break;
            case 33:
                {
                alt46=4;
                }
                break;
            case RULE_SL_STRING_VALUE:
            case RULE_ML_STRING_VALUE:
                {
                alt46=5;
                }
                break;
            case RULE_NAME:
                {
                alt46=6;
                }
                break;
            case 31:
                {
                alt46=7;
                }
                break;
            case 15:
                {
                alt46=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalGraphQL.g:1833:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1842:3: this_FloatValue_1= ruleFloatValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getFloatValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;


                    			current = this_FloatValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:1851:3: this_BooleanValue_2= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getBooleanValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_2=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:1860:3: this_NullValue_3= ruleNullValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getNullValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullValue_3=ruleNullValue();

                    state._fsp--;


                    			current = this_NullValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:1869:3: this_StringValue_4= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getStringValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_4=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:1878:3: this_EnumValue_5= ruleEnumValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getEnumValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumValue_5=ruleEnumValue();

                    state._fsp--;


                    			current = this_EnumValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:1887:3: this_ListValue_6= ruleListValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getListValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListValue_6=ruleListValue();

                    state._fsp--;


                    			current = this_ListValue_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGraphQL.g:1896:3: this_ObjectValue_7= ruleObjectValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getObjectValueParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectValue_7=ruleObjectValue();

                    state._fsp--;


                    			current = this_ObjectValue_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstValue"


    // $ANTLR start "entryRuleListValue"
    // InternalGraphQL.g:1908:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalGraphQL.g:1908:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalGraphQL.g:1909:2: iv_ruleListValue= ruleListValue EOF
            {
             newCompositeNode(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListValue=ruleListValue();

            state._fsp--;

             current =iv_ruleListValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalGraphQL.g:1915:1: ruleListValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1921:2: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' ) )
            // InternalGraphQL.g:1922:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' )
            {
            // InternalGraphQL.g:1922:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' )
            // InternalGraphQL.g:1923:3: () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']'
            {
            // InternalGraphQL.g:1923:3: ()
            // InternalGraphQL.g:1924:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListValueAccess().getListValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalGraphQL.g:1934:3: ( (lv_values_2_0= ruleConstValue ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_NAME && LA47_0<=RULE_ML_STRING_VALUE)||LA47_0==15||LA47_0==31||(LA47_0>=33 && LA47_0<=35)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGraphQL.g:1935:4: (lv_values_2_0= ruleConstValue )
            	    {
            	    // InternalGraphQL.g:1935:4: (lv_values_2_0= ruleConstValue )
            	    // InternalGraphQL.g:1936:5: lv_values_2_0= ruleConstValue
            	    {

            	    					newCompositeNode(grammarAccess.getListValueAccess().getValuesConstValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_values_2_0=ruleConstValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_2_0,
            	    						"io.github.katmatt.graphql.GraphQL.ConstValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleDirectiveDefinition"
    // InternalGraphQL.g:1961:1: entryRuleDirectiveDefinition returns [EObject current=null] : iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF ;
    public final EObject entryRuleDirectiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectiveDefinition = null;


        try {
            // InternalGraphQL.g:1961:60: (iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF )
            // InternalGraphQL.g:1962:2: iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF
            {
             newCompositeNode(grammarAccess.getDirectiveDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectiveDefinition=ruleDirectiveDefinition();

            state._fsp--;

             current =iv_ruleDirectiveDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectiveDefinition"


    // $ANTLR start "ruleDirectiveDefinition"
    // InternalGraphQL.g:1968:1: ruleDirectiveDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) (otherlv_3= '(' ( (lv_argumentsDefinition_4_0= ruleInputValueDefinition ) )* otherlv_5= ')' )? ( (lv_repeatable_6_0= 'repeatable' ) )? otherlv_7= 'on' (otherlv_8= '|' )? ( (lv_directiveLocations_9_0= ruleDirectiveLocation ) ) (otherlv_10= '|' ( (lv_directiveLocations_11_0= ruleDirectiveLocation ) ) )* ) ;
    public final EObject ruleDirectiveDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_repeatable_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_description_0_0 = null;

        EObject lv_argumentsDefinition_4_0 = null;

        Enumerator lv_directiveLocations_9_0 = null;

        Enumerator lv_directiveLocations_11_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1974:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) (otherlv_3= '(' ( (lv_argumentsDefinition_4_0= ruleInputValueDefinition ) )* otherlv_5= ')' )? ( (lv_repeatable_6_0= 'repeatable' ) )? otherlv_7= 'on' (otherlv_8= '|' )? ( (lv_directiveLocations_9_0= ruleDirectiveLocation ) ) (otherlv_10= '|' ( (lv_directiveLocations_11_0= ruleDirectiveLocation ) ) )* ) )
            // InternalGraphQL.g:1975:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) (otherlv_3= '(' ( (lv_argumentsDefinition_4_0= ruleInputValueDefinition ) )* otherlv_5= ')' )? ( (lv_repeatable_6_0= 'repeatable' ) )? otherlv_7= 'on' (otherlv_8= '|' )? ( (lv_directiveLocations_9_0= ruleDirectiveLocation ) ) (otherlv_10= '|' ( (lv_directiveLocations_11_0= ruleDirectiveLocation ) ) )* )
            {
            // InternalGraphQL.g:1975:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) (otherlv_3= '(' ( (lv_argumentsDefinition_4_0= ruleInputValueDefinition ) )* otherlv_5= ')' )? ( (lv_repeatable_6_0= 'repeatable' ) )? otherlv_7= 'on' (otherlv_8= '|' )? ( (lv_directiveLocations_9_0= ruleDirectiveLocation ) ) (otherlv_10= '|' ( (lv_directiveLocations_11_0= ruleDirectiveLocation ) ) )* )
            // InternalGraphQL.g:1976:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) (otherlv_3= '(' ( (lv_argumentsDefinition_4_0= ruleInputValueDefinition ) )* otherlv_5= ')' )? ( (lv_repeatable_6_0= 'repeatable' ) )? otherlv_7= 'on' (otherlv_8= '|' )? ( (lv_directiveLocations_9_0= ruleDirectiveLocation ) ) (otherlv_10= '|' ( (lv_directiveLocations_11_0= ruleDirectiveLocation ) ) )*
            {
            // InternalGraphQL.g:1976:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_SL_STRING_VALUE && LA48_0<=RULE_ML_STRING_VALUE)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGraphQL.g:1977:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1977:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1978:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_description_0_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDirectiveDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"io.github.katmatt.graphql.GraphQL.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,36,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectiveDefinitionAccess().getDirectiveKeyword_1());
            		
            // InternalGraphQL.g:1999:3: ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:2000:4: (lv_name_2_0= RULE_DIRECTIVE_NAME )
            {
            // InternalGraphQL.g:2000:4: (lv_name_2_0= RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:2001:5: lv_name_2_0= RULE_DIRECTIVE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_DIRECTIVE_NAME,FOLLOW_36); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDirectiveDefinitionAccess().getNameDIRECTIVE_NAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectiveDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"io.github.katmatt.graphql.GraphQL.DIRECTIVE_NAME");
            				

            }


            }

            // InternalGraphQL.g:2017:3: (otherlv_3= '(' ( (lv_argumentsDefinition_4_0= ruleInputValueDefinition ) )* otherlv_5= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==23) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGraphQL.g:2018:4: otherlv_3= '(' ( (lv_argumentsDefinition_4_0= ruleInputValueDefinition ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getDirectiveDefinitionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalGraphQL.g:2022:4: ( (lv_argumentsDefinition_4_0= ruleInputValueDefinition ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_NAME||(LA49_0>=RULE_SL_STRING_VALUE && LA49_0<=RULE_ML_STRING_VALUE)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalGraphQL.g:2023:5: (lv_argumentsDefinition_4_0= ruleInputValueDefinition )
                    	    {
                    	    // InternalGraphQL.g:2023:5: (lv_argumentsDefinition_4_0= ruleInputValueDefinition )
                    	    // InternalGraphQL.g:2024:6: lv_argumentsDefinition_4_0= ruleInputValueDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getArgumentsDefinitionInputValueDefinitionParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_argumentsDefinition_4_0=ruleInputValueDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDirectiveDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"argumentsDefinition",
                    	    							lv_argumentsDefinition_4_0,
                    	    							"io.github.katmatt.graphql.GraphQL.InputValueDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getDirectiveDefinitionAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalGraphQL.g:2046:3: ( (lv_repeatable_6_0= 'repeatable' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGraphQL.g:2047:4: (lv_repeatable_6_0= 'repeatable' )
                    {
                    // InternalGraphQL.g:2047:4: (lv_repeatable_6_0= 'repeatable' )
                    // InternalGraphQL.g:2048:5: lv_repeatable_6_0= 'repeatable'
                    {
                    lv_repeatable_6_0=(Token)match(input,37,FOLLOW_38); 

                    					newLeafNode(lv_repeatable_6_0, grammarAccess.getDirectiveDefinitionAccess().getRepeatableRepeatableKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectiveDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "repeatable", lv_repeatable_6_0 != null, "repeatable");
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,38,FOLLOW_39); 

            			newLeafNode(otherlv_7, grammarAccess.getDirectiveDefinitionAccess().getOnKeyword_5());
            		
            // InternalGraphQL.g:2064:3: (otherlv_8= '|' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==27) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGraphQL.g:2065:4: otherlv_8= '|'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getDirectiveDefinitionAccess().getVerticalLineKeyword_6());
                    			

                    }
                    break;

            }

            // InternalGraphQL.g:2070:3: ( (lv_directiveLocations_9_0= ruleDirectiveLocation ) )
            // InternalGraphQL.g:2071:4: (lv_directiveLocations_9_0= ruleDirectiveLocation )
            {
            // InternalGraphQL.g:2071:4: (lv_directiveLocations_9_0= ruleDirectiveLocation )
            // InternalGraphQL.g:2072:5: lv_directiveLocations_9_0= ruleDirectiveLocation
            {

            					newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_25);
            lv_directiveLocations_9_0=ruleDirectiveLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectiveDefinitionRule());
            					}
            					add(
            						current,
            						"directiveLocations",
            						lv_directiveLocations_9_0,
            						"io.github.katmatt.graphql.GraphQL.DirectiveLocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphQL.g:2089:3: (otherlv_10= '|' ( (lv_directiveLocations_11_0= ruleDirectiveLocation ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==27) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalGraphQL.g:2090:4: otherlv_10= '|' ( (lv_directiveLocations_11_0= ruleDirectiveLocation ) )
            	    {
            	    otherlv_10=(Token)match(input,27,FOLLOW_39); 

            	    				newLeafNode(otherlv_10, grammarAccess.getDirectiveDefinitionAccess().getVerticalLineKeyword_8_0());
            	    			
            	    // InternalGraphQL.g:2094:4: ( (lv_directiveLocations_11_0= ruleDirectiveLocation ) )
            	    // InternalGraphQL.g:2095:5: (lv_directiveLocations_11_0= ruleDirectiveLocation )
            	    {
            	    // InternalGraphQL.g:2095:5: (lv_directiveLocations_11_0= ruleDirectiveLocation )
            	    // InternalGraphQL.g:2096:6: lv_directiveLocations_11_0= ruleDirectiveLocation
            	    {

            	    						newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_directiveLocations_11_0=ruleDirectiveLocation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDirectiveDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"directiveLocations",
            	    							lv_directiveLocations_11_0,
            	    							"io.github.katmatt.graphql.GraphQL.DirectiveLocation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectiveDefinition"


    // $ANTLR start "entryRuleDirective"
    // InternalGraphQL.g:2118:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalGraphQL.g:2118:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalGraphQL.g:2119:2: iv_ruleDirective= ruleDirective EOF
            {
             newCompositeNode(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirective=ruleDirective();

            state._fsp--;

             current =iv_ruleDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalGraphQL.g:2125:1: ruleDirective returns [EObject current=null] : ( ( (otherlv_0= RULE_DIRECTIVE_NAME ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' )? ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:2131:2: ( ( ( (otherlv_0= RULE_DIRECTIVE_NAME ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' )? ) )
            // InternalGraphQL.g:2132:2: ( ( (otherlv_0= RULE_DIRECTIVE_NAME ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' )? )
            {
            // InternalGraphQL.g:2132:2: ( ( (otherlv_0= RULE_DIRECTIVE_NAME ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' )? )
            // InternalGraphQL.g:2133:3: ( (otherlv_0= RULE_DIRECTIVE_NAME ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' )?
            {
            // InternalGraphQL.g:2133:3: ( (otherlv_0= RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:2134:4: (otherlv_0= RULE_DIRECTIVE_NAME )
            {
            // InternalGraphQL.g:2134:4: (otherlv_0= RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:2135:5: otherlv_0= RULE_DIRECTIVE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectiveRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_DIRECTIVE_NAME,FOLLOW_40); 

            					newLeafNode(otherlv_0, grammarAccess.getDirectiveAccess().getDirectiveDirectiveDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalGraphQL.g:2146:3: (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==23) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGraphQL.g:2147:4: otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_41); 

                    				newLeafNode(otherlv_1, grammarAccess.getDirectiveAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalGraphQL.g:2151:4: ( (lv_arguments_2_0= ruleArgument ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==RULE_NAME) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalGraphQL.g:2152:5: (lv_arguments_2_0= ruleArgument )
                    	    {
                    	    // InternalGraphQL.g:2152:5: (lv_arguments_2_0= ruleArgument )
                    	    // InternalGraphQL.g:2153:6: lv_arguments_2_0= ruleArgument
                    	    {

                    	    						newCompositeNode(grammarAccess.getDirectiveAccess().getArgumentsArgumentParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_41);
                    	    lv_arguments_2_0=ruleArgument();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDirectiveRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"arguments",
                    	    							lv_arguments_2_0,
                    	    							"io.github.katmatt.graphql.GraphQL.Argument");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDirectiveAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleArgument"
    // InternalGraphQL.g:2179:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalGraphQL.g:2179:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalGraphQL.g:2180:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalGraphQL.g:2186:1: ruleArgument returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:2192:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) )
            // InternalGraphQL.g:2193:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            {
            // InternalGraphQL.g:2193:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            // InternalGraphQL.g:2194:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) )
            {
            // InternalGraphQL.g:2194:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:2195:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:2195:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:2196:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getArgumentAccess().getArgumentDefinitionInputValueDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:2211:3: ( (lv_value_2_0= ruleConstValue ) )
            // InternalGraphQL.g:2212:4: (lv_value_2_0= ruleConstValue )
            {
            // InternalGraphQL.g:2212:4: (lv_value_2_0= ruleConstValue )
            // InternalGraphQL.g:2213:5: lv_value_2_0= ruleConstValue
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getValueConstValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleConstValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"io.github.katmatt.graphql.GraphQL.ConstValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "ruleDirectiveLocation"
    // InternalGraphQL.g:2234:1: ruleDirectiveLocation returns [Enumerator current=null] : ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) ) ;
    public final Enumerator ruleDirectiveLocation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;


        	enterRule();

        try {
            // InternalGraphQL.g:2240:2: ( ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) ) )
            // InternalGraphQL.g:2241:2: ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) )
            {
            // InternalGraphQL.g:2241:2: ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) )
            int alt56=19;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt56=1;
                }
                break;
            case 40:
                {
                alt56=2;
                }
                break;
            case 41:
                {
                alt56=3;
                }
                break;
            case 42:
                {
                alt56=4;
                }
                break;
            case 43:
                {
                alt56=5;
                }
                break;
            case 44:
                {
                alt56=6;
                }
                break;
            case 45:
                {
                alt56=7;
                }
                break;
            case 46:
                {
                alt56=8;
                }
                break;
            case 47:
                {
                alt56=9;
                }
                break;
            case 48:
                {
                alt56=10;
                }
                break;
            case 49:
                {
                alt56=11;
                }
                break;
            case 50:
                {
                alt56=12;
                }
                break;
            case 51:
                {
                alt56=13;
                }
                break;
            case 52:
                {
                alt56=14;
                }
                break;
            case 53:
                {
                alt56=15;
                }
                break;
            case 54:
                {
                alt56=16;
                }
                break;
            case 55:
                {
                alt56=17;
                }
                break;
            case 56:
                {
                alt56=18;
                }
                break;
            case 57:
                {
                alt56=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalGraphQL.g:2242:3: (enumLiteral_0= 'QUERY' )
                    {
                    // InternalGraphQL.g:2242:3: (enumLiteral_0= 'QUERY' )
                    // InternalGraphQL.g:2243:4: enumLiteral_0= 'QUERY'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:2250:3: (enumLiteral_1= 'MUTATION' )
                    {
                    // InternalGraphQL.g:2250:3: (enumLiteral_1= 'MUTATION' )
                    // InternalGraphQL.g:2251:4: enumLiteral_1= 'MUTATION'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:2258:3: (enumLiteral_2= 'SUBSCRIPTION' )
                    {
                    // InternalGraphQL.g:2258:3: (enumLiteral_2= 'SUBSCRIPTION' )
                    // InternalGraphQL.g:2259:4: enumLiteral_2= 'SUBSCRIPTION'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:2266:3: (enumLiteral_3= 'FIELD' )
                    {
                    // InternalGraphQL.g:2266:3: (enumLiteral_3= 'FIELD' )
                    // InternalGraphQL.g:2267:4: enumLiteral_3= 'FIELD'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:2274:3: (enumLiteral_4= 'FRAGMENT_DEFINITION' )
                    {
                    // InternalGraphQL.g:2274:3: (enumLiteral_4= 'FRAGMENT_DEFINITION' )
                    // InternalGraphQL.g:2275:4: enumLiteral_4= 'FRAGMENT_DEFINITION'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:2282:3: (enumLiteral_5= 'FRAGMENT_SPREAD' )
                    {
                    // InternalGraphQL.g:2282:3: (enumLiteral_5= 'FRAGMENT_SPREAD' )
                    // InternalGraphQL.g:2283:4: enumLiteral_5= 'FRAGMENT_SPREAD'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:2290:3: (enumLiteral_6= 'INLINE_FRAGMENT' )
                    {
                    // InternalGraphQL.g:2290:3: (enumLiteral_6= 'INLINE_FRAGMENT' )
                    // InternalGraphQL.g:2291:4: enumLiteral_6= 'INLINE_FRAGMENT'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphQL.g:2298:3: (enumLiteral_7= 'VARIABLE_DEFINITION' )
                    {
                    // InternalGraphQL.g:2298:3: (enumLiteral_7= 'VARIABLE_DEFINITION' )
                    // InternalGraphQL.g:2299:4: enumLiteral_7= 'VARIABLE_DEFINITION'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGraphQL.g:2306:3: (enumLiteral_8= 'SCHEMA' )
                    {
                    // InternalGraphQL.g:2306:3: (enumLiteral_8= 'SCHEMA' )
                    // InternalGraphQL.g:2307:4: enumLiteral_8= 'SCHEMA'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGraphQL.g:2314:3: (enumLiteral_9= 'SCALAR' )
                    {
                    // InternalGraphQL.g:2314:3: (enumLiteral_9= 'SCALAR' )
                    // InternalGraphQL.g:2315:4: enumLiteral_9= 'SCALAR'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalGraphQL.g:2322:3: (enumLiteral_10= 'OBJECT' )
                    {
                    // InternalGraphQL.g:2322:3: (enumLiteral_10= 'OBJECT' )
                    // InternalGraphQL.g:2323:4: enumLiteral_10= 'OBJECT'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalGraphQL.g:2330:3: (enumLiteral_11= 'FIELD_DEFINITION' )
                    {
                    // InternalGraphQL.g:2330:3: (enumLiteral_11= 'FIELD_DEFINITION' )
                    // InternalGraphQL.g:2331:4: enumLiteral_11= 'FIELD_DEFINITION'
                    {
                    enumLiteral_11=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalGraphQL.g:2338:3: (enumLiteral_12= 'ARGUMENT_DEFINITION' )
                    {
                    // InternalGraphQL.g:2338:3: (enumLiteral_12= 'ARGUMENT_DEFINITION' )
                    // InternalGraphQL.g:2339:4: enumLiteral_12= 'ARGUMENT_DEFINITION'
                    {
                    enumLiteral_12=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalGraphQL.g:2346:3: (enumLiteral_13= 'INTERFACE' )
                    {
                    // InternalGraphQL.g:2346:3: (enumLiteral_13= 'INTERFACE' )
                    // InternalGraphQL.g:2347:4: enumLiteral_13= 'INTERFACE'
                    {
                    enumLiteral_13=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalGraphQL.g:2354:3: (enumLiteral_14= 'UNION' )
                    {
                    // InternalGraphQL.g:2354:3: (enumLiteral_14= 'UNION' )
                    // InternalGraphQL.g:2355:4: enumLiteral_14= 'UNION'
                    {
                    enumLiteral_14=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalGraphQL.g:2362:3: (enumLiteral_15= 'ENUM' )
                    {
                    // InternalGraphQL.g:2362:3: (enumLiteral_15= 'ENUM' )
                    // InternalGraphQL.g:2363:4: enumLiteral_15= 'ENUM'
                    {
                    enumLiteral_15=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalGraphQL.g:2370:3: (enumLiteral_16= 'ENUM_VALUE' )
                    {
                    // InternalGraphQL.g:2370:3: (enumLiteral_16= 'ENUM_VALUE' )
                    // InternalGraphQL.g:2371:4: enumLiteral_16= 'ENUM_VALUE'
                    {
                    enumLiteral_16=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalGraphQL.g:2378:3: (enumLiteral_17= 'INPUT_OBJECT' )
                    {
                    // InternalGraphQL.g:2378:3: (enumLiteral_17= 'INPUT_OBJECT' )
                    // InternalGraphQL.g:2379:4: enumLiteral_17= 'INPUT_OBJECT'
                    {
                    enumLiteral_17=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalGraphQL.g:2386:3: (enumLiteral_18= 'INPUT_FIELD_DEFINITION' )
                    {
                    // InternalGraphQL.g:2386:3: (enumLiteral_18= 'INPUT_FIELD_DEFINITION' )
                    // InternalGraphQL.g:2387:4: enumLiteral_18= 'INPUT_FIELD_DEFINITION'
                    {
                    enumLiteral_18=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINPUT_FIELD_DEFINITIONEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getDirectiveLocationAccess().getINPUT_FIELD_DEFINITIONEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectiveLocation"


    // $ANTLR start "ruleOperationType"
    // InternalGraphQL.g:2397:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:2403:2: ( ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) )
            // InternalGraphQL.g:2404:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            {
            // InternalGraphQL.g:2404:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt57=1;
                }
                break;
            case 59:
                {
                alt57=2;
                }
                break;
            case 60:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalGraphQL.g:2405:3: (enumLiteral_0= 'query' )
                    {
                    // InternalGraphQL.g:2405:3: (enumLiteral_0= 'query' )
                    // InternalGraphQL.g:2406:4: enumLiteral_0= 'query'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:2413:3: (enumLiteral_1= 'mutation' )
                    {
                    // InternalGraphQL.g:2413:3: (enumLiteral_1= 'mutation' )
                    // InternalGraphQL.g:2414:4: enumLiteral_1= 'mutation'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:2421:3: (enumLiteral_2= 'subscription' )
                    {
                    // InternalGraphQL.g:2421:3: (enumLiteral_2= 'subscription' )
                    // InternalGraphQL.g:2422:4: enumLiteral_2= 'subscription'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000010324C4182L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1C00000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000108202L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208202L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010190L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000202L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000088000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000E800081F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000F800081F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x03FFFF8008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001000010L});

}