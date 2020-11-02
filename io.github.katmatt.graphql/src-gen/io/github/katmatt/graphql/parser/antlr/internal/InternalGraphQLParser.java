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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_INT_VALUE", "RULE_FLOAT_VALUE", "RULE_SL_STRING_VALUE", "RULE_ML_STRING_VALUE", "RULE_WS", "RULE_SL_COMMENT", "RULE_COMMA", "RULE_STRING_CHARACTER", "'schema'", "'{'", "'}'", "':'", "'scalar'", "'type'", "'implements'", "'interface'", "'union'", "'='", "'|'", "'enum'", "'input'", "'&'", "'!'", "'['", "']'", "'null'", "'true'", "'false'", "'query'", "'mutation'", "'subscription'"
    };
    public static final int RULE_FLOAT_VALUE=6;
    public static final int RULE_STRING_CHARACTER=12;
    public static final int RULE_NAME=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_INT_VALUE=5;
    public static final int RULE_SL_STRING_VALUE=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_COMMA=11;
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
                switch ( input.LA(1) ) {
                case RULE_SL_STRING_VALUE:
                    {
                    int LA1_2 = input.LA(2);

                    if ( ((LA1_2>=17 && LA1_2<=18)||(LA1_2>=20 && LA1_2<=21)||(LA1_2>=24 && LA1_2<=25)) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==13) ) {
                        alt1=1;
                    }


                    }
                    break;
                case RULE_ML_STRING_VALUE:
                    {
                    int LA1_3 = input.LA(2);

                    if ( ((LA1_3>=17 && LA1_3<=18)||(LA1_3>=20 && LA1_3<=21)||(LA1_3>=24 && LA1_3<=25)) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==13) ) {
                        alt1=1;
                    }


                    }
                    break;
                case 13:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                case 18:
                case 20:
                case 21:
                case 24:
                case 25:
                    {
                    alt1=2;
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
    // InternalGraphQL.g:130:1: ruleSchemaDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_description_0_0 = null;

        EObject lv_typeDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:136:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}' ) )
            // InternalGraphQL.g:137:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}' )
            {
            // InternalGraphQL.g:137:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}' )
            // InternalGraphQL.g:138:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'schema' otherlv_2= '{' ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+ otherlv_4= '}'
            {
            // InternalGraphQL.g:138:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_SL_STRING_VALUE && LA2_0<=RULE_ML_STRING_VALUE)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphQL.g:139:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:139:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:140:5: lv_description_0_0= ruleStringValue
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

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGraphQL.g:165:3: ( (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=33 && LA3_0<=35)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGraphQL.g:166:4: (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition )
            	    {
            	    // InternalGraphQL.g:166:4: (lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition )
            	    // InternalGraphQL.g:167:5: lv_typeDefinitions_3_0= ruleRootOperationTypeDefinition
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGraphQL.g:192:1: entryRuleRootOperationTypeDefinition returns [EObject current=null] : iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF ;
    public final EObject entryRuleRootOperationTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootOperationTypeDefinition = null;


        try {
            // InternalGraphQL.g:192:68: (iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF )
            // InternalGraphQL.g:193:2: iv_ruleRootOperationTypeDefinition= ruleRootOperationTypeDefinition EOF
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
    // InternalGraphQL.g:199:1: ruleRootOperationTypeDefinition returns [EObject current=null] : ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) ;
    public final EObject ruleRootOperationTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_operationType_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:205:2: ( ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) )
            // InternalGraphQL.g:206:2: ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:206:2: ( ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            // InternalGraphQL.g:207:3: ( (lv_operationType_0_0= ruleOperationType ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) )
            {
            // InternalGraphQL.g:207:3: ( (lv_operationType_0_0= ruleOperationType ) )
            // InternalGraphQL.g:208:4: (lv_operationType_0_0= ruleOperationType )
            {
            // InternalGraphQL.g:208:4: (lv_operationType_0_0= ruleOperationType )
            // InternalGraphQL.g:209:5: lv_operationType_0_0= ruleOperationType
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

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRootOperationTypeDefinitionAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:230:3: ( (otherlv_2= RULE_NAME ) )
            // InternalGraphQL.g:231:4: (otherlv_2= RULE_NAME )
            {
            // InternalGraphQL.g:231:4: (otherlv_2= RULE_NAME )
            // InternalGraphQL.g:232:5: otherlv_2= RULE_NAME
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
    // InternalGraphQL.g:247:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // InternalGraphQL.g:247:55: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // InternalGraphQL.g:248:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
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
    // InternalGraphQL.g:254:1: ruleTypeDefinition returns [EObject current=null] : (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition ) ;
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
            // InternalGraphQL.g:260:2: ( (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition ) )
            // InternalGraphQL.g:261:2: (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition )
            {
            // InternalGraphQL.g:261:2: (this_ScalarTypeDefinition_0= ruleScalarTypeDefinition | this_ObjectTypeDefinition_1= ruleObjectTypeDefinition | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_UnionTypeDefinition_3= ruleUnionTypeDefinition | this_EnumTypeDefinition_4= ruleEnumTypeDefinition | this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_SL_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt4=6;
                    }
                    break;
                case 17:
                    {
                    alt4=1;
                    }
                    break;
                case 24:
                    {
                    alt4=5;
                    }
                    break;
                case 21:
                    {
                    alt4=4;
                    }
                    break;
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                case 18:
                    {
                    alt4=2;
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
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                case 18:
                    {
                    alt4=2;
                    }
                    break;
                case 25:
                    {
                    alt4=6;
                    }
                    break;
                case 17:
                    {
                    alt4=1;
                    }
                    break;
                case 24:
                    {
                    alt4=5;
                    }
                    break;
                case 21:
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
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 25:
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
                    // InternalGraphQL.g:262:3: this_ScalarTypeDefinition_0= ruleScalarTypeDefinition
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
                    // InternalGraphQL.g:271:3: this_ObjectTypeDefinition_1= ruleObjectTypeDefinition
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
                    // InternalGraphQL.g:280:3: this_InterfaceDefinition_2= ruleInterfaceDefinition
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
                    // InternalGraphQL.g:289:3: this_UnionTypeDefinition_3= ruleUnionTypeDefinition
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
                    // InternalGraphQL.g:298:3: this_EnumTypeDefinition_4= ruleEnumTypeDefinition
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
                    // InternalGraphQL.g:307:3: this_InputObjectTypeDefinition_5= ruleInputObjectTypeDefinition
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
    // InternalGraphQL.g:319:1: entryRuleScalarTypeDefinition returns [EObject current=null] : iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF ;
    public final EObject entryRuleScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarTypeDefinition = null;


        try {
            // InternalGraphQL.g:319:61: (iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF )
            // InternalGraphQL.g:320:2: iv_ruleScalarTypeDefinition= ruleScalarTypeDefinition EOF
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
    // InternalGraphQL.g:326:1: ruleScalarTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ) ;
    public final EObject ruleScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_description_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:332:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) ) )
            // InternalGraphQL.g:333:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:333:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) ) )
            // InternalGraphQL.g:334:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'scalar' ( (lv_name_2_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:334:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SL_STRING_VALUE && LA5_0<=RULE_ML_STRING_VALUE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphQL.g:335:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:335:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:336:5: lv_description_0_0= ruleStringValue
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

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_1());
            		
            // InternalGraphQL.g:357:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:358:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:358:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:359:5: lv_name_2_0= RULE_NAME
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
    // InternalGraphQL.g:379:1: entryRuleObjectTypeDefinition returns [EObject current=null] : iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF ;
    public final EObject entryRuleObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:379:61: (iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF )
            // InternalGraphQL.g:380:2: iv_ruleObjectTypeDefinition= ruleObjectTypeDefinition EOF
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
    // InternalGraphQL.g:386:1: ruleObjectTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) ;
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
            // InternalGraphQL.g:392:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) )
            // InternalGraphQL.g:393:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            {
            // InternalGraphQL.g:393:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            // InternalGraphQL.g:394:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            {
            // InternalGraphQL.g:394:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SL_STRING_VALUE && LA6_0<=RULE_ML_STRING_VALUE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphQL.g:395:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:395:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:396:5: lv_description_0_0= ruleStringValue
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

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_1());
            		
            // InternalGraphQL.g:417:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:418:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:418:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:419:5: lv_name_2_0= RULE_NAME
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

            // InternalGraphQL.g:435:3: (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphQL.g:436:4: otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectTypeDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGraphQL.g:440:4: ( (lv_implements_4_0= ruleIntersectionType ) )
                    // InternalGraphQL.g:441:5: (lv_implements_4_0= ruleIntersectionType )
                    {
                    // InternalGraphQL.g:441:5: (lv_implements_4_0= ruleIntersectionType )
                    // InternalGraphQL.g:442:6: lv_implements_4_0= ruleIntersectionType
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

            // InternalGraphQL.g:460:3: (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphQL.g:461:4: otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalGraphQL.g:465:4: ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_NAME||(LA8_0>=RULE_SL_STRING_VALUE && LA8_0<=RULE_ML_STRING_VALUE)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGraphQL.g:466:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:466:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:467:6: lv_fieldDefinitions_6_0= ruleFieldDefinition
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

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGraphQL.g:493:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalGraphQL.g:493:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalGraphQL.g:494:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
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
    // InternalGraphQL.g:500:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) ;
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
            // InternalGraphQL.g:506:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? ) )
            // InternalGraphQL.g:507:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            {
            // InternalGraphQL.g:507:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )? )
            // InternalGraphQL.g:508:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )? (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            {
            // InternalGraphQL.g:508:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SL_STRING_VALUE && LA10_0<=RULE_ML_STRING_VALUE)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:509:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:509:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:510:5: lv_description_0_0= ruleStringValue
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

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
            		
            // InternalGraphQL.g:531:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:532:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:532:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:533:5: lv_name_2_0= RULE_NAME
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

            // InternalGraphQL.g:549:3: (otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphQL.g:550:4: otherlv_3= 'implements' ( (lv_implements_4_0= ruleIntersectionType ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getInterfaceDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGraphQL.g:554:4: ( (lv_implements_4_0= ruleIntersectionType ) )
                    // InternalGraphQL.g:555:5: (lv_implements_4_0= ruleIntersectionType )
                    {
                    // InternalGraphQL.g:555:5: (lv_implements_4_0= ruleIntersectionType )
                    // InternalGraphQL.g:556:6: lv_implements_4_0= ruleIntersectionType
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

            // InternalGraphQL.g:574:3: (otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:575:4: otherlv_5= '{' ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalGraphQL.g:579:4: ( (lv_fieldDefinitions_6_0= ruleFieldDefinition ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_NAME||(LA12_0>=RULE_SL_STRING_VALUE && LA12_0<=RULE_ML_STRING_VALUE)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGraphQL.g:580:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    {
                    	    // InternalGraphQL.g:580:5: (lv_fieldDefinitions_6_0= ruleFieldDefinition )
                    	    // InternalGraphQL.g:581:6: lv_fieldDefinitions_6_0= ruleFieldDefinition
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

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGraphQL.g:607:1: entryRuleFieldDefinition returns [EObject current=null] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final EObject entryRuleFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDefinition = null;


        try {
            // InternalGraphQL.g:607:56: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // InternalGraphQL.g:608:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
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
    // InternalGraphQL.g:614:1: ruleFieldDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_0_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:620:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalGraphQL.g:621:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalGraphQL.g:621:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalGraphQL.g:622:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalGraphQL.g:622:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_SL_STRING_VALUE && LA14_0<=RULE_ML_STRING_VALUE)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphQL.g:623:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:623:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:624:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:641:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:642:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:642:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:643:5: lv_name_1_0= RULE_NAME
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

            otherlv_2=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldDefinitionAccess().getColonKeyword_2());
            		
            // InternalGraphQL.g:663:3: ( (lv_type_3_0= ruleType ) )
            // InternalGraphQL.g:664:4: (lv_type_3_0= ruleType )
            {
            // InternalGraphQL.g:664:4: (lv_type_3_0= ruleType )
            // InternalGraphQL.g:665:5: lv_type_3_0= ruleType
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
    // InternalGraphQL.g:686:1: entryRuleUnionTypeDefinition returns [EObject current=null] : iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF ;
    public final EObject entryRuleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionTypeDefinition = null;


        try {
            // InternalGraphQL.g:686:60: (iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF )
            // InternalGraphQL.g:687:2: iv_ruleUnionTypeDefinition= ruleUnionTypeDefinition EOF
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
    // InternalGraphQL.g:693:1: ruleUnionTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' ( (lv_memberTypes_4_0= ruleType ) ) (otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) ) )* )? ) ;
    public final EObject ruleUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_0_0 = null;

        EObject lv_memberTypes_4_0 = null;

        EObject lv_memberTypes_6_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:699:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' ( (lv_memberTypes_4_0= ruleType ) ) (otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) ) )* )? ) )
            // InternalGraphQL.g:700:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' ( (lv_memberTypes_4_0= ruleType ) ) (otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) ) )* )? )
            {
            // InternalGraphQL.g:700:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' ( (lv_memberTypes_4_0= ruleType ) ) (otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) ) )* )? )
            // InternalGraphQL.g:701:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'union' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '=' ( (lv_memberTypes_4_0= ruleType ) ) (otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) ) )* )?
            {
            // InternalGraphQL.g:701:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_SL_STRING_VALUE && LA15_0<=RULE_ML_STRING_VALUE)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphQL.g:702:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:702:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:703:5: lv_description_0_0= ruleStringValue
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

            otherlv_1=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_1());
            		
            // InternalGraphQL.g:724:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:725:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:725:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:726:5: lv_name_2_0= RULE_NAME
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

            // InternalGraphQL.g:742:3: (otherlv_3= '=' ( (lv_memberTypes_4_0= ruleType ) ) (otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphQL.g:743:4: otherlv_3= '=' ( (lv_memberTypes_4_0= ruleType ) ) (otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) ) )*
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGraphQL.g:747:4: ( (lv_memberTypes_4_0= ruleType ) )
                    // InternalGraphQL.g:748:5: (lv_memberTypes_4_0= ruleType )
                    {
                    // InternalGraphQL.g:748:5: (lv_memberTypes_4_0= ruleType )
                    // InternalGraphQL.g:749:6: lv_memberTypes_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_memberTypes_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnionTypeDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"memberTypes",
                    							lv_memberTypes_4_0,
                    							"io.github.katmatt.graphql.GraphQL.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphQL.g:766:4: (otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==23) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalGraphQL.g:767:5: otherlv_5= '|' ( (lv_memberTypes_6_0= ruleType ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_13); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_2_0());
                    	    				
                    	    // InternalGraphQL.g:771:5: ( (lv_memberTypes_6_0= ruleType ) )
                    	    // InternalGraphQL.g:772:6: (lv_memberTypes_6_0= ruleType )
                    	    {
                    	    // InternalGraphQL.g:772:6: (lv_memberTypes_6_0= ruleType )
                    	    // InternalGraphQL.g:773:7: lv_memberTypes_6_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
    // InternalGraphQL.g:796:1: entryRuleEnumTypeDefinition returns [EObject current=null] : iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF ;
    public final EObject entryRuleEnumTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDefinition = null;


        try {
            // InternalGraphQL.g:796:59: (iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF )
            // InternalGraphQL.g:797:2: iv_ruleEnumTypeDefinition= ruleEnumTypeDefinition EOF
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
    // InternalGraphQL.g:803:1: ruleEnumTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )? ) ;
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
            // InternalGraphQL.g:809:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )? ) )
            // InternalGraphQL.g:810:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )? )
            {
            // InternalGraphQL.g:810:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )? )
            // InternalGraphQL.g:811:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )?
            {
            // InternalGraphQL.g:811:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_SL_STRING_VALUE && LA18_0<=RULE_ML_STRING_VALUE)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGraphQL.g:812:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:812:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:813:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_20);
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

            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_1());
            		
            // InternalGraphQL.g:834:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:835:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:835:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:836:5: lv_name_2_0= RULE_NAME
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

            // InternalGraphQL.g:852:3: (otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGraphQL.g:853:4: otherlv_3= '{' ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalGraphQL.g:857:4: ( (lv_valueDefinitions_4_0= ruleEnumValueDefinition ) )
                    // InternalGraphQL.g:858:5: (lv_valueDefinitions_4_0= ruleEnumValueDefinition )
                    {
                    // InternalGraphQL.g:858:5: (lv_valueDefinitions_4_0= ruleEnumValueDefinition )
                    // InternalGraphQL.g:859:6: lv_valueDefinitions_4_0= ruleEnumValueDefinition
                    {

                    						newCompositeNode(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGraphQL.g:885:1: entryRuleEnumValueDefinition returns [EObject current=null] : iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF ;
    public final EObject entryRuleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValueDefinition = null;


        try {
            // InternalGraphQL.g:885:60: (iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF )
            // InternalGraphQL.g:886:2: iv_ruleEnumValueDefinition= ruleEnumValueDefinition EOF
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
    // InternalGraphQL.g:892:1: ruleEnumValueDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleEnumValueDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:898:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGraphQL.g:899:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGraphQL.g:899:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGraphQL.g:900:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:900:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_SL_STRING_VALUE && LA20_0<=RULE_ML_STRING_VALUE)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphQL.g:901:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:901:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:902:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:919:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:920:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:920:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:921:5: lv_name_1_0= RULE_NAME
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
    // InternalGraphQL.g:941:1: entryRuleInputObjectTypeDefinition returns [EObject current=null] : iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF ;
    public final EObject entryRuleInputObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputObjectTypeDefinition = null;


        try {
            // InternalGraphQL.g:941:66: (iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF )
            // InternalGraphQL.g:942:2: iv_ruleInputObjectTypeDefinition= ruleInputObjectTypeDefinition EOF
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
    // InternalGraphQL.g:948:1: ruleInputObjectTypeDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? ) ;
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
            // InternalGraphQL.g:954:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? ) )
            // InternalGraphQL.g:955:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? )
            {
            // InternalGraphQL.g:955:2: ( ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )? )
            // InternalGraphQL.g:956:3: ( (lv_description_0_0= ruleStringValue ) )? otherlv_1= 'input' ( (lv_name_2_0= RULE_NAME ) ) (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )?
            {
            // InternalGraphQL.g:956:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_SL_STRING_VALUE && LA21_0<=RULE_ML_STRING_VALUE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphQL.g:957:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:957:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:958:5: lv_description_0_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_1());
            		
            // InternalGraphQL.g:979:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGraphQL.g:980:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGraphQL.g:980:4: (lv_name_2_0= RULE_NAME )
            // InternalGraphQL.g:981:5: lv_name_2_0= RULE_NAME
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

            // InternalGraphQL.g:997:3: (otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGraphQL.g:998:4: otherlv_3= '{' ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalGraphQL.g:1002:4: ( (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_NAME||(LA22_0>=RULE_SL_STRING_VALUE && LA22_0<=RULE_ML_STRING_VALUE)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGraphQL.g:1003:5: (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition )
                    	    {
                    	    // InternalGraphQL.g:1003:5: (lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition )
                    	    // InternalGraphQL.g:1004:6: lv_inputsFieldDefinitions_4_0= ruleInputValueDefinition
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGraphQL.g:1030:1: entryRuleInputValueDefinition returns [EObject current=null] : iv_ruleInputValueDefinition= ruleInputValueDefinition EOF ;
    public final EObject entryRuleInputValueDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputValueDefinition = null;


        try {
            // InternalGraphQL.g:1030:61: (iv_ruleInputValueDefinition= ruleInputValueDefinition EOF )
            // InternalGraphQL.g:1031:2: iv_ruleInputValueDefinition= ruleInputValueDefinition EOF
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
    // InternalGraphQL.g:1037:1: ruleInputValueDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? ) ;
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
            // InternalGraphQL.g:1043:2: ( ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? ) )
            // InternalGraphQL.g:1044:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? )
            {
            // InternalGraphQL.g:1044:2: ( ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )? )
            // InternalGraphQL.g:1045:3: ( (lv_description_0_0= ruleStringValue ) )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )?
            {
            // InternalGraphQL.g:1045:3: ( (lv_description_0_0= ruleStringValue ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_SL_STRING_VALUE && LA24_0<=RULE_ML_STRING_VALUE)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphQL.g:1046:4: (lv_description_0_0= ruleStringValue )
                    {
                    // InternalGraphQL.g:1046:4: (lv_description_0_0= ruleStringValue )
                    // InternalGraphQL.g:1047:5: lv_description_0_0= ruleStringValue
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

            // InternalGraphQL.g:1064:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphQL.g:1065:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphQL.g:1065:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphQL.g:1066:5: lv_name_1_0= RULE_NAME
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

            otherlv_2=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getInputValueDefinitionAccess().getColonKeyword_2());
            		
            // InternalGraphQL.g:1086:3: ( (lv_type_3_0= ruleType ) )
            // InternalGraphQL.g:1087:4: (lv_type_3_0= ruleType )
            {
            // InternalGraphQL.g:1087:4: (lv_type_3_0= ruleType )
            // InternalGraphQL.g:1088:5: lv_type_3_0= ruleType
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

            // InternalGraphQL.g:1105:3: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphQL.g:1106:4: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleConstValue ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputValueDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalGraphQL.g:1110:4: ( (lv_defaultValue_5_0= ruleConstValue ) )
                    // InternalGraphQL.g:1111:5: (lv_defaultValue_5_0= ruleConstValue )
                    {
                    // InternalGraphQL.g:1111:5: (lv_defaultValue_5_0= ruleConstValue )
                    // InternalGraphQL.g:1112:6: lv_defaultValue_5_0= ruleConstValue
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
    // InternalGraphQL.g:1134:1: entryRuleIntersectionType returns [EObject current=null] : iv_ruleIntersectionType= ruleIntersectionType EOF ;
    public final EObject entryRuleIntersectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionType = null;


        try {
            // InternalGraphQL.g:1134:57: (iv_ruleIntersectionType= ruleIntersectionType EOF )
            // InternalGraphQL.g:1135:2: iv_ruleIntersectionType= ruleIntersectionType EOF
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
    // InternalGraphQL.g:1141:1: ruleIntersectionType returns [EObject current=null] : ( ( (lv_memberTypes_0_0= ruleType ) ) (otherlv_1= '&' ( (lv_memberTypes_2_0= ruleType ) ) )* ) ;
    public final EObject ruleIntersectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_memberTypes_0_0 = null;

        EObject lv_memberTypes_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1147:2: ( ( ( (lv_memberTypes_0_0= ruleType ) ) (otherlv_1= '&' ( (lv_memberTypes_2_0= ruleType ) ) )* ) )
            // InternalGraphQL.g:1148:2: ( ( (lv_memberTypes_0_0= ruleType ) ) (otherlv_1= '&' ( (lv_memberTypes_2_0= ruleType ) ) )* )
            {
            // InternalGraphQL.g:1148:2: ( ( (lv_memberTypes_0_0= ruleType ) ) (otherlv_1= '&' ( (lv_memberTypes_2_0= ruleType ) ) )* )
            // InternalGraphQL.g:1149:3: ( (lv_memberTypes_0_0= ruleType ) ) (otherlv_1= '&' ( (lv_memberTypes_2_0= ruleType ) ) )*
            {
            // InternalGraphQL.g:1149:3: ( (lv_memberTypes_0_0= ruleType ) )
            // InternalGraphQL.g:1150:4: (lv_memberTypes_0_0= ruleType )
            {
            // InternalGraphQL.g:1150:4: (lv_memberTypes_0_0= ruleType )
            // InternalGraphQL.g:1151:5: lv_memberTypes_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_memberTypes_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntersectionTypeRule());
            					}
            					add(
            						current,
            						"memberTypes",
            						lv_memberTypes_0_0,
            						"io.github.katmatt.graphql.GraphQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphQL.g:1168:3: (otherlv_1= '&' ( (lv_memberTypes_2_0= ruleType ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGraphQL.g:1169:4: otherlv_1= '&' ( (lv_memberTypes_2_0= ruleType ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_1_0());
            	    			
            	    // InternalGraphQL.g:1173:4: ( (lv_memberTypes_2_0= ruleType ) )
            	    // InternalGraphQL.g:1174:5: (lv_memberTypes_2_0= ruleType )
            	    {
            	    // InternalGraphQL.g:1174:5: (lv_memberTypes_2_0= ruleType )
            	    // InternalGraphQL.g:1175:6: lv_memberTypes_2_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_memberTypes_2_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntersectionTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"memberTypes",
            	    							lv_memberTypes_2_0,
            	    							"io.github.katmatt.graphql.GraphQL.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalGraphQL.g:1197:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGraphQL.g:1197:45: (iv_ruleType= ruleType EOF )
            // InternalGraphQL.g:1198:2: iv_ruleType= ruleType EOF
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
    // InternalGraphQL.g:1204:1: ruleType returns [EObject current=null] : (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_NamedType_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1210:2: ( (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType ) )
            // InternalGraphQL.g:1211:2: (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType )
            {
            // InternalGraphQL.g:1211:2: (this_NamedType_0= ruleNamedType | this_ListType_1= ruleListType )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NAME) ) {
                alt27=1;
            }
            else if ( (LA27_0==28) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGraphQL.g:1212:3: this_NamedType_0= ruleNamedType
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
                    // InternalGraphQL.g:1221:3: this_ListType_1= ruleListType
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
    // InternalGraphQL.g:1233:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // InternalGraphQL.g:1233:50: (iv_ruleNamedType= ruleNamedType EOF )
            // InternalGraphQL.g:1234:2: iv_ruleNamedType= ruleNamedType EOF
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
    // InternalGraphQL.g:1240:1: ruleNamedType returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nonNull_1_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1246:2: ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) )
            // InternalGraphQL.g:1247:2: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
            {
            // InternalGraphQL.g:1247:2: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
            // InternalGraphQL.g:1248:3: ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )?
            {
            // InternalGraphQL.g:1248:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1249:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1249:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1250:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedTypeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalGraphQL.g:1261:3: ( (lv_nonNull_1_0= '!' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphQL.g:1262:4: (lv_nonNull_1_0= '!' )
                    {
                    // InternalGraphQL.g:1262:4: (lv_nonNull_1_0= '!' )
                    // InternalGraphQL.g:1263:5: lv_nonNull_1_0= '!'
                    {
                    lv_nonNull_1_0=(Token)match(input,27,FOLLOW_2); 

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
    // InternalGraphQL.g:1279:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalGraphQL.g:1279:49: (iv_ruleListType= ruleListType EOF )
            // InternalGraphQL.g:1280:2: iv_ruleListType= ruleListType EOF
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
    // InternalGraphQL.g:1286:1: ruleListType returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_nonNull_3_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1292:2: ( (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? ) )
            // InternalGraphQL.g:1293:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? )
            {
            // InternalGraphQL.g:1293:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )? )
            // InternalGraphQL.g:1294:3: otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ( (lv_nonNull_3_0= '!' ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGraphQL.g:1298:3: ( (lv_type_1_0= ruleType ) )
            // InternalGraphQL.g:1299:4: (lv_type_1_0= ruleType )
            {
            // InternalGraphQL.g:1299:4: (lv_type_1_0= ruleType )
            // InternalGraphQL.g:1300:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_2=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2());
            		
            // InternalGraphQL.g:1321:3: ( (lv_nonNull_3_0= '!' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphQL.g:1322:4: (lv_nonNull_3_0= '!' )
                    {
                    // InternalGraphQL.g:1322:4: (lv_nonNull_3_0= '!' )
                    // InternalGraphQL.g:1323:5: lv_nonNull_3_0= '!'
                    {
                    lv_nonNull_3_0=(Token)match(input,27,FOLLOW_2); 

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
    // InternalGraphQL.g:1339:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalGraphQL.g:1339:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalGraphQL.g:1340:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalGraphQL.g:1346:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT_VALUE ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1352:2: ( ( (lv_value_0_0= RULE_INT_VALUE ) ) )
            // InternalGraphQL.g:1353:2: ( (lv_value_0_0= RULE_INT_VALUE ) )
            {
            // InternalGraphQL.g:1353:2: ( (lv_value_0_0= RULE_INT_VALUE ) )
            // InternalGraphQL.g:1354:3: (lv_value_0_0= RULE_INT_VALUE )
            {
            // InternalGraphQL.g:1354:3: (lv_value_0_0= RULE_INT_VALUE )
            // InternalGraphQL.g:1355:4: lv_value_0_0= RULE_INT_VALUE
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
    // InternalGraphQL.g:1374:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalGraphQL.g:1374:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalGraphQL.g:1375:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalGraphQL.g:1381:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT_VALUE ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1387:2: ( ( (lv_value_0_0= RULE_FLOAT_VALUE ) ) )
            // InternalGraphQL.g:1388:2: ( (lv_value_0_0= RULE_FLOAT_VALUE ) )
            {
            // InternalGraphQL.g:1388:2: ( (lv_value_0_0= RULE_FLOAT_VALUE ) )
            // InternalGraphQL.g:1389:3: (lv_value_0_0= RULE_FLOAT_VALUE )
            {
            // InternalGraphQL.g:1389:3: (lv_value_0_0= RULE_FLOAT_VALUE )
            // InternalGraphQL.g:1390:4: lv_value_0_0= RULE_FLOAT_VALUE
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
    // InternalGraphQL.g:1409:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGraphQL.g:1409:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGraphQL.g:1410:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalGraphQL.g:1416:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= 'null' ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1422:2: ( ( (lv_value_0_0= 'null' ) ) )
            // InternalGraphQL.g:1423:2: ( (lv_value_0_0= 'null' ) )
            {
            // InternalGraphQL.g:1423:2: ( (lv_value_0_0= 'null' ) )
            // InternalGraphQL.g:1424:3: (lv_value_0_0= 'null' )
            {
            // InternalGraphQL.g:1424:3: (lv_value_0_0= 'null' )
            // InternalGraphQL.g:1425:4: lv_value_0_0= 'null'
            {
            lv_value_0_0=(Token)match(input,30,FOLLOW_2); 

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
    // InternalGraphQL.g:1440:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGraphQL.g:1440:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGraphQL.g:1441:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalGraphQL.g:1447:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1453:2: ( ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) ) )
            // InternalGraphQL.g:1454:2: ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) )
            {
            // InternalGraphQL.g:1454:2: ( ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) ) )
            // InternalGraphQL.g:1455:3: ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) )
            {
            // InternalGraphQL.g:1455:3: ( (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE ) )
            // InternalGraphQL.g:1456:4: (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE )
            {
            // InternalGraphQL.g:1456:4: (lv_value_0_1= RULE_SL_STRING_VALUE | lv_value_0_2= RULE_ML_STRING_VALUE )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_SL_STRING_VALUE) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ML_STRING_VALUE) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalGraphQL.g:1457:5: lv_value_0_1= RULE_SL_STRING_VALUE
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
                    // InternalGraphQL.g:1472:5: lv_value_0_2= RULE_ML_STRING_VALUE
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
    // InternalGraphQL.g:1492:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGraphQL.g:1492:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGraphQL.g:1493:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalGraphQL.g:1499:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1505:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalGraphQL.g:1506:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalGraphQL.g:1506:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalGraphQL.g:1507:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalGraphQL.g:1507:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalGraphQL.g:1508:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalGraphQL.g:1508:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            else if ( (LA31_0==32) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalGraphQL.g:1509:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1520:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalGraphQL.g:1536:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalGraphQL.g:1536:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalGraphQL.g:1537:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalGraphQL.g:1543:1: ruleEnumValue returns [EObject current=null] : ( (otherlv_0= RULE_NAME ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1549:2: ( ( (otherlv_0= RULE_NAME ) ) )
            // InternalGraphQL.g:1550:2: ( (otherlv_0= RULE_NAME ) )
            {
            // InternalGraphQL.g:1550:2: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1551:3: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1551:3: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1552:4: otherlv_0= RULE_NAME
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
    // InternalGraphQL.g:1566:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGraphQL.g:1566:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGraphQL.g:1567:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalGraphQL.g:1573:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1579:2: ( ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) )
            // InternalGraphQL.g:1580:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            {
            // InternalGraphQL.g:1580:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            // InternalGraphQL.g:1581:3: () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}'
            {
            // InternalGraphQL.g:1581:3: ()
            // InternalGraphQL.g:1582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphQL.g:1592:3: ( (lv_fields_2_0= ruleObjectField ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_NAME) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGraphQL.g:1593:4: (lv_fields_2_0= ruleObjectField )
            	    {
            	    // InternalGraphQL.g:1593:4: (lv_fields_2_0= ruleObjectField )
            	    // InternalGraphQL.g:1594:5: lv_fields_2_0= ruleObjectField
            	    {

            	    					newCompositeNode(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop32;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGraphQL.g:1619:1: entryRuleObjectField returns [EObject current=null] : iv_ruleObjectField= ruleObjectField EOF ;
    public final EObject entryRuleObjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectField = null;


        try {
            // InternalGraphQL.g:1619:52: (iv_ruleObjectField= ruleObjectField EOF )
            // InternalGraphQL.g:1620:2: iv_ruleObjectField= ruleObjectField EOF
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
    // InternalGraphQL.g:1626:1: ruleObjectField returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) ;
    public final EObject ruleObjectField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1632:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) ) )
            // InternalGraphQL.g:1633:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            {
            // InternalGraphQL.g:1633:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) ) )
            // InternalGraphQL.g:1634:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstValue ) )
            {
            // InternalGraphQL.g:1634:3: ( (otherlv_0= RULE_NAME ) )
            // InternalGraphQL.g:1635:4: (otherlv_0= RULE_NAME )
            {
            // InternalGraphQL.g:1635:4: (otherlv_0= RULE_NAME )
            // InternalGraphQL.g:1636:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFieldRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectFieldAccess().getNameFieldDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_1());
            		
            // InternalGraphQL.g:1651:3: ( (lv_value_2_0= ruleConstValue ) )
            // InternalGraphQL.g:1652:4: (lv_value_2_0= ruleConstValue )
            {
            // InternalGraphQL.g:1652:4: (lv_value_2_0= ruleConstValue )
            // InternalGraphQL.g:1653:5: lv_value_2_0= ruleConstValue
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
    // InternalGraphQL.g:1674:1: entryRuleConstValue returns [EObject current=null] : iv_ruleConstValue= ruleConstValue EOF ;
    public final EObject entryRuleConstValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstValue = null;


        try {
            // InternalGraphQL.g:1674:51: (iv_ruleConstValue= ruleConstValue EOF )
            // InternalGraphQL.g:1675:2: iv_ruleConstValue= ruleConstValue EOF
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
    // InternalGraphQL.g:1681:1: ruleConstValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_EnumValue_4= ruleEnumValue | this_ListValue_5= ruleListValue | this_ObjectValue_6= ruleObjectValue ) ;
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
            // InternalGraphQL.g:1687:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_EnumValue_4= ruleEnumValue | this_ListValue_5= ruleListValue | this_ObjectValue_6= ruleObjectValue ) )
            // InternalGraphQL.g:1688:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_EnumValue_4= ruleEnumValue | this_ListValue_5= ruleListValue | this_ObjectValue_6= ruleObjectValue )
            {
            // InternalGraphQL.g:1688:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BooleanValue_2= ruleBooleanValue | this_NullValue_3= ruleNullValue | this_EnumValue_4= ruleEnumValue | this_ListValue_5= ruleListValue | this_ObjectValue_6= ruleObjectValue )
            int alt33=7;
            switch ( input.LA(1) ) {
            case RULE_INT_VALUE:
                {
                alt33=1;
                }
                break;
            case RULE_FLOAT_VALUE:
                {
                alt33=2;
                }
                break;
            case 31:
            case 32:
                {
                alt33=3;
                }
                break;
            case 30:
                {
                alt33=4;
                }
                break;
            case RULE_NAME:
                {
                alt33=5;
                }
                break;
            case 28:
                {
                alt33=6;
                }
                break;
            case 14:
                {
                alt33=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalGraphQL.g:1689:3: this_IntValue_0= ruleIntValue
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
                    // InternalGraphQL.g:1698:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalGraphQL.g:1707:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalGraphQL.g:1716:3: this_NullValue_3= ruleNullValue
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
                    // InternalGraphQL.g:1725:3: this_EnumValue_4= ruleEnumValue
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
                    // InternalGraphQL.g:1734:3: this_ListValue_5= ruleListValue
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
                    // InternalGraphQL.g:1743:3: this_ObjectValue_6= ruleObjectValue
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
    // InternalGraphQL.g:1755:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalGraphQL.g:1755:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalGraphQL.g:1756:2: iv_ruleListValue= ruleListValue EOF
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
    // InternalGraphQL.g:1762:1: ruleListValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:1768:2: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' ) )
            // InternalGraphQL.g:1769:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' )
            {
            // InternalGraphQL.g:1769:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']' )
            // InternalGraphQL.g:1770:3: () otherlv_1= '[' ( (lv_values_2_0= ruleConstValue ) )* otherlv_3= ']'
            {
            // InternalGraphQL.g:1770:3: ()
            // InternalGraphQL.g:1771:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListValueAccess().getListValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalGraphQL.g:1781:3: ( (lv_values_2_0= ruleConstValue ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_NAME && LA34_0<=RULE_FLOAT_VALUE)||LA34_0==14||LA34_0==28||(LA34_0>=30 && LA34_0<=32)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGraphQL.g:1782:4: (lv_values_2_0= ruleConstValue )
            	    {
            	    // InternalGraphQL.g:1782:4: (lv_values_2_0= ruleConstValue )
            	    // InternalGraphQL.g:1783:5: lv_values_2_0= ruleConstValue
            	    {

            	    					newCompositeNode(grammarAccess.getListValueAccess().getValuesConstValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop34;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "ruleOperationType"
    // InternalGraphQL.g:1808:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGraphQL.g:1814:2: ( ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) ) )
            // InternalGraphQL.g:1815:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            {
            // InternalGraphQL.g:1815:2: ( (enumLiteral_0= 'query' ) | (enumLiteral_1= 'mutation' ) | (enumLiteral_2= 'subscription' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt35=1;
                }
                break;
            case 34:
                {
                alt35=2;
                }
                break;
            case 35:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalGraphQL.g:1816:3: (enumLiteral_0= 'query' )
                    {
                    // InternalGraphQL.g:1816:3: (enumLiteral_0= 'query' )
                    // InternalGraphQL.g:1817:4: enumLiteral_0= 'query'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1824:3: (enumLiteral_1= 'mutation' )
                    {
                    // InternalGraphQL.g:1824:3: (enumLiteral_1= 'mutation' )
                    // InternalGraphQL.g:1825:4: enumLiteral_1= 'mutation'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:1832:3: (enumLiteral_2= 'subscription' )
                    {
                    // InternalGraphQL.g:1832:3: (enumLiteral_2= 'subscription' )
                    // InternalGraphQL.g:1833:4: enumLiteral_2= 'subscription'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003362182L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000E00008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008190L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001D0004070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000001F0004070L});

}