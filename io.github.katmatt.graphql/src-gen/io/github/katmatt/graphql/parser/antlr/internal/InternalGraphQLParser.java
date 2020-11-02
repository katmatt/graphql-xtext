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
                    case 34:
                        {
                        alt1=3;
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
                    case 14:
                        {
                        alt1=1;
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
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                case 26:
                    {
                    alt4=6;
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
                case 26:
                    {
                    alt4=6;
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
                case 18:
                    {
                    alt4=1;
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
    // InternalGraphQL.g:406:1: ruleObjectTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleObjectTypeDefinition() throws RecognitionException {
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
            // InternalGraphQL.g:412:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) )
            // InternalGraphQL.g:413:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            {
            // InternalGraphQL.g:413:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            // InternalGraphQL.g:414:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
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

            // InternalGraphQL.g:480:3: (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphQL.g:481:4: otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalGraphQL.g:485:4: ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_NAME||(LA8_0>=RULE_SL_STRING_VALUE && LA8_0<=RULE_ML_STRING_VALUE)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGraphQL.g:486:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:486:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:487:6: lv_fieldDefinitions_6_0= ruleFieldDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_fieldDefinitions_6_0=ruleFieldDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2());
                    			

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
    // InternalGraphQL.g:513:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalGraphQL.g:513:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalGraphQL.g:514:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
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
    // InternalGraphQL.g:520:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) ;
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
            // InternalGraphQL.g:526:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) )
            // InternalGraphQL.g:527:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            {
            // InternalGraphQL.g:527:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            // InternalGraphQL.g:528:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            {
            // InternalGraphQL.g:528:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SL_STRING_VALUE && LA10_0<=RULE_ML_STRING_VALUE)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:529:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:529:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:530:5: lv_description_0_0= ruleStringValue
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
            		
            // InternalGraphQL.g:551:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:552:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:552:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:553:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_12); 

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

            // InternalGraphQL.g:569:3: (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphQL.g:570:4: otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getInterfaceDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGraphQL.g:574:4: ( (lv_implements_4_0= ruleIntersectionType ) )
                    // InternalGraphQL.g:575:5: (lv_implements_4_0= ruleIntersectionType )
                    {
                    // InternalGraphQL.g:575:5: (lv_implements_4_0= ruleIntersectionType )
                    // InternalGraphQL.g:576:6: lv_implements_4_0= ruleIntersectionType
                    {

                    						newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getImplementsIntersectionTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            // InternalGraphQL.g:594:3: (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:595:4: otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalGraphQL.g:599:4: ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_NAME||(LA12_0>=RULE_SL_STRING_VALUE && LA12_0<=RULE_ML_STRING_VALUE)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGraphQL.g:600:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:600:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:601:6: lv_fieldDefinitions_6_0= ruleFieldDefinition
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
                    	    break loop12;
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
    // InternalGraphQL.g:627:1: entryRuleFieldDefinition returns [EObject current=null] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final EObject entryRuleFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDefinition = null;


        try {
            // InternalGraphQL.g:627:56: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // InternalGraphQL.g:628:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
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
    // InternalGraphQL.g:634:1: ruleFieldDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_0_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:640:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalGraphQL.g:641:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalGraphQL.g:641:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalGraphQL.g:642:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalGraphQL.g:642:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_SL_STRING_VALUE && LA14_0<=RULE_ML_STRING_VALUE)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphQL.g:643:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:643:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:644:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:661:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:662:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:662:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:663:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldDefinitionAccess().getColonKeyword_2());
            		
            // InternalGraphQL.g:683:3: ( (lv_type_3_0= ruleType ) )
            // InternalGraphQL.g:684:4: (lv_type_3_0= ruleType )
            {
            // InternalGraphQL.g:684:4: (lv_type_3_0= ruleType )
            // InternalGraphQL.g:685:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
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
    // InternalGraphQL.g:706:1: entryRuleUnionTypeDefinition returns [EObject current=null] : iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF ;
    public final EObject entryRuleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionTypeDefinition = null;


        try {
            // InternalGraphQL.g:706:60: (iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF )
            // InternalGraphQL.g:707:2: iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF
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
    // InternalGraphQL.g:713:1: ruleUnionTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )? ) ;
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
            // InternalGraphQL.g:719:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )? ) )
            // InternalGraphQL.g:720:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )? )
            {
            // InternalGraphQL.g:720:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )? )
            // InternalGraphQL.g:721:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )?
            {
            // InternalGraphQL.g:721:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_SL_STRING_VALUE && LA15_0<=RULE_ML_STRING_VALUE)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphQL.g:722:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:722:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:723:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_17);
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
            		
            // InternalGraphQL.g:744:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:745:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:745:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:746:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_18); 

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

            // InternalGraphQL.g:762:3: (otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGraphQL.g:763:4: otherlv_3= '=' (otherlv_4= '|' )? ( (lv_memberTypes_5_0= ruleType ) ) (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )*
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGraphQL.g:767:4: (otherlv_4= '|' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalGraphQL.g:768:5: otherlv_4= '|'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_13); 

                            					newLeafNode(otherlv_4, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_1());
                            				

                            }
                            break;

                    }

                    // InternalGraphQL.g:773:4: ( (lv_memberTypes_5_0= ruleType ) )
                    // InternalGraphQL.g:774:5: (lv_memberTypes_5_0= ruleType )
                    {
                    // InternalGraphQL.g:774:5: (lv_memberTypes_5_0= ruleType )
                    // InternalGraphQL.g:775:6: lv_memberTypes_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalGraphQL.g:792:4: (otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==24) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalGraphQL.g:793:5: otherlv_6= '|' ( (lv_memberTypes_7_0= ruleType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_3_0());
                    	    				
                    	    // InternalGraphQL.g:797:5: ( (lv_memberTypes_7_0= ruleType ) )
                    	    // InternalGraphQL.g:798:6: (lv_memberTypes_7_0= ruleType )
                    	    {
                    	    // InternalGraphQL.g:798:6: (lv_memberTypes_7_0= ruleType )
                    	    // InternalGraphQL.g:799:7: lv_memberTypes_7_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop17;
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
    // InternalGraphQL.g:822:1: entryRuleEnumTypeDefinition returns [EObject current=null] : iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF ;
    public final EObject entryRuleEnumTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDefinition = null;


        try {
            // InternalGraphQL.g:822:59: (iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF )
            // InternalGraphQL.g:823:2: iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF
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
    // InternalGraphQL.g:829:1: ruleEnumTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )? ) ;
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
            // InternalGraphQL.g:835:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )? ) )
            // InternalGraphQL.g:836:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )? )
            {
            // InternalGraphQL.g:836:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )? )
            // InternalGraphQL.g:837:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )?
            {
            // InternalGraphQL.g:837:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_SL_STRING_VALUE && LA19_0<=RULE_ML_STRING_VALUE)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGraphQL.g:838:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:838:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:839:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_21);
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
            		
            // InternalGraphQL.g:860:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:861:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:861:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:862:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_14); 

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

            // InternalGraphQL.g:878:3: (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphQL.g:879:4: otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalGraphQL.g:883:4: ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )
                    // InternalGraphQL.g:884:5: (lv_valueDefinitions_4_0= ruleEnumValueDefinition )
                    {
                    // InternalGraphQL.g:884:5: (lv_valueDefinitions_4_0= ruleEnumValueDefinition )
                    // InternalGraphQL.g:885:6: lv_valueDefinitions_4_0= ruleEnumValueDefinition
                    {

                    						newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
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
    // InternalGraphQL.g:911:1: entryRuleEnumValueDefinition returns [EObject current=null] : iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF ;
    public final EObject entryRuleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValueDefinition = null;


        try {
            // InternalGraphQL.g:911:60: (iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF )
            // InternalGraphQL.g:912:2: iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF
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
    // InternalGraphQL.g:918:1: ruleEnumValueDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:924:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGraphQL.g:925:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:925:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGraphQL.g:926:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:926:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_SL_STRING_VALUE && LA21_0<=RULE_ML_STRING_VALUE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphQL.g:927:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:927:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:928:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:945:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:946:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:946:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:947:5: lv_name_1_0= RULE_NAME
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
    // InternalGraphQL.g:967:1: entryRuleInputObjectTypeDefinition returns [EObject current=null] : iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF ;
    public final EObject entryRuleInputObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:967:66: (iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF )
            // InternalGraphQL.g:968:2: iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF
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
    // InternalGraphQL.g:974:1: ruleInputObjectTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? ) ;
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
            // InternalGraphQL.g:980:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? ) )
            // InternalGraphQL.g:981:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? )
            {
            // InternalGraphQL.g:981:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? )
            // InternalGraphQL.g:982:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )?
            {
            // InternalGraphQL.g:982:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_SL_STRING_VALUE && LA22_0<=RULE_ML_STRING_VALUE)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGraphQL.g:983:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:983:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:984:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_24);
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
            		
            // InternalGraphQL.g:1005:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:1006:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:1006:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:1007:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_14); 

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

            // InternalGraphQL.g:1023:3: (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphQL.g:1024:4: otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalGraphQL.g:1028:4: ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_NAME||(LA23_0>=RULE_SL_STRING_VALUE && LA23_0<=RULE_ML_STRING_VALUE)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGraphQL.g:1029:5: (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition )
                    	    {
                    	    // InternalGraphQL.g:1029:5: (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition )
                    	    // InternalGraphQL.g:1030:6: lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition
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
                    	    break loop23;
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
    // InternalGraphQL.g:1056:1: entryRuleInputValueDefinition returns [EObject current=null] : iv_ruleInputValueDefinition= ruleInputValueDefinition EOF ;
    public final EObject entryRuleInputValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputValueDefinition = null;


        try {
            // InternalGraphQL.g:1056:61: (iv_ruleInputValueDefinition= ruleInputValueDefinition EOF )
            // InternalGraphQL.g:1057:2: iv_ruleInputValueDefinition= ruleInputValueDefinition EOF
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
    // InternalGraphQL.g:1063:1: ruleInputValueDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? ) ;
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
            // InternalGraphQL.g:1069:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? ) )
            // InternalGraphQL.g:1070:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? )
            {
            // InternalGraphQL.g:1070:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? )
            // InternalGraphQL.g:1071:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )?
            {
            // InternalGraphQL.g:1071:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_SL_STRING_VALUE && LA25_0<=RULE_ML_STRING_VALUE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphQL.g:1072:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1072:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1073:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:1090:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:1091:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:1091:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:1092:5: lv_name_1_0= RULE_NAME
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
            		
            // InternalGraphQL.g:1112:3: ( (lv_type_3_0= ruleType ) )
            // InternalGraphQL.g:1113:4: (lv_type_3_0= ruleType )
            {
            // InternalGraphQL.g:1113:4: (lv_type_3_0= ruleType )
            // InternalGraphQL.g:1114:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getInputValueDefinitionAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalGraphQL.g:1131:3: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGraphQL.g:1132:4: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputValueDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalGraphQL.g:1136:4: ( (lv_defaultValue_5_0= ruleConstValue ) )
                    // InternalGraphQL.g:1137:5: (lv_defaultValue_5_0= ruleConstValue )
                    {
                    // InternalGraphQL.g:1137:5: (lv_defaultValue_5_0= ruleConstValue )
                    // InternalGraphQL.g:1138:6: lv_defaultValue_5_0= ruleConstValue
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
    // InternalGraphQL.g:1160:1: entryRuleIntersectionType returns [EObject current=null] : iv_ruleIntersectionType= ruleIntersectionType EOF ;
    public final EObject entryRuleIntersectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionType = null;


        try {
            // InternalGraphQL.g:1160:57: (iv_ruleIntersectionType= ruleIntersectionType EOF )
            // InternalGraphQL.g:1161:2: iv_ruleIntersectionType= ruleIntersectionType EOF
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
    // InternalGraphQL.g:1167:1: ruleIntersectionType returns [EObject current=null] : ( (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )* ) ;
    public final EObject ruleIntersectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_memberTypes_1_0 = null;

        EObject lv_memberTypes_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1173:2: ( ( (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )* ) )
            // InternalGraphQL.g:1174:2: ( (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )* )
            {
            // InternalGraphQL.g:1174:2: ( (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )* )
            // InternalGraphQL.g:1175:3: (otherlv_0= '&' )? ( (lv_memberTypes_1_0= ruleType ) ) (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )*
            {
            // InternalGraphQL.g:1175:3: (otherlv_0= '&' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGraphQL.g:1176:4: otherlv_0= '&'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_0());
                    			

                    }
                    break;

            }

            // InternalGraphQL.g:1181:3: ( (lv_memberTypes_1_0= ruleType ) )
            // InternalGraphQL.g:1182:4: (lv_memberTypes_1_0= ruleType )
            {
            // InternalGraphQL.g:1182:4: (lv_memberTypes_1_0= ruleType )
            // InternalGraphQL.g:1183:5: lv_memberTypes_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalGraphQL.g:1200:3: (otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGraphQL.g:1201:4: otherlv_2= '&' ( (lv_memberTypes_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_2_0());
            	    			
            	    // InternalGraphQL.g:1205:4: ( (lv_memberTypes_3_0= ruleType ) )
            	    // InternalGraphQL.g:1206:5: (lv_memberTypes_3_0= ruleType )
            	    {
            	    // InternalGraphQL.g:1206:5: (lv_memberTypes_3_0= ruleType )
            	    // InternalGraphQL.g:1207:6: lv_memberTypes_3_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop28;
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
    // InternalGraphQL.g:1229:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGraphQL.g:1229:45: (iv_ruleType= ruleType EOF )
            // InternalGraphQL.g:1230:2: iv_ruleType= ruleType EOF
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
    // InternalGraphQL.g:1236:1: ruleType returns [EObject current=null] : (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_NamedType_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1242:2: ( (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType ) )
            // InternalGraphQL.g:1243:2: (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType )
            {
            // InternalGraphQL.g:1243:2: (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NAME) ) {
                alt29=1;
            }
            else if ( (LA29_0==29) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphQL.g:1244:3: this_NamedType_0= ruleNamedType
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
                    // InternalGraphQL.g:1253:3: this_ListType_1= ruleListType
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
    // InternalGraphQL.g:1265:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // InternalGraphQL.g:1265:50: (iv_ruleNamedType= ruleNamedType EOF )
            // InternalGraphQL.g:1266:2: iv_ruleNamedType= ruleNamedType EOF
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
    // InternalGraphQL.g:1272:1: ruleNamedType returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nonNull_1_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1278:2: ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) )
            // InternalGraphQL.g:1279:2: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
            {
            // InternalGraphQL.g:1279:2: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
            // InternalGraphQL.g:1280:3: ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )?
            {
            // InternalGraphQL.g:1280:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1281:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1281:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1282:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedTypeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalGraphQL.g:1293:3: ( (lv_nonNull_1_0= '!' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGraphQL.g:1294:4: (lv_nonNull_1_0= '!' )
                    {
                    // InternalGraphQL.g:1294:4: (lv_nonNull_1_0= '!' )
                    // InternalGraphQL.g:1295:5: lv_nonNull_1_0= '!'
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
    // InternalGraphQL.g:1311:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalGraphQL.g:1311:49: (iv_ruleListType= ruleListType EOF )
            // InternalGraphQL.g:1312:2: iv_ruleListType= ruleListType EOF
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
    // InternalGraphQL.g:1318:1: ruleListType returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_nonNull_3_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1324:2: ( (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? ) )
            // InternalGraphQL.g:1325:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? )
            {
            // InternalGraphQL.g:1325:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? )
            // InternalGraphQL.g:1326:3: otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGraphQL.g:1330:3: ( (lv_type_1_0= ruleType ) )
            // InternalGraphQL.g:1331:4: (lv_type_1_0= ruleType )
            {
            // InternalGraphQL.g:1331:4: (lv_type_1_0= ruleType )
            // InternalGraphQL.g:1332:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_2=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2());
            		
            // InternalGraphQL.g:1353:3: ( (lv_nonNull_3_0= '!' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGraphQL.g:1354:4: (lv_nonNull_3_0= '!' )
                    {
                    // InternalGraphQL.g:1354:4: (lv_nonNull_3_0= '!' )
                    // InternalGraphQL.g:1355:5: lv_nonNull_3_0= '!'
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
    // InternalGraphQL.g:1371:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalGraphQL.g:1371:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalGraphQL.g:1372:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalGraphQL.g:1378:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT_VALUE ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1384:2: ( ( (lv_value_0_0= RULE_INT_VALUE ) ) )
            // InternalGraphQL.g:1385:2: ( (lv_value_0_0= RULE_INT_VALUE ) )
            {
            // InternalGraphQL.g:1385:2: ( (lv_value_0_0= RULE_INT_VALUE ) )
            // InternalGraphQL.g:1386:3: (lv_value_0_0= RULE_INT_VALUE )
            {
            // InternalGraphQL.g:1386:3: (lv_value_0_0= RULE_INT_VALUE )
            // InternalGraphQL.g:1387:4: lv_value_0_0= RULE_INT_VALUE
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
    // InternalGraphQL.g:1406:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalGraphQL.g:1406:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalGraphQL.g:1407:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalGraphQL.g:1413:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT_VALUE ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1419:2: ( ( (lv_value_0_0= RULE_FLOAT_VALUE ) ) )
            // InternalGraphQL.g:1420:2: ( (lv_value_0_0= RULE_FLOAT_VALUE ) )
            {
            // InternalGraphQL.g:1420:2: ( (lv_value_0_0= RULE_FLOAT_VALUE ) )
            // InternalGraphQL.g:1421:3: (lv_value_0_0= RULE_FLOAT_VALUE )
            {
            // InternalGraphQL.g:1421:3: (lv_value_0_0= RULE_FLOAT_VALUE )
            // InternalGraphQL.g:1422:4: lv_value_0_0= RULE_FLOAT_VALUE
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
    // InternalGraphQL.g:1441:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGraphQL.g:1441:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGraphQL.g:1442:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalGraphQL.g:1448:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= 'null' ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1454:2: ( ( (lv_value_0_0= 'null' ) ) )
            // InternalGraphQL.g:1455:2: ( (lv_value_0_0= 'null' ) )
            {
            // InternalGraphQL.g:1455:2: ( (lv_value_0_0= 'null' ) )
            // InternalGraphQL.g:1456:3: (lv_value_0_0= 'null' )
            {
            // InternalGraphQL.g:1456:3: (lv_value_0_0= 'null' )
            // InternalGraphQL.g:1457:4: lv_value_0_0= 'null'
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
    // InternalGraphQL.g:1472:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGraphQL.g:1472:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGraphQL.g:1473:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalGraphQL.g:1479:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1485:2: ( ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) ) )
            // InternalGraphQL.g:1486:2: ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) )
            {
            // InternalGraphQL.g:1486:2: ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) )
            // InternalGraphQL.g:1487:3: ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) )
            {
            // InternalGraphQL.g:1487:3: ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) )
            // InternalGraphQL.g:1488:4: (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE )
            {
            // InternalGraphQL.g:1488:4: (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_SL_STRING_VALUE) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ML_STRING_VALUE) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalGraphQL.g:1489:5: lv_value_0_1= RULE_SL_STRING_VALUE
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
                    // InternalGraphQL.g:1504:5: lv_value_0_2= RULE_ML_STRING_VALUE
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
    // InternalGraphQL.g:1524:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGraphQL.g:1524:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGraphQL.g:1525:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalGraphQL.g:1531:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1537:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalGraphQL.g:1538:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalGraphQL.g:1538:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalGraphQL.g:1539:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalGraphQL.g:1539:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalGraphQL.g:1540:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalGraphQL.g:1540:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            else if ( (LA33_0==33) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalGraphQL.g:1541:5: lv_value_0_1= 'true'
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
                    // InternalGraphQL.g:1552:5: lv_value_0_2= 'false'
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
    // InternalGraphQL.g:1568:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalGraphQL.g:1568:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalGraphQL.g:1569:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalGraphQL.g:1575:1: ruleEnumValue returns [EObject current=null] : ( (otherlv_0= RULE_NAME ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1581:2: ( ( (otherlv_0= RULE_NAME ) ) )
            // InternalGraphQL.g:1582:2: ( (otherlv_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:1582:2: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1583:3: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1583:3: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1584:4: otherlv_0= RULE_NAME
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
    // InternalGraphQL.g:1598:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGraphQL.g:1598:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGraphQL.g:1599:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalGraphQL.g:1605:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1611:2: ( ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) )
            // InternalGraphQL.g:1612:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            {
            // InternalGraphQL.g:1612:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            // InternalGraphQL.g:1613:3: () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}'
            {
            // InternalGraphQL.g:1613:3: ()
            // InternalGraphQL.g:1614:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphQL.g:1624:3: ( (lv_fields_2_0= ruleObjectField ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_NAME) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGraphQL.g:1625:4: (lv_fields_2_0= ruleObjectField )
            	    {
            	    // InternalGraphQL.g:1625:4: (lv_fields_2_0= ruleObjectField )
            	    // InternalGraphQL.g:1626:5: lv_fields_2_0= ruleObjectField
            	    {

            	    					newCompositeNode(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop34;
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
    // InternalGraphQL.g:1651:1: entryRuleObjectField returns [EObject current=null] : iv_ruleObjectField= ruleObjectField EOF ;
    public final EObject entryRuleObjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectField = null;


        try {
            // InternalGraphQL.g:1651:52: (iv_ruleObjectField= ruleObjectField EOF )
            // InternalGraphQL.g:1652:2: iv_ruleObjectField= ruleObjectField EOF
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
    // InternalGraphQL.g:1658:1: ruleObjectField returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) ;
    public final EObject ruleObjectField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1664:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) )
            // InternalGraphQL.g:1665:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            {
            // InternalGraphQL.g:1665:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            // InternalGraphQL.g:1666:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) )
            {
            // InternalGraphQL.g:1666:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1667:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1667:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1668:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFieldRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectFieldAccess().getNameFieldDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:1683:3: ( (lv_value_2_0= ruleConstValue ) )
            // InternalGraphQL.g:1684:4: (lv_value_2_0= ruleConstValue )
            {
            // InternalGraphQL.g:1684:4: (lv_value_2_0= ruleConstValue )
            // InternalGraphQL.g:1685:5: lv_value_2_0= ruleConstValue
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
    // InternalGraphQL.g:1706:1: entryRuleConstValue returns [EObject current=null] : iv_ruleConstValue= ruleConstValue EOF ;
    public final EObject entryRuleConstValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstValue = null;


        try {
            // InternalGraphQL.g:1706:51: (iv_ruleConstValue= ruleConstValue EOF )
            // InternalGraphQL.g:1707:2: iv_ruleConstValue= ruleConstValue EOF
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
    // InternalGraphQL.g:1713:1: ruleConstValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_EnumValue_4= ruleEnumValue | this_ListValue_5= ruleListValue | this_ObjectValue_6= ruleObjectValue ) ;
    public final EObject ruleConstValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_NullValue_3 = null;

        EObject this_EnumValue_4 = null;

        EObject this_ListValue_5 = null;

        EObject this_ObjectValue_6 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1719:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_EnumValue_4= ruleEnumValue | this_ListValue_5= ruleListValue | this_ObjectValue_6= ruleObjectValue ) )
            // InternalGraphQL.g:1720:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_EnumValue_4= ruleEnumValue | this_ListValue_5= ruleListValue | this_ObjectValue_6= ruleObjectValue )
            {
            // InternalGraphQL.g:1720:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_EnumValue_4= ruleEnumValue | this_ListValue_5= ruleListValue | this_ObjectValue_6= ruleObjectValue )
            int alt35=7;
            switch ( input.LA(1) ) {
            case RULE_INT_VALUE:
                {
                alt35=1;
                }
                break;
            case RULE_FLOAT_VALUE:
                {
                alt35=2;
                }
                break;
            case 32:
            case 33:
                {
                alt35=3;
                }
                break;
            case 31:
                {
                alt35=4;
                }
                break;
            case RULE_NAME:
                {
                alt35=5;
                }
                break;
            case 29:
                {
                alt35=6;
                }
                break;
            case 15:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalGraphQL.g:1721:3: this_IntValue_0= ruleIntValue
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
                    // InternalGraphQL.g:1730:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalGraphQL.g:1739:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalGraphQL.g:1748:3: this_NullValue_3= ruleNullValue
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
                    // InternalGraphQL.g:1757:3: this_EnumValue_4= ruleEnumValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getEnumValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumValue_4=ruleEnumValue();

                    state._fsp--;


                    			current = this_EnumValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:1766:3: this_ListValue_5= ruleListValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getListValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListValue_5=ruleListValue();

                    state._fsp--;


                    			current = this_ListValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:1775:3: this_ObjectValue_6= ruleObjectValue
                    {

                    			newCompositeNode(grammarAccess.getConstValueAccess().getObjectValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectValue_6=ruleObjectValue();

                    state._fsp--;


                    			current = this_ObjectValue_6;
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
    // InternalGraphQL.g:1787:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalGraphQL.g:1787:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalGraphQL.g:1788:2: iv_ruleListValue= ruleListValue EOF
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
    // InternalGraphQL.g:1794:1: ruleListValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1800:2: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' ) )
            // InternalGraphQL.g:1801:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' )
            {
            // InternalGraphQL.g:1801:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' )
            // InternalGraphQL.g:1802:3: () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']'
            {
            // InternalGraphQL.g:1802:3: ()
            // InternalGraphQL.g:1803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListValueAccess().getListValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalGraphQL.g:1813:3: ( (lv_values_2_0= ruleConstValue ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_NAME && LA36_0<=RULE_FLOAT_VALUE)||LA36_0==15||LA36_0==29||(LA36_0>=31 && LA36_0<=33)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGraphQL.g:1814:4: (lv_values_2_0= ruleConstValue )
            	    {
            	    // InternalGraphQL.g:1814:4: (lv_values_2_0= ruleConstValue )
            	    // InternalGraphQL.g:1815:5: lv_values_2_0= ruleConstValue
            	    {

            	    					newCompositeNode(grammarAccess.getListValueAccess().getValuesConstValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop36;
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
    // InternalGraphQL.g:1840:1: entryRuleDirectiveDefinition returns [EObject current=null] : iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF ;
    public final EObject entryRuleDirectiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectiveDefinition = null;


        try {
            // InternalGraphQL.g:1840:60: (iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF )
            // InternalGraphQL.g:1841:2: iv_ruleDirectiveDefinition= ruleDirectiveDefinition EOF
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
    // InternalGraphQL.g:1847:1: ruleDirectiveDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) ) ) ;
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
            // InternalGraphQL.g:1853:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) ) ) )
            // InternalGraphQL.g:1854:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) ) )
            {
            // InternalGraphQL.g:1854:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) ) )
            // InternalGraphQL.g:1855:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'directive' ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) ) ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )? ( (lv_repeatable_4_0= 'repeatable' ) )? otherlv_5= 'on' ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) )
            {
            // InternalGraphQL.g:1855:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_SL_STRING_VALUE && LA37_0<=RULE_ML_STRING_VALUE)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGraphQL.g:1856:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1856:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1857:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_31);
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

            otherlv_1=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectiveDefinitionAccess().getDirectiveKeyword_1());
            		
            // InternalGraphQL.g:1878:3: ( (lv_name_2_0= RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:1879:4: (lv_name_2_0= RULE_DIRECTIVE_NAME )
            {
            // InternalGraphQL.g:1879:4: (lv_name_2_0= RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:1880:5: lv_name_2_0= RULE_DIRECTIVE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_DIRECTIVE_NAME,FOLLOW_33); 

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

            // InternalGraphQL.g:1896:3: ( (lv_argumentDefinitions_3_0= ruleArgumentsDefinition ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGraphQL.g:1897:4: (lv_argumentDefinitions_3_0= ruleArgumentsDefinition )
                    {
                    // InternalGraphQL.g:1897:4: (lv_argumentDefinitions_3_0= ruleArgumentsDefinition )
                    // InternalGraphQL.g:1898:5: lv_argumentDefinitions_3_0= ruleArgumentsDefinition
                    {

                    					newCompositeNode(grammarAccess.getDirectiveDefinitionAccess().getArgumentDefinitionsArgumentsDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_34);
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

            // InternalGraphQL.g:1915:3: ( (lv_repeatable_4_0= 'repeatable' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGraphQL.g:1916:4: (lv_repeatable_4_0= 'repeatable' )
                    {
                    // InternalGraphQL.g:1916:4: (lv_repeatable_4_0= 'repeatable' )
                    // InternalGraphQL.g:1917:5: lv_repeatable_4_0= 'repeatable'
                    {
                    lv_repeatable_4_0=(Token)match(input,35,FOLLOW_35); 

                    					newLeafNode(lv_repeatable_4_0, grammarAccess.getDirectiveDefinitionAccess().getRepeatableRepeatableKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectiveDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "repeatable", lv_repeatable_4_0 != null, "repeatable");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getDirectiveDefinitionAccess().getOnKeyword_5());
            		
            // InternalGraphQL.g:1933:3: ( (lv_directiveLocations_6_0= ruleDirectiveLocations ) )
            // InternalGraphQL.g:1934:4: (lv_directiveLocations_6_0= ruleDirectiveLocations )
            {
            // InternalGraphQL.g:1934:4: (lv_directiveLocations_6_0= ruleDirectiveLocations )
            // InternalGraphQL.g:1935:5: lv_directiveLocations_6_0= ruleDirectiveLocations
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


    // $ANTLR start "entryRuleArgumentsDefinition"
    // InternalGraphQL.g:1956:1: entryRuleArgumentsDefinition returns [EObject current=null] : iv_ruleArgumentsDefinition= ruleArgumentsDefinition EOF ;
    public final EObject entryRuleArgumentsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentsDefinition = null;


        try {
            // InternalGraphQL.g:1956:60: (iv_ruleArgumentsDefinition= ruleArgumentsDefinition EOF )
            // InternalGraphQL.g:1957:2: iv_ruleArgumentsDefinition= ruleArgumentsDefinition EOF
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
    // InternalGraphQL.g:1963:1: ruleArgumentsDefinition returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_arguments_2_0= ruleInputValueDefinition ) )* otherlv_3= ')' ) ;
    public final EObject ruleArgumentsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1969:2: ( ( () otherlv_1= '(' ( (lv_arguments_2_0= ruleInputValueDefinition ) )* otherlv_3= ')' ) )
            // InternalGraphQL.g:1970:2: ( () otherlv_1= '(' ( (lv_arguments_2_0= ruleInputValueDefinition ) )* otherlv_3= ')' )
            {
            // InternalGraphQL.g:1970:2: ( () otherlv_1= '(' ( (lv_arguments_2_0= ruleInputValueDefinition ) )* otherlv_3= ')' )
            // InternalGraphQL.g:1971:3: () otherlv_1= '(' ( (lv_arguments_2_0= ruleInputValueDefinition ) )* otherlv_3= ')'
            {
            // InternalGraphQL.g:1971:3: ()
            // InternalGraphQL.g:1972:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgumentsDefinitionAccess().getArgumentsDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentsDefinitionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGraphQL.g:1982:3: ( (lv_arguments_2_0= ruleInputValueDefinition ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_NAME||(LA40_0>=RULE_SL_STRING_VALUE && LA40_0<=RULE_ML_STRING_VALUE)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGraphQL.g:1983:4: (lv_arguments_2_0= ruleInputValueDefinition )
            	    {
            	    // InternalGraphQL.g:1983:4: (lv_arguments_2_0= ruleInputValueDefinition )
            	    // InternalGraphQL.g:1984:5: lv_arguments_2_0= ruleInputValueDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getArgumentsDefinitionAccess().getArgumentsInputValueDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_arguments_2_0=ruleInputValueDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArgumentsDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arguments",
            	    						lv_arguments_2_0,
            	    						"io.github.katmatt.graphql.GraphQL.InputValueDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalGraphQL.g:2009:1: entryRuleDirectiveLocations returns [EObject current=null] : iv_ruleDirectiveLocations= ruleDirectiveLocations EOF ;
    public final EObject entryRuleDirectiveLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectiveLocations = null;


        try {
            // InternalGraphQL.g:2009:59: (iv_ruleDirectiveLocations= ruleDirectiveLocations EOF )
            // InternalGraphQL.g:2010:2: iv_ruleDirectiveLocations= ruleDirectiveLocations EOF
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
    // InternalGraphQL.g:2016:1: ruleDirectiveLocations returns [EObject current=null] : ( (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )* ) ;
    public final EObject ruleDirectiveLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_directiveLocations_1_0 = null;

        Enumerator lv_directiveLocations_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:2022:2: ( ( (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )* ) )
            // InternalGraphQL.g:2023:2: ( (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )* )
            {
            // InternalGraphQL.g:2023:2: ( (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )* )
            // InternalGraphQL.g:2024:3: (otherlv_0= '|' )? ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) ) (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )*
            {
            // InternalGraphQL.g:2024:3: (otherlv_0= '|' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGraphQL.g:2025:4: otherlv_0= '|'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_36); 

                    				newLeafNode(otherlv_0, grammarAccess.getDirectiveLocationsAccess().getVerticalLineKeyword_0());
                    			

                    }
                    break;

            }

            // InternalGraphQL.g:2030:3: ( (lv_directiveLocations_1_0= ruleDirectiveLocation ) )
            // InternalGraphQL.g:2031:4: (lv_directiveLocations_1_0= ruleDirectiveLocation )
            {
            // InternalGraphQL.g:2031:4: (lv_directiveLocations_1_0= ruleDirectiveLocation )
            // InternalGraphQL.g:2032:5: lv_directiveLocations_1_0= ruleDirectiveLocation
            {

            					newCompositeNode(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalGraphQL.g:2049:3: (otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==24) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGraphQL.g:2050:4: otherlv_2= '|' ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDirectiveLocationsAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalGraphQL.g:2054:4: ( (lv_directiveLocations_3_0= ruleDirectiveLocation ) )
            	    // InternalGraphQL.g:2055:5: (lv_directiveLocations_3_0= ruleDirectiveLocation )
            	    {
            	    // InternalGraphQL.g:2055:5: (lv_directiveLocations_3_0= ruleDirectiveLocation )
            	    // InternalGraphQL.g:2056:6: lv_directiveLocations_3_0= ruleDirectiveLocation
            	    {

            	    						newCompositeNode(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop42;
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
    // InternalGraphQL.g:2078:1: ruleDirectiveLocation returns [Enumerator current=null] : ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) ) ;
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
            // InternalGraphQL.g:2084:2: ( ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) ) )
            // InternalGraphQL.g:2085:2: ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) )
            {
            // InternalGraphQL.g:2085:2: ( (enumLiteral_0= 'QUERY' ) | (enumLiteral_1= 'MUTATION' ) | (enumLiteral_2= 'SUBSCRIPTION' ) | (enumLiteral_3= 'FIELD' ) | (enumLiteral_4= 'FRAGMENT_DEFINITION' ) | (enumLiteral_5= 'FRAGMENT_SPREAD' ) | (enumLiteral_6= 'INLINE_FRAGMENT' ) | (enumLiteral_7= 'VARIABLE_DEFINITION' ) | (enumLiteral_8= 'SCHEMA' ) | (enumLiteral_9= 'SCALAR' ) | (enumLiteral_10= 'OBJECT' ) | (enumLiteral_11= 'FIELD_DEFINITION' ) | (enumLiteral_12= 'ARGUMENT_DEFINITION' ) | (enumLiteral_13= 'INTERFACE' ) | (enumLiteral_14= 'UNION' ) | (enumLiteral_15= 'ENUM' ) | (enumLiteral_16= 'ENUM_VALUE' ) | (enumLiteral_17= 'INPUT_OBJECT' ) | (enumLiteral_18= 'INPUT_FIELD_DEFINITION' ) )
            int alt43=19;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt43=1;
                }
                break;
            case 40:
                {
                alt43=2;
                }
                break;
            case 41:
                {
                alt43=3;
                }
                break;
            case 42:
                {
                alt43=4;
                }
                break;
            case 43:
                {
                alt43=5;
                }
                break;
            case 44:
                {
                alt43=6;
                }
                break;
            case 45:
                {
                alt43=7;
                }
                break;
            case 46:
                {
                alt43=8;
                }
                break;
            case 47:
                {
                alt43=9;
                }
                break;
            case 48:
                {
                alt43=10;
                }
                break;
            case 49:
                {
                alt43=11;
                }
                break;
            case 50:
                {
                alt43=12;
                }
                break;
            case 51:
                {
                alt43=13;
                }
                break;
            case 52:
                {
                alt43=14;
                }
                break;
            case 53:
                {
                alt43=15;
                }
                break;
            case 54:
                {
                alt43=16;
                }
                break;
            case 55:
                {
                alt43=17;
                }
                break;
            case 56:
                {
                alt43=18;
                }
                break;
            case 57:
                {
                alt43=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalGraphQL.g:2086:3: (enumLiteral_0= 'QUERY' )
                    {
                    // InternalGraphQL.g:2086:3: (enumLiteral_0= 'QUERY' )
                    // InternalGraphQL.g:2087:4: enumLiteral_0= 'QUERY'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:2094:3: (enumLiteral_1= 'MUTATION' )
                    {
                    // InternalGraphQL.g:2094:3: (enumLiteral_1= 'MUTATION' )
                    // InternalGraphQL.g:2095:4: enumLiteral_1= 'MUTATION'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:2102:3: (enumLiteral_2= 'SUBSCRIPTION' )
                    {
                    // InternalGraphQL.g:2102:3: (enumLiteral_2= 'SUBSCRIPTION' )
                    // InternalGraphQL.g:2103:4: enumLiteral_2= 'SUBSCRIPTION'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:2110:3: (enumLiteral_3= 'FIELD' )
                    {
                    // InternalGraphQL.g:2110:3: (enumLiteral_3= 'FIELD' )
                    // InternalGraphQL.g:2111:4: enumLiteral_3= 'FIELD'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:2118:3: (enumLiteral_4= 'FRAGMENT_DEFINITION' )
                    {
                    // InternalGraphQL.g:2118:3: (enumLiteral_4= 'FRAGMENT_DEFINITION' )
                    // InternalGraphQL.g:2119:4: enumLiteral_4= 'FRAGMENT_DEFINITION'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:2126:3: (enumLiteral_5= 'FRAGMENT_SPREAD' )
                    {
                    // InternalGraphQL.g:2126:3: (enumLiteral_5= 'FRAGMENT_SPREAD' )
                    // InternalGraphQL.g:2127:4: enumLiteral_5= 'FRAGMENT_SPREAD'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:2134:3: (enumLiteral_6= 'INLINE_FRAGMENT' )
                    {
                    // InternalGraphQL.g:2134:3: (enumLiteral_6= 'INLINE_FRAGMENT' )
                    // InternalGraphQL.g:2135:4: enumLiteral_6= 'INLINE_FRAGMENT'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphQL.g:2142:3: (enumLiteral_7= 'VARIABLE_DEFINITION' )
                    {
                    // InternalGraphQL.g:2142:3: (enumLiteral_7= 'VARIABLE_DEFINITION' )
                    // InternalGraphQL.g:2143:4: enumLiteral_7= 'VARIABLE_DEFINITION'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGraphQL.g:2150:3: (enumLiteral_8= 'SCHEMA' )
                    {
                    // InternalGraphQL.g:2150:3: (enumLiteral_8= 'SCHEMA' )
                    // InternalGraphQL.g:2151:4: enumLiteral_8= 'SCHEMA'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGraphQL.g:2158:3: (enumLiteral_9= 'SCALAR' )
                    {
                    // InternalGraphQL.g:2158:3: (enumLiteral_9= 'SCALAR' )
                    // InternalGraphQL.g:2159:4: enumLiteral_9= 'SCALAR'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalGraphQL.g:2166:3: (enumLiteral_10= 'OBJECT' )
                    {
                    // InternalGraphQL.g:2166:3: (enumLiteral_10= 'OBJECT' )
                    // InternalGraphQL.g:2167:4: enumLiteral_10= 'OBJECT'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalGraphQL.g:2174:3: (enumLiteral_11= 'FIELD_DEFINITION' )
                    {
                    // InternalGraphQL.g:2174:3: (enumLiteral_11= 'FIELD_DEFINITION' )
                    // InternalGraphQL.g:2175:4: enumLiteral_11= 'FIELD_DEFINITION'
                    {
                    enumLiteral_11=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalGraphQL.g:2182:3: (enumLiteral_12= 'ARGUMENT_DEFINITION' )
                    {
                    // InternalGraphQL.g:2182:3: (enumLiteral_12= 'ARGUMENT_DEFINITION' )
                    // InternalGraphQL.g:2183:4: enumLiteral_12= 'ARGUMENT_DEFINITION'
                    {
                    enumLiteral_12=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalGraphQL.g:2190:3: (enumLiteral_13= 'INTERFACE' )
                    {
                    // InternalGraphQL.g:2190:3: (enumLiteral_13= 'INTERFACE' )
                    // InternalGraphQL.g:2191:4: enumLiteral_13= 'INTERFACE'
                    {
                    enumLiteral_13=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalGraphQL.g:2198:3: (enumLiteral_14= 'UNION' )
                    {
                    // InternalGraphQL.g:2198:3: (enumLiteral_14= 'UNION' )
                    // InternalGraphQL.g:2199:4: enumLiteral_14= 'UNION'
                    {
                    enumLiteral_14=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalGraphQL.g:2206:3: (enumLiteral_15= 'ENUM' )
                    {
                    // InternalGraphQL.g:2206:3: (enumLiteral_15= 'ENUM' )
                    // InternalGraphQL.g:2207:4: enumLiteral_15= 'ENUM'
                    {
                    enumLiteral_15=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalGraphQL.g:2214:3: (enumLiteral_16= 'ENUM_VALUE' )
                    {
                    // InternalGraphQL.g:2214:3: (enumLiteral_16= 'ENUM_VALUE' )
                    // InternalGraphQL.g:2215:4: enumLiteral_16= 'ENUM_VALUE'
                    {
                    enumLiteral_16=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalGraphQL.g:2222:3: (enumLiteral_17= 'INPUT_OBJECT' )
                    {
                    // InternalGraphQL.g:2222:3: (enumLiteral_17= 'INPUT_OBJECT' )
                    // InternalGraphQL.g:2223:4: enumLiteral_17= 'INPUT_OBJECT'
                    {
                    enumLiteral_17=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalGraphQL.g:2230:3: (enumLiteral_18= 'INPUT_FIELD_DEFINITION' )
                    {
                    // InternalGraphQL.g:2230:3: (enumLiteral_18= 'INPUT_FIELD_DEFINITION' )
                    // InternalGraphQL.g:2231:4: enumLiteral_18= 'INPUT_FIELD_DEFINITION'
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
    // InternalGraphQL.g:2241:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:2247:2: ( ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) )
            // InternalGraphQL.g:2248:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            {
            // InternalGraphQL.g:2248:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt44=1;
                }
                break;
            case 59:
                {
                alt44=2;
                }
                break;
            case 60:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalGraphQL.g:2249:3: (enumLiteral_0= 'query' )
                    {
                    // InternalGraphQL.g:2249:3: (enumLiteral_0= 'query' )
                    // InternalGraphQL.g:2250:4: enumLiteral_0= 'query'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:2257:3: (enumLiteral_1= 'mutation' )
                    {
                    // InternalGraphQL.g:2257:3: (enumLiteral_1= 'mutation' )
                    // InternalGraphQL.g:2258:4: enumLiteral_1= 'mutation'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:2265:3: (enumLiteral_2= 'subscription' )
                    {
                    // InternalGraphQL.g:2265:3: (enumLiteral_2= 'subscription' )
                    // InternalGraphQL.g:2266:4: enumLiteral_2= 'subscription'
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000028000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010190L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000029000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000003A0008070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000003E0008070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x03FFFF8001000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000190L});

}