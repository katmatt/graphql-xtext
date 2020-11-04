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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_STRING_VALUE", "RULE_ML_STRING_VALUE", "RULE_NAME", "RULE_INT_VALUE", "RULE_FLOAT_VALUE", "RULE_DIRECTIVE_NAME", "RULE_WS", "RULE_SL_COMMENT", "RULE_COMMA", "RULE_STRING_CHARACTER", "'true'", "'false'", "'QUERY'", "'MUTATION'", "'SUBSCRIPTION'", "'FIELD'", "'FRAGMENT_DEFINITION'", "'FRAGMENT_SPREAD'", "'INLINE_FRAGMENT'", "'VARIABLE_DEFINITION'", "'SCHEMA'", "'SCALAR'", "'OBJECT'", "'FIELD_DEFINITION'", "'ARGUMENT_DEFINITION'", "'INTERFACE'", "'UNION'", "'ENUM'", "'ENUM_VALUE'", "'INPUT_OBJECT'", "'INPUT_FIELD_DEFINITION'", "'query'", "'mutation'", "'subscription'", "'schema'", "'{'", "'}'", "':'", "'scalar'", "'type'", "'implements'", "'interface'", "'union'", "'='", "'|'", "'enum'", "'input'", "'&'", "'['", "']'", "'directive'", "'on'", "'('", "')'", "'!'", "'null'", "'repeatable'"
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

                if ( ((LA1_0>=RULE_SL_STRING_VALUE && LA1_0<=RULE_ML_STRING_VALUE)||LA1_0==38||(LA1_0>=42 && LA1_0<=43)||(LA1_0>=45 && LA1_0<=46)||(LA1_0>=49 && LA1_0<=50)||LA1_0==54) ) {
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


    // $ANTLR start "entryRuleIntersectionType"
    // InternalGraphQL.g:378:1: entryRuleIntersectionType : ruleIntersectionType EOF ;
    public final void entryRuleIntersectionType() throws RecognitionException {
        try {
            // InternalGraphQL.g:379:1: ( ruleIntersectionType EOF )
            // InternalGraphQL.g:380:1: ruleIntersectionType EOF
            {
             before(grammarAccess.getIntersectionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntersectionType();

            state._fsp--;

             after(grammarAccess.getIntersectionTypeRule()); 
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
    // $ANTLR end "entryRuleIntersectionType"


    // $ANTLR start "ruleIntersectionType"
    // InternalGraphQL.g:387:1: ruleIntersectionType : ( ( rule__IntersectionType__Group__0 ) ) ;
    public final void ruleIntersectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:391:2: ( ( ( rule__IntersectionType__Group__0 ) ) )
            // InternalGraphQL.g:392:2: ( ( rule__IntersectionType__Group__0 ) )
            {
            // InternalGraphQL.g:392:2: ( ( rule__IntersectionType__Group__0 ) )
            // InternalGraphQL.g:393:3: ( rule__IntersectionType__Group__0 )
            {
             before(grammarAccess.getIntersectionTypeAccess().getGroup()); 
            // InternalGraphQL.g:394:3: ( rule__IntersectionType__Group__0 )
            // InternalGraphQL.g:394:4: rule__IntersectionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleIntersectionType"


    // $ANTLR start "entryRuleType"
    // InternalGraphQL.g:403:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGraphQL.g:404:1: ( ruleType EOF )
            // InternalGraphQL.g:405:1: ruleType EOF
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
    // InternalGraphQL.g:412:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:416:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGraphQL.g:417:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGraphQL.g:417:2: ( ( rule__Type__Alternatives ) )
            // InternalGraphQL.g:418:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalGraphQL.g:419:3: ( rule__Type__Alternatives )
            // InternalGraphQL.g:419:4: rule__Type__Alternatives
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
    // InternalGraphQL.g:428:1: entryRuleNamedType : ruleNamedType EOF ;
    public final void entryRuleNamedType() throws RecognitionException {
        try {
            // InternalGraphQL.g:429:1: ( ruleNamedType EOF )
            // InternalGraphQL.g:430:1: ruleNamedType EOF
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
    // InternalGraphQL.g:437:1: ruleNamedType : ( ( rule__NamedType__Group__0 ) ) ;
    public final void ruleNamedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:441:2: ( ( ( rule__NamedType__Group__0 ) ) )
            // InternalGraphQL.g:442:2: ( ( rule__NamedType__Group__0 ) )
            {
            // InternalGraphQL.g:442:2: ( ( rule__NamedType__Group__0 ) )
            // InternalGraphQL.g:443:3: ( rule__NamedType__Group__0 )
            {
             before(grammarAccess.getNamedTypeAccess().getGroup()); 
            // InternalGraphQL.g:444:3: ( rule__NamedType__Group__0 )
            // InternalGraphQL.g:444:4: rule__NamedType__Group__0
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
    // InternalGraphQL.g:453:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // InternalGraphQL.g:454:1: ( ruleListType EOF )
            // InternalGraphQL.g:455:1: ruleListType EOF
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
    // InternalGraphQL.g:462:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:466:2: ( ( ( rule__ListType__Group__0 ) ) )
            // InternalGraphQL.g:467:2: ( ( rule__ListType__Group__0 ) )
            {
            // InternalGraphQL.g:467:2: ( ( rule__ListType__Group__0 ) )
            // InternalGraphQL.g:468:3: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // InternalGraphQL.g:469:3: ( rule__ListType__Group__0 )
            // InternalGraphQL.g:469:4: rule__ListType__Group__0
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
    // InternalGraphQL.g:478:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:479:1: ( ruleIntValue EOF )
            // InternalGraphQL.g:480:1: ruleIntValue EOF
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
    // InternalGraphQL.g:487:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:491:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalGraphQL.g:492:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:492:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalGraphQL.g:493:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:494:3: ( rule__IntValue__ValueAssignment )
            // InternalGraphQL.g:494:4: rule__IntValue__ValueAssignment
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
    // InternalGraphQL.g:503:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:504:1: ( ruleFloatValue EOF )
            // InternalGraphQL.g:505:1: ruleFloatValue EOF
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
    // InternalGraphQL.g:512:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:516:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalGraphQL.g:517:2: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:517:2: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalGraphQL.g:518:3: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:519:3: ( rule__FloatValue__ValueAssignment )
            // InternalGraphQL.g:519:4: rule__FloatValue__ValueAssignment
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
    // InternalGraphQL.g:528:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:529:1: ( ruleNullValue EOF )
            // InternalGraphQL.g:530:1: ruleNullValue EOF
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
    // InternalGraphQL.g:537:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:541:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalGraphQL.g:542:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:542:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalGraphQL.g:543:3: ( rule__NullValue__ValueAssignment )
            {
             before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:544:3: ( rule__NullValue__ValueAssignment )
            // InternalGraphQL.g:544:4: rule__NullValue__ValueAssignment
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
    // InternalGraphQL.g:553:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:554:1: ( ruleStringValue EOF )
            // InternalGraphQL.g:555:1: ruleStringValue EOF
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
    // InternalGraphQL.g:562:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:566:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGraphQL.g:567:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:567:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGraphQL.g:568:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:569:3: ( rule__StringValue__ValueAssignment )
            // InternalGraphQL.g:569:4: rule__StringValue__ValueAssignment
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
    // InternalGraphQL.g:578:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:579:1: ( ruleBooleanValue EOF )
            // InternalGraphQL.g:580:1: ruleBooleanValue EOF
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
    // InternalGraphQL.g:587:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:591:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalGraphQL.g:592:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:592:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalGraphQL.g:593:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:594:3: ( rule__BooleanValue__ValueAssignment )
            // InternalGraphQL.g:594:4: rule__BooleanValue__ValueAssignment
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
    // InternalGraphQL.g:603:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:604:1: ( ruleEnumValue EOF )
            // InternalGraphQL.g:605:1: ruleEnumValue EOF
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
    // InternalGraphQL.g:612:1: ruleEnumValue : ( ( rule__EnumValue__ValueAssignment ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:616:2: ( ( ( rule__EnumValue__ValueAssignment ) ) )
            // InternalGraphQL.g:617:2: ( ( rule__EnumValue__ValueAssignment ) )
            {
            // InternalGraphQL.g:617:2: ( ( rule__EnumValue__ValueAssignment ) )
            // InternalGraphQL.g:618:3: ( rule__EnumValue__ValueAssignment )
            {
             before(grammarAccess.getEnumValueAccess().getValueAssignment()); 
            // InternalGraphQL.g:619:3: ( rule__EnumValue__ValueAssignment )
            // InternalGraphQL.g:619:4: rule__EnumValue__ValueAssignment
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
    // InternalGraphQL.g:628:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:629:1: ( ruleObjectValue EOF )
            // InternalGraphQL.g:630:1: ruleObjectValue EOF
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
    // InternalGraphQL.g:637:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:641:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGraphQL.g:642:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGraphQL.g:642:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGraphQL.g:643:3: ( rule__ObjectValue__Group__0 )
            {
             before(grammarAccess.getObjectValueAccess().getGroup()); 
            // InternalGraphQL.g:644:3: ( rule__ObjectValue__Group__0 )
            // InternalGraphQL.g:644:4: rule__ObjectValue__Group__0
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
    // InternalGraphQL.g:653:1: entryRuleObjectField : ruleObjectField EOF ;
    public final void entryRuleObjectField() throws RecognitionException {
        try {
            // InternalGraphQL.g:654:1: ( ruleObjectField EOF )
            // InternalGraphQL.g:655:1: ruleObjectField EOF
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
    // InternalGraphQL.g:662:1: ruleObjectField : ( ( rule__ObjectField__Group__0 ) ) ;
    public final void ruleObjectField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:666:2: ( ( ( rule__ObjectField__Group__0 ) ) )
            // InternalGraphQL.g:667:2: ( ( rule__ObjectField__Group__0 ) )
            {
            // InternalGraphQL.g:667:2: ( ( rule__ObjectField__Group__0 ) )
            // InternalGraphQL.g:668:3: ( rule__ObjectField__Group__0 )
            {
             before(grammarAccess.getObjectFieldAccess().getGroup()); 
            // InternalGraphQL.g:669:3: ( rule__ObjectField__Group__0 )
            // InternalGraphQL.g:669:4: rule__ObjectField__Group__0
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
    // InternalGraphQL.g:678:1: entryRuleConstValue : ruleConstValue EOF ;
    public final void entryRuleConstValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:679:1: ( ruleConstValue EOF )
            // InternalGraphQL.g:680:1: ruleConstValue EOF
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
    // InternalGraphQL.g:687:1: ruleConstValue : ( ( rule__ConstValue__Alternatives ) ) ;
    public final void ruleConstValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:691:2: ( ( ( rule__ConstValue__Alternatives ) ) )
            // InternalGraphQL.g:692:2: ( ( rule__ConstValue__Alternatives ) )
            {
            // InternalGraphQL.g:692:2: ( ( rule__ConstValue__Alternatives ) )
            // InternalGraphQL.g:693:3: ( rule__ConstValue__Alternatives )
            {
             before(grammarAccess.getConstValueAccess().getAlternatives()); 
            // InternalGraphQL.g:694:3: ( rule__ConstValue__Alternatives )
            // InternalGraphQL.g:694:4: rule__ConstValue__Alternatives
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
    // InternalGraphQL.g:703:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // InternalGraphQL.g:704:1: ( ruleListValue EOF )
            // InternalGraphQL.g:705:1: ruleListValue EOF
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
    // InternalGraphQL.g:712:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:716:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // InternalGraphQL.g:717:2: ( ( rule__ListValue__Group__0 ) )
            {
            // InternalGraphQL.g:717:2: ( ( rule__ListValue__Group__0 ) )
            // InternalGraphQL.g:718:3: ( rule__ListValue__Group__0 )
            {
             before(grammarAccess.getListValueAccess().getGroup()); 
            // InternalGraphQL.g:719:3: ( rule__ListValue__Group__0 )
            // InternalGraphQL.g:719:4: rule__ListValue__Group__0
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
    // InternalGraphQL.g:728:1: entryRuleDirectiveDefinition : ruleDirectiveDefinition EOF ;
    public final void entryRuleDirectiveDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:729:1: ( ruleDirectiveDefinition EOF )
            // InternalGraphQL.g:730:1: ruleDirectiveDefinition EOF
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
    // InternalGraphQL.g:737:1: ruleDirectiveDefinition : ( ( rule__DirectiveDefinition__Group__0 ) ) ;
    public final void ruleDirectiveDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:741:2: ( ( ( rule__DirectiveDefinition__Group__0 ) ) )
            // InternalGraphQL.g:742:2: ( ( rule__DirectiveDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:742:2: ( ( rule__DirectiveDefinition__Group__0 ) )
            // InternalGraphQL.g:743:3: ( rule__DirectiveDefinition__Group__0 )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:744:3: ( rule__DirectiveDefinition__Group__0 )
            // InternalGraphQL.g:744:4: rule__DirectiveDefinition__Group__0
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
    // InternalGraphQL.g:753:1: entryRuleDirective : ruleDirective EOF ;
    public final void entryRuleDirective() throws RecognitionException {
        try {
            // InternalGraphQL.g:754:1: ( ruleDirective EOF )
            // InternalGraphQL.g:755:1: ruleDirective EOF
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
    // InternalGraphQL.g:762:1: ruleDirective : ( ( rule__Directive__Group__0 ) ) ;
    public final void ruleDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:766:2: ( ( ( rule__Directive__Group__0 ) ) )
            // InternalGraphQL.g:767:2: ( ( rule__Directive__Group__0 ) )
            {
            // InternalGraphQL.g:767:2: ( ( rule__Directive__Group__0 ) )
            // InternalGraphQL.g:768:3: ( rule__Directive__Group__0 )
            {
             before(grammarAccess.getDirectiveAccess().getGroup()); 
            // InternalGraphQL.g:769:3: ( rule__Directive__Group__0 )
            // InternalGraphQL.g:769:4: rule__Directive__Group__0
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


    // $ANTLR start "entryRuleArguments"
    // InternalGraphQL.g:778:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalGraphQL.g:779:1: ( ruleArguments EOF )
            // InternalGraphQL.g:780:1: ruleArguments EOF
            {
             before(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getArgumentsRule()); 
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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalGraphQL.g:787:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:791:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalGraphQL.g:792:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalGraphQL.g:792:2: ( ( rule__Arguments__Group__0 ) )
            // InternalGraphQL.g:793:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalGraphQL.g:794:3: ( rule__Arguments__Group__0 )
            // InternalGraphQL.g:794:4: rule__Arguments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getGroup()); 

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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleArgument"
    // InternalGraphQL.g:803:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalGraphQL.g:804:1: ( ruleArgument EOF )
            // InternalGraphQL.g:805:1: ruleArgument EOF
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
    // InternalGraphQL.g:812:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:816:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalGraphQL.g:817:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalGraphQL.g:817:2: ( ( rule__Argument__Group__0 ) )
            // InternalGraphQL.g:818:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalGraphQL.g:819:3: ( rule__Argument__Group__0 )
            // InternalGraphQL.g:819:4: rule__Argument__Group__0
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


    // $ANTLR start "entryRuleArgumentsDefinition"
    // InternalGraphQL.g:828:1: entryRuleArgumentsDefinition : ruleArgumentsDefinition EOF ;
    public final void entryRuleArgumentsDefinition() throws RecognitionException {
        try {
            // InternalGraphQL.g:829:1: ( ruleArgumentsDefinition EOF )
            // InternalGraphQL.g:830:1: ruleArgumentsDefinition EOF
            {
             before(grammarAccess.getArgumentsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleArgumentsDefinition();

            state._fsp--;

             after(grammarAccess.getArgumentsDefinitionRule()); 
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
    // $ANTLR end "entryRuleArgumentsDefinition"


    // $ANTLR start "ruleArgumentsDefinition"
    // InternalGraphQL.g:837:1: ruleArgumentsDefinition : ( ( rule__ArgumentsDefinition__Group__0 ) ) ;
    public final void ruleArgumentsDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:841:2: ( ( ( rule__ArgumentsDefinition__Group__0 ) ) )
            // InternalGraphQL.g:842:2: ( ( rule__ArgumentsDefinition__Group__0 ) )
            {
            // InternalGraphQL.g:842:2: ( ( rule__ArgumentsDefinition__Group__0 ) )
            // InternalGraphQL.g:843:3: ( rule__ArgumentsDefinition__Group__0 )
            {
             before(grammarAccess.getArgumentsDefinitionAccess().getGroup()); 
            // InternalGraphQL.g:844:3: ( rule__ArgumentsDefinition__Group__0 )
            // InternalGraphQL.g:844:4: rule__ArgumentsDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentsDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleArgumentsDefinition"


    // $ANTLR start "entryRuleDirectiveLocations"
    // InternalGraphQL.g:853:1: entryRuleDirectiveLocations : ruleDirectiveLocations EOF ;
    public final void entryRuleDirectiveLocations() throws RecognitionException {
        try {
            // InternalGraphQL.g:854:1: ( ruleDirectiveLocations EOF )
            // InternalGraphQL.g:855:1: ruleDirectiveLocations EOF
            {
             before(grammarAccess.getDirectiveLocationsRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectiveLocations();

            state._fsp--;

             after(grammarAccess.getDirectiveLocationsRule()); 
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
    // $ANTLR end "entryRuleDirectiveLocations"


    // $ANTLR start "ruleDirectiveLocations"
    // InternalGraphQL.g:862:1: ruleDirectiveLocations : ( ( rule__DirectiveLocations__Group__0 ) ) ;
    public final void ruleDirectiveLocations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:866:2: ( ( ( rule__DirectiveLocations__Group__0 ) ) )
            // InternalGraphQL.g:867:2: ( ( rule__DirectiveLocations__Group__0 ) )
            {
            // InternalGraphQL.g:867:2: ( ( rule__DirectiveLocations__Group__0 ) )
            // InternalGraphQL.g:868:3: ( rule__DirectiveLocations__Group__0 )
            {
             before(grammarAccess.getDirectiveLocationsAccess().getGroup()); 
            // InternalGraphQL.g:869:3: ( rule__DirectiveLocations__Group__0 )
            // InternalGraphQL.g:869:4: rule__DirectiveLocations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveLocations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveLocationsAccess().getGroup()); 

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
    // $ANTLR end "ruleDirectiveLocations"


    // $ANTLR start "ruleDirectiveLocation"
    // InternalGraphQL.g:878:1: ruleDirectiveLocation : ( ( rule__DirectiveLocation__Alternatives ) ) ;
    public final void ruleDirectiveLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:882:1: ( ( ( rule__DirectiveLocation__Alternatives ) ) )
            // InternalGraphQL.g:883:2: ( ( rule__DirectiveLocation__Alternatives ) )
            {
            // InternalGraphQL.g:883:2: ( ( rule__DirectiveLocation__Alternatives ) )
            // InternalGraphQL.g:884:3: ( rule__DirectiveLocation__Alternatives )
            {
             before(grammarAccess.getDirectiveLocationAccess().getAlternatives()); 
            // InternalGraphQL.g:885:3: ( rule__DirectiveLocation__Alternatives )
            // InternalGraphQL.g:885:4: rule__DirectiveLocation__Alternatives
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
    // InternalGraphQL.g:894:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:898:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalGraphQL.g:899:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalGraphQL.g:899:2: ( ( rule__OperationType__Alternatives ) )
            // InternalGraphQL.g:900:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalGraphQL.g:901:3: ( rule__OperationType__Alternatives )
            // InternalGraphQL.g:901:4: rule__OperationType__Alternatives
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
    // InternalGraphQL.g:909:1: rule__TypeSystemDefinition__Alternatives : ( ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) ) | ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) ) | ( ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 ) ) );
    public final void rule__TypeSystemDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:913:1: ( ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) ) | ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) ) | ( ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_SL_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 42:
                case 43:
                case 45:
                case 46:
                case 49:
                case 50:
                    {
                    alt2=2;
                    }
                    break;
                case 38:
                    {
                    alt2=1;
                    }
                    break;
                case 54:
                    {
                    alt2=3;
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
                case 45:
                case 46:
                case 49:
                case 50:
                    {
                    alt2=2;
                    }
                    break;
                case 54:
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
            case 45:
            case 46:
            case 49:
            case 50:
                {
                alt2=2;
                }
                break;
            case 54:
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
                    // InternalGraphQL.g:914:2: ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) )
                    {
                    // InternalGraphQL.g:914:2: ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) )
                    // InternalGraphQL.g:915:3: ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsAssignment_0()); 
                    // InternalGraphQL.g:916:3: ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 )
                    // InternalGraphQL.g:916:4: rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0
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
                    // InternalGraphQL.g:920:2: ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) )
                    {
                    // InternalGraphQL.g:920:2: ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) )
                    // InternalGraphQL.g:921:3: ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsAssignment_1()); 
                    // InternalGraphQL.g:922:3: ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 )
                    // InternalGraphQL.g:922:4: rule__TypeSystemDefinition__TypeDefinitionsAssignment_1
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
                    // InternalGraphQL.g:926:2: ( ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 ) )
                    {
                    // InternalGraphQL.g:926:2: ( ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 ) )
                    // InternalGraphQL.g:927:3: ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getDirectiveDefinitionsAssignment_2()); 
                    // InternalGraphQL.g:928:3: ( rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 )
                    // InternalGraphQL.g:928:4: rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2
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
    // InternalGraphQL.g:936:1: rule__TypeDefinition__Alternatives : ( ( ruleScalarTypeDefinition ) | ( ruleObjectTypeDefinition ) | ( ruleInterfaceDefinition ) | ( ruleUnionTypeDefinition ) | ( ruleEnumTypeDefinition ) | ( ruleInputObjectTypeDefinition ) );
    public final void rule__TypeDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:940:1: ( ( ruleScalarTypeDefinition ) | ( ruleObjectTypeDefinition ) | ( ruleInterfaceDefinition ) | ( ruleUnionTypeDefinition ) | ( ruleEnumTypeDefinition ) | ( ruleInputObjectTypeDefinition ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_SL_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt3=5;
                    }
                    break;
                case 45:
                    {
                    alt3=3;
                    }
                    break;
                case 43:
                    {
                    alt3=2;
                    }
                    break;
                case 50:
                    {
                    alt3=6;
                    }
                    break;
                case 42:
                    {
                    alt3=1;
                    }
                    break;
                case 46:
                    {
                    alt3=4;
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
                case 43:
                    {
                    alt3=2;
                    }
                    break;
                case 50:
                    {
                    alt3=6;
                    }
                    break;
                case 42:
                    {
                    alt3=1;
                    }
                    break;
                case 46:
                    {
                    alt3=4;
                    }
                    break;
                case 49:
                    {
                    alt3=5;
                    }
                    break;
                case 45:
                    {
                    alt3=3;
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
            case 45:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
                }
                break;
            case 49:
                {
                alt3=5;
                }
                break;
            case 50:
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
                    // InternalGraphQL.g:941:2: ( ruleScalarTypeDefinition )
                    {
                    // InternalGraphQL.g:941:2: ( ruleScalarTypeDefinition )
                    // InternalGraphQL.g:942:3: ruleScalarTypeDefinition
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
                    // InternalGraphQL.g:947:2: ( ruleObjectTypeDefinition )
                    {
                    // InternalGraphQL.g:947:2: ( ruleObjectTypeDefinition )
                    // InternalGraphQL.g:948:3: ruleObjectTypeDefinition
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
                    // InternalGraphQL.g:953:2: ( ruleInterfaceDefinition )
                    {
                    // InternalGraphQL.g:953:2: ( ruleInterfaceDefinition )
                    // InternalGraphQL.g:954:3: ruleInterfaceDefinition
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
                    // InternalGraphQL.g:959:2: ( ruleUnionTypeDefinition )
                    {
                    // InternalGraphQL.g:959:2: ( ruleUnionTypeDefinition )
                    // InternalGraphQL.g:960:3: ruleUnionTypeDefinition
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
                    // InternalGraphQL.g:965:2: ( ruleEnumTypeDefinition )
                    {
                    // InternalGraphQL.g:965:2: ( ruleEnumTypeDefinition )
                    // InternalGraphQL.g:966:3: ruleEnumTypeDefinition
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
                    // InternalGraphQL.g:971:2: ( ruleInputObjectTypeDefinition )
                    {
                    // InternalGraphQL.g:971:2: ( ruleInputObjectTypeDefinition )
                    // InternalGraphQL.g:972:3: ruleInputObjectTypeDefinition
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
    // InternalGraphQL.g:981:1: rule__Type__Alternatives : ( ( ruleNamedType ) | ( ruleListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:985:1: ( ( ruleNamedType ) | ( ruleListType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==52) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphQL.g:986:2: ( ruleNamedType )
                    {
                    // InternalGraphQL.g:986:2: ( ruleNamedType )
                    // InternalGraphQL.g:987:3: ruleNamedType
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
                    // InternalGraphQL.g:992:2: ( ruleListType )
                    {
                    // InternalGraphQL.g:992:2: ( ruleListType )
                    // InternalGraphQL.g:993:3: ruleListType
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
    // InternalGraphQL.g:1002:1: rule__StringValue__ValueAlternatives_0 : ( ( RULE_SL_STRING_VALUE ) | ( RULE_ML_STRING_VALUE ) );
    public final void rule__StringValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1006:1: ( ( RULE_SL_STRING_VALUE ) | ( RULE_ML_STRING_VALUE ) )
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
                    // InternalGraphQL.g:1007:2: ( RULE_SL_STRING_VALUE )
                    {
                    // InternalGraphQL.g:1007:2: ( RULE_SL_STRING_VALUE )
                    // InternalGraphQL.g:1008:3: RULE_SL_STRING_VALUE
                    {
                     before(grammarAccess.getStringValueAccess().getValueSL_STRING_VALUETerminalRuleCall_0_0()); 
                    match(input,RULE_SL_STRING_VALUE,FOLLOW_2); 
                     after(grammarAccess.getStringValueAccess().getValueSL_STRING_VALUETerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1013:2: ( RULE_ML_STRING_VALUE )
                    {
                    // InternalGraphQL.g:1013:2: ( RULE_ML_STRING_VALUE )
                    // InternalGraphQL.g:1014:3: RULE_ML_STRING_VALUE
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
    // InternalGraphQL.g:1023:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1027:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalGraphQL.g:1028:2: ( 'true' )
                    {
                    // InternalGraphQL.g:1028:2: ( 'true' )
                    // InternalGraphQL.g:1029:3: 'true'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1034:2: ( 'false' )
                    {
                    // InternalGraphQL.g:1034:2: ( 'false' )
                    // InternalGraphQL.g:1035:3: 'false'
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
    // InternalGraphQL.g:1044:1: rule__ConstValue__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleStringValue ) | ( ruleEnumValue ) | ( ruleListValue ) | ( ruleObjectValue ) );
    public final void rule__ConstValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1048:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleStringValue ) | ( ruleEnumValue ) | ( ruleListValue ) | ( ruleObjectValue ) )
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
            case 52:
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
                    // InternalGraphQL.g:1049:2: ( ruleIntValue )
                    {
                    // InternalGraphQL.g:1049:2: ( ruleIntValue )
                    // InternalGraphQL.g:1050:3: ruleIntValue
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
                    // InternalGraphQL.g:1055:2: ( ruleFloatValue )
                    {
                    // InternalGraphQL.g:1055:2: ( ruleFloatValue )
                    // InternalGraphQL.g:1056:3: ruleFloatValue
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
                    // InternalGraphQL.g:1061:2: ( ruleBooleanValue )
                    {
                    // InternalGraphQL.g:1061:2: ( ruleBooleanValue )
                    // InternalGraphQL.g:1062:3: ruleBooleanValue
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
                    // InternalGraphQL.g:1067:2: ( ruleNullValue )
                    {
                    // InternalGraphQL.g:1067:2: ( ruleNullValue )
                    // InternalGraphQL.g:1068:3: ruleNullValue
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
                    // InternalGraphQL.g:1073:2: ( ruleStringValue )
                    {
                    // InternalGraphQL.g:1073:2: ( ruleStringValue )
                    // InternalGraphQL.g:1074:3: ruleStringValue
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
                    // InternalGraphQL.g:1079:2: ( ruleEnumValue )
                    {
                    // InternalGraphQL.g:1079:2: ( ruleEnumValue )
                    // InternalGraphQL.g:1080:3: ruleEnumValue
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
                    // InternalGraphQL.g:1085:2: ( ruleListValue )
                    {
                    // InternalGraphQL.g:1085:2: ( ruleListValue )
                    // InternalGraphQL.g:1086:3: ruleListValue
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
                    // InternalGraphQL.g:1091:2: ( ruleObjectValue )
                    {
                    // InternalGraphQL.g:1091:2: ( ruleObjectValue )
                    // InternalGraphQL.g:1092:3: ruleObjectValue
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
    // InternalGraphQL.g:1101:1: rule__DirectiveLocation__Alternatives : ( ( ( 'QUERY' ) ) | ( ( 'MUTATION' ) ) | ( ( 'SUBSCRIPTION' ) ) | ( ( 'FIELD' ) ) | ( ( 'FRAGMENT_DEFINITION' ) ) | ( ( 'FRAGMENT_SPREAD' ) ) | ( ( 'INLINE_FRAGMENT' ) ) | ( ( 'VARIABLE_DEFINITION' ) ) | ( ( 'SCHEMA' ) ) | ( ( 'SCALAR' ) ) | ( ( 'OBJECT' ) ) | ( ( 'FIELD_DEFINITION' ) ) | ( ( 'ARGUMENT_DEFINITION' ) ) | ( ( 'INTERFACE' ) ) | ( ( 'UNION' ) ) | ( ( 'ENUM' ) ) | ( ( 'ENUM_VALUE' ) ) | ( ( 'INPUT_OBJECT' ) ) | ( ( 'INPUT_FIELD_DEFINITION' ) ) );
    public final void rule__DirectiveLocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1105:1: ( ( ( 'QUERY' ) ) | ( ( 'MUTATION' ) ) | ( ( 'SUBSCRIPTION' ) ) | ( ( 'FIELD' ) ) | ( ( 'FRAGMENT_DEFINITION' ) ) | ( ( 'FRAGMENT_SPREAD' ) ) | ( ( 'INLINE_FRAGMENT' ) ) | ( ( 'VARIABLE_DEFINITION' ) ) | ( ( 'SCHEMA' ) ) | ( ( 'SCALAR' ) ) | ( ( 'OBJECT' ) ) | ( ( 'FIELD_DEFINITION' ) ) | ( ( 'ARGUMENT_DEFINITION' ) ) | ( ( 'INTERFACE' ) ) | ( ( 'UNION' ) ) | ( ( 'ENUM' ) ) | ( ( 'ENUM_VALUE' ) ) | ( ( 'INPUT_OBJECT' ) ) | ( ( 'INPUT_FIELD_DEFINITION' ) ) )
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
                    // InternalGraphQL.g:1106:2: ( ( 'QUERY' ) )
                    {
                    // InternalGraphQL.g:1106:2: ( ( 'QUERY' ) )
                    // InternalGraphQL.g:1107:3: ( 'QUERY' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0()); 
                    // InternalGraphQL.g:1108:3: ( 'QUERY' )
                    // InternalGraphQL.g:1108:4: 'QUERY'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getQUERYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1112:2: ( ( 'MUTATION' ) )
                    {
                    // InternalGraphQL.g:1112:2: ( ( 'MUTATION' ) )
                    // InternalGraphQL.g:1113:3: ( 'MUTATION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1()); 
                    // InternalGraphQL.g:1114:3: ( 'MUTATION' )
                    // InternalGraphQL.g:1114:4: 'MUTATION'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getMUTATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:1118:2: ( ( 'SUBSCRIPTION' ) )
                    {
                    // InternalGraphQL.g:1118:2: ( ( 'SUBSCRIPTION' ) )
                    // InternalGraphQL.g:1119:3: ( 'SUBSCRIPTION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 
                    // InternalGraphQL.g:1120:3: ( 'SUBSCRIPTION' )
                    // InternalGraphQL.g:1120:4: 'SUBSCRIPTION'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphQL.g:1124:2: ( ( 'FIELD' ) )
                    {
                    // InternalGraphQL.g:1124:2: ( ( 'FIELD' ) )
                    // InternalGraphQL.g:1125:3: ( 'FIELD' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3()); 
                    // InternalGraphQL.g:1126:3: ( 'FIELD' )
                    // InternalGraphQL.g:1126:4: 'FIELD'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getFIELDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphQL.g:1130:2: ( ( 'FRAGMENT_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1130:2: ( ( 'FRAGMENT_DEFINITION' ) )
                    // InternalGraphQL.g:1131:3: ( 'FRAGMENT_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4()); 
                    // InternalGraphQL.g:1132:3: ( 'FRAGMENT_DEFINITION' )
                    // InternalGraphQL.g:1132:4: 'FRAGMENT_DEFINITION'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getFRAGMENT_DEFINITIONEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:1136:2: ( ( 'FRAGMENT_SPREAD' ) )
                    {
                    // InternalGraphQL.g:1136:2: ( ( 'FRAGMENT_SPREAD' ) )
                    // InternalGraphQL.g:1137:3: ( 'FRAGMENT_SPREAD' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5()); 
                    // InternalGraphQL.g:1138:3: ( 'FRAGMENT_SPREAD' )
                    // InternalGraphQL.g:1138:4: 'FRAGMENT_SPREAD'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getFRAGMENT_SPREADEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:1142:2: ( ( 'INLINE_FRAGMENT' ) )
                    {
                    // InternalGraphQL.g:1142:2: ( ( 'INLINE_FRAGMENT' ) )
                    // InternalGraphQL.g:1143:3: ( 'INLINE_FRAGMENT' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6()); 
                    // InternalGraphQL.g:1144:3: ( 'INLINE_FRAGMENT' )
                    // InternalGraphQL.g:1144:4: 'INLINE_FRAGMENT'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getINLINE_FRAGMENTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphQL.g:1148:2: ( ( 'VARIABLE_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1148:2: ( ( 'VARIABLE_DEFINITION' ) )
                    // InternalGraphQL.g:1149:3: ( 'VARIABLE_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7()); 
                    // InternalGraphQL.g:1150:3: ( 'VARIABLE_DEFINITION' )
                    // InternalGraphQL.g:1150:4: 'VARIABLE_DEFINITION'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getVARIABLE_DEFINITIONEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGraphQL.g:1154:2: ( ( 'SCHEMA' ) )
                    {
                    // InternalGraphQL.g:1154:2: ( ( 'SCHEMA' ) )
                    // InternalGraphQL.g:1155:3: ( 'SCHEMA' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8()); 
                    // InternalGraphQL.g:1156:3: ( 'SCHEMA' )
                    // InternalGraphQL.g:1156:4: 'SCHEMA'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getSCHEMAEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGraphQL.g:1160:2: ( ( 'SCALAR' ) )
                    {
                    // InternalGraphQL.g:1160:2: ( ( 'SCALAR' ) )
                    // InternalGraphQL.g:1161:3: ( 'SCALAR' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9()); 
                    // InternalGraphQL.g:1162:3: ( 'SCALAR' )
                    // InternalGraphQL.g:1162:4: 'SCALAR'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getSCALAREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGraphQL.g:1166:2: ( ( 'OBJECT' ) )
                    {
                    // InternalGraphQL.g:1166:2: ( ( 'OBJECT' ) )
                    // InternalGraphQL.g:1167:3: ( 'OBJECT' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10()); 
                    // InternalGraphQL.g:1168:3: ( 'OBJECT' )
                    // InternalGraphQL.g:1168:4: 'OBJECT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getOBJECTEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGraphQL.g:1172:2: ( ( 'FIELD_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1172:2: ( ( 'FIELD_DEFINITION' ) )
                    // InternalGraphQL.g:1173:3: ( 'FIELD_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11()); 
                    // InternalGraphQL.g:1174:3: ( 'FIELD_DEFINITION' )
                    // InternalGraphQL.g:1174:4: 'FIELD_DEFINITION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getFIELD_DEFINITIONEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGraphQL.g:1178:2: ( ( 'ARGUMENT_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1178:2: ( ( 'ARGUMENT_DEFINITION' ) )
                    // InternalGraphQL.g:1179:3: ( 'ARGUMENT_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12()); 
                    // InternalGraphQL.g:1180:3: ( 'ARGUMENT_DEFINITION' )
                    // InternalGraphQL.g:1180:4: 'ARGUMENT_DEFINITION'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getARGUMENT_DEFINITIONEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGraphQL.g:1184:2: ( ( 'INTERFACE' ) )
                    {
                    // InternalGraphQL.g:1184:2: ( ( 'INTERFACE' ) )
                    // InternalGraphQL.g:1185:3: ( 'INTERFACE' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13()); 
                    // InternalGraphQL.g:1186:3: ( 'INTERFACE' )
                    // InternalGraphQL.g:1186:4: 'INTERFACE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getINTERFACEEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGraphQL.g:1190:2: ( ( 'UNION' ) )
                    {
                    // InternalGraphQL.g:1190:2: ( ( 'UNION' ) )
                    // InternalGraphQL.g:1191:3: ( 'UNION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14()); 
                    // InternalGraphQL.g:1192:3: ( 'UNION' )
                    // InternalGraphQL.g:1192:4: 'UNION'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getUNIONEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalGraphQL.g:1196:2: ( ( 'ENUM' ) )
                    {
                    // InternalGraphQL.g:1196:2: ( ( 'ENUM' ) )
                    // InternalGraphQL.g:1197:3: ( 'ENUM' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15()); 
                    // InternalGraphQL.g:1198:3: ( 'ENUM' )
                    // InternalGraphQL.g:1198:4: 'ENUM'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getENUMEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalGraphQL.g:1202:2: ( ( 'ENUM_VALUE' ) )
                    {
                    // InternalGraphQL.g:1202:2: ( ( 'ENUM_VALUE' ) )
                    // InternalGraphQL.g:1203:3: ( 'ENUM_VALUE' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16()); 
                    // InternalGraphQL.g:1204:3: ( 'ENUM_VALUE' )
                    // InternalGraphQL.g:1204:4: 'ENUM_VALUE'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getENUM_VALUEEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalGraphQL.g:1208:2: ( ( 'INPUT_OBJECT' ) )
                    {
                    // InternalGraphQL.g:1208:2: ( ( 'INPUT_OBJECT' ) )
                    // InternalGraphQL.g:1209:3: ( 'INPUT_OBJECT' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17()); 
                    // InternalGraphQL.g:1210:3: ( 'INPUT_OBJECT' )
                    // InternalGraphQL.g:1210:4: 'INPUT_OBJECT'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectiveLocationAccess().getINPUT_OBJECTEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalGraphQL.g:1214:2: ( ( 'INPUT_FIELD_DEFINITION' ) )
                    {
                    // InternalGraphQL.g:1214:2: ( ( 'INPUT_FIELD_DEFINITION' ) )
                    // InternalGraphQL.g:1215:3: ( 'INPUT_FIELD_DEFINITION' )
                    {
                     before(grammarAccess.getDirectiveLocationAccess().getINPUT_FIELD_DEFINITIONEnumLiteralDeclaration_18()); 
                    // InternalGraphQL.g:1216:3: ( 'INPUT_FIELD_DEFINITION' )
                    // InternalGraphQL.g:1216:4: 'INPUT_FIELD_DEFINITION'
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
    // InternalGraphQL.g:1224:1: rule__OperationType__Alternatives : ( ( ( 'query' ) ) | ( ( 'mutation' ) ) | ( ( 'subscription' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1228:1: ( ( ( 'query' ) ) | ( ( 'mutation' ) ) | ( ( 'subscription' ) ) )
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
                    // InternalGraphQL.g:1229:2: ( ( 'query' ) )
                    {
                    // InternalGraphQL.g:1229:2: ( ( 'query' ) )
                    // InternalGraphQL.g:1230:3: ( 'query' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0()); 
                    // InternalGraphQL.g:1231:3: ( 'query' )
                    // InternalGraphQL.g:1231:4: 'query'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1235:2: ( ( 'mutation' ) )
                    {
                    // InternalGraphQL.g:1235:2: ( ( 'mutation' ) )
                    // InternalGraphQL.g:1236:3: ( 'mutation' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1()); 
                    // InternalGraphQL.g:1237:3: ( 'mutation' )
                    // InternalGraphQL.g:1237:4: 'mutation'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:1241:2: ( ( 'subscription' ) )
                    {
                    // InternalGraphQL.g:1241:2: ( ( 'subscription' ) )
                    // InternalGraphQL.g:1242:3: ( 'subscription' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 
                    // InternalGraphQL.g:1243:3: ( 'subscription' )
                    // InternalGraphQL.g:1243:4: 'subscription'
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
    // InternalGraphQL.g:1251:1: rule__SchemaDefinition__Group__0 : rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1 ;
    public final void rule__SchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1255:1: ( rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1 )
            // InternalGraphQL.g:1256:2: rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1
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
    // InternalGraphQL.g:1263:1: rule__SchemaDefinition__Group__0__Impl : ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__SchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1267:1: ( ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1268:1: ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1268:1: ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1269:2: ( rule__SchemaDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getSchemaDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1270:2: ( rule__SchemaDefinition__DescriptionAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SL_STRING_VALUE && LA10_0<=RULE_ML_STRING_VALUE)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:1270:3: rule__SchemaDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1278:1: rule__SchemaDefinition__Group__1 : rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2 ;
    public final void rule__SchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1282:1: ( rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2 )
            // InternalGraphQL.g:1283:2: rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2
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
    // InternalGraphQL.g:1290:1: rule__SchemaDefinition__Group__1__Impl : ( 'schema' ) ;
    public final void rule__SchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1294:1: ( ( 'schema' ) )
            // InternalGraphQL.g:1295:1: ( 'schema' )
            {
            // InternalGraphQL.g:1295:1: ( 'schema' )
            // InternalGraphQL.g:1296:2: 'schema'
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
    // InternalGraphQL.g:1305:1: rule__SchemaDefinition__Group__2 : rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3 ;
    public final void rule__SchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1309:1: ( rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3 )
            // InternalGraphQL.g:1310:2: rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3
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
    // InternalGraphQL.g:1317:1: rule__SchemaDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1321:1: ( ( '{' ) )
            // InternalGraphQL.g:1322:1: ( '{' )
            {
            // InternalGraphQL.g:1322:1: ( '{' )
            // InternalGraphQL.g:1323:2: '{'
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
    // InternalGraphQL.g:1332:1: rule__SchemaDefinition__Group__3 : rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4 ;
    public final void rule__SchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1336:1: ( rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4 )
            // InternalGraphQL.g:1337:2: rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4
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
    // InternalGraphQL.g:1344:1: rule__SchemaDefinition__Group__3__Impl : ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) ) ;
    public final void rule__SchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1348:1: ( ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) ) )
            // InternalGraphQL.g:1349:1: ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) )
            {
            // InternalGraphQL.g:1349:1: ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) )
            // InternalGraphQL.g:1350:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* )
            {
            // InternalGraphQL.g:1350:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) )
            // InternalGraphQL.g:1351:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 
            // InternalGraphQL.g:1352:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )
            // InternalGraphQL.g:1352:4: rule__SchemaDefinition__TypeDefinitionsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__SchemaDefinition__TypeDefinitionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 

            }

            // InternalGraphQL.g:1355:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* )
            // InternalGraphQL.g:1356:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )*
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 
            // InternalGraphQL.g:1357:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=35 && LA11_0<=37)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraphQL.g:1357:4: rule__SchemaDefinition__TypeDefinitionsAssignment_3
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
    // InternalGraphQL.g:1366:1: rule__SchemaDefinition__Group__4 : rule__SchemaDefinition__Group__4__Impl ;
    public final void rule__SchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1370:1: ( rule__SchemaDefinition__Group__4__Impl )
            // InternalGraphQL.g:1371:2: rule__SchemaDefinition__Group__4__Impl
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
    // InternalGraphQL.g:1377:1: rule__SchemaDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1381:1: ( ( '}' ) )
            // InternalGraphQL.g:1382:1: ( '}' )
            {
            // InternalGraphQL.g:1382:1: ( '}' )
            // InternalGraphQL.g:1383:2: '}'
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
    // InternalGraphQL.g:1393:1: rule__RootOperationTypeDefinition__Group__0 : rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1 ;
    public final void rule__RootOperationTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1397:1: ( rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1 )
            // InternalGraphQL.g:1398:2: rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1
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
    // InternalGraphQL.g:1405:1: rule__RootOperationTypeDefinition__Group__0__Impl : ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) ) ;
    public final void rule__RootOperationTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1409:1: ( ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) ) )
            // InternalGraphQL.g:1410:1: ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) )
            {
            // InternalGraphQL.g:1410:1: ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) )
            // InternalGraphQL.g:1411:2: ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeAssignment_0()); 
            // InternalGraphQL.g:1412:2: ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 )
            // InternalGraphQL.g:1412:3: rule__RootOperationTypeDefinition__OperationTypeAssignment_0
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
    // InternalGraphQL.g:1420:1: rule__RootOperationTypeDefinition__Group__1 : rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2 ;
    public final void rule__RootOperationTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1424:1: ( rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2 )
            // InternalGraphQL.g:1425:2: rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2
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
    // InternalGraphQL.g:1432:1: rule__RootOperationTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RootOperationTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1436:1: ( ( ':' ) )
            // InternalGraphQL.g:1437:1: ( ':' )
            {
            // InternalGraphQL.g:1437:1: ( ':' )
            // InternalGraphQL.g:1438:2: ':'
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
    // InternalGraphQL.g:1447:1: rule__RootOperationTypeDefinition__Group__2 : rule__RootOperationTypeDefinition__Group__2__Impl ;
    public final void rule__RootOperationTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1451:1: ( rule__RootOperationTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:1452:2: rule__RootOperationTypeDefinition__Group__2__Impl
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
    // InternalGraphQL.g:1458:1: rule__RootOperationTypeDefinition__Group__2__Impl : ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__RootOperationTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1462:1: ( ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) ) )
            // InternalGraphQL.g:1463:1: ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) )
            {
            // InternalGraphQL.g:1463:1: ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) )
            // InternalGraphQL.g:1464:2: ( rule__RootOperationTypeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeAssignment_2()); 
            // InternalGraphQL.g:1465:2: ( rule__RootOperationTypeDefinition__TypeAssignment_2 )
            // InternalGraphQL.g:1465:3: rule__RootOperationTypeDefinition__TypeAssignment_2
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
    // InternalGraphQL.g:1474:1: rule__ScalarTypeDefinition__Group__0 : rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1 ;
    public final void rule__ScalarTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1478:1: ( rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1 )
            // InternalGraphQL.g:1479:2: rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1
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
    // InternalGraphQL.g:1486:1: rule__ScalarTypeDefinition__Group__0__Impl : ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ScalarTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1490:1: ( ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1491:1: ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1491:1: ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1492:2: ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1493:2: ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_SL_STRING_VALUE && LA12_0<=RULE_ML_STRING_VALUE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphQL.g:1493:3: rule__ScalarTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1501:1: rule__ScalarTypeDefinition__Group__1 : rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2 ;
    public final void rule__ScalarTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1505:1: ( rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2 )
            // InternalGraphQL.g:1506:2: rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2
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
    // InternalGraphQL.g:1513:1: rule__ScalarTypeDefinition__Group__1__Impl : ( 'scalar' ) ;
    public final void rule__ScalarTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1517:1: ( ( 'scalar' ) )
            // InternalGraphQL.g:1518:1: ( 'scalar' )
            {
            // InternalGraphQL.g:1518:1: ( 'scalar' )
            // InternalGraphQL.g:1519:2: 'scalar'
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
    // InternalGraphQL.g:1528:1: rule__ScalarTypeDefinition__Group__2 : rule__ScalarTypeDefinition__Group__2__Impl ;
    public final void rule__ScalarTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1532:1: ( rule__ScalarTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:1533:2: rule__ScalarTypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__Group__2__Impl();

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
    // InternalGraphQL.g:1539:1: rule__ScalarTypeDefinition__Group__2__Impl : ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__ScalarTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1543:1: ( ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1544:1: ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1544:1: ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1545:2: ( rule__ScalarTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1546:2: ( rule__ScalarTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1546:3: rule__ScalarTypeDefinition__NameAssignment_2
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


    // $ANTLR start "rule__ObjectTypeDefinition__Group__0"
    // InternalGraphQL.g:1555:1: rule__ObjectTypeDefinition__Group__0 : rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1 ;
    public final void rule__ObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1559:1: ( rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1 )
            // InternalGraphQL.g:1560:2: rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGraphQL.g:1567:1: rule__ObjectTypeDefinition__Group__0__Impl : ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1571:1: ( ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1572:1: ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1572:1: ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1573:2: ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1574:2: ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_SL_STRING_VALUE && LA13_0<=RULE_ML_STRING_VALUE)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:1574:3: rule__ObjectTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1582:1: rule__ObjectTypeDefinition__Group__1 : rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2 ;
    public final void rule__ObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1586:1: ( rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2 )
            // InternalGraphQL.g:1587:2: rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2
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
    // InternalGraphQL.g:1594:1: rule__ObjectTypeDefinition__Group__1__Impl : ( 'type' ) ;
    public final void rule__ObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1598:1: ( ( 'type' ) )
            // InternalGraphQL.g:1599:1: ( 'type' )
            {
            // InternalGraphQL.g:1599:1: ( 'type' )
            // InternalGraphQL.g:1600:2: 'type'
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
    // InternalGraphQL.g:1609:1: rule__ObjectTypeDefinition__Group__2 : rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3 ;
    public final void rule__ObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1613:1: ( rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3 )
            // InternalGraphQL.g:1614:2: rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGraphQL.g:1621:1: rule__ObjectTypeDefinition__Group__2__Impl : ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__ObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1625:1: ( ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1626:1: ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1626:1: ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1627:2: ( rule__ObjectTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1628:2: ( rule__ObjectTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1628:3: rule__ObjectTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:1636:1: rule__ObjectTypeDefinition__Group__3 : rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4 ;
    public final void rule__ObjectTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1640:1: ( rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4 )
            // InternalGraphQL.g:1641:2: rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalGraphQL.g:1648:1: rule__ObjectTypeDefinition__Group__3__Impl : ( ( rule__ObjectTypeDefinition__Group_3__0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1652:1: ( ( ( rule__ObjectTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:1653:1: ( ( rule__ObjectTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:1653:1: ( ( rule__ObjectTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:1654:2: ( rule__ObjectTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:1655:2: ( rule__ObjectTypeDefinition__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphQL.g:1655:3: rule__ObjectTypeDefinition__Group_3__0
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
    // InternalGraphQL.g:1663:1: rule__ObjectTypeDefinition__Group__4 : rule__ObjectTypeDefinition__Group__4__Impl rule__ObjectTypeDefinition__Group__5 ;
    public final void rule__ObjectTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1667:1: ( rule__ObjectTypeDefinition__Group__4__Impl rule__ObjectTypeDefinition__Group__5 )
            // InternalGraphQL.g:1668:2: rule__ObjectTypeDefinition__Group__4__Impl rule__ObjectTypeDefinition__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalGraphQL.g:1675:1: rule__ObjectTypeDefinition__Group__4__Impl : ( ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )* ) ;
    public final void rule__ObjectTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1679:1: ( ( ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )* ) )
            // InternalGraphQL.g:1680:1: ( ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )* )
            {
            // InternalGraphQL.g:1680:1: ( ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )* )
            // InternalGraphQL.g:1681:2: ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )*
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getDirectivesAssignment_4()); 
            // InternalGraphQL.g:1682:2: ( rule__ObjectTypeDefinition__DirectivesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_DIRECTIVE_NAME) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGraphQL.g:1682:3: rule__ObjectTypeDefinition__DirectivesAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ObjectTypeDefinition__DirectivesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGraphQL.g:1690:1: rule__ObjectTypeDefinition__Group__5 : rule__ObjectTypeDefinition__Group__5__Impl ;
    public final void rule__ObjectTypeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1694:1: ( rule__ObjectTypeDefinition__Group__5__Impl )
            // InternalGraphQL.g:1695:2: rule__ObjectTypeDefinition__Group__5__Impl
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
    // InternalGraphQL.g:1701:1: rule__ObjectTypeDefinition__Group__5__Impl : ( ( rule__ObjectTypeDefinition__Group_5__0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1705:1: ( ( ( rule__ObjectTypeDefinition__Group_5__0 )? ) )
            // InternalGraphQL.g:1706:1: ( ( rule__ObjectTypeDefinition__Group_5__0 )? )
            {
            // InternalGraphQL.g:1706:1: ( ( rule__ObjectTypeDefinition__Group_5__0 )? )
            // InternalGraphQL.g:1707:2: ( rule__ObjectTypeDefinition__Group_5__0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup_5()); 
            // InternalGraphQL.g:1708:2: ( rule__ObjectTypeDefinition__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGraphQL.g:1708:3: rule__ObjectTypeDefinition__Group_5__0
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
    // InternalGraphQL.g:1717:1: rule__ObjectTypeDefinition__Group_3__0 : rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1 ;
    public final void rule__ObjectTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1721:1: ( rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:1722:2: rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:1729:1: rule__ObjectTypeDefinition__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__ObjectTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1733:1: ( ( 'implements' ) )
            // InternalGraphQL.g:1734:1: ( 'implements' )
            {
            // InternalGraphQL.g:1734:1: ( 'implements' )
            // InternalGraphQL.g:1735:2: 'implements'
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
    // InternalGraphQL.g:1744:1: rule__ObjectTypeDefinition__Group_3__1 : rule__ObjectTypeDefinition__Group_3__1__Impl ;
    public final void rule__ObjectTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1748:1: ( rule__ObjectTypeDefinition__Group_3__1__Impl )
            // InternalGraphQL.g:1749:2: rule__ObjectTypeDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_3__1__Impl();

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
    // InternalGraphQL.g:1755:1: rule__ObjectTypeDefinition__Group_3__1__Impl : ( ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 ) ) ;
    public final void rule__ObjectTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1759:1: ( ( ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 ) ) )
            // InternalGraphQL.g:1760:1: ( ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 ) )
            {
            // InternalGraphQL.g:1760:1: ( ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 ) )
            // InternalGraphQL.g:1761:2: ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsAssignment_3_1()); 
            // InternalGraphQL.g:1762:2: ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 )
            // InternalGraphQL.g:1762:3: rule__ObjectTypeDefinition__ImplementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__ImplementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsAssignment_3_1()); 

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


    // $ANTLR start "rule__ObjectTypeDefinition__Group_5__0"
    // InternalGraphQL.g:1771:1: rule__ObjectTypeDefinition__Group_5__0 : rule__ObjectTypeDefinition__Group_5__0__Impl rule__ObjectTypeDefinition__Group_5__1 ;
    public final void rule__ObjectTypeDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1775:1: ( rule__ObjectTypeDefinition__Group_5__0__Impl rule__ObjectTypeDefinition__Group_5__1 )
            // InternalGraphQL.g:1776:2: rule__ObjectTypeDefinition__Group_5__0__Impl rule__ObjectTypeDefinition__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGraphQL.g:1783:1: rule__ObjectTypeDefinition__Group_5__0__Impl : ( '{' ) ;
    public final void rule__ObjectTypeDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1787:1: ( ( '{' ) )
            // InternalGraphQL.g:1788:1: ( '{' )
            {
            // InternalGraphQL.g:1788:1: ( '{' )
            // InternalGraphQL.g:1789:2: '{'
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
    // InternalGraphQL.g:1798:1: rule__ObjectTypeDefinition__Group_5__1 : rule__ObjectTypeDefinition__Group_5__1__Impl rule__ObjectTypeDefinition__Group_5__2 ;
    public final void rule__ObjectTypeDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1802:1: ( rule__ObjectTypeDefinition__Group_5__1__Impl rule__ObjectTypeDefinition__Group_5__2 )
            // InternalGraphQL.g:1803:2: rule__ObjectTypeDefinition__Group_5__1__Impl rule__ObjectTypeDefinition__Group_5__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGraphQL.g:1810:1: rule__ObjectTypeDefinition__Group_5__1__Impl : ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )* ) ;
    public final void rule__ObjectTypeDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1814:1: ( ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )* ) )
            // InternalGraphQL.g:1815:1: ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )* )
            {
            // InternalGraphQL.g:1815:1: ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )* )
            // InternalGraphQL.g:1816:2: ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )*
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_5_1()); 
            // InternalGraphQL.g:1817:2: ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SL_STRING_VALUE && LA17_0<=RULE_NAME)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGraphQL.g:1817:3: rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalGraphQL.g:1825:1: rule__ObjectTypeDefinition__Group_5__2 : rule__ObjectTypeDefinition__Group_5__2__Impl ;
    public final void rule__ObjectTypeDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1829:1: ( rule__ObjectTypeDefinition__Group_5__2__Impl )
            // InternalGraphQL.g:1830:2: rule__ObjectTypeDefinition__Group_5__2__Impl
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
    // InternalGraphQL.g:1836:1: rule__ObjectTypeDefinition__Group_5__2__Impl : ( '}' ) ;
    public final void rule__ObjectTypeDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1840:1: ( ( '}' ) )
            // InternalGraphQL.g:1841:1: ( '}' )
            {
            // InternalGraphQL.g:1841:1: ( '}' )
            // InternalGraphQL.g:1842:2: '}'
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
    // InternalGraphQL.g:1852:1: rule__InterfaceDefinition__Group__0 : rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1856:1: ( rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 )
            // InternalGraphQL.g:1857:2: rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGraphQL.g:1864:1: rule__InterfaceDefinition__Group__0__Impl : ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InterfaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1868:1: ( ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1869:1: ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1869:1: ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1870:2: ( rule__InterfaceDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1871:2: ( rule__InterfaceDefinition__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_SL_STRING_VALUE && LA18_0<=RULE_ML_STRING_VALUE)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGraphQL.g:1871:3: rule__InterfaceDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1879:1: rule__InterfaceDefinition__Group__1 : rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1883:1: ( rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 )
            // InternalGraphQL.g:1884:2: rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2
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
    // InternalGraphQL.g:1891:1: rule__InterfaceDefinition__Group__1__Impl : ( 'interface' ) ;
    public final void rule__InterfaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1895:1: ( ( 'interface' ) )
            // InternalGraphQL.g:1896:1: ( 'interface' )
            {
            // InternalGraphQL.g:1896:1: ( 'interface' )
            // InternalGraphQL.g:1897:2: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGraphQL.g:1906:1: rule__InterfaceDefinition__Group__2 : rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1910:1: ( rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3 )
            // InternalGraphQL.g:1911:2: rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalGraphQL.g:1918:1: rule__InterfaceDefinition__Group__2__Impl : ( ( rule__InterfaceDefinition__NameAssignment_2 ) ) ;
    public final void rule__InterfaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1922:1: ( ( ( rule__InterfaceDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1923:1: ( ( rule__InterfaceDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1923:1: ( ( rule__InterfaceDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1924:2: ( rule__InterfaceDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1925:2: ( rule__InterfaceDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1925:3: rule__InterfaceDefinition__NameAssignment_2
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
    // InternalGraphQL.g:1933:1: rule__InterfaceDefinition__Group__3 : rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1937:1: ( rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4 )
            // InternalGraphQL.g:1938:2: rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalGraphQL.g:1945:1: rule__InterfaceDefinition__Group__3__Impl : ( ( rule__InterfaceDefinition__Group_3__0 )? ) ;
    public final void rule__InterfaceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1949:1: ( ( ( rule__InterfaceDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:1950:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:1950:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            // InternalGraphQL.g:1951:2: ( rule__InterfaceDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:1952:2: ( rule__InterfaceDefinition__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGraphQL.g:1952:3: rule__InterfaceDefinition__Group_3__0
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
    // InternalGraphQL.g:1960:1: rule__InterfaceDefinition__Group__4 : rule__InterfaceDefinition__Group__4__Impl ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1964:1: ( rule__InterfaceDefinition__Group__4__Impl )
            // InternalGraphQL.g:1965:2: rule__InterfaceDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__4__Impl();

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
    // InternalGraphQL.g:1971:1: rule__InterfaceDefinition__Group__4__Impl : ( ( rule__InterfaceDefinition__Group_4__0 )? ) ;
    public final void rule__InterfaceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1975:1: ( ( ( rule__InterfaceDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:1976:1: ( ( rule__InterfaceDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:1976:1: ( ( rule__InterfaceDefinition__Group_4__0 )? )
            // InternalGraphQL.g:1977:2: ( rule__InterfaceDefinition__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:1978:2: ( rule__InterfaceDefinition__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphQL.g:1978:3: rule__InterfaceDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_4()); 

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


    // $ANTLR start "rule__InterfaceDefinition__Group_3__0"
    // InternalGraphQL.g:1987:1: rule__InterfaceDefinition__Group_3__0 : rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1 ;
    public final void rule__InterfaceDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1991:1: ( rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1 )
            // InternalGraphQL.g:1992:2: rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:1999:1: rule__InterfaceDefinition__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__InterfaceDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2003:1: ( ( 'implements' ) )
            // InternalGraphQL.g:2004:1: ( 'implements' )
            {
            // InternalGraphQL.g:2004:1: ( 'implements' )
            // InternalGraphQL.g:2005:2: 'implements'
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
    // InternalGraphQL.g:2014:1: rule__InterfaceDefinition__Group_3__1 : rule__InterfaceDefinition__Group_3__1__Impl ;
    public final void rule__InterfaceDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2018:1: ( rule__InterfaceDefinition__Group_3__1__Impl )
            // InternalGraphQL.g:2019:2: rule__InterfaceDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_3__1__Impl();

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
    // InternalGraphQL.g:2025:1: rule__InterfaceDefinition__Group_3__1__Impl : ( ( rule__InterfaceDefinition__ImplementsAssignment_3_1 ) ) ;
    public final void rule__InterfaceDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2029:1: ( ( ( rule__InterfaceDefinition__ImplementsAssignment_3_1 ) ) )
            // InternalGraphQL.g:2030:1: ( ( rule__InterfaceDefinition__ImplementsAssignment_3_1 ) )
            {
            // InternalGraphQL.g:2030:1: ( ( rule__InterfaceDefinition__ImplementsAssignment_3_1 ) )
            // InternalGraphQL.g:2031:2: ( rule__InterfaceDefinition__ImplementsAssignment_3_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsAssignment_3_1()); 
            // InternalGraphQL.g:2032:2: ( rule__InterfaceDefinition__ImplementsAssignment_3_1 )
            // InternalGraphQL.g:2032:3: rule__InterfaceDefinition__ImplementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__ImplementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsAssignment_3_1()); 

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


    // $ANTLR start "rule__InterfaceDefinition__Group_4__0"
    // InternalGraphQL.g:2041:1: rule__InterfaceDefinition__Group_4__0 : rule__InterfaceDefinition__Group_4__0__Impl rule__InterfaceDefinition__Group_4__1 ;
    public final void rule__InterfaceDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2045:1: ( rule__InterfaceDefinition__Group_4__0__Impl rule__InterfaceDefinition__Group_4__1 )
            // InternalGraphQL.g:2046:2: rule__InterfaceDefinition__Group_4__0__Impl rule__InterfaceDefinition__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__InterfaceDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_4__1();

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
    // $ANTLR end "rule__InterfaceDefinition__Group_4__0"


    // $ANTLR start "rule__InterfaceDefinition__Group_4__0__Impl"
    // InternalGraphQL.g:2053:1: rule__InterfaceDefinition__Group_4__0__Impl : ( '{' ) ;
    public final void rule__InterfaceDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2057:1: ( ( '{' ) )
            // InternalGraphQL.g:2058:1: ( '{' )
            {
            // InternalGraphQL.g:2058:1: ( '{' )
            // InternalGraphQL.g:2059:2: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__InterfaceDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_4__1"
    // InternalGraphQL.g:2068:1: rule__InterfaceDefinition__Group_4__1 : rule__InterfaceDefinition__Group_4__1__Impl rule__InterfaceDefinition__Group_4__2 ;
    public final void rule__InterfaceDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2072:1: ( rule__InterfaceDefinition__Group_4__1__Impl rule__InterfaceDefinition__Group_4__2 )
            // InternalGraphQL.g:2073:2: rule__InterfaceDefinition__Group_4__1__Impl rule__InterfaceDefinition__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__InterfaceDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_4__2();

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
    // $ANTLR end "rule__InterfaceDefinition__Group_4__1"


    // $ANTLR start "rule__InterfaceDefinition__Group_4__1__Impl"
    // InternalGraphQL.g:2080:1: rule__InterfaceDefinition__Group_4__1__Impl : ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )* ) ;
    public final void rule__InterfaceDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2084:1: ( ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )* ) )
            // InternalGraphQL.g:2085:1: ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )* )
            {
            // InternalGraphQL.g:2085:1: ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )* )
            // InternalGraphQL.g:2086:2: ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsAssignment_4_1()); 
            // InternalGraphQL.g:2087:2: ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_SL_STRING_VALUE && LA21_0<=RULE_NAME)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGraphQL.g:2087:3: rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsAssignment_4_1()); 

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
    // $ANTLR end "rule__InterfaceDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_4__2"
    // InternalGraphQL.g:2095:1: rule__InterfaceDefinition__Group_4__2 : rule__InterfaceDefinition__Group_4__2__Impl ;
    public final void rule__InterfaceDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2099:1: ( rule__InterfaceDefinition__Group_4__2__Impl )
            // InternalGraphQL.g:2100:2: rule__InterfaceDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_4__2__Impl();

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
    // $ANTLR end "rule__InterfaceDefinition__Group_4__2"


    // $ANTLR start "rule__InterfaceDefinition__Group_4__2__Impl"
    // InternalGraphQL.g:2106:1: rule__InterfaceDefinition__Group_4__2__Impl : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2110:1: ( ( '}' ) )
            // InternalGraphQL.g:2111:1: ( '}' )
            {
            // InternalGraphQL.g:2111:1: ( '}' )
            // InternalGraphQL.g:2112:2: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 

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
    // $ANTLR end "rule__InterfaceDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__FieldDefinition__Group__0"
    // InternalGraphQL.g:2122:1: rule__FieldDefinition__Group__0 : rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1 ;
    public final void rule__FieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2126:1: ( rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1 )
            // InternalGraphQL.g:2127:2: rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGraphQL.g:2134:1: rule__FieldDefinition__Group__0__Impl : ( ( rule__FieldDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__FieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2138:1: ( ( ( rule__FieldDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2139:1: ( ( rule__FieldDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2139:1: ( ( rule__FieldDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2140:2: ( rule__FieldDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFieldDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2141:2: ( rule__FieldDefinition__DescriptionAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_SL_STRING_VALUE && LA22_0<=RULE_ML_STRING_VALUE)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGraphQL.g:2141:3: rule__FieldDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2149:1: rule__FieldDefinition__Group__1 : rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2 ;
    public final void rule__FieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2153:1: ( rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2 )
            // InternalGraphQL.g:2154:2: rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalGraphQL.g:2161:1: rule__FieldDefinition__Group__1__Impl : ( ( rule__FieldDefinition__NameAssignment_1 ) ) ;
    public final void rule__FieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2165:1: ( ( ( rule__FieldDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:2166:1: ( ( rule__FieldDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:2166:1: ( ( rule__FieldDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:2167:2: ( rule__FieldDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:2168:2: ( rule__FieldDefinition__NameAssignment_1 )
            // InternalGraphQL.g:2168:3: rule__FieldDefinition__NameAssignment_1
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
    // InternalGraphQL.g:2176:1: rule__FieldDefinition__Group__2 : rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3 ;
    public final void rule__FieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2180:1: ( rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3 )
            // InternalGraphQL.g:2181:2: rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalGraphQL.g:2188:1: rule__FieldDefinition__Group__2__Impl : ( ( rule__FieldDefinition__ArgumentsAssignment_2 )? ) ;
    public final void rule__FieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2192:1: ( ( ( rule__FieldDefinition__ArgumentsAssignment_2 )? ) )
            // InternalGraphQL.g:2193:1: ( ( rule__FieldDefinition__ArgumentsAssignment_2 )? )
            {
            // InternalGraphQL.g:2193:1: ( ( rule__FieldDefinition__ArgumentsAssignment_2 )? )
            // InternalGraphQL.g:2194:2: ( rule__FieldDefinition__ArgumentsAssignment_2 )?
            {
             before(grammarAccess.getFieldDefinitionAccess().getArgumentsAssignment_2()); 
            // InternalGraphQL.g:2195:2: ( rule__FieldDefinition__ArgumentsAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGraphQL.g:2195:3: rule__FieldDefinition__ArgumentsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDefinition__ArgumentsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDefinitionAccess().getArgumentsAssignment_2()); 

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
    // InternalGraphQL.g:2203:1: rule__FieldDefinition__Group__3 : rule__FieldDefinition__Group__3__Impl rule__FieldDefinition__Group__4 ;
    public final void rule__FieldDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2207:1: ( rule__FieldDefinition__Group__3__Impl rule__FieldDefinition__Group__4 )
            // InternalGraphQL.g:2208:2: rule__FieldDefinition__Group__3__Impl rule__FieldDefinition__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:2215:1: rule__FieldDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__FieldDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2219:1: ( ( ':' ) )
            // InternalGraphQL.g:2220:1: ( ':' )
            {
            // InternalGraphQL.g:2220:1: ( ':' )
            // InternalGraphQL.g:2221:2: ':'
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
    // InternalGraphQL.g:2230:1: rule__FieldDefinition__Group__4 : rule__FieldDefinition__Group__4__Impl ;
    public final void rule__FieldDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2234:1: ( rule__FieldDefinition__Group__4__Impl )
            // InternalGraphQL.g:2235:2: rule__FieldDefinition__Group__4__Impl
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
    // InternalGraphQL.g:2241:1: rule__FieldDefinition__Group__4__Impl : ( ( rule__FieldDefinition__TypeAssignment_4 ) ) ;
    public final void rule__FieldDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2245:1: ( ( ( rule__FieldDefinition__TypeAssignment_4 ) ) )
            // InternalGraphQL.g:2246:1: ( ( rule__FieldDefinition__TypeAssignment_4 ) )
            {
            // InternalGraphQL.g:2246:1: ( ( rule__FieldDefinition__TypeAssignment_4 ) )
            // InternalGraphQL.g:2247:2: ( rule__FieldDefinition__TypeAssignment_4 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getTypeAssignment_4()); 
            // InternalGraphQL.g:2248:2: ( rule__FieldDefinition__TypeAssignment_4 )
            // InternalGraphQL.g:2248:3: rule__FieldDefinition__TypeAssignment_4
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


    // $ANTLR start "rule__UnionTypeDefinition__Group__0"
    // InternalGraphQL.g:2257:1: rule__UnionTypeDefinition__Group__0 : rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1 ;
    public final void rule__UnionTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2261:1: ( rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1 )
            // InternalGraphQL.g:2262:2: rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalGraphQL.g:2269:1: rule__UnionTypeDefinition__Group__0__Impl : ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__UnionTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2273:1: ( ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2274:1: ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2274:1: ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2275:2: ( rule__UnionTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2276:2: ( rule__UnionTypeDefinition__DescriptionAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_SL_STRING_VALUE && LA24_0<=RULE_ML_STRING_VALUE)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphQL.g:2276:3: rule__UnionTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2284:1: rule__UnionTypeDefinition__Group__1 : rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2 ;
    public final void rule__UnionTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2288:1: ( rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2 )
            // InternalGraphQL.g:2289:2: rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2
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
    // InternalGraphQL.g:2296:1: rule__UnionTypeDefinition__Group__1__Impl : ( 'union' ) ;
    public final void rule__UnionTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2300:1: ( ( 'union' ) )
            // InternalGraphQL.g:2301:1: ( 'union' )
            {
            // InternalGraphQL.g:2301:1: ( 'union' )
            // InternalGraphQL.g:2302:2: 'union'
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalGraphQL.g:2311:1: rule__UnionTypeDefinition__Group__2 : rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3 ;
    public final void rule__UnionTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2315:1: ( rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3 )
            // InternalGraphQL.g:2316:2: rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalGraphQL.g:2323:1: rule__UnionTypeDefinition__Group__2__Impl : ( ( rule__UnionTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__UnionTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2327:1: ( ( ( rule__UnionTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:2328:1: ( ( rule__UnionTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:2328:1: ( ( rule__UnionTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:2329:2: ( rule__UnionTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:2330:2: ( rule__UnionTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:2330:3: rule__UnionTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:2338:1: rule__UnionTypeDefinition__Group__3 : rule__UnionTypeDefinition__Group__3__Impl ;
    public final void rule__UnionTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2342:1: ( rule__UnionTypeDefinition__Group__3__Impl )
            // InternalGraphQL.g:2343:2: rule__UnionTypeDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group__3__Impl();

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
    // InternalGraphQL.g:2349:1: rule__UnionTypeDefinition__Group__3__Impl : ( ( rule__UnionTypeDefinition__Group_3__0 )? ) ;
    public final void rule__UnionTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2353:1: ( ( ( rule__UnionTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:2354:1: ( ( rule__UnionTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:2354:1: ( ( rule__UnionTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:2355:2: ( rule__UnionTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:2356:2: ( rule__UnionTypeDefinition__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphQL.g:2356:3: rule__UnionTypeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnionTypeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getGroup_3()); 

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


    // $ANTLR start "rule__UnionTypeDefinition__Group_3__0"
    // InternalGraphQL.g:2365:1: rule__UnionTypeDefinition__Group_3__0 : rule__UnionTypeDefinition__Group_3__0__Impl rule__UnionTypeDefinition__Group_3__1 ;
    public final void rule__UnionTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2369:1: ( rule__UnionTypeDefinition__Group_3__0__Impl rule__UnionTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:2370:2: rule__UnionTypeDefinition__Group_3__0__Impl rule__UnionTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__UnionTypeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3__1();

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3__0"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3__0__Impl"
    // InternalGraphQL.g:2377:1: rule__UnionTypeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__UnionTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2381:1: ( ( '=' ) )
            // InternalGraphQL.g:2382:1: ( '=' )
            {
            // InternalGraphQL.g:2382:1: ( '=' )
            // InternalGraphQL.g:2383:2: '='
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3__1"
    // InternalGraphQL.g:2392:1: rule__UnionTypeDefinition__Group_3__1 : rule__UnionTypeDefinition__Group_3__1__Impl rule__UnionTypeDefinition__Group_3__2 ;
    public final void rule__UnionTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2396:1: ( rule__UnionTypeDefinition__Group_3__1__Impl rule__UnionTypeDefinition__Group_3__2 )
            // InternalGraphQL.g:2397:2: rule__UnionTypeDefinition__Group_3__1__Impl rule__UnionTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_24);
            rule__UnionTypeDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3__2();

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3__1"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3__1__Impl"
    // InternalGraphQL.g:2404:1: rule__UnionTypeDefinition__Group_3__1__Impl : ( ( '|' )? ) ;
    public final void rule__UnionTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2408:1: ( ( ( '|' )? ) )
            // InternalGraphQL.g:2409:1: ( ( '|' )? )
            {
            // InternalGraphQL.g:2409:1: ( ( '|' )? )
            // InternalGraphQL.g:2410:2: ( '|' )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_1()); 
            // InternalGraphQL.g:2411:2: ( '|' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGraphQL.g:2411:3: '|'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_1()); 

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3__2"
    // InternalGraphQL.g:2419:1: rule__UnionTypeDefinition__Group_3__2 : rule__UnionTypeDefinition__Group_3__2__Impl rule__UnionTypeDefinition__Group_3__3 ;
    public final void rule__UnionTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2423:1: ( rule__UnionTypeDefinition__Group_3__2__Impl rule__UnionTypeDefinition__Group_3__3 )
            // InternalGraphQL.g:2424:2: rule__UnionTypeDefinition__Group_3__2__Impl rule__UnionTypeDefinition__Group_3__3
            {
            pushFollow(FOLLOW_25);
            rule__UnionTypeDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3__3();

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3__2"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3__2__Impl"
    // InternalGraphQL.g:2431:1: rule__UnionTypeDefinition__Group_3__2__Impl : ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2 ) ) ;
    public final void rule__UnionTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2435:1: ( ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2 ) ) )
            // InternalGraphQL.g:2436:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2 ) )
            {
            // InternalGraphQL.g:2436:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2 ) )
            // InternalGraphQL.g:2437:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_3_2()); 
            // InternalGraphQL.g:2438:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2 )
            // InternalGraphQL.g:2438:3: rule__UnionTypeDefinition__MemberTypesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__MemberTypesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_3_2()); 

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3__3"
    // InternalGraphQL.g:2446:1: rule__UnionTypeDefinition__Group_3__3 : rule__UnionTypeDefinition__Group_3__3__Impl ;
    public final void rule__UnionTypeDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2450:1: ( rule__UnionTypeDefinition__Group_3__3__Impl )
            // InternalGraphQL.g:2451:2: rule__UnionTypeDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3__3__Impl();

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3__3"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3__3__Impl"
    // InternalGraphQL.g:2457:1: rule__UnionTypeDefinition__Group_3__3__Impl : ( ( rule__UnionTypeDefinition__Group_3_3__0 )* ) ;
    public final void rule__UnionTypeDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2461:1: ( ( ( rule__UnionTypeDefinition__Group_3_3__0 )* ) )
            // InternalGraphQL.g:2462:1: ( ( rule__UnionTypeDefinition__Group_3_3__0 )* )
            {
            // InternalGraphQL.g:2462:1: ( ( rule__UnionTypeDefinition__Group_3_3__0 )* )
            // InternalGraphQL.g:2463:2: ( rule__UnionTypeDefinition__Group_3_3__0 )*
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup_3_3()); 
            // InternalGraphQL.g:2464:2: ( rule__UnionTypeDefinition__Group_3_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGraphQL.g:2464:3: rule__UnionTypeDefinition__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__UnionTypeDefinition__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getUnionTypeDefinitionAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3_3__0"
    // InternalGraphQL.g:2473:1: rule__UnionTypeDefinition__Group_3_3__0 : rule__UnionTypeDefinition__Group_3_3__0__Impl rule__UnionTypeDefinition__Group_3_3__1 ;
    public final void rule__UnionTypeDefinition__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2477:1: ( rule__UnionTypeDefinition__Group_3_3__0__Impl rule__UnionTypeDefinition__Group_3_3__1 )
            // InternalGraphQL.g:2478:2: rule__UnionTypeDefinition__Group_3_3__0__Impl rule__UnionTypeDefinition__Group_3_3__1
            {
            pushFollow(FOLLOW_15);
            rule__UnionTypeDefinition__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3_3__1();

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3_3__0"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3_3__0__Impl"
    // InternalGraphQL.g:2485:1: rule__UnionTypeDefinition__Group_3_3__0__Impl : ( '|' ) ;
    public final void rule__UnionTypeDefinition__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2489:1: ( ( '|' ) )
            // InternalGraphQL.g:2490:1: ( '|' )
            {
            // InternalGraphQL.g:2490:1: ( '|' )
            // InternalGraphQL.g:2491:2: '|'
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_3_0()); 

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3_3__0__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3_3__1"
    // InternalGraphQL.g:2500:1: rule__UnionTypeDefinition__Group_3_3__1 : rule__UnionTypeDefinition__Group_3_3__1__Impl ;
    public final void rule__UnionTypeDefinition__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2504:1: ( rule__UnionTypeDefinition__Group_3_3__1__Impl )
            // InternalGraphQL.g:2505:2: rule__UnionTypeDefinition__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3_3__1"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3_3__1__Impl"
    // InternalGraphQL.g:2511:1: rule__UnionTypeDefinition__Group_3_3__1__Impl : ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1 ) ) ;
    public final void rule__UnionTypeDefinition__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2515:1: ( ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1 ) ) )
            // InternalGraphQL.g:2516:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1 ) )
            {
            // InternalGraphQL.g:2516:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1 ) )
            // InternalGraphQL.g:2517:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_3_3_1()); 
            // InternalGraphQL.g:2518:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1 )
            // InternalGraphQL.g:2518:3: rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_3_3_1()); 

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3_3__1__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group__0"
    // InternalGraphQL.g:2527:1: rule__EnumTypeDefinition__Group__0 : rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1 ;
    public final void rule__EnumTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2531:1: ( rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1 )
            // InternalGraphQL.g:2532:2: rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalGraphQL.g:2539:1: rule__EnumTypeDefinition__Group__0__Impl : ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__EnumTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2543:1: ( ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2544:1: ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2544:1: ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2545:2: ( rule__EnumTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2546:2: ( rule__EnumTypeDefinition__DescriptionAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_SL_STRING_VALUE && LA28_0<=RULE_ML_STRING_VALUE)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphQL.g:2546:3: rule__EnumTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2554:1: rule__EnumTypeDefinition__Group__1 : rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2 ;
    public final void rule__EnumTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2558:1: ( rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2 )
            // InternalGraphQL.g:2559:2: rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2
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
    // InternalGraphQL.g:2566:1: rule__EnumTypeDefinition__Group__1__Impl : ( 'enum' ) ;
    public final void rule__EnumTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2570:1: ( ( 'enum' ) )
            // InternalGraphQL.g:2571:1: ( 'enum' )
            {
            // InternalGraphQL.g:2571:1: ( 'enum' )
            // InternalGraphQL.g:2572:2: 'enum'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGraphQL.g:2581:1: rule__EnumTypeDefinition__Group__2 : rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3 ;
    public final void rule__EnumTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2585:1: ( rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3 )
            // InternalGraphQL.g:2586:2: rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalGraphQL.g:2593:1: rule__EnumTypeDefinition__Group__2__Impl : ( ( rule__EnumTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2597:1: ( ( ( rule__EnumTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:2598:1: ( ( rule__EnumTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:2598:1: ( ( rule__EnumTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:2599:2: ( rule__EnumTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:2600:2: ( rule__EnumTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:2600:3: rule__EnumTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:2608:1: rule__EnumTypeDefinition__Group__3 : rule__EnumTypeDefinition__Group__3__Impl ;
    public final void rule__EnumTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2612:1: ( rule__EnumTypeDefinition__Group__3__Impl )
            // InternalGraphQL.g:2613:2: rule__EnumTypeDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group__3__Impl();

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
    // InternalGraphQL.g:2619:1: rule__EnumTypeDefinition__Group__3__Impl : ( ( rule__EnumTypeDefinition__Group_3__0 )? ) ;
    public final void rule__EnumTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2623:1: ( ( ( rule__EnumTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:2624:1: ( ( rule__EnumTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:2624:1: ( ( rule__EnumTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:2625:2: ( rule__EnumTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:2626:2: ( rule__EnumTypeDefinition__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphQL.g:2626:3: rule__EnumTypeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumTypeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDefinitionAccess().getGroup_3()); 

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


    // $ANTLR start "rule__EnumTypeDefinition__Group_3__0"
    // InternalGraphQL.g:2635:1: rule__EnumTypeDefinition__Group_3__0 : rule__EnumTypeDefinition__Group_3__0__Impl rule__EnumTypeDefinition__Group_3__1 ;
    public final void rule__EnumTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2639:1: ( rule__EnumTypeDefinition__Group_3__0__Impl rule__EnumTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:2640:2: rule__EnumTypeDefinition__Group_3__0__Impl rule__EnumTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__EnumTypeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_3__1();

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
    // $ANTLR end "rule__EnumTypeDefinition__Group_3__0"


    // $ANTLR start "rule__EnumTypeDefinition__Group_3__0__Impl"
    // InternalGraphQL.g:2647:1: rule__EnumTypeDefinition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2651:1: ( ( '{' ) )
            // InternalGraphQL.g:2652:1: ( '{' )
            {
            // InternalGraphQL.g:2652:1: ( '{' )
            // InternalGraphQL.g:2653:2: '{'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__EnumTypeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group_3__1"
    // InternalGraphQL.g:2662:1: rule__EnumTypeDefinition__Group_3__1 : rule__EnumTypeDefinition__Group_3__1__Impl rule__EnumTypeDefinition__Group_3__2 ;
    public final void rule__EnumTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2666:1: ( rule__EnumTypeDefinition__Group_3__1__Impl rule__EnumTypeDefinition__Group_3__2 )
            // InternalGraphQL.g:2667:2: rule__EnumTypeDefinition__Group_3__1__Impl rule__EnumTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__EnumTypeDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_3__2();

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
    // $ANTLR end "rule__EnumTypeDefinition__Group_3__1"


    // $ANTLR start "rule__EnumTypeDefinition__Group_3__1__Impl"
    // InternalGraphQL.g:2674:1: rule__EnumTypeDefinition__Group_3__1__Impl : ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 )* ) ;
    public final void rule__EnumTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2678:1: ( ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 )* ) )
            // InternalGraphQL.g:2679:1: ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 )* )
            {
            // InternalGraphQL.g:2679:1: ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 )* )
            // InternalGraphQL.g:2680:2: ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 )*
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsAssignment_3_1()); 
            // InternalGraphQL.g:2681:2: ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_SL_STRING_VALUE && LA30_0<=RULE_NAME)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGraphQL.g:2681:3: rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsAssignment_3_1()); 

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
    // $ANTLR end "rule__EnumTypeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group_3__2"
    // InternalGraphQL.g:2689:1: rule__EnumTypeDefinition__Group_3__2 : rule__EnumTypeDefinition__Group_3__2__Impl ;
    public final void rule__EnumTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2693:1: ( rule__EnumTypeDefinition__Group_3__2__Impl )
            // InternalGraphQL.g:2694:2: rule__EnumTypeDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_3__2__Impl();

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
    // $ANTLR end "rule__EnumTypeDefinition__Group_3__2"


    // $ANTLR start "rule__EnumTypeDefinition__Group_3__2__Impl"
    // InternalGraphQL.g:2700:1: rule__EnumTypeDefinition__Group_3__2__Impl : ( '}' ) ;
    public final void rule__EnumTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2704:1: ( ( '}' ) )
            // InternalGraphQL.g:2705:1: ( '}' )
            {
            // InternalGraphQL.g:2705:1: ( '}' )
            // InternalGraphQL.g:2706:2: '}'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__EnumTypeDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__EnumValueDefinition__Group__0"
    // InternalGraphQL.g:2716:1: rule__EnumValueDefinition__Group__0 : rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1 ;
    public final void rule__EnumValueDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2720:1: ( rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1 )
            // InternalGraphQL.g:2721:2: rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGraphQL.g:2728:1: rule__EnumValueDefinition__Group__0__Impl : ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__EnumValueDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2732:1: ( ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2733:1: ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2733:1: ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2734:2: ( rule__EnumValueDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2735:2: ( rule__EnumValueDefinition__DescriptionAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_SL_STRING_VALUE && LA31_0<=RULE_ML_STRING_VALUE)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGraphQL.g:2735:3: rule__EnumValueDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2743:1: rule__EnumValueDefinition__Group__1 : rule__EnumValueDefinition__Group__1__Impl ;
    public final void rule__EnumValueDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2747:1: ( rule__EnumValueDefinition__Group__1__Impl )
            // InternalGraphQL.g:2748:2: rule__EnumValueDefinition__Group__1__Impl
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
    // InternalGraphQL.g:2754:1: rule__EnumValueDefinition__Group__1__Impl : ( ( rule__EnumValueDefinition__NameAssignment_1 ) ) ;
    public final void rule__EnumValueDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2758:1: ( ( ( rule__EnumValueDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:2759:1: ( ( rule__EnumValueDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:2759:1: ( ( rule__EnumValueDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:2760:2: ( rule__EnumValueDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:2761:2: ( rule__EnumValueDefinition__NameAssignment_1 )
            // InternalGraphQL.g:2761:3: rule__EnumValueDefinition__NameAssignment_1
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
    // InternalGraphQL.g:2770:1: rule__InputObjectTypeDefinition__Group__0 : rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1 ;
    public final void rule__InputObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2774:1: ( rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1 )
            // InternalGraphQL.g:2775:2: rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalGraphQL.g:2782:1: rule__InputObjectTypeDefinition__Group__0__Impl : ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InputObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2786:1: ( ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2787:1: ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2787:1: ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2788:2: ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2789:2: ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_SL_STRING_VALUE && LA32_0<=RULE_ML_STRING_VALUE)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGraphQL.g:2789:3: rule__InputObjectTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2797:1: rule__InputObjectTypeDefinition__Group__1 : rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2 ;
    public final void rule__InputObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2801:1: ( rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2 )
            // InternalGraphQL.g:2802:2: rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2
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
    // InternalGraphQL.g:2809:1: rule__InputObjectTypeDefinition__Group__1__Impl : ( 'input' ) ;
    public final void rule__InputObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2813:1: ( ( 'input' ) )
            // InternalGraphQL.g:2814:1: ( 'input' )
            {
            // InternalGraphQL.g:2814:1: ( 'input' )
            // InternalGraphQL.g:2815:2: 'input'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGraphQL.g:2824:1: rule__InputObjectTypeDefinition__Group__2 : rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3 ;
    public final void rule__InputObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2828:1: ( rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3 )
            // InternalGraphQL.g:2829:2: rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalGraphQL.g:2836:1: rule__InputObjectTypeDefinition__Group__2__Impl : ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__InputObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2840:1: ( ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:2841:1: ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:2841:1: ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:2842:2: ( rule__InputObjectTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:2843:2: ( rule__InputObjectTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:2843:3: rule__InputObjectTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:2851:1: rule__InputObjectTypeDefinition__Group__3 : rule__InputObjectTypeDefinition__Group__3__Impl ;
    public final void rule__InputObjectTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2855:1: ( rule__InputObjectTypeDefinition__Group__3__Impl )
            // InternalGraphQL.g:2856:2: rule__InputObjectTypeDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group__3__Impl();

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
    // InternalGraphQL.g:2862:1: rule__InputObjectTypeDefinition__Group__3__Impl : ( ( rule__InputObjectTypeDefinition__Group_3__0 )? ) ;
    public final void rule__InputObjectTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2866:1: ( ( ( rule__InputObjectTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:2867:1: ( ( rule__InputObjectTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:2867:1: ( ( rule__InputObjectTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:2868:2: ( rule__InputObjectTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:2869:2: ( rule__InputObjectTypeDefinition__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGraphQL.g:2869:3: rule__InputObjectTypeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputObjectTypeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup_3()); 

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


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_3__0"
    // InternalGraphQL.g:2878:1: rule__InputObjectTypeDefinition__Group_3__0 : rule__InputObjectTypeDefinition__Group_3__0__Impl rule__InputObjectTypeDefinition__Group_3__1 ;
    public final void rule__InputObjectTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2882:1: ( rule__InputObjectTypeDefinition__Group_3__0__Impl rule__InputObjectTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:2883:2: rule__InputObjectTypeDefinition__Group_3__0__Impl rule__InputObjectTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__InputObjectTypeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_3__1();

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
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_3__0"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_3__0__Impl"
    // InternalGraphQL.g:2890:1: rule__InputObjectTypeDefinition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__InputObjectTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2894:1: ( ( '{' ) )
            // InternalGraphQL.g:2895:1: ( '{' )
            {
            // InternalGraphQL.g:2895:1: ( '{' )
            // InternalGraphQL.g:2896:2: '{'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_3__1"
    // InternalGraphQL.g:2905:1: rule__InputObjectTypeDefinition__Group_3__1 : rule__InputObjectTypeDefinition__Group_3__1__Impl rule__InputObjectTypeDefinition__Group_3__2 ;
    public final void rule__InputObjectTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2909:1: ( rule__InputObjectTypeDefinition__Group_3__1__Impl rule__InputObjectTypeDefinition__Group_3__2 )
            // InternalGraphQL.g:2910:2: rule__InputObjectTypeDefinition__Group_3__1__Impl rule__InputObjectTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__InputObjectTypeDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_3__2();

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
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_3__1"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_3__1__Impl"
    // InternalGraphQL.g:2917:1: rule__InputObjectTypeDefinition__Group_3__1__Impl : ( ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )* ) ;
    public final void rule__InputObjectTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2921:1: ( ( ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )* ) )
            // InternalGraphQL.g:2922:1: ( ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )* )
            {
            // InternalGraphQL.g:2922:1: ( ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )* )
            // InternalGraphQL.g:2923:2: ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )*
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputsFieldDefinitionsAssignment_3_1()); 
            // InternalGraphQL.g:2924:2: ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_SL_STRING_VALUE && LA34_0<=RULE_NAME)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGraphQL.g:2924:3: rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getInputsFieldDefinitionsAssignment_3_1()); 

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
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_3__2"
    // InternalGraphQL.g:2932:1: rule__InputObjectTypeDefinition__Group_3__2 : rule__InputObjectTypeDefinition__Group_3__2__Impl ;
    public final void rule__InputObjectTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2936:1: ( rule__InputObjectTypeDefinition__Group_3__2__Impl )
            // InternalGraphQL.g:2937:2: rule__InputObjectTypeDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_3__2__Impl();

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
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_3__2"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_3__2__Impl"
    // InternalGraphQL.g:2943:1: rule__InputObjectTypeDefinition__Group_3__2__Impl : ( '}' ) ;
    public final void rule__InputObjectTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2947:1: ( ( '}' ) )
            // InternalGraphQL.g:2948:1: ( '}' )
            {
            // InternalGraphQL.g:2948:1: ( '}' )
            // InternalGraphQL.g:2949:2: '}'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__InputValueDefinition__Group__0"
    // InternalGraphQL.g:2959:1: rule__InputValueDefinition__Group__0 : rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1 ;
    public final void rule__InputValueDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2963:1: ( rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1 )
            // InternalGraphQL.g:2964:2: rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGraphQL.g:2971:1: rule__InputValueDefinition__Group__0__Impl : ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InputValueDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2975:1: ( ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2976:1: ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2976:1: ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2977:2: ( rule__InputValueDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInputValueDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2978:2: ( rule__InputValueDefinition__DescriptionAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_SL_STRING_VALUE && LA35_0<=RULE_ML_STRING_VALUE)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGraphQL.g:2978:3: rule__InputValueDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2986:1: rule__InputValueDefinition__Group__1 : rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2 ;
    public final void rule__InputValueDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2990:1: ( rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2 )
            // InternalGraphQL.g:2991:2: rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2
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
    // InternalGraphQL.g:2998:1: rule__InputValueDefinition__Group__1__Impl : ( ( rule__InputValueDefinition__NameAssignment_1 ) ) ;
    public final void rule__InputValueDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3002:1: ( ( ( rule__InputValueDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:3003:1: ( ( rule__InputValueDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:3003:1: ( ( rule__InputValueDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:3004:2: ( rule__InputValueDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:3005:2: ( rule__InputValueDefinition__NameAssignment_1 )
            // InternalGraphQL.g:3005:3: rule__InputValueDefinition__NameAssignment_1
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
    // InternalGraphQL.g:3013:1: rule__InputValueDefinition__Group__2 : rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3 ;
    public final void rule__InputValueDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3017:1: ( rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3 )
            // InternalGraphQL.g:3018:2: rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:3025:1: rule__InputValueDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__InputValueDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3029:1: ( ( ':' ) )
            // InternalGraphQL.g:3030:1: ( ':' )
            {
            // InternalGraphQL.g:3030:1: ( ':' )
            // InternalGraphQL.g:3031:2: ':'
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
    // InternalGraphQL.g:3040:1: rule__InputValueDefinition__Group__3 : rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4 ;
    public final void rule__InputValueDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3044:1: ( rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4 )
            // InternalGraphQL.g:3045:2: rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalGraphQL.g:3052:1: rule__InputValueDefinition__Group__3__Impl : ( ( rule__InputValueDefinition__TypeAssignment_3 ) ) ;
    public final void rule__InputValueDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3056:1: ( ( ( rule__InputValueDefinition__TypeAssignment_3 ) ) )
            // InternalGraphQL.g:3057:1: ( ( rule__InputValueDefinition__TypeAssignment_3 ) )
            {
            // InternalGraphQL.g:3057:1: ( ( rule__InputValueDefinition__TypeAssignment_3 ) )
            // InternalGraphQL.g:3058:2: ( rule__InputValueDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getTypeAssignment_3()); 
            // InternalGraphQL.g:3059:2: ( rule__InputValueDefinition__TypeAssignment_3 )
            // InternalGraphQL.g:3059:3: rule__InputValueDefinition__TypeAssignment_3
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
    // InternalGraphQL.g:3067:1: rule__InputValueDefinition__Group__4 : rule__InputValueDefinition__Group__4__Impl ;
    public final void rule__InputValueDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3071:1: ( rule__InputValueDefinition__Group__4__Impl )
            // InternalGraphQL.g:3072:2: rule__InputValueDefinition__Group__4__Impl
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
    // InternalGraphQL.g:3078:1: rule__InputValueDefinition__Group__4__Impl : ( ( rule__InputValueDefinition__Group_4__0 )? ) ;
    public final void rule__InputValueDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3082:1: ( ( ( rule__InputValueDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:3083:1: ( ( rule__InputValueDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:3083:1: ( ( rule__InputValueDefinition__Group_4__0 )? )
            // InternalGraphQL.g:3084:2: ( rule__InputValueDefinition__Group_4__0 )?
            {
             before(grammarAccess.getInputValueDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:3085:2: ( rule__InputValueDefinition__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGraphQL.g:3085:3: rule__InputValueDefinition__Group_4__0
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
    // InternalGraphQL.g:3094:1: rule__InputValueDefinition__Group_4__0 : rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1 ;
    public final void rule__InputValueDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3098:1: ( rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1 )
            // InternalGraphQL.g:3099:2: rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalGraphQL.g:3106:1: rule__InputValueDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__InputValueDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3110:1: ( ( '=' ) )
            // InternalGraphQL.g:3111:1: ( '=' )
            {
            // InternalGraphQL.g:3111:1: ( '=' )
            // InternalGraphQL.g:3112:2: '='
            {
             before(grammarAccess.getInputValueDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalGraphQL.g:3121:1: rule__InputValueDefinition__Group_4__1 : rule__InputValueDefinition__Group_4__1__Impl ;
    public final void rule__InputValueDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3125:1: ( rule__InputValueDefinition__Group_4__1__Impl )
            // InternalGraphQL.g:3126:2: rule__InputValueDefinition__Group_4__1__Impl
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
    // InternalGraphQL.g:3132:1: rule__InputValueDefinition__Group_4__1__Impl : ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) ) ;
    public final void rule__InputValueDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3136:1: ( ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) ) )
            // InternalGraphQL.g:3137:1: ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) )
            {
            // InternalGraphQL.g:3137:1: ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) )
            // InternalGraphQL.g:3138:2: ( rule__InputValueDefinition__DefaultValueAssignment_4_1 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getDefaultValueAssignment_4_1()); 
            // InternalGraphQL.g:3139:2: ( rule__InputValueDefinition__DefaultValueAssignment_4_1 )
            // InternalGraphQL.g:3139:3: rule__InputValueDefinition__DefaultValueAssignment_4_1
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


    // $ANTLR start "rule__IntersectionType__Group__0"
    // InternalGraphQL.g:3148:1: rule__IntersectionType__Group__0 : rule__IntersectionType__Group__0__Impl rule__IntersectionType__Group__1 ;
    public final void rule__IntersectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3152:1: ( rule__IntersectionType__Group__0__Impl rule__IntersectionType__Group__1 )
            // InternalGraphQL.g:3153:2: rule__IntersectionType__Group__0__Impl rule__IntersectionType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__IntersectionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group__1();

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
    // $ANTLR end "rule__IntersectionType__Group__0"


    // $ANTLR start "rule__IntersectionType__Group__0__Impl"
    // InternalGraphQL.g:3160:1: rule__IntersectionType__Group__0__Impl : ( ( '&' )? ) ;
    public final void rule__IntersectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3164:1: ( ( ( '&' )? ) )
            // InternalGraphQL.g:3165:1: ( ( '&' )? )
            {
            // InternalGraphQL.g:3165:1: ( ( '&' )? )
            // InternalGraphQL.g:3166:2: ( '&' )?
            {
             before(grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_0()); 
            // InternalGraphQL.g:3167:2: ( '&' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGraphQL.g:3167:3: '&'
                    {
                    match(input,51,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_0()); 

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
    // $ANTLR end "rule__IntersectionType__Group__0__Impl"


    // $ANTLR start "rule__IntersectionType__Group__1"
    // InternalGraphQL.g:3175:1: rule__IntersectionType__Group__1 : rule__IntersectionType__Group__1__Impl rule__IntersectionType__Group__2 ;
    public final void rule__IntersectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3179:1: ( rule__IntersectionType__Group__1__Impl rule__IntersectionType__Group__2 )
            // InternalGraphQL.g:3180:2: rule__IntersectionType__Group__1__Impl rule__IntersectionType__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__IntersectionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group__2();

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
    // $ANTLR end "rule__IntersectionType__Group__1"


    // $ANTLR start "rule__IntersectionType__Group__1__Impl"
    // InternalGraphQL.g:3187:1: rule__IntersectionType__Group__1__Impl : ( ( rule__IntersectionType__MemberTypesAssignment_1 ) ) ;
    public final void rule__IntersectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3191:1: ( ( ( rule__IntersectionType__MemberTypesAssignment_1 ) ) )
            // InternalGraphQL.g:3192:1: ( ( rule__IntersectionType__MemberTypesAssignment_1 ) )
            {
            // InternalGraphQL.g:3192:1: ( ( rule__IntersectionType__MemberTypesAssignment_1 ) )
            // InternalGraphQL.g:3193:2: ( rule__IntersectionType__MemberTypesAssignment_1 )
            {
             before(grammarAccess.getIntersectionTypeAccess().getMemberTypesAssignment_1()); 
            // InternalGraphQL.g:3194:2: ( rule__IntersectionType__MemberTypesAssignment_1 )
            // InternalGraphQL.g:3194:3: rule__IntersectionType__MemberTypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__MemberTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionTypeAccess().getMemberTypesAssignment_1()); 

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
    // $ANTLR end "rule__IntersectionType__Group__1__Impl"


    // $ANTLR start "rule__IntersectionType__Group__2"
    // InternalGraphQL.g:3202:1: rule__IntersectionType__Group__2 : rule__IntersectionType__Group__2__Impl ;
    public final void rule__IntersectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3206:1: ( rule__IntersectionType__Group__2__Impl )
            // InternalGraphQL.g:3207:2: rule__IntersectionType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group__2__Impl();

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
    // $ANTLR end "rule__IntersectionType__Group__2"


    // $ANTLR start "rule__IntersectionType__Group__2__Impl"
    // InternalGraphQL.g:3213:1: rule__IntersectionType__Group__2__Impl : ( ( rule__IntersectionType__Group_2__0 )* ) ;
    public final void rule__IntersectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3217:1: ( ( ( rule__IntersectionType__Group_2__0 )* ) )
            // InternalGraphQL.g:3218:1: ( ( rule__IntersectionType__Group_2__0 )* )
            {
            // InternalGraphQL.g:3218:1: ( ( rule__IntersectionType__Group_2__0 )* )
            // InternalGraphQL.g:3219:2: ( rule__IntersectionType__Group_2__0 )*
            {
             before(grammarAccess.getIntersectionTypeAccess().getGroup_2()); 
            // InternalGraphQL.g:3220:2: ( rule__IntersectionType__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==51) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGraphQL.g:3220:3: rule__IntersectionType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__IntersectionType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getIntersectionTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__IntersectionType__Group__2__Impl"


    // $ANTLR start "rule__IntersectionType__Group_2__0"
    // InternalGraphQL.g:3229:1: rule__IntersectionType__Group_2__0 : rule__IntersectionType__Group_2__0__Impl rule__IntersectionType__Group_2__1 ;
    public final void rule__IntersectionType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3233:1: ( rule__IntersectionType__Group_2__0__Impl rule__IntersectionType__Group_2__1 )
            // InternalGraphQL.g:3234:2: rule__IntersectionType__Group_2__0__Impl rule__IntersectionType__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__IntersectionType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group_2__1();

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
    // $ANTLR end "rule__IntersectionType__Group_2__0"


    // $ANTLR start "rule__IntersectionType__Group_2__0__Impl"
    // InternalGraphQL.g:3241:1: rule__IntersectionType__Group_2__0__Impl : ( '&' ) ;
    public final void rule__IntersectionType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3245:1: ( ( '&' ) )
            // InternalGraphQL.g:3246:1: ( '&' )
            {
            // InternalGraphQL.g:3246:1: ( '&' )
            // InternalGraphQL.g:3247:2: '&'
            {
             before(grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_2_0()); 

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
    // $ANTLR end "rule__IntersectionType__Group_2__0__Impl"


    // $ANTLR start "rule__IntersectionType__Group_2__1"
    // InternalGraphQL.g:3256:1: rule__IntersectionType__Group_2__1 : rule__IntersectionType__Group_2__1__Impl ;
    public final void rule__IntersectionType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3260:1: ( rule__IntersectionType__Group_2__1__Impl )
            // InternalGraphQL.g:3261:2: rule__IntersectionType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group_2__1__Impl();

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
    // $ANTLR end "rule__IntersectionType__Group_2__1"


    // $ANTLR start "rule__IntersectionType__Group_2__1__Impl"
    // InternalGraphQL.g:3267:1: rule__IntersectionType__Group_2__1__Impl : ( ( rule__IntersectionType__MemberTypesAssignment_2_1 ) ) ;
    public final void rule__IntersectionType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3271:1: ( ( ( rule__IntersectionType__MemberTypesAssignment_2_1 ) ) )
            // InternalGraphQL.g:3272:1: ( ( rule__IntersectionType__MemberTypesAssignment_2_1 ) )
            {
            // InternalGraphQL.g:3272:1: ( ( rule__IntersectionType__MemberTypesAssignment_2_1 ) )
            // InternalGraphQL.g:3273:2: ( rule__IntersectionType__MemberTypesAssignment_2_1 )
            {
             before(grammarAccess.getIntersectionTypeAccess().getMemberTypesAssignment_2_1()); 
            // InternalGraphQL.g:3274:2: ( rule__IntersectionType__MemberTypesAssignment_2_1 )
            // InternalGraphQL.g:3274:3: rule__IntersectionType__MemberTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__MemberTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionTypeAccess().getMemberTypesAssignment_2_1()); 

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
    // $ANTLR end "rule__IntersectionType__Group_2__1__Impl"


    // $ANTLR start "rule__NamedType__Group__0"
    // InternalGraphQL.g:3283:1: rule__NamedType__Group__0 : rule__NamedType__Group__0__Impl rule__NamedType__Group__1 ;
    public final void rule__NamedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3287:1: ( rule__NamedType__Group__0__Impl rule__NamedType__Group__1 )
            // InternalGraphQL.g:3288:2: rule__NamedType__Group__0__Impl rule__NamedType__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalGraphQL.g:3295:1: rule__NamedType__Group__0__Impl : ( ( rule__NamedType__TypeDefinitionAssignment_0 ) ) ;
    public final void rule__NamedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3299:1: ( ( ( rule__NamedType__TypeDefinitionAssignment_0 ) ) )
            // InternalGraphQL.g:3300:1: ( ( rule__NamedType__TypeDefinitionAssignment_0 ) )
            {
            // InternalGraphQL.g:3300:1: ( ( rule__NamedType__TypeDefinitionAssignment_0 ) )
            // InternalGraphQL.g:3301:2: ( rule__NamedType__TypeDefinitionAssignment_0 )
            {
             before(grammarAccess.getNamedTypeAccess().getTypeDefinitionAssignment_0()); 
            // InternalGraphQL.g:3302:2: ( rule__NamedType__TypeDefinitionAssignment_0 )
            // InternalGraphQL.g:3302:3: rule__NamedType__TypeDefinitionAssignment_0
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
    // InternalGraphQL.g:3310:1: rule__NamedType__Group__1 : rule__NamedType__Group__1__Impl ;
    public final void rule__NamedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3314:1: ( rule__NamedType__Group__1__Impl )
            // InternalGraphQL.g:3315:2: rule__NamedType__Group__1__Impl
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
    // InternalGraphQL.g:3321:1: rule__NamedType__Group__1__Impl : ( ( rule__NamedType__NonNullAssignment_1 )? ) ;
    public final void rule__NamedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3325:1: ( ( ( rule__NamedType__NonNullAssignment_1 )? ) )
            // InternalGraphQL.g:3326:1: ( ( rule__NamedType__NonNullAssignment_1 )? )
            {
            // InternalGraphQL.g:3326:1: ( ( rule__NamedType__NonNullAssignment_1 )? )
            // InternalGraphQL.g:3327:2: ( rule__NamedType__NonNullAssignment_1 )?
            {
             before(grammarAccess.getNamedTypeAccess().getNonNullAssignment_1()); 
            // InternalGraphQL.g:3328:2: ( rule__NamedType__NonNullAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==58) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGraphQL.g:3328:3: rule__NamedType__NonNullAssignment_1
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
    // InternalGraphQL.g:3337:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3341:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // InternalGraphQL.g:3342:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:3349:1: rule__ListType__Group__0__Impl : ( '[' ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3353:1: ( ( '[' ) )
            // InternalGraphQL.g:3354:1: ( '[' )
            {
            // InternalGraphQL.g:3354:1: ( '[' )
            // InternalGraphQL.g:3355:2: '['
            {
             before(grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalGraphQL.g:3364:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3368:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // InternalGraphQL.g:3369:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalGraphQL.g:3376:1: rule__ListType__Group__1__Impl : ( ( rule__ListType__TypeAssignment_1 ) ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3380:1: ( ( ( rule__ListType__TypeAssignment_1 ) ) )
            // InternalGraphQL.g:3381:1: ( ( rule__ListType__TypeAssignment_1 ) )
            {
            // InternalGraphQL.g:3381:1: ( ( rule__ListType__TypeAssignment_1 ) )
            // InternalGraphQL.g:3382:2: ( rule__ListType__TypeAssignment_1 )
            {
             before(grammarAccess.getListTypeAccess().getTypeAssignment_1()); 
            // InternalGraphQL.g:3383:2: ( rule__ListType__TypeAssignment_1 )
            // InternalGraphQL.g:3383:3: rule__ListType__TypeAssignment_1
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
    // InternalGraphQL.g:3391:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3395:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // InternalGraphQL.g:3396:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalGraphQL.g:3403:1: rule__ListType__Group__2__Impl : ( ']' ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3407:1: ( ( ']' ) )
            // InternalGraphQL.g:3408:1: ( ']' )
            {
            // InternalGraphQL.g:3408:1: ( ']' )
            // InternalGraphQL.g:3409:2: ']'
            {
             before(grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGraphQL.g:3418:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3422:1: ( rule__ListType__Group__3__Impl )
            // InternalGraphQL.g:3423:2: rule__ListType__Group__3__Impl
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
    // InternalGraphQL.g:3429:1: rule__ListType__Group__3__Impl : ( ( rule__ListType__NonNullAssignment_3 )? ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3433:1: ( ( ( rule__ListType__NonNullAssignment_3 )? ) )
            // InternalGraphQL.g:3434:1: ( ( rule__ListType__NonNullAssignment_3 )? )
            {
            // InternalGraphQL.g:3434:1: ( ( rule__ListType__NonNullAssignment_3 )? )
            // InternalGraphQL.g:3435:2: ( rule__ListType__NonNullAssignment_3 )?
            {
             before(grammarAccess.getListTypeAccess().getNonNullAssignment_3()); 
            // InternalGraphQL.g:3436:2: ( rule__ListType__NonNullAssignment_3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGraphQL.g:3436:3: rule__ListType__NonNullAssignment_3
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
    // InternalGraphQL.g:3445:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3449:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGraphQL.g:3450:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalGraphQL.g:3457:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3461:1: ( ( () ) )
            // InternalGraphQL.g:3462:1: ( () )
            {
            // InternalGraphQL.g:3462:1: ( () )
            // InternalGraphQL.g:3463:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalGraphQL.g:3464:2: ()
            // InternalGraphQL.g:3464:3: 
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
    // InternalGraphQL.g:3472:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3476:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGraphQL.g:3477:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalGraphQL.g:3484:1: rule__ObjectValue__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3488:1: ( ( '{' ) )
            // InternalGraphQL.g:3489:1: ( '{' )
            {
            // InternalGraphQL.g:3489:1: ( '{' )
            // InternalGraphQL.g:3490:2: '{'
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
    // InternalGraphQL.g:3499:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3503:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGraphQL.g:3504:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalGraphQL.g:3511:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__FieldsAssignment_2 )* ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3515:1: ( ( ( rule__ObjectValue__FieldsAssignment_2 )* ) )
            // InternalGraphQL.g:3516:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            {
            // InternalGraphQL.g:3516:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            // InternalGraphQL.g:3517:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            {
             before(grammarAccess.getObjectValueAccess().getFieldsAssignment_2()); 
            // InternalGraphQL.g:3518:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_NAME) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGraphQL.g:3518:3: rule__ObjectValue__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__ObjectValue__FieldsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalGraphQL.g:3526:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3530:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGraphQL.g:3531:2: rule__ObjectValue__Group__3__Impl
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
    // InternalGraphQL.g:3537:1: rule__ObjectValue__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3541:1: ( ( '}' ) )
            // InternalGraphQL.g:3542:1: ( '}' )
            {
            // InternalGraphQL.g:3542:1: ( '}' )
            // InternalGraphQL.g:3543:2: '}'
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
    // InternalGraphQL.g:3553:1: rule__ObjectField__Group__0 : rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 ;
    public final void rule__ObjectField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3557:1: ( rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 )
            // InternalGraphQL.g:3558:2: rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1
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
    // InternalGraphQL.g:3565:1: rule__ObjectField__Group__0__Impl : ( ( rule__ObjectField__NameAssignment_0 ) ) ;
    public final void rule__ObjectField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3569:1: ( ( ( rule__ObjectField__NameAssignment_0 ) ) )
            // InternalGraphQL.g:3570:1: ( ( rule__ObjectField__NameAssignment_0 ) )
            {
            // InternalGraphQL.g:3570:1: ( ( rule__ObjectField__NameAssignment_0 ) )
            // InternalGraphQL.g:3571:2: ( rule__ObjectField__NameAssignment_0 )
            {
             before(grammarAccess.getObjectFieldAccess().getNameAssignment_0()); 
            // InternalGraphQL.g:3572:2: ( rule__ObjectField__NameAssignment_0 )
            // InternalGraphQL.g:3572:3: rule__ObjectField__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFieldAccess().getNameAssignment_0()); 

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
    // InternalGraphQL.g:3580:1: rule__ObjectField__Group__1 : rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 ;
    public final void rule__ObjectField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3584:1: ( rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 )
            // InternalGraphQL.g:3585:2: rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalGraphQL.g:3592:1: rule__ObjectField__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjectField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3596:1: ( ( ':' ) )
            // InternalGraphQL.g:3597:1: ( ':' )
            {
            // InternalGraphQL.g:3597:1: ( ':' )
            // InternalGraphQL.g:3598:2: ':'
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
    // InternalGraphQL.g:3607:1: rule__ObjectField__Group__2 : rule__ObjectField__Group__2__Impl ;
    public final void rule__ObjectField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3611:1: ( rule__ObjectField__Group__2__Impl )
            // InternalGraphQL.g:3612:2: rule__ObjectField__Group__2__Impl
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
    // InternalGraphQL.g:3618:1: rule__ObjectField__Group__2__Impl : ( ( rule__ObjectField__ValueAssignment_2 ) ) ;
    public final void rule__ObjectField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3622:1: ( ( ( rule__ObjectField__ValueAssignment_2 ) ) )
            // InternalGraphQL.g:3623:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            {
            // InternalGraphQL.g:3623:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            // InternalGraphQL.g:3624:2: ( rule__ObjectField__ValueAssignment_2 )
            {
             before(grammarAccess.getObjectFieldAccess().getValueAssignment_2()); 
            // InternalGraphQL.g:3625:2: ( rule__ObjectField__ValueAssignment_2 )
            // InternalGraphQL.g:3625:3: rule__ObjectField__ValueAssignment_2
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
    // InternalGraphQL.g:3634:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3638:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalGraphQL.g:3639:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalGraphQL.g:3646:1: rule__ListValue__Group__0__Impl : ( () ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3650:1: ( ( () ) )
            // InternalGraphQL.g:3651:1: ( () )
            {
            // InternalGraphQL.g:3651:1: ( () )
            // InternalGraphQL.g:3652:2: ()
            {
             before(grammarAccess.getListValueAccess().getListValueAction_0()); 
            // InternalGraphQL.g:3653:2: ()
            // InternalGraphQL.g:3653:3: 
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
    // InternalGraphQL.g:3661:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3665:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalGraphQL.g:3666:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalGraphQL.g:3673:1: rule__ListValue__Group__1__Impl : ( '[' ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3677:1: ( ( '[' ) )
            // InternalGraphQL.g:3678:1: ( '[' )
            {
            // InternalGraphQL.g:3678:1: ( '[' )
            // InternalGraphQL.g:3679:2: '['
            {
             before(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalGraphQL.g:3688:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3692:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalGraphQL.g:3693:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalGraphQL.g:3700:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__ValuesAssignment_2 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3704:1: ( ( ( rule__ListValue__ValuesAssignment_2 )* ) )
            // InternalGraphQL.g:3705:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            {
            // InternalGraphQL.g:3705:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            // InternalGraphQL.g:3706:2: ( rule__ListValue__ValuesAssignment_2 )*
            {
             before(grammarAccess.getListValueAccess().getValuesAssignment_2()); 
            // InternalGraphQL.g:3707:2: ( rule__ListValue__ValuesAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_SL_STRING_VALUE && LA42_0<=RULE_FLOAT_VALUE)||(LA42_0>=14 && LA42_0<=15)||LA42_0==39||LA42_0==52||LA42_0==59) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGraphQL.g:3707:3: rule__ListValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__ListValue__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalGraphQL.g:3715:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3719:1: ( rule__ListValue__Group__3__Impl )
            // InternalGraphQL.g:3720:2: rule__ListValue__Group__3__Impl
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
    // InternalGraphQL.g:3726:1: rule__ListValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3730:1: ( ( ']' ) )
            // InternalGraphQL.g:3731:1: ( ']' )
            {
            // InternalGraphQL.g:3731:1: ( ']' )
            // InternalGraphQL.g:3732:2: ']'
            {
             before(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGraphQL.g:3742:1: rule__DirectiveDefinition__Group__0 : rule__DirectiveDefinition__Group__0__Impl rule__DirectiveDefinition__Group__1 ;
    public final void rule__DirectiveDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3746:1: ( rule__DirectiveDefinition__Group__0__Impl rule__DirectiveDefinition__Group__1 )
            // InternalGraphQL.g:3747:2: rule__DirectiveDefinition__Group__0__Impl rule__DirectiveDefinition__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalGraphQL.g:3754:1: rule__DirectiveDefinition__Group__0__Impl : ( ( rule__DirectiveDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__DirectiveDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3758:1: ( ( ( rule__DirectiveDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:3759:1: ( ( rule__DirectiveDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:3759:1: ( ( rule__DirectiveDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:3760:2: ( rule__DirectiveDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:3761:2: ( rule__DirectiveDefinition__DescriptionAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_SL_STRING_VALUE && LA43_0<=RULE_ML_STRING_VALUE)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGraphQL.g:3761:3: rule__DirectiveDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:3769:1: rule__DirectiveDefinition__Group__1 : rule__DirectiveDefinition__Group__1__Impl rule__DirectiveDefinition__Group__2 ;
    public final void rule__DirectiveDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3773:1: ( rule__DirectiveDefinition__Group__1__Impl rule__DirectiveDefinition__Group__2 )
            // InternalGraphQL.g:3774:2: rule__DirectiveDefinition__Group__1__Impl rule__DirectiveDefinition__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalGraphQL.g:3781:1: rule__DirectiveDefinition__Group__1__Impl : ( 'directive' ) ;
    public final void rule__DirectiveDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3785:1: ( ( 'directive' ) )
            // InternalGraphQL.g:3786:1: ( 'directive' )
            {
            // InternalGraphQL.g:3786:1: ( 'directive' )
            // InternalGraphQL.g:3787:2: 'directive'
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDirectiveKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGraphQL.g:3796:1: rule__DirectiveDefinition__Group__2 : rule__DirectiveDefinition__Group__2__Impl rule__DirectiveDefinition__Group__3 ;
    public final void rule__DirectiveDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3800:1: ( rule__DirectiveDefinition__Group__2__Impl rule__DirectiveDefinition__Group__3 )
            // InternalGraphQL.g:3801:2: rule__DirectiveDefinition__Group__2__Impl rule__DirectiveDefinition__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalGraphQL.g:3808:1: rule__DirectiveDefinition__Group__2__Impl : ( ( rule__DirectiveDefinition__NameAssignment_2 ) ) ;
    public final void rule__DirectiveDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3812:1: ( ( ( rule__DirectiveDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:3813:1: ( ( rule__DirectiveDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:3813:1: ( ( rule__DirectiveDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:3814:2: ( rule__DirectiveDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:3815:2: ( rule__DirectiveDefinition__NameAssignment_2 )
            // InternalGraphQL.g:3815:3: rule__DirectiveDefinition__NameAssignment_2
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
    // InternalGraphQL.g:3823:1: rule__DirectiveDefinition__Group__3 : rule__DirectiveDefinition__Group__3__Impl rule__DirectiveDefinition__Group__4 ;
    public final void rule__DirectiveDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3827:1: ( rule__DirectiveDefinition__Group__3__Impl rule__DirectiveDefinition__Group__4 )
            // InternalGraphQL.g:3828:2: rule__DirectiveDefinition__Group__3__Impl rule__DirectiveDefinition__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalGraphQL.g:3835:1: rule__DirectiveDefinition__Group__3__Impl : ( ( rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3 )? ) ;
    public final void rule__DirectiveDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3839:1: ( ( ( rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3 )? ) )
            // InternalGraphQL.g:3840:1: ( ( rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3 )? )
            {
            // InternalGraphQL.g:3840:1: ( ( rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3 )? )
            // InternalGraphQL.g:3841:2: ( rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3 )?
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getArgumentDefinitionsAssignment_3()); 
            // InternalGraphQL.g:3842:2: ( rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGraphQL.g:3842:3: rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectiveDefinitionAccess().getArgumentDefinitionsAssignment_3()); 

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
    // InternalGraphQL.g:3850:1: rule__DirectiveDefinition__Group__4 : rule__DirectiveDefinition__Group__4__Impl rule__DirectiveDefinition__Group__5 ;
    public final void rule__DirectiveDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3854:1: ( rule__DirectiveDefinition__Group__4__Impl rule__DirectiveDefinition__Group__5 )
            // InternalGraphQL.g:3855:2: rule__DirectiveDefinition__Group__4__Impl rule__DirectiveDefinition__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalGraphQL.g:3862:1: rule__DirectiveDefinition__Group__4__Impl : ( ( rule__DirectiveDefinition__RepeatableAssignment_4 )? ) ;
    public final void rule__DirectiveDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3866:1: ( ( ( rule__DirectiveDefinition__RepeatableAssignment_4 )? ) )
            // InternalGraphQL.g:3867:1: ( ( rule__DirectiveDefinition__RepeatableAssignment_4 )? )
            {
            // InternalGraphQL.g:3867:1: ( ( rule__DirectiveDefinition__RepeatableAssignment_4 )? )
            // InternalGraphQL.g:3868:2: ( rule__DirectiveDefinition__RepeatableAssignment_4 )?
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getRepeatableAssignment_4()); 
            // InternalGraphQL.g:3869:2: ( rule__DirectiveDefinition__RepeatableAssignment_4 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==60) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGraphQL.g:3869:3: rule__DirectiveDefinition__RepeatableAssignment_4
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
    // InternalGraphQL.g:3877:1: rule__DirectiveDefinition__Group__5 : rule__DirectiveDefinition__Group__5__Impl rule__DirectiveDefinition__Group__6 ;
    public final void rule__DirectiveDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3881:1: ( rule__DirectiveDefinition__Group__5__Impl rule__DirectiveDefinition__Group__6 )
            // InternalGraphQL.g:3882:2: rule__DirectiveDefinition__Group__5__Impl rule__DirectiveDefinition__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalGraphQL.g:3889:1: rule__DirectiveDefinition__Group__5__Impl : ( 'on' ) ;
    public final void rule__DirectiveDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3893:1: ( ( 'on' ) )
            // InternalGraphQL.g:3894:1: ( 'on' )
            {
            // InternalGraphQL.g:3894:1: ( 'on' )
            // InternalGraphQL.g:3895:2: 'on'
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getOnKeyword_5()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGraphQL.g:3904:1: rule__DirectiveDefinition__Group__6 : rule__DirectiveDefinition__Group__6__Impl ;
    public final void rule__DirectiveDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3908:1: ( rule__DirectiveDefinition__Group__6__Impl )
            // InternalGraphQL.g:3909:2: rule__DirectiveDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__Group__6__Impl();

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
    // InternalGraphQL.g:3915:1: rule__DirectiveDefinition__Group__6__Impl : ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_6 ) ) ;
    public final void rule__DirectiveDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3919:1: ( ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_6 ) ) )
            // InternalGraphQL.g:3920:1: ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_6 ) )
            {
            // InternalGraphQL.g:3920:1: ( ( rule__DirectiveDefinition__DirectiveLocationsAssignment_6 ) )
            // InternalGraphQL.g:3921:2: ( rule__DirectiveDefinition__DirectiveLocationsAssignment_6 )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsAssignment_6()); 
            // InternalGraphQL.g:3922:2: ( rule__DirectiveDefinition__DirectiveLocationsAssignment_6 )
            // InternalGraphQL.g:3922:3: rule__DirectiveDefinition__DirectiveLocationsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveDefinition__DirectiveLocationsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsAssignment_6()); 

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


    // $ANTLR start "rule__Directive__Group__0"
    // InternalGraphQL.g:3931:1: rule__Directive__Group__0 : rule__Directive__Group__0__Impl rule__Directive__Group__1 ;
    public final void rule__Directive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3935:1: ( rule__Directive__Group__0__Impl rule__Directive__Group__1 )
            // InternalGraphQL.g:3936:2: rule__Directive__Group__0__Impl rule__Directive__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalGraphQL.g:3943:1: rule__Directive__Group__0__Impl : ( ( rule__Directive__NameAssignment_0 ) ) ;
    public final void rule__Directive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3947:1: ( ( ( rule__Directive__NameAssignment_0 ) ) )
            // InternalGraphQL.g:3948:1: ( ( rule__Directive__NameAssignment_0 ) )
            {
            // InternalGraphQL.g:3948:1: ( ( rule__Directive__NameAssignment_0 ) )
            // InternalGraphQL.g:3949:2: ( rule__Directive__NameAssignment_0 )
            {
             before(grammarAccess.getDirectiveAccess().getNameAssignment_0()); 
            // InternalGraphQL.g:3950:2: ( rule__Directive__NameAssignment_0 )
            // InternalGraphQL.g:3950:3: rule__Directive__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Directive__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveAccess().getNameAssignment_0()); 

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
    // InternalGraphQL.g:3958:1: rule__Directive__Group__1 : rule__Directive__Group__1__Impl ;
    public final void rule__Directive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3962:1: ( rule__Directive__Group__1__Impl )
            // InternalGraphQL.g:3963:2: rule__Directive__Group__1__Impl
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
    // InternalGraphQL.g:3969:1: rule__Directive__Group__1__Impl : ( ( rule__Directive__ArgumentsAssignment_1 )? ) ;
    public final void rule__Directive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3973:1: ( ( ( rule__Directive__ArgumentsAssignment_1 )? ) )
            // InternalGraphQL.g:3974:1: ( ( rule__Directive__ArgumentsAssignment_1 )? )
            {
            // InternalGraphQL.g:3974:1: ( ( rule__Directive__ArgumentsAssignment_1 )? )
            // InternalGraphQL.g:3975:2: ( rule__Directive__ArgumentsAssignment_1 )?
            {
             before(grammarAccess.getDirectiveAccess().getArgumentsAssignment_1()); 
            // InternalGraphQL.g:3976:2: ( rule__Directive__ArgumentsAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGraphQL.g:3976:3: rule__Directive__ArgumentsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Directive__ArgumentsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectiveAccess().getArgumentsAssignment_1()); 

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


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalGraphQL.g:3985:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3989:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalGraphQL.g:3990:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Arguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__1();

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
    // $ANTLR end "rule__Arguments__Group__0"


    // $ANTLR start "rule__Arguments__Group__0__Impl"
    // InternalGraphQL.g:3997:1: rule__Arguments__Group__0__Impl : ( () ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4001:1: ( ( () ) )
            // InternalGraphQL.g:4002:1: ( () )
            {
            // InternalGraphQL.g:4002:1: ( () )
            // InternalGraphQL.g:4003:2: ()
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAction_0()); 
            // InternalGraphQL.g:4004:2: ()
            // InternalGraphQL.g:4004:3: 
            {
            }

             after(grammarAccess.getArgumentsAccess().getArgumentsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0__Impl"


    // $ANTLR start "rule__Arguments__Group__1"
    // InternalGraphQL.g:4012:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4016:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // InternalGraphQL.g:4017:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__Arguments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__2();

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
    // $ANTLR end "rule__Arguments__Group__1"


    // $ANTLR start "rule__Arguments__Group__1__Impl"
    // InternalGraphQL.g:4024:1: rule__Arguments__Group__1__Impl : ( '(' ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4028:1: ( ( '(' ) )
            // InternalGraphQL.g:4029:1: ( '(' )
            {
            // InternalGraphQL.g:4029:1: ( '(' )
            // InternalGraphQL.g:4030:2: '('
            {
             before(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Arguments__Group__1__Impl"


    // $ANTLR start "rule__Arguments__Group__2"
    // InternalGraphQL.g:4039:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl rule__Arguments__Group__3 ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4043:1: ( rule__Arguments__Group__2__Impl rule__Arguments__Group__3 )
            // InternalGraphQL.g:4044:2: rule__Arguments__Group__2__Impl rule__Arguments__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__Arguments__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__3();

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
    // $ANTLR end "rule__Arguments__Group__2"


    // $ANTLR start "rule__Arguments__Group__2__Impl"
    // InternalGraphQL.g:4051:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__ArgumentsAssignment_2 )* ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4055:1: ( ( ( rule__Arguments__ArgumentsAssignment_2 )* ) )
            // InternalGraphQL.g:4056:1: ( ( rule__Arguments__ArgumentsAssignment_2 )* )
            {
            // InternalGraphQL.g:4056:1: ( ( rule__Arguments__ArgumentsAssignment_2 )* )
            // InternalGraphQL.g:4057:2: ( rule__Arguments__ArgumentsAssignment_2 )*
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2()); 
            // InternalGraphQL.g:4058:2: ( rule__Arguments__ArgumentsAssignment_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_NAME) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGraphQL.g:4058:3: rule__Arguments__ArgumentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Arguments__ArgumentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2()); 

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
    // $ANTLR end "rule__Arguments__Group__2__Impl"


    // $ANTLR start "rule__Arguments__Group__3"
    // InternalGraphQL.g:4066:1: rule__Arguments__Group__3 : rule__Arguments__Group__3__Impl ;
    public final void rule__Arguments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4070:1: ( rule__Arguments__Group__3__Impl )
            // InternalGraphQL.g:4071:2: rule__Arguments__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__3__Impl();

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
    // $ANTLR end "rule__Arguments__Group__3"


    // $ANTLR start "rule__Arguments__Group__3__Impl"
    // InternalGraphQL.g:4077:1: rule__Arguments__Group__3__Impl : ( ')' ) ;
    public final void rule__Arguments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4081:1: ( ( ')' ) )
            // InternalGraphQL.g:4082:1: ( ')' )
            {
            // InternalGraphQL.g:4082:1: ( ')' )
            // InternalGraphQL.g:4083:2: ')'
            {
             before(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Arguments__Group__3__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalGraphQL.g:4093:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4097:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalGraphQL.g:4098:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalGraphQL.g:4105:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__ArgumentDefinitionAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4109:1: ( ( ( rule__Argument__ArgumentDefinitionAssignment_0 ) ) )
            // InternalGraphQL.g:4110:1: ( ( rule__Argument__ArgumentDefinitionAssignment_0 ) )
            {
            // InternalGraphQL.g:4110:1: ( ( rule__Argument__ArgumentDefinitionAssignment_0 ) )
            // InternalGraphQL.g:4111:2: ( rule__Argument__ArgumentDefinitionAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getArgumentDefinitionAssignment_0()); 
            // InternalGraphQL.g:4112:2: ( rule__Argument__ArgumentDefinitionAssignment_0 )
            // InternalGraphQL.g:4112:3: rule__Argument__ArgumentDefinitionAssignment_0
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
    // InternalGraphQL.g:4120:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4124:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // InternalGraphQL.g:4125:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalGraphQL.g:4132:1: rule__Argument__Group__1__Impl : ( ':' ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4136:1: ( ( ':' ) )
            // InternalGraphQL.g:4137:1: ( ':' )
            {
            // InternalGraphQL.g:4137:1: ( ':' )
            // InternalGraphQL.g:4138:2: ':'
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
    // InternalGraphQL.g:4147:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4151:1: ( rule__Argument__Group__2__Impl )
            // InternalGraphQL.g:4152:2: rule__Argument__Group__2__Impl
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
    // InternalGraphQL.g:4158:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__ValueAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4162:1: ( ( ( rule__Argument__ValueAssignment_2 ) ) )
            // InternalGraphQL.g:4163:1: ( ( rule__Argument__ValueAssignment_2 ) )
            {
            // InternalGraphQL.g:4163:1: ( ( rule__Argument__ValueAssignment_2 ) )
            // InternalGraphQL.g:4164:2: ( rule__Argument__ValueAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getValueAssignment_2()); 
            // InternalGraphQL.g:4165:2: ( rule__Argument__ValueAssignment_2 )
            // InternalGraphQL.g:4165:3: rule__Argument__ValueAssignment_2
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


    // $ANTLR start "rule__ArgumentsDefinition__Group__0"
    // InternalGraphQL.g:4174:1: rule__ArgumentsDefinition__Group__0 : rule__ArgumentsDefinition__Group__0__Impl rule__ArgumentsDefinition__Group__1 ;
    public final void rule__ArgumentsDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4178:1: ( rule__ArgumentsDefinition__Group__0__Impl rule__ArgumentsDefinition__Group__1 )
            // InternalGraphQL.g:4179:2: rule__ArgumentsDefinition__Group__0__Impl rule__ArgumentsDefinition__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ArgumentsDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentsDefinition__Group__1();

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
    // $ANTLR end "rule__ArgumentsDefinition__Group__0"


    // $ANTLR start "rule__ArgumentsDefinition__Group__0__Impl"
    // InternalGraphQL.g:4186:1: rule__ArgumentsDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ArgumentsDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4190:1: ( ( () ) )
            // InternalGraphQL.g:4191:1: ( () )
            {
            // InternalGraphQL.g:4191:1: ( () )
            // InternalGraphQL.g:4192:2: ()
            {
             before(grammarAccess.getArgumentsDefinitionAccess().getArgumentsDefinitionAction_0()); 
            // InternalGraphQL.g:4193:2: ()
            // InternalGraphQL.g:4193:3: 
            {
            }

             after(grammarAccess.getArgumentsDefinitionAccess().getArgumentsDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentsDefinition__Group__0__Impl"


    // $ANTLR start "rule__ArgumentsDefinition__Group__1"
    // InternalGraphQL.g:4201:1: rule__ArgumentsDefinition__Group__1 : rule__ArgumentsDefinition__Group__1__Impl rule__ArgumentsDefinition__Group__2 ;
    public final void rule__ArgumentsDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4205:1: ( rule__ArgumentsDefinition__Group__1__Impl rule__ArgumentsDefinition__Group__2 )
            // InternalGraphQL.g:4206:2: rule__ArgumentsDefinition__Group__1__Impl rule__ArgumentsDefinition__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__ArgumentsDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentsDefinition__Group__2();

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
    // $ANTLR end "rule__ArgumentsDefinition__Group__1"


    // $ANTLR start "rule__ArgumentsDefinition__Group__1__Impl"
    // InternalGraphQL.g:4213:1: rule__ArgumentsDefinition__Group__1__Impl : ( '(' ) ;
    public final void rule__ArgumentsDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4217:1: ( ( '(' ) )
            // InternalGraphQL.g:4218:1: ( '(' )
            {
            // InternalGraphQL.g:4218:1: ( '(' )
            // InternalGraphQL.g:4219:2: '('
            {
             before(grammarAccess.getArgumentsDefinitionAccess().getLeftParenthesisKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getArgumentsDefinitionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ArgumentsDefinition__Group__1__Impl"


    // $ANTLR start "rule__ArgumentsDefinition__Group__2"
    // InternalGraphQL.g:4228:1: rule__ArgumentsDefinition__Group__2 : rule__ArgumentsDefinition__Group__2__Impl rule__ArgumentsDefinition__Group__3 ;
    public final void rule__ArgumentsDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4232:1: ( rule__ArgumentsDefinition__Group__2__Impl rule__ArgumentsDefinition__Group__3 )
            // InternalGraphQL.g:4233:2: rule__ArgumentsDefinition__Group__2__Impl rule__ArgumentsDefinition__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__ArgumentsDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentsDefinition__Group__3();

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
    // $ANTLR end "rule__ArgumentsDefinition__Group__2"


    // $ANTLR start "rule__ArgumentsDefinition__Group__2__Impl"
    // InternalGraphQL.g:4240:1: rule__ArgumentsDefinition__Group__2__Impl : ( ( rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2 )* ) ;
    public final void rule__ArgumentsDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4244:1: ( ( ( rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2 )* ) )
            // InternalGraphQL.g:4245:1: ( ( rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2 )* )
            {
            // InternalGraphQL.g:4245:1: ( ( rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2 )* )
            // InternalGraphQL.g:4246:2: ( rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2 )*
            {
             before(grammarAccess.getArgumentsDefinitionAccess().getArgumentDefinitionsAssignment_2()); 
            // InternalGraphQL.g:4247:2: ( rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_SL_STRING_VALUE && LA48_0<=RULE_NAME)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalGraphQL.g:4247:3: rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getArgumentsDefinitionAccess().getArgumentDefinitionsAssignment_2()); 

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
    // $ANTLR end "rule__ArgumentsDefinition__Group__2__Impl"


    // $ANTLR start "rule__ArgumentsDefinition__Group__3"
    // InternalGraphQL.g:4255:1: rule__ArgumentsDefinition__Group__3 : rule__ArgumentsDefinition__Group__3__Impl ;
    public final void rule__ArgumentsDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4259:1: ( rule__ArgumentsDefinition__Group__3__Impl )
            // InternalGraphQL.g:4260:2: rule__ArgumentsDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentsDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__ArgumentsDefinition__Group__3"


    // $ANTLR start "rule__ArgumentsDefinition__Group__3__Impl"
    // InternalGraphQL.g:4266:1: rule__ArgumentsDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__ArgumentsDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4270:1: ( ( ')' ) )
            // InternalGraphQL.g:4271:1: ( ')' )
            {
            // InternalGraphQL.g:4271:1: ( ')' )
            // InternalGraphQL.g:4272:2: ')'
            {
             before(grammarAccess.getArgumentsDefinitionAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getArgumentsDefinitionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ArgumentsDefinition__Group__3__Impl"


    // $ANTLR start "rule__DirectiveLocations__Group__0"
    // InternalGraphQL.g:4282:1: rule__DirectiveLocations__Group__0 : rule__DirectiveLocations__Group__0__Impl rule__DirectiveLocations__Group__1 ;
    public final void rule__DirectiveLocations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4286:1: ( rule__DirectiveLocations__Group__0__Impl rule__DirectiveLocations__Group__1 )
            // InternalGraphQL.g:4287:2: rule__DirectiveLocations__Group__0__Impl rule__DirectiveLocations__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__DirectiveLocations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveLocations__Group__1();

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
    // $ANTLR end "rule__DirectiveLocations__Group__0"


    // $ANTLR start "rule__DirectiveLocations__Group__0__Impl"
    // InternalGraphQL.g:4294:1: rule__DirectiveLocations__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__DirectiveLocations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4298:1: ( ( ( '|' )? ) )
            // InternalGraphQL.g:4299:1: ( ( '|' )? )
            {
            // InternalGraphQL.g:4299:1: ( ( '|' )? )
            // InternalGraphQL.g:4300:2: ( '|' )?
            {
             before(grammarAccess.getDirectiveLocationsAccess().getVerticalLineKeyword_0()); 
            // InternalGraphQL.g:4301:2: ( '|' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGraphQL.g:4301:3: '|'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDirectiveLocationsAccess().getVerticalLineKeyword_0()); 

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
    // $ANTLR end "rule__DirectiveLocations__Group__0__Impl"


    // $ANTLR start "rule__DirectiveLocations__Group__1"
    // InternalGraphQL.g:4309:1: rule__DirectiveLocations__Group__1 : rule__DirectiveLocations__Group__1__Impl rule__DirectiveLocations__Group__2 ;
    public final void rule__DirectiveLocations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4313:1: ( rule__DirectiveLocations__Group__1__Impl rule__DirectiveLocations__Group__2 )
            // InternalGraphQL.g:4314:2: rule__DirectiveLocations__Group__1__Impl rule__DirectiveLocations__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__DirectiveLocations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveLocations__Group__2();

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
    // $ANTLR end "rule__DirectiveLocations__Group__1"


    // $ANTLR start "rule__DirectiveLocations__Group__1__Impl"
    // InternalGraphQL.g:4321:1: rule__DirectiveLocations__Group__1__Impl : ( ( rule__DirectiveLocations__DirectiveLocationsAssignment_1 ) ) ;
    public final void rule__DirectiveLocations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4325:1: ( ( ( rule__DirectiveLocations__DirectiveLocationsAssignment_1 ) ) )
            // InternalGraphQL.g:4326:1: ( ( rule__DirectiveLocations__DirectiveLocationsAssignment_1 ) )
            {
            // InternalGraphQL.g:4326:1: ( ( rule__DirectiveLocations__DirectiveLocationsAssignment_1 ) )
            // InternalGraphQL.g:4327:2: ( rule__DirectiveLocations__DirectiveLocationsAssignment_1 )
            {
             before(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsAssignment_1()); 
            // InternalGraphQL.g:4328:2: ( rule__DirectiveLocations__DirectiveLocationsAssignment_1 )
            // InternalGraphQL.g:4328:3: rule__DirectiveLocations__DirectiveLocationsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveLocations__DirectiveLocationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsAssignment_1()); 

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
    // $ANTLR end "rule__DirectiveLocations__Group__1__Impl"


    // $ANTLR start "rule__DirectiveLocations__Group__2"
    // InternalGraphQL.g:4336:1: rule__DirectiveLocations__Group__2 : rule__DirectiveLocations__Group__2__Impl ;
    public final void rule__DirectiveLocations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4340:1: ( rule__DirectiveLocations__Group__2__Impl )
            // InternalGraphQL.g:4341:2: rule__DirectiveLocations__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveLocations__Group__2__Impl();

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
    // $ANTLR end "rule__DirectiveLocations__Group__2"


    // $ANTLR start "rule__DirectiveLocations__Group__2__Impl"
    // InternalGraphQL.g:4347:1: rule__DirectiveLocations__Group__2__Impl : ( ( rule__DirectiveLocations__Group_2__0 )* ) ;
    public final void rule__DirectiveLocations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4351:1: ( ( ( rule__DirectiveLocations__Group_2__0 )* ) )
            // InternalGraphQL.g:4352:1: ( ( rule__DirectiveLocations__Group_2__0 )* )
            {
            // InternalGraphQL.g:4352:1: ( ( rule__DirectiveLocations__Group_2__0 )* )
            // InternalGraphQL.g:4353:2: ( rule__DirectiveLocations__Group_2__0 )*
            {
             before(grammarAccess.getDirectiveLocationsAccess().getGroup_2()); 
            // InternalGraphQL.g:4354:2: ( rule__DirectiveLocations__Group_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==48) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGraphQL.g:4354:3: rule__DirectiveLocations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__DirectiveLocations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getDirectiveLocationsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DirectiveLocations__Group__2__Impl"


    // $ANTLR start "rule__DirectiveLocations__Group_2__0"
    // InternalGraphQL.g:4363:1: rule__DirectiveLocations__Group_2__0 : rule__DirectiveLocations__Group_2__0__Impl rule__DirectiveLocations__Group_2__1 ;
    public final void rule__DirectiveLocations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4367:1: ( rule__DirectiveLocations__Group_2__0__Impl rule__DirectiveLocations__Group_2__1 )
            // InternalGraphQL.g:4368:2: rule__DirectiveLocations__Group_2__0__Impl rule__DirectiveLocations__Group_2__1
            {
            pushFollow(FOLLOW_42);
            rule__DirectiveLocations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectiveLocations__Group_2__1();

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
    // $ANTLR end "rule__DirectiveLocations__Group_2__0"


    // $ANTLR start "rule__DirectiveLocations__Group_2__0__Impl"
    // InternalGraphQL.g:4375:1: rule__DirectiveLocations__Group_2__0__Impl : ( '|' ) ;
    public final void rule__DirectiveLocations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4379:1: ( ( '|' ) )
            // InternalGraphQL.g:4380:1: ( '|' )
            {
            // InternalGraphQL.g:4380:1: ( '|' )
            // InternalGraphQL.g:4381:2: '|'
            {
             before(grammarAccess.getDirectiveLocationsAccess().getVerticalLineKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDirectiveLocationsAccess().getVerticalLineKeyword_2_0()); 

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
    // $ANTLR end "rule__DirectiveLocations__Group_2__0__Impl"


    // $ANTLR start "rule__DirectiveLocations__Group_2__1"
    // InternalGraphQL.g:4390:1: rule__DirectiveLocations__Group_2__1 : rule__DirectiveLocations__Group_2__1__Impl ;
    public final void rule__DirectiveLocations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4394:1: ( rule__DirectiveLocations__Group_2__1__Impl )
            // InternalGraphQL.g:4395:2: rule__DirectiveLocations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveLocations__Group_2__1__Impl();

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
    // $ANTLR end "rule__DirectiveLocations__Group_2__1"


    // $ANTLR start "rule__DirectiveLocations__Group_2__1__Impl"
    // InternalGraphQL.g:4401:1: rule__DirectiveLocations__Group_2__1__Impl : ( ( rule__DirectiveLocations__DirectiveLocationsAssignment_2_1 ) ) ;
    public final void rule__DirectiveLocations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4405:1: ( ( ( rule__DirectiveLocations__DirectiveLocationsAssignment_2_1 ) ) )
            // InternalGraphQL.g:4406:1: ( ( rule__DirectiveLocations__DirectiveLocationsAssignment_2_1 ) )
            {
            // InternalGraphQL.g:4406:1: ( ( rule__DirectiveLocations__DirectiveLocationsAssignment_2_1 ) )
            // InternalGraphQL.g:4407:2: ( rule__DirectiveLocations__DirectiveLocationsAssignment_2_1 )
            {
             before(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsAssignment_2_1()); 
            // InternalGraphQL.g:4408:2: ( rule__DirectiveLocations__DirectiveLocationsAssignment_2_1 )
            // InternalGraphQL.g:4408:3: rule__DirectiveLocations__DirectiveLocationsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectiveLocations__DirectiveLocationsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsAssignment_2_1()); 

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
    // $ANTLR end "rule__DirectiveLocations__Group_2__1__Impl"


    // $ANTLR start "rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0"
    // InternalGraphQL.g:4417:1: rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 : ( ruleSchemaDefinition ) ;
    public final void rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4421:1: ( ( ruleSchemaDefinition ) )
            // InternalGraphQL.g:4422:2: ( ruleSchemaDefinition )
            {
            // InternalGraphQL.g:4422:2: ( ruleSchemaDefinition )
            // InternalGraphQL.g:4423:3: ruleSchemaDefinition
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
    // InternalGraphQL.g:4432:1: rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 : ( ruleTypeDefinition ) ;
    public final void rule__TypeSystemDefinition__TypeDefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4436:1: ( ( ruleTypeDefinition ) )
            // InternalGraphQL.g:4437:2: ( ruleTypeDefinition )
            {
            // InternalGraphQL.g:4437:2: ( ruleTypeDefinition )
            // InternalGraphQL.g:4438:3: ruleTypeDefinition
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
    // InternalGraphQL.g:4447:1: rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2 : ( ruleDirectiveDefinition ) ;
    public final void rule__TypeSystemDefinition__DirectiveDefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4451:1: ( ( ruleDirectiveDefinition ) )
            // InternalGraphQL.g:4452:2: ( ruleDirectiveDefinition )
            {
            // InternalGraphQL.g:4452:2: ( ruleDirectiveDefinition )
            // InternalGraphQL.g:4453:3: ruleDirectiveDefinition
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
    // InternalGraphQL.g:4462:1: rule__SchemaDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__SchemaDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4466:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4467:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4467:2: ( ruleStringValue )
            // InternalGraphQL.g:4468:3: ruleStringValue
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
    // InternalGraphQL.g:4477:1: rule__SchemaDefinition__TypeDefinitionsAssignment_3 : ( ruleRootOperationTypeDefinition ) ;
    public final void rule__SchemaDefinition__TypeDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4481:1: ( ( ruleRootOperationTypeDefinition ) )
            // InternalGraphQL.g:4482:2: ( ruleRootOperationTypeDefinition )
            {
            // InternalGraphQL.g:4482:2: ( ruleRootOperationTypeDefinition )
            // InternalGraphQL.g:4483:3: ruleRootOperationTypeDefinition
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
    // InternalGraphQL.g:4492:1: rule__RootOperationTypeDefinition__OperationTypeAssignment_0 : ( ruleOperationType ) ;
    public final void rule__RootOperationTypeDefinition__OperationTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4496:1: ( ( ruleOperationType ) )
            // InternalGraphQL.g:4497:2: ( ruleOperationType )
            {
            // InternalGraphQL.g:4497:2: ( ruleOperationType )
            // InternalGraphQL.g:4498:3: ruleOperationType
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
    // InternalGraphQL.g:4507:1: rule__RootOperationTypeDefinition__TypeAssignment_2 : ( ( RULE_NAME ) ) ;
    public final void rule__RootOperationTypeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4511:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:4512:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:4512:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4513:3: ( RULE_NAME )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0()); 
            // InternalGraphQL.g:4514:3: ( RULE_NAME )
            // InternalGraphQL.g:4515:4: RULE_NAME
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
    // InternalGraphQL.g:4526:1: rule__ScalarTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__ScalarTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4530:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4531:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4531:2: ( ruleStringValue )
            // InternalGraphQL.g:4532:3: ruleStringValue
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
    // InternalGraphQL.g:4541:1: rule__ScalarTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__ScalarTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4545:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4546:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4546:2: ( RULE_NAME )
            // InternalGraphQL.g:4547:3: RULE_NAME
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


    // $ANTLR start "rule__ObjectTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4556:1: rule__ObjectTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__ObjectTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4560:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4561:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4561:2: ( ruleStringValue )
            // InternalGraphQL.g:4562:3: ruleStringValue
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
    // InternalGraphQL.g:4571:1: rule__ObjectTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__ObjectTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4575:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4576:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4576:2: ( RULE_NAME )
            // InternalGraphQL.g:4577:3: RULE_NAME
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


    // $ANTLR start "rule__ObjectTypeDefinition__ImplementsAssignment_3_1"
    // InternalGraphQL.g:4586:1: rule__ObjectTypeDefinition__ImplementsAssignment_3_1 : ( ruleIntersectionType ) ;
    public final void rule__ObjectTypeDefinition__ImplementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4590:1: ( ( ruleIntersectionType ) )
            // InternalGraphQL.g:4591:2: ( ruleIntersectionType )
            {
            // InternalGraphQL.g:4591:2: ( ruleIntersectionType )
            // InternalGraphQL.g:4592:3: ruleIntersectionType
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsIntersectionTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntersectionType();

            state._fsp--;

             after(grammarAccess.getObjectTypeDefinitionAccess().getImplementsIntersectionTypeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ObjectTypeDefinition__ImplementsAssignment_3_1"


    // $ANTLR start "rule__ObjectTypeDefinition__DirectivesAssignment_4"
    // InternalGraphQL.g:4601:1: rule__ObjectTypeDefinition__DirectivesAssignment_4 : ( ruleDirective ) ;
    public final void rule__ObjectTypeDefinition__DirectivesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4605:1: ( ( ruleDirective ) )
            // InternalGraphQL.g:4606:2: ( ruleDirective )
            {
            // InternalGraphQL.g:4606:2: ( ruleDirective )
            // InternalGraphQL.g:4607:3: ruleDirective
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
    // InternalGraphQL.g:4616:1: rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1 : ( ruleFieldDefinition ) ;
    public final void rule__ObjectTypeDefinition__FieldDefinitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4620:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:4621:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:4621:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:4622:3: ruleFieldDefinition
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
    // InternalGraphQL.g:4631:1: rule__InterfaceDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InterfaceDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4635:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4636:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4636:2: ( ruleStringValue )
            // InternalGraphQL.g:4637:3: ruleStringValue
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
    // InternalGraphQL.g:4646:1: rule__InterfaceDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__InterfaceDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4650:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4651:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4651:2: ( RULE_NAME )
            // InternalGraphQL.g:4652:3: RULE_NAME
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


    // $ANTLR start "rule__InterfaceDefinition__ImplementsAssignment_3_1"
    // InternalGraphQL.g:4661:1: rule__InterfaceDefinition__ImplementsAssignment_3_1 : ( ruleIntersectionType ) ;
    public final void rule__InterfaceDefinition__ImplementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4665:1: ( ( ruleIntersectionType ) )
            // InternalGraphQL.g:4666:2: ( ruleIntersectionType )
            {
            // InternalGraphQL.g:4666:2: ( ruleIntersectionType )
            // InternalGraphQL.g:4667:3: ruleIntersectionType
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsIntersectionTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntersectionType();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getImplementsIntersectionTypeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__InterfaceDefinition__ImplementsAssignment_3_1"


    // $ANTLR start "rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1"
    // InternalGraphQL.g:4676:1: rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 : ( ruleFieldDefinition ) ;
    public final void rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4680:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:4681:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:4681:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:4682:3: ruleFieldDefinition
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDefinition();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1"


    // $ANTLR start "rule__FieldDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4691:1: rule__FieldDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__FieldDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4695:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4696:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4696:2: ( ruleStringValue )
            // InternalGraphQL.g:4697:3: ruleStringValue
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
    // InternalGraphQL.g:4706:1: rule__FieldDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__FieldDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4710:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4711:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4711:2: ( RULE_NAME )
            // InternalGraphQL.g:4712:3: RULE_NAME
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


    // $ANTLR start "rule__FieldDefinition__ArgumentsAssignment_2"
    // InternalGraphQL.g:4721:1: rule__FieldDefinition__ArgumentsAssignment_2 : ( ruleArgumentsDefinition ) ;
    public final void rule__FieldDefinition__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4725:1: ( ( ruleArgumentsDefinition ) )
            // InternalGraphQL.g:4726:2: ( ruleArgumentsDefinition )
            {
            // InternalGraphQL.g:4726:2: ( ruleArgumentsDefinition )
            // InternalGraphQL.g:4727:3: ruleArgumentsDefinition
            {
             before(grammarAccess.getFieldDefinitionAccess().getArgumentsArgumentsDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgumentsDefinition();

            state._fsp--;

             after(grammarAccess.getFieldDefinitionAccess().getArgumentsArgumentsDefinitionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FieldDefinition__ArgumentsAssignment_2"


    // $ANTLR start "rule__FieldDefinition__TypeAssignment_4"
    // InternalGraphQL.g:4736:1: rule__FieldDefinition__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__FieldDefinition__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4740:1: ( ( ruleType ) )
            // InternalGraphQL.g:4741:2: ( ruleType )
            {
            // InternalGraphQL.g:4741:2: ( ruleType )
            // InternalGraphQL.g:4742:3: ruleType
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
    // InternalGraphQL.g:4751:1: rule__UnionTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__UnionTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4755:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4756:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4756:2: ( ruleStringValue )
            // InternalGraphQL.g:4757:3: ruleStringValue
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
    // InternalGraphQL.g:4766:1: rule__UnionTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__UnionTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4770:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4771:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4771:2: ( RULE_NAME )
            // InternalGraphQL.g:4772:3: RULE_NAME
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


    // $ANTLR start "rule__UnionTypeDefinition__MemberTypesAssignment_3_2"
    // InternalGraphQL.g:4781:1: rule__UnionTypeDefinition__MemberTypesAssignment_3_2 : ( ruleType ) ;
    public final void rule__UnionTypeDefinition__MemberTypesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4785:1: ( ( ruleType ) )
            // InternalGraphQL.g:4786:2: ( ruleType )
            {
            // InternalGraphQL.g:4786:2: ( ruleType )
            // InternalGraphQL.g:4787:3: ruleType
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__UnionTypeDefinition__MemberTypesAssignment_3_2"


    // $ANTLR start "rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1"
    // InternalGraphQL.g:4796:1: rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1 : ( ruleType ) ;
    public final void rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4800:1: ( ( ruleType ) )
            // InternalGraphQL.g:4801:2: ( ruleType )
            {
            // InternalGraphQL.g:4801:2: ( ruleType )
            // InternalGraphQL.g:4802:3: ruleType
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__UnionTypeDefinition__MemberTypesAssignment_3_3_1"


    // $ANTLR start "rule__EnumTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4811:1: rule__EnumTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__EnumTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4815:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4816:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4816:2: ( ruleStringValue )
            // InternalGraphQL.g:4817:3: ruleStringValue
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
    // InternalGraphQL.g:4826:1: rule__EnumTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__EnumTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4830:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4831:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4831:2: ( RULE_NAME )
            // InternalGraphQL.g:4832:3: RULE_NAME
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


    // $ANTLR start "rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1"
    // InternalGraphQL.g:4841:1: rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 : ( ruleEnumValueDefinition ) ;
    public final void rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4845:1: ( ( ruleEnumValueDefinition ) )
            // InternalGraphQL.g:4846:2: ( ruleEnumValueDefinition )
            {
            // InternalGraphQL.g:4846:2: ( ruleEnumValueDefinition )
            // InternalGraphQL.g:4847:3: ruleEnumValueDefinition
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValueDefinition();

            state._fsp--;

             after(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1"


    // $ANTLR start "rule__EnumValueDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4856:1: rule__EnumValueDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__EnumValueDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4860:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4861:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4861:2: ( ruleStringValue )
            // InternalGraphQL.g:4862:3: ruleStringValue
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
    // InternalGraphQL.g:4871:1: rule__EnumValueDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__EnumValueDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4875:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4876:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4876:2: ( RULE_NAME )
            // InternalGraphQL.g:4877:3: RULE_NAME
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
    // InternalGraphQL.g:4886:1: rule__InputObjectTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InputObjectTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4890:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4891:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4891:2: ( ruleStringValue )
            // InternalGraphQL.g:4892:3: ruleStringValue
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
    // InternalGraphQL.g:4901:1: rule__InputObjectTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__InputObjectTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4905:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4906:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4906:2: ( RULE_NAME )
            // InternalGraphQL.g:4907:3: RULE_NAME
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


    // $ANTLR start "rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1"
    // InternalGraphQL.g:4916:1: rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 : ( ruleInputValueDefinition ) ;
    public final void rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4920:1: ( ( ruleInputValueDefinition ) )
            // InternalGraphQL.g:4921:2: ( ruleInputValueDefinition )
            {
            // InternalGraphQL.g:4921:2: ( ruleInputValueDefinition )
            // InternalGraphQL.g:4922:3: ruleInputValueDefinition
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputsFieldDefinitionsInputValueDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValueDefinition();

            state._fsp--;

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getInputsFieldDefinitionsInputValueDefinitionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1"


    // $ANTLR start "rule__InputValueDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:4931:1: rule__InputValueDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InputValueDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4935:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:4936:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:4936:2: ( ruleStringValue )
            // InternalGraphQL.g:4937:3: ruleStringValue
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
    // InternalGraphQL.g:4946:1: rule__InputValueDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__InputValueDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4950:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4951:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:4951:2: ( RULE_NAME )
            // InternalGraphQL.g:4952:3: RULE_NAME
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
    // InternalGraphQL.g:4961:1: rule__InputValueDefinition__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__InputValueDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4965:1: ( ( ruleType ) )
            // InternalGraphQL.g:4966:2: ( ruleType )
            {
            // InternalGraphQL.g:4966:2: ( ruleType )
            // InternalGraphQL.g:4967:3: ruleType
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
    // InternalGraphQL.g:4976:1: rule__InputValueDefinition__DefaultValueAssignment_4_1 : ( ruleConstValue ) ;
    public final void rule__InputValueDefinition__DefaultValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4980:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:4981:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:4981:2: ( ruleConstValue )
            // InternalGraphQL.g:4982:3: ruleConstValue
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


    // $ANTLR start "rule__IntersectionType__MemberTypesAssignment_1"
    // InternalGraphQL.g:4991:1: rule__IntersectionType__MemberTypesAssignment_1 : ( ruleType ) ;
    public final void rule__IntersectionType__MemberTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4995:1: ( ( ruleType ) )
            // InternalGraphQL.g:4996:2: ( ruleType )
            {
            // InternalGraphQL.g:4996:2: ( ruleType )
            // InternalGraphQL.g:4997:3: ruleType
            {
             before(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IntersectionType__MemberTypesAssignment_1"


    // $ANTLR start "rule__IntersectionType__MemberTypesAssignment_2_1"
    // InternalGraphQL.g:5006:1: rule__IntersectionType__MemberTypesAssignment_2_1 : ( ruleType ) ;
    public final void rule__IntersectionType__MemberTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5010:1: ( ( ruleType ) )
            // InternalGraphQL.g:5011:2: ( ruleType )
            {
            // InternalGraphQL.g:5011:2: ( ruleType )
            // InternalGraphQL.g:5012:3: ruleType
            {
             before(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__IntersectionType__MemberTypesAssignment_2_1"


    // $ANTLR start "rule__NamedType__TypeDefinitionAssignment_0"
    // InternalGraphQL.g:5021:1: rule__NamedType__TypeDefinitionAssignment_0 : ( ( RULE_NAME ) ) ;
    public final void rule__NamedType__TypeDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5025:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:5026:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:5026:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5027:3: ( RULE_NAME )
            {
             before(grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:5028:3: ( RULE_NAME )
            // InternalGraphQL.g:5029:4: RULE_NAME
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
    // InternalGraphQL.g:5040:1: rule__NamedType__NonNullAssignment_1 : ( ( '!' ) ) ;
    public final void rule__NamedType__NonNullAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5044:1: ( ( ( '!' ) ) )
            // InternalGraphQL.g:5045:2: ( ( '!' ) )
            {
            // InternalGraphQL.g:5045:2: ( ( '!' ) )
            // InternalGraphQL.g:5046:3: ( '!' )
            {
             before(grammarAccess.getNamedTypeAccess().getNonNullExclamationMarkKeyword_1_0()); 
            // InternalGraphQL.g:5047:3: ( '!' )
            // InternalGraphQL.g:5048:4: '!'
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
    // InternalGraphQL.g:5059:1: rule__ListType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__ListType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5063:1: ( ( ruleType ) )
            // InternalGraphQL.g:5064:2: ( ruleType )
            {
            // InternalGraphQL.g:5064:2: ( ruleType )
            // InternalGraphQL.g:5065:3: ruleType
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
    // InternalGraphQL.g:5074:1: rule__ListType__NonNullAssignment_3 : ( ( '!' ) ) ;
    public final void rule__ListType__NonNullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5078:1: ( ( ( '!' ) ) )
            // InternalGraphQL.g:5079:2: ( ( '!' ) )
            {
            // InternalGraphQL.g:5079:2: ( ( '!' ) )
            // InternalGraphQL.g:5080:3: ( '!' )
            {
             before(grammarAccess.getListTypeAccess().getNonNullExclamationMarkKeyword_3_0()); 
            // InternalGraphQL.g:5081:3: ( '!' )
            // InternalGraphQL.g:5082:4: '!'
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
    // InternalGraphQL.g:5093:1: rule__IntValue__ValueAssignment : ( RULE_INT_VALUE ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5097:1: ( ( RULE_INT_VALUE ) )
            // InternalGraphQL.g:5098:2: ( RULE_INT_VALUE )
            {
            // InternalGraphQL.g:5098:2: ( RULE_INT_VALUE )
            // InternalGraphQL.g:5099:3: RULE_INT_VALUE
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
    // InternalGraphQL.g:5108:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT_VALUE ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5112:1: ( ( RULE_FLOAT_VALUE ) )
            // InternalGraphQL.g:5113:2: ( RULE_FLOAT_VALUE )
            {
            // InternalGraphQL.g:5113:2: ( RULE_FLOAT_VALUE )
            // InternalGraphQL.g:5114:3: RULE_FLOAT_VALUE
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
    // InternalGraphQL.g:5123:1: rule__NullValue__ValueAssignment : ( ( 'null' ) ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5127:1: ( ( ( 'null' ) ) )
            // InternalGraphQL.g:5128:2: ( ( 'null' ) )
            {
            // InternalGraphQL.g:5128:2: ( ( 'null' ) )
            // InternalGraphQL.g:5129:3: ( 'null' )
            {
             before(grammarAccess.getNullValueAccess().getValueNullKeyword_0()); 
            // InternalGraphQL.g:5130:3: ( 'null' )
            // InternalGraphQL.g:5131:4: 'null'
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
    // InternalGraphQL.g:5142:1: rule__StringValue__ValueAssignment : ( ( rule__StringValue__ValueAlternatives_0 ) ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5146:1: ( ( ( rule__StringValue__ValueAlternatives_0 ) ) )
            // InternalGraphQL.g:5147:2: ( ( rule__StringValue__ValueAlternatives_0 ) )
            {
            // InternalGraphQL.g:5147:2: ( ( rule__StringValue__ValueAlternatives_0 ) )
            // InternalGraphQL.g:5148:3: ( rule__StringValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getStringValueAccess().getValueAlternatives_0()); 
            // InternalGraphQL.g:5149:3: ( rule__StringValue__ValueAlternatives_0 )
            // InternalGraphQL.g:5149:4: rule__StringValue__ValueAlternatives_0
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
    // InternalGraphQL.g:5157:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5161:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // InternalGraphQL.g:5162:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // InternalGraphQL.g:5162:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // InternalGraphQL.g:5163:3: ( rule__BooleanValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            // InternalGraphQL.g:5164:3: ( rule__BooleanValue__ValueAlternatives_0 )
            // InternalGraphQL.g:5164:4: rule__BooleanValue__ValueAlternatives_0
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
    // InternalGraphQL.g:5172:1: rule__EnumValue__ValueAssignment : ( ( RULE_NAME ) ) ;
    public final void rule__EnumValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5176:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:5177:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:5177:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5178:3: ( RULE_NAME )
            {
             before(grammarAccess.getEnumValueAccess().getValueEnumValueDefinitionCrossReference_0()); 
            // InternalGraphQL.g:5179:3: ( RULE_NAME )
            // InternalGraphQL.g:5180:4: RULE_NAME
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
    // InternalGraphQL.g:5191:1: rule__ObjectValue__FieldsAssignment_2 : ( ruleObjectField ) ;
    public final void rule__ObjectValue__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5195:1: ( ( ruleObjectField ) )
            // InternalGraphQL.g:5196:2: ( ruleObjectField )
            {
            // InternalGraphQL.g:5196:2: ( ruleObjectField )
            // InternalGraphQL.g:5197:3: ruleObjectField
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


    // $ANTLR start "rule__ObjectField__NameAssignment_0"
    // InternalGraphQL.g:5206:1: rule__ObjectField__NameAssignment_0 : ( ( RULE_NAME ) ) ;
    public final void rule__ObjectField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5210:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:5211:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:5211:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5212:3: ( RULE_NAME )
            {
             before(grammarAccess.getObjectFieldAccess().getNameFieldDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:5213:3: ( RULE_NAME )
            // InternalGraphQL.g:5214:4: RULE_NAME
            {
             before(grammarAccess.getObjectFieldAccess().getNameFieldDefinitionNAMETerminalRuleCall_0_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getObjectFieldAccess().getNameFieldDefinitionNAMETerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjectFieldAccess().getNameFieldDefinitionCrossReference_0_0()); 

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
    // $ANTLR end "rule__ObjectField__NameAssignment_0"


    // $ANTLR start "rule__ObjectField__ValueAssignment_2"
    // InternalGraphQL.g:5225:1: rule__ObjectField__ValueAssignment_2 : ( ruleConstValue ) ;
    public final void rule__ObjectField__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5229:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:5230:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:5230:2: ( ruleConstValue )
            // InternalGraphQL.g:5231:3: ruleConstValue
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
    // InternalGraphQL.g:5240:1: rule__ListValue__ValuesAssignment_2 : ( ruleConstValue ) ;
    public final void rule__ListValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5244:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:5245:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:5245:2: ( ruleConstValue )
            // InternalGraphQL.g:5246:3: ruleConstValue
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
    // InternalGraphQL.g:5255:1: rule__DirectiveDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__DirectiveDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5259:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:5260:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:5260:2: ( ruleStringValue )
            // InternalGraphQL.g:5261:3: ruleStringValue
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
    // InternalGraphQL.g:5270:1: rule__DirectiveDefinition__NameAssignment_2 : ( RULE_DIRECTIVE_NAME ) ;
    public final void rule__DirectiveDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5274:1: ( ( RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:5275:2: ( RULE_DIRECTIVE_NAME )
            {
            // InternalGraphQL.g:5275:2: ( RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:5276:3: RULE_DIRECTIVE_NAME
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


    // $ANTLR start "rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3"
    // InternalGraphQL.g:5285:1: rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3 : ( ruleArgumentsDefinition ) ;
    public final void rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5289:1: ( ( ruleArgumentsDefinition ) )
            // InternalGraphQL.g:5290:2: ( ruleArgumentsDefinition )
            {
            // InternalGraphQL.g:5290:2: ( ruleArgumentsDefinition )
            // InternalGraphQL.g:5291:3: ruleArgumentsDefinition
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getArgumentDefinitionsArgumentsDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArgumentsDefinition();

            state._fsp--;

             after(grammarAccess.getDirectiveDefinitionAccess().getArgumentDefinitionsArgumentsDefinitionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DirectiveDefinition__ArgumentDefinitionsAssignment_3"


    // $ANTLR start "rule__DirectiveDefinition__RepeatableAssignment_4"
    // InternalGraphQL.g:5300:1: rule__DirectiveDefinition__RepeatableAssignment_4 : ( ( 'repeatable' ) ) ;
    public final void rule__DirectiveDefinition__RepeatableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5304:1: ( ( ( 'repeatable' ) ) )
            // InternalGraphQL.g:5305:2: ( ( 'repeatable' ) )
            {
            // InternalGraphQL.g:5305:2: ( ( 'repeatable' ) )
            // InternalGraphQL.g:5306:3: ( 'repeatable' )
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getRepeatableRepeatableKeyword_4_0()); 
            // InternalGraphQL.g:5307:3: ( 'repeatable' )
            // InternalGraphQL.g:5308:4: 'repeatable'
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


    // $ANTLR start "rule__DirectiveDefinition__DirectiveLocationsAssignment_6"
    // InternalGraphQL.g:5319:1: rule__DirectiveDefinition__DirectiveLocationsAssignment_6 : ( ruleDirectiveLocations ) ;
    public final void rule__DirectiveDefinition__DirectiveLocationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5323:1: ( ( ruleDirectiveLocations ) )
            // InternalGraphQL.g:5324:2: ( ruleDirectiveLocations )
            {
            // InternalGraphQL.g:5324:2: ( ruleDirectiveLocations )
            // InternalGraphQL.g:5325:3: ruleDirectiveLocations
            {
             before(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectiveLocations();

            state._fsp--;

             after(grammarAccess.getDirectiveDefinitionAccess().getDirectiveLocationsDirectiveLocationsParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DirectiveDefinition__DirectiveLocationsAssignment_6"


    // $ANTLR start "rule__Directive__NameAssignment_0"
    // InternalGraphQL.g:5334:1: rule__Directive__NameAssignment_0 : ( RULE_DIRECTIVE_NAME ) ;
    public final void rule__Directive__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5338:1: ( ( RULE_DIRECTIVE_NAME ) )
            // InternalGraphQL.g:5339:2: ( RULE_DIRECTIVE_NAME )
            {
            // InternalGraphQL.g:5339:2: ( RULE_DIRECTIVE_NAME )
            // InternalGraphQL.g:5340:3: RULE_DIRECTIVE_NAME
            {
             before(grammarAccess.getDirectiveAccess().getNameDIRECTIVE_NAMETerminalRuleCall_0_0()); 
            match(input,RULE_DIRECTIVE_NAME,FOLLOW_2); 
             after(grammarAccess.getDirectiveAccess().getNameDIRECTIVE_NAMETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Directive__NameAssignment_0"


    // $ANTLR start "rule__Directive__ArgumentsAssignment_1"
    // InternalGraphQL.g:5349:1: rule__Directive__ArgumentsAssignment_1 : ( ruleArguments ) ;
    public final void rule__Directive__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5353:1: ( ( ruleArguments ) )
            // InternalGraphQL.g:5354:2: ( ruleArguments )
            {
            // InternalGraphQL.g:5354:2: ( ruleArguments )
            // InternalGraphQL.g:5355:3: ruleArguments
            {
             before(grammarAccess.getDirectiveAccess().getArgumentsArgumentsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getDirectiveAccess().getArgumentsArgumentsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Directive__ArgumentsAssignment_1"


    // $ANTLR start "rule__Arguments__ArgumentsAssignment_2"
    // InternalGraphQL.g:5364:1: rule__Arguments__ArgumentsAssignment_2 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5368:1: ( ( ruleArgument ) )
            // InternalGraphQL.g:5369:2: ( ruleArgument )
            {
            // InternalGraphQL.g:5369:2: ( ruleArgument )
            // InternalGraphQL.g:5370:3: ruleArgument
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Arguments__ArgumentsAssignment_2"


    // $ANTLR start "rule__Argument__ArgumentDefinitionAssignment_0"
    // InternalGraphQL.g:5379:1: rule__Argument__ArgumentDefinitionAssignment_0 : ( ( RULE_NAME ) ) ;
    public final void rule__Argument__ArgumentDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5383:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:5384:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:5384:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:5385:3: ( RULE_NAME )
            {
             before(grammarAccess.getArgumentAccess().getArgumentDefinitionInputValueDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:5386:3: ( RULE_NAME )
            // InternalGraphQL.g:5387:4: RULE_NAME
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
    // InternalGraphQL.g:5398:1: rule__Argument__ValueAssignment_2 : ( ruleConstValue ) ;
    public final void rule__Argument__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5402:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:5403:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:5403:2: ( ruleConstValue )
            // InternalGraphQL.g:5404:3: ruleConstValue
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


    // $ANTLR start "rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2"
    // InternalGraphQL.g:5413:1: rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2 : ( ruleInputValueDefinition ) ;
    public final void rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5417:1: ( ( ruleInputValueDefinition ) )
            // InternalGraphQL.g:5418:2: ( ruleInputValueDefinition )
            {
            // InternalGraphQL.g:5418:2: ( ruleInputValueDefinition )
            // InternalGraphQL.g:5419:3: ruleInputValueDefinition
            {
             before(grammarAccess.getArgumentsDefinitionAccess().getArgumentDefinitionsInputValueDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValueDefinition();

            state._fsp--;

             after(grammarAccess.getArgumentsDefinitionAccess().getArgumentDefinitionsInputValueDefinitionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ArgumentsDefinition__ArgumentDefinitionsAssignment_2"


    // $ANTLR start "rule__DirectiveLocations__DirectiveLocationsAssignment_1"
    // InternalGraphQL.g:5428:1: rule__DirectiveLocations__DirectiveLocationsAssignment_1 : ( ruleDirectiveLocation ) ;
    public final void rule__DirectiveLocations__DirectiveLocationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5432:1: ( ( ruleDirectiveLocation ) )
            // InternalGraphQL.g:5433:2: ( ruleDirectiveLocation )
            {
            // InternalGraphQL.g:5433:2: ( ruleDirectiveLocation )
            // InternalGraphQL.g:5434:3: ruleDirectiveLocation
            {
             before(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectiveLocation();

            state._fsp--;

             after(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__DirectiveLocations__DirectiveLocationsAssignment_1"


    // $ANTLR start "rule__DirectiveLocations__DirectiveLocationsAssignment_2_1"
    // InternalGraphQL.g:5443:1: rule__DirectiveLocations__DirectiveLocationsAssignment_2_1 : ( ruleDirectiveLocation ) ;
    public final void rule__DirectiveLocations__DirectiveLocationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:5447:1: ( ( ruleDirectiveLocation ) )
            // InternalGraphQL.g:5448:2: ( ruleDirectiveLocation )
            {
            // InternalGraphQL.g:5448:2: ( ruleDirectiveLocation )
            // InternalGraphQL.g:5449:3: ruleDirectiveLocation
            {
             before(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectiveLocation();

            state._fsp--;

             after(grammarAccess.getDirectiveLocationsAccess().getDirectiveLocationsDirectiveLocationEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__DirectiveLocations__DirectiveLocationsAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00466C4000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000108000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0018000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0019000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00066C0000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x081000800000C1F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x083000800000C1F0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x081000800000C1F2L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00466C4000000030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1180000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00010007FFFF0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000070L});

}