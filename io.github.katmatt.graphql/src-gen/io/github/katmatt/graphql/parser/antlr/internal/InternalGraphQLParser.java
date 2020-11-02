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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_WS", "RULE_SL_COMMENT", "RULE_COMMA", "'schema'", "'{'", "'}'", "':'", "'scalar'", "'type'", "'interface'", "'union'", "'='", "'|'", "'enum'", "'input'", "'query'", "'mutation'", "'subscription'"
    };
    public static final int RULE_NAME=4;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_WS=5;
    public static final int RULE_COMMA=7;
    public static final int T__22=22;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalGraphQL.g:72:1: ruleTypeSystemDefinition returns [EObject current=null] : ( ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) ) | ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) ) )* ;
    public final EObject ruleTypeSystemDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_schemaDefinitions_0_0 = null;

        EObject lv_typeDefinitions_1_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:78:2: ( ( ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) ) | ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) ) )* )
            // InternalGraphQL.g:79:2: ( ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) ) | ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) ) )*
            {
            // InternalGraphQL.g:79:2: ( ( (lv_schemaDefinitions_0_0= ruleSchemaDefinition ) ) | ( (lv_typeDefinitions_1_0= ruleTypeDefinition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==8) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=12 && LA1_0<=15)||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=2;
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
    // InternalGraphQL.g:123:1: entryRuleSchemaDefinition returns [EObject current=null] : iv_ruleSchemaDefinition= ruleSchemaDefinition EOF ;
    public final EObject entryRuleSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaDefinition = null;


        try {
            // InternalGraphQL.g:123:57: (iv_ruleSchemaDefinition= ruleSchemaDefinition EOF )
            // InternalGraphQL.g:124:2: iv_ruleSchemaDefinition= ruleSchemaDefinition EOF
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
    // InternalGraphQL.g:130:1: ruleSchemaDefinition returns [EObject current=null] : (otherlv_0= 'schema' otherlv_1= '{' ( (lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition ) )+ otherlv_3= '}' ) ;
    public final EObject ruleSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeDefinitions_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:136:2: ( (otherlv_0= 'schema' otherlv_1= '{' ( (lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition ) )+ otherlv_3= '}' ) )
            // InternalGraphQL.g:137:2: (otherlv_0= 'schema' otherlv_1= '{' ( (lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition ) )+ otherlv_3= '}' )
            {
            // InternalGraphQL.g:137:2: (otherlv_0= 'schema' otherlv_1= '{' ( (lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition ) )+ otherlv_3= '}' )
            // InternalGraphQL.g:138:3: otherlv_0= 'schema' otherlv_1= '{' ( (lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,8,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_0());
            		
            otherlv_1=(Token)match(input,9,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphQL.g:146:3: ( (lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=20 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGraphQL.g:147:4: (lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition )
            	    {
            	    // InternalGraphQL.g:147:4: (lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition )
            	    // InternalGraphQL.g:148:5: lv_typeDefinitions_2_0= ruleRootOperationTypeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsRootOperationTypeDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_typeDefinitions_2_0=ruleRootOperationTypeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeDefinitions",
            	    						lv_typeDefinitions_2_0,
            	    						"io.github.katmatt.graphql.GraphQL.RootOperationTypeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_3=(Token)match(input,10,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSchemaDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalGraphQL.g:173:1: entryRuleRootOperationTypeDefinition returns [EObject current=null] : iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF ;
    public final EObject entryRuleRootOperationTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootOperationTypeDefinition = null;


        try {
            // InternalGraphQL.g:173:68: (iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF )
            // InternalGraphQL.g:174:2: iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF
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
    // InternalGraphQL.g:180:1: ruleRootOperationTypeDefinition returns [EObject current=null] : ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) ;
    public final EObject ruleRootOperationTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_operationType_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:186:2: ( ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) )
            // InternalGraphQL.g:187:2: ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:187:2: ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            // InternalGraphQL.g:188:3: ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) )
            {
            // InternalGraphQL.g:188:3: ( (lv_operationType_0_0= ruleOperationType ) )
            // InternalGraphQL.g:189:4: (lv_operationType_0_0= ruleOperationType )
            {
            // InternalGraphQL.g:189:4: (lv_operationType_0_0= ruleOperationType )
            // InternalGraphQL.g:190:5: lv_operationType_0_0= ruleOperationType
            {

            					newCompositeNode(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeOperationTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_1=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRootOperationTypeDefinitionAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:211:3: ( (otherlv_2= RULE_NAME ) )
            // InternalGraphQL.g:212:4: (otherlv_2= RULE_NAME )
            {
            // InternalGraphQL.g:212:4: (otherlv_2= RULE_NAME )
            // InternalGraphQL.g:213:5: otherlv_2= RULE_NAME
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
    // InternalGraphQL.g:228:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // InternalGraphQL.g:228:55: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // InternalGraphQL.g:229:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
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
    // InternalGraphQL.g:235:1: ruleTypeDefinition returns [EObject current=null] : (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition ) ;
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
            // InternalGraphQL.g:241:2: ( (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition ) )
            // InternalGraphQL.g:242:2: (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition )
            {
            // InternalGraphQL.g:242:2: (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGraphQL.g:243:3: this_ScalarTypeDefinition_0= ruleScalarTypeDefinition
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
                    // InternalGraphQL.g:252:3: this_ObjectTypeDefinition_1= ruleObjectTypeDefinition
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
                    // InternalGraphQL.g:261:3: this_InterfaceDefinition_2= ruleInterfaceDefinition
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
                    // InternalGraphQL.g:270:3: this_UnionTypeDefinition_3= ruleUnionTypeDefinition
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
                    // InternalGraphQL.g:279:3: this_EnumTypeDefinition_4= ruleEnumTypeDefinition
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
                    // InternalGraphQL.g:288:3: this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition
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
    // InternalGraphQL.g:300:1: entryRuleScalarTypeDefinition returns [EObject current=null] : iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF ;
    public final EObject entryRuleScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarTypeDefinition = null;


        try {
            // InternalGraphQL.g:300:61: (iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF )
            // InternalGraphQL.g:301:2: iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF
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
    // InternalGraphQL.g:307:1: ruleScalarTypeDefinition returns [EObject current=null] : (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:313:2: ( (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGraphQL.g:314:2: (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:314:2: (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGraphQL.g:315:3: otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_0());
            		
            // InternalGraphQL.g:319:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:320:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:320:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:321:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarTypeDefinitionRule());
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
    // $ANTLR end "ruleScalarTypeDefinition"


    // $ANTLR start "entryRuleObjectTypeDefinition"
    // InternalGraphQL.g:341:1: entryRuleObjectTypeDefinition returns [EObject current=null] : iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF ;
    public final EObject entryRuleObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:341:61: (iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF )
            // InternalGraphQL.g:342:2: iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF
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
    // InternalGraphQL.g:348:1: ruleObjectTypeDefinition returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:354:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? ) )
            // InternalGraphQL.g:355:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? )
            {
            // InternalGraphQL.g:355:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? )
            // InternalGraphQL.g:356:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_0());
            		
            // InternalGraphQL.g:360:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:361:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:361:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:362:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:378:3: (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==9) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphQL.g:379:4: otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,9,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalGraphQL.g:383:4: ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_NAME) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGraphQL.g:384:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:384:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:385:6: lv_fieldDefinitions_3_0= ruleFieldDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_fieldDefinitions_3_0=ruleFieldDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getObjectTypeDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldDefinitions",
                    	    							lv_fieldDefinitions_3_0,
                    	    							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,10,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // InternalGraphQL.g:411:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalGraphQL.g:411:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalGraphQL.g:412:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
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
    // InternalGraphQL.g:418:1: ruleInterfaceDefinition returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:424:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? ) )
            // InternalGraphQL.g:425:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? )
            {
            // InternalGraphQL.g:425:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? )
            // InternalGraphQL.g:426:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0());
            		
            // InternalGraphQL.g:430:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:431:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:431:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:432:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:448:3: (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==9) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphQL.g:449:4: otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,9,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalGraphQL.g:453:4: ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_NAME) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGraphQL.g:454:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:454:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:455:6: lv_fieldDefinitions_3_0= ruleFieldDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_fieldDefinitions_3_0=ruleFieldDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldDefinitions",
                    	    							lv_fieldDefinitions_3_0,
                    	    							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,10,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // InternalGraphQL.g:481:1: entryRuleFieldDefinition returns [EObject current=null] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final EObject entryRuleFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDefinition = null;


        try {
            // InternalGraphQL.g:481:56: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // InternalGraphQL.g:482:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
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
    // InternalGraphQL.g:488:1: ruleFieldDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) ;
    public final EObject ruleFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:494:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) )
            // InternalGraphQL.g:495:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:495:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            // InternalGraphQL.g:496:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) )
            {
            // InternalGraphQL.g:496:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphQL.g:497:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphQL.g:497:4: (lv_name_0_0= RULE_NAME )
            // InternalGraphQL.g:498:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldDefinitionAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldDefinitionAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:518:3: ( (otherlv_2= RULE_NAME ) )
            // InternalGraphQL.g:519:4: (otherlv_2= RULE_NAME )
            {
            // InternalGraphQL.g:519:4: (otherlv_2= RULE_NAME )
            // InternalGraphQL.g:520:5: otherlv_2= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getFieldDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0());
            				

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
    // InternalGraphQL.g:535:1: entryRuleUnionTypeDefinition returns [EObject current=null] : iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF ;
    public final EObject entryRuleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionTypeDefinition = null;


        try {
            // InternalGraphQL.g:535:60: (iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF )
            // InternalGraphQL.g:536:2: iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF
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
    // InternalGraphQL.g:542:1: ruleUnionTypeDefinition returns [EObject current=null] : (otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* )? ) ;
    public final EObject ruleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGraphQL.g:548:2: ( (otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* )? ) )
            // InternalGraphQL.g:549:2: (otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* )? )
            {
            // InternalGraphQL.g:549:2: (otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* )? )
            // InternalGraphQL.g:550:3: otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_0());
            		
            // InternalGraphQL.g:554:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:555:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:555:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:556:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnionTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:572:3: (otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphQL.g:573:4: otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )*
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalGraphQL.g:577:4: ( (otherlv_3= RULE_NAME ) )
                    // InternalGraphQL.g:578:5: (otherlv_3= RULE_NAME )
                    {
                    // InternalGraphQL.g:578:5: (otherlv_3= RULE_NAME )
                    // InternalGraphQL.g:579:6: otherlv_3= RULE_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnionTypeDefinitionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_NAME,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalGraphQL.g:590:4: (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGraphQL.g:591:5: otherlv_4= '|' ( (otherlv_5= RULE_NAME ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_2_2_0());
                    	    				
                    	    // InternalGraphQL.g:595:5: ( (otherlv_5= RULE_NAME ) )
                    	    // InternalGraphQL.g:596:6: (otherlv_5= RULE_NAME )
                    	    {
                    	    // InternalGraphQL.g:596:6: (otherlv_5= RULE_NAME )
                    	    // InternalGraphQL.g:597:7: otherlv_5= RULE_NAME
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUnionTypeDefinitionRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_NAME,FOLLOW_12); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
    // InternalGraphQL.g:614:1: entryRuleEnumTypeDefinition returns [EObject current=null] : iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF ;
    public final EObject entryRuleEnumTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDefinition = null;


        try {
            // InternalGraphQL.g:614:59: (iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF )
            // InternalGraphQL.g:615:2: iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF
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
    // InternalGraphQL.g:621:1: ruleEnumTypeDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_valueDefinitions_3_0= ruleEnumValueDefinition ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleEnumTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valueDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:627:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_valueDefinitions_3_0= ruleEnumValueDefinition ) ) otherlv_4= '}' )? ) )
            // InternalGraphQL.g:628:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_valueDefinitions_3_0= ruleEnumValueDefinition ) ) otherlv_4= '}' )? )
            {
            // InternalGraphQL.g:628:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_valueDefinitions_3_0= ruleEnumValueDefinition ) ) otherlv_4= '}' )? )
            // InternalGraphQL.g:629:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_valueDefinitions_3_0= ruleEnumValueDefinition ) ) otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_0());
            		
            // InternalGraphQL.g:633:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:634:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:634:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:635:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:651:3: (otherlv_2= '{' ( (lv_valueDefinitions_3_0= ruleEnumValueDefinition ) ) otherlv_4= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==9) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:652:4: otherlv_2= '{' ( (lv_valueDefinitions_3_0= ruleEnumValueDefinition ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,9,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalGraphQL.g:656:4: ( (lv_valueDefinitions_3_0= ruleEnumValueDefinition ) )
                    // InternalGraphQL.g:657:5: (lv_valueDefinitions_3_0= ruleEnumValueDefinition )
                    {
                    // InternalGraphQL.g:657:5: (lv_valueDefinitions_3_0= ruleEnumValueDefinition )
                    // InternalGraphQL.g:658:6: lv_valueDefinitions_3_0= ruleEnumValueDefinition
                    {

                    						newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_valueDefinitions_3_0=ruleEnumValueDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumTypeDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"valueDefinitions",
                    							lv_valueDefinitions_3_0,
                    							"io.github.katmatt.graphql.GraphQL.EnumValueDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,10,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // InternalGraphQL.g:684:1: entryRuleEnumValueDefinition returns [EObject current=null] : iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF ;
    public final EObject entryRuleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValueDefinition = null;


        try {
            // InternalGraphQL.g:684:60: (iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF )
            // InternalGraphQL.g:685:2: iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF
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
    // InternalGraphQL.g:691:1: ruleEnumValueDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_NAME ) ) ;
    public final EObject ruleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:697:2: ( ( (lv_name_0_0= RULE_NAME ) ) )
            // InternalGraphQL.g:698:2: ( (lv_name_0_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:698:2: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphQL.g:699:3: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphQL.g:699:3: (lv_name_0_0= RULE_NAME )
            // InternalGraphQL.g:700:4: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnumValueDefinitionAccess().getNameNAMETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumValueDefinitionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"io.github.katmatt.graphql.GraphQL.NAME");
            			

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
    // InternalGraphQL.g:719:1: entryRuleInputObjectTypeDefinition returns [EObject current=null] : iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF ;
    public final EObject entryRuleInputObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:719:66: (iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF )
            // InternalGraphQL.g:720:2: iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF
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
    // InternalGraphQL.g:726:1: ruleInputObjectTypeDefinition returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleInputObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:732:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? ) )
            // InternalGraphQL.g:733:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? )
            {
            // InternalGraphQL.g:733:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )? )
            // InternalGraphQL.g:734:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_0());
            		
            // InternalGraphQL.g:738:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:739:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:739:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:740:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputObjectTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.katmatt.graphql.GraphQL.NAME");
            				

            }


            }

            // InternalGraphQL.g:756:3: (otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==9) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphQL.g:757:4: otherlv_2= '{' ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,9,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalGraphQL.g:761:4: ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_NAME) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGraphQL.g:762:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:762:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:763:6: lv_fieldDefinitions_3_0= ruleFieldDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_fieldDefinitions_3_0=ruleFieldDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInputObjectTypeDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldDefinitions",
                    	    							lv_fieldDefinitions_3_0,
                    	    							"io.github.katmatt.graphql.GraphQL.FieldDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,10,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2());
                    			

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


    // $ANTLR start "ruleOperationType"
    // InternalGraphQL.g:789:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:795:2: ( ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) )
            // InternalGraphQL.g:796:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            {
            // InternalGraphQL.g:796:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:797:3: (enumLiteral_0= 'query' )
                    {
                    // InternalGraphQL.g:797:3: (enumLiteral_0= 'query' )
                    // InternalGraphQL.g:798:4: enumLiteral_0= 'query'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:805:3: (enumLiteral_1= 'mutation' )
                    {
                    // InternalGraphQL.g:805:3: (enumLiteral_1= 'mutation' )
                    // InternalGraphQL.g:806:4: enumLiteral_1= 'mutation'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:813:3: (enumLiteral_2= 'subscription' )
                    {
                    // InternalGraphQL.g:813:3: (enumLiteral_2= 'subscription' )
                    // InternalGraphQL.g:814:4: enumLiteral_2= 'subscription'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000CF102L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000700400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});

}