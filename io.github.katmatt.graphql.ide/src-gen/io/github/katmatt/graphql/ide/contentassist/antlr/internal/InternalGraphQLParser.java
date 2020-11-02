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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_WS", "RULE_SL_COMMENT", "RULE_COMMA", "'query'", "'mutation'", "'subscription'", "'schema'", "'{'", "'}'", "':'", "'scalar'", "'type'", "'interface'", "'union'", "'='", "'|'", "'enum'", "'input'"
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=18)||(LA1_0>=21 && LA1_0<=22)) ) {
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
    // InternalGraphQL.g:312:1: ruleEnumValueDefinition : ( ( rule__EnumValueDefinition__NameAssignment ) ) ;
    public final void ruleEnumValueDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:316:2: ( ( ( rule__EnumValueDefinition__NameAssignment ) ) )
            // InternalGraphQL.g:317:2: ( ( rule__EnumValueDefinition__NameAssignment ) )
            {
            // InternalGraphQL.g:317:2: ( ( rule__EnumValueDefinition__NameAssignment ) )
            // InternalGraphQL.g:318:3: ( rule__EnumValueDefinition__NameAssignment )
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getNameAssignment()); 
            // InternalGraphQL.g:319:3: ( rule__EnumValueDefinition__NameAssignment )
            // InternalGraphQL.g:319:4: rule__EnumValueDefinition__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumValueDefinition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueDefinitionAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "ruleOperationType"
    // InternalGraphQL.g:353:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:357:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalGraphQL.g:358:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalGraphQL.g:358:2: ( ( rule__OperationType__Alternatives ) )
            // InternalGraphQL.g:359:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalGraphQL.g:360:3: ( rule__OperationType__Alternatives )
            // InternalGraphQL.g:360:4: rule__OperationType__Alternatives
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
    // InternalGraphQL.g:368:1: rule__TypeSystemDefinition__Alternatives : ( ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) ) | ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) ) );
    public final void rule__TypeSystemDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:372:1: ( ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) ) | ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=18)||(LA2_0>=21 && LA2_0<=22)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphQL.g:373:2: ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) )
                    {
                    // InternalGraphQL.g:373:2: ( ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 ) )
                    // InternalGraphQL.g:374:3: ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getSchemaDefinitionsAssignment_0()); 
                    // InternalGraphQL.g:375:3: ( rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 )
                    // InternalGraphQL.g:375:4: rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0
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
                    // InternalGraphQL.g:379:2: ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) )
                    {
                    // InternalGraphQL.g:379:2: ( ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 ) )
                    // InternalGraphQL.g:380:3: ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 )
                    {
                     before(grammarAccess.getTypeSystemDefinitionAccess().getTypeDefinitionsAssignment_1()); 
                    // InternalGraphQL.g:381:3: ( rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 )
                    // InternalGraphQL.g:381:4: rule__TypeSystemDefinition__TypeDefinitionsAssignment_1
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
    // InternalGraphQL.g:389:1: rule__TypeDefinition__Alternatives : ( ( ruleScalarTypeDefinition ) | ( ruleObjectTypeDefinition ) | ( ruleInterfaceDefinition ) | ( ruleUnionTypeDefinition ) | ( ruleEnumTypeDefinition ) | ( ruleInputObjectTypeDefinition ) );
    public final void rule__TypeDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:393:1: ( ( ruleScalarTypeDefinition ) | ( ruleObjectTypeDefinition ) | ( ruleInterfaceDefinition ) | ( ruleUnionTypeDefinition ) | ( ruleEnumTypeDefinition ) | ( ruleInputObjectTypeDefinition ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            case 22:
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
                    // InternalGraphQL.g:394:2: ( ruleScalarTypeDefinition )
                    {
                    // InternalGraphQL.g:394:2: ( ruleScalarTypeDefinition )
                    // InternalGraphQL.g:395:3: ruleScalarTypeDefinition
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
                    // InternalGraphQL.g:400:2: ( ruleObjectTypeDefinition )
                    {
                    // InternalGraphQL.g:400:2: ( ruleObjectTypeDefinition )
                    // InternalGraphQL.g:401:3: ruleObjectTypeDefinition
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
                    // InternalGraphQL.g:406:2: ( ruleInterfaceDefinition )
                    {
                    // InternalGraphQL.g:406:2: ( ruleInterfaceDefinition )
                    // InternalGraphQL.g:407:3: ruleInterfaceDefinition
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
                    // InternalGraphQL.g:412:2: ( ruleUnionTypeDefinition )
                    {
                    // InternalGraphQL.g:412:2: ( ruleUnionTypeDefinition )
                    // InternalGraphQL.g:413:3: ruleUnionTypeDefinition
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
                    // InternalGraphQL.g:418:2: ( ruleEnumTypeDefinition )
                    {
                    // InternalGraphQL.g:418:2: ( ruleEnumTypeDefinition )
                    // InternalGraphQL.g:419:3: ruleEnumTypeDefinition
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
                    // InternalGraphQL.g:424:2: ( ruleInputObjectTypeDefinition )
                    {
                    // InternalGraphQL.g:424:2: ( ruleInputObjectTypeDefinition )
                    // InternalGraphQL.g:425:3: ruleInputObjectTypeDefinition
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


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalGraphQL.g:434:1: rule__OperationType__Alternatives : ( ( ( 'query' ) ) | ( ( 'mutation' ) ) | ( ( 'subscription' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:438:1: ( ( ( 'query' ) ) | ( ( 'mutation' ) ) | ( ( 'subscription' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt4=1;
                }
                break;
            case 9:
                {
                alt4=2;
                }
                break;
            case 10:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGraphQL.g:439:2: ( ( 'query' ) )
                    {
                    // InternalGraphQL.g:439:2: ( ( 'query' ) )
                    // InternalGraphQL.g:440:3: ( 'query' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0()); 
                    // InternalGraphQL.g:441:3: ( 'query' )
                    // InternalGraphQL.g:441:4: 'query'
                    {
                    match(input,8,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getQUERYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:445:2: ( ( 'mutation' ) )
                    {
                    // InternalGraphQL.g:445:2: ( ( 'mutation' ) )
                    // InternalGraphQL.g:446:3: ( 'mutation' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1()); 
                    // InternalGraphQL.g:447:3: ( 'mutation' )
                    // InternalGraphQL.g:447:4: 'mutation'
                    {
                    match(input,9,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getMUTATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphQL.g:451:2: ( ( 'subscription' ) )
                    {
                    // InternalGraphQL.g:451:2: ( ( 'subscription' ) )
                    // InternalGraphQL.g:452:3: ( 'subscription' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getSUBSCRIPTIONEnumLiteralDeclaration_2()); 
                    // InternalGraphQL.g:453:3: ( 'subscription' )
                    // InternalGraphQL.g:453:4: 'subscription'
                    {
                    match(input,10,FOLLOW_2); 

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
    // InternalGraphQL.g:461:1: rule__SchemaDefinition__Group__0 : rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1 ;
    public final void rule__SchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:465:1: ( rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1 )
            // InternalGraphQL.g:466:2: rule__SchemaDefinition__Group__0__Impl rule__SchemaDefinition__Group__1
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
    // InternalGraphQL.g:473:1: rule__SchemaDefinition__Group__0__Impl : ( 'schema' ) ;
    public final void rule__SchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:477:1: ( ( 'schema' ) )
            // InternalGraphQL.g:478:1: ( 'schema' )
            {
            // InternalGraphQL.g:478:1: ( 'schema' )
            // InternalGraphQL.g:479:2: 'schema'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSchemaDefinitionAccess().getSchemaKeyword_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:488:1: rule__SchemaDefinition__Group__1 : rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2 ;
    public final void rule__SchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:492:1: ( rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2 )
            // InternalGraphQL.g:493:2: rule__SchemaDefinition__Group__1__Impl rule__SchemaDefinition__Group__2
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
    // InternalGraphQL.g:500:1: rule__SchemaDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__SchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:504:1: ( ( '{' ) )
            // InternalGraphQL.g:505:1: ( '{' )
            {
            // InternalGraphQL.g:505:1: ( '{' )
            // InternalGraphQL.g:506:2: '{'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSchemaDefinitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGraphQL.g:515:1: rule__SchemaDefinition__Group__2 : rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3 ;
    public final void rule__SchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:519:1: ( rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3 )
            // InternalGraphQL.g:520:2: rule__SchemaDefinition__Group__2__Impl rule__SchemaDefinition__Group__3
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
    // InternalGraphQL.g:527:1: rule__SchemaDefinition__Group__2__Impl : ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )* ) ) ;
    public final void rule__SchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:531:1: ( ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )* ) ) )
            // InternalGraphQL.g:532:1: ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )* ) )
            {
            // InternalGraphQL.g:532:1: ( ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )* ) )
            // InternalGraphQL.g:533:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 ) ) ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )* )
            {
            // InternalGraphQL.g:533:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 ) )
            // InternalGraphQL.g:534:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_2()); 
            // InternalGraphQL.g:535:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )
            // InternalGraphQL.g:535:4: rule__SchemaDefinition__TypeDefinitionsAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__SchemaDefinition__TypeDefinitionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_2()); 

            }

            // InternalGraphQL.g:538:2: ( ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )* )
            // InternalGraphQL.g:539:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )*
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_2()); 
            // InternalGraphQL.g:540:3: ( rule__SchemaDefinition__TypeDefinitionsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=8 && LA5_0<=10)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGraphQL.g:540:4: rule__SchemaDefinition__TypeDefinitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SchemaDefinition__TypeDefinitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsAssignment_2()); 

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
    // $ANTLR end "rule__SchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__SchemaDefinition__Group__3"
    // InternalGraphQL.g:549:1: rule__SchemaDefinition__Group__3 : rule__SchemaDefinition__Group__3__Impl ;
    public final void rule__SchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:553:1: ( rule__SchemaDefinition__Group__3__Impl )
            // InternalGraphQL.g:554:2: rule__SchemaDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchemaDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalGraphQL.g:560:1: rule__SchemaDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__SchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:564:1: ( ( '}' ) )
            // InternalGraphQL.g:565:1: ( '}' )
            {
            // InternalGraphQL.g:565:1: ( '}' )
            // InternalGraphQL.g:566:2: '}'
            {
             before(grammarAccess.getSchemaDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSchemaDefinitionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__RootOperationTypeDefinition__Group__0"
    // InternalGraphQL.g:576:1: rule__RootOperationTypeDefinition__Group__0 : rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1 ;
    public final void rule__RootOperationTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:580:1: ( rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1 )
            // InternalGraphQL.g:581:2: rule__RootOperationTypeDefinition__Group__0__Impl rule__RootOperationTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGraphQL.g:588:1: rule__RootOperationTypeDefinition__Group__0__Impl : ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) ) ;
    public final void rule__RootOperationTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:592:1: ( ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) ) )
            // InternalGraphQL.g:593:1: ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) )
            {
            // InternalGraphQL.g:593:1: ( ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 ) )
            // InternalGraphQL.g:594:2: ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getOperationTypeAssignment_0()); 
            // InternalGraphQL.g:595:2: ( rule__RootOperationTypeDefinition__OperationTypeAssignment_0 )
            // InternalGraphQL.g:595:3: rule__RootOperationTypeDefinition__OperationTypeAssignment_0
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
    // InternalGraphQL.g:603:1: rule__RootOperationTypeDefinition__Group__1 : rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2 ;
    public final void rule__RootOperationTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:607:1: ( rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2 )
            // InternalGraphQL.g:608:2: rule__RootOperationTypeDefinition__Group__1__Impl rule__RootOperationTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGraphQL.g:615:1: rule__RootOperationTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RootOperationTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:619:1: ( ( ':' ) )
            // InternalGraphQL.g:620:1: ( ':' )
            {
            // InternalGraphQL.g:620:1: ( ':' )
            // InternalGraphQL.g:621:2: ':'
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGraphQL.g:630:1: rule__RootOperationTypeDefinition__Group__2 : rule__RootOperationTypeDefinition__Group__2__Impl ;
    public final void rule__RootOperationTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:634:1: ( rule__RootOperationTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:635:2: rule__RootOperationTypeDefinition__Group__2__Impl
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
    // InternalGraphQL.g:641:1: rule__RootOperationTypeDefinition__Group__2__Impl : ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__RootOperationTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:645:1: ( ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) ) )
            // InternalGraphQL.g:646:1: ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) )
            {
            // InternalGraphQL.g:646:1: ( ( rule__RootOperationTypeDefinition__TypeAssignment_2 ) )
            // InternalGraphQL.g:647:2: ( rule__RootOperationTypeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeAssignment_2()); 
            // InternalGraphQL.g:648:2: ( rule__RootOperationTypeDefinition__TypeAssignment_2 )
            // InternalGraphQL.g:648:3: rule__RootOperationTypeDefinition__TypeAssignment_2
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
    // InternalGraphQL.g:657:1: rule__ScalarTypeDefinition__Group__0 : rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1 ;
    public final void rule__ScalarTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:661:1: ( rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1 )
            // InternalGraphQL.g:662:2: rule__ScalarTypeDefinition__Group__0__Impl rule__ScalarTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGraphQL.g:669:1: rule__ScalarTypeDefinition__Group__0__Impl : ( 'scalar' ) ;
    public final void rule__ScalarTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:673:1: ( ( 'scalar' ) )
            // InternalGraphQL.g:674:1: ( 'scalar' )
            {
            // InternalGraphQL.g:674:1: ( 'scalar' )
            // InternalGraphQL.g:675:2: 'scalar'
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getScalarTypeDefinitionAccess().getScalarKeyword_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:684:1: rule__ScalarTypeDefinition__Group__1 : rule__ScalarTypeDefinition__Group__1__Impl ;
    public final void rule__ScalarTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:688:1: ( rule__ScalarTypeDefinition__Group__1__Impl )
            // InternalGraphQL.g:689:2: rule__ScalarTypeDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalGraphQL.g:695:1: rule__ScalarTypeDefinition__Group__1__Impl : ( ( rule__ScalarTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__ScalarTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:699:1: ( ( ( rule__ScalarTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:700:1: ( ( rule__ScalarTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:700:1: ( ( rule__ScalarTypeDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:701:2: ( rule__ScalarTypeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:702:2: ( rule__ScalarTypeDefinition__NameAssignment_1 )
            // InternalGraphQL.g:702:3: rule__ScalarTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScalarTypeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScalarTypeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ObjectTypeDefinition__Group__0"
    // InternalGraphQL.g:711:1: rule__ObjectTypeDefinition__Group__0 : rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1 ;
    public final void rule__ObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:715:1: ( rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1 )
            // InternalGraphQL.g:716:2: rule__ObjectTypeDefinition__Group__0__Impl rule__ObjectTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGraphQL.g:723:1: rule__ObjectTypeDefinition__Group__0__Impl : ( 'type' ) ;
    public final void rule__ObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:727:1: ( ( 'type' ) )
            // InternalGraphQL.g:728:1: ( 'type' )
            {
            // InternalGraphQL.g:728:1: ( 'type' )
            // InternalGraphQL.g:729:2: 'type'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getTypeKeyword_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:738:1: rule__ObjectTypeDefinition__Group__1 : rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2 ;
    public final void rule__ObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:742:1: ( rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2 )
            // InternalGraphQL.g:743:2: rule__ObjectTypeDefinition__Group__1__Impl rule__ObjectTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGraphQL.g:750:1: rule__ObjectTypeDefinition__Group__1__Impl : ( ( rule__ObjectTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__ObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:754:1: ( ( ( rule__ObjectTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:755:1: ( ( rule__ObjectTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:755:1: ( ( rule__ObjectTypeDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:756:2: ( rule__ObjectTypeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:757:2: ( rule__ObjectTypeDefinition__NameAssignment_1 )
            // InternalGraphQL.g:757:3: rule__ObjectTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGraphQL.g:765:1: rule__ObjectTypeDefinition__Group__2 : rule__ObjectTypeDefinition__Group__2__Impl ;
    public final void rule__ObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:769:1: ( rule__ObjectTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:770:2: rule__ObjectTypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGraphQL.g:776:1: rule__ObjectTypeDefinition__Group__2__Impl : ( ( rule__ObjectTypeDefinition__Group_2__0 )? ) ;
    public final void rule__ObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:780:1: ( ( ( rule__ObjectTypeDefinition__Group_2__0 )? ) )
            // InternalGraphQL.g:781:1: ( ( rule__ObjectTypeDefinition__Group_2__0 )? )
            {
            // InternalGraphQL.g:781:1: ( ( rule__ObjectTypeDefinition__Group_2__0 )? )
            // InternalGraphQL.g:782:2: ( rule__ObjectTypeDefinition__Group_2__0 )?
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getGroup_2()); 
            // InternalGraphQL.g:783:2: ( rule__ObjectTypeDefinition__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphQL.g:783:3: rule__ObjectTypeDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectTypeDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectTypeDefinitionAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ObjectTypeDefinition__Group_2__0"
    // InternalGraphQL.g:792:1: rule__ObjectTypeDefinition__Group_2__0 : rule__ObjectTypeDefinition__Group_2__0__Impl rule__ObjectTypeDefinition__Group_2__1 ;
    public final void rule__ObjectTypeDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:796:1: ( rule__ObjectTypeDefinition__Group_2__0__Impl rule__ObjectTypeDefinition__Group_2__1 )
            // InternalGraphQL.g:797:2: rule__ObjectTypeDefinition__Group_2__0__Impl rule__ObjectTypeDefinition__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ObjectTypeDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_2__0"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_2__0__Impl"
    // InternalGraphQL.g:804:1: rule__ObjectTypeDefinition__Group_2__0__Impl : ( '{' ) ;
    public final void rule__ObjectTypeDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:808:1: ( ( '{' ) )
            // InternalGraphQL.g:809:1: ( '{' )
            {
            // InternalGraphQL.g:809:1: ( '{' )
            // InternalGraphQL.g:810:2: '{'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_2__1"
    // InternalGraphQL.g:819:1: rule__ObjectTypeDefinition__Group_2__1 : rule__ObjectTypeDefinition__Group_2__1__Impl rule__ObjectTypeDefinition__Group_2__2 ;
    public final void rule__ObjectTypeDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:823:1: ( rule__ObjectTypeDefinition__Group_2__1__Impl rule__ObjectTypeDefinition__Group_2__2 )
            // InternalGraphQL.g:824:2: rule__ObjectTypeDefinition__Group_2__1__Impl rule__ObjectTypeDefinition__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__ObjectTypeDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_2__1"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_2__1__Impl"
    // InternalGraphQL.g:831:1: rule__ObjectTypeDefinition__Group_2__1__Impl : ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )* ) ;
    public final void rule__ObjectTypeDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:835:1: ( ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )* ) )
            // InternalGraphQL.g:836:1: ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )* )
            {
            // InternalGraphQL.g:836:1: ( ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )* )
            // InternalGraphQL.g:837:2: ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )*
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_2_1()); 
            // InternalGraphQL.g:838:2: ( rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_NAME) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGraphQL.g:838:3: rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_2__2"
    // InternalGraphQL.g:846:1: rule__ObjectTypeDefinition__Group_2__2 : rule__ObjectTypeDefinition__Group_2__2__Impl ;
    public final void rule__ObjectTypeDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:850:1: ( rule__ObjectTypeDefinition__Group_2__2__Impl )
            // InternalGraphQL.g:851:2: rule__ObjectTypeDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_2__2"


    // $ANTLR start "rule__ObjectTypeDefinition__Group_2__2__Impl"
    // InternalGraphQL.g:857:1: rule__ObjectTypeDefinition__Group_2__2__Impl : ( '}' ) ;
    public final void rule__ObjectTypeDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:861:1: ( ( '}' ) )
            // InternalGraphQL.g:862:1: ( '}' )
            {
            // InternalGraphQL.g:862:1: ( '}' )
            // InternalGraphQL.g:863:2: '}'
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__0"
    // InternalGraphQL.g:873:1: rule__InterfaceDefinition__Group__0 : rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:877:1: ( rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 )
            // InternalGraphQL.g:878:2: rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGraphQL.g:885:1: rule__InterfaceDefinition__Group__0__Impl : ( 'interface' ) ;
    public final void rule__InterfaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:889:1: ( ( 'interface' ) )
            // InternalGraphQL.g:890:1: ( 'interface' )
            {
            // InternalGraphQL.g:890:1: ( 'interface' )
            // InternalGraphQL.g:891:2: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:900:1: rule__InterfaceDefinition__Group__1 : rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:904:1: ( rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 )
            // InternalGraphQL.g:905:2: rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGraphQL.g:912:1: rule__InterfaceDefinition__Group__1__Impl : ( ( rule__InterfaceDefinition__NameAssignment_1 ) ) ;
    public final void rule__InterfaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:916:1: ( ( ( rule__InterfaceDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:917:1: ( ( rule__InterfaceDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:917:1: ( ( rule__InterfaceDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:918:2: ( rule__InterfaceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:919:2: ( rule__InterfaceDefinition__NameAssignment_1 )
            // InternalGraphQL.g:919:3: rule__InterfaceDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGraphQL.g:927:1: rule__InterfaceDefinition__Group__2 : rule__InterfaceDefinition__Group__2__Impl ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:931:1: ( rule__InterfaceDefinition__Group__2__Impl )
            // InternalGraphQL.g:932:2: rule__InterfaceDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGraphQL.g:938:1: rule__InterfaceDefinition__Group__2__Impl : ( ( rule__InterfaceDefinition__Group_2__0 )? ) ;
    public final void rule__InterfaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:942:1: ( ( ( rule__InterfaceDefinition__Group_2__0 )? ) )
            // InternalGraphQL.g:943:1: ( ( rule__InterfaceDefinition__Group_2__0 )? )
            {
            // InternalGraphQL.g:943:1: ( ( rule__InterfaceDefinition__Group_2__0 )? )
            // InternalGraphQL.g:944:2: ( rule__InterfaceDefinition__Group_2__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_2()); 
            // InternalGraphQL.g:945:2: ( rule__InterfaceDefinition__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGraphQL.g:945:3: rule__InterfaceDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InterfaceDefinition__Group_2__0"
    // InternalGraphQL.g:954:1: rule__InterfaceDefinition__Group_2__0 : rule__InterfaceDefinition__Group_2__0__Impl rule__InterfaceDefinition__Group_2__1 ;
    public final void rule__InterfaceDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:958:1: ( rule__InterfaceDefinition__Group_2__0__Impl rule__InterfaceDefinition__Group_2__1 )
            // InternalGraphQL.g:959:2: rule__InterfaceDefinition__Group_2__0__Impl rule__InterfaceDefinition__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__InterfaceDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_2__0"


    // $ANTLR start "rule__InterfaceDefinition__Group_2__0__Impl"
    // InternalGraphQL.g:966:1: rule__InterfaceDefinition__Group_2__0__Impl : ( '{' ) ;
    public final void rule__InterfaceDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:970:1: ( ( '{' ) )
            // InternalGraphQL.g:971:1: ( '{' )
            {
            // InternalGraphQL.g:971:1: ( '{' )
            // InternalGraphQL.g:972:2: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_2__1"
    // InternalGraphQL.g:981:1: rule__InterfaceDefinition__Group_2__1 : rule__InterfaceDefinition__Group_2__1__Impl rule__InterfaceDefinition__Group_2__2 ;
    public final void rule__InterfaceDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:985:1: ( rule__InterfaceDefinition__Group_2__1__Impl rule__InterfaceDefinition__Group_2__2 )
            // InternalGraphQL.g:986:2: rule__InterfaceDefinition__Group_2__1__Impl rule__InterfaceDefinition__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__InterfaceDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_2__1"


    // $ANTLR start "rule__InterfaceDefinition__Group_2__1__Impl"
    // InternalGraphQL.g:993:1: rule__InterfaceDefinition__Group_2__1__Impl : ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1 )* ) ;
    public final void rule__InterfaceDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:997:1: ( ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1 )* ) )
            // InternalGraphQL.g:998:1: ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1 )* )
            {
            // InternalGraphQL.g:998:1: ( ( rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1 )* )
            // InternalGraphQL.g:999:2: ( rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsAssignment_2_1()); 
            // InternalGraphQL.g:1000:2: ( rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_NAME) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGraphQL.g:1000:3: rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group_2__2"
    // InternalGraphQL.g:1008:1: rule__InterfaceDefinition__Group_2__2 : rule__InterfaceDefinition__Group_2__2__Impl ;
    public final void rule__InterfaceDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1012:1: ( rule__InterfaceDefinition__Group_2__2__Impl )
            // InternalGraphQL.g:1013:2: rule__InterfaceDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_2__2"


    // $ANTLR start "rule__InterfaceDefinition__Group_2__2__Impl"
    // InternalGraphQL.g:1019:1: rule__InterfaceDefinition__Group_2__2__Impl : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1023:1: ( ( '}' ) )
            // InternalGraphQL.g:1024:1: ( '}' )
            {
            // InternalGraphQL.g:1024:1: ( '}' )
            // InternalGraphQL.g:1025:2: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__FieldDefinition__Group__0"
    // InternalGraphQL.g:1035:1: rule__FieldDefinition__Group__0 : rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1 ;
    public final void rule__FieldDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1039:1: ( rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1 )
            // InternalGraphQL.g:1040:2: rule__FieldDefinition__Group__0__Impl rule__FieldDefinition__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGraphQL.g:1047:1: rule__FieldDefinition__Group__0__Impl : ( ( rule__FieldDefinition__NameAssignment_0 ) ) ;
    public final void rule__FieldDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1051:1: ( ( ( rule__FieldDefinition__NameAssignment_0 ) ) )
            // InternalGraphQL.g:1052:1: ( ( rule__FieldDefinition__NameAssignment_0 ) )
            {
            // InternalGraphQL.g:1052:1: ( ( rule__FieldDefinition__NameAssignment_0 ) )
            // InternalGraphQL.g:1053:2: ( rule__FieldDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getNameAssignment_0()); 
            // InternalGraphQL.g:1054:2: ( rule__FieldDefinition__NameAssignment_0 )
            // InternalGraphQL.g:1054:3: rule__FieldDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:1062:1: rule__FieldDefinition__Group__1 : rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2 ;
    public final void rule__FieldDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1066:1: ( rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2 )
            // InternalGraphQL.g:1067:2: rule__FieldDefinition__Group__1__Impl rule__FieldDefinition__Group__2
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
    // InternalGraphQL.g:1074:1: rule__FieldDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FieldDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1078:1: ( ( ':' ) )
            // InternalGraphQL.g:1079:1: ( ':' )
            {
            // InternalGraphQL.g:1079:1: ( ':' )
            // InternalGraphQL.g:1080:2: ':'
            {
             before(grammarAccess.getFieldDefinitionAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFieldDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalGraphQL.g:1089:1: rule__FieldDefinition__Group__2 : rule__FieldDefinition__Group__2__Impl ;
    public final void rule__FieldDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1093:1: ( rule__FieldDefinition__Group__2__Impl )
            // InternalGraphQL.g:1094:2: rule__FieldDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGraphQL.g:1100:1: rule__FieldDefinition__Group__2__Impl : ( ( rule__FieldDefinition__TypeAssignment_2 ) ) ;
    public final void rule__FieldDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1104:1: ( ( ( rule__FieldDefinition__TypeAssignment_2 ) ) )
            // InternalGraphQL.g:1105:1: ( ( rule__FieldDefinition__TypeAssignment_2 ) )
            {
            // InternalGraphQL.g:1105:1: ( ( rule__FieldDefinition__TypeAssignment_2 ) )
            // InternalGraphQL.g:1106:2: ( rule__FieldDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldDefinitionAccess().getTypeAssignment_2()); 
            // InternalGraphQL.g:1107:2: ( rule__FieldDefinition__TypeAssignment_2 )
            // InternalGraphQL.g:1107:3: rule__FieldDefinition__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldDefinition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldDefinitionAccess().getTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__UnionTypeDefinition__Group__0"
    // InternalGraphQL.g:1116:1: rule__UnionTypeDefinition__Group__0 : rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1 ;
    public final void rule__UnionTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1120:1: ( rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1 )
            // InternalGraphQL.g:1121:2: rule__UnionTypeDefinition__Group__0__Impl rule__UnionTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGraphQL.g:1128:1: rule__UnionTypeDefinition__Group__0__Impl : ( 'union' ) ;
    public final void rule__UnionTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1132:1: ( ( 'union' ) )
            // InternalGraphQL.g:1133:1: ( 'union' )
            {
            // InternalGraphQL.g:1133:1: ( 'union' )
            // InternalGraphQL.g:1134:2: 'union'
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getUnionKeyword_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:1143:1: rule__UnionTypeDefinition__Group__1 : rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2 ;
    public final void rule__UnionTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1147:1: ( rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2 )
            // InternalGraphQL.g:1148:2: rule__UnionTypeDefinition__Group__1__Impl rule__UnionTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGraphQL.g:1155:1: rule__UnionTypeDefinition__Group__1__Impl : ( ( rule__UnionTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__UnionTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1159:1: ( ( ( rule__UnionTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:1160:1: ( ( rule__UnionTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:1160:1: ( ( rule__UnionTypeDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:1161:2: ( rule__UnionTypeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:1162:2: ( rule__UnionTypeDefinition__NameAssignment_1 )
            // InternalGraphQL.g:1162:3: rule__UnionTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGraphQL.g:1170:1: rule__UnionTypeDefinition__Group__2 : rule__UnionTypeDefinition__Group__2__Impl ;
    public final void rule__UnionTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1174:1: ( rule__UnionTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:1175:2: rule__UnionTypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGraphQL.g:1181:1: rule__UnionTypeDefinition__Group__2__Impl : ( ( rule__UnionTypeDefinition__Group_2__0 )? ) ;
    public final void rule__UnionTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1185:1: ( ( ( rule__UnionTypeDefinition__Group_2__0 )? ) )
            // InternalGraphQL.g:1186:1: ( ( rule__UnionTypeDefinition__Group_2__0 )? )
            {
            // InternalGraphQL.g:1186:1: ( ( rule__UnionTypeDefinition__Group_2__0 )? )
            // InternalGraphQL.g:1187:2: ( rule__UnionTypeDefinition__Group_2__0 )?
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup_2()); 
            // InternalGraphQL.g:1188:2: ( rule__UnionTypeDefinition__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:1188:3: rule__UnionTypeDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnionTypeDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__UnionTypeDefinition__Group_2__0"
    // InternalGraphQL.g:1197:1: rule__UnionTypeDefinition__Group_2__0 : rule__UnionTypeDefinition__Group_2__0__Impl rule__UnionTypeDefinition__Group_2__1 ;
    public final void rule__UnionTypeDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1201:1: ( rule__UnionTypeDefinition__Group_2__0__Impl rule__UnionTypeDefinition__Group_2__1 )
            // InternalGraphQL.g:1202:2: rule__UnionTypeDefinition__Group_2__0__Impl rule__UnionTypeDefinition__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__UnionTypeDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2__0"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2__0__Impl"
    // InternalGraphQL.g:1209:1: rule__UnionTypeDefinition__Group_2__0__Impl : ( '=' ) ;
    public final void rule__UnionTypeDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1213:1: ( ( '=' ) )
            // InternalGraphQL.g:1214:1: ( '=' )
            {
            // InternalGraphQL.g:1214:1: ( '=' )
            // InternalGraphQL.g:1215:2: '='
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2__1"
    // InternalGraphQL.g:1224:1: rule__UnionTypeDefinition__Group_2__1 : rule__UnionTypeDefinition__Group_2__1__Impl rule__UnionTypeDefinition__Group_2__2 ;
    public final void rule__UnionTypeDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1228:1: ( rule__UnionTypeDefinition__Group_2__1__Impl rule__UnionTypeDefinition__Group_2__2 )
            // InternalGraphQL.g:1229:2: rule__UnionTypeDefinition__Group_2__1__Impl rule__UnionTypeDefinition__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__UnionTypeDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2__1"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2__1__Impl"
    // InternalGraphQL.g:1236:1: rule__UnionTypeDefinition__Group_2__1__Impl : ( ( rule__UnionTypeDefinition__MemberTypesAssignment_2_1 ) ) ;
    public final void rule__UnionTypeDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1240:1: ( ( ( rule__UnionTypeDefinition__MemberTypesAssignment_2_1 ) ) )
            // InternalGraphQL.g:1241:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_2_1 ) )
            {
            // InternalGraphQL.g:1241:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_2_1 ) )
            // InternalGraphQL.g:1242:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_2_1 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_2_1()); 
            // InternalGraphQL.g:1243:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_2_1 )
            // InternalGraphQL.g:1243:3: rule__UnionTypeDefinition__MemberTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__MemberTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2__2"
    // InternalGraphQL.g:1251:1: rule__UnionTypeDefinition__Group_2__2 : rule__UnionTypeDefinition__Group_2__2__Impl ;
    public final void rule__UnionTypeDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1255:1: ( rule__UnionTypeDefinition__Group_2__2__Impl )
            // InternalGraphQL.g:1256:2: rule__UnionTypeDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2__2"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2__2__Impl"
    // InternalGraphQL.g:1262:1: rule__UnionTypeDefinition__Group_2__2__Impl : ( ( rule__UnionTypeDefinition__Group_2_2__0 )* ) ;
    public final void rule__UnionTypeDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1266:1: ( ( ( rule__UnionTypeDefinition__Group_2_2__0 )* ) )
            // InternalGraphQL.g:1267:1: ( ( rule__UnionTypeDefinition__Group_2_2__0 )* )
            {
            // InternalGraphQL.g:1267:1: ( ( rule__UnionTypeDefinition__Group_2_2__0 )* )
            // InternalGraphQL.g:1268:2: ( rule__UnionTypeDefinition__Group_2_2__0 )*
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getGroup_2_2()); 
            // InternalGraphQL.g:1269:2: ( rule__UnionTypeDefinition__Group_2_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraphQL.g:1269:3: rule__UnionTypeDefinition__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__UnionTypeDefinition__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getUnionTypeDefinitionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2_2__0"
    // InternalGraphQL.g:1278:1: rule__UnionTypeDefinition__Group_2_2__0 : rule__UnionTypeDefinition__Group_2_2__0__Impl rule__UnionTypeDefinition__Group_2_2__1 ;
    public final void rule__UnionTypeDefinition__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1282:1: ( rule__UnionTypeDefinition__Group_2_2__0__Impl rule__UnionTypeDefinition__Group_2_2__1 )
            // InternalGraphQL.g:1283:2: rule__UnionTypeDefinition__Group_2_2__0__Impl rule__UnionTypeDefinition__Group_2_2__1
            {
            pushFollow(FOLLOW_9);
            rule__UnionTypeDefinition__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2_2__0"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2_2__0__Impl"
    // InternalGraphQL.g:1290:1: rule__UnionTypeDefinition__Group_2_2__0__Impl : ( '|' ) ;
    public final void rule__UnionTypeDefinition__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1294:1: ( ( '|' ) )
            // InternalGraphQL.g:1295:1: ( '|' )
            {
            // InternalGraphQL.g:1295:1: ( '|' )
            // InternalGraphQL.g:1296:2: '|'
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_2_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getVerticalLineKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2_2__0__Impl"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2_2__1"
    // InternalGraphQL.g:1305:1: rule__UnionTypeDefinition__Group_2_2__1 : rule__UnionTypeDefinition__Group_2_2__1__Impl ;
    public final void rule__UnionTypeDefinition__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1309:1: ( rule__UnionTypeDefinition__Group_2_2__1__Impl )
            // InternalGraphQL.g:1310:2: rule__UnionTypeDefinition__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2_2__1"


    // $ANTLR start "rule__UnionTypeDefinition__Group_2_2__1__Impl"
    // InternalGraphQL.g:1316:1: rule__UnionTypeDefinition__Group_2_2__1__Impl : ( ( rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1 ) ) ;
    public final void rule__UnionTypeDefinition__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1320:1: ( ( ( rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1 ) ) )
            // InternalGraphQL.g:1321:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1 ) )
            {
            // InternalGraphQL.g:1321:1: ( ( rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1 ) )
            // InternalGraphQL.g:1322:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1 )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_2_2_1()); 
            // InternalGraphQL.g:1323:2: ( rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1 )
            // InternalGraphQL.g:1323:3: rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__Group_2_2__1__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group__0"
    // InternalGraphQL.g:1332:1: rule__EnumTypeDefinition__Group__0 : rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1 ;
    public final void rule__EnumTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1336:1: ( rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1 )
            // InternalGraphQL.g:1337:2: rule__EnumTypeDefinition__Group__0__Impl rule__EnumTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGraphQL.g:1344:1: rule__EnumTypeDefinition__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1348:1: ( ( 'enum' ) )
            // InternalGraphQL.g:1349:1: ( 'enum' )
            {
            // InternalGraphQL.g:1349:1: ( 'enum' )
            // InternalGraphQL.g:1350:2: 'enum'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getEnumKeyword_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:1359:1: rule__EnumTypeDefinition__Group__1 : rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2 ;
    public final void rule__EnumTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1363:1: ( rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2 )
            // InternalGraphQL.g:1364:2: rule__EnumTypeDefinition__Group__1__Impl rule__EnumTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGraphQL.g:1371:1: rule__EnumTypeDefinition__Group__1__Impl : ( ( rule__EnumTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__EnumTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1375:1: ( ( ( rule__EnumTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:1376:1: ( ( rule__EnumTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:1376:1: ( ( rule__EnumTypeDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:1377:2: ( rule__EnumTypeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:1378:2: ( rule__EnumTypeDefinition__NameAssignment_1 )
            // InternalGraphQL.g:1378:3: rule__EnumTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGraphQL.g:1386:1: rule__EnumTypeDefinition__Group__2 : rule__EnumTypeDefinition__Group__2__Impl ;
    public final void rule__EnumTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1390:1: ( rule__EnumTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:1391:2: rule__EnumTypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGraphQL.g:1397:1: rule__EnumTypeDefinition__Group__2__Impl : ( ( rule__EnumTypeDefinition__Group_2__0 )? ) ;
    public final void rule__EnumTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1401:1: ( ( ( rule__EnumTypeDefinition__Group_2__0 )? ) )
            // InternalGraphQL.g:1402:1: ( ( rule__EnumTypeDefinition__Group_2__0 )? )
            {
            // InternalGraphQL.g:1402:1: ( ( rule__EnumTypeDefinition__Group_2__0 )? )
            // InternalGraphQL.g:1403:2: ( rule__EnumTypeDefinition__Group_2__0 )?
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getGroup_2()); 
            // InternalGraphQL.g:1404:2: ( rule__EnumTypeDefinition__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphQL.g:1404:3: rule__EnumTypeDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumTypeDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDefinitionAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumTypeDefinition__Group_2__0"
    // InternalGraphQL.g:1413:1: rule__EnumTypeDefinition__Group_2__0 : rule__EnumTypeDefinition__Group_2__0__Impl rule__EnumTypeDefinition__Group_2__1 ;
    public final void rule__EnumTypeDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1417:1: ( rule__EnumTypeDefinition__Group_2__0__Impl rule__EnumTypeDefinition__Group_2__1 )
            // InternalGraphQL.g:1418:2: rule__EnumTypeDefinition__Group_2__0__Impl rule__EnumTypeDefinition__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__EnumTypeDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_2__0"


    // $ANTLR start "rule__EnumTypeDefinition__Group_2__0__Impl"
    // InternalGraphQL.g:1425:1: rule__EnumTypeDefinition__Group_2__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1429:1: ( ( '{' ) )
            // InternalGraphQL.g:1430:1: ( '{' )
            {
            // InternalGraphQL.g:1430:1: ( '{' )
            // InternalGraphQL.g:1431:2: '{'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group_2__1"
    // InternalGraphQL.g:1440:1: rule__EnumTypeDefinition__Group_2__1 : rule__EnumTypeDefinition__Group_2__1__Impl rule__EnumTypeDefinition__Group_2__2 ;
    public final void rule__EnumTypeDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1444:1: ( rule__EnumTypeDefinition__Group_2__1__Impl rule__EnumTypeDefinition__Group_2__2 )
            // InternalGraphQL.g:1445:2: rule__EnumTypeDefinition__Group_2__1__Impl rule__EnumTypeDefinition__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__EnumTypeDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_2__1"


    // $ANTLR start "rule__EnumTypeDefinition__Group_2__1__Impl"
    // InternalGraphQL.g:1452:1: rule__EnumTypeDefinition__Group_2__1__Impl : ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1 ) ) ;
    public final void rule__EnumTypeDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1456:1: ( ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1 ) ) )
            // InternalGraphQL.g:1457:1: ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1 ) )
            {
            // InternalGraphQL.g:1457:1: ( ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1 ) )
            // InternalGraphQL.g:1458:2: ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsAssignment_2_1()); 
            // InternalGraphQL.g:1459:2: ( rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1 )
            // InternalGraphQL.g:1459:3: rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__EnumTypeDefinition__Group_2__2"
    // InternalGraphQL.g:1467:1: rule__EnumTypeDefinition__Group_2__2 : rule__EnumTypeDefinition__Group_2__2__Impl ;
    public final void rule__EnumTypeDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1471:1: ( rule__EnumTypeDefinition__Group_2__2__Impl )
            // InternalGraphQL.g:1472:2: rule__EnumTypeDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_2__2"


    // $ANTLR start "rule__EnumTypeDefinition__Group_2__2__Impl"
    // InternalGraphQL.g:1478:1: rule__EnumTypeDefinition__Group_2__2__Impl : ( '}' ) ;
    public final void rule__EnumTypeDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1482:1: ( ( '}' ) )
            // InternalGraphQL.g:1483:1: ( '}' )
            {
            // InternalGraphQL.g:1483:1: ( '}' )
            // InternalGraphQL.g:1484:2: '}'
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group__0"
    // InternalGraphQL.g:1494:1: rule__InputObjectTypeDefinition__Group__0 : rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1 ;
    public final void rule__InputObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1498:1: ( rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1 )
            // InternalGraphQL.g:1499:2: rule__InputObjectTypeDefinition__Group__0__Impl rule__InputObjectTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGraphQL.g:1506:1: rule__InputObjectTypeDefinition__Group__0__Impl : ( 'input' ) ;
    public final void rule__InputObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1510:1: ( ( 'input' ) )
            // InternalGraphQL.g:1511:1: ( 'input' )
            {
            // InternalGraphQL.g:1511:1: ( 'input' )
            // InternalGraphQL.g:1512:2: 'input'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getInputKeyword_0()); 

            }


            }

        }
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
    // InternalGraphQL.g:1521:1: rule__InputObjectTypeDefinition__Group__1 : rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2 ;
    public final void rule__InputObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1525:1: ( rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2 )
            // InternalGraphQL.g:1526:2: rule__InputObjectTypeDefinition__Group__1__Impl rule__InputObjectTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGraphQL.g:1533:1: rule__InputObjectTypeDefinition__Group__1__Impl : ( ( rule__InputObjectTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__InputObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1537:1: ( ( ( rule__InputObjectTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphQL.g:1538:1: ( ( rule__InputObjectTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:1538:1: ( ( rule__InputObjectTypeDefinition__NameAssignment_1 ) )
            // InternalGraphQL.g:1539:2: ( rule__InputObjectTypeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:1540:2: ( rule__InputObjectTypeDefinition__NameAssignment_1 )
            // InternalGraphQL.g:1540:3: rule__InputObjectTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGraphQL.g:1548:1: rule__InputObjectTypeDefinition__Group__2 : rule__InputObjectTypeDefinition__Group__2__Impl ;
    public final void rule__InputObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1552:1: ( rule__InputObjectTypeDefinition__Group__2__Impl )
            // InternalGraphQL.g:1553:2: rule__InputObjectTypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGraphQL.g:1559:1: rule__InputObjectTypeDefinition__Group__2__Impl : ( ( rule__InputObjectTypeDefinition__Group_2__0 )? ) ;
    public final void rule__InputObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1563:1: ( ( ( rule__InputObjectTypeDefinition__Group_2__0 )? ) )
            // InternalGraphQL.g:1564:1: ( ( rule__InputObjectTypeDefinition__Group_2__0 )? )
            {
            // InternalGraphQL.g:1564:1: ( ( rule__InputObjectTypeDefinition__Group_2__0 )? )
            // InternalGraphQL.g:1565:2: ( rule__InputObjectTypeDefinition__Group_2__0 )?
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup_2()); 
            // InternalGraphQL.g:1566:2: ( rule__InputObjectTypeDefinition__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:1566:3: rule__InputObjectTypeDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputObjectTypeDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_2__0"
    // InternalGraphQL.g:1575:1: rule__InputObjectTypeDefinition__Group_2__0 : rule__InputObjectTypeDefinition__Group_2__0__Impl rule__InputObjectTypeDefinition__Group_2__1 ;
    public final void rule__InputObjectTypeDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1579:1: ( rule__InputObjectTypeDefinition__Group_2__0__Impl rule__InputObjectTypeDefinition__Group_2__1 )
            // InternalGraphQL.g:1580:2: rule__InputObjectTypeDefinition__Group_2__0__Impl rule__InputObjectTypeDefinition__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__InputObjectTypeDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_2__0"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_2__0__Impl"
    // InternalGraphQL.g:1587:1: rule__InputObjectTypeDefinition__Group_2__0__Impl : ( '{' ) ;
    public final void rule__InputObjectTypeDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1591:1: ( ( '{' ) )
            // InternalGraphQL.g:1592:1: ( '{' )
            {
            // InternalGraphQL.g:1592:1: ( '{' )
            // InternalGraphQL.g:1593:2: '{'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_2__1"
    // InternalGraphQL.g:1602:1: rule__InputObjectTypeDefinition__Group_2__1 : rule__InputObjectTypeDefinition__Group_2__1__Impl rule__InputObjectTypeDefinition__Group_2__2 ;
    public final void rule__InputObjectTypeDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1606:1: ( rule__InputObjectTypeDefinition__Group_2__1__Impl rule__InputObjectTypeDefinition__Group_2__2 )
            // InternalGraphQL.g:1607:2: rule__InputObjectTypeDefinition__Group_2__1__Impl rule__InputObjectTypeDefinition__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__InputObjectTypeDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_2__1"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_2__1__Impl"
    // InternalGraphQL.g:1614:1: rule__InputObjectTypeDefinition__Group_2__1__Impl : ( ( rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )* ) ;
    public final void rule__InputObjectTypeDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1618:1: ( ( ( rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )* ) )
            // InternalGraphQL.g:1619:1: ( ( rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )* )
            {
            // InternalGraphQL.g:1619:1: ( ( rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )* )
            // InternalGraphQL.g:1620:2: ( rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )*
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_2_1()); 
            // InternalGraphQL.g:1621:2: ( rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_NAME) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGraphQL.g:1621:3: rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getFieldDefinitionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_2__2"
    // InternalGraphQL.g:1629:1: rule__InputObjectTypeDefinition__Group_2__2 : rule__InputObjectTypeDefinition__Group_2__2__Impl ;
    public final void rule__InputObjectTypeDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1633:1: ( rule__InputObjectTypeDefinition__Group_2__2__Impl )
            // InternalGraphQL.g:1634:2: rule__InputObjectTypeDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputObjectTypeDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_2__2"


    // $ANTLR start "rule__InputObjectTypeDefinition__Group_2__2__Impl"
    // InternalGraphQL.g:1640:1: rule__InputObjectTypeDefinition__Group_2__2__Impl : ( '}' ) ;
    public final void rule__InputObjectTypeDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1644:1: ( ( '}' ) )
            // InternalGraphQL.g:1645:1: ( '}' )
            {
            // InternalGraphQL.g:1645:1: ( '}' )
            // InternalGraphQL.g:1646:2: '}'
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0"
    // InternalGraphQL.g:1656:1: rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0 : ( ruleSchemaDefinition ) ;
    public final void rule__TypeSystemDefinition__SchemaDefinitionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1660:1: ( ( ruleSchemaDefinition ) )
            // InternalGraphQL.g:1661:2: ( ruleSchemaDefinition )
            {
            // InternalGraphQL.g:1661:2: ( ruleSchemaDefinition )
            // InternalGraphQL.g:1662:3: ruleSchemaDefinition
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
    // InternalGraphQL.g:1671:1: rule__TypeSystemDefinition__TypeDefinitionsAssignment_1 : ( ruleTypeDefinition ) ;
    public final void rule__TypeSystemDefinition__TypeDefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1675:1: ( ( ruleTypeDefinition ) )
            // InternalGraphQL.g:1676:2: ( ruleTypeDefinition )
            {
            // InternalGraphQL.g:1676:2: ( ruleTypeDefinition )
            // InternalGraphQL.g:1677:3: ruleTypeDefinition
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


    // $ANTLR start "rule__SchemaDefinition__TypeDefinitionsAssignment_2"
    // InternalGraphQL.g:1686:1: rule__SchemaDefinition__TypeDefinitionsAssignment_2 : ( ruleRootOperationTypeDefinition ) ;
    public final void rule__SchemaDefinition__TypeDefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1690:1: ( ( ruleRootOperationTypeDefinition ) )
            // InternalGraphQL.g:1691:2: ( ruleRootOperationTypeDefinition )
            {
            // InternalGraphQL.g:1691:2: ( ruleRootOperationTypeDefinition )
            // InternalGraphQL.g:1692:3: ruleRootOperationTypeDefinition
            {
             before(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsRootOperationTypeDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRootOperationTypeDefinition();

            state._fsp--;

             after(grammarAccess.getSchemaDefinitionAccess().getTypeDefinitionsRootOperationTypeDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaDefinition__TypeDefinitionsAssignment_2"


    // $ANTLR start "rule__RootOperationTypeDefinition__OperationTypeAssignment_0"
    // InternalGraphQL.g:1701:1: rule__RootOperationTypeDefinition__OperationTypeAssignment_0 : ( ruleOperationType ) ;
    public final void rule__RootOperationTypeDefinition__OperationTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1705:1: ( ( ruleOperationType ) )
            // InternalGraphQL.g:1706:2: ( ruleOperationType )
            {
            // InternalGraphQL.g:1706:2: ( ruleOperationType )
            // InternalGraphQL.g:1707:3: ruleOperationType
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
    // InternalGraphQL.g:1716:1: rule__RootOperationTypeDefinition__TypeAssignment_2 : ( ( RULE_NAME ) ) ;
    public final void rule__RootOperationTypeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1720:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:1721:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:1721:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1722:3: ( RULE_NAME )
            {
             before(grammarAccess.getRootOperationTypeDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0()); 
            // InternalGraphQL.g:1723:3: ( RULE_NAME )
            // InternalGraphQL.g:1724:4: RULE_NAME
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


    // $ANTLR start "rule__ScalarTypeDefinition__NameAssignment_1"
    // InternalGraphQL.g:1735:1: rule__ScalarTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__ScalarTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1739:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1740:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:1740:2: ( RULE_NAME )
            // InternalGraphQL.g:1741:3: RULE_NAME
            {
             before(grammarAccess.getScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__ObjectTypeDefinition__NameAssignment_1"
    // InternalGraphQL.g:1750:1: rule__ObjectTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__ObjectTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1754:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1755:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:1755:2: ( RULE_NAME )
            // InternalGraphQL.g:1756:3: RULE_NAME
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1"
    // InternalGraphQL.g:1765:1: rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1 : ( ruleFieldDefinition ) ;
    public final void rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1769:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:1770:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:1770:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:1771:3: ruleFieldDefinition
            {
             before(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDefinition();

            state._fsp--;

             after(grammarAccess.getObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectTypeDefinition__FieldDefinitionsAssignment_2_1"


    // $ANTLR start "rule__InterfaceDefinition__NameAssignment_1"
    // InternalGraphQL.g:1780:1: rule__InterfaceDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__InterfaceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1784:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1785:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:1785:2: ( RULE_NAME )
            // InternalGraphQL.g:1786:3: RULE_NAME
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getInterfaceDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__NameAssignment_1"


    // $ANTLR start "rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1"
    // InternalGraphQL.g:1795:1: rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1 : ( ruleFieldDefinition ) ;
    public final void rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1799:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:1800:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:1800:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:1801:3: ruleFieldDefinition
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDefinition();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__FieldDefinitionsAssignment_2_1"


    // $ANTLR start "rule__FieldDefinition__NameAssignment_0"
    // InternalGraphQL.g:1810:1: rule__FieldDefinition__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__FieldDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1814:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1815:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:1815:2: ( RULE_NAME )
            // InternalGraphQL.g:1816:3: RULE_NAME
            {
             before(grammarAccess.getFieldDefinitionAccess().getNameNAMETerminalRuleCall_0_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getFieldDefinitionAccess().getNameNAMETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__NameAssignment_0"


    // $ANTLR start "rule__FieldDefinition__TypeAssignment_2"
    // InternalGraphQL.g:1825:1: rule__FieldDefinition__TypeAssignment_2 : ( ( RULE_NAME ) ) ;
    public final void rule__FieldDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1829:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:1830:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:1830:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1831:3: ( RULE_NAME )
            {
             before(grammarAccess.getFieldDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0()); 
            // InternalGraphQL.g:1832:3: ( RULE_NAME )
            // InternalGraphQL.g:1833:4: RULE_NAME
            {
             before(grammarAccess.getFieldDefinitionAccess().getTypeTypeDefinitionNAMETerminalRuleCall_2_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getFieldDefinitionAccess().getTypeTypeDefinitionNAMETerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFieldDefinitionAccess().getTypeTypeDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDefinition__TypeAssignment_2"


    // $ANTLR start "rule__UnionTypeDefinition__NameAssignment_1"
    // InternalGraphQL.g:1844:1: rule__UnionTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__UnionTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1848:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1849:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:1849:2: ( RULE_NAME )
            // InternalGraphQL.g:1850:3: RULE_NAME
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__UnionTypeDefinition__MemberTypesAssignment_2_1"
    // InternalGraphQL.g:1859:1: rule__UnionTypeDefinition__MemberTypesAssignment_2_1 : ( ( RULE_NAME ) ) ;
    public final void rule__UnionTypeDefinition__MemberTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1863:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:1864:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:1864:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1865:3: ( RULE_NAME )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionCrossReference_2_1_0()); 
            // InternalGraphQL.g:1866:3: ( RULE_NAME )
            // InternalGraphQL.g:1867:4: RULE_NAME
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionNAMETerminalRuleCall_2_1_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionNAMETerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__MemberTypesAssignment_2_1"


    // $ANTLR start "rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1"
    // InternalGraphQL.g:1878:1: rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1 : ( ( RULE_NAME ) ) ;
    public final void rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1882:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphQL.g:1883:2: ( ( RULE_NAME ) )
            {
            // InternalGraphQL.g:1883:2: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1884:3: ( RULE_NAME )
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionCrossReference_2_2_1_0()); 
            // InternalGraphQL.g:1885:3: ( RULE_NAME )
            // InternalGraphQL.g:1886:4: RULE_NAME
            {
             before(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionNAMETerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionNAMETerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getUnionTypeDefinitionAccess().getMemberTypesTypeDefinitionCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionTypeDefinition__MemberTypesAssignment_2_2_1"


    // $ANTLR start "rule__EnumTypeDefinition__NameAssignment_1"
    // InternalGraphQL.g:1897:1: rule__EnumTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__EnumTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1901:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1902:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:1902:2: ( RULE_NAME )
            // InternalGraphQL.g:1903:3: RULE_NAME
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1"
    // InternalGraphQL.g:1912:1: rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1 : ( ruleEnumValueDefinition ) ;
    public final void rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1916:1: ( ( ruleEnumValueDefinition ) )
            // InternalGraphQL.g:1917:2: ( ruleEnumValueDefinition )
            {
            // InternalGraphQL.g:1917:2: ( ruleEnumValueDefinition )
            // InternalGraphQL.g:1918:3: ruleEnumValueDefinition
            {
             before(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValueDefinition();

            state._fsp--;

             after(grammarAccess.getEnumTypeDefinitionAccess().getValueDefinitionsEnumValueDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDefinition__ValueDefinitionsAssignment_2_1"


    // $ANTLR start "rule__EnumValueDefinition__NameAssignment"
    // InternalGraphQL.g:1927:1: rule__EnumValueDefinition__NameAssignment : ( RULE_NAME ) ;
    public final void rule__EnumValueDefinition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1931:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1932:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:1932:2: ( RULE_NAME )
            // InternalGraphQL.g:1933:3: RULE_NAME
            {
             before(grammarAccess.getEnumValueDefinitionAccess().getNameNAMETerminalRuleCall_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getEnumValueDefinitionAccess().getNameNAMETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueDefinition__NameAssignment"


    // $ANTLR start "rule__InputObjectTypeDefinition__NameAssignment_1"
    // InternalGraphQL.g:1942:1: rule__InputObjectTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__InputObjectTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1946:1: ( ( RULE_NAME ) )
            // InternalGraphQL.g:1947:2: ( RULE_NAME )
            {
            // InternalGraphQL.g:1947:2: ( RULE_NAME )
            // InternalGraphQL.g:1948:3: RULE_NAME
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getInputObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1"
    // InternalGraphQL.g:1957:1: rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1 : ( ruleFieldDefinition ) ;
    public final void rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1961:1: ( ( ruleFieldDefinition ) )
            // InternalGraphQL.g:1962:2: ( ruleFieldDefinition )
            {
            // InternalGraphQL.g:1962:2: ( ruleFieldDefinition )
            // InternalGraphQL.g:1963:3: ruleFieldDefinition
            {
             before(grammarAccess.getInputObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDefinition();

            state._fsp--;

             after(grammarAccess.getInputObjectTypeDefinitionAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputObjectTypeDefinition__FieldDefinitionsAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000678802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});

}