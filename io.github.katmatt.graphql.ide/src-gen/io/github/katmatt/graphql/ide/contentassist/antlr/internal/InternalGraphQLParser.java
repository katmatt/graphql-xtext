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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_STRING_VALUE", "RULE_ML_STRING_VALUE", "RULE_NAME", "RULE_INT_VALUE", "RULE_FLOAT_VALUE", "RULE_WS", "RULE_SL_COMMENT", "RULE_COMMA", "RULE_STRING_CHARACTER", "'true'", "'false'", "'query'", "'mutation'", "'subscription'", "'schema'", "'{'", "'}'", "':'", "'scalar'", "'type'", "'implements'", "'interface'", "'union'", "'='", "'|'", "'enum'", "'input'", "'&'", "'['", "']'", "'!'", "'null'"
    };
    public static final int RULE_FLOAT_VALUE=8;
    public static final int RULE_STRING_CHARACTER=12;
    public static final int RULE_NAME=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_SL_STRING_VALUE=4;
    public static final int RULE_INT_VALUE=7;
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

                if ( ((LA1_0>=RULE_SL_STRING_VALUE && LA1_0<=RULE_ML_STRING_VALUE)||LA1_0==18||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=25 && LA1_0<=26)||(LA1_0>=29 && LA1_0<=30)) ) {
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


    // $ANTLR start "ruleOperationType"
    // InternalGraphQL.g:728:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:732:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalGraphQL.g:733:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalGraphQL.g:733:2: ( ( rule__OperationType__Alternatives ) )
            // InternalGraphQL.g:734:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalGraphQL.g:735:3: ( rule__OperationType__Alternatives )
            // InternalGraphQL.g:735:4: rule__OperationType__Alternatives
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
    // InternalGraphQL.g:743:1: rule__TypeSystemDefinition__Alternatives : ( ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) ) | ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) ) );
    public final void rule__TypeSystemDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:747:1: ( ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) ) | ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_SL_STRING_VALUE:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=22 && LA2_1<=23)||(LA2_1>=25 && LA2_1<=26)||(LA2_1>=29 && LA2_1<=30)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==18) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ML_STRING_VALUE:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=22 && LA2_2<=23)||(LA2_2>=25 && LA2_2<=26)||(LA2_2>=29 && LA2_2<=30)) ) {
                    alt2=2;
                }
                else if ( (LA2_2==18) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt2=1;
                }
                break;
            case 22:
            case 23:
            case 25:
            case 26:
            case 29:
            case 30:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGraphQL.g:748:2: ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) )
                    {
                    // InternalGraphQL.g:748:2: ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) )
                    // InternalGraphQL.g:749:3: ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsAssignment_0()); 
                    // InternalGraphQL.g:750:3: ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 )
                    // InternalGraphQL.g:750:4: rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0
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
                    // InternalGraphQL.g:754:2: ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) )
                    {
                    // InternalGraphQL.g:754:2: ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) )
                    // InternalGraphQL.g:755:3: ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsAssignment_1()); 
                    // InternalGraphQL.g:756:3: ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 )
                    // InternalGraphQL.g:756:4: rule__TypeSystemDefinition__TypeDefinitionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSystemDefinition__TypeDefinitionsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsAssignment_1()); 

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
    // InternalGraphQL.g:764:1: rule__TypeDefinition__Alternatives : ( ( ruleScalarTypeDefinition ) | ( ruleObjectTypeDefinition ) | ( ruleInterfaceDefinition ) | ( ruleUnionTypeDefinition ) | ( ruleEnumTypeDefinition ) | ( ruleInputObjectTypeDefinition ) );
    public final void rule__TypeDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:768:1: ( ( ruleScalarTypeDefinition ) | ( ruleObjectTypeDefinition ) | ( ruleInterfaceDefinition ) | ( ruleUnionTypeDefinition ) | ( ruleEnumTypeDefinition ) | ( ruleInputObjectTypeDefinition ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_SL_STRING_VALUE:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                    {
                    alt3=4;
                    }
                    break;
                case 25:
                    {
                    alt3=3;
                    }
                    break;
                case 30:
                    {
                    alt3=6;
                    }
                    break;
                case 29:
                    {
                    alt3=5;
                    }
                    break;
                case 23:
                    {
                    alt3=2;
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
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                    {
                    alt3=4;
                    }
                    break;
                case 25:
                    {
                    alt3=3;
                    }
                    break;
                case 30:
                    {
                    alt3=6;
                    }
                    break;
                case 29:
                    {
                    alt3=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            case 30:
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
                    // InternalGraphQL.g:769:2: ( ruleScalarTypeDefinition )
                    {
                    // InternalGraphQL.g:769:2: ( ruleScalarTypeDefinition )
                    // InternalGraphQL.g:770:3: ruleScalarTypeDefinition
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
                    // InternalGraphQL.g:775:2: ( ruleObjectTypeDefinition )
                    {
                    // InternalGraphQL.g:775:2: ( ruleObjectTypeDefinition )
                    // InternalGraphQL.g:776:3: ruleObjectTypeDefinition
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
                    // InternalGraphQL.g:781:2: ( ruleInterfaceDefinition )
                    {
                    // InternalGraphQL.g:781:2: ( ruleInterfaceDefinition )
                    // InternalGraphQL.g:782:3: ruleInterfaceDefinition
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
                    // InternalGraphQL.g:787:2: ( ruleUnionTypeDefinition )
                    {
                    // InternalGraphQL.g:787:2: ( ruleUnionTypeDefinition )
                    // InternalGraphQL.g:788:3: ruleUnionTypeDefinition
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
                    // InternalGraphQL.g:793:2: ( ruleEnumTypeDefinition )
                    {
                    // InternalGraphQL.g:793:2: ( ruleEnumTypeDefinition )
                    // InternalGraphQL.g:794:3: ruleEnumTypeDefinition
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
                    // InternalGraphQL.g:799:2: ( ruleInputObjectTypeDefinition )
                    {
                    // InternalGraphQL.g:799:2: ( ruleInputObjectTypeDefinition )
                    // InternalGraphQL.g:800:3: ruleInputObjectTypeDefinition
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
    // InternalGraphQL.g:809:1: rule__Type__Alternatives : ( ( ruleNamedType ) | ( ruleListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:813:1: ( ( ruleNamedType ) | ( ruleListType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphQL.g:814:2: ( ruleNamedType )
                    {
                    // InternalGraphQL.g:814:2: ( ruleNamedType )
                    // InternalGraphQL.g:815:3: ruleNamedType
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
                    // InternalGraphQL.g:820:2: ( ruleListType )
                    {
                    // InternalGraphQL.g:820:2: ( ruleListType )
                    // InternalGraphQL.g:821:3: ruleListType
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
    // InternalGraphQL.g:830:1: rule__StringValue__ValueAlternatives_0 : ( ( RULE_SL_STRING_VALUE ) | ( RULE_ML_STRING_VALUE ) );
    public final void rule__StringValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:834:1: ( ( RULE_SL_STRING_VALUE ) | ( RULE_ML_STRING_VALUE ) )
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
                    // InternalGraphQL.g:835:2: ( RULE_SL_STRING_VALUE )
                    {
                    // InternalGraphQL.g:835:2: ( RULE_SL_STRING_VALUE )
                    // InternalGraphQL.g:836:3: RULE_SL_STRING_VALUE
                    {
                     before(grammarAccess.getStringValueAccess().getValueSL_STRING_VALUETerminalRuleCall_0_0()); 
                    match(input,RULE_SL_STRING_VALUE,FOLLOW_2); 
                     after(grammarAccess.getStringValueAccess().getValueSL_STRING_VALUETerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:841:2: ( RULE_ML_STRING_VALUE )
                    {
                    // InternalGraphQL.g:841:2: ( RULE_ML_STRING_VALUE )
                    // InternalGraphQL.g:842:3: RULE_ML_STRING_VALUE
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
    // InternalGraphQL.g:851:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:855:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphQL.g:856:2: ( 'true' )
                    {
                    // InternalGraphQL.g:856:2: ( 'true' )
                    // InternalGraphQL.g:857:3: 'true'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:862:2: ( 'false' )
                    {
                    // InternalGraphQL.g:862:2: ( 'false' )
                    // InternalGraphQL.g:863:3: 'false'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalGraphQL.g:872:1: rule__ConstValue__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleEnumValue ) | ( ruleListValue ) | ( ruleObjectValue ) );
    public final void rule__ConstValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:876:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleEnumValue ) | ( ruleListValue ) | ( ruleObjectValue ) )
            int alt7=7;
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
            case 13:
            case 14:
                {
                alt7=3;
                }
                break;
            case 35:
                {
                alt7=4;
                }
                break;
            case RULE_NAME:
                {
                alt7=5;
                }
                break;
            case 32:
                {
                alt7=6;
                }
                break;
            case 19:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGraphQL.g:877:2: ( ruleIntValue )
                    {
                    // InternalGraphQL.g:877:2: ( ruleIntValue )
                    // InternalGraphQL.g:878:3: ruleIntValue
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
                    // InternalGraphQL.g:883:2: ( ruleFloatValue )
                    {
                    // InternalGraphQL.g:883:2: ( ruleFloatValue )
                    // InternalGraphQL.g:884:3: ruleFloatValue
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
                    // InternalGraphQL.g:889:2: ( ruleBooleanValue )
                    {
                    // InternalGraphQL.g:889:2: ( ruleBooleanValue )
                    // InternalGraphQL.g:890:3: ruleBooleanValue
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
                    // InternalGraphQL.g:895:2: ( ruleNullValue )
                    {
                    // InternalGraphQL.g:895:2: ( ruleNullValue )
                    // InternalGraphQL.g:896:3: ruleNullValue
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
                    // InternalGraphQL.g:901:2: ( ruleEnumValue )
                    {
                    // InternalGraphQL.g:901:2: ( ruleEnumValue )
                    // InternalGraphQL.g:902:3: ruleEnumValue
                    {
                     before(grammarAccess.getConstValueAccess().getEnumValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getEnumValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphQL.g:907:2: ( ruleListValue )
                    {
                    // InternalGraphQL.g:907:2: ( ruleListValue )
                    // InternalGraphQL.g:908:3: ruleListValue
                    {
                     before(grammarAccess.getConstValueAccess().getListValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleListValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getListValueParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphQL.g:913:2: ( ruleObjectValue )
                    {
                    // InternalGraphQL.g:913:2: ( ruleObjectValue )
                    // InternalGraphQL.g:914:3: ruleObjectValue
                    {
                     before(grammarAccess.getConstValueAccess().getObjectValueParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectValue();

                    state._fsp--;

                     after(grammarAccess.getConstValueAccess().getObjectValueParserRuleCall_6()); 

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


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalGraphQL.g:923:1: rule__OperationType__Alternatives : ( ( ( 'query' ) ) | ( ( 'mutation' ) ) | ( ( 'subscription' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:927:1: ( ( ( 'query' ) ) | ( ( 'mutation' ) ) | ( ( 'subscription' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGraphQL.g:928:2: ( ( 'query' ) )
                    {
                    // InternalGraphQL.g:928:2: ( ( 'query' ) )
                    // InternalGraphQL.g:929:3: ( 'query' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0()); 
                    // InternalGraphQL.g:930:3: ( 'query' )
                    // InternalGraphQL.g:930:4: 'query'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:934:2: ( ( 'mutation' ) )
                    {
                    // InternalGraphQL.g:934:2: ( ( 'mutation' ) )
                    // InternalGraphQL.g:935:3: ( 'mutation' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1()); 
                    // InternalGraphQL.g:936:3: ( 'mutation' )
                    // InternalGraphQL.g:936:4: 'mutation'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:940:2: ( ( 'subscription' ) )
                    {
                    // InternalGraphQL.g:940:2: ( ( 'subscription' ) )
                    // InternalGraphQL.g:941:3: ( 'subscription' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 
                    // InternalGraphQL.g:942:3: ( 'subscription' )
                    // InternalGraphQL.g:942:4: 'subscription'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalGraphQL.g:950:1: rule__SchemaDefinition__Group__0 : rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1 ;
    public final void rule__SchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:954:1: ( rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1 )
            // InternalGraphQL.g:955:2: rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1
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
    // InternalGraphQL.g:962:1: rule__SchemaDefinition__Group__0__Impl : ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__SchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:966:1: ( ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:967:1: ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:967:1: ( ( rule__SchemaDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:968:2: ( rule__SchemaDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getSchemaDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:969:2: ( rule__SchemaDefinition__DescriptionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_SL_STRING_VALUE && LA9_0<=RULE_ML_STRING_VALUE)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphQL.g:969:3: rule__SchemaDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:977:1: rule__SchemaDefinition__Group__1 : rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2 ;
    public final void rule__SchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:981:1: ( rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2 )
            // InternalGraphQL.g:982:2: rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2
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
    // InternalGraphQL.g:989:1: rule__SchemaDefinition__Group__1__Impl : ( 'schema' ) ;
    public final void rule__SchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:993:1: ( ( 'schema' ) )
            // InternalGraphQL.g:994:1: ( 'schema' )
            {
            // InternalGraphQL.g:994:1: ( 'schema' )
            // InternalGraphQL.g:995:2: 'schema'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGraphQL.g:1004:1: rule__SchemaDefinition__Group__2 : rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3 ;
    public final void rule__SchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1008:1: ( rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3 )
            // InternalGraphQL.g:1009:2: rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3
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
    // InternalGraphQL.g:1016:1: rule__SchemaDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1020:1: ( ( '{' ) )
            // InternalGraphQL.g:1021:1: ( '{' )
            {
            // InternalGraphQL.g:1021:1: ( '{' )
            // InternalGraphQL.g:1022:2: '{'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGraphQL.g:1031:1: rule__SchemaDefinition__Group__3 : rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4 ;
    public final void rule__SchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1035:1: ( rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4 )
            // InternalGraphQL.g:1036:2: rule__SchemaDefinition__Group__3__Impl rule__SchemaDefinition__Group__4
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
    // InternalGraphQL.g:1043:1: rule__SchemaDefinition__Group__3__Impl : ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) ) ;
    public final void rule__SchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1047:1: ( ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) ) )
            // InternalGraphQL.g:1048:1: ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) )
            {
            // InternalGraphQL.g:1048:1: ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* ) )
            // InternalGraphQL.g:1049:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* )
            {
            // InternalGraphQL.g:1049:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 ) )
            // InternalGraphQL.g:1050:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 
            // InternalGraphQL.g:1051:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )
            // InternalGraphQL.g:1051:4: rule__SchemaDefinition__TypeDefinitionsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__SchemaDefinition__TypeDefinitionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 

            }

            // InternalGraphQL.g:1054:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )* )
            // InternalGraphQL.g:1055:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )*
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_3()); 
            // InternalGraphQL.g:1056:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=15 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGraphQL.g:1056:4: rule__SchemaDefinition__TypeDefinitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SchemaDefinition__TypeDefinitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalGraphQL.g:1065:1: rule__SchemaDefinition__Group__4 : rule__SchemaDefinition__Group__4__Impl ;
    public final void rule__SchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1069:1: ( rule__SchemaDefinition__Group__4__Impl )
            // InternalGraphQL.g:1070:2: rule__SchemaDefinition__Group__4__Impl
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
    // InternalGraphQL.g:1076:1: rule__SchemaDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1080:1: ( ( '}' ) )
            // InternalGraphQL.g:1081:1: ( '}' )
            {
            // InternalGraphQL.g:1081:1: ( '}' )
            // InternalGraphQL.g:1082:2: '}'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphQL.g:1092:1: rule__RootOperationTypeDefinition__Group__0 : rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1 ;
    public final void rule__RootOperationTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1096:1: ( rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1 )
            // InternalGraphQL.g:1097:2: rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1
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
    // InternalGraphQL.g:1104:1: rule__RootOperationTypeDefinition__Group__0__Impl : ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) ) ;
    public final void rule__RootOperationTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1108:1: ( ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) ) )
            // InternalGraphQL.g:1109:1: ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) )
            {
            // InternalGraphQL.g:1109:1: ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) )
            // InternalGraphQL.g:1110:2: ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeAssignment_0()); 
            // InternalGraphQL.g:1111:2: ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 )
            // InternalGraphQL.g:1111:3: rule__RootOperationTypeDefinition__OperationTypeAssignment_0
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
    // InternalGraphQL.g:1119:1: rule__RootOperationTypeDefinition__Group__1 : rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2 ;
    public final void rule__RootOperationTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1123:1: ( rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2 )
            // InternalGraphQL.g:1124:2: rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2
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
    // InternalGraphQL.g:1131:1: rule__RootOperationTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RootOperationTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1135:1: ( ( ':' ) )
            // InternalGraphQL.g:1136:1: ( ':' )
            {
            // InternalGraphQL.g:1136:1: ( ':' )
            // InternalGraphQL.g:1137:2: ':'
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphQL.g:1146:1: rule__RootOperationTypeDefinition__Group__2 : rule__RootOperationTypeDefinition__Group__2__Impl ;
    public final void rule__RootOperationTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1150:1: ( rule__RootOperationTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:1151:2: rule__RootOperationTypeDefinition__Group__2__Impl
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
    // InternalGraphQL.g:1157:1: rule__RootOperationTypeDefinition__Group__2__Impl : ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__RootOperationTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1161:1: ( ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) ) )
            // InternalGraphQL.g:1162:1: ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) )
            {
            // InternalGraphQL.g:1162:1: ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) )
            // InternalGraphQL.g:1163:2: ( rule__RootOperationTypeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeAssignment_2()); 
            // InternalGraphQL.g:1164:2: ( rule__RootOperationTypeDefinition__TypeAssignment_2 )
            // InternalGraphQL.g:1164:3: rule__RootOperationTypeDefinition__TypeAssignment_2
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
    // InternalGraphQL.g:1173:1: rule__ScalarTypeDefinition__Group__0 : rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1 ;
    public final void rule__ScalarTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1177:1: ( rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1 )
            // InternalGraphQL.g:1178:2: rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1
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
    // InternalGraphQL.g:1185:1: rule__ScalarTypeDefinition__Group__0__Impl : ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ScalarTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1189:1: ( ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1190:1: ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1190:1: ( ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1191:2: ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1192:2: ( rule__ScalarTypeDefinition__DescriptionAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_SL_STRING_VALUE && LA11_0<=RULE_ML_STRING_VALUE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphQL.g:1192:3: rule__ScalarTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1200:1: rule__ScalarTypeDefinition__Group__1 : rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2 ;
    public final void rule__ScalarTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1204:1: ( rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2 )
            // InternalGraphQL.g:1205:2: rule__ScalarTypeDefinition__Group__1__Impl rule__ScalarTypeDefinition__Group__2
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
    // InternalGraphQL.g:1212:1: rule__ScalarTypeDefinition__Group__1__Impl : ( 'scalar' ) ;
    public final void rule__ScalarTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1216:1: ( ( 'scalar' ) )
            // InternalGraphQL.g:1217:1: ( 'scalar' )
            {
            // InternalGraphQL.g:1217:1: ( 'scalar' )
            // InternalGraphQL.g:1218:2: 'scalar'
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGraphQL.g:1227:1: rule__ScalarTypeDefinition__Group__2 : rule__ScalarTypeDefinition__Group__2__Impl ;
    public final void rule__ScalarTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1231:1: ( rule__ScalarTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:1232:2: rule__ScalarTypeDefinition__Group__2__Impl
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
    // InternalGraphQL.g:1238:1: rule__ScalarTypeDefinition__Group__2__Impl : ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__ScalarTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1242:1: ( ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1243:1: ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1243:1: ( ( rule__ScalarTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1244:2: ( rule__ScalarTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1245:2: ( rule__ScalarTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1245:3: rule__ScalarTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:1254:1: rule__ObjectTypeDefinition__Group__0 : rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1 ;
    public final void rule__ObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1258:1: ( rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1 )
            // InternalGraphQL.g:1259:2: rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1
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
    // InternalGraphQL.g:1266:1: rule__ObjectTypeDefinition__Group__0__Impl : ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1270:1: ( ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1271:1: ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1271:1: ( ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1272:2: ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1273:2: ( rule__ObjectTypeDefinition__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_SL_STRING_VALUE && LA12_0<=RULE_ML_STRING_VALUE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphQL.g:1273:3: rule__ObjectTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1281:1: rule__ObjectTypeDefinition__Group__1 : rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2 ;
    public final void rule__ObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1285:1: ( rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2 )
            // InternalGraphQL.g:1286:2: rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2
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
    // InternalGraphQL.g:1293:1: rule__ObjectTypeDefinition__Group__1__Impl : ( 'type' ) ;
    public final void rule__ObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1297:1: ( ( 'type' ) )
            // InternalGraphQL.g:1298:1: ( 'type' )
            {
            // InternalGraphQL.g:1298:1: ( 'type' )
            // InternalGraphQL.g:1299:2: 'type'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGraphQL.g:1308:1: rule__ObjectTypeDefinition__Group__2 : rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3 ;
    public final void rule__ObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1312:1: ( rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3 )
            // InternalGraphQL.g:1313:2: rule__ObjectTypeDefinition__Group__2__Impl rule__ObjectTypeDefinition__Group__3
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
    // InternalGraphQL.g:1320:1: rule__ObjectTypeDefinition__Group__2__Impl : ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__ObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1324:1: ( ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1325:1: ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1325:1: ( ( rule__ObjectTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1326:2: ( rule__ObjectTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1327:2: ( rule__ObjectTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1327:3: rule__ObjectTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:1335:1: rule__ObjectTypeDefinition__Group__3 : rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4 ;
    public final void rule__ObjectTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1339:1: ( rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4 )
            // InternalGraphQL.g:1340:2: rule__ObjectTypeDefinition__Group__3__Impl rule__ObjectTypeDefinition__Group__4
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
    // InternalGraphQL.g:1347:1: rule__ObjectTypeDefinition__Group__3__Impl : ( ( rule__ObjectTypeDefinition__Group_3__0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1351:1: ( ( ( rule__ObjectTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:1352:1: ( ( rule__ObjectTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:1352:1: ( ( rule__ObjectTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:1353:2: ( rule__ObjectTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:1354:2: ( rule__ObjectTypeDefinition__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:1354:3: rule__ObjectTypeDefinition__Group_3__0
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
    // InternalGraphQL.g:1362:1: rule__ObjectTypeDefinition__Group__4 : rule__ObjectTypeDefinition__Group__4__Impl ;
    public final void rule__ObjectTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1366:1: ( rule__ObjectTypeDefinition__Group__4__Impl )
            // InternalGraphQL.g:1367:2: rule__ObjectTypeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__4__Impl();

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
    // InternalGraphQL.g:1373:1: rule__ObjectTypeDefinition__Group__4__Impl : ( ( rule__ObjectTypeDefinition__Group_4__0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1377:1: ( ( ( rule__ObjectTypeDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:1378:1: ( ( rule__ObjectTypeDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:1378:1: ( ( rule__ObjectTypeDefinition__Group_4__0 )? )
            // InternalGraphQL.g:1379:2: ( rule__ObjectTypeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:1380:2: ( rule__ObjectTypeDefinition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphQL.g:1380:3: rule__ObjectTypeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectTypeDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ObjectTypeDefinition__Group_3__0"
    // InternalGraphQL.g:1389:1: rule__ObjectTypeDefinition__Group_3__0 : rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1 ;
    public final void rule__ObjectTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1393:1: ( rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:1394:2: rule__ObjectTypeDefinition__Group_3__0__Impl rule__ObjectTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGraphQL.g:1401:1: rule__ObjectTypeDefinition__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__ObjectTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1405:1: ( ( 'implements' ) )
            // InternalGraphQL.g:1406:1: ( 'implements' )
            {
            // InternalGraphQL.g:1406:1: ( 'implements' )
            // InternalGraphQL.g:1407:2: 'implements'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGraphQL.g:1416:1: rule__ObjectTypeDefinition__Group_3__1 : rule__ObjectTypeDefinition__Group_3__1__Impl ;
    public final void rule__ObjectTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1420:1: ( rule__ObjectTypeDefinition__Group_3__1__Impl )
            // InternalGraphQL.g:1421:2: rule__ObjectTypeDefinition__Group_3__1__Impl
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
    // InternalGraphQL.g:1427:1: rule__ObjectTypeDefinition__Group_3__1__Impl : ( ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 ) ) ;
    public final void rule__ObjectTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1431:1: ( ( ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 ) ) )
            // InternalGraphQL.g:1432:1: ( ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 ) )
            {
            // InternalGraphQL.g:1432:1: ( ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 ) )
            // InternalGraphQL.g:1433:2: ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getImplementsAssignment_3_1()); 
            // InternalGraphQL.g:1434:2: ( rule__ObjectTypeDefinition__ImplementsAssignment_3_1 )
            // InternalGraphQL.g:1434:3: rule__ObjectTypeDefinition__ImplementsAssignment_3_1
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


    // $ANTLR start "rule__ObjectTypeDefinition__Group_4__0"
    // InternalGraphQL.g:1443:1: rule__ObjectTypeDefinition__Group_4__0 : rule__ObjectTypeDefinition__Group_4__0__Impl rule__ObjectTypeDefinition__Group_4__1 ;
    public final void rule__ObjectTypeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1447:1: ( rule__ObjectTypeDefinition__Group_4__0__Impl rule__ObjectTypeDefinition__Group_4__1 )
            // InternalGraphQL.g:1448:2: rule__ObjectTypeDefinition__Group_4__0__Impl rule__ObjectTypeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__ObjectTypeDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_4__1();

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
    // $ANTLR end "rule__ObjectTypeDefinition__Group_4__0"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_4__0__Impl"
    // InternalGraphQL.g:1455:1: rule__ObjectTypeDefinition__Group_4__0__Impl : ( '{' ) ;
    public final void rule__ObjectTypeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1459:1: ( ( '{' ) )
            // InternalGraphQL.g:1460:1: ( '{' )
            {
            // InternalGraphQL.g:1460:1: ( '{' )
            // InternalGraphQL.g:1461:2: '{'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_4__1"
    // InternalGraphQL.g:1470:1: rule__ObjectTypeDefinition__Group_4__1 : rule__ObjectTypeDefinition__Group_4__1__Impl rule__ObjectTypeDefinition__Group_4__2 ;
    public final void rule__ObjectTypeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1474:1: ( rule__ObjectTypeDefinition__Group_4__1__Impl rule__ObjectTypeDefinition__Group_4__2 )
            // InternalGraphQL.g:1475:2: rule__ObjectTypeDefinition__Group_4__1__Impl rule__ObjectTypeDefinition__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__ObjectTypeDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_4__2();

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
    // $ANTLR end "rule__ObjectTypeDefinition__Group_4__1"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_4__1__Impl"
    // InternalGraphQL.g:1482:1: rule__ObjectTypeDefinition__Group_4__1__Impl : ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1 )* ) ;
    public final void rule__ObjectTypeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1486:1: ( ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1 )* ) )
            // InternalGraphQL.g:1487:1: ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1 )* )
            {
            // InternalGraphQL.g:1487:1: ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1 )* )
            // InternalGraphQL.g:1488:2: ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1 )*
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_4_1()); 
            // InternalGraphQL.g:1489:2: ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_SL_STRING_VALUE && LA15_0<=RULE_NAME)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGraphQL.g:1489:3: rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_4__2"
    // InternalGraphQL.g:1497:1: rule__ObjectTypeDefinition__Group_4__2 : rule__ObjectTypeDefinition__Group_4__2__Impl ;
    public final void rule__ObjectTypeDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1501:1: ( rule__ObjectTypeDefinition__Group_4__2__Impl )
            // InternalGraphQL.g:1502:2: rule__ObjectTypeDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_4__2__Impl();

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
    // $ANTLR end "rule__ObjectTypeDefinition__Group_4__2"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_4__2__Impl"
    // InternalGraphQL.g:1508:1: rule__ObjectTypeDefinition__Group_4__2__Impl : ( '}' ) ;
    public final void rule__ObjectTypeDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1512:1: ( ( '}' ) )
            // InternalGraphQL.g:1513:1: ( '}' )
            {
            // InternalGraphQL.g:1513:1: ( '}' )
            // InternalGraphQL.g:1514:2: '}'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__0"
    // InternalGraphQL.g:1524:1: rule__InterfaceDefinition__Group__0 : rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1528:1: ( rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 )
            // InternalGraphQL.g:1529:2: rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGraphQL.g:1536:1: rule__InterfaceDefinition__Group__0__Impl : ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InterfaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1540:1: ( ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1541:1: ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1541:1: ( ( rule__InterfaceDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1542:2: ( rule__InterfaceDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1543:2: ( rule__InterfaceDefinition__DescriptionAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_SL_STRING_VALUE && LA16_0<=RULE_ML_STRING_VALUE)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGraphQL.g:1543:3: rule__InterfaceDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1551:1: rule__InterfaceDefinition__Group__1 : rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1555:1: ( rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 )
            // InternalGraphQL.g:1556:2: rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2
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
    // InternalGraphQL.g:1563:1: rule__InterfaceDefinition__Group__1__Impl : ( 'interface' ) ;
    public final void rule__InterfaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1567:1: ( ( 'interface' ) )
            // InternalGraphQL.g:1568:1: ( 'interface' )
            {
            // InternalGraphQL.g:1568:1: ( 'interface' )
            // InternalGraphQL.g:1569:2: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGraphQL.g:1578:1: rule__InterfaceDefinition__Group__2 : rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1582:1: ( rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3 )
            // InternalGraphQL.g:1583:2: rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGraphQL.g:1590:1: rule__InterfaceDefinition__Group__2__Impl : ( ( rule__InterfaceDefinition__NameAssignment_2 ) ) ;
    public final void rule__InterfaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1594:1: ( ( ( rule__InterfaceDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1595:1: ( ( rule__InterfaceDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1595:1: ( ( rule__InterfaceDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1596:2: ( rule__InterfaceDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1597:2: ( rule__InterfaceDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1597:3: rule__InterfaceDefinition__NameAssignment_2
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
    // InternalGraphQL.g:1605:1: rule__InterfaceDefinition__Group__3 : rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1609:1: ( rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4 )
            // InternalGraphQL.g:1610:2: rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalGraphQL.g:1617:1: rule__InterfaceDefinition__Group__3__Impl : ( ( rule__InterfaceDefinition__Group_3__0 )? ) ;
    public final void rule__InterfaceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1621:1: ( ( ( rule__InterfaceDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:1622:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:1622:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            // InternalGraphQL.g:1623:2: ( rule__InterfaceDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:1624:2: ( rule__InterfaceDefinition__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphQL.g:1624:3: rule__InterfaceDefinition__Group_3__0
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
    // InternalGraphQL.g:1632:1: rule__InterfaceDefinition__Group__4 : rule__InterfaceDefinition__Group__4__Impl ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1636:1: ( rule__InterfaceDefinition__Group__4__Impl )
            // InternalGraphQL.g:1637:2: rule__InterfaceDefinition__Group__4__Impl
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
    // InternalGraphQL.g:1643:1: rule__InterfaceDefinition__Group__4__Impl : ( ( rule__InterfaceDefinition__Group_4__0 )? ) ;
    public final void rule__InterfaceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1647:1: ( ( ( rule__InterfaceDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:1648:1: ( ( rule__InterfaceDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:1648:1: ( ( rule__InterfaceDefinition__Group_4__0 )? )
            // InternalGraphQL.g:1649:2: ( rule__InterfaceDefinition__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:1650:2: ( rule__InterfaceDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGraphQL.g:1650:3: rule__InterfaceDefinition__Group_4__0
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
    // InternalGraphQL.g:1659:1: rule__InterfaceDefinition__Group_3__0 : rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1 ;
    public final void rule__InterfaceDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1663:1: ( rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1 )
            // InternalGraphQL.g:1664:2: rule__InterfaceDefinition__Group_3__0__Impl rule__InterfaceDefinition__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGraphQL.g:1671:1: rule__InterfaceDefinition__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__InterfaceDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1675:1: ( ( 'implements' ) )
            // InternalGraphQL.g:1676:1: ( 'implements' )
            {
            // InternalGraphQL.g:1676:1: ( 'implements' )
            // InternalGraphQL.g:1677:2: 'implements'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGraphQL.g:1686:1: rule__InterfaceDefinition__Group_3__1 : rule__InterfaceDefinition__Group_3__1__Impl ;
    public final void rule__InterfaceDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1690:1: ( rule__InterfaceDefinition__Group_3__1__Impl )
            // InternalGraphQL.g:1691:2: rule__InterfaceDefinition__Group_3__1__Impl
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
    // InternalGraphQL.g:1697:1: rule__InterfaceDefinition__Group_3__1__Impl : ( ( rule__InterfaceDefinition__ImplementsAssignment_3_1 ) ) ;
    public final void rule__InterfaceDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1701:1: ( ( ( rule__InterfaceDefinition__ImplementsAssignment_3_1 ) ) )
            // InternalGraphQL.g:1702:1: ( ( rule__InterfaceDefinition__ImplementsAssignment_3_1 ) )
            {
            // InternalGraphQL.g:1702:1: ( ( rule__InterfaceDefinition__ImplementsAssignment_3_1 ) )
            // InternalGraphQL.g:1703:2: ( rule__InterfaceDefinition__ImplementsAssignment_3_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getImplementsAssignment_3_1()); 
            // InternalGraphQL.g:1704:2: ( rule__InterfaceDefinition__ImplementsAssignment_3_1 )
            // InternalGraphQL.g:1704:3: rule__InterfaceDefinition__ImplementsAssignment_3_1
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
    // InternalGraphQL.g:1713:1: rule__InterfaceDefinition__Group_4__0 : rule__InterfaceDefinition__Group_4__0__Impl rule__InterfaceDefinition__Group_4__1 ;
    public final void rule__InterfaceDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1717:1: ( rule__InterfaceDefinition__Group_4__0__Impl rule__InterfaceDefinition__Group_4__1 )
            // InternalGraphQL.g:1718:2: rule__InterfaceDefinition__Group_4__0__Impl rule__InterfaceDefinition__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:1725:1: rule__InterfaceDefinition__Group_4__0__Impl : ( '{' ) ;
    public final void rule__InterfaceDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1729:1: ( ( '{' ) )
            // InternalGraphQL.g:1730:1: ( '{' )
            {
            // InternalGraphQL.g:1730:1: ( '{' )
            // InternalGraphQL.g:1731:2: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGraphQL.g:1740:1: rule__InterfaceDefinition__Group_4__1 : rule__InterfaceDefinition__Group_4__1__Impl rule__InterfaceDefinition__Group_4__2 ;
    public final void rule__InterfaceDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1744:1: ( rule__InterfaceDefinition__Group_4__1__Impl rule__InterfaceDefinition__Group_4__2 )
            // InternalGraphQL.g:1745:2: rule__InterfaceDefinition__Group_4__1__Impl rule__InterfaceDefinition__Group_4__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:1752:1: rule__InterfaceDefinition__Group_4__1__Impl : ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )* ) ;
    public final void rule__InterfaceDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1756:1: ( ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )* ) )
            // InternalGraphQL.g:1757:1: ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )* )
            {
            // InternalGraphQL.g:1757:1: ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )* )
            // InternalGraphQL.g:1758:2: ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsAssignment_4_1()); 
            // InternalGraphQL.g:1759:2: ( rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_SL_STRING_VALUE && LA19_0<=RULE_NAME)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGraphQL.g:1759:3: rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalGraphQL.g:1767:1: rule__InterfaceDefinition__Group_4__2 : rule__InterfaceDefinition__Group_4__2__Impl ;
    public final void rule__InterfaceDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1771:1: ( rule__InterfaceDefinition__Group_4__2__Impl )
            // InternalGraphQL.g:1772:2: rule__InterfaceDefinition__Group_4__2__Impl
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
    // InternalGraphQL.g:1778:1: rule__InterfaceDefinition__Group_4__2__Impl : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1782:1: ( ( '}' ) )
            // InternalGraphQL.g:1783:1: ( '}' )
            {
            // InternalGraphQL.g:1783:1: ( '}' )
            // InternalGraphQL.g:1784:2: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphQL.g:1794:1: rule__FieldDefinition__Group__0 : rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1 ;
    public final void rule__FieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1798:1: ( rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1 )
            // InternalGraphQL.g:1799:2: rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGraphQL.g:1806:1: rule__FieldDefinition__Group__0__Impl : ( ( rule__FieldDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__FieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1810:1: ( ( ( rule__FieldDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1811:1: ( ( rule__FieldDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1811:1: ( ( rule__FieldDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1812:2: ( rule__FieldDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFieldDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1813:2: ( rule__FieldDefinition__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_SL_STRING_VALUE && LA20_0<=RULE_ML_STRING_VALUE)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphQL.g:1813:3: rule__FieldDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1821:1: rule__FieldDefinition__Group__1 : rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2 ;
    public final void rule__FieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1825:1: ( rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2 )
            // InternalGraphQL.g:1826:2: rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGraphQL.g:1833:1: rule__FieldDefinition__Group__1__Impl : ( ( rule__FieldDefinition__NameAssignment_1 ) ) ;
    public final void rule__FieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1837:1: ( ( ( rule__FieldDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:1838:1: ( ( rule__FieldDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:1838:1: ( ( rule__FieldDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:1839:2: ( rule__FieldDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:1840:2: ( rule__FieldDefinition__NameAssignment_1 )
            // InternalGraphQL.g:1840:3: rule__FieldDefinition__NameAssignment_1
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
    // InternalGraphQL.g:1848:1: rule__FieldDefinition__Group__2 : rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3 ;
    public final void rule__FieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1852:1: ( rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3 )
            // InternalGraphQL.g:1853:2: rule__FieldDefinition__Group__2__Impl rule__FieldDefinition__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGraphQL.g:1860:1: rule__FieldDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__FieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1864:1: ( ( ':' ) )
            // InternalGraphQL.g:1865:1: ( ':' )
            {
            // InternalGraphQL.g:1865:1: ( ':' )
            // InternalGraphQL.g:1866:2: ':'
            {
             before(grammarAccess.getFieldDefinitionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFieldDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalGraphQL.g:1875:1: rule__FieldDefinition__Group__3 : rule__FieldDefinition__Group__3__Impl ;
    public final void rule__FieldDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1879:1: ( rule__FieldDefinition__Group__3__Impl )
            // InternalGraphQL.g:1880:2: rule__FieldDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group__3__Impl();

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
    // InternalGraphQL.g:1886:1: rule__FieldDefinition__Group__3__Impl : ( ( rule__FieldDefinition__TypeAssignment_3 ) ) ;
    public final void rule__FieldDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1890:1: ( ( ( rule__FieldDefinition__TypeAssignment_3 ) ) )
            // InternalGraphQL.g:1891:1: ( ( rule__FieldDefinition__TypeAssignment_3 ) )
            {
            // InternalGraphQL.g:1891:1: ( ( rule__FieldDefinition__TypeAssignment_3 ) )
            // InternalGraphQL.g:1892:2: ( rule__FieldDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getTypeAssignment_3()); 
            // InternalGraphQL.g:1893:2: ( rule__FieldDefinition__TypeAssignment_3 )
            // InternalGraphQL.g:1893:3: rule__FieldDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldDefinitionAccess().getTypeAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__UnionTypeDefinition__Group__0"
    // InternalGraphQL.g:1902:1: rule__UnionTypeDefinition__Group__0 : rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1 ;
    public final void rule__UnionTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1906:1: ( rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1 )
            // InternalGraphQL.g:1907:2: rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalGraphQL.g:1914:1: rule__UnionTypeDefinition__Group__0__Impl : ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__UnionTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1918:1: ( ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:1919:1: ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:1919:1: ( ( rule__UnionTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:1920:2: ( rule__UnionTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:1921:2: ( rule__UnionTypeDefinition__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_SL_STRING_VALUE && LA21_0<=RULE_ML_STRING_VALUE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphQL.g:1921:3: rule__UnionTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:1929:1: rule__UnionTypeDefinition__Group__1 : rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2 ;
    public final void rule__UnionTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1933:1: ( rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2 )
            // InternalGraphQL.g:1934:2: rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2
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
    // InternalGraphQL.g:1941:1: rule__UnionTypeDefinition__Group__1__Impl : ( 'union' ) ;
    public final void rule__UnionTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1945:1: ( ( 'union' ) )
            // InternalGraphQL.g:1946:1: ( 'union' )
            {
            // InternalGraphQL.g:1946:1: ( 'union' )
            // InternalGraphQL.g:1947:2: 'union'
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGraphQL.g:1956:1: rule__UnionTypeDefinition__Group__2 : rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3 ;
    public final void rule__UnionTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1960:1: ( rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3 )
            // InternalGraphQL.g:1961:2: rule__UnionTypeDefinition__Group__2__Impl rule__UnionTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalGraphQL.g:1968:1: rule__UnionTypeDefinition__Group__2__Impl : ( ( rule__UnionTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__UnionTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1972:1: ( ( ( rule__UnionTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:1973:1: ( ( rule__UnionTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:1973:1: ( ( rule__UnionTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:1974:2: ( rule__UnionTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:1975:2: ( rule__UnionTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:1975:3: rule__UnionTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:1983:1: rule__UnionTypeDefinition__Group__3 : rule__UnionTypeDefinition__Group__3__Impl ;
    public final void rule__UnionTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1987:1: ( rule__UnionTypeDefinition__Group__3__Impl )
            // InternalGraphQL.g:1988:2: rule__UnionTypeDefinition__Group__3__Impl
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
    // InternalGraphQL.g:1994:1: rule__UnionTypeDefinition__Group__3__Impl : ( ( rule__UnionTypeDefinition__Group_3__0 )? ) ;
    public final void rule__UnionTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1998:1: ( ( ( rule__UnionTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:1999:1: ( ( rule__UnionTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:1999:1: ( ( rule__UnionTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:2000:2: ( rule__UnionTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:2001:2: ( rule__UnionTypeDefinition__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGraphQL.g:2001:3: rule__UnionTypeDefinition__Group_3__0
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
    // InternalGraphQL.g:2010:1: rule__UnionTypeDefinition__Group_3__0 : rule__UnionTypeDefinition__Group_3__0__Impl rule__UnionTypeDefinition__Group_3__1 ;
    public final void rule__UnionTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2014:1: ( rule__UnionTypeDefinition__Group_3__0__Impl rule__UnionTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:2015:2: rule__UnionTypeDefinition__Group_3__0__Impl rule__UnionTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGraphQL.g:2022:1: rule__UnionTypeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__UnionTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2026:1: ( ( '=' ) )
            // InternalGraphQL.g:2027:1: ( '=' )
            {
            // InternalGraphQL.g:2027:1: ( '=' )
            // InternalGraphQL.g:2028:2: '='
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGraphQL.g:2037:1: rule__UnionTypeDefinition__Group_3__1 : rule__UnionTypeDefinition__Group_3__1__Impl rule__UnionTypeDefinition__Group_3__2 ;
    public final void rule__UnionTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2041:1: ( rule__UnionTypeDefinition__Group_3__1__Impl rule__UnionTypeDefinition__Group_3__2 )
            // InternalGraphQL.g:2042:2: rule__UnionTypeDefinition__Group_3__1__Impl rule__UnionTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalGraphQL.g:2049:1: rule__UnionTypeDefinition__Group_3__1__Impl : ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_1 ) ) ;
    public final void rule__UnionTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2053:1: ( ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_1 ) ) )
            // InternalGraphQL.g:2054:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_1 ) )
            {
            // InternalGraphQL.g:2054:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_1 ) )
            // InternalGraphQL.g:2055:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_3_1 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_3_1()); 
            // InternalGraphQL.g:2056:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_3_1 )
            // InternalGraphQL.g:2056:3: rule__UnionTypeDefinition__MemberTypesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__MemberTypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_3_1()); 

            }


            }

        }
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
    // InternalGraphQL.g:2064:1: rule__UnionTypeDefinition__Group_3__2 : rule__UnionTypeDefinition__Group_3__2__Impl ;
    public final void rule__UnionTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2068:1: ( rule__UnionTypeDefinition__Group_3__2__Impl )
            // InternalGraphQL.g:2069:2: rule__UnionTypeDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3__2__Impl();

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
    // InternalGraphQL.g:2075:1: rule__UnionTypeDefinition__Group_3__2__Impl : ( ( rule__UnionTypeDefinition__Group_3_2__0 )* ) ;
    public final void rule__UnionTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2079:1: ( ( ( rule__UnionTypeDefinition__Group_3_2__0 )* ) )
            // InternalGraphQL.g:2080:1: ( ( rule__UnionTypeDefinition__Group_3_2__0 )* )
            {
            // InternalGraphQL.g:2080:1: ( ( rule__UnionTypeDefinition__Group_3_2__0 )* )
            // InternalGraphQL.g:2081:2: ( rule__UnionTypeDefinition__Group_3_2__0 )*
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup_3_2()); 
            // InternalGraphQL.g:2082:2: ( rule__UnionTypeDefinition__Group_3_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGraphQL.g:2082:3: rule__UnionTypeDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__UnionTypeDefinition__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getUnionTypeDefinitionAccess().getGroup_3_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__UnionTypeDefinition__Group_3_2__0"
    // InternalGraphQL.g:2091:1: rule__UnionTypeDefinition__Group_3_2__0 : rule__UnionTypeDefinition__Group_3_2__0__Impl rule__UnionTypeDefinition__Group_3_2__1 ;
    public final void rule__UnionTypeDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2095:1: ( rule__UnionTypeDefinition__Group_3_2__0__Impl rule__UnionTypeDefinition__Group_3_2__1 )
            // InternalGraphQL.g:2096:2: rule__UnionTypeDefinition__Group_3_2__0__Impl rule__UnionTypeDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_14);
            rule__UnionTypeDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3_2__1();

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3_2__0"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3_2__0__Impl"
    // InternalGraphQL.g:2103:1: rule__UnionTypeDefinition__Group_3_2__0__Impl : ( '|' ) ;
    public final void rule__UnionTypeDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2107:1: ( ( '|' ) )
            // InternalGraphQL.g:2108:1: ( '|' )
            {
            // InternalGraphQL.g:2108:1: ( '|' )
            // InternalGraphQL.g:2109:2: '|'
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3_2__1"
    // InternalGraphQL.g:2118:1: rule__UnionTypeDefinition__Group_3_2__1 : rule__UnionTypeDefinition__Group_3_2__1__Impl ;
    public final void rule__UnionTypeDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2122:1: ( rule__UnionTypeDefinition__Group_3_2__1__Impl )
            // InternalGraphQL.g:2123:2: rule__UnionTypeDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__UnionTypeDefinition__Group_3_2__1"


    // $ANTLR start "rule__UnionTypeDefinition__Group_3_2__1__Impl"
    // InternalGraphQL.g:2129:1: rule__UnionTypeDefinition__Group_3_2__1__Impl : ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1 ) ) ;
    public final void rule__UnionTypeDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2133:1: ( ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1 ) ) )
            // InternalGraphQL.g:2134:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1 ) )
            {
            // InternalGraphQL.g:2134:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1 ) )
            // InternalGraphQL.g:2135:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_3_2_1()); 
            // InternalGraphQL.g:2136:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1 )
            // InternalGraphQL.g:2136:3: rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group__0"
    // InternalGraphQL.g:2145:1: rule__EnumTypeDefinition__Group__0 : rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1 ;
    public final void rule__EnumTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2149:1: ( rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1 )
            // InternalGraphQL.g:2150:2: rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalGraphQL.g:2157:1: rule__EnumTypeDefinition__Group__0__Impl : ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__EnumTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2161:1: ( ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2162:1: ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2162:1: ( ( rule__EnumTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2163:2: ( rule__EnumTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2164:2: ( rule__EnumTypeDefinition__DescriptionAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_SL_STRING_VALUE && LA24_0<=RULE_ML_STRING_VALUE)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphQL.g:2164:3: rule__EnumTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2172:1: rule__EnumTypeDefinition__Group__1 : rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2 ;
    public final void rule__EnumTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2176:1: ( rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2 )
            // InternalGraphQL.g:2177:2: rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2
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
    // InternalGraphQL.g:2184:1: rule__EnumTypeDefinition__Group__1__Impl : ( 'enum' ) ;
    public final void rule__EnumTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2188:1: ( ( 'enum' ) )
            // InternalGraphQL.g:2189:1: ( 'enum' )
            {
            // InternalGraphQL.g:2189:1: ( 'enum' )
            // InternalGraphQL.g:2190:2: 'enum'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGraphQL.g:2199:1: rule__EnumTypeDefinition__Group__2 : rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3 ;
    public final void rule__EnumTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2203:1: ( rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3 )
            // InternalGraphQL.g:2204:2: rule__EnumTypeDefinition__Group__2__Impl rule__EnumTypeDefinition__Group__3
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
    // InternalGraphQL.g:2211:1: rule__EnumTypeDefinition__Group__2__Impl : ( ( rule__EnumTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2215:1: ( ( ( rule__EnumTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:2216:1: ( ( rule__EnumTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:2216:1: ( ( rule__EnumTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:2217:2: ( rule__EnumTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:2218:2: ( rule__EnumTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:2218:3: rule__EnumTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:2226:1: rule__EnumTypeDefinition__Group__3 : rule__EnumTypeDefinition__Group__3__Impl ;
    public final void rule__EnumTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2230:1: ( rule__EnumTypeDefinition__Group__3__Impl )
            // InternalGraphQL.g:2231:2: rule__EnumTypeDefinition__Group__3__Impl
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
    // InternalGraphQL.g:2237:1: rule__EnumTypeDefinition__Group__3__Impl : ( ( rule__EnumTypeDefinition__Group_3__0 )? ) ;
    public final void rule__EnumTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2241:1: ( ( ( rule__EnumTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:2242:1: ( ( rule__EnumTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:2242:1: ( ( rule__EnumTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:2243:2: ( rule__EnumTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:2244:2: ( rule__EnumTypeDefinition__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphQL.g:2244:3: rule__EnumTypeDefinition__Group_3__0
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
    // InternalGraphQL.g:2253:1: rule__EnumTypeDefinition__Group_3__0 : rule__EnumTypeDefinition__Group_3__0__Impl rule__EnumTypeDefinition__Group_3__1 ;
    public final void rule__EnumTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2257:1: ( rule__EnumTypeDefinition__Group_3__0__Impl rule__EnumTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:2258:2: rule__EnumTypeDefinition__Group_3__0__Impl rule__EnumTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGraphQL.g:2265:1: rule__EnumTypeDefinition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2269:1: ( ( '{' ) )
            // InternalGraphQL.g:2270:1: ( '{' )
            {
            // InternalGraphQL.g:2270:1: ( '{' )
            // InternalGraphQL.g:2271:2: '{'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGraphQL.g:2280:1: rule__EnumTypeDefinition__Group_3__1 : rule__EnumTypeDefinition__Group_3__1__Impl rule__EnumTypeDefinition__Group_3__2 ;
    public final void rule__EnumTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2284:1: ( rule__EnumTypeDefinition__Group_3__1__Impl rule__EnumTypeDefinition__Group_3__2 )
            // InternalGraphQL.g:2285:2: rule__EnumTypeDefinition__Group_3__1__Impl rule__EnumTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalGraphQL.g:2292:1: rule__EnumTypeDefinition__Group_3__1__Impl : ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 ) ) ;
    public final void rule__EnumTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2296:1: ( ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 ) ) )
            // InternalGraphQL.g:2297:1: ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 ) )
            {
            // InternalGraphQL.g:2297:1: ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 ) )
            // InternalGraphQL.g:2298:2: ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 )
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsAssignment_3_1()); 
            // InternalGraphQL.g:2299:2: ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 )
            // InternalGraphQL.g:2299:3: rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1();

            state._fsp--;


            }

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
    // InternalGraphQL.g:2307:1: rule__EnumTypeDefinition__Group_3__2 : rule__EnumTypeDefinition__Group_3__2__Impl ;
    public final void rule__EnumTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2311:1: ( rule__EnumTypeDefinition__Group_3__2__Impl )
            // InternalGraphQL.g:2312:2: rule__EnumTypeDefinition__Group_3__2__Impl
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
    // InternalGraphQL.g:2318:1: rule__EnumTypeDefinition__Group_3__2__Impl : ( '}' ) ;
    public final void rule__EnumTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2322:1: ( ( '}' ) )
            // InternalGraphQL.g:2323:1: ( '}' )
            {
            // InternalGraphQL.g:2323:1: ( '}' )
            // InternalGraphQL.g:2324:2: '}'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphQL.g:2334:1: rule__EnumValueDefinition__Group__0 : rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1 ;
    public final void rule__EnumValueDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2338:1: ( rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1 )
            // InternalGraphQL.g:2339:2: rule__EnumValueDefinition__Group__0__Impl rule__EnumValueDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGraphQL.g:2346:1: rule__EnumValueDefinition__Group__0__Impl : ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__EnumValueDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2350:1: ( ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2351:1: ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2351:1: ( ( rule__EnumValueDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2352:2: ( rule__EnumValueDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2353:2: ( rule__EnumValueDefinition__DescriptionAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_SL_STRING_VALUE && LA26_0<=RULE_ML_STRING_VALUE)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGraphQL.g:2353:3: rule__EnumValueDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2361:1: rule__EnumValueDefinition__Group__1 : rule__EnumValueDefinition__Group__1__Impl ;
    public final void rule__EnumValueDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2365:1: ( rule__EnumValueDefinition__Group__1__Impl )
            // InternalGraphQL.g:2366:2: rule__EnumValueDefinition__Group__1__Impl
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
    // InternalGraphQL.g:2372:1: rule__EnumValueDefinition__Group__1__Impl : ( ( rule__EnumValueDefinition__NameAssignment_1 ) ) ;
    public final void rule__EnumValueDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2376:1: ( ( ( rule__EnumValueDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:2377:1: ( ( rule__EnumValueDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:2377:1: ( ( rule__EnumValueDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:2378:2: ( rule__EnumValueDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:2379:2: ( rule__EnumValueDefinition__NameAssignment_1 )
            // InternalGraphQL.g:2379:3: rule__EnumValueDefinition__NameAssignment_1
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
    // InternalGraphQL.g:2388:1: rule__InputObjectTypeDefinition__Group__0 : rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1 ;
    public final void rule__InputObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2392:1: ( rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1 )
            // InternalGraphQL.g:2393:2: rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGraphQL.g:2400:1: rule__InputObjectTypeDefinition__Group__0__Impl : ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InputObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2404:1: ( ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2405:1: ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2405:1: ( ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2406:2: ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2407:2: ( rule__InputObjectTypeDefinition__DescriptionAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_SL_STRING_VALUE && LA27_0<=RULE_ML_STRING_VALUE)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGraphQL.g:2407:3: rule__InputObjectTypeDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2415:1: rule__InputObjectTypeDefinition__Group__1 : rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2 ;
    public final void rule__InputObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2419:1: ( rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2 )
            // InternalGraphQL.g:2420:2: rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2
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
    // InternalGraphQL.g:2427:1: rule__InputObjectTypeDefinition__Group__1__Impl : ( 'input' ) ;
    public final void rule__InputObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2431:1: ( ( 'input' ) )
            // InternalGraphQL.g:2432:1: ( 'input' )
            {
            // InternalGraphQL.g:2432:1: ( 'input' )
            // InternalGraphQL.g:2433:2: 'input'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGraphQL.g:2442:1: rule__InputObjectTypeDefinition__Group__2 : rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3 ;
    public final void rule__InputObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2446:1: ( rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3 )
            // InternalGraphQL.g:2447:2: rule__InputObjectTypeDefinition__Group__2__Impl rule__InputObjectTypeDefinition__Group__3
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
    // InternalGraphQL.g:2454:1: rule__InputObjectTypeDefinition__Group__2__Impl : ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) ) ;
    public final void rule__InputObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2458:1: ( ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) ) )
            // InternalGraphQL.g:2459:1: ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) )
            {
            // InternalGraphQL.g:2459:1: ( ( rule__InputObjectTypeDefinition__NameAssignment_2 ) )
            // InternalGraphQL.g:2460:2: ( rule__InputObjectTypeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getNameAssignment_2()); 
            // InternalGraphQL.g:2461:2: ( rule__InputObjectTypeDefinition__NameAssignment_2 )
            // InternalGraphQL.g:2461:3: rule__InputObjectTypeDefinition__NameAssignment_2
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
    // InternalGraphQL.g:2469:1: rule__InputObjectTypeDefinition__Group__3 : rule__InputObjectTypeDefinition__Group__3__Impl ;
    public final void rule__InputObjectTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2473:1: ( rule__InputObjectTypeDefinition__Group__3__Impl )
            // InternalGraphQL.g:2474:2: rule__InputObjectTypeDefinition__Group__3__Impl
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
    // InternalGraphQL.g:2480:1: rule__InputObjectTypeDefinition__Group__3__Impl : ( ( rule__InputObjectTypeDefinition__Group_3__0 )? ) ;
    public final void rule__InputObjectTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2484:1: ( ( ( rule__InputObjectTypeDefinition__Group_3__0 )? ) )
            // InternalGraphQL.g:2485:1: ( ( rule__InputObjectTypeDefinition__Group_3__0 )? )
            {
            // InternalGraphQL.g:2485:1: ( ( rule__InputObjectTypeDefinition__Group_3__0 )? )
            // InternalGraphQL.g:2486:2: ( rule__InputObjectTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup_3()); 
            // InternalGraphQL.g:2487:2: ( rule__InputObjectTypeDefinition__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphQL.g:2487:3: rule__InputObjectTypeDefinition__Group_3__0
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
    // InternalGraphQL.g:2496:1: rule__InputObjectTypeDefinition__Group_3__0 : rule__InputObjectTypeDefinition__Group_3__0__Impl rule__InputObjectTypeDefinition__Group_3__1 ;
    public final void rule__InputObjectTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2500:1: ( rule__InputObjectTypeDefinition__Group_3__0__Impl rule__InputObjectTypeDefinition__Group_3__1 )
            // InternalGraphQL.g:2501:2: rule__InputObjectTypeDefinition__Group_3__0__Impl rule__InputObjectTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:2508:1: rule__InputObjectTypeDefinition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__InputObjectTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2512:1: ( ( '{' ) )
            // InternalGraphQL.g:2513:1: ( '{' )
            {
            // InternalGraphQL.g:2513:1: ( '{' )
            // InternalGraphQL.g:2514:2: '{'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGraphQL.g:2523:1: rule__InputObjectTypeDefinition__Group_3__1 : rule__InputObjectTypeDefinition__Group_3__1__Impl rule__InputObjectTypeDefinition__Group_3__2 ;
    public final void rule__InputObjectTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2527:1: ( rule__InputObjectTypeDefinition__Group_3__1__Impl rule__InputObjectTypeDefinition__Group_3__2 )
            // InternalGraphQL.g:2528:2: rule__InputObjectTypeDefinition__Group_3__1__Impl rule__InputObjectTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGraphQL.g:2535:1: rule__InputObjectTypeDefinition__Group_3__1__Impl : ( ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )* ) ;
    public final void rule__InputObjectTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2539:1: ( ( ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )* ) )
            // InternalGraphQL.g:2540:1: ( ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )* )
            {
            // InternalGraphQL.g:2540:1: ( ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )* )
            // InternalGraphQL.g:2541:2: ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )*
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputsFieldDefinitionsAssignment_3_1()); 
            // InternalGraphQL.g:2542:2: ( rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_SL_STRING_VALUE && LA29_0<=RULE_NAME)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGraphQL.g:2542:3: rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalGraphQL.g:2550:1: rule__InputObjectTypeDefinition__Group_3__2 : rule__InputObjectTypeDefinition__Group_3__2__Impl ;
    public final void rule__InputObjectTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2554:1: ( rule__InputObjectTypeDefinition__Group_3__2__Impl )
            // InternalGraphQL.g:2555:2: rule__InputObjectTypeDefinition__Group_3__2__Impl
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
    // InternalGraphQL.g:2561:1: rule__InputObjectTypeDefinition__Group_3__2__Impl : ( '}' ) ;
    public final void rule__InputObjectTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2565:1: ( ( '}' ) )
            // InternalGraphQL.g:2566:1: ( '}' )
            {
            // InternalGraphQL.g:2566:1: ( '}' )
            // InternalGraphQL.g:2567:2: '}'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphQL.g:2577:1: rule__InputValueDefinition__Group__0 : rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1 ;
    public final void rule__InputValueDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2581:1: ( rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1 )
            // InternalGraphQL.g:2582:2: rule__InputValueDefinition__Group__0__Impl rule__InputValueDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGraphQL.g:2589:1: rule__InputValueDefinition__Group__0__Impl : ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__InputValueDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2593:1: ( ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? ) )
            // InternalGraphQL.g:2594:1: ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? )
            {
            // InternalGraphQL.g:2594:1: ( ( rule__InputValueDefinition__DescriptionAssignment_0 )? )
            // InternalGraphQL.g:2595:2: ( rule__InputValueDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInputValueDefinitionAccess().getDescriptionAssignment_0()); 
            // InternalGraphQL.g:2596:2: ( rule__InputValueDefinition__DescriptionAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_SL_STRING_VALUE && LA30_0<=RULE_ML_STRING_VALUE)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGraphQL.g:2596:3: rule__InputValueDefinition__DescriptionAssignment_0
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
    // InternalGraphQL.g:2604:1: rule__InputValueDefinition__Group__1 : rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2 ;
    public final void rule__InputValueDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2608:1: ( rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2 )
            // InternalGraphQL.g:2609:2: rule__InputValueDefinition__Group__1__Impl rule__InputValueDefinition__Group__2
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
    // InternalGraphQL.g:2616:1: rule__InputValueDefinition__Group__1__Impl : ( ( rule__InputValueDefinition__NameAssignment_1 ) ) ;
    public final void rule__InputValueDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2620:1: ( ( ( rule__InputValueDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:2621:1: ( ( rule__InputValueDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:2621:1: ( ( rule__InputValueDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:2622:2: ( rule__InputValueDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:2623:2: ( rule__InputValueDefinition__NameAssignment_1 )
            // InternalGraphQL.g:2623:3: rule__InputValueDefinition__NameAssignment_1
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
    // InternalGraphQL.g:2631:1: rule__InputValueDefinition__Group__2 : rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3 ;
    public final void rule__InputValueDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2635:1: ( rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3 )
            // InternalGraphQL.g:2636:2: rule__InputValueDefinition__Group__2__Impl rule__InputValueDefinition__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGraphQL.g:2643:1: rule__InputValueDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__InputValueDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2647:1: ( ( ':' ) )
            // InternalGraphQL.g:2648:1: ( ':' )
            {
            // InternalGraphQL.g:2648:1: ( ':' )
            // InternalGraphQL.g:2649:2: ':'
            {
             before(grammarAccess.getInputValueDefinitionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphQL.g:2658:1: rule__InputValueDefinition__Group__3 : rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4 ;
    public final void rule__InputValueDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2662:1: ( rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4 )
            // InternalGraphQL.g:2663:2: rule__InputValueDefinition__Group__3__Impl rule__InputValueDefinition__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalGraphQL.g:2670:1: rule__InputValueDefinition__Group__3__Impl : ( ( rule__InputValueDefinition__TypeAssignment_3 ) ) ;
    public final void rule__InputValueDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2674:1: ( ( ( rule__InputValueDefinition__TypeAssignment_3 ) ) )
            // InternalGraphQL.g:2675:1: ( ( rule__InputValueDefinition__TypeAssignment_3 ) )
            {
            // InternalGraphQL.g:2675:1: ( ( rule__InputValueDefinition__TypeAssignment_3 ) )
            // InternalGraphQL.g:2676:2: ( rule__InputValueDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getTypeAssignment_3()); 
            // InternalGraphQL.g:2677:2: ( rule__InputValueDefinition__TypeAssignment_3 )
            // InternalGraphQL.g:2677:3: rule__InputValueDefinition__TypeAssignment_3
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
    // InternalGraphQL.g:2685:1: rule__InputValueDefinition__Group__4 : rule__InputValueDefinition__Group__4__Impl ;
    public final void rule__InputValueDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2689:1: ( rule__InputValueDefinition__Group__4__Impl )
            // InternalGraphQL.g:2690:2: rule__InputValueDefinition__Group__4__Impl
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
    // InternalGraphQL.g:2696:1: rule__InputValueDefinition__Group__4__Impl : ( ( rule__InputValueDefinition__Group_4__0 )? ) ;
    public final void rule__InputValueDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2700:1: ( ( ( rule__InputValueDefinition__Group_4__0 )? ) )
            // InternalGraphQL.g:2701:1: ( ( rule__InputValueDefinition__Group_4__0 )? )
            {
            // InternalGraphQL.g:2701:1: ( ( rule__InputValueDefinition__Group_4__0 )? )
            // InternalGraphQL.g:2702:2: ( rule__InputValueDefinition__Group_4__0 )?
            {
             before(grammarAccess.getInputValueDefinitionAccess().getGroup_4()); 
            // InternalGraphQL.g:2703:2: ( rule__InputValueDefinition__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGraphQL.g:2703:3: rule__InputValueDefinition__Group_4__0
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
    // InternalGraphQL.g:2712:1: rule__InputValueDefinition__Group_4__0 : rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1 ;
    public final void rule__InputValueDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2716:1: ( rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1 )
            // InternalGraphQL.g:2717:2: rule__InputValueDefinition__Group_4__0__Impl rule__InputValueDefinition__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalGraphQL.g:2724:1: rule__InputValueDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__InputValueDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2728:1: ( ( '=' ) )
            // InternalGraphQL.g:2729:1: ( '=' )
            {
            // InternalGraphQL.g:2729:1: ( '=' )
            // InternalGraphQL.g:2730:2: '='
            {
             before(grammarAccess.getInputValueDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGraphQL.g:2739:1: rule__InputValueDefinition__Group_4__1 : rule__InputValueDefinition__Group_4__1__Impl ;
    public final void rule__InputValueDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2743:1: ( rule__InputValueDefinition__Group_4__1__Impl )
            // InternalGraphQL.g:2744:2: rule__InputValueDefinition__Group_4__1__Impl
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
    // InternalGraphQL.g:2750:1: rule__InputValueDefinition__Group_4__1__Impl : ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) ) ;
    public final void rule__InputValueDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2754:1: ( ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) ) )
            // InternalGraphQL.g:2755:1: ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) )
            {
            // InternalGraphQL.g:2755:1: ( ( rule__InputValueDefinition__DefaultValueAssignment_4_1 ) )
            // InternalGraphQL.g:2756:2: ( rule__InputValueDefinition__DefaultValueAssignment_4_1 )
            {
             before(grammarAccess.getInputValueDefinitionAccess().getDefaultValueAssignment_4_1()); 
            // InternalGraphQL.g:2757:2: ( rule__InputValueDefinition__DefaultValueAssignment_4_1 )
            // InternalGraphQL.g:2757:3: rule__InputValueDefinition__DefaultValueAssignment_4_1
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
    // InternalGraphQL.g:2766:1: rule__IntersectionType__Group__0 : rule__IntersectionType__Group__0__Impl rule__IntersectionType__Group__1 ;
    public final void rule__IntersectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2770:1: ( rule__IntersectionType__Group__0__Impl rule__IntersectionType__Group__1 )
            // InternalGraphQL.g:2771:2: rule__IntersectionType__Group__0__Impl rule__IntersectionType__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalGraphQL.g:2778:1: rule__IntersectionType__Group__0__Impl : ( ( rule__IntersectionType__MemberTypesAssignment_0 ) ) ;
    public final void rule__IntersectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2782:1: ( ( ( rule__IntersectionType__MemberTypesAssignment_0 ) ) )
            // InternalGraphQL.g:2783:1: ( ( rule__IntersectionType__MemberTypesAssignment_0 ) )
            {
            // InternalGraphQL.g:2783:1: ( ( rule__IntersectionType__MemberTypesAssignment_0 ) )
            // InternalGraphQL.g:2784:2: ( rule__IntersectionType__MemberTypesAssignment_0 )
            {
             before(grammarAccess.getIntersectionTypeAccess().getMemberTypesAssignment_0()); 
            // InternalGraphQL.g:2785:2: ( rule__IntersectionType__MemberTypesAssignment_0 )
            // InternalGraphQL.g:2785:3: rule__IntersectionType__MemberTypesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__MemberTypesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionTypeAccess().getMemberTypesAssignment_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:2793:1: rule__IntersectionType__Group__1 : rule__IntersectionType__Group__1__Impl ;
    public final void rule__IntersectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2797:1: ( rule__IntersectionType__Group__1__Impl )
            // InternalGraphQL.g:2798:2: rule__IntersectionType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group__1__Impl();

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
    // InternalGraphQL.g:2804:1: rule__IntersectionType__Group__1__Impl : ( ( rule__IntersectionType__Group_1__0 )* ) ;
    public final void rule__IntersectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2808:1: ( ( ( rule__IntersectionType__Group_1__0 )* ) )
            // InternalGraphQL.g:2809:1: ( ( rule__IntersectionType__Group_1__0 )* )
            {
            // InternalGraphQL.g:2809:1: ( ( rule__IntersectionType__Group_1__0 )* )
            // InternalGraphQL.g:2810:2: ( rule__IntersectionType__Group_1__0 )*
            {
             before(grammarAccess.getIntersectionTypeAccess().getGroup_1()); 
            // InternalGraphQL.g:2811:2: ( rule__IntersectionType__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==31) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGraphQL.g:2811:3: rule__IntersectionType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__IntersectionType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getIntersectionTypeAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__IntersectionType__Group_1__0"
    // InternalGraphQL.g:2820:1: rule__IntersectionType__Group_1__0 : rule__IntersectionType__Group_1__0__Impl rule__IntersectionType__Group_1__1 ;
    public final void rule__IntersectionType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2824:1: ( rule__IntersectionType__Group_1__0__Impl rule__IntersectionType__Group_1__1 )
            // InternalGraphQL.g:2825:2: rule__IntersectionType__Group_1__0__Impl rule__IntersectionType__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__IntersectionType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group_1__1();

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
    // $ANTLR end "rule__IntersectionType__Group_1__0"


    // $ANTLR start "rule__IntersectionType__Group_1__0__Impl"
    // InternalGraphQL.g:2832:1: rule__IntersectionType__Group_1__0__Impl : ( '&' ) ;
    public final void rule__IntersectionType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2836:1: ( ( '&' ) )
            // InternalGraphQL.g:2837:1: ( '&' )
            {
            // InternalGraphQL.g:2837:1: ( '&' )
            // InternalGraphQL.g:2838:2: '&'
            {
             before(grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIntersectionTypeAccess().getAmpersandKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionType__Group_1__0__Impl"


    // $ANTLR start "rule__IntersectionType__Group_1__1"
    // InternalGraphQL.g:2847:1: rule__IntersectionType__Group_1__1 : rule__IntersectionType__Group_1__1__Impl ;
    public final void rule__IntersectionType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2851:1: ( rule__IntersectionType__Group_1__1__Impl )
            // InternalGraphQL.g:2852:2: rule__IntersectionType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__Group_1__1__Impl();

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
    // $ANTLR end "rule__IntersectionType__Group_1__1"


    // $ANTLR start "rule__IntersectionType__Group_1__1__Impl"
    // InternalGraphQL.g:2858:1: rule__IntersectionType__Group_1__1__Impl : ( ( rule__IntersectionType__MemberTypesAssignment_1_1 ) ) ;
    public final void rule__IntersectionType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2862:1: ( ( ( rule__IntersectionType__MemberTypesAssignment_1_1 ) ) )
            // InternalGraphQL.g:2863:1: ( ( rule__IntersectionType__MemberTypesAssignment_1_1 ) )
            {
            // InternalGraphQL.g:2863:1: ( ( rule__IntersectionType__MemberTypesAssignment_1_1 ) )
            // InternalGraphQL.g:2864:2: ( rule__IntersectionType__MemberTypesAssignment_1_1 )
            {
             before(grammarAccess.getIntersectionTypeAccess().getMemberTypesAssignment_1_1()); 
            // InternalGraphQL.g:2865:2: ( rule__IntersectionType__MemberTypesAssignment_1_1 )
            // InternalGraphQL.g:2865:3: rule__IntersectionType__MemberTypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionType__MemberTypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionTypeAccess().getMemberTypesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionType__Group_1__1__Impl"


    // $ANTLR start "rule__NamedType__Group__0"
    // InternalGraphQL.g:2874:1: rule__NamedType__Group__0 : rule__NamedType__Group__0__Impl rule__NamedType__Group__1 ;
    public final void rule__NamedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2878:1: ( rule__NamedType__Group__0__Impl rule__NamedType__Group__1 )
            // InternalGraphQL.g:2879:2: rule__NamedType__Group__0__Impl rule__NamedType__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalGraphQL.g:2886:1: rule__NamedType__Group__0__Impl : ( ( rule__NamedType__TypeDefinitionAssignment_0 ) ) ;
    public final void rule__NamedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2890:1: ( ( ( rule__NamedType__TypeDefinitionAssignment_0 ) ) )
            // InternalGraphQL.g:2891:1: ( ( rule__NamedType__TypeDefinitionAssignment_0 ) )
            {
            // InternalGraphQL.g:2891:1: ( ( rule__NamedType__TypeDefinitionAssignment_0 ) )
            // InternalGraphQL.g:2892:2: ( rule__NamedType__TypeDefinitionAssignment_0 )
            {
             before(grammarAccess.getNamedTypeAccess().getTypeDefinitionAssignment_0()); 
            // InternalGraphQL.g:2893:2: ( rule__NamedType__TypeDefinitionAssignment_0 )
            // InternalGraphQL.g:2893:3: rule__NamedType__TypeDefinitionAssignment_0
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
    // InternalGraphQL.g:2901:1: rule__NamedType__Group__1 : rule__NamedType__Group__1__Impl ;
    public final void rule__NamedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2905:1: ( rule__NamedType__Group__1__Impl )
            // InternalGraphQL.g:2906:2: rule__NamedType__Group__1__Impl
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
    // InternalGraphQL.g:2912:1: rule__NamedType__Group__1__Impl : ( ( rule__NamedType__NonNullAssignment_1 )? ) ;
    public final void rule__NamedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2916:1: ( ( ( rule__NamedType__NonNullAssignment_1 )? ) )
            // InternalGraphQL.g:2917:1: ( ( rule__NamedType__NonNullAssignment_1 )? )
            {
            // InternalGraphQL.g:2917:1: ( ( rule__NamedType__NonNullAssignment_1 )? )
            // InternalGraphQL.g:2918:2: ( rule__NamedType__NonNullAssignment_1 )?
            {
             before(grammarAccess.getNamedTypeAccess().getNonNullAssignment_1()); 
            // InternalGraphQL.g:2919:2: ( rule__NamedType__NonNullAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGraphQL.g:2919:3: rule__NamedType__NonNullAssignment_1
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
    // InternalGraphQL.g:2928:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2932:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // InternalGraphQL.g:2933:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGraphQL.g:2940:1: rule__ListType__Group__0__Impl : ( '[' ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2944:1: ( ( '[' ) )
            // InternalGraphQL.g:2945:1: ( '[' )
            {
            // InternalGraphQL.g:2945:1: ( '[' )
            // InternalGraphQL.g:2946:2: '['
            {
             before(grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGraphQL.g:2955:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2959:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // InternalGraphQL.g:2960:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalGraphQL.g:2967:1: rule__ListType__Group__1__Impl : ( ( rule__ListType__TypeAssignment_1 ) ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2971:1: ( ( ( rule__ListType__TypeAssignment_1 ) ) )
            // InternalGraphQL.g:2972:1: ( ( rule__ListType__TypeAssignment_1 ) )
            {
            // InternalGraphQL.g:2972:1: ( ( rule__ListType__TypeAssignment_1 ) )
            // InternalGraphQL.g:2973:2: ( rule__ListType__TypeAssignment_1 )
            {
             before(grammarAccess.getListTypeAccess().getTypeAssignment_1()); 
            // InternalGraphQL.g:2974:2: ( rule__ListType__TypeAssignment_1 )
            // InternalGraphQL.g:2974:3: rule__ListType__TypeAssignment_1
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
    // InternalGraphQL.g:2982:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2986:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // InternalGraphQL.g:2987:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalGraphQL.g:2994:1: rule__ListType__Group__2__Impl : ( ']' ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:2998:1: ( ( ']' ) )
            // InternalGraphQL.g:2999:1: ( ']' )
            {
            // InternalGraphQL.g:2999:1: ( ']' )
            // InternalGraphQL.g:3000:2: ']'
            {
             before(grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGraphQL.g:3009:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3013:1: ( rule__ListType__Group__3__Impl )
            // InternalGraphQL.g:3014:2: rule__ListType__Group__3__Impl
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
    // InternalGraphQL.g:3020:1: rule__ListType__Group__3__Impl : ( ( rule__ListType__NonNullAssignment_3 )? ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3024:1: ( ( ( rule__ListType__NonNullAssignment_3 )? ) )
            // InternalGraphQL.g:3025:1: ( ( rule__ListType__NonNullAssignment_3 )? )
            {
            // InternalGraphQL.g:3025:1: ( ( rule__ListType__NonNullAssignment_3 )? )
            // InternalGraphQL.g:3026:2: ( rule__ListType__NonNullAssignment_3 )?
            {
             before(grammarAccess.getListTypeAccess().getNonNullAssignment_3()); 
            // InternalGraphQL.g:3027:2: ( rule__ListType__NonNullAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGraphQL.g:3027:3: rule__ListType__NonNullAssignment_3
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
    // InternalGraphQL.g:3036:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3040:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGraphQL.g:3041:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalGraphQL.g:3048:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3052:1: ( ( () ) )
            // InternalGraphQL.g:3053:1: ( () )
            {
            // InternalGraphQL.g:3053:1: ( () )
            // InternalGraphQL.g:3054:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalGraphQL.g:3055:2: ()
            // InternalGraphQL.g:3055:3: 
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
    // InternalGraphQL.g:3063:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3067:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGraphQL.g:3068:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalGraphQL.g:3075:1: rule__ObjectValue__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3079:1: ( ( '{' ) )
            // InternalGraphQL.g:3080:1: ( '{' )
            {
            // InternalGraphQL.g:3080:1: ( '{' )
            // InternalGraphQL.g:3081:2: '{'
            {
             before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGraphQL.g:3090:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3094:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGraphQL.g:3095:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalGraphQL.g:3102:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__FieldsAssignment_2 )* ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3106:1: ( ( ( rule__ObjectValue__FieldsAssignment_2 )* ) )
            // InternalGraphQL.g:3107:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            {
            // InternalGraphQL.g:3107:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            // InternalGraphQL.g:3108:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            {
             before(grammarAccess.getObjectValueAccess().getFieldsAssignment_2()); 
            // InternalGraphQL.g:3109:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_NAME) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGraphQL.g:3109:3: rule__ObjectValue__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ObjectValue__FieldsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalGraphQL.g:3117:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3121:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGraphQL.g:3122:2: rule__ObjectValue__Group__3__Impl
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
    // InternalGraphQL.g:3128:1: rule__ObjectValue__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3132:1: ( ( '}' ) )
            // InternalGraphQL.g:3133:1: ( '}' )
            {
            // InternalGraphQL.g:3133:1: ( '}' )
            // InternalGraphQL.g:3134:2: '}'
            {
             before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphQL.g:3144:1: rule__ObjectField__Group__0 : rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 ;
    public final void rule__ObjectField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3148:1: ( rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 )
            // InternalGraphQL.g:3149:2: rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1
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
    // InternalGraphQL.g:3156:1: rule__ObjectField__Group__0__Impl : ( ( rule__ObjectField__NameAssignment_0 ) ) ;
    public final void rule__ObjectField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3160:1: ( ( ( rule__ObjectField__NameAssignment_0 ) ) )
            // InternalGraphQL.g:3161:1: ( ( rule__ObjectField__NameAssignment_0 ) )
            {
            // InternalGraphQL.g:3161:1: ( ( rule__ObjectField__NameAssignment_0 ) )
            // InternalGraphQL.g:3162:2: ( rule__ObjectField__NameAssignment_0 )
            {
             before(grammarAccess.getObjectFieldAccess().getNameAssignment_0()); 
            // InternalGraphQL.g:3163:2: ( rule__ObjectField__NameAssignment_0 )
            // InternalGraphQL.g:3163:3: rule__ObjectField__NameAssignment_0
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
    // InternalGraphQL.g:3171:1: rule__ObjectField__Group__1 : rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 ;
    public final void rule__ObjectField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3175:1: ( rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 )
            // InternalGraphQL.g:3176:2: rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalGraphQL.g:3183:1: rule__ObjectField__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjectField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3187:1: ( ( ':' ) )
            // InternalGraphQL.g:3188:1: ( ':' )
            {
            // InternalGraphQL.g:3188:1: ( ':' )
            // InternalGraphQL.g:3189:2: ':'
            {
             before(grammarAccess.getObjectFieldAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphQL.g:3198:1: rule__ObjectField__Group__2 : rule__ObjectField__Group__2__Impl ;
    public final void rule__ObjectField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3202:1: ( rule__ObjectField__Group__2__Impl )
            // InternalGraphQL.g:3203:2: rule__ObjectField__Group__2__Impl
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
    // InternalGraphQL.g:3209:1: rule__ObjectField__Group__2__Impl : ( ( rule__ObjectField__ValueAssignment_2 ) ) ;
    public final void rule__ObjectField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3213:1: ( ( ( rule__ObjectField__ValueAssignment_2 ) ) )
            // InternalGraphQL.g:3214:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            {
            // InternalGraphQL.g:3214:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            // InternalGraphQL.g:3215:2: ( rule__ObjectField__ValueAssignment_2 )
            {
             before(grammarAccess.getObjectFieldAccess().getValueAssignment_2()); 
            // InternalGraphQL.g:3216:2: ( rule__ObjectField__ValueAssignment_2 )
            // InternalGraphQL.g:3216:3: rule__ObjectField__ValueAssignment_2
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
    // InternalGraphQL.g:3225:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3229:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalGraphQL.g:3230:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalGraphQL.g:3237:1: rule__ListValue__Group__0__Impl : ( () ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3241:1: ( ( () ) )
            // InternalGraphQL.g:3242:1: ( () )
            {
            // InternalGraphQL.g:3242:1: ( () )
            // InternalGraphQL.g:3243:2: ()
            {
             before(grammarAccess.getListValueAccess().getListValueAction_0()); 
            // InternalGraphQL.g:3244:2: ()
            // InternalGraphQL.g:3244:3: 
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
    // InternalGraphQL.g:3252:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3256:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalGraphQL.g:3257:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalGraphQL.g:3264:1: rule__ListValue__Group__1__Impl : ( '[' ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3268:1: ( ( '[' ) )
            // InternalGraphQL.g:3269:1: ( '[' )
            {
            // InternalGraphQL.g:3269:1: ( '[' )
            // InternalGraphQL.g:3270:2: '['
            {
             before(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGraphQL.g:3279:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3283:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalGraphQL.g:3284:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalGraphQL.g:3291:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__ValuesAssignment_2 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3295:1: ( ( ( rule__ListValue__ValuesAssignment_2 )* ) )
            // InternalGraphQL.g:3296:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            {
            // InternalGraphQL.g:3296:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            // InternalGraphQL.g:3297:2: ( rule__ListValue__ValuesAssignment_2 )*
            {
             before(grammarAccess.getListValueAccess().getValuesAssignment_2()); 
            // InternalGraphQL.g:3298:2: ( rule__ListValue__ValuesAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_NAME && LA36_0<=RULE_FLOAT_VALUE)||(LA36_0>=13 && LA36_0<=14)||LA36_0==19||LA36_0==32||LA36_0==35) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGraphQL.g:3298:3: rule__ListValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__ListValue__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalGraphQL.g:3306:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3310:1: ( rule__ListValue__Group__3__Impl )
            // InternalGraphQL.g:3311:2: rule__ListValue__Group__3__Impl
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
    // InternalGraphQL.g:3317:1: rule__ListValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3321:1: ( ( ']' ) )
            // InternalGraphQL.g:3322:1: ( ']' )
            {
            // InternalGraphQL.g:3322:1: ( ']' )
            // InternalGraphQL.g:3323:2: ']'
            {
             before(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0"
    // InternalGraphQL.g:3333:1: rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 : ( ruleSchemaDefinition ) ;
    public final void rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3337:1: ( ( ruleSchemaDefinition ) )
            // InternalGraphQL.g:3338:2: ( ruleSchemaDefinition )
            {
            // InternalGraphQL.g:3338:2: ( ruleSchemaDefinition )
            // InternalGraphQL.g:3339:3: ruleSchemaDefinition
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
    // InternalGraphQL.g:3348:1: rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 : ( ruleTypeDefinition ) ;
    public final void rule__TypeSystemDefinition__TypeDefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3352:1: ( ( ruleTypeDefinition ) )
            // InternalGraphQL.g:3353:2: ( ruleTypeDefinition )
            {
            // InternalGraphQL.g:3353:2: ( ruleTypeDefinition )
            // InternalGraphQL.g:3354:3: ruleTypeDefinition
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


    // $ANTLR start "rule__SchemaDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:3363:1: rule__SchemaDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__SchemaDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3367:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3368:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3368:2: ( ruleStringValue )
            // InternalGraphQL.g:3369:3: ruleStringValue
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
    // InternalGraphQL.g:3378:1: rule__SchemaDefinition__TypeDefinitionsAssignment_3 : ( ruleRootOperationTypeDefinition ) ;
    public final void rule__SchemaDefinition__TypeDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3382:1: ( ( ruleRootOperationTypeDefinition ) )
            // InternalGraphQL.g:3383:2: ( ruleRootOperationTypeDefinition )
            {
            // InternalGraphQL.g:3383:2: ( ruleRootOperationTypeDefinition )
            // InternalGraphQL.g:3384:3: ruleRootOperationTypeDefinition
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
    // InternalGraphQL.g:3393:1: rule__RootOperationTypeDefinition__OperationTypeAssignment_0 : ( ruleOperationType ) ;
    public final void rule__RootOperationTypeDefinition__OperationTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3397:1: ( ( ruleOperationType ) )
            // InternalGraphQL.g:3398:2: ( ruleOperationType )
            {
            // InternalGraphQL.g:3398:2: ( ruleOperationType )
            // InternalGraphQL.g:3399:3: ruleOperationType
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
    // InternalGraphQL.g:3408:1: rule__RootOperationTypeDefinition__TypeAssignment_2 : ( ( RULE_NAME ) ) ;
    public final void rule__RootOperationTypeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3412:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:3413:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:3413:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3414:3: ( RULE_NAME )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0()); 
            // InternalGraphQL.g:3415:3: ( RULE_NAME )
            // InternalGraphQL.g:3416:4: RULE_NAME
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
    // InternalGraphQL.g:3427:1: rule__ScalarTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__ScalarTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3431:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3432:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3432:2: ( ruleStringValue )
            // InternalGraphQL.g:3433:3: ruleStringValue
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
    // InternalGraphQL.g:3442:1: rule__ScalarTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__ScalarTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3446:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3447:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3447:2: ( RULE_NAME )
            // InternalGraphQL.g:3448:3: RULE_NAME
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
    // InternalGraphQL.g:3457:1: rule__ObjectTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__ObjectTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3461:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3462:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3462:2: ( ruleStringValue )
            // InternalGraphQL.g:3463:3: ruleStringValue
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
    // InternalGraphQL.g:3472:1: rule__ObjectTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__ObjectTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3476:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3477:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3477:2: ( RULE_NAME )
            // InternalGraphQL.g:3478:3: RULE_NAME
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
    // InternalGraphQL.g:3487:1: rule__ObjectTypeDefinition__ImplementsAssignment_3_1 : ( ruleIntersectionType ) ;
    public final void rule__ObjectTypeDefinition__ImplementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3491:1: ( ( ruleIntersectionType ) )
            // InternalGraphQL.g:3492:2: ( ruleIntersectionType )
            {
            // InternalGraphQL.g:3492:2: ( ruleIntersectionType )
            // InternalGraphQL.g:3493:3: ruleIntersectionType
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


    // $ANTLR start "rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1"
    // InternalGraphQL.g:3502:1: rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1 : ( ruleFieldDefinition ) ;
    public final void rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3506:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:3507:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:3507:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:3508:3: ruleFieldDefinition
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDefinition();

            state._fsp--;

             after(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__FieldDefinitionsAssignment_4_1"


    // $ANTLR start "rule__InterfaceDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:3517:1: rule__InterfaceDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InterfaceDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3521:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3522:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3522:2: ( ruleStringValue )
            // InternalGraphQL.g:3523:3: ruleStringValue
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
    // InternalGraphQL.g:3532:1: rule__InterfaceDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__InterfaceDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3536:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3537:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3537:2: ( RULE_NAME )
            // InternalGraphQL.g:3538:3: RULE_NAME
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
    // InternalGraphQL.g:3547:1: rule__InterfaceDefinition__ImplementsAssignment_3_1 : ( ruleIntersectionType ) ;
    public final void rule__InterfaceDefinition__ImplementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3551:1: ( ( ruleIntersectionType ) )
            // InternalGraphQL.g:3552:2: ( ruleIntersectionType )
            {
            // InternalGraphQL.g:3552:2: ( ruleIntersectionType )
            // InternalGraphQL.g:3553:3: ruleIntersectionType
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
    // InternalGraphQL.g:3562:1: rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1 : ( ruleFieldDefinition ) ;
    public final void rule__InterfaceDefinition__FieldDefinitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3566:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:3567:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:3567:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:3568:3: ruleFieldDefinition
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
    // InternalGraphQL.g:3577:1: rule__FieldDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__FieldDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3581:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3582:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3582:2: ( ruleStringValue )
            // InternalGraphQL.g:3583:3: ruleStringValue
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
    // InternalGraphQL.g:3592:1: rule__FieldDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__FieldDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3596:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3597:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3597:2: ( RULE_NAME )
            // InternalGraphQL.g:3598:3: RULE_NAME
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


    // $ANTLR start "rule__FieldDefinition__TypeAssignment_3"
    // InternalGraphQL.g:3607:1: rule__FieldDefinition__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__FieldDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3611:1: ( ( ruleType ) )
            // InternalGraphQL.g:3612:2: ( ruleType )
            {
            // InternalGraphQL.g:3612:2: ( ruleType )
            // InternalGraphQL.g:3613:3: ruleType
            {
             before(grammarAccess.getFieldDefinitionAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFieldDefinitionAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__TypeAssignment_3"


    // $ANTLR start "rule__UnionTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:3622:1: rule__UnionTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__UnionTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3626:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3627:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3627:2: ( ruleStringValue )
            // InternalGraphQL.g:3628:3: ruleStringValue
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
    // InternalGraphQL.g:3637:1: rule__UnionTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__UnionTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3641:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3642:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3642:2: ( RULE_NAME )
            // InternalGraphQL.g:3643:3: RULE_NAME
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


    // $ANTLR start "rule__UnionTypeDefinition__MemberTypesAssignment_3_1"
    // InternalGraphQL.g:3652:1: rule__UnionTypeDefinition__MemberTypesAssignment_3_1 : ( ruleType ) ;
    public final void rule__UnionTypeDefinition__MemberTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3656:1: ( ( ruleType ) )
            // InternalGraphQL.g:3657:2: ( ruleType )
            {
            // InternalGraphQL.g:3657:2: ( ruleType )
            // InternalGraphQL.g:3658:3: ruleType
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__MemberTypesAssignment_3_1"


    // $ANTLR start "rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1"
    // InternalGraphQL.g:3667:1: rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1 : ( ruleType ) ;
    public final void rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3671:1: ( ( ruleType ) )
            // InternalGraphQL.g:3672:2: ( ruleType )
            {
            // InternalGraphQL.g:3672:2: ( ruleType )
            // InternalGraphQL.g:3673:3: ruleType
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__MemberTypesAssignment_3_2_1"


    // $ANTLR start "rule__EnumTypeDefinition__DescriptionAssignment_0"
    // InternalGraphQL.g:3682:1: rule__EnumTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__EnumTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3686:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3687:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3687:2: ( ruleStringValue )
            // InternalGraphQL.g:3688:3: ruleStringValue
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
    // InternalGraphQL.g:3697:1: rule__EnumTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__EnumTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3701:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3702:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3702:2: ( RULE_NAME )
            // InternalGraphQL.g:3703:3: RULE_NAME
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
    // InternalGraphQL.g:3712:1: rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1 : ( ruleEnumValueDefinition ) ;
    public final void rule__EnumTypeDefinition__ValueDefinitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3716:1: ( ( ruleEnumValueDefinition ) )
            // InternalGraphQL.g:3717:2: ( ruleEnumValueDefinition )
            {
            // InternalGraphQL.g:3717:2: ( ruleEnumValueDefinition )
            // InternalGraphQL.g:3718:3: ruleEnumValueDefinition
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
    // InternalGraphQL.g:3727:1: rule__EnumValueDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__EnumValueDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3731:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3732:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3732:2: ( ruleStringValue )
            // InternalGraphQL.g:3733:3: ruleStringValue
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
    // InternalGraphQL.g:3742:1: rule__EnumValueDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__EnumValueDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3746:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3747:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3747:2: ( RULE_NAME )
            // InternalGraphQL.g:3748:3: RULE_NAME
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
    // InternalGraphQL.g:3757:1: rule__InputObjectTypeDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InputObjectTypeDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3761:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3762:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3762:2: ( ruleStringValue )
            // InternalGraphQL.g:3763:3: ruleStringValue
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
    // InternalGraphQL.g:3772:1: rule__InputObjectTypeDefinition__NameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__InputObjectTypeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3776:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3777:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3777:2: ( RULE_NAME )
            // InternalGraphQL.g:3778:3: RULE_NAME
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
    // InternalGraphQL.g:3787:1: rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1 : ( ruleInputValueDefinition ) ;
    public final void rule__InputObjectTypeDefinition__InputsFieldDefinitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3791:1: ( ( ruleInputValueDefinition ) )
            // InternalGraphQL.g:3792:2: ( ruleInputValueDefinition )
            {
            // InternalGraphQL.g:3792:2: ( ruleInputValueDefinition )
            // InternalGraphQL.g:3793:3: ruleInputValueDefinition
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
    // InternalGraphQL.g:3802:1: rule__InputValueDefinition__DescriptionAssignment_0 : ( ruleStringValue ) ;
    public final void rule__InputValueDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3806:1: ( ( ruleStringValue ) )
            // InternalGraphQL.g:3807:2: ( ruleStringValue )
            {
            // InternalGraphQL.g:3807:2: ( ruleStringValue )
            // InternalGraphQL.g:3808:3: ruleStringValue
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
    // InternalGraphQL.g:3817:1: rule__InputValueDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__InputValueDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3821:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3822:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:3822:2: ( RULE_NAME )
            // InternalGraphQL.g:3823:3: RULE_NAME
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
    // InternalGraphQL.g:3832:1: rule__InputValueDefinition__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__InputValueDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3836:1: ( ( ruleType ) )
            // InternalGraphQL.g:3837:2: ( ruleType )
            {
            // InternalGraphQL.g:3837:2: ( ruleType )
            // InternalGraphQL.g:3838:3: ruleType
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
    // InternalGraphQL.g:3847:1: rule__InputValueDefinition__DefaultValueAssignment_4_1 : ( ruleConstValue ) ;
    public final void rule__InputValueDefinition__DefaultValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3851:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:3852:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:3852:2: ( ruleConstValue )
            // InternalGraphQL.g:3853:3: ruleConstValue
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


    // $ANTLR start "rule__IntersectionType__MemberTypesAssignment_0"
    // InternalGraphQL.g:3862:1: rule__IntersectionType__MemberTypesAssignment_0 : ( ruleType ) ;
    public final void rule__IntersectionType__MemberTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3866:1: ( ( ruleType ) )
            // InternalGraphQL.g:3867:2: ( ruleType )
            {
            // InternalGraphQL.g:3867:2: ( ruleType )
            // InternalGraphQL.g:3868:3: ruleType
            {
             before(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionType__MemberTypesAssignment_0"


    // $ANTLR start "rule__IntersectionType__MemberTypesAssignment_1_1"
    // InternalGraphQL.g:3877:1: rule__IntersectionType__MemberTypesAssignment_1_1 : ( ruleType ) ;
    public final void rule__IntersectionType__MemberTypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3881:1: ( ( ruleType ) )
            // InternalGraphQL.g:3882:2: ( ruleType )
            {
            // InternalGraphQL.g:3882:2: ( ruleType )
            // InternalGraphQL.g:3883:3: ruleType
            {
             before(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIntersectionTypeAccess().getMemberTypesTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionType__MemberTypesAssignment_1_1"


    // $ANTLR start "rule__NamedType__TypeDefinitionAssignment_0"
    // InternalGraphQL.g:3892:1: rule__NamedType__TypeDefinitionAssignment_0 : ( ( RULE_NAME ) ) ;
    public final void rule__NamedType__TypeDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3896:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:3897:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:3897:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:3898:3: ( RULE_NAME )
            {
             before(grammarAccess.getNamedTypeAccess().getTypeDefinitionTypeDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:3899:3: ( RULE_NAME )
            // InternalGraphQL.g:3900:4: RULE_NAME
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
    // InternalGraphQL.g:3911:1: rule__NamedType__NonNullAssignment_1 : ( ( '!' ) ) ;
    public final void rule__NamedType__NonNullAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3915:1: ( ( ( '!' ) ) )
            // InternalGraphQL.g:3916:2: ( ( '!' ) )
            {
            // InternalGraphQL.g:3916:2: ( ( '!' ) )
            // InternalGraphQL.g:3917:3: ( '!' )
            {
             before(grammarAccess.getNamedTypeAccess().getNonNullExclamationMarkKeyword_1_0()); 
            // InternalGraphQL.g:3918:3: ( '!' )
            // InternalGraphQL.g:3919:4: '!'
            {
             before(grammarAccess.getNamedTypeAccess().getNonNullExclamationMarkKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGraphQL.g:3930:1: rule__ListType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__ListType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3934:1: ( ( ruleType ) )
            // InternalGraphQL.g:3935:2: ( ruleType )
            {
            // InternalGraphQL.g:3935:2: ( ruleType )
            // InternalGraphQL.g:3936:3: ruleType
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
    // InternalGraphQL.g:3945:1: rule__ListType__NonNullAssignment_3 : ( ( '!' ) ) ;
    public final void rule__ListType__NonNullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3949:1: ( ( ( '!' ) ) )
            // InternalGraphQL.g:3950:2: ( ( '!' ) )
            {
            // InternalGraphQL.g:3950:2: ( ( '!' ) )
            // InternalGraphQL.g:3951:3: ( '!' )
            {
             before(grammarAccess.getListTypeAccess().getNonNullExclamationMarkKeyword_3_0()); 
            // InternalGraphQL.g:3952:3: ( '!' )
            // InternalGraphQL.g:3953:4: '!'
            {
             before(grammarAccess.getListTypeAccess().getNonNullExclamationMarkKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGraphQL.g:3964:1: rule__IntValue__ValueAssignment : ( RULE_INT_VALUE ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3968:1: ( ( RULE_INT_VALUE ) )
            // InternalGraphQL.g:3969:2: ( RULE_INT_VALUE )
            {
            // InternalGraphQL.g:3969:2: ( RULE_INT_VALUE )
            // InternalGraphQL.g:3970:3: RULE_INT_VALUE
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
    // InternalGraphQL.g:3979:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT_VALUE ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3983:1: ( ( RULE_FLOAT_VALUE ) )
            // InternalGraphQL.g:3984:2: ( RULE_FLOAT_VALUE )
            {
            // InternalGraphQL.g:3984:2: ( RULE_FLOAT_VALUE )
            // InternalGraphQL.g:3985:3: RULE_FLOAT_VALUE
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
    // InternalGraphQL.g:3994:1: rule__NullValue__ValueAssignment : ( ( 'null' ) ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:3998:1: ( ( ( 'null' ) ) )
            // InternalGraphQL.g:3999:2: ( ( 'null' ) )
            {
            // InternalGraphQL.g:3999:2: ( ( 'null' ) )
            // InternalGraphQL.g:4000:3: ( 'null' )
            {
             before(grammarAccess.getNullValueAccess().getValueNullKeyword_0()); 
            // InternalGraphQL.g:4001:3: ( 'null' )
            // InternalGraphQL.g:4002:4: 'null'
            {
             before(grammarAccess.getNullValueAccess().getValueNullKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGraphQL.g:4013:1: rule__StringValue__ValueAssignment : ( ( rule__StringValue__ValueAlternatives_0 ) ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4017:1: ( ( ( rule__StringValue__ValueAlternatives_0 ) ) )
            // InternalGraphQL.g:4018:2: ( ( rule__StringValue__ValueAlternatives_0 ) )
            {
            // InternalGraphQL.g:4018:2: ( ( rule__StringValue__ValueAlternatives_0 ) )
            // InternalGraphQL.g:4019:3: ( rule__StringValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getStringValueAccess().getValueAlternatives_0()); 
            // InternalGraphQL.g:4020:3: ( rule__StringValue__ValueAlternatives_0 )
            // InternalGraphQL.g:4020:4: rule__StringValue__ValueAlternatives_0
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
    // InternalGraphQL.g:4028:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4032:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // InternalGraphQL.g:4033:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // InternalGraphQL.g:4033:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // InternalGraphQL.g:4034:3: ( rule__BooleanValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            // InternalGraphQL.g:4035:3: ( rule__BooleanValue__ValueAlternatives_0 )
            // InternalGraphQL.g:4035:4: rule__BooleanValue__ValueAlternatives_0
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
    // InternalGraphQL.g:4043:1: rule__EnumValue__ValueAssignment : ( ( RULE_NAME ) ) ;
    public final void rule__EnumValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4047:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:4048:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:4048:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4049:3: ( RULE_NAME )
            {
             before(grammarAccess.getEnumValueAccess().getValueEnumValueDefinitionCrossReference_0()); 
            // InternalGraphQL.g:4050:3: ( RULE_NAME )
            // InternalGraphQL.g:4051:4: RULE_NAME
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
    // InternalGraphQL.g:4062:1: rule__ObjectValue__FieldsAssignment_2 : ( ruleObjectField ) ;
    public final void rule__ObjectValue__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4066:1: ( ( ruleObjectField ) )
            // InternalGraphQL.g:4067:2: ( ruleObjectField )
            {
            // InternalGraphQL.g:4067:2: ( ruleObjectField )
            // InternalGraphQL.g:4068:3: ruleObjectField
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
    // InternalGraphQL.g:4077:1: rule__ObjectField__NameAssignment_0 : ( ( RULE_NAME ) ) ;
    public final void rule__ObjectField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4081:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:4082:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:4082:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:4083:3: ( RULE_NAME )
            {
             before(grammarAccess.getObjectFieldAccess().getNameFieldDefinitionCrossReference_0_0()); 
            // InternalGraphQL.g:4084:3: ( RULE_NAME )
            // InternalGraphQL.g:4085:4: RULE_NAME
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
    // InternalGraphQL.g:4096:1: rule__ObjectField__ValueAssignment_2 : ( ruleConstValue ) ;
    public final void rule__ObjectField__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4100:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:4101:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:4101:2: ( ruleConstValue )
            // InternalGraphQL.g:4102:3: ruleConstValue
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
    // InternalGraphQL.g:4111:1: rule__ListValue__ValuesAssignment_2 : ( ruleConstValue ) ;
    public final void rule__ListValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:4115:1: ( ( ruleConstValue ) )
            // InternalGraphQL.g:4116:2: ( ruleConstValue )
            {
            // InternalGraphQL.g:4116:2: ( ruleConstValue )
            // InternalGraphQL.g:4117:3: ruleConstValue
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000066C40032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000066C40030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000009000861C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000B000861C0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000009000861C2L});

}