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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_INT_VALUE", "RULE_FLOAT_VALUE", "RULE_SL_STRING_VALUE", "RULE_ML_STRING_VALUE", "RULE_DIRECTIVE_NAME", "RULE_WS", "RULE_SL_COMMENT", "RULE_COMMA", "RULE_STRING_CHARACTER", "'schema'", "'{'", "'}'", "':'", "'scalar'", "'type'", "'implements'", "'interface'", "'union'", "'='", "'|'", "'enum'", "'input'", "'&'", "'!'", "'['", "']'", "'null'", "'true'", "'false'", "'directive'", "'repeatable'", "'on'", "'('", "')'", "'QUERY'", "'MUTATION'", "'SUBSCRIPTION'", "'FIELD'", "'FRAGMENT_DEFINITION'", "'FRAGMENT_SPREAD'", "'INLINE_FRAGMENT'", "'VARIABLE_DEFINITION'", "'SCHEMA'", "'SCALAR'", "'OBJECT'", "'FIELD_DEFINITION'", "'ARGUMENT_DEFINITION'", "'INTERFACE'", "'UNION'", "'ENUM'", "'ENUM_VALUE'", "'INPUT_OBJECT'", "'INPUT_FIELD_DEFINITION'", "'query'", "'mutation'", "'subscription'"
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
                    case 18:
                    case 19:
                    case 21:
                    case 22:
                    case 25:
                    case 26:
                        {
                        alt1=2;
                        }
                        break;
                    case 34:
                        {
                        alt1=3;
                        }
                        break;
                    case 14:
                        {
                        alt1=1;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_ML_STRING_VALUE:
                    {
                    switch ( input.LA(2) ) {
                    case 14:
                        {
                        alt1=1;
                        }
                        break;
                    case 18:
                    case 19:
                    case 21:
                    case 22:
                    case 25:
                    case 26:
                        {
                        alt1=2;
                        }
                        break;
                    case 34:
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
                case 21:
                case 22:
                case 25:
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 34:
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
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                case 21:
                    {
                    alt4=3;
                    }
                    break;
                case 19:
                    {
                    alt4=2;
                    }
                    break;
                case 22:
                    {
                    alt4=4;
                    }
                    break;
                case 26:
                    {
                    alt4=6;
                    }
                    break;
                case 25:
                    {
                    alt4=5;
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
                case 19:
                    {
                    alt4=2;
                    }
                    break;
                case 22:
                    {
                    alt4=4;
                    }
                    break;
                case 26:
                    {
                    alt4=6;
                    }
                    break;
                case 25:
                    {
                    alt4=5;
                    }
                    break;
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                case 21:
                    {
                    alt4=3;
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
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            case 25:
                {
                alt4=5;
                }
                break;
            case 26:
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
    // InternalGraphQL.g:346:1: ruleScalarTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ) ;
    public final EObject ruleScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_description_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:352:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ) )
            // InternalGraphQL.g:353:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:353:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) )
            // InternalGraphQL.g:354:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) )
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
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

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
    // InternalGraphQL.g:399:1: entryRuleObjectTypeDefinition returns [EObject current=null] : iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF ;
    public final EObject entryRuleObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:399:61: (iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF )
            // InternalGraphQL.g:400:2: iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF
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
    // InternalGraphQL.g:406:1: ruleObjectTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? ( (lv_directives_5_0= ruleDirective ) )* (otherlv_6= '{' ( (lv_fieldDefinitions_7_0= ruleFieldDefinition ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_description_0_0 = null;

        EObject lv_implements_4_0 = null;

        EObject lv_directives_5_0 = null;

        EObject lv_fieldDefinitions_7_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:412:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? ( (lv_directives_5_0= ruleDirective ) )* (otherlv_6= '{' ( (lv_fieldDefinitions_7_0= ruleFieldDefinition ) )* otherlv_8= '}' )? ) )
            // InternalGraphQL.g:413:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? ( (lv_directives_5_0= ruleDirective ) )* (otherlv_6= '{' ( (lv_fieldDefinitions_7_0= ruleFieldDefinition ) )* otherlv_8= '}' )? )
            {
            // InternalGraphQL.g:413:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? ( (lv_directives_5_0= ruleDirective ) )* (otherlv_6= '{' ( (lv_fieldDefinitions_7_0= ruleFieldDefinition ) )* otherlv_8= '}' )? )
            // InternalGraphQL.g:414:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? ( (lv_directives_5_0= ruleDirective ) )* (otherlv_6= '{' ( (lv_fieldDefinitions_7_0= ruleFieldDefinition ) )* otherlv_8= '}' )?
            {
            // InternalGraphQL.g:414:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SL_STRING_VALUE && LA6_0<=RULE_ML_STRING_VALUE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphQL.g:415:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:415:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:416:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
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
            		
            // InternalGraphQL.g:437:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:438:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:438:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:439:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_12); 

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

            // InternalGraphQL.g:455:3: (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphQL.g:456:4: otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectTypeDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGraphQL.g:460:4: ( (lv_implements_4_0= ruleIntersectionType ) )
                    // InternalGraphQL.g:461:5: (lv_implements_4_0= ruleIntersectionType )
                    {
                    // InternalGraphQL.g:461:5: (lv_implements_4_0= ruleIntersectionType )
                    // InternalGraphQL.g:462:6: lv_implements_4_0= ruleIntersectionType
                    {

                    						newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getImplementsIntersectionTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_implements_4_0=ruleIntersectionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"implements",
                    							lv_implements_4_0,
                    							"io.github.katmatt.graphql.GraphQL.IntersectionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphQL.g:480:3: ( (lv_directives_5_0= ruleDirective ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DIRECTIVE_NAME) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGraphQL.g:481:4: (lv_directives_5_0= ruleDirective )
            	    {
            	    // InternalGraphQL.g:481:4: (lv_directives_5_0= ruleDirective )
            	    // InternalGraphQL.g:482:5: lv_directives_5_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_directives_5_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_5_0,
            	    						"io.github.katmatt.graphql.GraphQL.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalGraphQL.g:499:3: (otherlv_6= '{' ( (lv_fieldDefinitions_7_0= ruleFieldDefinition ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:500:4: otherlv_6= '{' ( (lv_fieldDefinitions_7_0= ruleFieldDefinition ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalGraphQL.g:504:4: ( (lv_fieldDefinitions_7_0= ruleFieldDefinition ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_NAME||(LA9_0>=RULE_SL_STRING_VALUE && LA9_0<=RULE_ML_STRING_VALUE)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGraphQL.g:505:5: (lv_fieldDefinitions_7_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:505:5: (lv_fieldDefinitions_7_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:506:6: lv_fieldDefinitions_7_0= ruleFieldDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_fieldDefinitions_7_0=ruleFieldDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldDefinitions",
                    	    							lv_fieldDefinitions_7_0,
                    	    							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_5_2());
                    			

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
    // InternalGraphQL.g:532:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalGraphQL.g:532:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalGraphQL.g:533:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
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
    // InternalGraphQL.g:539:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_description_0_0 = null;

        EObject lv_implements_4_0 = null;

        EObject lv_fieldDefinitions_6_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:545:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) )
            // InternalGraphQL.g:546:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            {
            // InternalGraphQL.g:546:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            // InternalGraphQL.g:547:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            {
            // InternalGraphQL.g:547:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_SL_STRING_VALUE && LA11_0<=RULE_ML_STRING_VALUE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphQL.g:548:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:548:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:549:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_16);
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

            otherlv_1=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
            		
            // InternalGraphQL.g:570:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:571:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:571:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:572:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_17); 

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

            // InternalGraphQL.g:588:3: (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphQL.g:589:4: otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getInterfaceDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGraphQL.g:593:4: ( (lv_implements_4_0= ruleIntersectionType ) )
                    // InternalGraphQL.g:594:5: (lv_implements_4_0= ruleIntersectionType )
                    {
                    // InternalGraphQL.g:594:5: (lv_implements_4_0= ruleIntersectionType )
                    // InternalGraphQL.g:595:6: lv_implements_4_0= ruleIntersectionType
                    {

                    						newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getImplementsIntersectionTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_implements_4_0=ruleIntersectionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"implements",
                    							lv_implements_4_0,
                    							"io.github.katmatt.graphql.GraphQL.IntersectionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphQL.g:613:3: (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphQL.g:614:4: otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalGraphQL.g:618:4: ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_NAME||(LA13_0>=RULE_SL_STRING_VALUE && LA13_0<=RULE_ML_STRING_VALUE)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGraphQL.g:619:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:619:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:620:6: lv_fieldDefinitions_6_0= ruleFieldDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_fieldDefinitions_6_0=ruleFieldDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldDefinitions",
                    	    							lv_fieldDefinitions_6_0,
                    	    							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_4_2());
                    			

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
    // InternalGraphQL.g:646:1: entryRuleFieldDefinition returns [EObject current=null] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final EObject entryRuleFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDefinition = null;


        try {
            // InternalGraphQL.g:646:56: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // InternalGraphQL.g:647:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
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
    // InternalGraphQL.g:653:1: ruleFieldDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_arguments_2_0= ruleArgumentsDefinition ) )? otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_description_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:659:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_arguments_2_0= ruleArgumentsDefinition ) )? otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // InternalGraphQL.g:660:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_arguments_2_0= ruleArgumentsDefinition ) )? otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // InternalGraphQL.g:660:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_arguments_2_0= ruleArgumentsDefinition ) )? otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // InternalGraphQL.g:661:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_arguments_2_0= ruleArgumentsDefinition ) )? otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            // InternalGraphQL.g:661:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_SL_STRING_VALUE && LA15_0<=RULE_ML_STRING_VALUE)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphQL.g:662:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:662:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:663:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:680:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:681:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:681:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:682:5: lv_name_1_0= RULE_NAME
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

            // InternalGraphQL.g:698:3: ( (lv_arguments_2_0= ruleArgumentsDefinition ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGraphQL.g:699:4: (lv_arguments_2_0= ruleArgumentsDefinition )
                    {
                    // InternalGraphQL.g:699:4: (lv_arguments_2_0= ruleArgumentsDefinition )
                    // InternalGraphQL.g:700:5: lv_arguments_2_0= ruleArgumentsDefinition
                    {

                    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getArgumentsArgumentsDefinitionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_arguments_2_0=ruleArgumentsDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"arguments",
                    						lv_arguments_2_0,
                    						"io.github.katmatt.graphql.GraphQL.ArgumentsDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldDefinitionAccess().getColonKeyword_3());
            		
            // InternalGraphQL.g:721:3: ( (lv_type_4_0= ruleType ) )
            // InternalGraphQL.g:722:4: (lv_type_4_0= ruleType )
            {
            // InternalGraphQL.g:722:4: (lv_type_4_0= ruleType )
            // InternalGraphQL.g:723:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
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
    // InternalGraphQL.g:744:1: entryRuleUnionTypeDefinition returns [EObject current=null] : iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF ;
    public final EObject entryRuleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionTypeDefinition = null;


        try {
            // InternalGraphQL.g:744:60: (iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF )
            // InternalGraphQL.g:745:2: iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF
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
    // InternalGraphQL.g:751:1: ruleUnionTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )? ) ;
    public final EObject ruleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_description_0_0 = null;

        EObject lv_memberTypes_5_0 = null;

        EObject lv_memberTypes_7_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:757:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )? ) )
            // InternalGraphQL.g:758:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )? )
            {
            // InternalGraphQL.g:758:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )? )
            // InternalGraphQL.g:759:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )?
            {
            // InternalGraphQL.g:759:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_SL_STRING_VALUE && LA17_0<=RULE_ML_STRING_VALUE)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphQL.g:760:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:760:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:761:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_20);
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

            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_1());
            		
            // InternalGraphQL.g:782:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:783:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:783:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:784:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_21); 

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

            // InternalGraphQL.g:800:3: (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphQL.g:801:4: otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )*
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGraphQL.g:805:4: (otherlv_4= '|' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==24) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalGraphQL.g:806:5: otherlv_4= '|'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_13); 

                            					newLeafNode(otherlv_4, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_1());
                            				

                            }
                            break;

                    }

                    // InternalGraphQL.g:811:4: ( (lv_memberTypes_5_0= ruleType ) )
                    // InternalGraphQL.g:812:5: (lv_memberTypes_5_0= ruleType )
                    {
                    // InternalGraphQL.g:812:5: (lv_memberTypes_5_0= ruleType )
                    // InternalGraphQL.g:813:6: lv_memberTypes_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_memberTypes_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnionTypeDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"memberTypes",
                    							lv_memberTypes_5_0,
                    							"io.github.katmatt.graphql.GraphQL.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphQL.g:830:4: (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==24) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGraphQL.g:831:5: otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_3_0());
                    	    				
                    	    // InternalGraphQL.g:835:5: ( (lv_memberTypes_7_0= ruleType ) )
                    	    // InternalGraphQL.g:836:6: (lv_memberTypes_7_0= ruleType )
                    	    {
                    	    // InternalGraphQL.g:836:6: (lv_memberTypes_7_0= ruleType )
                    	    // InternalGraphQL.g:837:7: lv_memberTypes_7_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_memberTypes_7_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnionTypeDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"memberTypes",
                    	    								lv_memberTypes_7_0,
                    	    								"io.github.katmatt.graphql.GraphQL.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // InternalGraphQL.g:860:1: entryRuleEnumTypeDefinition returns [EObject current=null] : iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF ;
    public final EObject entryRuleEnumTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDefinition = null;


        try {
            // InternalGraphQL.g:860:59: (iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF )
            // InternalGraphQL.g:861:2: iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF
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
    // InternalGraphQL.g:867:1: ruleEnumTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleEnumTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_0_0 = null;

        EObject lv_valueDefinitions_4_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:873:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )* otherlv_5= '}' )? ) )
            // InternalGraphQL.g:874:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )* otherlv_5= '}' )? )
            {
            // InternalGraphQL.g:874:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )* otherlv_5= '}' )? )
            // InternalGraphQL.g:875:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )* otherlv_5= '}' )?
            {
            // InternalGraphQL.g:875:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_SL_STRING_VALUE && LA21_0<=RULE_ML_STRING_VALUE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphQL.g:876:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:876:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:877:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_24);
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

            otherlv_1=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_1());
            		
            // InternalGraphQL.g:898:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:899:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:899:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:900:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_18); 

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

            // InternalGraphQL.g:916:3: (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )* otherlv_5= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGraphQL.g:917:4: otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalGraphQL.g:921:4: ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_NAME||(LA22_0>=RULE_SL_STRING_VALUE && LA22_0<=RULE_ML_STRING_VALUE)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGraphQL.g:922:5: (lv_valueDefinitions_4_0= ruleEnumValueDefinition )
                    	    {
                    	    // InternalGraphQL.g:922:5: (lv_valueDefinitions_4_0= ruleEnumValueDefinition )
                    	    // InternalGraphQL.g:923:6: lv_valueDefinitions_4_0= ruleEnumValueDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_valueDefinitions_4_0=ruleEnumValueDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEnumTypeDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"valueDefinitions",
                    	    							lv_valueDefinitions_4_0,
                    	    							"io.github.katmatt.graphql.GraphQL.EnumValueDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // InternalGraphQL.g:949:1: entryRuleEnumValueDefinition returns [EObject current=null] : iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF ;
    public final EObject entryRuleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValueDefinition = null;


        try {
            // InternalGraphQL.g:949:60: (iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF )
            // InternalGraphQL.g:950:2: iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF
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
    // InternalGraphQL.g:956:1: ruleEnumValueDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:962:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGraphQL.g:963:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:963:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGraphQL.g:964:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:964:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_SL_STRING_VALUE && LA24_0<=RULE_ML_STRING_VALUE)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphQL.g:965:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:965:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:966:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:983:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:984:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:984:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:985:5: lv_name_1_0= RULE_NAME
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
    // InternalGraphQL.g:1005:1: entryRuleInputObjectTypeDefinition returns [EObject current=null] : iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF ;
    public final EObject entryRuleInputObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:1005:66: (iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF )
            // InternalGraphQL.g:1006:2: iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF
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
    // InternalGraphQL.g:1012:1: ruleInputObjectTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleInputObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_0_0 = null;

        EObject lv_inputsFieldDefinitions_4_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1018:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? ) )
            // InternalGraphQL.g:1019:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? )
            {
            // InternalGraphQL.g:1019:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? )
            // InternalGraphQL.g:1020:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )?
            {
            // InternalGraphQL.g:1020:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_SL_STRING_VALUE && LA25_0<=RULE_ML_STRING_VALUE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphQL.g:1021:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1021:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1022:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_25);
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

            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_1());
            		
            // InternalGraphQL.g:1043:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:1044:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:1044:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:1045:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_18); 

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

            // InternalGraphQL.g:1061:3: (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGraphQL.g:1062:4: otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalGraphQL.g:1066:4: ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_NAME||(LA26_0>=RULE_SL_STRING_VALUE && LA26_0<=RULE_ML_STRING_VALUE)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGraphQL.g:1067:5: (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition )
                    	    {
                    	    // InternalGraphQL.g:1067:5: (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition )
                    	    // InternalGraphQL.g:1068:6: lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getInputsFieldDefinitionsInputValueDefinitionParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_inputsFieldDefinitions_4_0=ruleInputValueDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInputObjectTypeDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputsFieldDefinitions",
                    	    							lv_inputsFieldDefinitions_4_0,
                    	    							"io.github.katmatt.graphql.GraphQL.InputValueDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // InternalGraphQL.g:1094:1: entryRuleInputValueDefinition returns [EObject current=null] : iv_ruleInputValueDefinition= ruleInputValueDefinition EOF ;
    public final EObject entryRuleInputValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputValueDefinition = null;


        try {
            // InternalGraphQL.g:1094:61: (iv_ruleInputValueDefinition= ruleInputValueDefinition EOF )
            // InternalGraphQL.g:1095:2: iv_ruleInputValueDefinition= ruleInputValueDefinition EOF
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
    // InternalGraphQL.g:1101:1: ruleInputValueDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? ) ;
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
            // InternalGraphQL.g:1107:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? ) )
            // InternalGraphQL.g:1108:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? )
            {
            // InternalGraphQL.g:1108:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? )
            // InternalGraphQL.g:1109:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )?
            {
            // InternalGraphQL.g:1109:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_SL_STRING_VALUE && LA28_0<=RULE_ML_STRING_VALUE)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphQL.g:1110:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1110:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1111:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:1128:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:1129:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:1129:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:1130:5: lv_name_1_0= RULE_NAME
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

            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getInputValueDefinitionAccess().getColonKeyword_2());
            		
            // InternalGraphQL.g:1150:3: ( (lv_type_3_0= ruleType ) )
            // InternalGraphQL.g:1151:4: (lv_type_3_0= ruleType )
            {
            // InternalGraphQL.g:1151:4: (lv_type_3_0= ruleType )
            // InternalGraphQL.g:1152:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getInputValueDefinitionAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalGraphQL.g:1169:3: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphQL.g:1170:4: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputValueDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalGraphQL.g:1174:4: ( (lv_defaultValue_5_0= ruleConstValue ) )
                    // InternalGraphQL.g:1175:5: (lv_defaultValue_5_0= ruleConstValue )
                    {
                    // InternalGraphQL.g:1175:5: (lv_defaultValue_5_0= ruleConstValue )
                    // InternalGraphQL.g:1176:6: lv_defaultValue_5_0= ruleConstValue
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


    // $ANTLR start "entryRuleIntersectionType"
    // InternalGraphQL.g:1198:1: entryRuleIntersectionType returns [EObject current=null] : iv_ruleIntersectionType= ruleIntersectionType EOF ;
    public final EObject entryRuleIntersectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionType = null;


        try {
            // InternalGraphQL.g:1198:57: (iv_ruleIntersectionType= ruleIntersectionType EOF )
            // InternalGraphQL.g:1199:2: iv_ruleIntersectionType= ruleIntersectionType EOF
            {
             newCompositeNode(grammarAccess.getIntersectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntersectionType=ruleIntersectionType();

            state._fsp--;

             current =iv_ruleIntersectionType; 
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
    // $ANTLR end "entryRuleIntersectionType"


    // $ANTLR start "ruleIntersectionType"
    // InternalGraphQL.g:1205:1: ruleIntersectionType returns [EObject current=null] : ( (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )* ) ;
    public final EObject ruleIntersectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_memberTypes_1_0 = null;

        EObject lv_memberTypes_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1211:2: ( ( (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )* ) )
            // InternalGraphQL.g:1212:2: ( (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )* )
            {
            // InternalGraphQL.g:1212:2: ( (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )* )
            // InternalGraphQL.g:1213:3: (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )*
            {
            // InternalGraphQL.g:1213:3: (otherlv_0= '&' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGraphQL.g:1214:4: otherlv_0= '&'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_0());
                    			

                    }
                    break;

            }

            // InternalGraphQL.g:1219:3: ( (lv_memberTypes_1_0= ruleType ) )
            // InternalGraphQL.g:1220:4: (lv_memberTypes_1_0= ruleType )
            {
            // InternalGraphQL.g:1220:4: (lv_memberTypes_1_0= ruleType )
            // InternalGraphQL.g:1221:5: lv_memberTypes_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_memberTypes_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntersectionTypeRule());
            					}
            					add(
            						current,
            						"memberTypes",
            						lv_memberTypes_1_0,
            						"io.github.katmatt.graphql.GraphQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphQL.g:1238:3: (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGraphQL.g:1239:4: otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_2_0());
            	    			
            	    // InternalGraphQL.g:1243:4: ( (lv_memberTypes_3_0= ruleType ) )
            	    // InternalGraphQL.g:1244:5: (lv_memberTypes_3_0= ruleType )
            	    {
            	    // InternalGraphQL.g:1244:5: (lv_memberTypes_3_0= ruleType )
            	    // InternalGraphQL.g:1245:6: lv_memberTypes_3_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_memberTypes_3_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntersectionTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"memberTypes",
            	    							lv_memberTypes_3_0,
            	    							"io.github.katmatt.graphql.GraphQL.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleIntersectionType"


    // $ANTLR start "entryRuleType"
    // InternalGraphQL.g:1267:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGraphQL.g:1267:45: (iv_ruleType= ruleType EOF )
            // InternalGraphQL.g:1268:2: iv_ruleType= ruleType EOF
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
    // InternalGraphQL.g:1274:1: ruleType returns [EObject current=null] : (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_NamedType_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1280:2: ( (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType ) )
            // InternalGraphQL.g:1281:2: (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType )
            {
            // InternalGraphQL.g:1281:2: (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_NAME) ) {
                alt32=1;
            }
            else if ( (LA32_0==29) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalGraphQL.g:1282:3: this_NamedType_0= ruleNamedType
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
                    // InternalGraphQL.g:1291:3: this_ListType_1= ruleListType
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
    // InternalGraphQL.g:1303:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // InternalGraphQL.g:1303:50: (iv_ruleNamedType= ruleNamedType EOF )
            // InternalGraphQL.g:1304:2: iv_ruleNamedType= ruleNamedType EOF
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
    // InternalGraphQL.g:1310:1: ruleNamedType returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nonNull_1_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1316:2: ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) )
            // InternalGraphQL.g:1317:2: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
            {
            // InternalGraphQL.g:1317:2: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
            // InternalGraphQL.g:1318:3: ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )?
            {
            // InternalGraphQL.g:1318:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1319:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1319:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1320:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedTypeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalGraphQL.g:1331:3: ( (lv_nonNull_1_0= '!' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGraphQL.g:1332:4: (lv_nonNull_1_0= '!' )
                    {
                    // InternalGraphQL.g:1332:4: (lv_nonNull_1_0= '!' )
                    // InternalGraphQL.g:1333:5: lv_nonNull_1_0= '!'
                    {
                    lv_nonNull_1_0=(Token)match(input,28,FOLLOW_2); 

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
    // InternalGraphQL.g:1349:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalGraphQL.g:1349:49: (iv_ruleListType= ruleListType EOF )
            // InternalGraphQL.g:1350:2: iv_ruleListType= ruleListType EOF
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
    // InternalGraphQL.g:1356:1: ruleListType returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_nonNull_3_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1362:2: ( (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? ) )
            // InternalGraphQL.g:1363:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? )
            {
            // InternalGraphQL.g:1363:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? )
            // InternalGraphQL.g:1364:3: otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGraphQL.g:1368:3: ( (lv_type_1_0= ruleType ) )
            // InternalGraphQL.g:1369:4: (lv_type_1_0= ruleType )
            {
            // InternalGraphQL.g:1369:4: (lv_type_1_0= ruleType )
            // InternalGraphQL.g:1370:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_2=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2());
            		
            // InternalGraphQL.g:1391:3: ( (lv_nonNull_3_0= '!' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGraphQL.g:1392:4: (lv_nonNull_3_0= '!' )
                    {
                    // InternalGraphQL.g:1392:4: (lv_nonNull_3_0= '!' )
                    // InternalGraphQL.g:1393:5: lv_nonNull_3_0= '!'
                    {
                    lv_nonNull_3_0=(Token)match(input,28,FOLLOW_2); 

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
    // InternalGraphQL.g:1409:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalGraphQL.g:1409:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalGraphQL.g:1410:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalGraphQL.g:1416:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT_VALUE ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1422:2: ( ( (lv_value_0_0= RULE_INT_VALUE ) ) )
            // InternalGraphQL.g:1423:2: ( (lv_value_0_0= RULE_INT_VALUE ) )
            {
            // InternalGraphQL.g:1423:2: ( (lv_value_0_0= RULE_INT_VALUE ) )
            // InternalGraphQL.g:1424:3: (lv_value_0_0= RULE_INT_VALUE )
            {
            // InternalGraphQL.g:1424:3: (lv_value_0_0= RULE_INT_VALUE )
            // InternalGraphQL.g:1425:4: lv_value_0_0= RULE_INT_VALUE
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
    // InternalGraphQL.g:1444:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalGraphQL.g:1444:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalGraphQL.g:1445:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalGraphQL.g:1451:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT_VALUE ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1457:2: ( ( (lv_value_0_0= RULE_FLOAT_VALUE ) ) )
            // InternalGraphQL.g:1458:2: ( (lv_value_0_0= RULE_FLOAT_VALUE ) )
            {
            // InternalGraphQL.g:1458:2: ( (lv_value_0_0= RULE_FLOAT_VALUE ) )
            // InternalGraphQL.g:1459:3: (lv_value_0_0= RULE_FLOAT_VALUE )
            {
            // InternalGraphQL.g:1459:3: (lv_value_0_0= RULE_FLOAT_VALUE )
            // InternalGraphQL.g:1460:4: lv_value_0_0= RULE_FLOAT_VALUE
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
    // InternalGraphQL.g:1479:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGraphQL.g:1479:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGraphQL.g:1480:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalGraphQL.g:1486:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= 'null' ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1492:2: ( ( (lv_value_0_0= 'null' ) ) )
            // InternalGraphQL.g:1493:2: ( (lv_value_0_0= 'null' ) )
            {
            // InternalGraphQL.g:1493:2: ( (lv_value_0_0= 'null' ) )
            // InternalGraphQL.g:1494:3: (lv_value_0_0= 'null' )
            {
            // InternalGraphQL.g:1494:3: (lv_value_0_0= 'null' )
            // InternalGraphQL.g:1495:4: lv_value_0_0= 'null'
            {
            lv_value_0_0=(Token)match(input,31,FOLLOW_2); 

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
    // InternalGraphQL.g:1510:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGraphQL.g:1510:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGraphQL.g:1511:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalGraphQL.g:1517:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1523:2: ( ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) ) )
            // InternalGraphQL.g:1524:2: ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) )
            {
            // InternalGraphQL.g:1524:2: ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) )
            // InternalGraphQL.g:1525:3: ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) )
            {
            // InternalGraphQL.g:1525:3: ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) )
            // InternalGraphQL.g:1526:4: (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE )
            {
            // InternalGraphQL.g:1526:4: (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_SL_STRING_VALUE) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ML_STRING_VALUE) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGraphQL.g:1527:5: lv_value_0_1= RULE_SL_STRING_VALUE
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
                    // InternalGraphQL.g:1542:5: lv_value_0_2= RULE_ML_STRING_VALUE
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
    // InternalGraphQL.g:1562:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGraphQL.g:1562:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGraphQL.g:1563:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalGraphQL.g:1569:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1575:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalGraphQL.g:1576:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalGraphQL.g:1576:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalGraphQL.g:1577:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalGraphQL.g:1577:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalGraphQL.g:1578:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalGraphQL.g:1578:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            else if ( (LA36_0==33) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalGraphQL.g:1579:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1590:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,33,FOLLOW_2); 

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
    // InternalGraphQL.g:1606:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalGraphQL.g:1606:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalGraphQL.g:1607:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalGraphQL.g:1613:1: ruleEnumValue returns [EObject current=null] : ( (otherlv_0= RULE_NAME ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1619:2: ( ( (otherlv_0= RULE_NAME ) ) )
            // InternalGraphQL.g:1620:2: ( (otherlv_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:1620:2: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1621:3: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1621:3: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1622:4: otherlv_0= RULE_NAME
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
    // InternalGraphQL.g:1636:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGraphQL.g:1636:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGraphQL.g:1637:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalGraphQL.g:1643:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1649:2: ( ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) )
            // InternalGraphQL.g:1650:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            {
            // InternalGraphQL.g:1650:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            // InternalGraphQL.g:1651:3: () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}'
            {
            // InternalGraphQL.g:1651:3: ()
            // InternalGraphQL.g:1652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphQL.g:1662:3: ( (lv_fields_2_0= ruleObjectField ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_NAME) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGraphQL.g:1663:4: (lv_fields_2_0= ruleObjectField )
            	    {
            	    // InternalGraphQL.g:1663:4: (lv_fields_2_0= ruleObjectField )
            	    // InternalGraphQL.g:1664:5: lv_fields_2_0= ruleObjectField
            	    {

            	    					newCompositeNode(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop37;
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
    // InternalGraphQL.g:1689:1: entryRuleObjectField returns [EObject current=null] : iv_ruleObjectField= ruleObjectField EOF ;
    public final EObject entryRuleObjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectField = null;


        try {
            // InternalGraphQL.g:1689:52: (iv_ruleObjectField= ruleObjectField EOF )
            // InternalGraphQL.g:1690:2: iv_ruleObjectField= ruleObjectField EOF
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
    // InternalGraphQL.g:1696:1: ruleObjectField returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) ;
    public final EObject ruleObjectField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1702:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) )
            // InternalGraphQL.g:1703:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            {
            // InternalGraphQL.g:1703:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            // InternalGraphQL.g:1704:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) )
            {
            // InternalGraphQL.g:1704:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1705:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1705:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1706:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFieldRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectFieldAccess().getNameFieldDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:1721:3: ( (lv_value_2_0= ruleConstValue ) )
            // InternalGraphQL.g:1722:4: (lv_value_2_0= ruleConstValue )
            {
            // InternalGraphQL.g:1722:4: (lv_value_2_0= ruleConstValue )
            // InternalGraphQL.g:1723:5: lv_value_2_0= ruleConstValue
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
    // InternalGraphQL.g:1744:1: entryRuleConstValue returns [EObject current=null] : iv_ruleConstValue= ruleConstValue EOF ;
    public final EObject entryRuleConstValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstValue = null;


        try {
            // InternalGraphQL.g:1744:51: (iv_ruleConstValue= ruleConstValue EOF )
            // InternalGraphQL.g:1745:2: iv_ruleConstValue= ruleConstValue EOF
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
    // InternalGraphQL.g:1751:1: ruleConstValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_StringValue_4= ruleStringValue | this_EnumValue_5= ruleEnumValue | this_ListValue_6= ruleListValue | this_ObjectValue_7= ruleObjectValue ) ;
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
            // InternalGraphQL.g:1757:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_StringValue_4= ruleStringValue | this_EnumValue_5= ruleEnumValue | this_ListValue_6= ruleListValue | this_ObjectValue_7= ruleObjectValue ) )
            // InternalGraphQL.g:1758:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_StringValue_4= ruleStringValue | this_EnumValue_5= ruleEnumValue | this_ListValue_6= ruleListValue | this_ObjectValue_7= ruleObjectValue )
            {
            // InternalGraphQL.g:1758:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_StringValue_4= ruleStringValue | this_EnumValue_5= ruleEnumValue | this_ListValue_6= ruleListValue | this_ObjectValue_7= ruleObjectValue )
            int alt38=8;
            switch ( input.LA(1) ) {
            case RULE_INT_VALUE:
                {
                alt38=1;
                }
                break;
            case RULE_FLOAT_VALUE:
                {
                alt38=2;
                }
                break;
            case 32:
            case 33:
                {
                alt38=3;
                }
                break;
            case 31:
                {
                alt38=4;
                }
                break;
            case RULE_SL_STRING_VALUE:
            case RULE_ML_STRING_VALUE:
                {
                alt38=5;
                }
                break;
            case RULE_NAME:
                {
                alt38=6;
                }
                break;
            case 29:
                {
                alt38=7;
                }
                break;
            case 15:
                {
                alt38=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalGraphQL.g:1759:3: this_IntValue_0= ruleIntValue
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
                    // InternalGraphQL.g:1768:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalGraphQL.g:1777:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalGraphQL.g:1786:3: this_NullValue_3= ruleNullValue
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
                    // InternalGraphQL.g:1795:3: this_StringValue_4= ruleStringValue
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
                    // InternalGraphQL.g:1804:3: this_EnumValue_5= ruleEnumValue
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
                    // InternalGraphQL.g:1813:3: this_ListValue_6= ruleListValue
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
                    // InternalGraphQL.g:1822:3: this_ObjectValue_7= ruleObjectValue
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
    // InternalGraphQL.g:1834:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalGraphQL.g:1834:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalGraphQL.g:1835:2: iv_ruleListValue= ruleListValue EOF
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
    // InternalGraphQL.g:1841:1: ruleListValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1847:2: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' ) )
            // InternalGraphQL.g:1848:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' )
            {
            // InternalGraphQL.g:1848:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' )
            // InternalGraphQL.g:1849:3: () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']'
            {
            // InternalGraphQL.g:1849:3: ()
            // InternalGraphQL.g:1850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListValueAccess().getListValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalGraphQL.g:1860:3: ( (lv_values_2_0= ruleConstValue ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_NAME && LA39_0<=RULE_ML_STRING_VALUE)||LA39_0==15||LA39_0==29||(LA39_0>=31 && LA39_0<=33)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGraphQL.g:1861:4: (lv_values_2_0= ruleConstValue )
            	    {
            	    // InternalGraphQL.g:1861:4: (lv_values_2_0= ruleConstValue )
            	    // InternalGraphQL.g:1862:5: lv_values_2_0= ruleConstValue
            	    {

            	    					newCompositeNode(grammarAccess.getListValueAccess().getValuesConstValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    break loop39;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalGraphQL.g:1887:1: entryRuleDirectiveDefinition returns [EObject current=null] : iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF ;
    public final EObject entryRuleDirectiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectiveDefinition = null;


        try {
            // InternalGraphQL.g:1887:60: (iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF )
            // InternalGraphQL.g:1888:2: iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF
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
    // InternalGraphQL.g:1894:1: ruleDirectiveDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) ) ) ;
    public final EObject ruleDirectiveDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_repeatable_4_0=null;
        Token otherlv_5=null;
        EObject lv_description_0_0 = null;

        EObject lv_argumentDefinitions_3_0 = null;

        EObject lv_directiveLocations_6_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1900:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) ) ) )
            // InternalGraphQL.g:1901:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) ) )
            {
            // InternalGraphQL.g:1901:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) ) )
            // InternalGraphQL.g:1902:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) )
            {
            // InternalGraphQL.g:1902:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_SL_STRING_VALUE && LA40_0<=RULE_ML_STRING_VALUE)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGraphQL.g:1903:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1903:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1904:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_32);
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

            otherlv_1=(Token)match(input,34,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectiveDefinitionAccess().getDirectiveKeyword_1());
            		
            // InternalGraphQL.g:1925:3: ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:1926:4: (lv_name_2_0= RULE_DIRECTIVE_NAME )
            {
            // InternalGraphQL.g:1926:4: (lv_name_2_0= RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:1927:5: lv_name_2_0= RULE_DIRECTIVE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_DIRECTIVE_NAME,FOLLOW_34); 

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

            // InternalGraphQL.g:1943:3: ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGraphQL.g:1944:4: (lv_argumentDefinitions_3_0= ruleArgumentsDefinition )
                    {
                    // InternalGraphQL.g:1944:4: (lv_argumentDefinitions_3_0= ruleArgumentsDefinition )
                    // InternalGraphQL.g:1945:5: lv_argumentDefinitions_3_0= ruleArgumentsDefinition
                    {

                    					newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getArgumentDefinitionsArgumentsDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_35);
                    lv_argumentDefinitions_3_0=ruleArgumentsDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDirectiveDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"argumentDefinitions",
                    						lv_argumentDefinitions_3_0,
                    						"io.github.katmatt.graphql.GraphQL.ArgumentsDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGraphQL.g:1962:3: ( (lv_repeatable_4_0= 'repeatable' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGraphQL.g:1963:4: (lv_repeatable_4_0= 'repeatable' )
                    {
                    // InternalGraphQL.g:1963:4: (lv_repeatable_4_0= 'repeatable' )
                    // InternalGraphQL.g:1964:5: lv_repeatable_4_0= 'repeatable'
                    {
                    lv_repeatable_4_0=(Token)match(input,35,FOLLOW_36); 

                    					newLeafNode(lv_repeatable_4_0, grammarAccess.getDirectiveDefinitionAccess().getRepeatableRepeatableKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectiveDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "repeatable", lv_repeatable_4_0 != null, "repeatable");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getDirectiveDefinitionAccess().getOnKeyword_5());
            		
            // InternalGraphQL.g:1980:3: ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) )
            // InternalGraphQL.g:1981:4: (lv_directiveLocations_6_0= ruleDirectiveLocations )
            {
            // InternalGraphQL.g:1981:4: (lv_directiveLocations_6_0= ruleDirectiveLocations )
            // InternalGraphQL.g:1982:5: lv_directiveLocations_6_0= ruleDirectiveLocations
            {

            					newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_directiveLocations_6_0=ruleDirectiveLocations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectiveDefinitionRule());
            					}
            					add(
            						current,
            						"directiveLocations",
            						lv_directiveLocations_6_0,
            						"io.github.katmatt.graphql.GraphQL.DirectiveLocations");
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
    // $ANTLR end "ruleDirectiveDefinition"


    // $ANTLR start "entryRuleDirective"
    // InternalGraphQL.g:2003:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalGraphQL.g:2003:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalGraphQL.g:2004:2: iv_ruleDirective= ruleDirective EOF
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
    // InternalGraphQL.g:2010:1: ruleDirective returns [EObject current=null] : ( ( (lv_name_0_0= RULE_DIRECTIVE_NAME ) ) ( (lv_arguments_1_0= ruleArguments ) )? ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_arguments_1_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:2016:2: ( ( ( (lv_name_0_0= RULE_DIRECTIVE_NAME ) ) ( (lv_arguments_1_0= ruleArguments ) )? ) )
            // InternalGraphQL.g:2017:2: ( ( (lv_name_0_0= RULE_DIRECTIVE_NAME ) ) ( (lv_arguments_1_0= ruleArguments ) )? )
            {
            // InternalGraphQL.g:2017:2: ( ( (lv_name_0_0= RULE_DIRECTIVE_NAME ) ) ( (lv_arguments_1_0= ruleArguments ) )? )
            // InternalGraphQL.g:2018:3: ( (lv_name_0_0= RULE_DIRECTIVE_NAME ) ) ( (lv_arguments_1_0= ruleArguments ) )?
            {
            // InternalGraphQL.g:2018:3: ( (lv_name_0_0= RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:2019:4: (lv_name_0_0= RULE_DIRECTIVE_NAME )
            {
            // InternalGraphQL.g:2019:4: (lv_name_0_0= RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:2020:5: lv_name_0_0= RULE_DIRECTIVE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_DIRECTIVE_NAME,FOLLOW_38); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDirectiveAccess().getNameDIRECTIVE_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"io.github.katmatt.graphql.GraphQL.DIRECTIVE_NAME");
            				

            }


            }

            // InternalGraphQL.g:2036:3: ( (lv_arguments_1_0= ruleArguments ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGraphQL.g:2037:4: (lv_arguments_1_0= ruleArguments )
                    {
                    // InternalGraphQL.g:2037:4: (lv_arguments_1_0= ruleArguments )
                    // InternalGraphQL.g:2038:5: lv_arguments_1_0= ruleArguments
                    {

                    					newCompositeNode(grammarAccess.getDirectiveAccess().getArgumentsArgumentsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_arguments_1_0=ruleArguments();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDirectiveRule());
                    					}
                    					set(
                    						current,
                    						"arguments",
                    						lv_arguments_1_0,
                    						"io.github.katmatt.graphql.GraphQL.Arguments");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleArguments"
    // InternalGraphQL.g:2059:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalGraphQL.g:2059:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalGraphQL.g:2060:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalGraphQL.g:2066:1: ruleArguments returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:2072:2: ( ( () otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' ) )
            // InternalGraphQL.g:2073:2: ( () otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' )
            {
            // InternalGraphQL.g:2073:2: ( () otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')' )
            // InternalGraphQL.g:2074:3: () otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) )* otherlv_3= ')'
            {
            // InternalGraphQL.g:2074:3: ()
            // InternalGraphQL.g:2075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgumentsAccess().getArgumentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGraphQL.g:2085:3: ( (lv_arguments_2_0= ruleArgument ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_NAME) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGraphQL.g:2086:4: (lv_arguments_2_0= ruleArgument )
            	    {
            	    // InternalGraphQL.g:2086:4: (lv_arguments_2_0= ruleArgument )
            	    // InternalGraphQL.g:2087:5: lv_arguments_2_0= ruleArgument
            	    {

            	    					newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_arguments_2_0=ruleArgument();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArgumentsRule());
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
            	    break loop44;
                }
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleArgument"
    // InternalGraphQL.g:2112:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalGraphQL.g:2112:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalGraphQL.g:2113:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalGraphQL.g:2119:1: ruleArgument returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:2125:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) )
            // InternalGraphQL.g:2126:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            {
            // InternalGraphQL.g:2126:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            // InternalGraphQL.g:2127:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) )
            {
            // InternalGraphQL.g:2127:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:2128:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:2128:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:2129:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getArgumentAccess().getArgumentDefinitionInputValueDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:2144:3: ( (lv_value_2_0= ruleConstValue ) )
            // InternalGraphQL.g:2145:4: (lv_value_2_0= ruleConstValue )
            {
            // InternalGraphQL.g:2145:4: (lv_value_2_0= ruleConstValue )
            // InternalGraphQL.g:2146:5: lv_value_2_0= ruleConstValue
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


    // $ANTLR start "entryRuleArgumentsDefinition"
    // InternalGraphQL.g:2167:1: entryRuleArgumentsDefinition returns [EObject current=null] : iv_ruleArgumentsDefinition= ruleArgumentsDefinition EOF ;
    public final EObject entryRuleArgumentsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentsDefinition = null;


        try {
            // InternalGraphQL.g:2167:60: (iv_ruleArgumentsDefinition= ruleArgumentsDefinition EOF )
            // InternalGraphQL.g:2168:2: iv_ruleArgumentsDefinition= ruleArgumentsDefinition EOF
            {
             newCompositeNode(grammarAccess.getArgumentsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentsDefinition=ruleArgumentsDefinition();

            state._fsp--;

             current =iv_ruleArgumentsDefinition; 
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
    // $ANTLR end "entryRuleArgumentsDefinition"


    // $ANTLR start "ruleArgumentsDefinition"
    // InternalGraphQL.g:2174:1: ruleArgumentsDefinition returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_argumentDefinitions_2_0= ruleInputValueDefinition ) )* otherlv_3= ')' ) ;
    public final EObject ruleArgumentsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_argumentDefinitions_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:2180:2: ( ( () otherlv_1= '(' ( (lv_argumentDefinitions_2_0= ruleInputValueDefinition ) )* otherlv_3= ')' ) )
            // InternalGraphQL.g:2181:2: ( () otherlv_1= '(' ( (lv_argumentDefinitions_2_0= ruleInputValueDefinition ) )* otherlv_3= ')' )
            {
            // InternalGraphQL.g:2181:2: ( () otherlv_1= '(' ( (lv_argumentDefinitions_2_0= ruleInputValueDefinition ) )* otherlv_3= ')' )
            // InternalGraphQL.g:2182:3: () otherlv_1= '(' ( (lv_argumentDefinitions_2_0= ruleInputValueDefinition ) )* otherlv_3= ')'
            {
            // InternalGraphQL.g:2182:3: ()
            // InternalGraphQL.g:2183:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgumentsDefinitionAccess().getArgumentsDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentsDefinitionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGraphQL.g:2193:3: ( (lv_argumentDefinitions_2_0= ruleInputValueDefinition ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_NAME||(LA45_0>=RULE_SL_STRING_VALUE && LA45_0<=RULE_ML_STRING_VALUE)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGraphQL.g:2194:4: (lv_argumentDefinitions_2_0= ruleInputValueDefinition )
            	    {
            	    // InternalGraphQL.g:2194:4: (lv_argumentDefinitions_2_0= ruleInputValueDefinition )
            	    // InternalGraphQL.g:2195:5: lv_argumentDefinitions_2_0= ruleInputValueDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getArgumentsDefinitionAccess().getArgumentDefinitionsInputValueDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_argumentDefinitions_2_0=ruleInputValueDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArgumentsDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"argumentDefinitions",
            	    						lv_argumentDefinitions_2_0,
            	    						"io.github.katmatt.graphql.GraphQL.InputValueDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArgumentsDefinitionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleArgumentsDefinition"


    // $ANTLR start "entryRuleDirectiveLocations"
    // InternalGraphQL.g:2220:1: entryRuleDirectiveLocations returns [EObject current=null] : iv_ruleDirectiveLocations= ruleDirectiveLocations EOF ;
    public final EObject entryRuleDirectiveLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectiveLocations = null;


        try {
            // InternalGraphQL.g:2220:59: (iv_ruleDirectiveLocations= ruleDirectiveLocations EOF )
            // InternalGraphQL.g:2221:2: iv_ruleDirectiveLocations= ruleDirectiveLocations EOF
            {
             newCompositeNode(grammarAccess.getDirectiveLocationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectiveLocations=ruleDirectiveLocations();

            state._fsp--;

             current =iv_ruleDirectiveLocations; 
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
    // $ANTLR end "entryRuleDirectiveLocations"


    // $ANTLR start "ruleDirectiveLocations"
    // InternalGraphQL.g:2227:1: ruleDirectiveLocations returns [EObject current=null] : ( (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )* ) ;
    public final EObject ruleDirectiveLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_directiveLocations_1_0 = null;

        Enumerator lv_directiveLocations_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:2233:2: ( ( (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )* ) )
            // InternalGraphQL.g:2234:2: ( (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )* )
            {
            // InternalGraphQL.g:2234:2: ( (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )* )
            // InternalGraphQL.g:2235:3: (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )*
            {
            // InternalGraphQL.g:2235:3: (otherlv_0= '|' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGraphQL.g:2236:4: otherlv_0= '|'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_37); 

                    				newLeafNode(otherlv_0, grammarAccess.getDirectiveLocationsAccess().getVerticalLineKeyword_0());
                    			

                    }
                    break;

            }

            // InternalGraphQL.g:2241:3: ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) )
            // InternalGraphQL.g:2242:4: (lv_directiveLocations_1_0= ruleDirectiveLocation )
            {
            // InternalGraphQL.g:2242:4: (lv_directiveLocations_1_0= ruleDirectiveLocation )
            // InternalGraphQL.g:2243:5: lv_directiveLocations_1_0= ruleDirectiveLocation
            {

            					newCompositeNode(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_directiveLocations_1_0=ruleDirectiveLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectiveLocationsRule());
            					}
            					add(
            						current,
            						"directiveLocations",
            						lv_directiveLocations_1_0,
            						"io.github.katmatt.graphql.GraphQL.DirectiveLocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphQL.g:2260:3: (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==24) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGraphQL.g:2261:4: otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDirectiveLocationsAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalGraphQL.g:2265:4: ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) )
            	    // InternalGraphQL.g:2266:5: (lv_directiveLocations_3_0= ruleDirectiveLocation )
            	    {
            	    // InternalGraphQL.g:2266:5: (lv_directiveLocations_3_0= ruleDirectiveLocation )
            	    // InternalGraphQL.g:2267:6: lv_directiveLocations_3_0= ruleDirectiveLocation
            	    {

            	    						newCompositeNode(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_directiveLocations_3_0=ruleDirectiveLocation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDirectiveLocationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"directiveLocations",
            	    							lv_directiveLocations_3_0,
            	    							"io.github.katmatt.graphql.GraphQL.DirectiveLocation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end "ruleDirectiveLocations"


    // $ANTLR start "ruleDirectiveLocation"
    // InternalGraphQL.g:2289:1: ruleDirectiveLocation returns [Enumerator current=null] : ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) ) ;
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
            // InternalGraphQL.g:2295:2: ( ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) ) )
            // InternalGraphQL.g:2296:2: ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) )
            {
            // InternalGraphQL.g:2296:2: ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) )
            int alt48=19;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt48=1;
                }
                break;
            case 40:
                {
                alt48=2;
                }
                break;
            case 41:
                {
                alt48=3;
                }
                break;
            case 42:
                {
                alt48=4;
                }
                break;
            case 43:
                {
                alt48=5;
                }
                break;
            case 44:
                {
                alt48=6;
                }
                break;
            case 45:
                {
                alt48=7;
                }
                break;
            case 46:
                {
                alt48=8;
                }
                break;
            case 47:
                {
                alt48=9;
                }
                break;
            case 48:
                {
                alt48=10;
                }
                break;
            case 49:
                {
                alt48=11;
                }
                break;
            case 50:
                {
                alt48=12;
                }
                break;
            case 51:
                {
                alt48=13;
                }
                break;
            case 52:
                {
                alt48=14;
                }
                break;
            case 53:
                {
                alt48=15;
                }
                break;
            case 54:
                {
                alt48=16;
                }
                break;
            case 55:
                {
                alt48=17;
                }
                break;
            case 56:
                {
                alt48=18;
                }
                break;
            case 57:
                {
                alt48=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalGraphQL.g:2297:3: (enumLiteral_0= 'QUERY' )
                    {
                    // InternalGraphQL.g:2297:3: (enumLiteral_0= 'QUERY' )
                    // InternalGraphQL.g:2298:4: enumLiteral_0= 'QUERY'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:2305:3: (enumLiteral_1= 'MUTATION' )
                    {
                    // InternalGraphQL.g:2305:3: (enumLiteral_1= 'MUTATION' )
                    // InternalGraphQL.g:2306:4: enumLiteral_1= 'MUTATION'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:2313:3: (enumLiteral_2= 'SUBSCRIPTION' )
                    {
                    // InternalGraphQL.g:2313:3: (enumLiteral_2= 'SUBSCRIPTION' )
                    // InternalGraphQL.g:2314:4: enumLiteral_2= 'SUBSCRIPTION'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:2321:3: (enumLiteral_3= 'FIELD' )
                    {
                    // InternalGraphQL.g:2321:3: (enumLiteral_3= 'FIELD' )
                    // InternalGraphQL.g:2322:4: enumLiteral_3= 'FIELD'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:2329:3: (enumLiteral_4= 'FRAGMENT_DEFINITION' )
                    {
                    // InternalGraphQL.g:2329:3: (enumLiteral_4= 'FRAGMENT_DEFINITION' )
                    // InternalGraphQL.g:2330:4: enumLiteral_4= 'FRAGMENT_DEFINITION'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:2337:3: (enumLiteral_5= 'FRAGMENT_SPREAD' )
                    {
                    // InternalGraphQL.g:2337:3: (enumLiteral_5= 'FRAGMENT_SPREAD' )
                    // InternalGraphQL.g:2338:4: enumLiteral_5= 'FRAGMENT_SPREAD'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:2345:3: (enumLiteral_6= 'INLINE_FRAGMENT' )
                    {
                    // InternalGraphQL.g:2345:3: (enumLiteral_6= 'INLINE_FRAGMENT' )
                    // InternalGraphQL.g:2346:4: enumLiteral_6= 'INLINE_FRAGMENT'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphQL.g:2353:3: (enumLiteral_7= 'VARIABLE_DEFINITION' )
                    {
                    // InternalGraphQL.g:2353:3: (enumLiteral_7= 'VARIABLE_DEFINITION' )
                    // InternalGraphQL.g:2354:4: enumLiteral_7= 'VARIABLE_DEFINITION'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGraphQL.g:2361:3: (enumLiteral_8= 'SCHEMA' )
                    {
                    // InternalGraphQL.g:2361:3: (enumLiteral_8= 'SCHEMA' )
                    // InternalGraphQL.g:2362:4: enumLiteral_8= 'SCHEMA'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGraphQL.g:2369:3: (enumLiteral_9= 'SCALAR' )
                    {
                    // InternalGraphQL.g:2369:3: (enumLiteral_9= 'SCALAR' )
                    // InternalGraphQL.g:2370:4: enumLiteral_9= 'SCALAR'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalGraphQL.g:2377:3: (enumLiteral_10= 'OBJECT' )
                    {
                    // InternalGraphQL.g:2377:3: (enumLiteral_10= 'OBJECT' )
                    // InternalGraphQL.g:2378:4: enumLiteral_10= 'OBJECT'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalGraphQL.g:2385:3: (enumLiteral_11= 'FIELD_DEFINITION' )
                    {
                    // InternalGraphQL.g:2385:3: (enumLiteral_11= 'FIELD_DEFINITION' )
                    // InternalGraphQL.g:2386:4: enumLiteral_11= 'FIELD_DEFINITION'
                    {
                    enumLiteral_11=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalGraphQL.g:2393:3: (enumLiteral_12= 'ARGUMENT_DEFINITION' )
                    {
                    // InternalGraphQL.g:2393:3: (enumLiteral_12= 'ARGUMENT_DEFINITION' )
                    // InternalGraphQL.g:2394:4: enumLiteral_12= 'ARGUMENT_DEFINITION'
                    {
                    enumLiteral_12=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalGraphQL.g:2401:3: (enumLiteral_13= 'INTERFACE' )
                    {
                    // InternalGraphQL.g:2401:3: (enumLiteral_13= 'INTERFACE' )
                    // InternalGraphQL.g:2402:4: enumLiteral_13= 'INTERFACE'
                    {
                    enumLiteral_13=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalGraphQL.g:2409:3: (enumLiteral_14= 'UNION' )
                    {
                    // InternalGraphQL.g:2409:3: (enumLiteral_14= 'UNION' )
                    // InternalGraphQL.g:2410:4: enumLiteral_14= 'UNION'
                    {
                    enumLiteral_14=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalGraphQL.g:2417:3: (enumLiteral_15= 'ENUM' )
                    {
                    // InternalGraphQL.g:2417:3: (enumLiteral_15= 'ENUM' )
                    // InternalGraphQL.g:2418:4: enumLiteral_15= 'ENUM'
                    {
                    enumLiteral_15=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalGraphQL.g:2425:3: (enumLiteral_16= 'ENUM_VALUE' )
                    {
                    // InternalGraphQL.g:2425:3: (enumLiteral_16= 'ENUM_VALUE' )
                    // InternalGraphQL.g:2426:4: enumLiteral_16= 'ENUM_VALUE'
                    {
                    enumLiteral_16=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalGraphQL.g:2433:3: (enumLiteral_17= 'INPUT_OBJECT' )
                    {
                    // InternalGraphQL.g:2433:3: (enumLiteral_17= 'INPUT_OBJECT' )
                    // InternalGraphQL.g:2434:4: enumLiteral_17= 'INPUT_OBJECT'
                    {
                    enumLiteral_17=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalGraphQL.g:2441:3: (enumLiteral_18= 'INPUT_FIELD_DEFINITION' )
                    {
                    // InternalGraphQL.g:2441:3: (enumLiteral_18= 'INPUT_FIELD_DEFINITION' )
                    // InternalGraphQL.g:2442:4: enumLiteral_18= 'INPUT_FIELD_DEFINITION'
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
    // InternalGraphQL.g:2452:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:2458:2: ( ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) )
            // InternalGraphQL.g:2459:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            {
            // InternalGraphQL.g:2459:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt49=1;
                }
                break;
            case 59:
                {
                alt49=2;
                }
                break;
            case 60:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalGraphQL.g:2460:3: (enumLiteral_0= 'query' )
                    {
                    // InternalGraphQL.g:2460:3: (enumLiteral_0= 'query' )
                    // InternalGraphQL.g:2461:4: enumLiteral_0= 'query'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:2468:3: (enumLiteral_1= 'mutation' )
                    {
                    // InternalGraphQL.g:2468:3: (enumLiteral_1= 'mutation' )
                    // InternalGraphQL.g:2469:4: enumLiteral_1= 'mutation'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:2476:3: (enumLiteral_2= 'subscription' )
                    {
                    // InternalGraphQL.g:2476:3: (enumLiteral_2= 'subscription' )
                    // InternalGraphQL.g:2477:4: enumLiteral_2= 'subscription'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000004066C4182L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1C00000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108202L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000028000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010190L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000029000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000003A00081F0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000003E00081F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x03FFFF8001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000190L});

}