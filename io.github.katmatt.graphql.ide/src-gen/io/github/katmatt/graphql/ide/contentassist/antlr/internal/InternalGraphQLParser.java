package io.github.katmatt.graphql.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import io.github.katmatt.graphql.services.GraphQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_STRING_VALUE", "RULE_ML_STRING_VALUE", "RULE_NAME", "RULE_INT_VALUE", "RULE_FLOAT_VALUE", "RULE_DIRECTIVE_NAME", "RULE_WS", "RULE_SL_COMMENT", "RULE_COMMA", "RULE_STRING_CHARACTER", "'true'", "'false'", "'QUERY'", "'MUTATION'", "'SUBSCRIPTION'", "'FIELD'", "'FRAGMENT_DEFINITION'", "'FRAGMENT_SPREAD'", "'INLINE_FRAGMENT'", "'VARIABLE_DEFINITION'", "'SCHEMA'", "'SCALAR'", "'OBJECT'", "'FIELD_DEFINITION'", "'ARGUMENT_DEFINITION'", "'INTERFACE'", "'UNION'", "'ENUM'", "'ENUM_VALUE'", "'INPUT_OBJECT'", "'INPUT_FIELD_DEFINITION'", "'query'", "'mutation'", "'subscription'", "'schema'", "'{'", "'}'", "':'", "'scalar'", "'type'", "'implements'", "'&'", "'interface'", "'('", "')'", "'union'", "'='", "'|'", "'enum'", "'input'", "'['", "']'", "'directive'", "'on'", "'!'", "'null'", "'repeatable'"
    };
    public static final int RULE_FLOAT_VALUE=8;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_INT_VALUE=7;
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
    public static final int RULE_ML_STRING_VALUE=5;
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
    public static final int RULE_NAME=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_SL_STRING_VALUE=4;
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

    	public void setGrammarAccess(GraphQLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTypeSystemDefinition"
    // InternalGraphQL.g:53:1: entryRuleTypeSystemDefinition : ruleTypeSystemDefinition EOF ;
    public final void entryRuleTypeSystemDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:54:1: ( ruleTypeSystemDefinition EOF )
            // InternalGraphQL.g:55:1: ruleTypeSystemDefinition EOF
            {
             before(grammarAccess.getTypeSystemDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeSystemDefinition();

            state._fsp--;

             after(grammarAccess.getTypeSystemDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeSystemDefinition"


    // $ANTLR start "ruleTypeSystemDefinition"
    // InternalGraphQL.g:62:1: ruleTypeSystemDefinition : ( ( rule__TypeSystemDefinition__Alternatives )* ) ;
    public final void ruleTypeSystemDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:66:2: ( ( ( rule__TypeSystemDefinition__Alternatives )* ) )
            // InternalGraphQL.g:67:2: ( ( rule__TypeSystemDefinition__Alternatives )* )
            {
            // InternalGraphQL.g:67:2: ( ( rule__TypeSystemDefinition__Alternatives )* )
            // InternalGraphQL.g:68:3: ( rule__TypeSystemDefinition__Alternatives )*
            {
             before(grammarAccess.getTypeSystemDefinitionAccess().getAlternatives()); 
            // InternalGraphQL.g:69:3: ( rule__TypeSystemDefinition__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SL_STRING_VALUE && LA1_0<=RULE_ML_STRING_VALUE)||LA1_0==38||(LA1_0>=42 && LA1_0<=43)||LA1_0==46||LA1_0==49||(LA1_0>=52 && LA1_0<=53)||LA1_0==56) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphQL.g:69:4: rule__TypeSystemDefinition__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TypeSystemDefinition__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTypeSystemDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeSystemDefinition"


    // $ANTLR start "entryRuleSchemaDefinition"
    // InternalGraphQL.g:78:1: entryRuleSchemaDefinition : ruleSchemaDefinition EOF ;
    public final void entryRuleSchemaDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:79:1: ( ruleSchemaDefinition EOF )
            // InternalGraphQL.g:80:1: ruleSchemaDefinition EOF
            {
             before(grammarAccess.getSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchemaDefinition"


    // $ANTLR start "ruleSchemaDefinition"
    // InternalGraphQL.g:87:1: ruleSchemaDefinition : ( ( rule__SchemaDefinition__Group__0 ) ) ;
    public final void ruleSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:91:2: ( ( ( rule__SchemaDefinition__Group__0 ) ) )
            // InternalGraphQL.g:92:2: ( ( rule__SchemaDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:92:2: ( ( rule__SchemaDefinition__Group__0 ) )
            // InternalGraphQL.g:93:3: ( rule__SchemaDefinition__Group__0 )
            {
             before(grammarAccess.getSchemaDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:94:3: ( rule__SchemaDefinition__Group__0 )
            // InternalGraphQL.g:94:4: rule__SchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemaDefinition"


    // $ANTLR start "entryRuleRootOperationTypeDefinition"
    // InternalGraphQL.g:103:1: entryRuleRootOperationTypeDefinition : ruleRootOperationTypeDefinition EOF ;
    public final void entryRuleRootOperationTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:104:1: ( ruleRootOperationTypeDefinition EOF )
            // InternalGraphQL.g:105:1: ruleRootOperationTypeDefinition EOF
            {
             before(grammarAccess.getRootOperationTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRootOperationTypeDefinition();

            state._fsp--;

             after(grammarAccess.getRootOperationTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRootOperationTypeDefinition"


    // $ANTLR start "ruleRootOperationTypeDefinition"
    // InternalGraphQL.g:112:1: ruleRootOperationTypeDefinition : ( ( rule__RootOperationTypeDefinition__Group__0 ) ) ;
    public final void ruleRootOperationTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:116:2: ( ( ( rule__RootOperationTypeDefinition__Group__0 ) ) )
            // InternalGraphQL.g:117:2: ( ( rule__RootOperationTypeDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:117:2: ( ( rule__RootOperationTypeDefinition__Group__0 ) )
            // InternalGraphQL.g:118:3: ( rule__RootOperationTypeDefinition__Group__0 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:119:3: ( rule__RootOperationTypeDefinition__Group__0 )
            // InternalGraphQL.g:119:4: rule__RootOperationTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RootOperationTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootOperationTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootOperationTypeDefinition"


    // $ANTLR start "entryRuleTypeDefinition"
    // InternalGraphQL.g:128:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:129:1: ( ruleTypeDefinition EOF )
            // InternalGraphQL.g:130:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // InternalGraphQL.g:137:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Alternatives ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:141:2: ( ( ( rule__TypeDefinition__Alternatives ) ) )
            // InternalGraphQL.g:142:2: ( ( rule__TypeDefinition__Alternatives ) )
            {
            // InternalGraphQL.g:142:2: ( ( rule__TypeDefinition__Alternatives ) )
            // InternalGraphQL.g:143:3: ( rule__TypeDefinition__Alternatives )
            {
             before(grammarAccess.getTypeDefinitionAccess().getAlternatives()); 
            // InternalGraphQL.g:144:3: ( rule__TypeDefinition__Alternatives )
            // InternalGraphQL.g:144:4: rule__TypeDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleScalarTypeDefinition"
    // InternalGraphQL.g:153:1: entryRuleScalarTypeDefinition : ruleScalarTypeDefinition EOF ;
    public final void entryRuleScalarTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:154:1: ( ruleScalarTypeDefinition EOF )
            // InternalGraphQL.g:155:1: ruleScalarTypeDefinition EOF
            {
             before(grammarAccess.getScalarTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleScalarTypeDefinition();

            state._fsp--;

             after(grammarAccess.getScalarTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScalarTypeDefinition"


    // $ANTLR start "ruleScalarTypeDefinition"
    // InternalGraphQL.g:162:1: ruleScalarTypeDefinition : ( ( rule__ScalarTypeDefinition__Group__0 ) ) ;
    public final void ruleScalarTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:166:2: ( ( ( rule__ScalarTypeDefinition__Group__0 ) ) )
            // InternalGraphQL.g:167:2: ( ( rule__ScalarTypeDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:167:2: ( ( rule__ScalarTypeDefinition__Group__0 ) )
            // InternalGraphQL.g:168:3: ( rule__ScalarTypeDefinition__Group__0 )
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:169:3: ( rule__ScalarTypeDefinition__Group__0 )
            // InternalGraphQL.g:169:4: rule__ScalarTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScalarTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScalarTypeDefinition"


    // $ANTLR start "entryRuleObjectTypeDefinition"
    // InternalGraphQL.g:178:1: entryRuleObjectTypeDefinition : ruleObjectTypeDefinition EOF ;
    public final void entryRuleObjectTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:179:1: ( ruleObjectTypeDefinition EOF )
            // InternalGraphQL.g:180:1: ruleObjectTypeDefinition EOF
            {
             before(grammarAccess.getObjectTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectTypeDefinition();

            state._fsp--;

             after(grammarAccess.getObjectTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectTypeDefinition"


    // $ANTLR start "ruleObjectTypeDefinition"
    // InternalGraphQL.g:187:1: ruleObjectTypeDefinition : ( ( rule__ObjectTypeDefinition__Group__0 ) ) ;
    public final void ruleObjectTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:191:2: ( ( ( rule__ObjectTypeDefinition__Group__0 ) ) )
            // InternalGraphQL.g:192:2: ( ( rule__ObjectTypeDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:192:2: ( ( rule__ObjectTypeDefinition__Group__0 ) )
            // InternalGraphQL.g:193:3: ( rule__ObjectTypeDefinition__Group__0 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:194:3: ( rule__ObjectTypeDefinition__Group__0 )
            // InternalGraphQL.g:194:4: rule__ObjectTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectTypeDefinition"


    // $ANTLR start "entryRuleInterfaceDefinition"
    // InternalGraphQL.g:203:1: entryRuleInterfaceDefinition : ruleInterfaceDefinition EOF ;
    public final void entryRuleInterfaceDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:204:1: ( ruleInterfaceDefinition EOF )
            // InternalGraphQL.g:205:1: ruleInterfaceDefinition EOF
            {
             before(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceDefinition();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // InternalGraphQL.g:212:1: ruleInterfaceDefinition : ( ( rule__InterfaceDefinition__Group__0 ) ) ;
    public final void ruleInterfaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:216:2: ( ( ( rule__InterfaceDefinition__Group__0 ) ) )
            // InternalGraphQL.g:217:2: ( ( rule__InterfaceDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:217:2: ( ( rule__InterfaceDefinition__Group__0 ) )
            // InternalGraphQL.g:218:3: ( rule__InterfaceDefinition__Group__0 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:219:3: ( rule__InterfaceDefinition__Group__0 )
            // InternalGraphQL.g:219:4: rule__InterfaceDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleFieldDefinition"
    // InternalGraphQL.g:228:1: entryRuleFieldDefinition : ruleFieldDefinition EOF ;
    public final void entryRuleFieldDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:229:1: ( ruleFieldDefinition EOF )
            // InternalGraphQL.g:230:1: ruleFieldDefinition EOF
            {
             before(grammarAccess.getFieldDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldDefinition();

            state._fsp--;

             after(grammarAccess.getFieldDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldDefinition"


    // $ANTLR start "ruleFieldDefinition"
    // InternalGraphQL.g:237:1: ruleFieldDefinition : ( ( rule__FieldDefinition__Group__0 ) ) ;
    public final void ruleFieldDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:241:2: ( ( ( rule__FieldDefinition__Group__0 ) ) )
            // InternalGraphQL.g:242:2: ( ( rule__FieldDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:242:2: ( ( rule__FieldDefinition__Group__0 ) )
            // InternalGraphQL.g:243:3: ( rule__FieldDefinition__Group__0 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:244:3: ( rule__FieldDefinition__Group__0 )
            // InternalGraphQL.g:244:4: rule__FieldDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldDefinition"


    // $ANTLR start "entryRuleUnionTypeDefinition"
    // InternalGraphQL.g:253:1: entryRuleUnionTypeDefinition : ruleUnionTypeDefinition EOF ;
    public final void entryRuleUnionTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:254:1: ( ruleUnionTypeDefinition EOF )
            // InternalGraphQL.g:255:1: ruleUnionTypeDefinition EOF
            {
             before(grammarAccess.getUnionTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnionTypeDefinition();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnionTypeDefinition"


    // $ANTLR start "ruleUnionTypeDefinition"
    // InternalGraphQL.g:262:1: ruleUnionTypeDefinition : ( ( rule__UnionTypeDefinition__Group__0 ) ) ;
    public final void ruleUnionTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:266:2: ( ( ( rule__UnionTypeDefinition__Group__0 ) ) )
            // InternalGraphQL.g:267:2: ( ( rule__UnionTypeDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:267:2: ( ( rule__UnionTypeDefinition__Group__0 ) )
            // InternalGraphQL.g:268:3: ( rule__UnionTypeDefinition__Group__0 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:269:3: ( rule__UnionTypeDefinition__Group__0 )
            // InternalGraphQL.g:269:4: rule__UnionTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnionTypeDefinition"


    // $ANTLR start "entryRuleEnumTypeDefinition"
    // InternalGraphQL.g:278:1: entryRuleEnumTypeDefinition : ruleEnumTypeDefinition EOF ;
    public final void entryRuleEnumTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:279:1: ( ruleEnumTypeDefinition EOF )
            // InternalGraphQL.g:280:1: ruleEnumTypeDefinition EOF
            {
             before(grammarAccess.getEnumTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumTypeDefinition();

            state._fsp--;

             after(grammarAccess.getEnumTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumTypeDefinition"


    // $ANTLR start "ruleEnumTypeDefinition"
    // InternalGraphQL.g:287:1: ruleEnumTypeDefinition : ( ( rule__EnumTypeDefinition__Group__0 ) ) ;
    public final void ruleEnumTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:291:2: ( ( ( rule__EnumTypeDefinition__Group__0 ) ) )
            // InternalGraphQL.g:292:2: ( ( rule__EnumTypeDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:292:2: ( ( rule__EnumTypeDefinition__Group__0 ) )
            // InternalGraphQL.g:293:3: ( rule__EnumTypeDefinition__Group__0 )
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:294:3: ( rule__EnumTypeDefinition__Group__0 )
            // InternalGraphQL.g:294:4: rule__EnumTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumTypeDefinition"


    // $ANTLR start "entryRuleEnumValueDefinition"
    // InternalGraphQL.g:303:1: entryRuleEnumValueDefinition : ruleEnumValueDefinition EOF ;
    public final void entryRuleEnumValueDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:304:1: ( ruleEnumValueDefinition EOF )
            // InternalGraphQL.g:305:1: ruleEnumValueDefinition EOF
            {
             before(grammarAccess.getEnumValueDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumValueDefinition();

            state._fsp--;

             after(grammarAccess.getEnumValueDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumValueDefinition"


    // $ANTLR start "ruleEnumValueDefinition"
    // InternalGraphQL.g:312:1: ruleEnumValueDefinition : ( ( rule__EnumValueDefinition__Group__0 ) ) ;
    public final void ruleEnumValueDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:316:2: ( ( ( rule__EnumValueDefinition__Group__0 ) ) )
            // InternalGraphQL.g:317:2: ( ( rule__EnumValueDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:317:2: ( ( rule__EnumValueDefinition__Group__0 ) )
            // InternalGraphQL.g:318:3: ( rule__EnumValueDefinition__Group__0 )
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:319:3: ( rule__EnumValueDefinition__Group__0 )
            // InternalGraphQL.g:319:4: rule__EnumValueDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumValueDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValueDefinition"


    // $ANTLR start "entryRuleInputObjectTypeDefinition"
    // InternalGraphQL.g:328:1: entryRuleInputObjectTypeDefinition : ruleInputObjectTypeDefinition EOF ;
    public final void entryRuleInputObjectTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:329:1: ( ruleInputObjectTypeDefinition EOF )
            // InternalGraphQL.g:330:1: ruleInputObjectTypeDefinition EOF
            {
             before(grammarAccess.getInputObjectTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleInputObjectTypeDefinition();

            state._fsp--;

             after(grammarAccess.getInputObjectTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputObjectTypeDefinition"


    // $ANTLR start "ruleInputObjectTypeDefinition"
    // InternalGraphQL.g:337:1: ruleInputObjectTypeDefinition : ( ( rule__InputObjectTypeDefinition__Group__0 ) ) ;
    public final void ruleInputObjectTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:341:2: ( ( ( rule__InputObjectTypeDefinition__Group__0 ) ) )
            // InternalGraphQL.g:342:2: ( ( rule__InputObjectTypeDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:342:2: ( ( rule__InputObjectTypeDefinition__Group__0 ) )
            // InternalGraphQL.g:343:3: ( rule__InputObjectTypeDefinition__Group__0 )
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:344:3: ( rule__InputObjectTypeDefinition__Group__0 )
            // InternalGraphQL.g:344:4: rule__InputObjectTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputObjectTypeDefinition"


    // $ANTLR start "entryRuleInputValueDefinition"
    // InternalGraphQL.g:353:1: entryRuleInputValueDefinition : ruleInputValueDefinition EOF ;
    public final void entryRuleInputValueDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:354:1: ( ruleInputValueDefinition EOF )
            // InternalGraphQL.g:355:1: ruleInputValueDefinition EOF
            {
             before(grammarAccess.getInputValueDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleInputValueDefinition();

            state._fsp--;

             after(grammarAccess.getInputValueDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputValueDefinition"


    // $ANTLR start "ruleInputValueDefinition"
    // InternalGraphQL.g:362:1: ruleInputValueDefinition : ( ( rule__InputValueDefinition__Group__0 ) ) ;
    public final void ruleInputValueDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:366:2: ( ( ( rule__InputValueDefinition__Group__0 ) ) )
            // InternalGraphQL.g:367:2: ( ( rule__InputValueDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:367:2: ( ( rule__InputValueDefinition__Group__0 ) )
            // InternalGraphQL.g:368:3: ( rule__InputValueDefinition__Group__0 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:369:3: ( rule__InputValueDefinition__Group__0 )
            // InternalGraphQL.g:369:4: rule__InputValueDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputValueDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputValueDefinition"


    // $ANTLR start "entryRuleType"
    // InternalGraphQL.g:378:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGraphQL.g:379:1: ( ruleType EOF )
            // InternalGraphQL.g:380:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGraphQL.g:387:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:391:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGraphQL.g:392:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGraphQL.g:392:2: ( ( rule__Type__Alternatives ) )
            // InternalGraphQL.g:393:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalGraphQL.g:394:3: ( rule__Type__Alternatives )
            // InternalGraphQL.g:394:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleNamedType"
    // InternalGraphQL.g:403:1: entryRuleNamedType : ruleNamedType EOF ;
    public final void entryRuleNamedType() throws RecognitionException {
        try {
            // InternalGraphQL.g:404:1: ( ruleNamedType EOF )
            // InternalGraphQL.g:405:1: ruleNamedType EOF
            {
             before(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedType();

            state._fsp--;

             after(grammarAccess.getNamedTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // InternalGraphQL.g:412:1: ruleNamedType : ( ( rule__NamedType__Group__0 ) ) ;
    public final void ruleNamedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:416:2: ( ( ( rule__NamedType__Group__0 ) ) )
            // InternalGraphQL.g:417:2: ( ( rule__NamedType__Group__0 ) )
            {
            // InternalGraphQL.g:417:2: ( ( rule__NamedType__Group__0 ) )
            // InternalGraphQL.g:418:3: ( rule__NamedType__Group__0 )
            {
             before(grammarAccess.getNamedTypeAccess().getGroup()); 
            // InternalGraphQL.g:419:3: ( rule__NamedType__Group__0 )
            // InternalGraphQL.g:419:4: rule__NamedType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleListType"
    // InternalGraphQL.g:428:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // InternalGraphQL.g:429:1: ( ruleListType EOF )
            // InternalGraphQL.g:430:1: ruleListType EOF
            {
             before(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getListTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalGraphQL.g:437:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:441:2: ( ( ( rule__ListType__Group__0 ) ) )
            // InternalGraphQL.g:442:2: ( ( rule__ListType__Group__0 ) )
            {
            // InternalGraphQL.g:442:2: ( ( rule__ListType__Group__0 ) )
            // InternalGraphQL.g:443:3: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // InternalGraphQL.g:444:3: ( rule__ListType__Group__0 )
            // InternalGraphQL.g:444:4: rule__ListType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleIntValue"
    // InternalGraphQL.g:453:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:454:1: ( ruleIntValue EOF )
            // InternalGraphQL.g:455:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalGraphQL.g:462:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:466:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalGraphQL.g:467:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:467:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalGraphQL.g:468:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:469:3: ( rule__IntValue__ValueAssignment )
            // InternalGraphQL.g:469:4: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalGraphQL.g:478:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:479:1: ( ruleFloatValue EOF )
            // InternalGraphQL.g:480:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalGraphQL.g:487:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:491:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalGraphQL.g:492:2: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:492:2: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalGraphQL.g:493:3: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:494:3: ( rule__FloatValue__ValueAssignment )
            // InternalGraphQL.g:494:4: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFloatValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalGraphQL.g:503:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:504:1: ( ruleNullValue EOF )
            // InternalGraphQL.g:505:1: ruleNullValue EOF
            {
             before(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNullValue();

            state._fsp--;

             after(grammarAccess.getNullValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalGraphQL.g:512:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:516:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalGraphQL.g:517:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:517:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalGraphQL.g:518:3: ( rule__NullValue__ValueAssignment )
            {
             before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:519:3: ( rule__NullValue__ValueAssignment )
            // InternalGraphQL.g:519:4: rule__NullValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NullValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalGraphQL.g:528:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:529:1: ( ruleStringValue EOF )
            // InternalGraphQL.g:530:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalGraphQL.g:537:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:541:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGraphQL.g:542:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:542:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGraphQL.g:543:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:544:3: ( rule__StringValue__ValueAssignment )
            // InternalGraphQL.g:544:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalGraphQL.g:553:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:554:1: ( ruleBooleanValue EOF )
            // InternalGraphQL.g:555:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalGraphQL.g:562:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:566:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalGraphQL.g:567:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:567:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalGraphQL.g:568:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:569:3: ( rule__BooleanValue__ValueAssignment )
            // InternalGraphQL.g:569:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEnumValue"
    // InternalGraphQL.g:578:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:579:1: ( ruleEnumValue EOF )
            // InternalGraphQL.g:580:1: ruleEnumValue EOF
            {
             before(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalGraphQL.g:587:1: ruleEnumValue : ( ( rule__EnumValue__ValueAssignment ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:591:2: ( ( ( rule__EnumValue__ValueAssignment ) ) )
            // InternalGraphQL.g:592:2: ( ( rule__EnumValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:592:2: ( ( rule__EnumValue__ValueAssignment ) )
            // InternalGraphQL.g:593:3: ( rule__EnumValue__ValueAssignment )
            {
             before(grammarAccess.getEnumValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:594:3: ( rule__EnumValue__ValueAssignment )
            // InternalGraphQL.g:594:4: rule__EnumValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalGraphQL.g:603:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:604:1: ( ruleObjectValue EOF )
            // InternalGraphQL.g:605:1: ruleObjectValue EOF
            {
             before(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectValue();

            state._fsp--;

             after(grammarAccess.getObjectValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalGraphQL.g:612:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:616:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGraphQL.g:617:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGraphQL.g:617:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGraphQL.g:618:3: ( rule__ObjectValue__Group__0 )
            {
             before(grammarAccess.getObjectValueAccess().getGroup()); 
            // InternalGraphQL.g:619:3: ( rule__ObjectValue__Group__0 )
            // InternalGraphQL.g:619:4: rule__ObjectValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleObjectField"
    // InternalGraphQL.g:628:1: entryRuleObjectField : ruleObjectField EOF ;
    public final void entryRuleObjectField() throws RecognitionException {
        try {
            // InternalGraphQL.g:629:1: ( ruleObjectField EOF )
            // InternalGraphQL.g:630:1: ruleObjectField EOF
            {
             before(grammarAccess.getObjectFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectField();

            state._fsp--;

             after(grammarAccess.getObjectFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectField"


    // $ANTLR start "ruleObjectField"
    // InternalGraphQL.g:637:1: ruleObjectField : ( ( rule__ObjectField__Group__0 ) ) ;
    public final void ruleObjectField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:641:2: ( ( ( rule__ObjectField__Group__0 ) ) )
            // InternalGraphQL.g:642:2: ( ( rule__ObjectField__Group__0 ) )
            {
            // InternalGraphQL.g:642:2: ( ( rule__ObjectField__Group__0 ) )
            // InternalGraphQL.g:643:3: ( rule__ObjectField__Group__0 )
            {
             before(grammarAccess.getObjectFieldAccess().getGroup()); 
            // InternalGraphQL.g:644:3: ( rule__ObjectField__Group__0 )
            // InternalGraphQL.g:644:4: rule__ObjectField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectField"


    // $ANTLR start "entryRuleConstValue"
    // InternalGraphQL.g:653:1: entryRuleConstValue : ruleConstValue EOF ;
    public final void entryRuleConstValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:654:1: ( ruleConstValue EOF )
            // InternalGraphQL.g:655:1: ruleConstValue EOF
            {
             before(grammarAccess.getConstValueRule()); 
            pushFollow(FOLLOW_1);
            ruleConstValue();

            state._fsp--;

             after(grammarAccess.getConstValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstValue"


    // $ANTLR start "ruleConstValue"
    // InternalGraphQL.g:662:1: ruleConstValue : ( ( rule__ConstValue__Alternatives ) ) ;
    public final void ruleConstValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:666:2: ( ( ( rule__ConstValue__Alternatives ) ) )
            // InternalGraphQL.g:667:2: ( ( rule__ConstValue__Alternatives ) )
            {
            // InternalGraphQL.g:667:2: ( ( rule__ConstValue__Alternatives ) )
            // InternalGraphQL.g:668:3: ( rule__ConstValue__Alternatives )
            {
             before(grammarAccess.getConstValueAccess().getAlternatives()); 
            // InternalGraphQL.g:669:3: ( rule__ConstValue__Alternatives )
            // InternalGraphQL.g:669:4: rule__ConstValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstValue"


    // $ANTLR start "entryRuleListValue"
    // InternalGraphQL.g:678:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:679:1: ( ruleListValue EOF )
            // InternalGraphQL.g:680:1: ruleListValue EOF
            {
             before(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            ruleListValue();

            state._fsp--;

             after(grammarAccess.getListValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalGraphQL.g:687:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:691:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // InternalGraphQL.g:692:2: ( ( rule__ListValue__Group__0 ) )
            {
            // InternalGraphQL.g:692:2: ( ( rule__ListValue__Group__0 ) )
            // InternalGraphQL.g:693:3: ( rule__ListValue__Group__0 )
            {
             before(grammarAccess.getListValueAccess().getGroup()); 
            // InternalGraphQL.g:694:3: ( rule__ListValue__Group__0 )
            // InternalGraphQL.g:694:4: rule__ListValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleDirectiveDefinition"
    // InternalGraphQL.g:703:1: entryRuleDirectiveDefinition : ruleDirectiveDefinition EOF ;
    public final void entryRuleDirectiveDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:704:1: ( ruleDirectiveDefinition EOF )
            // InternalGraphQL.g:705:1: ruleDirectiveDefinition EOF
            {
             before(grammarAccess.getDirectiveDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectiveDefinition();

            state._fsp--;

             after(grammarAccess.getDirectiveDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectiveDefinition"


    // $ANTLR start "ruleDirectiveDefinition"
    // InternalGraphQL.g:712:1: ruleDirectiveDefinition : ( ( rule__DirectiveDefinition__Group__0 ) ) ;
    public final void ruleDirectiveDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:716:2: ( ( ( rule__DirectiveDefinition__Group__0 ) ) )
            // InternalGraphQL.g:717:2: ( ( rule__DirectiveDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:717:2: ( ( rule__DirectiveDefinition__Group__0 ) )
            // InternalGraphQL.g:718:3: ( rule__DirectiveDefinition__Group__0 )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:719:3: ( rule__DirectiveDefinition__Group__0 )
            // InternalGraphQL.g:719:4: rule__DirectiveDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectiveDefinition"


    // $ANTLR start "entryRuleDirective"
    // InternalGraphQL.g:728:1: entryRuleDirective : ruleDirective EOF ;
    public final void entryRuleDirective() throws RecognitionException {
        try {
            // InternalGraphQL.g:729:1: ( ruleDirective EOF )
            // InternalGraphQL.g:730:1: ruleDirective EOF
            {
             before(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getDirectiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalGraphQL.g:737:1: ruleDirective : ( ( rule__Directive__Group__0 ) ) ;
    public final void ruleDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:741:2: ( ( ( rule__Directive__Group__0 ) ) )
            // InternalGraphQL.g:742:2: ( ( rule__Directive__Group__0 ) )
            {
            // InternalGraphQL.g:742:2: ( ( rule__Directive__Group__0 ) )
            // InternalGraphQL.g:743:3: ( rule__Directive__Group__0 )
            {
             before(grammarAccess.getDirectiveAccess().getGroup()); 
            // InternalGraphQL.g:744:3: ( rule__Directive__Group__0 )
            // InternalGraphQL.g:744:4: rule__Directive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Directive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleArgument"
    // InternalGraphQL.g:753:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalGraphQL.g:754:1: ( ruleArgument EOF )
            // InternalGraphQL.g:755:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalGraphQL.g:762:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:766:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalGraphQL.g:767:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalGraphQL.g:767:2: ( ( rule__Argument__Group__0 ) )
            // InternalGraphQL.g:768:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalGraphQL.g:769:3: ( rule__Argument__Group__0 )
            // InternalGraphQL.g:769:4: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "ruleDirectiveLocation"
    // InternalGraphQL.g:778:1: ruleDirectiveLocation : ( ( rule__DirectiveLocation__Alternatives ) ) ;
    public final void ruleDirectiveLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:782:1: ( ( ( rule__DirectiveLocation__Alternatives ) ) )
            // InternalGraphQL.g:783:2: ( ( rule__DirectiveLocation__Alternatives ) )
            {
            // InternalGraphQL.g:783:2: ( ( rule__DirectiveLocation__Alternatives ) )
            // InternalGraphQL.g:784:3: ( rule__DirectiveLocation__Alternatives )
            {
             before(grammarAccess.getDirectiveLocationAccess().getAlternatives()); 
            // InternalGraphQL.g:785:3: ( rule__DirectiveLocation__Alternatives )
            // InternalGraphQL.g:785:4: rule__DirectiveLocation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveLocation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveLocationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectiveLocation"


    // $ANTLR start "ruleOperationType"
    // InternalGraphQL.g:794:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:798:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalGraphQL.g:799:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalGraphQL.g:799:2: ( ( rule__OperationType__Alternatives ) )
            // InternalGraphQL.g:800:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalGraphQL.g:801:3: ( rule__OperationType__Alternatives )
            // InternalGraphQL.g:801:4: rule__OperationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "rule__TypeSystemDefinition__Alternatives"
    // InternalGraphQL.g:809:1: rule__TypeSystemDefinition__Alternatives : ( ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) ) | ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) ) | ( ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 ) ) );
    public final void rule__TypeSystemDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:813:1: ( ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) ) | ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) ) | ( ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_SL_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 56:
                    {
                    alt2=3;
                    }
                    break;
                case 42:
                case 43:
                case 46:
                case 49:
                case 52:
                case 53:
                    {
                    alt2=2;
                    }
                    break;
                case 38:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ML_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt2=1;
                    }
                    break;
                case 42:
                case 43:
                case 46:
                case 49:
                case 52:
                case 53:
                    {
                    alt2=2;
                    }
                    break;
                case 56:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                alt2=1;
                }
                break;
            case 42:
            case 43:
            case 46:
            case 49:
            case 52:
            case 53:
                {
                alt2=2;
                }
                break;
            case 56:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGraphQL.g:814:2: ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) )
                    {
                    // InternalGraphQL.g:814:2: ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) )
                    // InternalGraphQL.g:815:3: ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsAssignment_0()); 
                    // InternalGraphQL.g:816:3: ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 )
                    // InternalGraphQL.g:816:4: rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:820:2: ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) )
                    {
                    // InternalGraphQL.g:820:2: ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) )
                    // InternalGraphQL.g:821:3: ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsAssignment_1()); 
                    // InternalGraphQL.g:822:3: ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 )
                    // InternalGraphQL.g:822:4: rule__TypeSystemDefinition__TypeDefinitionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSystemDefinition__TypeDefinitionsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:826:2: ( ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 ) )
                    {
                    // InternalGraphQL.g:826:2: ( ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 ) )
                    // InternalGraphQL.g:827:3: ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getDirectiveDefinitionsAssignment_2()); 
                    // InternalGraphQL.g:828:3: ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 )
                    // InternalGraphQL.g:828:4: rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeSystemDefinitionAccess().getDirectiveDefinitionsAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSystemDefinition__Alternatives"


    // $ANTLR start "rule__TypeDefinition__Alternatives"
    // InternalGraphQL.g:836:1: rule__TypeDefinition__Alternatives : ( ( ruleScalarTypeDefinition ) | ( ruleObjectTypeDefinition ) | ( ruleInterfaceDefinition ) | ( ruleUnionTypeDefinition ) | ( ruleEnumTypeDefinition ) | ( ruleInputObjectTypeDefinition ) );
    public final void rule__TypeDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:840:1: ( ( ruleScalarTypeDefinition ) | ( ruleObjectTypeDefinition ) | ( ruleInterfaceDefinition ) | ( ruleUnionTypeDefinition ) | ( ruleEnumTypeDefinition ) | ( ruleInputObjectTypeDefinition ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_SL_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt3=4;
                    }
                    break;
                case 53:
                    {
                    alt3=6;
                    }
                    break;
                case 52:
                    {
                    alt3=5;
                    }
                    break;
                case 43:
                    {
                    alt3=2;
                    }
                    break;
                case 46:
                    {
                    alt3=3;
                    }
                    break;
                case 42:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ML_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 46:
                    {
                    alt3=3;
                    }
                    break;
                case 42:
                    {
                    alt3=1;
                    }
                    break;
                case 49:
                    {
                    alt3=4;
                    }
                    break;
                case 53:
                    {
                    alt3=6;
                    }
                    break;
                case 52:
                    {
                    alt3=5;
                    }
                    break;
                case 43:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case 42:
                {
                alt3=1;
                }
                break;
            case 43:
                {
                alt3=2;
                }
                break;
            case 46:
                {
                alt3=3;
                }
                break;
            case 49:
                {
                alt3=4;
                }
                break;
            case 52:
                {
                alt3=5;
                }
                break;
            case 53:
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
                    // InternalGraphQL.g:841:2: ( ruleScalarTypeDefinition )
                    {
                    // InternalGraphQL.g:841:2: ( ruleScalarTypeDefinition )
                    // InternalGraphQL.g:842:3: ruleScalarTypeDefinition
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getScalarTypeDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScalarTypeDefinition();

                    state._fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getScalarTypeDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:847:2: ( ruleObjectTypeDefinition )
                    {
                    // InternalGraphQL.g:847:2: ( ruleObjectTypeDefinition )
                    // InternalGraphQL.g:848:3: ruleObjectTypeDefinition
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getObjectTypeDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectTypeDefinition();

                    state._fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getObjectTypeDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:853:2: ( ruleInterfaceDefinition )
                    {
                    // InternalGraphQL.g:853:2: ( ruleInterfaceDefinition )
                    // InternalGraphQL.g:854:3: ruleInterfaceDefinition
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getInterfaceDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfaceDefinition();

                    state._fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getInterfaceDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:859:2: ( ruleUnionTypeDefinition )
                    {
                    // InternalGraphQL.g:859:2: ( ruleUnionTypeDefinition )
                    // InternalGraphQL.g:860:3: ruleUnionTypeDefinition
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getUnionTypeDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleUnionTypeDefinition();

                    state._fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getUnionTypeDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:865:2: ( ruleEnumTypeDefinition )
                    {
                    // InternalGraphQL.g:865:2: ( ruleEnumTypeDefinition )
                    // InternalGraphQL.g:866:3: ruleEnumTypeDefinition
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getEnumTypeDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumTypeDefinition();

                    state._fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getEnumTypeDefinitionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:871:2: ( ruleInputObjectTypeDefinition )
                    {
                    // InternalGraphQL.g:871:2: ( ruleInputObjectTypeDefinition )
                    // InternalGraphQL.g:872:3: ruleInputObjectTypeDefinition
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getInputObjectTypeDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleInputObjectTypeDefinition();

                    state._fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getInputObjectTypeDefinitionParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDefinition__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGraphQL.g:881:1: rule__Type__Alternatives : ( ( ruleNamedType ) | ( ruleListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:885:1: ( ( ruleNamedType ) | ( ruleListType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==54) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphQL.g:886:2: ( ruleNamedType )
                    {
                    // InternalGraphQL.g:886:2: ( ruleNamedType )
                    // InternalGraphQL.g:887:3: ruleNamedType
                    {
                     before(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:892:2: ( ruleListType )
                    {
                    // InternalGraphQL.g:892:2: ( ruleListType )
                    // InternalGraphQL.g:893:3: ruleListType
                    {
                     before(grammarAccess.getTypeAccess().getListTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getListTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__StringValue__ValueAlternatives_0"
    // InternalGraphQL.g:902:1: rule__StringValue__ValueAlternatives_0 : ( ( RULE_SL_STRING_VALUE ) | ( RULE_ML_STRING_VALUE ) );
    public final void rule__StringValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:906:1: ( ( RULE_SL_STRING_VALUE ) | ( RULE_ML_STRING_VALUE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SL_STRING_VALUE) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ML_STRING_VALUE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphQL.g:907:2: ( RULE_SL_STRING_VALUE )
                    {
                    // InternalGraphQL.g:907:2: ( RULE_SL_STRING_VALUE )
                    // InternalGraphQL.g:908:3: RULE_SL_STRING_VALUE
                    {
                     before(grammarAccess.getStringValueAccess().getValueSL_STRING_VALUETerminalRuleCall_0_0()); 
                    match(input,RULE_SL_STRING_VALUE,FOLLOW_2); 
                     after(grammarAccess.getStringValueAccess().getValueSL_STRING_VALUETerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:913:2: ( RULE_ML_STRING_VALUE )
                    {
                    // InternalGraphQL.g:913:2: ( RULE_ML_STRING_VALUE )
                    // InternalGraphQL.g:914:3: RULE_ML_STRING_VALUE
                    {
                     before(grammarAccess.getStringValueAccess().getValueML_STRING_VALUETerminalRuleCall_0_1()); 
                    match(input,RULE_ML_STRING_VALUE,FOLLOW_2); 
                     after(grammarAccess.getStringValueAccess().getValueML_STRING_VALUETerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAlternatives_0"


    // $ANTLR start "rule__BooleanValue__ValueAlternatives_0"
    // InternalGraphQL.g:923:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:927:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphQL.g:928:2: ( 'true' )
                    {
                    // InternalGraphQL.g:928:2: ( 'true' )
                    // InternalGraphQL.g:929:3: 'true'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:934:2: ( 'false' )
                    {
                    // InternalGraphQL.g:934:2: ( 'false' )
                    // InternalGraphQL.g:935:3: 'false'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAlternatives_0"


    // $ANTLR start "rule__ConstValue__Alternatives"
    // InternalGraphQL.g:944:1: rule__ConstValue__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleStringValue ) | ( ruleEnumValue ) | ( ruleListValue ) | ( ruleObjectValue ) );
    public final void rule__ConstValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:948:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleStringValue ) | ( ruleEnumValue ) | ( ruleListValue ) | ( ruleObjectValue ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case RULE_INT_VALUE:
                {
                alt7=1;
                }
                break;
            case RULE_FLOAT_VALUE:
                {
                alt7=2;
                }
                break;
            case 14:
            case 15:
                {
                alt7=3;
                }
                break;
            case 59:
                {
                alt7=4;
                }
                break;
            case RULE_SL_STRING_VALUE:
            case RULE_ML_STRING_VALUE:
                {
                alt7=5;
                }
                break;
            case RULE_NAME:
                {
                alt7=6;
                }
                break;
            case 54:
                {
                alt7=7;
                }
                break;
            case 39:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGraphQL.g:949:2: ( ruleIntValue )
                    {
                    // InternalGraphQL.g:949:2: ( ruleIntValue )
                    // InternalGraphQL.g:950:3: ruleIntValue
                    {
                     before(grammarAccess.getConstValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:955:2: ( ruleFloatValue )
                    {
                    // InternalGraphQL.g:955:2: ( ruleFloatValue )
                    // InternalGraphQL.g:956:3: ruleFloatValue
                    {
                     before(grammarAccess.getConstValueAccess().getFloatValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getFloatValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:961:2: ( ruleBooleanValue )
                    {
                    // InternalGraphQL.g:961:2: ( ruleBooleanValue )
                    // InternalGraphQL.g:962:3: ruleBooleanValue
                    {
                     before(grammarAccess.getConstValueAccess().getBooleanValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getBooleanValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:967:2: ( ruleNullValue )
                    {
                    // InternalGraphQL.g:967:2: ( ruleNullValue )
                    // InternalGraphQL.g:968:3: ruleNullValue
                    {
                     before(grammarAccess.getConstValueAccess().getNullValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNullValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getNullValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:973:2: ( ruleStringValue )
                    {
                    // InternalGraphQL.g:973:2: ( ruleStringValue )
                    // InternalGraphQL.g:974:3: ruleStringValue
                    {
                     before(grammarAccess.getConstValueAccess().getStringValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getStringValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:979:2: ( ruleEnumValue )
                    {
                    // InternalGraphQL.g:979:2: ( ruleEnumValue )
                    // InternalGraphQL.g:980:3: ruleEnumValue
                    {
                     before(grammarAccess.getConstValueAccess().getEnumValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getEnumValueParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:985:2: ( ruleListValue )
                    {
                    // InternalGraphQL.g:985:2: ( ruleListValue )
                    // InternalGraphQL.g:986:3: ruleListValue
                    {
                     before(grammarAccess.getConstValueAccess().getListValueParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleListValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getListValueParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphQL.g:991:2: ( ruleObjectValue )
                    {
                    // InternalGraphQL.g:991:2: ( ruleObjectValue )
                    // InternalGraphQL.g:992:3: ruleObjectValue
                    {
                     before(grammarAccess.getConstValueAccess().getObjectValueParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getObjectValueParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstValue__Alternatives"


    // $ANTLR start "rule__DirectiveLocation__Alternatives"
    // InternalGraphQL.g:1001:1: rule__DirectiveLocation__Alternatives : ( ( ( 'QUERY' ) ) | ( ( 'MUTATION' ) ) | ( ( 'SUBSCRIPTION' ) ) | ( ( 'FIELD' ) ) | ( ( 'FRAGMENT_DEFINITION' ) ) | ( ( 'FRAGMENT_SPREAD' ) ) | ( ( 'INLINE_FRAGMENT' ) ) | ( ( 'VARIABLE_DEFINITION' ) ) | ( ( 'SCHEMA' ) ) | ( ( 'SCALAR' ) ) | ( ( 'OBJECT' ) ) | ( ( 'FIELD_DEFINITION' ) ) | ( ( 'ARGUMENT_DEFINITION' ) ) | ( ( 'INTERFACE' ) ) | ( ( 'UNION' ) ) | ( ( 'ENUM' ) ) | ( ( 'ENUM_VALUE' ) ) | ( ( 'INPUT_OBJECT' ) ) | ( ( 'INPUT_FIELD_DEFINITION' ) ) );
    public final void rule__DirectiveLocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1005:1: ( ( ( 'QUERY' ) ) | ( ( 'MUTATION' ) ) | ( ( 'SUBSCRIPTION' ) ) | ( ( 'FIELD' ) ) | ( ( 'FRAGMENT_DEFINITION' ) ) | ( ( 'FRAGMENT_SPREAD' ) ) | ( ( 'INLINE_FRAGMENT' ) ) | ( ( 'VARIABLE_DEFINITION' ) ) | ( ( 'SCHEMA' ) ) | ( ( 'SCALAR' ) ) | ( ( 'OBJECT' ) ) | ( ( 'FIELD_DEFINITION' ) ) | ( ( 'ARGUMENT_DEFINITION' ) ) | ( ( 'INTERFACE' ) ) | ( ( 'UNION' ) ) | ( ( 'ENUM' ) ) | ( ( 'ENUM_VALUE' ) ) | ( ( 'INPUT_OBJECT' ) ) | ( ( 'INPUT_FIELD_DEFINITION' ) ) )
            int alt8=19;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            case 20:
                {
                alt8=5;
                }
                break;
            case 21:
                {
                alt8=6;
                }
                break;
            case 22:
                {
                alt8=7;
                }
                break;
            case 23:
                {
                alt8=8;
                }
                break;
            case 24:
                {
                alt8=9;
                }
                break;
            case 25:
                {
                alt8=10;
                }
                break;
            case 26:
                {
                alt8=11;
                }
                break;
            case 27:
                {
                alt8=12;
                }
                break;
            case 28:
                {
                alt8=13;
                }
                break;
            case 29:
                {
                alt8=14;
                }
                break;
            case 30:
                {
                alt8=15;
                }
                break;
            case 31:
                {
                alt8=16;
                }
                break;
            case 32:
                {
                alt8=17;
                }
                break;
            case 33:
                {
                alt8=18;
                }
                break;
            case 34:
                {
                alt8=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGraphQL.g:1006:2: ( ( 'QUERY' ) )
                    {
                    // InternalGraphQL.g:1006:2: ( ( 'QUERY' ) )
                    // InternalGraphQL.g:1007:3: ( 'QUERY' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0()); 
                    // InternalGraphQL.g:1008:3: ( 'QUERY' )
                    // InternalGraphQL.g:1008:4: 'QUERY'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1012:2: ( ( 'MUTATION' ) )
                    {
                    // InternalGraphQL.g:1012:2: ( ( 'MUTATION' ) )
                    // InternalGraphQL.g:1013:3: ( 'MUTATION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1()); 
                    // InternalGraphQL.g:1014:3: ( 'MUTATION' )
                    // InternalGraphQL.g:1014:4: 'MUTATION'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:1018:2: ( ( 'SUBSCRIPTION' ) )
                    {
                    // InternalGraphQL.g:1018:2: ( ( 'SUBSCRIPTION' ) )
                    // InternalGraphQL.g:1019:3: ( 'SUBSCRIPTION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 
                    // InternalGraphQL.g:1020:3: ( 'SUBSCRIPTION' )
                    // InternalGraphQL.g:1020:4: 'SUBSCRIPTION'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:1024:2: ( ( 'FIELD' ) )
                    {
                    // InternalGraphQL.g:1024:2: ( ( 'FIELD' ) )
                    // InternalGraphQL.g:1025:3: ( 'FIELD' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3()); 
                    // InternalGraphQL.g:1026:3: ( 'FIELD' )
                    // InternalGraphQL.g:1026:4: 'FIELD'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:1030:2: ( ( 'FRAGMENT_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1030:2: ( ( 'FRAGMENT_DEFINITION' ) )
                    // InternalGraphQL.g:1031:3: ( 'FRAGMENT_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4()); 
                    // InternalGraphQL.g:1032:3: ( 'FRAGMENT_DEFINITION' )
                    // InternalGraphQL.g:1032:4: 'FRAGMENT_DEFINITION'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:1036:2: ( ( 'FRAGMENT_SPREAD' ) )
                    {
                    // InternalGraphQL.g:1036:2: ( ( 'FRAGMENT_SPREAD' ) )
                    // InternalGraphQL.g:1037:3: ( 'FRAGMENT_SPREAD' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5()); 
                    // InternalGraphQL.g:1038:3: ( 'FRAGMENT_SPREAD' )
                    // InternalGraphQL.g:1038:4: 'FRAGMENT_SPREAD'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:1042:2: ( ( 'INLINE_FRAGMENT' ) )
                    {
                    // InternalGraphQL.g:1042:2: ( ( 'INLINE_FRAGMENT' ) )
                    // InternalGraphQL.g:1043:3: ( 'INLINE_FRAGMENT' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6()); 
                    // InternalGraphQL.g:1044:3: ( 'INLINE_FRAGMENT' )
                    // InternalGraphQL.g:1044:4: 'INLINE_FRAGMENT'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphQL.g:1048:2: ( ( 'VARIABLE_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1048:2: ( ( 'VARIABLE_DEFINITION' ) )
                    // InternalGraphQL.g:1049:3: ( 'VARIABLE_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7()); 
                    // InternalGraphQL.g:1050:3: ( 'VARIABLE_DEFINITION' )
                    // InternalGraphQL.g:1050:4: 'VARIABLE_DEFINITION'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGraphQL.g:1054:2: ( ( 'SCHEMA' ) )
                    {
                    // InternalGraphQL.g:1054:2: ( ( 'SCHEMA' ) )
                    // InternalGraphQL.g:1055:3: ( 'SCHEMA' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8()); 
                    // InternalGraphQL.g:1056:3: ( 'SCHEMA' )
                    // InternalGraphQL.g:1056:4: 'SCHEMA'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGraphQL.g:1060:2: ( ( 'SCALAR' ) )
                    {
                    // InternalGraphQL.g:1060:2: ( ( 'SCALAR' ) )
                    // InternalGraphQL.g:1061:3: ( 'SCALAR' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9()); 
                    // InternalGraphQL.g:1062:3: ( 'SCALAR' )
                    // InternalGraphQL.g:1062:4: 'SCALAR'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGraphQL.g:1066:2: ( ( 'OBJECT' ) )
                    {
                    // InternalGraphQL.g:1066:2: ( ( 'OBJECT' ) )
                    // InternalGraphQL.g:1067:3: ( 'OBJECT' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10()); 
                    // InternalGraphQL.g:1068:3: ( 'OBJECT' )
                    // InternalGraphQL.g:1068:4: 'OBJECT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGraphQL.g:1072:2: ( ( 'FIELD_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1072:2: ( ( 'FIELD_DEFINITION' ) )
                    // InternalGraphQL.g:1073:3: ( 'FIELD_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11()); 
                    // InternalGraphQL.g:1074:3: ( 'FIELD_DEFINITION' )
                    // InternalGraphQL.g:1074:4: 'FIELD_DEFINITION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGraphQL.g:1078:2: ( ( 'ARGUMENT_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1078:2: ( ( 'ARGUMENT_DEFINITION' ) )
                    // InternalGraphQL.g:1079:3: ( 'ARGUMENT_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12()); 
                    // InternalGraphQL.g:1080:3: ( 'ARGUMENT_DEFINITION' )
                    // InternalGraphQL.g:1080:4: 'ARGUMENT_DEFINITION'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGraphQL.g:1084:2: ( ( 'INTERFACE' ) )
                    {
                    // InternalGraphQL.g:1084:2: ( ( 'INTERFACE' ) )
                    // InternalGraphQL.g:1085:3: ( 'INTERFACE' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13()); 
                    // InternalGraphQL.g:1086:3: ( 'INTERFACE' )
                    // InternalGraphQL.g:1086:4: 'INTERFACE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGraphQL.g:1090:2: ( ( 'UNION' ) )
                    {
                    // InternalGraphQL.g:1090:2: ( ( 'UNION' ) )
                    // InternalGraphQL.g:1091:3: ( 'UNION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14()); 
                    // InternalGraphQL.g:1092:3: ( 'UNION' )
                    // InternalGraphQL.g:1092:4: 'UNION'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalGraphQL.g:1096:2: ( ( 'ENUM' ) )
                    {
                    // InternalGraphQL.g:1096:2: ( ( 'ENUM' ) )
                    // InternalGraphQL.g:1097:3: ( 'ENUM' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15()); 
                    // InternalGraphQL.g:1098:3: ( 'ENUM' )
                    // InternalGraphQL.g:1098:4: 'ENUM'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalGraphQL.g:1102:2: ( ( 'ENUM_VALUE' ) )
                    {
                    // InternalGraphQL.g:1102:2: ( ( 'ENUM_VALUE' ) )
                    // InternalGraphQL.g:1103:3: ( 'ENUM_VALUE' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16()); 
                    // InternalGraphQL.g:1104:3: ( 'ENUM_VALUE' )
                    // InternalGraphQL.g:1104:4: 'ENUM_VALUE'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalGraphQL.g:1108:2: ( ( 'INPUT_OBJECT' ) )
                    {
                    // InternalGraphQL.g:1108:2: ( ( 'INPUT_OBJECT' ) )
                    // InternalGraphQL.g:1109:3: ( 'INPUT_OBJECT' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17()); 
                    // InternalGraphQL.g:1110:3: ( 'INPUT_OBJECT' )
                    // InternalGraphQL.g:1110:4: 'INPUT_OBJECT'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalGraphQL.g:1114:2: ( ( 'INPUT_FIELD_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1114:2: ( ( 'INPUT_FIELD_DEFINITION' ) )
                    // InternalGraphQL.g:1115:3: ( 'INPUT_FIELD_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getINPUT_FIELD_DEFINITIONEnumLiteralDeclaration_18()); 
                    // InternalGraphQL.g:1116:3: ( 'INPUT_FIELD_DEFINITION' )
                    // InternalGraphQL.g:1116:4: 'INPUT_FIELD_DEFINITION'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getINPUT_FIELD_DEFINITIONEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveLocation__Alternatives"


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalGraphQL.g:1124:1: rule__OperationType__Alternatives : ( ( ( 'query' ) ) | ( ( 'mutation' ) ) | ( ( 'subscription' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1128:1: ( ( ( 'query' ) ) | ( ( 'mutation' ) ) | ( ( 'subscription' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGraphQL.g:1129:2: ( ( 'query' ) )
                    {
                    // InternalGraphQL.g:1129:2: ( ( 'query' ) )
                    // InternalGraphQL.g:1130:3: ( 'query' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0()); 
                    // InternalGraphQL.g:1131:3: ( 'query' )
                    // InternalGraphQL.g:1131:4: 'query'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1135:2: ( ( 'mutation' ) )
                    {
                    // InternalGraphQL.g:1135:2: ( ( 'mutation' ) )
                    // InternalGraphQL.g:1136:3: ( 'mutation' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1()); 
                    // InternalGraphQL.g:1137:3: ( 'mutation' )
                    // InternalGraphQL.g:1137:4: 'mutation'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:1141:2: ( ( 'subscription' ) )
                    {
                    // InternalGraphQL.g:1141:2: ( ( 'subscription' ) )
                    // InternalGraphQL.g:1142:3: ( 'subscription' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 
                    // InternalGraphQL.g:1143:3: ( 'subscription' )
                    // InternalGraphQL.g:1143:4: 'subscription'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__Alternatives"


    // $ANTLR start "rule__SchemaDefinition__Group__0"
    // InternalGraphQL.g:1151:1: rule__SchemaDefinition__Group__0 : rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1 ;
    public final void rule__SchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1155:1: ( rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1 )
            // InternalGraphQL.g:1156:2: rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__0"


    // $ANTLR start "rule__SchemaDefinition__Group__0__Impl"
    // InternalGraphQL.g:1163:1: rule__SchemaDefinition__Group__0__Impl : ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__SchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1167:1: ( ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1168:1: ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1168:1: ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1169:2: ( rule__SchemaDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getSchemaDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1170:2: ( rule__SchemaDefinition__DescriptionAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SL_STRING_VALUE && LA10_0<=RULE_ML_STRING_VALUE)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:1170:3: rule__SchemaDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SchemaDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__SchemaDefinition__Group__1"
    // InternalGraphQL.g:1178:1: rule__SchemaDefinition__Group__1 : rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2 ;
    public final void rule__SchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1182:1: ( rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2 )
            // InternalGraphQL.g:1183:2: rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__1"


    // $ANTLR start "rule__SchemaDefinition__Group__1__Impl"
    // InternalGraphQL.g:1190:1: rule__SchemaDefinition__Group__1__Impl : ( 'schema' ) ;
    public final void rule__SchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1194:1: ( ( 'schema' ) )
            // InternalGraphQL.g:1195:1: ( 'schema' )
            {
            // InternalGraphQL.g:1195:1: ( 'schema' )
            // InternalGraphQL.g:1196:2: 'schema'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__SchemaDefinition__Group__2"
    // InternalGraphQL.g:1205:1: rule__SchemaDefinition__Group__2 : rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3 ;
    public final void rule__SchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1209:1: ( rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3 )
            // InternalGraphQL.g:1210:2: rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SchemaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__2"


    // $ANTLR start "rule__SchemaDefinition__Group__2__Impl"
    // InternalGraphQL.g:1217:1: rule__SchemaDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1221:1: ( ( '{' ) )
            // InternalGraphQL.g:1222:1: ( '{' )
            {
            // InternalGraphQL.g:1222:1: ( '{' )
            // InternalGraphQL.g:1223:2: '{'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__SchemaDefinition__Group__3"
    // InternalGraphQL.g:1232:1: rule__SchemaDefinition__Group__3 : rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4 ;
    public final void rule__SchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1236:1: ( rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4 )
            // InternalGraphQL.g:1237:2: rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SchemaDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__3"


    // $ANTLR start "rule__SchemaDefinition__Group__3__Impl"
    // InternalGraphQL.g:1244:1: rule__SchemaDefinition__Group__3__Impl : ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) ) ;
    public final void rule__SchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1248:1: ( ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) ) )
            // InternalGraphQL.g:1249:1: ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) )
            {
            // InternalGraphQL.g:1249:1: ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) )
            // InternalGraphQL.g:1250:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* )
            {
            // InternalGraphQL.g:1250:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) )
            // InternalGraphQL.g:1251:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 
            // InternalGraphQL.g:1252:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )
            // InternalGraphQL.g:1252:4: rule__SchemaDefinition__TypeDefinitionsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__SchemaDefinition__TypeDefinitionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 

            }

            // InternalGraphQL.g:1255:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* )
            // InternalGraphQL.g:1256:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )*
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 
            // InternalGraphQL.g:1257:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=35 && LA11_0<=37)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraphQL.g:1257:4: rule__SchemaDefinition__TypeDefinitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SchemaDefinition__TypeDefinitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__SchemaDefinition__Group__4"
    // InternalGraphQL.g:1266:1: rule__SchemaDefinition__Group__4 : rule__SchemaDefinition__Group__4__Impl ;
    public final void rule__SchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1270:1: ( rule__SchemaDefinition__Group__4__Impl )
            // InternalGraphQL.g:1271:2: rule__SchemaDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchemaDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__4"


    // $ANTLR start "rule__SchemaDefinition__Group__4__Impl"
    // InternalGraphQL.g:1277:1: rule__SchemaDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1281:1: ( ( '}' ) )
            // InternalGraphQL.g:1282:1: ( '}' )
            {
            // InternalGraphQL.g:1282:1: ( '}' )
            // InternalGraphQL.g:1283:2: '}'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSchemaDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__Group__4__Impl"


    // $ANTLR start "rule__RootOperationTypeDefinition__Group__0"
    // InternalGraphQL.g:1293:1: rule__RootOperationTypeDefinition__Group__0 : rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1 ;
    public final void rule__RootOperationTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1297:1: ( rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1 )
            // InternalGraphQL.g:1298:2: rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RootOperationTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootOperationTypeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootOperationTypeDefinition__Group__0"


    // $ANTLR start "rule__RootOperationTypeDefinition__Group__0__Impl"
    // InternalGraphQL.g:1305:1: rule__RootOperationTypeDefinition__Group__0__Impl : ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) ) ;
    public final void rule__RootOperationTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1309:1: ( ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) ) )
            // InternalGraphQL.g:1310:1: ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) )
            {
            // InternalGraphQL.g:1310:1: ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) )
            // InternalGraphQL.g:1311:2: ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeAssignment_0()); 
            // InternalGraphQL.g:1312:2: ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 )
            // InternalGraphQL.g:1312:3: rule__RootOperationTypeDefinition__OperationTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RootOperationTypeDefinition__OperationTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootOperationTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__RootOperationTypeDefinition__Group__1"
    // InternalGraphQL.g:1320:1: rule__RootOperationTypeDefinition__Group__1 : rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2 ;
    public final void rule__RootOperationTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1324:1: ( rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2 )
            // InternalGraphQL.g:1325:2: rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__RootOperationTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootOperationTypeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootOperationTypeDefinition__Group__1"


    // $ANTLR start "rule__RootOperationTypeDefinition__Group__1__Impl"
    // InternalGraphQL.g:1332:1: rule__RootOperationTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RootOperationTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1336:1: ( ( ':' ) )
            // InternalGraphQL.g:1337:1: ( ':' )
            {
            // InternalGraphQL.g:1337:1: ( ':' )
            // InternalGraphQL.g:1338:2: ':'
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRootOperationTypeDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootOperationTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__RootOperationTypeDefinition__Group__2"
    // InternalGraphQL.g:1347:1: rule__RootOperationTypeDefinition__Group__2 : rule__RootOperationTypeDefinition__Group__2__Impl ;
    public final void rule__RootOperationTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1351:1: ( rule__RootOperationTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:1352:2: rule__RootOperationTypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootOperationTypeDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootOperationTypeDefinition__Group__2"


    // $ANTLR start "rule__RootOperationTypeDefinition__Group__2__Impl"
    // InternalGraphQL.g:1358:1: rule__RootOperationTypeDefinition__Group__2__Impl : ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__RootOperationTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1362:1: ( ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) ) )
            // InternalGraphQL.g:1363:1: ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) )
            {
            // InternalGraphQL.g:1363:1: ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) )
            // InternalGraphQL.g:1364:2: ( rule__RootOperationTypeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeAssignment_2()); 
            // InternalGraphQL.g:1365:2: ( rule__RootOperationTypeDefinition__TypeAssignment_2 )
            // InternalGraphQL.g:1365:3: rule__RootOperationTypeDefinition__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RootOperationTypeDefinition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootOperationTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__ScalarTypeDefinition__Group__0"
    // InternalGraphQL.g:1374:1: rule__ScalarTypeDefinition__Group__0 : rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1 ;
    public final void rule__ScalarTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1378:1: ( rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1 )
            // InternalGraphQL.g:1379:2: rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ScalarTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__Group__0"


    // $ANTLR start "rule__ScalarTypeDefinition__Group__0__Impl"
    // InternalGraphQL.g:1386:1: rule__ScalarTypeDefinition__Group__0__Impl : ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ScalarTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1390:1: ( ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1391:1: ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1391:1: ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1392:2: ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1393:2: ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_SL_STRING_VALUE && LA12_0<=RULE_ML_STRING_VALUE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphQL.g:1393:3: rule__ScalarTypeDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScalarTypeDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScalarTypeDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__ScalarTypeDefinition__Group__1"
    // InternalGraphQL.g:1401:1: rule__ScalarTypeDefinition__Group__1 : rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2 ;
    public final void rule__ScalarTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1405:1: ( rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2 )
            // InternalGraphQL.g:1406:2: rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ScalarTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__Group__1"


    // $ANTLR start "rule__ScalarTypeDefinition__Group__1__Impl"
    // InternalGraphQL.g:1413:1: rule__ScalarTypeDefinition__Group__1__Impl : ( 'scalar' ) ;
    public final void rule__ScalarTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1417:1: ( ( 'scalar' ) )
            // InternalGraphQL.g:1418:1: ( 'scalar' )
            {
            // InternalGraphQL.g:1418:1: ( 'scalar' )
            // InternalGraphQL.g:1419:2: 'scalar'
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__ScalarTypeDefinition__Group__2"
    // InternalGraphQL.g:1428:1: rule__ScalarTypeDefinition__Group__2 : rule__ScalarTypeDefinition__Group__2__Impl rule__ScalarTypeDefinition__Group__3 ;
    public final void rule__ScalarTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1432:1: ( rule__ScalarTypeDefinition__Group__2__Impl rule__ScalarTypeDefinition__Group__3 )
            // InternalGraphQL.g:1433:2: rule__ScalarTypeDefinition__Group__2__Impl rule__ScalarTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ScalarTypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__Group__2"


    // $ANTLR start "rule__ScalarTypeDefinition__Group__2__Impl"
    // InternalGraphQL.g:1440:1: rule__ScalarTypeDefinition__Group__2__Impl : ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__ScalarTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1444:1: ( ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1445:1: ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1445:1: ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1446:2: ( rule__ScalarTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1447:2: ( rule__ScalarTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1447:3: rule__ScalarTypeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScalarTypeDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__ScalarTypeDefinition__Group__3"
    // InternalGraphQL.g:1455:1: rule__ScalarTypeDefinition__Group__3 : rule__ScalarTypeDefinition__Group__3__Impl ;
    public final void rule__ScalarTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1459:1: ( rule__ScalarTypeDefinition__Group__3__Impl )
            // InternalGraphQL.g:1460:2: rule__ScalarTypeDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__Group__3"


    // $ANTLR start "rule__ScalarTypeDefinition__Group__3__Impl"
    // InternalGraphQL.g:1466:1: rule__ScalarTypeDefinition__Group__3__Impl : ( ( rule__ScalarTypeDefinition__DirectivesAssignment_3 )* ) ;
    public final void rule__ScalarTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1470:1: ( ( ( rule__ScalarTypeDefinition__DirectivesAssignment_3 )* ) )
            // InternalGraphQL.g:1471:1: ( ( rule__ScalarTypeDefinition__DirectivesAssignment_3 )* )
            {
            // InternalGraphQL.g:1471:1: ( ( rule__ScalarTypeDefinition__DirectivesAssignment_3 )* )
            // InternalGraphQL.g:1472:2: ( rule__ScalarTypeDefinition__DirectivesAssignment_3 )*
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getDirectivesAssignment_3()); 
            // InternalGraphQL.g:1473:2: ( rule__ScalarTypeDefinition__DirectivesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_DIRECTIVE_NAME) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGraphQL.g:1473:3: rule__ScalarTypeDefinition__DirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ScalarTypeDefinition__DirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getScalarTypeDefinitionAccess().getDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__0"
    // InternalGraphQL.g:1482:1: rule__ObjectTypeDefinition__Group__0 : rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1 ;
    public final void rule__ObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1486:1: ( rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1 )
            // InternalGraphQL.g:1487:2: rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ObjectTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__0"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__0__Impl"
    // InternalGraphQL.g:1494:1: rule__ObjectTypeDefinition__Group__0__Impl : ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1498:1: ( ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1499:1: ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1499:1: ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1500:2: ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1501:2: ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_SL_STRING_VALUE && LA14_0<=RULE_ML_STRING_VALUE)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphQL.g:1501:3: rule__ObjectTypeDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectTypeDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__1"
    // InternalGraphQL.g:1509:1: rule__ObjectTypeDefinition__Group__1 : rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2 ;
    public final void rule__ObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1513:1: ( rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2 )
            // InternalGraphQL.g:1514:2: rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ObjectTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__1"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__1__Impl"
    // InternalGraphQL.g:1521:1: rule__ObjectTypeDefinition__Group__1__Impl : ( 'type' ) ;
    public final void rule__ObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1525:1: ( ( 'type' ) )
            // InternalGraphQL.g:1526:1: ( 'type' )
            {
            // InternalGraphQL.g:1526:1: ( 'type' )
            // InternalGraphQL.g:1527:2: 'type'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__2"
    // InternalGraphQL.g:1536:1: rule__ObjectTypeDefinition__Group__2 : rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3 ;
    public final void rule__ObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1540:1: ( rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3 )
            // InternalGraphQL.g:1541:2: rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ObjectTypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__2"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__2__Impl"
    // InternalGraphQL.g:1548:1: rule__ObjectTypeDefinition__Group__2__Impl : ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__ObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1552:1: ( ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1553:1: ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1553:1: ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1554:2: ( rule__ObjectTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1555:2: ( rule__ObjectTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1555:3: rule__ObjectTypeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__3"
    // InternalGraphQL.g:1563:1: rule__ObjectTypeDefinition__Group__3 : rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4 ;
    public final void rule__ObjectTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1567:1: ( rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4 )
            // InternalGraphQL.g:1568:2: rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ObjectTypeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__3"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__3__Impl"
    // InternalGraphQL.g:1575:1: rule__ObjectTypeDefinition__Group__3__Impl : ( ( rule__ObjectTypeDefinition__Group_3__0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1579:1: ( ( ( rule__ObjectTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:1580:1: ( ( rule__ObjectTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:1580:1: ( ( rule__ObjectTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:1581:2: ( rule__ObjectTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:1582:2: ( rule__ObjectTypeDefinition__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphQL.g:1582:3: rule__ObjectTypeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectTypeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__4"
    // InternalGraphQL.g:1590:1: rule__ObjectTypeDefinition__Group__4 : rule__ObjectTypeDefinition__Group__4__Impl rule__ObjectTypeDefinition__Group__5 ;
    public final void rule__ObjectTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1594:1: ( rule__ObjectTypeDefinition__Group__4__Impl rule__ObjectTypeDefinition__Group__5 )
            // InternalGraphQL.g:1595:2: rule__ObjectTypeDefinition__Group__4__Impl rule__ObjectTypeDefinition__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ObjectTypeDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__4"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__4__Impl"
    // InternalGraphQL.g:1602:1: rule__ObjectTypeDefinition__Group__4__Impl : ( ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )* ) ;
    public final void rule__ObjectTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1606:1: ( ( ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )* ) )
            // InternalGraphQL.g:1607:1: ( ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )* )
            {
            // InternalGraphQL.g:1607:1: ( ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )* )
            // InternalGraphQL.g:1608:2: ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )*
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getDirectivesAssignment_4()); 
            // InternalGraphQL.g:1609:2: ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_DIRECTIVE_NAME) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGraphQL.g:1609:3: rule__ObjectTypeDefinition__DirectivesAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ObjectTypeDefinition__DirectivesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getObjectTypeDefinitionAccess().getDirectivesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__5"
    // InternalGraphQL.g:1617:1: rule__ObjectTypeDefinition__Group__5 : rule__ObjectTypeDefinition__Group__5__Impl ;
    public final void rule__ObjectTypeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1621:1: ( rule__ObjectTypeDefinition__Group__5__Impl )
            // InternalGraphQL.g:1622:2: rule__ObjectTypeDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__5"


    // $ANTLR start "rule__ObjectTypeDefinition__Group__5__Impl"
    // InternalGraphQL.g:1628:1: rule__ObjectTypeDefinition__Group__5__Impl : ( ( rule__ObjectTypeDefinition__Group_5__0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1632:1: ( ( ( rule__ObjectTypeDefinition__Group_5__0 )? ) )
            // InternalGraphQL.g:1633:1: ( ( rule__ObjectTypeDefinition__Group_5__0 )? )
            {
            // InternalGraphQL.g:1633:1: ( ( rule__ObjectTypeDefinition__Group_5__0 )? )
            // InternalGraphQL.g:1634:2: ( rule__ObjectTypeDefinition__Group_5__0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup_5()); 
            // InternalGraphQL.g:1635:2: ( rule__ObjectTypeDefinition__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphQL.g:1635:3: rule__ObjectTypeDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectTypeDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group__5__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__0"
    // InternalGraphQL.g:1644:1: rule__ObjectTypeDefinition__Group_3__0 : rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1 ;
    public final void rule__ObjectTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1648:1: ( rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:1649:2: rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ObjectTypeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3__0"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__0__Impl"
    // InternalGraphQL.g:1656:1: rule__ObjectTypeDefinition__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__ObjectTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1660:1: ( ( 'implements' ) )
            // InternalGraphQL.g:1661:1: ( 'implements' )
            {
            // InternalGraphQL.g:1661:1: ( 'implements' )
            // InternalGraphQL.g:1662:2: 'implements'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__1"
    // InternalGraphQL.g:1671:1: rule__ObjectTypeDefinition__Group_3__1 : rule__ObjectTypeDefinition__Group_3__1__Impl rule__ObjectTypeDefinition__Group_3__2 ;
    public final void rule__ObjectTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1675:1: ( rule__ObjectTypeDefinition__Group_3__1__Impl rule__ObjectTypeDefinition__Group_3__2 )
            // InternalGraphQL.g:1676:2: rule__ObjectTypeDefinition__Group_3__1__Impl rule__ObjectTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ObjectTypeDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3__1"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__1__Impl"
    // InternalGraphQL.g:1683:1: rule__ObjectTypeDefinition__Group_3__1__Impl : ( ( '&' )? ) ;
    public final void rule__ObjectTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1687:1: ( ( ( '&' )? ) )
            // InternalGraphQL.g:1688:1: ( ( '&' )? )
            {
            // InternalGraphQL.g:1688:1: ( ( '&' )? )
            // InternalGraphQL.g:1689:2: ( '&' )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getAmpersandKeyword_3_1()); 
            // InternalGraphQL.g:1690:2: ( '&' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGraphQL.g:1690:3: '&'
                    {
                    match(input,45,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getAmpersandKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__2"
    // InternalGraphQL.g:1698:1: rule__ObjectTypeDefinition__Group_3__2 : rule__ObjectTypeDefinition__Group_3__2__Impl rule__ObjectTypeDefinition__Group_3__3 ;
    public final void rule__ObjectTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1702:1: ( rule__ObjectTypeDefinition__Group_3__2__Impl rule__ObjectTypeDefinition__Group_3__3 )
            // InternalGraphQL.g:1703:2: rule__ObjectTypeDefinition__Group_3__2__Impl rule__ObjectTypeDefinition__Group_3__3
            {
            pushFollow(FOLLOW_17);
            rule__ObjectTypeDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3__2"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__2__Impl"
    // InternalGraphQL.g:1710:1: rule__ObjectTypeDefinition__Group_3__2__Impl : ( ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2 ) ) ;
    public final void rule__ObjectTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1714:1: ( ( ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2 ) ) )
            // InternalGraphQL.g:1715:1: ( ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2 ) )
            {
            // InternalGraphQL.g:1715:1: ( ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2 ) )
            // InternalGraphQL.g:1716:2: ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesAssignment_3_2()); 
            // InternalGraphQL.g:1717:2: ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2 )
            // InternalGraphQL.g:1717:3: rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__3"
    // InternalGraphQL.g:1725:1: rule__ObjectTypeDefinition__Group_3__3 : rule__ObjectTypeDefinition__Group_3__3__Impl ;
    public final void rule__ObjectTypeDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1729:1: ( rule__ObjectTypeDefinition__Group_3__3__Impl )
            // InternalGraphQL.g:1730:2: rule__ObjectTypeDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3__3"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__3__Impl"
    // InternalGraphQL.g:1736:1: rule__ObjectTypeDefinition__Group_3__3__Impl : ( ( rule__ObjectTypeDefinition__Group_3_3__0 )* ) ;
    public final void rule__ObjectTypeDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1740:1: ( ( ( rule__ObjectTypeDefinition__Group_3_3__0 )* ) )
            // InternalGraphQL.g:1741:1: ( ( rule__ObjectTypeDefinition__Group_3_3__0 )* )
            {
            // InternalGraphQL.g:1741:1: ( ( rule__ObjectTypeDefinition__Group_3_3__0 )* )
            // InternalGraphQL.g:1742:2: ( rule__ObjectTypeDefinition__Group_3_3__0 )*
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup_3_3()); 
            // InternalGraphQL.g:1743:2: ( rule__ObjectTypeDefinition__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGraphQL.g:1743:3: rule__ObjectTypeDefinition__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ObjectTypeDefinition__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getObjectTypeDefinitionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3_3__0"
    // InternalGraphQL.g:1752:1: rule__ObjectTypeDefinition__Group_3_3__0 : rule__ObjectTypeDefinition__Group_3_3__0__Impl rule__ObjectTypeDefinition__Group_3_3__1 ;
    public final void rule__ObjectTypeDefinition__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1756:1: ( rule__ObjectTypeDefinition__Group_3_3__0__Impl rule__ObjectTypeDefinition__Group_3_3__1 )
            // InternalGraphQL.g:1757:2: rule__ObjectTypeDefinition__Group_3_3__0__Impl rule__ObjectTypeDefinition__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ObjectTypeDefinition__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3_3__0"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3_3__0__Impl"
    // InternalGraphQL.g:1764:1: rule__ObjectTypeDefinition__Group_3_3__0__Impl : ( '&' ) ;
    public final void rule__ObjectTypeDefinition__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1768:1: ( ( '&' ) )
            // InternalGraphQL.g:1769:1: ( '&' )
            {
            // InternalGraphQL.g:1769:1: ( '&' )
            // InternalGraphQL.g:1770:2: '&'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getAmpersandKeyword_3_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getAmpersandKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3_3__0__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3_3__1"
    // InternalGraphQL.g:1779:1: rule__ObjectTypeDefinition__Group_3_3__1 : rule__ObjectTypeDefinition__Group_3_3__1__Impl ;
    public final void rule__ObjectTypeDefinition__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1783:1: ( rule__ObjectTypeDefinition__Group_3_3__1__Impl )
            // InternalGraphQL.g:1784:2: rule__ObjectTypeDefinition__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3_3__1"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3_3__1__Impl"
    // InternalGraphQL.g:1790:1: rule__ObjectTypeDefinition__Group_3_3__1__Impl : ( ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1 ) ) ;
    public final void rule__ObjectTypeDefinition__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1794:1: ( ( ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1 ) ) )
            // InternalGraphQL.g:1795:1: ( ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1 ) )
            {
            // InternalGraphQL.g:1795:1: ( ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1 ) )
            // InternalGraphQL.g:1796:2: ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesAssignment_3_3_1()); 
            // InternalGraphQL.g:1797:2: ( rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1 )
            // InternalGraphQL.g:1797:3: rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_3_3__1__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_5__0"
    // InternalGraphQL.g:1806:1: rule__ObjectTypeDefinition__Group_5__0 : rule__ObjectTypeDefinition__Group_5__0__Impl rule__ObjectTypeDefinition__Group_5__1 ;
    public final void rule__ObjectTypeDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1810:1: ( rule__ObjectTypeDefinition__Group_5__0__Impl rule__ObjectTypeDefinition__Group_5__1 )
            // InternalGraphQL.g:1811:2: rule__ObjectTypeDefinition__Group_5__0__Impl rule__ObjectTypeDefinition__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__ObjectTypeDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_5__0"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_5__0__Impl"
    // InternalGraphQL.g:1818:1: rule__ObjectTypeDefinition__Group_5__0__Impl : ( '{' ) ;
    public final void rule__ObjectTypeDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1822:1: ( ( '{' ) )
            // InternalGraphQL.g:1823:1: ( '{' )
            {
            // InternalGraphQL.g:1823:1: ( '{' )
            // InternalGraphQL.g:1824:2: '{'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_5__1"
    // InternalGraphQL.g:1833:1: rule__ObjectTypeDefinition__Group_5__1 : rule__ObjectTypeDefinition__Group_5__1__Impl rule__ObjectTypeDefinition__Group_5__2 ;
    public final void rule__ObjectTypeDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1837:1: ( rule__ObjectTypeDefinition__Group_5__1__Impl rule__ObjectTypeDefinition__Group_5__2 )
            // InternalGraphQL.g:1838:2: rule__ObjectTypeDefinition__Group_5__1__Impl rule__ObjectTypeDefinition__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__ObjectTypeDefinition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_5__1"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_5__1__Impl"
    // InternalGraphQL.g:1845:1: rule__ObjectTypeDefinition__Group_5__1__Impl : ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )* ) ;
    public final void rule__ObjectTypeDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1849:1: ( ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )* ) )
            // InternalGraphQL.g:1850:1: ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )* )
            {
            // InternalGraphQL.g:1850:1: ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )* )
            // InternalGraphQL.g:1851:2: ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )*
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_5_1()); 
            // InternalGraphQL.g:1852:2: ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SL_STRING_VALUE && LA20_0<=RULE_NAME)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGraphQL.g:1852:3: rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_5__2"
    // InternalGraphQL.g:1860:1: rule__ObjectTypeDefinition__Group_5__2 : rule__ObjectTypeDefinition__Group_5__2__Impl ;
    public final void rule__ObjectTypeDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1864:1: ( rule__ObjectTypeDefinition__Group_5__2__Impl )
            // InternalGraphQL.g:1865:2: rule__ObjectTypeDefinition__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_5__2"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_5__2__Impl"
    // InternalGraphQL.g:1871:1: rule__ObjectTypeDefinition__Group_5__2__Impl : ( '}' ) ;
    public final void rule__ObjectTypeDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1875:1: ( ( '}' ) )
            // InternalGraphQL.g:1876:1: ( '}' )
            {
            // InternalGraphQL.g:1876:1: ( '}' )
            // InternalGraphQL.g:1877:2: '}'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_5__2__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__0"
    // InternalGraphQL.g:1887:1: rule__InterfaceDefinition__Group__0 : rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1891:1: ( rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 )
            // InternalGraphQL.g:1892:2: rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__InterfaceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__0"


    // $ANTLR start "rule__InterfaceDefinition__Group__0__Impl"
    // InternalGraphQL.g:1899:1: rule__InterfaceDefinition__Group__0__Impl : ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InterfaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1903:1: ( ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1904:1: ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1904:1: ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1905:2: ( rule__InterfaceDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1906:2: ( rule__InterfaceDefinition__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_SL_STRING_VALUE && LA21_0<=RULE_ML_STRING_VALUE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphQL.g:1906:3: rule__InterfaceDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__0__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__1"
    // InternalGraphQL.g:1914:1: rule__InterfaceDefinition__Group__1 : rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1918:1: ( rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 )
            // InternalGraphQL.g:1919:2: rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__InterfaceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__1"


    // $ANTLR start "rule__InterfaceDefinition__Group__1__Impl"
    // InternalGraphQL.g:1926:1: rule__InterfaceDefinition__Group__1__Impl : ( 'interface' ) ;
    public final void rule__InterfaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1930:1: ( ( 'interface' ) )
            // InternalGraphQL.g:1931:1: ( 'interface' )
            {
            // InternalGraphQL.g:1931:1: ( 'interface' )
            // InternalGraphQL.g:1932:2: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__1__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__2"
    // InternalGraphQL.g:1941:1: rule__InterfaceDefinition__Group__2 : rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1945:1: ( rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3 )
            // InternalGraphQL.g:1946:2: rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__InterfaceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__2"


    // $ANTLR start "rule__InterfaceDefinition__Group__2__Impl"
    // InternalGraphQL.g:1953:1: rule__InterfaceDefinition__Group__2__Impl : ( ( rule__InterfaceDefinition__NameAssignment_2 ) ) ;
    public final void rule__InterfaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1957:1: ( ( ( rule__InterfaceDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1958:1: ( ( rule__InterfaceDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1958:1: ( ( rule__InterfaceDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1959:2: ( rule__InterfaceDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1960:2: ( rule__InterfaceDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1960:3: rule__InterfaceDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__2__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__3"
    // InternalGraphQL.g:1968:1: rule__InterfaceDefinition__Group__3 : rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1972:1: ( rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4 )
            // InternalGraphQL.g:1973:2: rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__InterfaceDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__3"


    // $ANTLR start "rule__InterfaceDefinition__Group__3__Impl"
    // InternalGraphQL.g:1980:1: rule__InterfaceDefinition__Group__3__Impl : ( ( rule__InterfaceDefinition__Group_3__0 )? ) ;
    public final void rule__InterfaceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1984:1: ( ( ( rule__InterfaceDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:1985:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:1985:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            // InternalGraphQL.g:1986:2: ( rule__InterfaceDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:1987:2: ( rule__InterfaceDefinition__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGraphQL.g:1987:3: rule__InterfaceDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__3__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__4"
    // InternalGraphQL.g:1995:1: rule__InterfaceDefinition__Group__4 : rule__InterfaceDefinition__Group__4__Impl rule__InterfaceDefinition__Group__5 ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1999:1: ( rule__InterfaceDefinition__Group__4__Impl rule__InterfaceDefinition__Group__5 )
            // InternalGraphQL.g:2000:2: rule__InterfaceDefinition__Group__4__Impl rule__InterfaceDefinition__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__InterfaceDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__4"


    // $ANTLR start "rule__InterfaceDefinition__Group__4__Impl"
    // InternalGraphQL.g:2007:1: rule__InterfaceDefinition__Group__4__Impl : ( ( rule__InterfaceDefinition__DirectivesAssignment_4 )* ) ;
    public final void rule__InterfaceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2011:1: ( ( ( rule__InterfaceDefinition__DirectivesAssignment_4 )* ) )
            // InternalGraphQL.g:2012:1: ( ( rule__InterfaceDefinition__DirectivesAssignment_4 )* )
            {
            // InternalGraphQL.g:2012:1: ( ( rule__InterfaceDefinition__DirectivesAssignment_4 )* )
            // InternalGraphQL.g:2013:2: ( rule__InterfaceDefinition__DirectivesAssignment_4 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getDirectivesAssignment_4()); 
            // InternalGraphQL.g:2014:2: ( rule__InterfaceDefinition__DirectivesAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DIRECTIVE_NAME) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGraphQL.g:2014:3: rule__InterfaceDefinition__DirectivesAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InterfaceDefinition__DirectivesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getDirectivesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__4__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__5"
    // InternalGraphQL.g:2022:1: rule__InterfaceDefinition__Group__5 : rule__InterfaceDefinition__Group__5__Impl ;
    public final void rule__InterfaceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2026:1: ( rule__InterfaceDefinition__Group__5__Impl )
            // InternalGraphQL.g:2027:2: rule__InterfaceDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__5"


    // $ANTLR start "rule__InterfaceDefinition__Group__5__Impl"
    // InternalGraphQL.g:2033:1: rule__InterfaceDefinition__Group__5__Impl : ( ( rule__InterfaceDefinition__Group_5__0 )? ) ;
    public final void rule__InterfaceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2037:1: ( ( ( rule__InterfaceDefinition__Group_5__0 )? ) )
            // InternalGraphQL.g:2038:1: ( ( rule__InterfaceDefinition__Group_5__0 )? )
            {
            // InternalGraphQL.g:2038:1: ( ( rule__InterfaceDefinition__Group_5__0 )? )
            // InternalGraphQL.g:2039:2: ( rule__InterfaceDefinition__Group_5__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_5()); 
            // InternalGraphQL.g:2040:2: ( rule__InterfaceDefinition__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphQL.g:2040:3: rule__InterfaceDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__5__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_3__0"
    // InternalGraphQL.g:2049:1: rule__InterfaceDefinition__Group_3__0 : rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1 ;
    public final void rule__InterfaceDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2053:1: ( rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1 )
            // InternalGraphQL.g:2054:2: rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__InterfaceDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3__0"


    // $ANTLR start "rule__InterfaceDefinition__Group_3__0__Impl"
    // InternalGraphQL.g:2061:1: rule__InterfaceDefinition__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__InterfaceDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2065:1: ( ( 'implements' ) )
            // InternalGraphQL.g:2066:1: ( 'implements' )
            {
            // InternalGraphQL.g:2066:1: ( 'implements' )
            // InternalGraphQL.g:2067:2: 'implements'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_3__1"
    // InternalGraphQL.g:2076:1: rule__InterfaceDefinition__Group_3__1 : rule__InterfaceDefinition__Group_3__1__Impl rule__InterfaceDefinition__Group_3__2 ;
    public final void rule__InterfaceDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2080:1: ( rule__InterfaceDefinition__Group_3__1__Impl rule__InterfaceDefinition__Group_3__2 )
            // InternalGraphQL.g:2081:2: rule__InterfaceDefinition__Group_3__1__Impl rule__InterfaceDefinition__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__InterfaceDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3__1"


    // $ANTLR start "rule__InterfaceDefinition__Group_3__1__Impl"
    // InternalGraphQL.g:2088:1: rule__InterfaceDefinition__Group_3__1__Impl : ( ( '&' )? ) ;
    public final void rule__InterfaceDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2092:1: ( ( ( '&' )? ) )
            // InternalGraphQL.g:2093:1: ( ( '&' )? )
            {
            // InternalGraphQL.g:2093:1: ( ( '&' )? )
            // InternalGraphQL.g:2094:2: ( '&' )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getAmpersandKeyword_3_1()); 
            // InternalGraphQL.g:2095:2: ( '&' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphQL.g:2095:3: '&'
                    {
                    match(input,45,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getAmpersandKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_3__2"
    // InternalGraphQL.g:2103:1: rule__InterfaceDefinition__Group_3__2 : rule__InterfaceDefinition__Group_3__2__Impl rule__InterfaceDefinition__Group_3__3 ;
    public final void rule__InterfaceDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2107:1: ( rule__InterfaceDefinition__Group_3__2__Impl rule__InterfaceDefinition__Group_3__3 )
            // InternalGraphQL.g:2108:2: rule__InterfaceDefinition__Group_3__2__Impl rule__InterfaceDefinition__Group_3__3
            {
            pushFollow(FOLLOW_17);
            rule__InterfaceDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3__2"


    // $ANTLR start "rule__InterfaceDefinition__Group_3__2__Impl"
    // InternalGraphQL.g:2115:1: rule__InterfaceDefinition__Group_3__2__Impl : ( ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2 ) ) ;
    public final void rule__InterfaceDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2119:1: ( ( ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2 ) ) )
            // InternalGraphQL.g:2120:1: ( ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2 ) )
            {
            // InternalGraphQL.g:2120:1: ( ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2 ) )
            // InternalGraphQL.g:2121:2: ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesAssignment_3_2()); 
            // InternalGraphQL.g:2122:2: ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2 )
            // InternalGraphQL.g:2122:3: rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_3__3"
    // InternalGraphQL.g:2130:1: rule__InterfaceDefinition__Group_3__3 : rule__InterfaceDefinition__Group_3__3__Impl ;
    public final void rule__InterfaceDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2134:1: ( rule__InterfaceDefinition__Group_3__3__Impl )
            // InternalGraphQL.g:2135:2: rule__InterfaceDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3__3"


    // $ANTLR start "rule__InterfaceDefinition__Group_3__3__Impl"
    // InternalGraphQL.g:2141:1: rule__InterfaceDefinition__Group_3__3__Impl : ( ( rule__InterfaceDefinition__Group_3_3__0 )* ) ;
    public final void rule__InterfaceDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2145:1: ( ( ( rule__InterfaceDefinition__Group_3_3__0 )* ) )
            // InternalGraphQL.g:2146:1: ( ( rule__InterfaceDefinition__Group_3_3__0 )* )
            {
            // InternalGraphQL.g:2146:1: ( ( rule__InterfaceDefinition__Group_3_3__0 )* )
            // InternalGraphQL.g:2147:2: ( rule__InterfaceDefinition__Group_3_3__0 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_3_3()); 
            // InternalGraphQL.g:2148:2: ( rule__InterfaceDefinition__Group_3_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGraphQL.g:2148:3: rule__InterfaceDefinition__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InterfaceDefinition__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_3_3__0"
    // InternalGraphQL.g:2157:1: rule__InterfaceDefinition__Group_3_3__0 : rule__InterfaceDefinition__Group_3_3__0__Impl rule__InterfaceDefinition__Group_3_3__1 ;
    public final void rule__InterfaceDefinition__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2161:1: ( rule__InterfaceDefinition__Group_3_3__0__Impl rule__InterfaceDefinition__Group_3_3__1 )
            // InternalGraphQL.g:2162:2: rule__InterfaceDefinition__Group_3_3__0__Impl rule__InterfaceDefinition__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__InterfaceDefinition__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3_3__0"


    // $ANTLR start "rule__InterfaceDefinition__Group_3_3__0__Impl"
    // InternalGraphQL.g:2169:1: rule__InterfaceDefinition__Group_3_3__0__Impl : ( '&' ) ;
    public final void rule__InterfaceDefinition__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2173:1: ( ( '&' ) )
            // InternalGraphQL.g:2174:1: ( '&' )
            {
            // InternalGraphQL.g:2174:1: ( '&' )
            // InternalGraphQL.g:2175:2: '&'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getAmpersandKeyword_3_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getAmpersandKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3_3__0__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_3_3__1"
    // InternalGraphQL.g:2184:1: rule__InterfaceDefinition__Group_3_3__1 : rule__InterfaceDefinition__Group_3_3__1__Impl ;
    public final void rule__InterfaceDefinition__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2188:1: ( rule__InterfaceDefinition__Group_3_3__1__Impl )
            // InternalGraphQL.g:2189:2: rule__InterfaceDefinition__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3_3__1"


    // $ANTLR start "rule__InterfaceDefinition__Group_3_3__1__Impl"
    // InternalGraphQL.g:2195:1: rule__InterfaceDefinition__Group_3_3__1__Impl : ( ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1 ) ) ;
    public final void rule__InterfaceDefinition__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2199:1: ( ( ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1 ) ) )
            // InternalGraphQL.g:2200:1: ( ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1 ) )
            {
            // InternalGraphQL.g:2200:1: ( ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1 ) )
            // InternalGraphQL.g:2201:2: ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesAssignment_3_3_1()); 
            // InternalGraphQL.g:2202:2: ( rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1 )
            // InternalGraphQL.g:2202:3: rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_3_3__1__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_5__0"
    // InternalGraphQL.g:2211:1: rule__InterfaceDefinition__Group_5__0 : rule__InterfaceDefinition__Group_5__0__Impl rule__InterfaceDefinition__Group_5__1 ;
    public final void rule__InterfaceDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2215:1: ( rule__InterfaceDefinition__Group_5__0__Impl rule__InterfaceDefinition__Group_5__1 )
            // InternalGraphQL.g:2216:2: rule__InterfaceDefinition__Group_5__0__Impl rule__InterfaceDefinition__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__InterfaceDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_5__0"


    // $ANTLR start "rule__InterfaceDefinition__Group_5__0__Impl"
    // InternalGraphQL.g:2223:1: rule__InterfaceDefinition__Group_5__0__Impl : ( '{' ) ;
    public final void rule__InterfaceDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2227:1: ( ( '{' ) )
            // InternalGraphQL.g:2228:1: ( '{' )
            {
            // InternalGraphQL.g:2228:1: ( '{' )
            // InternalGraphQL.g:2229:2: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_5__1"
    // InternalGraphQL.g:2238:1: rule__InterfaceDefinition__Group_5__1 : rule__InterfaceDefinition__Group_5__1__Impl rule__InterfaceDefinition__Group_5__2 ;
    public final void rule__InterfaceDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2242:1: ( rule__InterfaceDefinition__Group_5__1__Impl rule__InterfaceDefinition__Group_5__2 )
            // InternalGraphQL.g:2243:2: rule__InterfaceDefinition__Group_5__1__Impl rule__InterfaceDefinition__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__InterfaceDefinition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_5__1"


    // $ANTLR start "rule__InterfaceDefinition__Group_5__1__Impl"
    // InternalGraphQL.g:2250:1: rule__InterfaceDefinition__Group_5__1__Impl : ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1 )* ) ;
    public final void rule__InterfaceDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2254:1: ( ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1 )* ) )
            // InternalGraphQL.g:2255:1: ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1 )* )
            {
            // InternalGraphQL.g:2255:1: ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1 )* )
            // InternalGraphQL.g:2256:2: ( rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsAssignment_5_1()); 
            // InternalGraphQL.g:2257:2: ( rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_SL_STRING_VALUE && LA27_0<=RULE_NAME)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGraphQL.g:2257:3: rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_5__2"
    // InternalGraphQL.g:2265:1: rule__InterfaceDefinition__Group_5__2 : rule__InterfaceDefinition__Group_5__2__Impl ;
    public final void rule__InterfaceDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2269:1: ( rule__InterfaceDefinition__Group_5__2__Impl )
            // InternalGraphQL.g:2270:2: rule__InterfaceDefinition__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_5__2"


    // $ANTLR start "rule__InterfaceDefinition__Group_5__2__Impl"
    // InternalGraphQL.g:2276:1: rule__InterfaceDefinition__Group_5__2__Impl : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2280:1: ( ( '}' ) )
            // InternalGraphQL.g:2281:1: ( '}' )
            {
            // InternalGraphQL.g:2281:1: ( '}' )
            // InternalGraphQL.g:2282:2: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_5__2__Impl"


    // $ANTLR start "rule__FieldDefinition__Group__0"
    // InternalGraphQL.g:2292:1: rule__FieldDefinition__Group__0 : rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1 ;
    public final void rule__FieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2296:1: ( rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1 )
            // InternalGraphQL.g:2297:2: rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__FieldDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__0"


    // $ANTLR start "rule__FieldDefinition__Group__0__Impl"
    // InternalGraphQL.g:2304:1: rule__FieldDefinition__Group__0__Impl : ( ( rule__FieldDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__FieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2308:1: ( ( ( rule__FieldDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2309:1: ( ( rule__FieldDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2309:1: ( ( rule__FieldDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2310:2: ( rule__FieldDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFieldDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2311:2: ( rule__FieldDefinition__DescriptionAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_SL_STRING_VALUE && LA28_0<=RULE_ML_STRING_VALUE)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphQL.g:2311:3: rule__FieldDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__0__Impl"


    // $ANTLR start "rule__FieldDefinition__Group__1"
    // InternalGraphQL.g:2319:1: rule__FieldDefinition__Group__1 : rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2 ;
    public final void rule__FieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2323:1: ( rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2 )
            // InternalGraphQL.g:2324:2: rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__FieldDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__1"


    // $ANTLR start "rule__FieldDefinition__Group__1__Impl"
    // InternalGraphQL.g:2331:1: rule__FieldDefinition__Group__1__Impl : ( ( rule__FieldDefinition__NameAssignment_1 ) ) ;
    public final void rule__FieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2335:1: ( ( ( rule__FieldDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:2336:1: ( ( rule__FieldDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:2336:1: ( ( rule__FieldDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:2337:2: ( rule__FieldDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:2338:2: ( rule__FieldDefinition__NameAssignment_1 )
            // InternalGraphQL.g:2338:3: rule__FieldDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__1__Impl"


    // $ANTLR start "rule__FieldDefinition__Group__2"
    // InternalGraphQL.g:2346:1: rule__FieldDefinition__Group__2 : rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3 ;
    public final void rule__FieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2350:1: ( rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3 )
            // InternalGraphQL.g:2351:2: rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__FieldDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__2"


    // $ANTLR start "rule__FieldDefinition__Group__2__Impl"
    // InternalGraphQL.g:2358:1: rule__FieldDefinition__Group__2__Impl : ( ( rule__FieldDefinition__Group_2__0 )? ) ;
    public final void rule__FieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2362:1: ( ( ( rule__FieldDefinition__Group_2__0 )? ) )
            // InternalGraphQL.g:2363:1: ( ( rule__FieldDefinition__Group_2__0 )? )
            {
            // InternalGraphQL.g:2363:1: ( ( rule__FieldDefinition__Group_2__0 )? )
            // InternalGraphQL.g:2364:2: ( rule__FieldDefinition__Group_2__0 )?
            {
             before(grammarAccess.getFieldDefinitionAccess().getGroup_2()); 
            // InternalGraphQL.g:2365:2: ( rule__FieldDefinition__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphQL.g:2365:3: rule__FieldDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__2__Impl"


    // $ANTLR start "rule__FieldDefinition__Group__3"
    // InternalGraphQL.g:2373:1: rule__FieldDefinition__Group__3 : rule__FieldDefinition__Group__3__Impl rule__FieldDefinition__Group__4 ;
    public final void rule__FieldDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2377:1: ( rule__FieldDefinition__Group__3__Impl rule__FieldDefinition__Group__4 )
            // InternalGraphQL.g:2378:2: rule__FieldDefinition__Group__3__Impl rule__FieldDefinition__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__FieldDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__3"


    // $ANTLR start "rule__FieldDefinition__Group__3__Impl"
    // InternalGraphQL.g:2385:1: rule__FieldDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__FieldDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2389:1: ( ( ':' ) )
            // InternalGraphQL.g:2390:1: ( ':' )
            {
            // InternalGraphQL.g:2390:1: ( ':' )
            // InternalGraphQL.g:2391:2: ':'
            {
             before(grammarAccess.getFieldDefinitionAccess().getColonKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFieldDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__3__Impl"


    // $ANTLR start "rule__FieldDefinition__Group__4"
    // InternalGraphQL.g:2400:1: rule__FieldDefinition__Group__4 : rule__FieldDefinition__Group__4__Impl ;
    public final void rule__FieldDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2404:1: ( rule__FieldDefinition__Group__4__Impl )
            // InternalGraphQL.g:2405:2: rule__FieldDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__4"


    // $ANTLR start "rule__FieldDefinition__Group__4__Impl"
    // InternalGraphQL.g:2411:1: rule__FieldDefinition__Group__4__Impl : ( ( rule__FieldDefinition__TypeAssignment_4 ) ) ;
    public final void rule__FieldDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2415:1: ( ( ( rule__FieldDefinition__TypeAssignment_4 ) ) )
            // InternalGraphQL.g:2416:1: ( ( rule__FieldDefinition__TypeAssignment_4 ) )
            {
            // InternalGraphQL.g:2416:1: ( ( rule__FieldDefinition__TypeAssignment_4 ) )
            // InternalGraphQL.g:2417:2: ( rule__FieldDefinition__TypeAssignment_4 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getTypeAssignment_4()); 
            // InternalGraphQL.g:2418:2: ( rule__FieldDefinition__TypeAssignment_4 )
            // InternalGraphQL.g:2418:3: rule__FieldDefinition__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldDefinitionAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group__4__Impl"


    // $ANTLR start "rule__FieldDefinition__Group_2__0"
    // InternalGraphQL.g:2427:1: rule__FieldDefinition__Group_2__0 : rule__FieldDefinition__Group_2__0__Impl rule__FieldDefinition__Group_2__1 ;
    public final void rule__FieldDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2431:1: ( rule__FieldDefinition__Group_2__0__Impl rule__FieldDefinition__Group_2__1 )
            // InternalGraphQL.g:2432:2: rule__FieldDefinition__Group_2__0__Impl rule__FieldDefinition__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__FieldDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group_2__0"


    // $ANTLR start "rule__FieldDefinition__Group_2__0__Impl"
    // InternalGraphQL.g:2439:1: rule__FieldDefinition__Group_2__0__Impl : ( '(' ) ;
    public final void rule__FieldDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2443:1: ( ( '(' ) )
            // InternalGraphQL.g:2444:1: ( '(' )
            {
            // InternalGraphQL.g:2444:1: ( '(' )
            // InternalGraphQL.g:2445:2: '('
            {
             before(grammarAccess.getFieldDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFieldDefinitionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__FieldDefinition__Group_2__1"
    // InternalGraphQL.g:2454:1: rule__FieldDefinition__Group_2__1 : rule__FieldDefinition__Group_2__1__Impl rule__FieldDefinition__Group_2__2 ;
    public final void rule__FieldDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2458:1: ( rule__FieldDefinition__Group_2__1__Impl rule__FieldDefinition__Group_2__2 )
            // InternalGraphQL.g:2459:2: rule__FieldDefinition__Group_2__1__Impl rule__FieldDefinition__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__FieldDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group_2__1"


    // $ANTLR start "rule__FieldDefinition__Group_2__1__Impl"
    // InternalGraphQL.g:2466:1: rule__FieldDefinition__Group_2__1__Impl : ( ( rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1 )* ) ;
    public final void rule__FieldDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2470:1: ( ( ( rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1 )* ) )
            // InternalGraphQL.g:2471:1: ( ( rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1 )* )
            {
            // InternalGraphQL.g:2471:1: ( ( rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1 )* )
            // InternalGraphQL.g:2472:2: ( rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1 )*
            {
             before(grammarAccess.getFieldDefinitionAccess().getArgumentsDefinitionAssignment_2_1()); 
            // InternalGraphQL.g:2473:2: ( rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_SL_STRING_VALUE && LA30_0<=RULE_NAME)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGraphQL.g:2473:3: rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getFieldDefinitionAccess().getArgumentsDefinitionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__FieldDefinition__Group_2__2"
    // InternalGraphQL.g:2481:1: rule__FieldDefinition__Group_2__2 : rule__FieldDefinition__Group_2__2__Impl ;
    public final void rule__FieldDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2485:1: ( rule__FieldDefinition__Group_2__2__Impl )
            // InternalGraphQL.g:2486:2: rule__FieldDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group_2__2"


    // $ANTLR start "rule__FieldDefinition__Group_2__2__Impl"
    // InternalGraphQL.g:2492:1: rule__FieldDefinition__Group_2__2__Impl : ( ')' ) ;
    public final void rule__FieldDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2496:1: ( ( ')' ) )
            // InternalGraphQL.g:2497:1: ( ')' )
            {
            // InternalGraphQL.g:2497:1: ( ')' )
            // InternalGraphQL.g:2498:2: ')'
            {
             before(grammarAccess.getFieldDefinitionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFieldDefinitionAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group__0"
    // InternalGraphQL.g:2508:1: rule__UnionTypeDefinition__Group__0 : rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1 ;
    public final void rule__UnionTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2512:1: ( rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1 )
            // InternalGraphQL.g:2513:2: rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__UnionTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__0"


    // $ANTLR start "rule__UnionTypeDefinition__Group__0__Impl"
    // InternalGraphQL.g:2520:1: rule__UnionTypeDefinition__Group__0__Impl : ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__UnionTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2524:1: ( ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2525:1: ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2525:1: ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2526:2: ( rule__UnionTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2527:2: ( rule__UnionTypeDefinition__DescriptionAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_SL_STRING_VALUE && LA31_0<=RULE_ML_STRING_VALUE)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGraphQL.g:2527:3: rule__UnionTypeDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnionTypeDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group__1"
    // InternalGraphQL.g:2535:1: rule__UnionTypeDefinition__Group__1 : rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2 ;
    public final void rule__UnionTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2539:1: ( rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2 )
            // InternalGraphQL.g:2540:2: rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__UnionTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__1"


    // $ANTLR start "rule__UnionTypeDefinition__Group__1__Impl"
    // InternalGraphQL.g:2547:1: rule__UnionTypeDefinition__Group__1__Impl : ( 'union' ) ;
    public final void rule__UnionTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2551:1: ( ( 'union' ) )
            // InternalGraphQL.g:2552:1: ( 'union' )
            {
            // InternalGraphQL.g:2552:1: ( 'union' )
            // InternalGraphQL.g:2553:2: 'union'
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group__2"
    // InternalGraphQL.g:2562:1: rule__UnionTypeDefinition__Group__2 : rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3 ;
    public final void rule__UnionTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2566:1: ( rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3 )
            // InternalGraphQL.g:2567:2: rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__UnionTypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__2"


    // $ANTLR start "rule__UnionTypeDefinition__Group__2__Impl"
    // InternalGraphQL.g:2574:1: rule__UnionTypeDefinition__Group__2__Impl : ( ( rule__UnionTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__UnionTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2578:1: ( ( ( rule__UnionTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:2579:1: ( ( rule__UnionTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:2579:1: ( ( rule__UnionTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:2580:2: ( rule__UnionTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:2581:2: ( rule__UnionTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:2581:3: rule__UnionTypeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group__3"
    // InternalGraphQL.g:2589:1: rule__UnionTypeDefinition__Group__3 : rule__UnionTypeDefinition__Group__3__Impl rule__UnionTypeDefinition__Group__4 ;
    public final void rule__UnionTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2593:1: ( rule__UnionTypeDefinition__Group__3__Impl rule__UnionTypeDefinition__Group__4 )
            // InternalGraphQL.g:2594:2: rule__UnionTypeDefinition__Group__3__Impl rule__UnionTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__UnionTypeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__3"


    // $ANTLR start "rule__UnionTypeDefinition__Group__3__Impl"
    // InternalGraphQL.g:2601:1: rule__UnionTypeDefinition__Group__3__Impl : ( ( rule__UnionTypeDefinition__DirectivesAssignment_3 )* ) ;
    public final void rule__UnionTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2605:1: ( ( ( rule__UnionTypeDefinition__DirectivesAssignment_3 )* ) )
            // InternalGraphQL.g:2606:1: ( ( rule__UnionTypeDefinition__DirectivesAssignment_3 )* )
            {
            // InternalGraphQL.g:2606:1: ( ( rule__UnionTypeDefinition__DirectivesAssignment_3 )* )
            // InternalGraphQL.g:2607:2: ( rule__UnionTypeDefinition__DirectivesAssignment_3 )*
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getDirectivesAssignment_3()); 
            // InternalGraphQL.g:2608:2: ( rule__UnionTypeDefinition__DirectivesAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_DIRECTIVE_NAME) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGraphQL.g:2608:3: rule__UnionTypeDefinition__DirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UnionTypeDefinition__DirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getUnionTypeDefinitionAccess().getDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group__4"
    // InternalGraphQL.g:2616:1: rule__UnionTypeDefinition__Group__4 : rule__UnionTypeDefinition__Group__4__Impl ;
    public final void rule__UnionTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2620:1: ( rule__UnionTypeDefinition__Group__4__Impl )
            // InternalGraphQL.g:2621:2: rule__UnionTypeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__4"


    // $ANTLR start "rule__UnionTypeDefinition__Group__4__Impl"
    // InternalGraphQL.g:2627:1: rule__UnionTypeDefinition__Group__4__Impl : ( ( rule__UnionTypeDefinition__Group_4__0 )? ) ;
    public final void rule__UnionTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2631:1: ( ( ( rule__UnionTypeDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:2632:1: ( ( rule__UnionTypeDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:2632:1: ( ( rule__UnionTypeDefinition__Group_4__0 )? )
            // InternalGraphQL.g:2633:2: ( rule__UnionTypeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:2634:2: ( rule__UnionTypeDefinition__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGraphQL.g:2634:3: rule__UnionTypeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnionTypeDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4__0"
    // InternalGraphQL.g:2643:1: rule__UnionTypeDefinition__Group_4__0 : rule__UnionTypeDefinition__Group_4__0__Impl rule__UnionTypeDefinition__Group_4__1 ;
    public final void rule__UnionTypeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2647:1: ( rule__UnionTypeDefinition__Group_4__0__Impl rule__UnionTypeDefinition__Group_4__1 )
            // InternalGraphQL.g:2648:2: rule__UnionTypeDefinition__Group_4__0__Impl rule__UnionTypeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__UnionTypeDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4__0"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4__0__Impl"
    // InternalGraphQL.g:2655:1: rule__UnionTypeDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnionTypeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2659:1: ( ( '=' ) )
            // InternalGraphQL.g:2660:1: ( '=' )
            {
            // InternalGraphQL.g:2660:1: ( '=' )
            // InternalGraphQL.g:2661:2: '='
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4__1"
    // InternalGraphQL.g:2670:1: rule__UnionTypeDefinition__Group_4__1 : rule__UnionTypeDefinition__Group_4__1__Impl rule__UnionTypeDefinition__Group_4__2 ;
    public final void rule__UnionTypeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2674:1: ( rule__UnionTypeDefinition__Group_4__1__Impl rule__UnionTypeDefinition__Group_4__2 )
            // InternalGraphQL.g:2675:2: rule__UnionTypeDefinition__Group_4__1__Impl rule__UnionTypeDefinition__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__UnionTypeDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4__1"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4__1__Impl"
    // InternalGraphQL.g:2682:1: rule__UnionTypeDefinition__Group_4__1__Impl : ( ( '|' )? ) ;
    public final void rule__UnionTypeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2686:1: ( ( ( '|' )? ) )
            // InternalGraphQL.g:2687:1: ( ( '|' )? )
            {
            // InternalGraphQL.g:2687:1: ( ( '|' )? )
            // InternalGraphQL.g:2688:2: ( '|' )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_4_1()); 
            // InternalGraphQL.g:2689:2: ( '|' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGraphQL.g:2689:3: '|'
                    {
                    match(input,51,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4__2"
    // InternalGraphQL.g:2697:1: rule__UnionTypeDefinition__Group_4__2 : rule__UnionTypeDefinition__Group_4__2__Impl rule__UnionTypeDefinition__Group_4__3 ;
    public final void rule__UnionTypeDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2701:1: ( rule__UnionTypeDefinition__Group_4__2__Impl rule__UnionTypeDefinition__Group_4__3 )
            // InternalGraphQL.g:2702:2: rule__UnionTypeDefinition__Group_4__2__Impl rule__UnionTypeDefinition__Group_4__3
            {
            pushFollow(FOLLOW_29);
            rule__UnionTypeDefinition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4__2"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4__2__Impl"
    // InternalGraphQL.g:2709:1: rule__UnionTypeDefinition__Group_4__2__Impl : ( ( rule__UnionTypeDefinition__MemberTypesAssignment_4_2 ) ) ;
    public final void rule__UnionTypeDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2713:1: ( ( ( rule__UnionTypeDefinition__MemberTypesAssignment_4_2 ) ) )
            // InternalGraphQL.g:2714:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_4_2 ) )
            {
            // InternalGraphQL.g:2714:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_4_2 ) )
            // InternalGraphQL.g:2715:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_4_2 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_4_2()); 
            // InternalGraphQL.g:2716:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_4_2 )
            // InternalGraphQL.g:2716:3: rule__UnionTypeDefinition__MemberTypesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__MemberTypesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4__3"
    // InternalGraphQL.g:2724:1: rule__UnionTypeDefinition__Group_4__3 : rule__UnionTypeDefinition__Group_4__3__Impl ;
    public final void rule__UnionTypeDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2728:1: ( rule__UnionTypeDefinition__Group_4__3__Impl )
            // InternalGraphQL.g:2729:2: rule__UnionTypeDefinition__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4__3"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4__3__Impl"
    // InternalGraphQL.g:2735:1: rule__UnionTypeDefinition__Group_4__3__Impl : ( ( rule__UnionTypeDefinition__Group_4_3__0 )* ) ;
    public final void rule__UnionTypeDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2739:1: ( ( ( rule__UnionTypeDefinition__Group_4_3__0 )* ) )
            // InternalGraphQL.g:2740:1: ( ( rule__UnionTypeDefinition__Group_4_3__0 )* )
            {
            // InternalGraphQL.g:2740:1: ( ( rule__UnionTypeDefinition__Group_4_3__0 )* )
            // InternalGraphQL.g:2741:2: ( rule__UnionTypeDefinition__Group_4_3__0 )*
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup_4_3()); 
            // InternalGraphQL.g:2742:2: ( rule__UnionTypeDefinition__Group_4_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==51) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGraphQL.g:2742:3: rule__UnionTypeDefinition__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__UnionTypeDefinition__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getUnionTypeDefinitionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4__3__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4_3__0"
    // InternalGraphQL.g:2751:1: rule__UnionTypeDefinition__Group_4_3__0 : rule__UnionTypeDefinition__Group_4_3__0__Impl rule__UnionTypeDefinition__Group_4_3__1 ;
    public final void rule__UnionTypeDefinition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2755:1: ( rule__UnionTypeDefinition__Group_4_3__0__Impl rule__UnionTypeDefinition__Group_4_3__1 )
            // InternalGraphQL.g:2756:2: rule__UnionTypeDefinition__Group_4_3__0__Impl rule__UnionTypeDefinition__Group_4_3__1
            {
            pushFollow(FOLLOW_24);
            rule__UnionTypeDefinition__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4_3__0"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4_3__0__Impl"
    // InternalGraphQL.g:2763:1: rule__UnionTypeDefinition__Group_4_3__0__Impl : ( '|' ) ;
    public final void rule__UnionTypeDefinition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2767:1: ( ( '|' ) )
            // InternalGraphQL.g:2768:1: ( '|' )
            {
            // InternalGraphQL.g:2768:1: ( '|' )
            // InternalGraphQL.g:2769:2: '|'
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_4_3_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4_3__0__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4_3__1"
    // InternalGraphQL.g:2778:1: rule__UnionTypeDefinition__Group_4_3__1 : rule__UnionTypeDefinition__Group_4_3__1__Impl ;
    public final void rule__UnionTypeDefinition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2782:1: ( rule__UnionTypeDefinition__Group_4_3__1__Impl )
            // InternalGraphQL.g:2783:2: rule__UnionTypeDefinition__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4_3__1"


    // $ANTLR start "rule__UnionTypeDefinition__Group_4_3__1__Impl"
    // InternalGraphQL.g:2789:1: rule__UnionTypeDefinition__Group_4_3__1__Impl : ( ( rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1 ) ) ;
    public final void rule__UnionTypeDefinition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2793:1: ( ( ( rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1 ) ) )
            // InternalGraphQL.g:2794:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1 ) )
            {
            // InternalGraphQL.g:2794:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1 ) )
            // InternalGraphQL.g:2795:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_4_3_1()); 
            // InternalGraphQL.g:2796:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1 )
            // InternalGraphQL.g:2796:3: rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_4_3__1__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group__0"
    // InternalGraphQL.g:2805:1: rule__EnumTypeDefinition__Group__0 : rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1 ;
    public final void rule__EnumTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2809:1: ( rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1 )
            // InternalGraphQL.g:2810:2: rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__EnumTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__0"


    // $ANTLR start "rule__EnumTypeDefinition__Group__0__Impl"
    // InternalGraphQL.g:2817:1: rule__EnumTypeDefinition__Group__0__Impl : ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__EnumTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2821:1: ( ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2822:1: ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2822:1: ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2823:2: ( rule__EnumTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2824:2: ( rule__EnumTypeDefinition__DescriptionAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_SL_STRING_VALUE && LA36_0<=RULE_ML_STRING_VALUE)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGraphQL.g:2824:3: rule__EnumTypeDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumTypeDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group__1"
    // InternalGraphQL.g:2832:1: rule__EnumTypeDefinition__Group__1 : rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2 ;
    public final void rule__EnumTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2836:1: ( rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2 )
            // InternalGraphQL.g:2837:2: rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EnumTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__1"


    // $ANTLR start "rule__EnumTypeDefinition__Group__1__Impl"
    // InternalGraphQL.g:2844:1: rule__EnumTypeDefinition__Group__1__Impl : ( 'enum' ) ;
    public final void rule__EnumTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2848:1: ( ( 'enum' ) )
            // InternalGraphQL.g:2849:1: ( 'enum' )
            {
            // InternalGraphQL.g:2849:1: ( 'enum' )
            // InternalGraphQL.g:2850:2: 'enum'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group__2"
    // InternalGraphQL.g:2859:1: rule__EnumTypeDefinition__Group__2 : rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3 ;
    public final void rule__EnumTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2863:1: ( rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3 )
            // InternalGraphQL.g:2864:2: rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__EnumTypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__2"


    // $ANTLR start "rule__EnumTypeDefinition__Group__2__Impl"
    // InternalGraphQL.g:2871:1: rule__EnumTypeDefinition__Group__2__Impl : ( ( rule__EnumTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2875:1: ( ( ( rule__EnumTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:2876:1: ( ( rule__EnumTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:2876:1: ( ( rule__EnumTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:2877:2: ( rule__EnumTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:2878:2: ( rule__EnumTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:2878:3: rule__EnumTypeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group__3"
    // InternalGraphQL.g:2886:1: rule__EnumTypeDefinition__Group__3 : rule__EnumTypeDefinition__Group__3__Impl rule__EnumTypeDefinition__Group__4 ;
    public final void rule__EnumTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2890:1: ( rule__EnumTypeDefinition__Group__3__Impl rule__EnumTypeDefinition__Group__4 )
            // InternalGraphQL.g:2891:2: rule__EnumTypeDefinition__Group__3__Impl rule__EnumTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__EnumTypeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__3"


    // $ANTLR start "rule__EnumTypeDefinition__Group__3__Impl"
    // InternalGraphQL.g:2898:1: rule__EnumTypeDefinition__Group__3__Impl : ( ( rule__EnumTypeDefinition__DirectivesAssignment_3 )* ) ;
    public final void rule__EnumTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2902:1: ( ( ( rule__EnumTypeDefinition__DirectivesAssignment_3 )* ) )
            // InternalGraphQL.g:2903:1: ( ( rule__EnumTypeDefinition__DirectivesAssignment_3 )* )
            {
            // InternalGraphQL.g:2903:1: ( ( rule__EnumTypeDefinition__DirectivesAssignment_3 )* )
            // InternalGraphQL.g:2904:2: ( rule__EnumTypeDefinition__DirectivesAssignment_3 )*
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getDirectivesAssignment_3()); 
            // InternalGraphQL.g:2905:2: ( rule__EnumTypeDefinition__DirectivesAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_DIRECTIVE_NAME) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGraphQL.g:2905:3: rule__EnumTypeDefinition__DirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EnumTypeDefinition__DirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getEnumTypeDefinitionAccess().getDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group__4"
    // InternalGraphQL.g:2913:1: rule__EnumTypeDefinition__Group__4 : rule__EnumTypeDefinition__Group__4__Impl ;
    public final void rule__EnumTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2917:1: ( rule__EnumTypeDefinition__Group__4__Impl )
            // InternalGraphQL.g:2918:2: rule__EnumTypeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__4"


    // $ANTLR start "rule__EnumTypeDefinition__Group__4__Impl"
    // InternalGraphQL.g:2924:1: rule__EnumTypeDefinition__Group__4__Impl : ( ( rule__EnumTypeDefinition__Group_4__0 )? ) ;
    public final void rule__EnumTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2928:1: ( ( ( rule__EnumTypeDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:2929:1: ( ( rule__EnumTypeDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:2929:1: ( ( rule__EnumTypeDefinition__Group_4__0 )? )
            // InternalGraphQL.g:2930:2: ( rule__EnumTypeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:2931:2: ( rule__EnumTypeDefinition__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGraphQL.g:2931:3: rule__EnumTypeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumTypeDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group_4__0"
    // InternalGraphQL.g:2940:1: rule__EnumTypeDefinition__Group_4__0 : rule__EnumTypeDefinition__Group_4__0__Impl rule__EnumTypeDefinition__Group_4__1 ;
    public final void rule__EnumTypeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2944:1: ( rule__EnumTypeDefinition__Group_4__0__Impl rule__EnumTypeDefinition__Group_4__1 )
            // InternalGraphQL.g:2945:2: rule__EnumTypeDefinition__Group_4__0__Impl rule__EnumTypeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__EnumTypeDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_4__0"


    // $ANTLR start "rule__EnumTypeDefinition__Group_4__0__Impl"
    // InternalGraphQL.g:2952:1: rule__EnumTypeDefinition__Group_4__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2956:1: ( ( '{' ) )
            // InternalGraphQL.g:2957:1: ( '{' )
            {
            // InternalGraphQL.g:2957:1: ( '{' )
            // InternalGraphQL.g:2958:2: '{'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group_4__1"
    // InternalGraphQL.g:2967:1: rule__EnumTypeDefinition__Group_4__1 : rule__EnumTypeDefinition__Group_4__1__Impl rule__EnumTypeDefinition__Group_4__2 ;
    public final void rule__EnumTypeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2971:1: ( rule__EnumTypeDefinition__Group_4__1__Impl rule__EnumTypeDefinition__Group_4__2 )
            // InternalGraphQL.g:2972:2: rule__EnumTypeDefinition__Group_4__1__Impl rule__EnumTypeDefinition__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__EnumTypeDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_4__1"


    // $ANTLR start "rule__EnumTypeDefinition__Group_4__1__Impl"
    // InternalGraphQL.g:2979:1: rule__EnumTypeDefinition__Group_4__1__Impl : ( ( rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1 )* ) ;
    public final void rule__EnumTypeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2983:1: ( ( ( rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1 )* ) )
            // InternalGraphQL.g:2984:1: ( ( rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1 )* )
            {
            // InternalGraphQL.g:2984:1: ( ( rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1 )* )
            // InternalGraphQL.g:2985:2: ( rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1 )*
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getEnumValuesDefinitionAssignment_4_1()); 
            // InternalGraphQL.g:2986:2: ( rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_SL_STRING_VALUE && LA39_0<=RULE_NAME)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGraphQL.g:2986:3: rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getEnumTypeDefinitionAccess().getEnumValuesDefinitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group_4__2"
    // InternalGraphQL.g:2994:1: rule__EnumTypeDefinition__Group_4__2 : rule__EnumTypeDefinition__Group_4__2__Impl ;
    public final void rule__EnumTypeDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2998:1: ( rule__EnumTypeDefinition__Group_4__2__Impl )
            // InternalGraphQL.g:2999:2: rule__EnumTypeDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_4__2"


    // $ANTLR start "rule__EnumTypeDefinition__Group_4__2__Impl"
    // InternalGraphQL.g:3005:1: rule__EnumTypeDefinition__Group_4__2__Impl : ( '}' ) ;
    public final void rule__EnumTypeDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3009:1: ( ( '}' ) )
            // InternalGraphQL.g:3010:1: ( '}' )
            {
            // InternalGraphQL.g:3010:1: ( '}' )
            // InternalGraphQL.g:3011:2: '}'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__EnumValueDefinition__Group__0"
    // InternalGraphQL.g:3021:1: rule__EnumValueDefinition__Group__0 : rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1 ;
    public final void rule__EnumValueDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3025:1: ( rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1 )
            // InternalGraphQL.g:3026:2: rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__EnumValueDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValueDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueDefinition__Group__0"


    // $ANTLR start "rule__EnumValueDefinition__Group__0__Impl"
    // InternalGraphQL.g:3033:1: rule__EnumValueDefinition__Group__0__Impl : ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__EnumValueDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3037:1: ( ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:3038:1: ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:3038:1: ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:3039:2: ( rule__EnumValueDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:3040:2: ( rule__EnumValueDefinition__DescriptionAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_SL_STRING_VALUE && LA40_0<=RULE_ML_STRING_VALUE)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGraphQL.g:3040:3: rule__EnumValueDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumValueDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumValueDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueDefinition__Group__0__Impl"


    // $ANTLR start "rule__EnumValueDefinition__Group__1"
    // InternalGraphQL.g:3048:1: rule__EnumValueDefinition__Group__1 : rule__EnumValueDefinition__Group__1__Impl ;
    public final void rule__EnumValueDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3052:1: ( rule__EnumValueDefinition__Group__1__Impl )
            // InternalGraphQL.g:3053:2: rule__EnumValueDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumValueDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueDefinition__Group__1"


    // $ANTLR start "rule__EnumValueDefinition__Group__1__Impl"
    // InternalGraphQL.g:3059:1: rule__EnumValueDefinition__Group__1__Impl : ( ( rule__EnumValueDefinition__NameAssignment_1 ) ) ;
    public final void rule__EnumValueDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3063:1: ( ( ( rule__EnumValueDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:3064:1: ( ( rule__EnumValueDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:3064:1: ( ( rule__EnumValueDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:3065:2: ( rule__EnumValueDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:3066:2: ( rule__EnumValueDefinition__NameAssignment_1 )
            // InternalGraphQL.g:3066:3: rule__EnumValueDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumValueDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueDefinition__Group__1__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__0"
    // InternalGraphQL.g:3075:1: rule__InputObjectTypeDefinition__Group__0 : rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1 ;
    public final void rule__InputObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3079:1: ( rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1 )
            // InternalGraphQL.g:3080:2: rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__InputObjectTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__0"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__0__Impl"
    // InternalGraphQL.g:3087:1: rule__InputObjectTypeDefinition__Group__0__Impl : ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InputObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3091:1: ( ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:3092:1: ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:3092:1: ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:3093:2: ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:3094:2: ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_SL_STRING_VALUE && LA41_0<=RULE_ML_STRING_VALUE)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGraphQL.g:3094:3: rule__InputObjectTypeDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputObjectTypeDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__1"
    // InternalGraphQL.g:3102:1: rule__InputObjectTypeDefinition__Group__1 : rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2 ;
    public final void rule__InputObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3106:1: ( rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2 )
            // InternalGraphQL.g:3107:2: rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__InputObjectTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__1"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__1__Impl"
    // InternalGraphQL.g:3114:1: rule__InputObjectTypeDefinition__Group__1__Impl : ( 'input' ) ;
    public final void rule__InputObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3118:1: ( ( 'input' ) )
            // InternalGraphQL.g:3119:1: ( 'input' )
            {
            // InternalGraphQL.g:3119:1: ( 'input' )
            // InternalGraphQL.g:3120:2: 'input'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__2"
    // InternalGraphQL.g:3129:1: rule__InputObjectTypeDefinition__Group__2 : rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3 ;
    public final void rule__InputObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3133:1: ( rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3 )
            // InternalGraphQL.g:3134:2: rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__InputObjectTypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__2"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__2__Impl"
    // InternalGraphQL.g:3141:1: rule__InputObjectTypeDefinition__Group__2__Impl : ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__InputObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3145:1: ( ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:3146:1: ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:3146:1: ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:3147:2: ( rule__InputObjectTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:3148:2: ( rule__InputObjectTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:3148:3: rule__InputObjectTypeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__3"
    // InternalGraphQL.g:3156:1: rule__InputObjectTypeDefinition__Group__3 : rule__InputObjectTypeDefinition__Group__3__Impl rule__InputObjectTypeDefinition__Group__4 ;
    public final void rule__InputObjectTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3160:1: ( rule__InputObjectTypeDefinition__Group__3__Impl rule__InputObjectTypeDefinition__Group__4 )
            // InternalGraphQL.g:3161:2: rule__InputObjectTypeDefinition__Group__3__Impl rule__InputObjectTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__InputObjectTypeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__3"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__3__Impl"
    // InternalGraphQL.g:3168:1: rule__InputObjectTypeDefinition__Group__3__Impl : ( ( rule__InputObjectTypeDefinition__DirectivesAssignment_3 )* ) ;
    public final void rule__InputObjectTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3172:1: ( ( ( rule__InputObjectTypeDefinition__DirectivesAssignment_3 )* ) )
            // InternalGraphQL.g:3173:1: ( ( rule__InputObjectTypeDefinition__DirectivesAssignment_3 )* )
            {
            // InternalGraphQL.g:3173:1: ( ( rule__InputObjectTypeDefinition__DirectivesAssignment_3 )* )
            // InternalGraphQL.g:3174:2: ( rule__InputObjectTypeDefinition__DirectivesAssignment_3 )*
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getDirectivesAssignment_3()); 
            // InternalGraphQL.g:3175:2: ( rule__InputObjectTypeDefinition__DirectivesAssignment_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_DIRECTIVE_NAME) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGraphQL.g:3175:3: rule__InputObjectTypeDefinition__DirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InputObjectTypeDefinition__DirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__4"
    // InternalGraphQL.g:3183:1: rule__InputObjectTypeDefinition__Group__4 : rule__InputObjectTypeDefinition__Group__4__Impl ;
    public final void rule__InputObjectTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3187:1: ( rule__InputObjectTypeDefinition__Group__4__Impl )
            // InternalGraphQL.g:3188:2: rule__InputObjectTypeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__4"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__4__Impl"
    // InternalGraphQL.g:3194:1: rule__InputObjectTypeDefinition__Group__4__Impl : ( ( rule__InputObjectTypeDefinition__Group_4__0 )? ) ;
    public final void rule__InputObjectTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3198:1: ( ( ( rule__InputObjectTypeDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:3199:1: ( ( rule__InputObjectTypeDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:3199:1: ( ( rule__InputObjectTypeDefinition__Group_4__0 )? )
            // InternalGraphQL.g:3200:2: ( rule__InputObjectTypeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:3201:2: ( rule__InputObjectTypeDefinition__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGraphQL.g:3201:3: rule__InputObjectTypeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputObjectTypeDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_4__0"
    // InternalGraphQL.g:3210:1: rule__InputObjectTypeDefinition__Group_4__0 : rule__InputObjectTypeDefinition__Group_4__0__Impl rule__InputObjectTypeDefinition__Group_4__1 ;
    public final void rule__InputObjectTypeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3214:1: ( rule__InputObjectTypeDefinition__Group_4__0__Impl rule__InputObjectTypeDefinition__Group_4__1 )
            // InternalGraphQL.g:3215:2: rule__InputObjectTypeDefinition__Group_4__0__Impl rule__InputObjectTypeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__InputObjectTypeDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_4__0"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_4__0__Impl"
    // InternalGraphQL.g:3222:1: rule__InputObjectTypeDefinition__Group_4__0__Impl : ( '{' ) ;
    public final void rule__InputObjectTypeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3226:1: ( ( '{' ) )
            // InternalGraphQL.g:3227:1: ( '{' )
            {
            // InternalGraphQL.g:3227:1: ( '{' )
            // InternalGraphQL.g:3228:2: '{'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_4__1"
    // InternalGraphQL.g:3237:1: rule__InputObjectTypeDefinition__Group_4__1 : rule__InputObjectTypeDefinition__Group_4__1__Impl rule__InputObjectTypeDefinition__Group_4__2 ;
    public final void rule__InputObjectTypeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3241:1: ( rule__InputObjectTypeDefinition__Group_4__1__Impl rule__InputObjectTypeDefinition__Group_4__2 )
            // InternalGraphQL.g:3242:2: rule__InputObjectTypeDefinition__Group_4__1__Impl rule__InputObjectTypeDefinition__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__InputObjectTypeDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_4__1"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_4__1__Impl"
    // InternalGraphQL.g:3249:1: rule__InputObjectTypeDefinition__Group_4__1__Impl : ( ( rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1 )* ) ;
    public final void rule__InputObjectTypeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3253:1: ( ( ( rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1 )* ) )
            // InternalGraphQL.g:3254:1: ( ( rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1 )* )
            {
            // InternalGraphQL.g:3254:1: ( ( rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1 )* )
            // InternalGraphQL.g:3255:2: ( rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1 )*
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputFieldsDefinitionAssignment_4_1()); 
            // InternalGraphQL.g:3256:2: ( rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_SL_STRING_VALUE && LA44_0<=RULE_NAME)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGraphQL.g:3256:3: rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getInputFieldsDefinitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_4__2"
    // InternalGraphQL.g:3264:1: rule__InputObjectTypeDefinition__Group_4__2 : rule__InputObjectTypeDefinition__Group_4__2__Impl ;
    public final void rule__InputObjectTypeDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3268:1: ( rule__InputObjectTypeDefinition__Group_4__2__Impl )
            // InternalGraphQL.g:3269:2: rule__InputObjectTypeDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_4__2"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_4__2__Impl"
    // InternalGraphQL.g:3275:1: rule__InputObjectTypeDefinition__Group_4__2__Impl : ( '}' ) ;
    public final void rule__InputObjectTypeDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3279:1: ( ( '}' ) )
            // InternalGraphQL.g:3280:1: ( '}' )
            {
            // InternalGraphQL.g:3280:1: ( '}' )
            // InternalGraphQL.g:3281:2: '}'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__InputValueDefinition__Group__0"
    // InternalGraphQL.g:3291:1: rule__InputValueDefinition__Group__0 : rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1 ;
    public final void rule__InputValueDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3295:1: ( rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1 )
            // InternalGraphQL.g:3296:2: rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__InputValueDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__0"


    // $ANTLR start "rule__InputValueDefinition__Group__0__Impl"
    // InternalGraphQL.g:3303:1: rule__InputValueDefinition__Group__0__Impl : ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InputValueDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3307:1: ( ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:3308:1: ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:3308:1: ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:3309:2: ( rule__InputValueDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInputValueDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:3310:2: ( rule__InputValueDefinition__DescriptionAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_SL_STRING_VALUE && LA45_0<=RULE_ML_STRING_VALUE)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGraphQL.g:3310:3: rule__InputValueDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputValueDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputValueDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__0__Impl"


    // $ANTLR start "rule__InputValueDefinition__Group__1"
    // InternalGraphQL.g:3318:1: rule__InputValueDefinition__Group__1 : rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2 ;
    public final void rule__InputValueDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3322:1: ( rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2 )
            // InternalGraphQL.g:3323:2: rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__InputValueDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__1"


    // $ANTLR start "rule__InputValueDefinition__Group__1__Impl"
    // InternalGraphQL.g:3330:1: rule__InputValueDefinition__Group__1__Impl : ( ( rule__InputValueDefinition__NameAssignment_1 ) ) ;
    public final void rule__InputValueDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3334:1: ( ( ( rule__InputValueDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:3335:1: ( ( rule__InputValueDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:3335:1: ( ( rule__InputValueDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:3336:2: ( rule__InputValueDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:3337:2: ( rule__InputValueDefinition__NameAssignment_1 )
            // InternalGraphQL.g:3337:3: rule__InputValueDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputValueDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__1__Impl"


    // $ANTLR start "rule__InputValueDefinition__Group__2"
    // InternalGraphQL.g:3345:1: rule__InputValueDefinition__Group__2 : rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3 ;
    public final void rule__InputValueDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3349:1: ( rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3 )
            // InternalGraphQL.g:3350:2: rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__InputValueDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__2"


    // $ANTLR start "rule__InputValueDefinition__Group__2__Impl"
    // InternalGraphQL.g:3357:1: rule__InputValueDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__InputValueDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3361:1: ( ( ':' ) )
            // InternalGraphQL.g:3362:1: ( ':' )
            {
            // InternalGraphQL.g:3362:1: ( ':' )
            // InternalGraphQL.g:3363:2: ':'
            {
             before(grammarAccess.getInputValueDefinitionAccess().getColonKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInputValueDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__2__Impl"


    // $ANTLR start "rule__InputValueDefinition__Group__3"
    // InternalGraphQL.g:3372:1: rule__InputValueDefinition__Group__3 : rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4 ;
    public final void rule__InputValueDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3376:1: ( rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4 )
            // InternalGraphQL.g:3377:2: rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__InputValueDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__3"


    // $ANTLR start "rule__InputValueDefinition__Group__3__Impl"
    // InternalGraphQL.g:3384:1: rule__InputValueDefinition__Group__3__Impl : ( ( rule__InputValueDefinition__TypeAssignment_3 ) ) ;
    public final void rule__InputValueDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3388:1: ( ( ( rule__InputValueDefinition__TypeAssignment_3 ) ) )
            // InternalGraphQL.g:3389:1: ( ( rule__InputValueDefinition__TypeAssignment_3 ) )
            {
            // InternalGraphQL.g:3389:1: ( ( rule__InputValueDefinition__TypeAssignment_3 ) )
            // InternalGraphQL.g:3390:2: ( rule__InputValueDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getTypeAssignment_3()); 
            // InternalGraphQL.g:3391:2: ( rule__InputValueDefinition__TypeAssignment_3 )
            // InternalGraphQL.g:3391:3: rule__InputValueDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputValueDefinitionAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__3__Impl"


    // $ANTLR start "rule__InputValueDefinition__Group__4"
    // InternalGraphQL.g:3399:1: rule__InputValueDefinition__Group__4 : rule__InputValueDefinition__Group__4__Impl ;
    public final void rule__InputValueDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3403:1: ( rule__InputValueDefinition__Group__4__Impl )
            // InternalGraphQL.g:3404:2: rule__InputValueDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__4"


    // $ANTLR start "rule__InputValueDefinition__Group__4__Impl"
    // InternalGraphQL.g:3410:1: rule__InputValueDefinition__Group__4__Impl : ( ( rule__InputValueDefinition__Group_4__0 )? ) ;
    public final void rule__InputValueDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3414:1: ( ( ( rule__InputValueDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:3415:1: ( ( rule__InputValueDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:3415:1: ( ( rule__InputValueDefinition__Group_4__0 )? )
            // InternalGraphQL.g:3416:2: ( rule__InputValueDefinition__Group_4__0 )?
            {
             before(grammarAccess.getInputValueDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:3417:2: ( rule__InputValueDefinition__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGraphQL.g:3417:3: rule__InputValueDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputValueDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputValueDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group__4__Impl"


    // $ANTLR start "rule__InputValueDefinition__Group_4__0"
    // InternalGraphQL.g:3426:1: rule__InputValueDefinition__Group_4__0 : rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1 ;
    public final void rule__InputValueDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3430:1: ( rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1 )
            // InternalGraphQL.g:3431:2: rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__InputValueDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group_4__0"


    // $ANTLR start "rule__InputValueDefinition__Group_4__0__Impl"
    // InternalGraphQL.g:3438:1: rule__InputValueDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__InputValueDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3442:1: ( ( '=' ) )
            // InternalGraphQL.g:3443:1: ( '=' )
            {
            // InternalGraphQL.g:3443:1: ( '=' )
            // InternalGraphQL.g:3444:2: '='
            {
             before(grammarAccess.getInputValueDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getInputValueDefinitionAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__InputValueDefinition__Group_4__1"
    // InternalGraphQL.g:3453:1: rule__InputValueDefinition__Group_4__1 : rule__InputValueDefinition__Group_4__1__Impl ;
    public final void rule__InputValueDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3457:1: ( rule__InputValueDefinition__Group_4__1__Impl )
            // InternalGraphQL.g:3458:2: rule__InputValueDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group_4__1"


    // $ANTLR start "rule__InputValueDefinition__Group_4__1__Impl"
    // InternalGraphQL.g:3464:1: rule__InputValueDefinition__Group_4__1__Impl : ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) ) ;
    public final void rule__InputValueDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3468:1: ( ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) ) )
            // InternalGraphQL.g:3469:1: ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) )
            {
            // InternalGraphQL.g:3469:1: ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) )
            // InternalGraphQL.g:3470:2: ( rule__InputValueDefinition__DefaultValueAssignment_4_1 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getDefaultValueAssignment_4_1()); 
            // InternalGraphQL.g:3471:2: ( rule__InputValueDefinition__DefaultValueAssignment_4_1 )
            // InternalGraphQL.g:3471:3: rule__InputValueDefinition__DefaultValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InputValueDefinition__DefaultValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInputValueDefinitionAccess().getDefaultValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__NamedType__Group__0"
    // InternalGraphQL.g:3480:1: rule__NamedType__Group__0 : rule__NamedType__Group__0__Impl rule__NamedType__Group__1 ;
    public final void rule__NamedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3484:1: ( rule__NamedType__Group__0__Impl rule__NamedType__Group__1 )
            // InternalGraphQL.g:3485:2: rule__NamedType__Group__0__Impl rule__NamedType__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__NamedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedType__Group__0"


    // $ANTLR start "rule__NamedType__Group__0__Impl"
    // InternalGraphQL.g:3492:1: rule__NamedType__Group__0__Impl : ( ( rule__NamedType__TypeDefinitionAssignment_0 ) ) ;
    public final void rule__NamedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3496:1: ( ( ( rule__NamedType__TypeDefinitionAssignment_0 ) ) )
            // InternalGraphQL.g:3497:1: ( ( rule__NamedType__TypeDefinitionAssignment_0 ) )
            {
            // InternalGraphQL.g:3497:1: ( ( rule__NamedType__TypeDefinitionAssignment_0 ) )
            // InternalGraphQL.g:3498:2: ( rule__NamedType__TypeDefinitionAssignment_0 )
            {
             before(grammarAccess.getNamedTypeAccess().getTypeDefinitionAssignment_0()); 
            // InternalGraphQL.g:3499:2: ( rule__NamedType__TypeDefinitionAssignment_0 )
            // InternalGraphQL.g:3499:3: rule__NamedType__TypeDefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedType__TypeDefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedTypeAccess().getTypeDefinitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedType__Group__0__Impl"


    // $ANTLR start "rule__NamedType__Group__1"
    // InternalGraphQL.g:3507:1: rule__NamedType__Group__1 : rule__NamedType__Group__1__Impl ;
    public final void rule__NamedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3511:1: ( rule__NamedType__Group__1__Impl )
            // InternalGraphQL.g:3512:2: rule__NamedType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedType__Group__1"


    // $ANTLR start "rule__NamedType__Group__1__Impl"
    // InternalGraphQL.g:3518:1: rule__NamedType__Group__1__Impl : ( ( rule__NamedType__NonNullAssignment_1 )? ) ;
    public final void rule__NamedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3522:1: ( ( ( rule__NamedType__NonNullAssignment_1 )? ) )
            // InternalGraphQL.g:3523:1: ( ( rule__NamedType__NonNullAssignment_1 )? )
            {
            // InternalGraphQL.g:3523:1: ( ( rule__NamedType__NonNullAssignment_1 )? )
            // InternalGraphQL.g:3524:2: ( rule__NamedType__NonNullAssignment_1 )?
            {
             before(grammarAccess.getNamedTypeAccess().getNonNullAssignment_1()); 
            // InternalGraphQL.g:3525:2: ( rule__NamedType__NonNullAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGraphQL.g:3525:3: rule__NamedType__NonNullAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedType__NonNullAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedTypeAccess().getNonNullAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedType__Group__1__Impl"


    // $ANTLR start "rule__ListType__Group__0"
    // InternalGraphQL.g:3534:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3538:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // InternalGraphQL.g:3539:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0"


    // $ANTLR start "rule__ListType__Group__0__Impl"
    // InternalGraphQL.g:3546:1: rule__ListType__Group__0__Impl : ( '[' ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3550:1: ( ( '[' ) )
            // InternalGraphQL.g:3551:1: ( '[' )
            {
            // InternalGraphQL.g:3551:1: ( '[' )
            // InternalGraphQL.g:3552:2: '['
            {
             before(grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0__Impl"


    // $ANTLR start "rule__ListType__Group__1"
    // InternalGraphQL.g:3561:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3565:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // InternalGraphQL.g:3566:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__ListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1"


    // $ANTLR start "rule__ListType__Group__1__Impl"
    // InternalGraphQL.g:3573:1: rule__ListType__Group__1__Impl : ( ( rule__ListType__TypeAssignment_1 ) ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3577:1: ( ( ( rule__ListType__TypeAssignment_1 ) ) )
            // InternalGraphQL.g:3578:1: ( ( rule__ListType__TypeAssignment_1 ) )
            {
            // InternalGraphQL.g:3578:1: ( ( rule__ListType__TypeAssignment_1 ) )
            // InternalGraphQL.g:3579:2: ( rule__ListType__TypeAssignment_1 )
            {
             before(grammarAccess.getListTypeAccess().getTypeAssignment_1()); 
            // InternalGraphQL.g:3580:2: ( rule__ListType__TypeAssignment_1 )
            // InternalGraphQL.g:3580:3: rule__ListType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1__Impl"


    // $ANTLR start "rule__ListType__Group__2"
    // InternalGraphQL.g:3588:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3592:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // InternalGraphQL.g:3593:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2"


    // $ANTLR start "rule__ListType__Group__2__Impl"
    // InternalGraphQL.g:3600:1: rule__ListType__Group__2__Impl : ( ']' ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3604:1: ( ( ']' ) )
            // InternalGraphQL.g:3605:1: ( ']' )
            {
            // InternalGraphQL.g:3605:1: ( ']' )
            // InternalGraphQL.g:3606:2: ']'
            {
             before(grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2__Impl"


    // $ANTLR start "rule__ListType__Group__3"
    // InternalGraphQL.g:3615:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3619:1: ( rule__ListType__Group__3__Impl )
            // InternalGraphQL.g:3620:2: rule__ListType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__3"


    // $ANTLR start "rule__ListType__Group__3__Impl"
    // InternalGraphQL.g:3626:1: rule__ListType__Group__3__Impl : ( ( rule__ListType__NonNullAssignment_3 )? ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3630:1: ( ( ( rule__ListType__NonNullAssignment_3 )? ) )
            // InternalGraphQL.g:3631:1: ( ( rule__ListType__NonNullAssignment_3 )? )
            {
            // InternalGraphQL.g:3631:1: ( ( rule__ListType__NonNullAssignment_3 )? )
            // InternalGraphQL.g:3632:2: ( rule__ListType__NonNullAssignment_3 )?
            {
             before(grammarAccess.getListTypeAccess().getNonNullAssignment_3()); 
            // InternalGraphQL.g:3633:2: ( rule__ListType__NonNullAssignment_3 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGraphQL.g:3633:3: rule__ListType__NonNullAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListType__NonNullAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListTypeAccess().getNonNullAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__3__Impl"


    // $ANTLR start "rule__ObjectValue__Group__0"
    // InternalGraphQL.g:3642:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3646:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGraphQL.g:3647:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ObjectValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0"


    // $ANTLR start "rule__ObjectValue__Group__0__Impl"
    // InternalGraphQL.g:3654:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3658:1: ( ( () ) )
            // InternalGraphQL.g:3659:1: ( () )
            {
            // InternalGraphQL.g:3659:1: ( () )
            // InternalGraphQL.g:3660:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalGraphQL.g:3661:2: ()
            // InternalGraphQL.g:3661:3: 
            {
            }

             after(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group__1"
    // InternalGraphQL.g:3669:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3673:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGraphQL.g:3674:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__ObjectValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1"


    // $ANTLR start "rule__ObjectValue__Group__1__Impl"
    // InternalGraphQL.g:3681:1: rule__ObjectValue__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3685:1: ( ( '{' ) )
            // InternalGraphQL.g:3686:1: ( '{' )
            {
            // InternalGraphQL.g:3686:1: ( '{' )
            // InternalGraphQL.g:3687:2: '{'
            {
             before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group__2"
    // InternalGraphQL.g:3696:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3700:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGraphQL.g:3701:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__ObjectValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2"


    // $ANTLR start "rule__ObjectValue__Group__2__Impl"
    // InternalGraphQL.g:3708:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__FieldsAssignment_2 )* ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3712:1: ( ( ( rule__ObjectValue__FieldsAssignment_2 )* ) )
            // InternalGraphQL.g:3713:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            {
            // InternalGraphQL.g:3713:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            // InternalGraphQL.g:3714:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            {
             before(grammarAccess.getObjectValueAccess().getFieldsAssignment_2()); 
            // InternalGraphQL.g:3715:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_NAME) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGraphQL.g:3715:3: rule__ObjectValue__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__ObjectValue__FieldsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getObjectValueAccess().getFieldsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2__Impl"


    // $ANTLR start "rule__ObjectValue__Group__3"
    // InternalGraphQL.g:3723:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3727:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGraphQL.g:3728:2: rule__ObjectValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3"


    // $ANTLR start "rule__ObjectValue__Group__3__Impl"
    // InternalGraphQL.g:3734:1: rule__ObjectValue__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3738:1: ( ( '}' ) )
            // InternalGraphQL.g:3739:1: ( '}' )
            {
            // InternalGraphQL.g:3739:1: ( '}' )
            // InternalGraphQL.g:3740:2: '}'
            {
             before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3__Impl"


    // $ANTLR start "rule__ObjectField__Group__0"
    // InternalGraphQL.g:3750:1: rule__ObjectField__Group__0 : rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 ;
    public final void rule__ObjectField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3754:1: ( rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 )
            // InternalGraphQL.g:3755:2: rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ObjectField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__0"


    // $ANTLR start "rule__ObjectField__Group__0__Impl"
    // InternalGraphQL.g:3762:1: rule__ObjectField__Group__0__Impl : ( ( rule__ObjectField__FieldDefinitionAssignment_0 ) ) ;
    public final void rule__ObjectField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3766:1: ( ( ( rule__ObjectField__FieldDefinitionAssignment_0 ) ) )
            // InternalGraphQL.g:3767:1: ( ( rule__ObjectField__FieldDefinitionAssignment_0 ) )
            {
            // InternalGraphQL.g:3767:1: ( ( rule__ObjectField__FieldDefinitionAssignment_0 ) )
            // InternalGraphQL.g:3768:2: ( rule__ObjectField__FieldDefinitionAssignment_0 )
            {
             before(grammarAccess.getObjectFieldAccess().getFieldDefinitionAssignment_0()); 
            // InternalGraphQL.g:3769:2: ( rule__ObjectField__FieldDefinitionAssignment_0 )
            // InternalGraphQL.g:3769:3: rule__ObjectField__FieldDefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__FieldDefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFieldAccess().getFieldDefinitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__0__Impl"


    // $ANTLR start "rule__ObjectField__Group__1"
    // InternalGraphQL.g:3777:1: rule__ObjectField__Group__1 : rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 ;
    public final void rule__ObjectField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3781:1: ( rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 )
            // InternalGraphQL.g:3782:2: rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__ObjectField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__1"


    // $ANTLR start "rule__ObjectField__Group__1__Impl"
    // InternalGraphQL.g:3789:1: rule__ObjectField__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjectField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3793:1: ( ( ':' ) )
            // InternalGraphQL.g:3794:1: ( ':' )
            {
            // InternalGraphQL.g:3794:1: ( ':' )
            // InternalGraphQL.g:3795:2: ':'
            {
             before(grammarAccess.getObjectFieldAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getObjectFieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__1__Impl"


    // $ANTLR start "rule__ObjectField__Group__2"
    // InternalGraphQL.g:3804:1: rule__ObjectField__Group__2 : rule__ObjectField__Group__2__Impl ;
    public final void rule__ObjectField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3808:1: ( rule__ObjectField__Group__2__Impl )
            // InternalGraphQL.g:3809:2: rule__ObjectField__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__2"


    // $ANTLR start "rule__ObjectField__Group__2__Impl"
    // InternalGraphQL.g:3815:1: rule__ObjectField__Group__2__Impl : ( ( rule__ObjectField__ValueAssignment_2 ) ) ;
    public final void rule__ObjectField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3819:1: ( ( ( rule__ObjectField__ValueAssignment_2 ) ) )
            // InternalGraphQL.g:3820:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            {
            // InternalGraphQL.g:3820:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            // InternalGraphQL.g:3821:2: ( rule__ObjectField__ValueAssignment_2 )
            {
             before(grammarAccess.getObjectFieldAccess().getValueAssignment_2()); 
            // InternalGraphQL.g:3822:2: ( rule__ObjectField__ValueAssignment_2 )
            // InternalGraphQL.g:3822:3: rule__ObjectField__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectFieldAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__2__Impl"


    // $ANTLR start "rule__ListValue__Group__0"
    // InternalGraphQL.g:3831:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3835:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalGraphQL.g:3836:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ListValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0"


    // $ANTLR start "rule__ListValue__Group__0__Impl"
    // InternalGraphQL.g:3843:1: rule__ListValue__Group__0__Impl : ( () ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3847:1: ( ( () ) )
            // InternalGraphQL.g:3848:1: ( () )
            {
            // InternalGraphQL.g:3848:1: ( () )
            // InternalGraphQL.g:3849:2: ()
            {
             before(grammarAccess.getListValueAccess().getListValueAction_0()); 
            // InternalGraphQL.g:3850:2: ()
            // InternalGraphQL.g:3850:3: 
            {
            }

             after(grammarAccess.getListValueAccess().getListValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0__Impl"


    // $ANTLR start "rule__ListValue__Group__1"
    // InternalGraphQL.g:3858:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3862:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalGraphQL.g:3863:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__ListValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1"


    // $ANTLR start "rule__ListValue__Group__1__Impl"
    // InternalGraphQL.g:3870:1: rule__ListValue__Group__1__Impl : ( '[' ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3874:1: ( ( '[' ) )
            // InternalGraphQL.g:3875:1: ( '[' )
            {
            // InternalGraphQL.g:3875:1: ( '[' )
            // InternalGraphQL.g:3876:2: '['
            {
             before(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group__2"
    // InternalGraphQL.g:3885:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3889:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalGraphQL.g:3890:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__ListValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2"


    // $ANTLR start "rule__ListValue__Group__2__Impl"
    // InternalGraphQL.g:3897:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__ValuesAssignment_2 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3901:1: ( ( ( rule__ListValue__ValuesAssignment_2 )* ) )
            // InternalGraphQL.g:3902:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            {
            // InternalGraphQL.g:3902:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            // InternalGraphQL.g:3903:2: ( rule__ListValue__ValuesAssignment_2 )*
            {
             before(grammarAccess.getListValueAccess().getValuesAssignment_2()); 
            // InternalGraphQL.g:3904:2: ( rule__ListValue__ValuesAssignment_2 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_SL_STRING_VALUE && LA50_0<=RULE_FLOAT_VALUE)||(LA50_0>=14 && LA50_0<=15)||LA50_0==39||LA50_0==54||LA50_0==59) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGraphQL.g:3904:3: rule__ListValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__ListValue__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getListValueAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2__Impl"


    // $ANTLR start "rule__ListValue__Group__3"
    // InternalGraphQL.g:3912:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3916:1: ( rule__ListValue__Group__3__Impl )
            // InternalGraphQL.g:3917:2: rule__ListValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3"


    // $ANTLR start "rule__ListValue__Group__3__Impl"
    // InternalGraphQL.g:3923:1: rule__ListValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3927:1: ( ( ']' ) )
            // InternalGraphQL.g:3928:1: ( ']' )
            {
            // InternalGraphQL.g:3928:1: ( ']' )
            // InternalGraphQL.g:3929:2: ']'
            {
             before(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__0"
    // InternalGraphQL.g:3939:1: rule__DirectiveDefinition__Group__0 : rule__DirectiveDefinition__Group__0__Impl rule__DirectiveDefinition__Group__1 ;
    public final void rule__DirectiveDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3943:1: ( rule__DirectiveDefinition__Group__0__Impl rule__DirectiveDefinition__Group__1 )
            // InternalGraphQL.g:3944:2: rule__DirectiveDefinition__Group__0__Impl rule__DirectiveDefinition__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__DirectiveDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__0"


    // $ANTLR start "rule__DirectiveDefinition__Group__0__Impl"
    // InternalGraphQL.g:3951:1: rule__DirectiveDefinition__Group__0__Impl : ( ( rule__DirectiveDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__DirectiveDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3955:1: ( ( ( rule__DirectiveDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:3956:1: ( ( rule__DirectiveDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:3956:1: ( ( rule__DirectiveDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:3957:2: ( rule__DirectiveDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:3958:2: ( rule__DirectiveDefinition__DescriptionAssignment_0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_SL_STRING_VALUE && LA51_0<=RULE_ML_STRING_VALUE)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGraphQL.g:3958:3: rule__DirectiveDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectiveDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectiveDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__0__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__1"
    // InternalGraphQL.g:3966:1: rule__DirectiveDefinition__Group__1 : rule__DirectiveDefinition__Group__1__Impl rule__DirectiveDefinition__Group__2 ;
    public final void rule__DirectiveDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3970:1: ( rule__DirectiveDefinition__Group__1__Impl rule__DirectiveDefinition__Group__2 )
            // InternalGraphQL.g:3971:2: rule__DirectiveDefinition__Group__1__Impl rule__DirectiveDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DirectiveDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__1"


    // $ANTLR start "rule__DirectiveDefinition__Group__1__Impl"
    // InternalGraphQL.g:3978:1: rule__DirectiveDefinition__Group__1__Impl : ( 'directive' ) ;
    public final void rule__DirectiveDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3982:1: ( ( 'directive' ) )
            // InternalGraphQL.g:3983:1: ( 'directive' )
            {
            // InternalGraphQL.g:3983:1: ( 'directive' )
            // InternalGraphQL.g:3984:2: 'directive'
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDirectiveKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDirectiveDefinitionAccess().getDirectiveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__1__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__2"
    // InternalGraphQL.g:3993:1: rule__DirectiveDefinition__Group__2 : rule__DirectiveDefinition__Group__2__Impl rule__DirectiveDefinition__Group__3 ;
    public final void rule__DirectiveDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3997:1: ( rule__DirectiveDefinition__Group__2__Impl rule__DirectiveDefinition__Group__3 )
            // InternalGraphQL.g:3998:2: rule__DirectiveDefinition__Group__2__Impl rule__DirectiveDefinition__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__DirectiveDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__2"


    // $ANTLR start "rule__DirectiveDefinition__Group__2__Impl"
    // InternalGraphQL.g:4005:1: rule__DirectiveDefinition__Group__2__Impl : ( ( rule__DirectiveDefinition__NameAssignment_2 ) ) ;
    public final void rule__DirectiveDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4009:1: ( ( ( rule__DirectiveDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:4010:1: ( ( rule__DirectiveDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:4010:1: ( ( rule__DirectiveDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:4011:2: ( rule__DirectiveDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:4012:2: ( rule__DirectiveDefinition__NameAssignment_2 )
            // InternalGraphQL.g:4012:3: rule__DirectiveDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__2__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__3"
    // InternalGraphQL.g:4020:1: rule__DirectiveDefinition__Group__3 : rule__DirectiveDefinition__Group__3__Impl rule__DirectiveDefinition__Group__4 ;
    public final void rule__DirectiveDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4024:1: ( rule__DirectiveDefinition__Group__3__Impl rule__DirectiveDefinition__Group__4 )
            // InternalGraphQL.g:4025:2: rule__DirectiveDefinition__Group__3__Impl rule__DirectiveDefinition__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__DirectiveDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__3"


    // $ANTLR start "rule__DirectiveDefinition__Group__3__Impl"
    // InternalGraphQL.g:4032:1: rule__DirectiveDefinition__Group__3__Impl : ( ( rule__DirectiveDefinition__Group_3__0 )? ) ;
    public final void rule__DirectiveDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4036:1: ( ( ( rule__DirectiveDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:4037:1: ( ( rule__DirectiveDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:4037:1: ( ( rule__DirectiveDefinition__Group_3__0 )? )
            // InternalGraphQL.g:4038:2: ( rule__DirectiveDefinition__Group_3__0 )?
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:4039:2: ( rule__DirectiveDefinition__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGraphQL.g:4039:3: rule__DirectiveDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectiveDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectiveDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__3__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__4"
    // InternalGraphQL.g:4047:1: rule__DirectiveDefinition__Group__4 : rule__DirectiveDefinition__Group__4__Impl rule__DirectiveDefinition__Group__5 ;
    public final void rule__DirectiveDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4051:1: ( rule__DirectiveDefinition__Group__4__Impl rule__DirectiveDefinition__Group__5 )
            // InternalGraphQL.g:4052:2: rule__DirectiveDefinition__Group__4__Impl rule__DirectiveDefinition__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__DirectiveDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__4"


    // $ANTLR start "rule__DirectiveDefinition__Group__4__Impl"
    // InternalGraphQL.g:4059:1: rule__DirectiveDefinition__Group__4__Impl : ( ( rule__DirectiveDefinition__RepeatableAssignment_4 )? ) ;
    public final void rule__DirectiveDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4063:1: ( ( ( rule__DirectiveDefinition__RepeatableAssignment_4 )? ) )
            // InternalGraphQL.g:4064:1: ( ( rule__DirectiveDefinition__RepeatableAssignment_4 )? )
            {
            // InternalGraphQL.g:4064:1: ( ( rule__DirectiveDefinition__RepeatableAssignment_4 )? )
            // InternalGraphQL.g:4065:2: ( rule__DirectiveDefinition__RepeatableAssignment_4 )?
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getRepeatableAssignment_4()); 
            // InternalGraphQL.g:4066:2: ( rule__DirectiveDefinition__RepeatableAssignment_4 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==60) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGraphQL.g:4066:3: rule__DirectiveDefinition__RepeatableAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectiveDefinition__RepeatableAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectiveDefinitionAccess().getRepeatableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__4__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__5"
    // InternalGraphQL.g:4074:1: rule__DirectiveDefinition__Group__5 : rule__DirectiveDefinition__Group__5__Impl rule__DirectiveDefinition__Group__6 ;
    public final void rule__DirectiveDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4078:1: ( rule__DirectiveDefinition__Group__5__Impl rule__DirectiveDefinition__Group__6 )
            // InternalGraphQL.g:4079:2: rule__DirectiveDefinition__Group__5__Impl rule__DirectiveDefinition__Group__6
            {
            pushFollow(FOLLOW_45);
            rule__DirectiveDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__5"


    // $ANTLR start "rule__DirectiveDefinition__Group__5__Impl"
    // InternalGraphQL.g:4086:1: rule__DirectiveDefinition__Group__5__Impl : ( 'on' ) ;
    public final void rule__DirectiveDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4090:1: ( ( 'on' ) )
            // InternalGraphQL.g:4091:1: ( 'on' )
            {
            // InternalGraphQL.g:4091:1: ( 'on' )
            // InternalGraphQL.g:4092:2: 'on'
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getOnKeyword_5()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDirectiveDefinitionAccess().getOnKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__5__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__6"
    // InternalGraphQL.g:4101:1: rule__DirectiveDefinition__Group__6 : rule__DirectiveDefinition__Group__6__Impl rule__DirectiveDefinition__Group__7 ;
    public final void rule__DirectiveDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4105:1: ( rule__DirectiveDefinition__Group__6__Impl rule__DirectiveDefinition__Group__7 )
            // InternalGraphQL.g:4106:2: rule__DirectiveDefinition__Group__6__Impl rule__DirectiveDefinition__Group__7
            {
            pushFollow(FOLLOW_45);
            rule__DirectiveDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__6"


    // $ANTLR start "rule__DirectiveDefinition__Group__6__Impl"
    // InternalGraphQL.g:4113:1: rule__DirectiveDefinition__Group__6__Impl : ( ( '|' )? ) ;
    public final void rule__DirectiveDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4117:1: ( ( ( '|' )? ) )
            // InternalGraphQL.g:4118:1: ( ( '|' )? )
            {
            // InternalGraphQL.g:4118:1: ( ( '|' )? )
            // InternalGraphQL.g:4119:2: ( '|' )?
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getVerticalLineKeyword_6()); 
            // InternalGraphQL.g:4120:2: ( '|' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGraphQL.g:4120:3: '|'
                    {
                    match(input,51,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDirectiveDefinitionAccess().getVerticalLineKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__6__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__7"
    // InternalGraphQL.g:4128:1: rule__DirectiveDefinition__Group__7 : rule__DirectiveDefinition__Group__7__Impl rule__DirectiveDefinition__Group__8 ;
    public final void rule__DirectiveDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4132:1: ( rule__DirectiveDefinition__Group__7__Impl rule__DirectiveDefinition__Group__8 )
            // InternalGraphQL.g:4133:2: rule__DirectiveDefinition__Group__7__Impl rule__DirectiveDefinition__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__DirectiveDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__7"


    // $ANTLR start "rule__DirectiveDefinition__Group__7__Impl"
    // InternalGraphQL.g:4140:1: rule__DirectiveDefinition__Group__7__Impl : ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_7 ) ) ;
    public final void rule__DirectiveDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4144:1: ( ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_7 ) ) )
            // InternalGraphQL.g:4145:1: ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_7 ) )
            {
            // InternalGraphQL.g:4145:1: ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_7 ) )
            // InternalGraphQL.g:4146:2: ( rule__DirectiveDefinition__DirectiveLocationsAssignment_7 )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsAssignment_7()); 
            // InternalGraphQL.g:4147:2: ( rule__DirectiveDefinition__DirectiveLocationsAssignment_7 )
            // InternalGraphQL.g:4147:3: rule__DirectiveDefinition__DirectiveLocationsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__DirectiveLocationsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__7__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group__8"
    // InternalGraphQL.g:4155:1: rule__DirectiveDefinition__Group__8 : rule__DirectiveDefinition__Group__8__Impl ;
    public final void rule__DirectiveDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4159:1: ( rule__DirectiveDefinition__Group__8__Impl )
            // InternalGraphQL.g:4160:2: rule__DirectiveDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__8"


    // $ANTLR start "rule__DirectiveDefinition__Group__8__Impl"
    // InternalGraphQL.g:4166:1: rule__DirectiveDefinition__Group__8__Impl : ( ( rule__DirectiveDefinition__Group_8__0 )* ) ;
    public final void rule__DirectiveDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4170:1: ( ( ( rule__DirectiveDefinition__Group_8__0 )* ) )
            // InternalGraphQL.g:4171:1: ( ( rule__DirectiveDefinition__Group_8__0 )* )
            {
            // InternalGraphQL.g:4171:1: ( ( rule__DirectiveDefinition__Group_8__0 )* )
            // InternalGraphQL.g:4172:2: ( rule__DirectiveDefinition__Group_8__0 )*
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getGroup_8()); 
            // InternalGraphQL.g:4173:2: ( rule__DirectiveDefinition__Group_8__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==51) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalGraphQL.g:4173:3: rule__DirectiveDefinition__Group_8__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__DirectiveDefinition__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getDirectiveDefinitionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group__8__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group_3__0"
    // InternalGraphQL.g:4182:1: rule__DirectiveDefinition__Group_3__0 : rule__DirectiveDefinition__Group_3__0__Impl rule__DirectiveDefinition__Group_3__1 ;
    public final void rule__DirectiveDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4186:1: ( rule__DirectiveDefinition__Group_3__0__Impl rule__DirectiveDefinition__Group_3__1 )
            // InternalGraphQL.g:4187:2: rule__DirectiveDefinition__Group_3__0__Impl rule__DirectiveDefinition__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__DirectiveDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_3__0"


    // $ANTLR start "rule__DirectiveDefinition__Group_3__0__Impl"
    // InternalGraphQL.g:4194:1: rule__DirectiveDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__DirectiveDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4198:1: ( ( '(' ) )
            // InternalGraphQL.g:4199:1: ( '(' )
            {
            // InternalGraphQL.g:4199:1: ( '(' )
            // InternalGraphQL.g:4200:2: '('
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDirectiveDefinitionAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group_3__1"
    // InternalGraphQL.g:4209:1: rule__DirectiveDefinition__Group_3__1 : rule__DirectiveDefinition__Group_3__1__Impl rule__DirectiveDefinition__Group_3__2 ;
    public final void rule__DirectiveDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4213:1: ( rule__DirectiveDefinition__Group_3__1__Impl rule__DirectiveDefinition__Group_3__2 )
            // InternalGraphQL.g:4214:2: rule__DirectiveDefinition__Group_3__1__Impl rule__DirectiveDefinition__Group_3__2
            {
            pushFollow(FOLLOW_25);
            rule__DirectiveDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_3__1"


    // $ANTLR start "rule__DirectiveDefinition__Group_3__1__Impl"
    // InternalGraphQL.g:4221:1: rule__DirectiveDefinition__Group_3__1__Impl : ( ( rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1 )* ) ;
    public final void rule__DirectiveDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4225:1: ( ( ( rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1 )* ) )
            // InternalGraphQL.g:4226:1: ( ( rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1 )* )
            {
            // InternalGraphQL.g:4226:1: ( ( rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1 )* )
            // InternalGraphQL.g:4227:2: ( rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1 )*
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getArgumentsDefinitionAssignment_3_1()); 
            // InternalGraphQL.g:4228:2: ( rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_SL_STRING_VALUE && LA56_0<=RULE_NAME)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalGraphQL.g:4228:3: rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getDirectiveDefinitionAccess().getArgumentsDefinitionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group_3__2"
    // InternalGraphQL.g:4236:1: rule__DirectiveDefinition__Group_3__2 : rule__DirectiveDefinition__Group_3__2__Impl ;
    public final void rule__DirectiveDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4240:1: ( rule__DirectiveDefinition__Group_3__2__Impl )
            // InternalGraphQL.g:4241:2: rule__DirectiveDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_3__2"


    // $ANTLR start "rule__DirectiveDefinition__Group_3__2__Impl"
    // InternalGraphQL.g:4247:1: rule__DirectiveDefinition__Group_3__2__Impl : ( ')' ) ;
    public final void rule__DirectiveDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4251:1: ( ( ')' ) )
            // InternalGraphQL.g:4252:1: ( ')' )
            {
            // InternalGraphQL.g:4252:1: ( ')' )
            // InternalGraphQL.g:4253:2: ')'
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDirectiveDefinitionAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group_8__0"
    // InternalGraphQL.g:4263:1: rule__DirectiveDefinition__Group_8__0 : rule__DirectiveDefinition__Group_8__0__Impl rule__DirectiveDefinition__Group_8__1 ;
    public final void rule__DirectiveDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4267:1: ( rule__DirectiveDefinition__Group_8__0__Impl rule__DirectiveDefinition__Group_8__1 )
            // InternalGraphQL.g:4268:2: rule__DirectiveDefinition__Group_8__0__Impl rule__DirectiveDefinition__Group_8__1
            {
            pushFollow(FOLLOW_45);
            rule__DirectiveDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_8__0"


    // $ANTLR start "rule__DirectiveDefinition__Group_8__0__Impl"
    // InternalGraphQL.g:4275:1: rule__DirectiveDefinition__Group_8__0__Impl : ( '|' ) ;
    public final void rule__DirectiveDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4279:1: ( ( '|' ) )
            // InternalGraphQL.g:4280:1: ( '|' )
            {
            // InternalGraphQL.g:4280:1: ( '|' )
            // InternalGraphQL.g:4281:2: '|'
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getVerticalLineKeyword_8_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDirectiveDefinitionAccess().getVerticalLineKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_8__0__Impl"


    // $ANTLR start "rule__DirectiveDefinition__Group_8__1"
    // InternalGraphQL.g:4290:1: rule__DirectiveDefinition__Group_8__1 : rule__DirectiveDefinition__Group_8__1__Impl ;
    public final void rule__DirectiveDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4294:1: ( rule__DirectiveDefinition__Group_8__1__Impl )
            // InternalGraphQL.g:4295:2: rule__DirectiveDefinition__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_8__1"


    // $ANTLR start "rule__DirectiveDefinition__Group_8__1__Impl"
    // InternalGraphQL.g:4301:1: rule__DirectiveDefinition__Group_8__1__Impl : ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1 ) ) ;
    public final void rule__DirectiveDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4305:1: ( ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1 ) ) )
            // InternalGraphQL.g:4306:1: ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1 ) )
            {
            // InternalGraphQL.g:4306:1: ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1 ) )
            // InternalGraphQL.g:4307:2: ( rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1 )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsAssignment_8_1()); 
            // InternalGraphQL.g:4308:2: ( rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1 )
            // InternalGraphQL.g:4308:3: rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__Group_8__1__Impl"


    // $ANTLR start "rule__Directive__Group__0"
    // InternalGraphQL.g:4317:1: rule__Directive__Group__0 : rule__Directive__Group__0__Impl rule__Directive__Group__1 ;
    public final void rule__Directive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4321:1: ( rule__Directive__Group__0__Impl rule__Directive__Group__1 )
            // InternalGraphQL.g:4322:2: rule__Directive__Group__0__Impl rule__Directive__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Directive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__0"


    // $ANTLR start "rule__Directive__Group__0__Impl"
    // InternalGraphQL.g:4329:1: rule__Directive__Group__0__Impl : ( ( rule__Directive__DirectiveAssignment_0 ) ) ;
    public final void rule__Directive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4333:1: ( ( ( rule__Directive__DirectiveAssignment_0 ) ) )
            // InternalGraphQL.g:4334:1: ( ( rule__Directive__DirectiveAssignment_0 ) )
            {
            // InternalGraphQL.g:4334:1: ( ( rule__Directive__DirectiveAssignment_0 ) )
            // InternalGraphQL.g:4335:2: ( rule__Directive__DirectiveAssignment_0 )
            {
             before(grammarAccess.getDirectiveAccess().getDirectiveAssignment_0()); 
            // InternalGraphQL.g:4336:2: ( rule__Directive__DirectiveAssignment_0 )
            // InternalGraphQL.g:4336:3: rule__Directive__DirectiveAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Directive__DirectiveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveAccess().getDirectiveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__0__Impl"


    // $ANTLR start "rule__Directive__Group__1"
    // InternalGraphQL.g:4344:1: rule__Directive__Group__1 : rule__Directive__Group__1__Impl ;
    public final void rule__Directive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4348:1: ( rule__Directive__Group__1__Impl )
            // InternalGraphQL.g:4349:2: rule__Directive__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Directive__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__1"


    // $ANTLR start "rule__Directive__Group__1__Impl"
    // InternalGraphQL.g:4355:1: rule__Directive__Group__1__Impl : ( ( rule__Directive__Group_1__0 )? ) ;
    public final void rule__Directive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4359:1: ( ( ( rule__Directive__Group_1__0 )? ) )
            // InternalGraphQL.g:4360:1: ( ( rule__Directive__Group_1__0 )? )
            {
            // InternalGraphQL.g:4360:1: ( ( rule__Directive__Group_1__0 )? )
            // InternalGraphQL.g:4361:2: ( rule__Directive__Group_1__0 )?
            {
             before(grammarAccess.getDirectiveAccess().getGroup_1()); 
            // InternalGraphQL.g:4362:2: ( rule__Directive__Group_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==47) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalGraphQL.g:4362:3: rule__Directive__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Directive__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectiveAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__1__Impl"


    // $ANTLR start "rule__Directive__Group_1__0"
    // InternalGraphQL.g:4371:1: rule__Directive__Group_1__0 : rule__Directive__Group_1__0__Impl rule__Directive__Group_1__1 ;
    public final void rule__Directive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4375:1: ( rule__Directive__Group_1__0__Impl rule__Directive__Group_1__1 )
            // InternalGraphQL.g:4376:2: rule__Directive__Group_1__0__Impl rule__Directive__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__Directive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directive__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group_1__0"


    // $ANTLR start "rule__Directive__Group_1__0__Impl"
    // InternalGraphQL.g:4383:1: rule__Directive__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Directive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4387:1: ( ( '(' ) )
            // InternalGraphQL.g:4388:1: ( '(' )
            {
            // InternalGraphQL.g:4388:1: ( '(' )
            // InternalGraphQL.g:4389:2: '('
            {
             before(grammarAccess.getDirectiveAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDirectiveAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group_1__0__Impl"


    // $ANTLR start "rule__Directive__Group_1__1"
    // InternalGraphQL.g:4398:1: rule__Directive__Group_1__1 : rule__Directive__Group_1__1__Impl rule__Directive__Group_1__2 ;
    public final void rule__Directive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4402:1: ( rule__Directive__Group_1__1__Impl rule__Directive__Group_1__2 )
            // InternalGraphQL.g:4403:2: rule__Directive__Group_1__1__Impl rule__Directive__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__Directive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directive__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group_1__1"


    // $ANTLR start "rule__Directive__Group_1__1__Impl"
    // InternalGraphQL.g:4410:1: rule__Directive__Group_1__1__Impl : ( ( rule__Directive__ArgumentsAssignment_1_1 )* ) ;
    public final void rule__Directive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4414:1: ( ( ( rule__Directive__ArgumentsAssignment_1_1 )* ) )
            // InternalGraphQL.g:4415:1: ( ( rule__Directive__ArgumentsAssignment_1_1 )* )
            {
            // InternalGraphQL.g:4415:1: ( ( rule__Directive__ArgumentsAssignment_1_1 )* )
            // InternalGraphQL.g:4416:2: ( rule__Directive__ArgumentsAssignment_1_1 )*
            {
             before(grammarAccess.getDirectiveAccess().getArgumentsAssignment_1_1()); 
            // InternalGraphQL.g:4417:2: ( rule__Directive__ArgumentsAssignment_1_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_NAME) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGraphQL.g:4417:3: rule__Directive__ArgumentsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Directive__ArgumentsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getDirectiveAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group_1__1__Impl"


    // $ANTLR start "rule__Directive__Group_1__2"
    // InternalGraphQL.g:4425:1: rule__Directive__Group_1__2 : rule__Directive__Group_1__2__Impl ;
    public final void rule__Directive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4429:1: ( rule__Directive__Group_1__2__Impl )
            // InternalGraphQL.g:4430:2: rule__Directive__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Directive__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group_1__2"


    // $ANTLR start "rule__Directive__Group_1__2__Impl"
    // InternalGraphQL.g:4436:1: rule__Directive__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Directive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4440:1: ( ( ')' ) )
            // InternalGraphQL.g:4441:1: ( ')' )
            {
            // InternalGraphQL.g:4441:1: ( ')' )
            // InternalGraphQL.g:4442:2: ')'
            {
             before(grammarAccess.getDirectiveAccess().getRightParenthesisKeyword_1_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDirectiveAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group_1__2__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalGraphQL.g:4452:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4456:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalGraphQL.g:4457:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // InternalGraphQL.g:4464:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__ArgumentDefinitionAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4468:1: ( ( ( rule__Argument__ArgumentDefinitionAssignment_0 ) ) )
            // InternalGraphQL.g:4469:1: ( ( rule__Argument__ArgumentDefinitionAssignment_0 ) )
            {
            // InternalGraphQL.g:4469:1: ( ( rule__Argument__ArgumentDefinitionAssignment_0 ) )
            // InternalGraphQL.g:4470:2: ( rule__Argument__ArgumentDefinitionAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getArgumentDefinitionAssignment_0()); 
            // InternalGraphQL.g:4471:2: ( rule__Argument__ArgumentDefinitionAssignment_0 )
            // InternalGraphQL.g:4471:3: rule__Argument__ArgumentDefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__ArgumentDefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getArgumentDefinitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // InternalGraphQL.g:4479:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4483:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // InternalGraphQL.g:4484:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // InternalGraphQL.g:4491:1: rule__Argument__Group__1__Impl : ( ':' ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4495:1: ( ( ':' ) )
            // InternalGraphQL.g:4496:1: ( ':' )
            {
            // InternalGraphQL.g:4496:1: ( ':' )
            // InternalGraphQL.g:4497:2: ':'
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__2"
    // InternalGraphQL.g:4506:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4510:1: ( rule__Argument__Group__2__Impl )
            // InternalGraphQL.g:4511:2: rule__Argument__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2"


    // $ANTLR start "rule__Argument__Group__2__Impl"
    // InternalGraphQL.g:4517:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__ValueAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4521:1: ( ( ( rule__Argument__ValueAssignment_2 ) ) )
            // InternalGraphQL.g:4522:1: ( ( rule__Argument__ValueAssignment_2 ) )
            {
            // InternalGraphQL.g:4522:1: ( ( rule__Argument__ValueAssignment_2 ) )
            // InternalGraphQL.g:4523:2: ( rule__Argument__ValueAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getValueAssignment_2()); 
            // InternalGraphQL.g:4524:2: ( rule__Argument__ValueAssignment_2 )
            // InternalGraphQL.g:4524:3: rule__Argument__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Argument__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2__Impl"


    // $ANTLR start "rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0"
    // InternalGraphQL.g:4533:1: rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 : ( ruleSchemaDefinition ) ;
    public final void rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4537:1: ( ( ruleSchemaDefinition ) )
            // InternalGraphQL.g:4538:2: ( ruleSchemaDefinition )
            {
            // InternalGraphQL.g:4538:2: ( ruleSchemaDefinition )
            // InternalGraphQL.g:4539:3: ruleSchemaDefinition
            {
             before(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsSchemaDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsSchemaDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0"


    // $ANTLR start "rule__TypeSystemDefinition__TypeDefinitionsAssignment_1"
    // InternalGraphQL.g:4548:1: rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 : ( ruleTypeDefinition ) ;
    public final void rule__TypeSystemDefinition__TypeDefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4552:1: ( ( ruleTypeDefinition ) )
            // InternalGraphQL.g:4553:2: ( ruleTypeDefinition )
            {
            // InternalGraphQL.g:4553:2: ( ruleTypeDefinition )
            // InternalGraphQL.g:4554:3: ruleTypeDefinition
            {
             before(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsTypeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsTypeDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSystemDefinition__TypeDefinitionsAssignment_1"


    // $ANTLR start "rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2"
    // InternalGraphQL.g:4563:1: rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 : ( ruleDirectiveDefinition ) ;
    public final void rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4567:1: ( ( ruleDirectiveDefinition ) )
            // InternalGraphQL.g:4568:2: ( ruleDirectiveDefinition )
            {
            // InternalGraphQL.g:4568:2: ( ruleDirectiveDefinition )
            // InternalGraphQL.g:4569:3: ruleDirectiveDefinition
            {
             before(grammarAccess.getTypeSystemDefinitionAccess().getDirectiveDefinitionsDirectiveDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectiveDefinition();

            state._fsp--;

             after(grammarAccess.getTypeSystemDefinitionAccess().getDirectiveDefinitionsDirectiveDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2"


    // $ANTLR start "rule__SchemaDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4578:1: rule__SchemaDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__SchemaDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4582:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4583:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4583:2: ( ruleStringValue )
            // InternalGraphQL.g:4584:3: ruleStringValue
            {
             before(grammarAccess.getSchemaDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getSchemaDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__SchemaDefinition__TypeDefinitionsAssignment_3"
    // InternalGraphQL.g:4593:1: rule__SchemaDefinition__TypeDefinitionsAssignment_3 : ( ruleRootOperationTypeDefinition ) ;
    public final void rule__SchemaDefinition__TypeDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4597:1: ( ( ruleRootOperationTypeDefinition ) )
            // InternalGraphQL.g:4598:2: ( ruleRootOperationTypeDefinition )
            {
            // InternalGraphQL.g:4598:2: ( ruleRootOperationTypeDefinition )
            // InternalGraphQL.g:4599:3: ruleRootOperationTypeDefinition
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsRootOperationTypeDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRootOperationTypeDefinition();

            state._fsp--;

             after(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsRootOperationTypeDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__TypeDefinitionsAssignment_3"


    // $ANTLR start "rule__RootOperationTypeDefinition__OperationTypeAssignment_0"
    // InternalGraphQL.g:4608:1: rule__RootOperationTypeDefinition__OperationTypeAssignment_0 : ( ruleOperationType ) ;
    public final void rule__RootOperationTypeDefinition__OperationTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4612:1: ( ( ruleOperationType ) )
            // InternalGraphQL.g:4613:2: ( ruleOperationType )
            {
            // InternalGraphQL.g:4613:2: ( ruleOperationType )
            // InternalGraphQL.g:4614:3: ruleOperationType
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeOperationTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeOperationTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootOperationTypeDefinition__OperationTypeAssignment_0"


    // $ANTLR start "rule__RootOperationTypeDefinition__TypeAssignment_2"
    // InternalGraphQL.g:4623:1: rule__RootOperationTypeDefinition__TypeAssignment_2 : ( ( RULE_NAME ) ) ;
    public final void rule__RootOperationTypeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4627:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:4628:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:4628:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4629:3: ( RULE_NAME )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0()); 
            // InternalGraphQL.g:4630:3: ( RULE_NAME )
            // InternalGraphQL.g:4631:4: RULE_NAME
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionNAMETerminalRuleCall_2_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionNAMETerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootOperationTypeDefinition__TypeAssignment_2"


    // $ANTLR start "rule__ScalarTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4642:1: rule__ScalarTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__ScalarTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4646:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4647:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4647:2: ( ruleStringValue )
            // InternalGraphQL.g:4648:3: ruleStringValue
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getScalarTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__ScalarTypeDefinition__NameAssignment_2"
    // InternalGraphQL.g:4657:1: rule__ScalarTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__ScalarTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4661:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4662:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4662:2: ( RULE_NAME )
            // InternalGraphQL.g:4663:3: RULE_NAME
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__NameAssignment_2"


    // $ANTLR start "rule__ScalarTypeDefinition__DirectivesAssignment_3"
    // InternalGraphQL.g:4672:1: rule__ScalarTypeDefinition__DirectivesAssignment_3 : ( ruleDirective ) ;
    public final void rule__ScalarTypeDefinition__DirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4676:1: ( ( ruleDirective ) )
            // InternalGraphQL.g:4677:2: ( ruleDirective )
            {
            // InternalGraphQL.g:4677:2: ( ruleDirective )
            // InternalGraphQL.g:4678:3: ruleDirective
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getScalarTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__DirectivesAssignment_3"


    // $ANTLR start "rule__ObjectTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4687:1: rule__ObjectTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__ObjectTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4691:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4692:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4692:2: ( ruleStringValue )
            // InternalGraphQL.g:4693:3: ruleStringValue
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__ObjectTypeDefinition__NameAssignment_2"
    // InternalGraphQL.g:4702:1: rule__ObjectTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__ObjectTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4706:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4707:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4707:2: ( RULE_NAME )
            // InternalGraphQL.g:4708:3: RULE_NAME
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__NameAssignment_2"


    // $ANTLR start "rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2"
    // InternalGraphQL.g:4717:1: rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2 : ( ( RULE_NAME ) ) ;
    public final void rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4721:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:4722:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:4722:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4723:3: ( RULE_NAME )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_2_0()); 
            // InternalGraphQL.g:4724:3: ( RULE_NAME )
            // InternalGraphQL.g:4725:4: RULE_NAME
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionNAMETerminalRuleCall_3_2_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionNAMETerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_2"


    // $ANTLR start "rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1"
    // InternalGraphQL.g:4736:1: rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1 : ( ( RULE_NAME ) ) ;
    public final void rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4740:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:4741:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:4741:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4742:3: ( RULE_NAME )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_3_1_0()); 
            // InternalGraphQL.g:4743:3: ( RULE_NAME )
            // InternalGraphQL.g:4744:4: RULE_NAME
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionNAMETerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionNAMETerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__ImplementsInterfacesAssignment_3_3_1"


    // $ANTLR start "rule__ObjectTypeDefinition__DirectivesAssignment_4"
    // InternalGraphQL.g:4755:1: rule__ObjectTypeDefinition__DirectivesAssignment_4 : ( ruleDirective ) ;
    public final void rule__ObjectTypeDefinition__DirectivesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4759:1: ( ( ruleDirective ) )
            // InternalGraphQL.g:4760:2: ( ruleDirective )
            {
            // InternalGraphQL.g:4760:2: ( ruleDirective )
            // InternalGraphQL.g:4761:3: ruleDirective
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getObjectTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__DirectivesAssignment_4"


    // $ANTLR start "rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1"
    // InternalGraphQL.g:4770:1: rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 : ( ruleFieldDefinition ) ;
    public final void rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4774:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:4775:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:4775:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:4776:3: ruleFieldDefinition
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDefinition();

            state._fsp--;

             after(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1"


    // $ANTLR start "rule__InterfaceDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4785:1: rule__InterfaceDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InterfaceDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4789:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4790:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4790:2: ( ruleStringValue )
            // InternalGraphQL.g:4791:3: ruleStringValue
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__InterfaceDefinition__NameAssignment_2"
    // InternalGraphQL.g:4800:1: rule__InterfaceDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__InterfaceDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4804:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4805:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4805:2: ( RULE_NAME )
            // InternalGraphQL.g:4806:3: RULE_NAME
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__NameAssignment_2"


    // $ANTLR start "rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2"
    // InternalGraphQL.g:4815:1: rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2 : ( ( RULE_NAME ) ) ;
    public final void rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4819:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:4820:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:4820:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4821:3: ( RULE_NAME )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_2_0()); 
            // InternalGraphQL.g:4822:3: ( RULE_NAME )
            // InternalGraphQL.g:4823:4: RULE_NAME
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionNAMETerminalRuleCall_3_2_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionNAMETerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_2"


    // $ANTLR start "rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1"
    // InternalGraphQL.g:4834:1: rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1 : ( ( RULE_NAME ) ) ;
    public final void rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4838:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:4839:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:4839:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4840:3: ( RULE_NAME )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_3_1_0()); 
            // InternalGraphQL.g:4841:3: ( RULE_NAME )
            // InternalGraphQL.g:4842:4: RULE_NAME
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionNAMETerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionNAMETerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsInterfacesInterfaceDefinitionCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__ImplementsInterfacesAssignment_3_3_1"


    // $ANTLR start "rule__InterfaceDefinition__DirectivesAssignment_4"
    // InternalGraphQL.g:4853:1: rule__InterfaceDefinition__DirectivesAssignment_4 : ( ruleDirective ) ;
    public final void rule__InterfaceDefinition__DirectivesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4857:1: ( ( ruleDirective ) )
            // InternalGraphQL.g:4858:2: ( ruleDirective )
            {
            // InternalGraphQL.g:4858:2: ( ruleDirective )
            // InternalGraphQL.g:4859:3: ruleDirective
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getDirectivesDirectiveParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getDirectivesDirectiveParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__DirectivesAssignment_4"


    // $ANTLR start "rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1"
    // InternalGraphQL.g:4868:1: rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1 : ( ruleFieldDefinition ) ;
    public final void rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4872:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:4873:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:4873:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:4874:3: ruleFieldDefinition
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDefinition();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__FieldDefinitionsAssignment_5_1"


    // $ANTLR start "rule__FieldDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4883:1: rule__FieldDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__FieldDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4887:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4888:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4888:2: ( ruleStringValue )
            // InternalGraphQL.g:4889:3: ruleStringValue
            {
             before(grammarAccess.getFieldDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getFieldDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__FieldDefinition__NameAssignment_1"
    // InternalGraphQL.g:4898:1: rule__FieldDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__FieldDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4902:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4903:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4903:2: ( RULE_NAME )
            // InternalGraphQL.g:4904:3: RULE_NAME
            {
             before(grammarAccess.getFieldDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getFieldDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__NameAssignment_1"


    // $ANTLR start "rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1"
    // InternalGraphQL.g:4913:1: rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1 : ( ruleInputValueDefinition ) ;
    public final void rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4917:1: ( ( ruleInputValueDefinition ) )
            // InternalGraphQL.g:4918:2: ( ruleInputValueDefinition )
            {
            // InternalGraphQL.g:4918:2: ( ruleInputValueDefinition )
            // InternalGraphQL.g:4919:3: ruleInputValueDefinition
            {
             before(grammarAccess.getFieldDefinitionAccess().getArgumentsDefinitionInputValueDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValueDefinition();

            state._fsp--;

             after(grammarAccess.getFieldDefinitionAccess().getArgumentsDefinitionInputValueDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__ArgumentsDefinitionAssignment_2_1"


    // $ANTLR start "rule__FieldDefinition__TypeAssignment_4"
    // InternalGraphQL.g:4928:1: rule__FieldDefinition__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__FieldDefinition__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4932:1: ( ( ruleType ) )
            // InternalGraphQL.g:4933:2: ( ruleType )
            {
            // InternalGraphQL.g:4933:2: ( ruleType )
            // InternalGraphQL.g:4934:3: ruleType
            {
             before(grammarAccess.getFieldDefinitionAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFieldDefinitionAccess().getTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__TypeAssignment_4"


    // $ANTLR start "rule__UnionTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4943:1: rule__UnionTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__UnionTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4947:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4948:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4948:2: ( ruleStringValue )
            // InternalGraphQL.g:4949:3: ruleStringValue
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__UnionTypeDefinition__NameAssignment_2"
    // InternalGraphQL.g:4958:1: rule__UnionTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__UnionTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4962:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4963:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4963:2: ( RULE_NAME )
            // InternalGraphQL.g:4964:3: RULE_NAME
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__NameAssignment_2"


    // $ANTLR start "rule__UnionTypeDefinition__DirectivesAssignment_3"
    // InternalGraphQL.g:4973:1: rule__UnionTypeDefinition__DirectivesAssignment_3 : ( ruleDirective ) ;
    public final void rule__UnionTypeDefinition__DirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4977:1: ( ( ruleDirective ) )
            // InternalGraphQL.g:4978:2: ( ruleDirective )
            {
            // InternalGraphQL.g:4978:2: ( ruleDirective )
            // InternalGraphQL.g:4979:3: ruleDirective
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__DirectivesAssignment_3"


    // $ANTLR start "rule__UnionTypeDefinition__MemberTypesAssignment_4_2"
    // InternalGraphQL.g:4988:1: rule__UnionTypeDefinition__MemberTypesAssignment_4_2 : ( ruleType ) ;
    public final void rule__UnionTypeDefinition__MemberTypesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4992:1: ( ( ruleType ) )
            // InternalGraphQL.g:4993:2: ( ruleType )
            {
            // InternalGraphQL.g:4993:2: ( ruleType )
            // InternalGraphQL.g:4994:3: ruleType
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__MemberTypesAssignment_4_2"


    // $ANTLR start "rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1"
    // InternalGraphQL.g:5003:1: rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1 : ( ruleType ) ;
    public final void rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5007:1: ( ( ruleType ) )
            // InternalGraphQL.g:5008:2: ( ruleType )
            {
            // InternalGraphQL.g:5008:2: ( ruleType )
            // InternalGraphQL.g:5009:3: ruleType
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__MemberTypesAssignment_4_3_1"


    // $ANTLR start "rule__EnumTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:5018:1: rule__EnumTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__EnumTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5022:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:5023:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:5023:2: ( ruleStringValue )
            // InternalGraphQL.g:5024:3: ruleStringValue
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__EnumTypeDefinition__NameAssignment_2"
    // InternalGraphQL.g:5033:1: rule__EnumTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__EnumTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5037:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5038:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:5038:2: ( RULE_NAME )
            // InternalGraphQL.g:5039:3: RULE_NAME
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__NameAssignment_2"


    // $ANTLR start "rule__EnumTypeDefinition__DirectivesAssignment_3"
    // InternalGraphQL.g:5048:1: rule__EnumTypeDefinition__DirectivesAssignment_3 : ( ruleDirective ) ;
    public final void rule__EnumTypeDefinition__DirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5052:1: ( ( ruleDirective ) )
            // InternalGraphQL.g:5053:2: ( ruleDirective )
            {
            // InternalGraphQL.g:5053:2: ( ruleDirective )
            // InternalGraphQL.g:5054:3: ruleDirective
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getEnumTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__DirectivesAssignment_3"


    // $ANTLR start "rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1"
    // InternalGraphQL.g:5063:1: rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1 : ( ruleEnumValueDefinition ) ;
    public final void rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5067:1: ( ( ruleEnumValueDefinition ) )
            // InternalGraphQL.g:5068:2: ( ruleEnumValueDefinition )
            {
            // InternalGraphQL.g:5068:2: ( ruleEnumValueDefinition )
            // InternalGraphQL.g:5069:3: ruleEnumValueDefinition
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getEnumValuesDefinitionEnumValueDefinitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValueDefinition();

            state._fsp--;

             after(grammarAccess.getEnumTypeDefinitionAccess().getEnumValuesDefinitionEnumValueDefinitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__EnumValuesDefinitionAssignment_4_1"


    // $ANTLR start "rule__EnumValueDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:5078:1: rule__EnumValueDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__EnumValueDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5082:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:5083:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:5083:2: ( ruleStringValue )
            // InternalGraphQL.g:5084:3: ruleStringValue
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getEnumValueDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__EnumValueDefinition__NameAssignment_1"
    // InternalGraphQL.g:5093:1: rule__EnumValueDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__EnumValueDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5097:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5098:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:5098:2: ( RULE_NAME )
            // InternalGraphQL.g:5099:3: RULE_NAME
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getEnumValueDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueDefinition__NameAssignment_1"


    // $ANTLR start "rule__InputObjectTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:5108:1: rule__InputObjectTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InputObjectTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5112:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:5113:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:5113:2: ( ruleStringValue )
            // InternalGraphQL.g:5114:3: ruleStringValue
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__InputObjectTypeDefinition__NameAssignment_2"
    // InternalGraphQL.g:5123:1: rule__InputObjectTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__InputObjectTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5127:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5128:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:5128:2: ( RULE_NAME )
            // InternalGraphQL.g:5129:3: RULE_NAME
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__NameAssignment_2"


    // $ANTLR start "rule__InputObjectTypeDefinition__DirectivesAssignment_3"
    // InternalGraphQL.g:5138:1: rule__InputObjectTypeDefinition__DirectivesAssignment_3 : ( ruleDirective ) ;
    public final void rule__InputObjectTypeDefinition__DirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5142:1: ( ( ruleDirective ) )
            // InternalGraphQL.g:5143:2: ( ruleDirective )
            {
            // InternalGraphQL.g:5143:2: ( ruleDirective )
            // InternalGraphQL.g:5144:3: ruleDirective
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__DirectivesAssignment_3"


    // $ANTLR start "rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1"
    // InternalGraphQL.g:5153:1: rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1 : ( ruleInputValueDefinition ) ;
    public final void rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5157:1: ( ( ruleInputValueDefinition ) )
            // InternalGraphQL.g:5158:2: ( ruleInputValueDefinition )
            {
            // InternalGraphQL.g:5158:2: ( ruleInputValueDefinition )
            // InternalGraphQL.g:5159:3: ruleInputValueDefinition
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputFieldsDefinitionInputValueDefinitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValueDefinition();

            state._fsp--;

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getInputFieldsDefinitionInputValueDefinitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__InputFieldsDefinitionAssignment_4_1"


    // $ANTLR start "rule__InputValueDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:5168:1: rule__InputValueDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InputValueDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5172:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:5173:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:5173:2: ( ruleStringValue )
            // InternalGraphQL.g:5174:3: ruleStringValue
            {
             before(grammarAccess.getInputValueDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getInputValueDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__InputValueDefinition__NameAssignment_1"
    // InternalGraphQL.g:5183:1: rule__InputValueDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__InputValueDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5187:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5188:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:5188:2: ( RULE_NAME )
            // InternalGraphQL.g:5189:3: RULE_NAME
            {
             before(grammarAccess.getInputValueDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getInputValueDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__NameAssignment_1"


    // $ANTLR start "rule__InputValueDefinition__TypeAssignment_3"
    // InternalGraphQL.g:5198:1: rule__InputValueDefinition__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__InputValueDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5202:1: ( ( ruleType ) )
            // InternalGraphQL.g:5203:2: ( ruleType )
            {
            // InternalGraphQL.g:5203:2: ( ruleType )
            // InternalGraphQL.g:5204:3: ruleType
            {
             before(grammarAccess.getInputValueDefinitionAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInputValueDefinitionAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__TypeAssignment_3"


    // $ANTLR start "rule__InputValueDefinition__DefaultValueAssignment_4_1"
    // InternalGraphQL.g:5213:1: rule__InputValueDefinition__DefaultValueAssignment_4_1 : ( ruleConstValue ) ;
    public final void rule__InputValueDefinition__DefaultValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5217:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:5218:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:5218:2: ( ruleConstValue )
            // InternalGraphQL.g:5219:3: ruleConstValue
            {
             before(grammarAccess.getInputValueDefinitionAccess().getDefaultValueConstValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstValue();

            state._fsp--;

             after(grammarAccess.getInputValueDefinitionAccess().getDefaultValueConstValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputValueDefinition__DefaultValueAssignment_4_1"


    // $ANTLR start "rule__NamedType__TypeDefinitionAssignment_0"
    // InternalGraphQL.g:5228:1: rule__NamedType__TypeDefinitionAssignment_0 : ( ( RULE_NAME ) ) ;
    public final void rule__NamedType__TypeDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5232:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:5233:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:5233:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5234:3: ( RULE_NAME )
            {
             before(grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:5235:3: ( RULE_NAME )
            // InternalGraphQL.g:5236:4: RULE_NAME
            {
             before(grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionNAMETerminalRuleCall_0_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionNAMETerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedType__TypeDefinitionAssignment_0"


    // $ANTLR start "rule__NamedType__NonNullAssignment_1"
    // InternalGraphQL.g:5247:1: rule__NamedType__NonNullAssignment_1 : ( ( '!' ) ) ;
    public final void rule__NamedType__NonNullAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5251:1: ( ( ( '!' ) ) )
            // InternalGraphQL.g:5252:2: ( ( '!' ) )
            {
            // InternalGraphQL.g:5252:2: ( ( '!' ) )
            // InternalGraphQL.g:5253:3: ( '!' )
            {
             before(grammarAccess.getNamedTypeAccess().getNonNullExclamationMarkKeyword_1_0()); 
            // InternalGraphQL.g:5254:3: ( '!' )
            // InternalGraphQL.g:5255:4: '!'
            {
             before(grammarAccess.getNamedTypeAccess().getNonNullExclamationMarkKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getNamedTypeAccess().getNonNullExclamationMarkKeyword_1_0()); 

            }

             after(grammarAccess.getNamedTypeAccess().getNonNullExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedType__NonNullAssignment_1"


    // $ANTLR start "rule__ListType__TypeAssignment_1"
    // InternalGraphQL.g:5266:1: rule__ListType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__ListType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5270:1: ( ( ruleType ) )
            // InternalGraphQL.g:5271:2: ( ruleType )
            {
            // InternalGraphQL.g:5271:2: ( ruleType )
            // InternalGraphQL.g:5272:3: ruleType
            {
             before(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__TypeAssignment_1"


    // $ANTLR start "rule__ListType__NonNullAssignment_3"
    // InternalGraphQL.g:5281:1: rule__ListType__NonNullAssignment_3 : ( ( '!' ) ) ;
    public final void rule__ListType__NonNullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5285:1: ( ( ( '!' ) ) )
            // InternalGraphQL.g:5286:2: ( ( '!' ) )
            {
            // InternalGraphQL.g:5286:2: ( ( '!' ) )
            // InternalGraphQL.g:5287:3: ( '!' )
            {
             before(grammarAccess.getListTypeAccess().getNonNullExclamationMarkKeyword_3_0()); 
            // InternalGraphQL.g:5288:3: ( '!' )
            // InternalGraphQL.g:5289:4: '!'
            {
             before(grammarAccess.getListTypeAccess().getNonNullExclamationMarkKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getNonNullExclamationMarkKeyword_3_0()); 

            }

             after(grammarAccess.getListTypeAccess().getNonNullExclamationMarkKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__NonNullAssignment_3"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalGraphQL.g:5300:1: rule__IntValue__ValueAssignment : ( RULE_INT_VALUE ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5304:1: ( ( RULE_INT_VALUE ) )
            // InternalGraphQL.g:5305:2: ( RULE_INT_VALUE )
            {
            // InternalGraphQL.g:5305:2: ( RULE_INT_VALUE )
            // InternalGraphQL.g:5306:3: RULE_INT_VALUE
            {
             before(grammarAccess.getIntValueAccess().getValueINT_VALUETerminalRuleCall_0()); 
            match(input,RULE_INT_VALUE,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValueINT_VALUETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__FloatValue__ValueAssignment"
    // InternalGraphQL.g:5315:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT_VALUE ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5319:1: ( ( RULE_FLOAT_VALUE ) )
            // InternalGraphQL.g:5320:2: ( RULE_FLOAT_VALUE )
            {
            // InternalGraphQL.g:5320:2: ( RULE_FLOAT_VALUE )
            // InternalGraphQL.g:5321:3: RULE_FLOAT_VALUE
            {
             before(grammarAccess.getFloatValueAccess().getValueFLOAT_VALUETerminalRuleCall_0()); 
            match(input,RULE_FLOAT_VALUE,FOLLOW_2); 
             after(grammarAccess.getFloatValueAccess().getValueFLOAT_VALUETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__ValueAssignment"


    // $ANTLR start "rule__NullValue__ValueAssignment"
    // InternalGraphQL.g:5330:1: rule__NullValue__ValueAssignment : ( ( 'null' ) ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5334:1: ( ( ( 'null' ) ) )
            // InternalGraphQL.g:5335:2: ( ( 'null' ) )
            {
            // InternalGraphQL.g:5335:2: ( ( 'null' ) )
            // InternalGraphQL.g:5336:3: ( 'null' )
            {
             before(grammarAccess.getNullValueAccess().getValueNullKeyword_0()); 
            // InternalGraphQL.g:5337:3: ( 'null' )
            // InternalGraphQL.g:5338:4: 'null'
            {
             before(grammarAccess.getNullValueAccess().getValueNullKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getNullValueAccess().getValueNullKeyword_0()); 

            }

             after(grammarAccess.getNullValueAccess().getValueNullKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalGraphQL.g:5349:1: rule__StringValue__ValueAssignment : ( ( rule__StringValue__ValueAlternatives_0 ) ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5353:1: ( ( ( rule__StringValue__ValueAlternatives_0 ) ) )
            // InternalGraphQL.g:5354:2: ( ( rule__StringValue__ValueAlternatives_0 ) )
            {
            // InternalGraphQL.g:5354:2: ( ( rule__StringValue__ValueAlternatives_0 ) )
            // InternalGraphQL.g:5355:3: ( rule__StringValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getStringValueAccess().getValueAlternatives_0()); 
            // InternalGraphQL.g:5356:3: ( rule__StringValue__ValueAlternatives_0 )
            // InternalGraphQL.g:5356:4: rule__StringValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalGraphQL.g:5364:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5368:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // InternalGraphQL.g:5369:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // InternalGraphQL.g:5369:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // InternalGraphQL.g:5370:3: ( rule__BooleanValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            // InternalGraphQL.g:5371:3: ( rule__BooleanValue__ValueAlternatives_0 )
            // InternalGraphQL.g:5371:4: rule__BooleanValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__EnumValue__ValueAssignment"
    // InternalGraphQL.g:5379:1: rule__EnumValue__ValueAssignment : ( ( RULE_NAME ) ) ;
    public final void rule__EnumValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5383:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:5384:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:5384:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5385:3: ( RULE_NAME )
            {
             before(grammarAccess.getEnumValueAccess().getValueEnumValueDefinitionCrossReference_0()); 
            // InternalGraphQL.g:5386:3: ( RULE_NAME )
            // InternalGraphQL.g:5387:4: RULE_NAME
            {
             before(grammarAccess.getEnumValueAccess().getValueEnumValueDefinitionNAMETerminalRuleCall_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getValueEnumValueDefinitionNAMETerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEnumValueAccess().getValueEnumValueDefinitionCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__ValueAssignment"


    // $ANTLR start "rule__ObjectValue__FieldsAssignment_2"
    // InternalGraphQL.g:5398:1: rule__ObjectValue__FieldsAssignment_2 : ( ruleObjectField ) ;
    public final void rule__ObjectValue__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5402:1: ( ( ruleObjectField ) )
            // InternalGraphQL.g:5403:2: ( ruleObjectField )
            {
            // InternalGraphQL.g:5403:2: ( ruleObjectField )
            // InternalGraphQL.g:5404:3: ruleObjectField
            {
             before(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectField();

            state._fsp--;

             after(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__FieldsAssignment_2"


    // $ANTLR start "rule__ObjectField__FieldDefinitionAssignment_0"
    // InternalGraphQL.g:5413:1: rule__ObjectField__FieldDefinitionAssignment_0 : ( ( RULE_NAME ) ) ;
    public final void rule__ObjectField__FieldDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5417:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:5418:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:5418:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5419:3: ( RULE_NAME )
            {
             before(grammarAccess.getObjectFieldAccess().getFieldDefinitionFieldDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:5420:3: ( RULE_NAME )
            // InternalGraphQL.g:5421:4: RULE_NAME
            {
             before(grammarAccess.getObjectFieldAccess().getFieldDefinitionFieldDefinitionNAMETerminalRuleCall_0_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getObjectFieldAccess().getFieldDefinitionFieldDefinitionNAMETerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjectFieldAccess().getFieldDefinitionFieldDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__FieldDefinitionAssignment_0"


    // $ANTLR start "rule__ObjectField__ValueAssignment_2"
    // InternalGraphQL.g:5432:1: rule__ObjectField__ValueAssignment_2 : ( ruleConstValue ) ;
    public final void rule__ObjectField__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5436:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:5437:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:5437:2: ( ruleConstValue )
            // InternalGraphQL.g:5438:3: ruleConstValue
            {
             before(grammarAccess.getObjectFieldAccess().getValueConstValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstValue();

            state._fsp--;

             after(grammarAccess.getObjectFieldAccess().getValueConstValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__ValueAssignment_2"


    // $ANTLR start "rule__ListValue__ValuesAssignment_2"
    // InternalGraphQL.g:5447:1: rule__ListValue__ValuesAssignment_2 : ( ruleConstValue ) ;
    public final void rule__ListValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5451:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:5452:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:5452:2: ( ruleConstValue )
            // InternalGraphQL.g:5453:3: ruleConstValue
            {
             before(grammarAccess.getListValueAccess().getValuesConstValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstValue();

            state._fsp--;

             after(grammarAccess.getListValueAccess().getValuesConstValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__ValuesAssignment_2"


    // $ANTLR start "rule__DirectiveDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:5462:1: rule__DirectiveDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__DirectiveDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5466:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:5467:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:5467:2: ( ruleStringValue )
            // InternalGraphQL.g:5468:3: ruleStringValue
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getDirectiveDefinitionAccess().getDescriptionStringValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__DirectiveDefinition__NameAssignment_2"
    // InternalGraphQL.g:5477:1: rule__DirectiveDefinition__NameAssignment_2 : ( RULE_DIRECTIVE_NAME ) ;
    public final void rule__DirectiveDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5481:1: ( ( RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:5482:2: ( RULE_DIRECTIVE_NAME )
            {
            // InternalGraphQL.g:5482:2: ( RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:5483:3: RULE_DIRECTIVE_NAME
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getNameDIRECTIVE_NAMETerminalRuleCall_2_0()); 
            match(input,RULE_DIRECTIVE_NAME,FOLLOW_2); 
             after(grammarAccess.getDirectiveDefinitionAccess().getNameDIRECTIVE_NAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__NameAssignment_2"


    // $ANTLR start "rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1"
    // InternalGraphQL.g:5492:1: rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1 : ( ruleInputValueDefinition ) ;
    public final void rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5496:1: ( ( ruleInputValueDefinition ) )
            // InternalGraphQL.g:5497:2: ( ruleInputValueDefinition )
            {
            // InternalGraphQL.g:5497:2: ( ruleInputValueDefinition )
            // InternalGraphQL.g:5498:3: ruleInputValueDefinition
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getArgumentsDefinitionInputValueDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValueDefinition();

            state._fsp--;

             after(grammarAccess.getDirectiveDefinitionAccess().getArgumentsDefinitionInputValueDefinitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__ArgumentsDefinitionAssignment_3_1"


    // $ANTLR start "rule__DirectiveDefinition__RepeatableAssignment_4"
    // InternalGraphQL.g:5507:1: rule__DirectiveDefinition__RepeatableAssignment_4 : ( ( 'repeatable' ) ) ;
    public final void rule__DirectiveDefinition__RepeatableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5511:1: ( ( ( 'repeatable' ) ) )
            // InternalGraphQL.g:5512:2: ( ( 'repeatable' ) )
            {
            // InternalGraphQL.g:5512:2: ( ( 'repeatable' ) )
            // InternalGraphQL.g:5513:3: ( 'repeatable' )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getRepeatableRepeatableKeyword_4_0()); 
            // InternalGraphQL.g:5514:3: ( 'repeatable' )
            // InternalGraphQL.g:5515:4: 'repeatable'
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getRepeatableRepeatableKeyword_4_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDirectiveDefinitionAccess().getRepeatableRepeatableKeyword_4_0()); 

            }

             after(grammarAccess.getDirectiveDefinitionAccess().getRepeatableRepeatableKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__RepeatableAssignment_4"


    // $ANTLR start "rule__DirectiveDefinition__DirectiveLocationsAssignment_7"
    // InternalGraphQL.g:5526:1: rule__DirectiveDefinition__DirectiveLocationsAssignment_7 : ( ruleDirectiveLocation ) ;
    public final void rule__DirectiveDefinition__DirectiveLocationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5530:1: ( ( ruleDirectiveLocation ) )
            // InternalGraphQL.g:5531:2: ( ruleDirectiveLocation )
            {
            // InternalGraphQL.g:5531:2: ( ruleDirectiveLocation )
            // InternalGraphQL.g:5532:3: ruleDirectiveLocation
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectiveLocation();

            state._fsp--;

             after(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__DirectiveLocationsAssignment_7"


    // $ANTLR start "rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1"
    // InternalGraphQL.g:5541:1: rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1 : ( ruleDirectiveLocation ) ;
    public final void rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5545:1: ( ( ruleDirectiveLocation ) )
            // InternalGraphQL.g:5546:2: ( ruleDirectiveLocation )
            {
            // InternalGraphQL.g:5546:2: ( ruleDirectiveLocation )
            // InternalGraphQL.g:5547:3: ruleDirectiveLocation
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectiveLocation();

            state._fsp--;

             after(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectiveDefinition__DirectiveLocationsAssignment_8_1"


    // $ANTLR start "rule__Directive__DirectiveAssignment_0"
    // InternalGraphQL.g:5556:1: rule__Directive__DirectiveAssignment_0 : ( ( RULE_DIRECTIVE_NAME ) ) ;
    public final void rule__Directive__DirectiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5560:1: ( ( ( RULE_DIRECTIVE_NAME ) ) )
            // InternalGraphQL.g:5561:2: ( ( RULE_DIRECTIVE_NAME ) )
            {
            // InternalGraphQL.g:5561:2: ( ( RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:5562:3: ( RULE_DIRECTIVE_NAME )
            {
             before(grammarAccess.getDirectiveAccess().getDirectiveDirectiveDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:5563:3: ( RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:5564:4: RULE_DIRECTIVE_NAME
            {
             before(grammarAccess.getDirectiveAccess().getDirectiveDirectiveDefinitionDIRECTIVE_NAMETerminalRuleCall_0_0_1()); 
            match(input,RULE_DIRECTIVE_NAME,FOLLOW_2); 
             after(grammarAccess.getDirectiveAccess().getDirectiveDirectiveDefinitionDIRECTIVE_NAMETerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDirectiveAccess().getDirectiveDirectiveDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__DirectiveAssignment_0"


    // $ANTLR start "rule__Directive__ArgumentsAssignment_1_1"
    // InternalGraphQL.g:5575:1: rule__Directive__ArgumentsAssignment_1_1 : ( ruleArgument ) ;
    public final void rule__Directive__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5579:1: ( ( ruleArgument ) )
            // InternalGraphQL.g:5580:2: ( ruleArgument )
            {
            // InternalGraphQL.g:5580:2: ( ruleArgument )
            // InternalGraphQL.g:5581:3: ruleArgument
            {
             before(grammarAccess.getDirectiveAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getDirectiveAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__Argument__ArgumentDefinitionAssignment_0"
    // InternalGraphQL.g:5590:1: rule__Argument__ArgumentDefinitionAssignment_0 : ( ( RULE_NAME ) ) ;
    public final void rule__Argument__ArgumentDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5594:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:5595:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:5595:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5596:3: ( RULE_NAME )
            {
             before(grammarAccess.getArgumentAccess().getArgumentDefinitionInputValueDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:5597:3: ( RULE_NAME )
            // InternalGraphQL.g:5598:4: RULE_NAME
            {
             before(grammarAccess.getArgumentAccess().getArgumentDefinitionInputValueDefinitionNAMETerminalRuleCall_0_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getArgumentDefinitionInputValueDefinitionNAMETerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getArgumentAccess().getArgumentDefinitionInputValueDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__ArgumentDefinitionAssignment_0"


    // $ANTLR start "rule__Argument__ValueAssignment_2"
    // InternalGraphQL.g:5609:1: rule__Argument__ValueAssignment_2 : ( ruleConstValue ) ;
    public final void rule__Argument__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5613:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:5614:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:5614:2: ( ruleConstValue )
            // InternalGraphQL.g:5615:3: ruleConstValue
            {
             before(grammarAccess.getArgumentAccess().getValueConstValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstValue();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getValueConstValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x01324C4000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000108000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0048000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000200L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00324C0000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x084000800000C1F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x08C000800000C1F0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x084000800000C1F2L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x01324C4000000030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1200800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00080007FFFF0000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000040L});

}