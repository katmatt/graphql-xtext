package io.github.katmatt.graphql.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphQLLexer extends Lexer {
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

    public InternalGraphQLLexer() {;} 
    public InternalGraphQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGraphQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGraphQL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:11:7: ( 'schema' )
            // InternalGraphQL.g:11:9: 'schema'
            {
            match("schema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:12:7: ( '{' )
            // InternalGraphQL.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:13:7: ( '}' )
            // InternalGraphQL.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:14:7: ( ':' )
            // InternalGraphQL.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:15:7: ( 'scalar' )
            // InternalGraphQL.g:15:9: 'scalar'
            {
            match("scalar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:16:7: ( 'type' )
            // InternalGraphQL.g:16:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:17:7: ( 'implements' )
            // InternalGraphQL.g:17:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:18:7: ( 'interface' )
            // InternalGraphQL.g:18:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:19:7: ( 'union' )
            // InternalGraphQL.g:19:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:20:7: ( '=' )
            // InternalGraphQL.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:21:7: ( '|' )
            // InternalGraphQL.g:21:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:22:7: ( 'enum' )
            // InternalGraphQL.g:22:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:23:7: ( 'input' )
            // InternalGraphQL.g:23:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:24:7: ( '&' )
            // InternalGraphQL.g:24:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:25:7: ( '!' )
            // InternalGraphQL.g:25:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:26:7: ( '[' )
            // InternalGraphQL.g:26:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:27:7: ( ']' )
            // InternalGraphQL.g:27:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:28:7: ( 'null' )
            // InternalGraphQL.g:28:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:29:7: ( 'true' )
            // InternalGraphQL.g:29:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:30:7: ( 'false' )
            // InternalGraphQL.g:30:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:31:7: ( 'query' )
            // InternalGraphQL.g:31:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:32:7: ( 'mutation' )
            // InternalGraphQL.g:32:9: 'mutation'
            {
            match("mutation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:33:7: ( 'subscription' )
            // InternalGraphQL.g:33:9: 'subscription'
            {
            match("subscription"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:1842:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGraphQL.g:1842:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGraphQL.g:1842:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphQL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_INT_VALUE"
    public final void mRULE_INT_VALUE() throws RecognitionException {
        try {
            int _type = RULE_INT_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:1844:16: ( ( '-' )? '1' .. '9' ( '0' .. '9' )* )
            // InternalGraphQL.g:1844:18: ( '-' )? '1' .. '9' ( '0' .. '9' )*
            {
            // InternalGraphQL.g:1844:18: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphQL.g:1844:18: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            matchRange('1','9'); 
            // InternalGraphQL.g:1844:32: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGraphQL.g:1844:33: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_VALUE"

    // $ANTLR start "RULE_FLOAT_VALUE"
    public final void mRULE_FLOAT_VALUE() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:1846:18: ( ( '-' )? ( '0' | ( '1' .. '9' )* ) '.' ( '0' .. '9' )* ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )* )
            // InternalGraphQL.g:1846:20: ( '-' )? ( '0' | ( '1' .. '9' )* ) '.' ( '0' .. '9' )* ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )*
            {
            // InternalGraphQL.g:1846:20: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphQL.g:1846:20: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalGraphQL.g:1846:25: ( '0' | ( '1' .. '9' )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                alt6=1;
            }
            else if ( (LA6_0=='.'||(LA6_0>='1' && LA6_0<='9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphQL.g:1846:26: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:1846:30: ( '1' .. '9' )*
                    {
                    // InternalGraphQL.g:1846:30: ( '1' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGraphQL.g:1846:31: '1' .. '9'
                    	    {
                    	    matchRange('1','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match('.'); 
            // InternalGraphQL.g:1846:47: ( '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGraphQL.g:1846:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGraphQL.g:1846:69: ( '+' | '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='+'||LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGraphQL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalGraphQL.g:1846:80: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGraphQL.g:1846:81: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_VALUE"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:1848:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGraphQL.g:1848:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGraphQL.g:1848:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGraphQL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:1850:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGraphQL.g:1850:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalGraphQL.g:1850:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraphQL.g:1850:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalGraphQL.g:1850:39: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:1850:40: ( '\\r' )? '\\n'
                    {
                    // InternalGraphQL.g:1850:40: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGraphQL.g:1850:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:1852:12: ( ',' )
            // InternalGraphQL.g:1852:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_SL_STRING_VALUE"
    public final void mRULE_SL_STRING_VALUE() throws RecognitionException {
        try {
            int _type = RULE_SL_STRING_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:1854:22: ( '\"' ( RULE_STRING_CHARACTER )* '\"' )
            // InternalGraphQL.g:1854:24: '\"' ( RULE_STRING_CHARACTER )* '\"'
            {
            match('\"'); 
            // InternalGraphQL.g:1854:28: ( RULE_STRING_CHARACTER )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGraphQL.g:1854:28: RULE_STRING_CHARACTER
            	    {
            	    mRULE_STRING_CHARACTER(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_STRING_VALUE"

    // $ANTLR start "RULE_ML_STRING_VALUE"
    public final void mRULE_ML_STRING_VALUE() throws RecognitionException {
        try {
            int _type = RULE_ML_STRING_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:1856:22: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            // InternalGraphQL.g:1856:24: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
            {
            match("\"\"\""); 

            // InternalGraphQL.g:1856:30: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\"') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='\"') ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3=='\"') ) {
                            alt15=2;
                        }
                        else if ( ((LA15_3>='\u0000' && LA15_3<='!')||(LA15_3>='#' && LA15_3<='\uFFFF')) ) {
                            alt15=1;
                        }


                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='!')||(LA15_1>='#' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGraphQL.g:1856:58: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_STRING_VALUE"

    // $ANTLR start "RULE_STRING_CHARACTER"
    public final void mRULE_STRING_CHARACTER() throws RecognitionException {
        try {
            // InternalGraphQL.g:1858:32: (~ ( ( '\\n' | '\\r' | '\"' | '\\\\' ) ) )
            // InternalGraphQL.g:1858:34: ~ ( ( '\\n' | '\\r' | '\"' | '\\\\' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_CHARACTER"

    public void mTokens() throws RecognitionException {
        // InternalGraphQL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_NAME | RULE_INT_VALUE | RULE_FLOAT_VALUE | RULE_WS | RULE_SL_COMMENT | RULE_COMMA | RULE_SL_STRING_VALUE | RULE_ML_STRING_VALUE )
        int alt16=31;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalGraphQL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalGraphQL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalGraphQL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalGraphQL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalGraphQL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalGraphQL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalGraphQL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalGraphQL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalGraphQL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalGraphQL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalGraphQL.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalGraphQL.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalGraphQL.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalGraphQL.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalGraphQL.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalGraphQL.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalGraphQL.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalGraphQL.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalGraphQL.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalGraphQL.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalGraphQL.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalGraphQL.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalGraphQL.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalGraphQL.g:1:148: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 25 :
                // InternalGraphQL.g:1:158: RULE_INT_VALUE
                {
                mRULE_INT_VALUE(); 

                }
                break;
            case 26 :
                // InternalGraphQL.g:1:173: RULE_FLOAT_VALUE
                {
                mRULE_FLOAT_VALUE(); 

                }
                break;
            case 27 :
                // InternalGraphQL.g:1:190: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalGraphQL.g:1:198: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalGraphQL.g:1:214: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 30 :
                // InternalGraphQL.g:1:225: RULE_SL_STRING_VALUE
                {
                mRULE_SL_STRING_VALUE(); 

                }
                break;
            case 31 :
                // InternalGraphQL.g:1:246: RULE_ML_STRING_VALUE
                {
                mRULE_ML_STRING_VALUE(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\23\3\uffff\3\23\2\uffff\1\23\4\uffff\4\23\2\uffff\1\50\5\uffff\14\23\1\50\1\uffff\1\52\1\uffff\16\23\1\uffff\3\23\1\113\1\114\4\23\1\121\1\122\6\23\2\uffff\2\23\1\133\1\134\2\uffff\1\135\1\136\1\23\1\140\1\141\3\23\4\uffff\1\23\2\uffff\7\23\1\155\2\23\1\160\1\uffff\1\23\1\162\1\uffff\1\23\1\uffff\1\164\1\uffff";
    static final String DFA16_eofS =
        "\165\uffff";
    static final String DFA16_minS =
        "\1\11\1\143\3\uffff\1\162\1\155\1\156\2\uffff\1\156\4\uffff\1\165\1\141\2\165\1\uffff\2\56\4\uffff\1\0\1\141\1\142\1\160\1\165\2\160\1\151\1\165\2\154\1\145\1\164\1\56\1\uffff\1\42\1\uffff\1\145\1\154\1\163\2\145\1\154\1\145\1\165\1\157\1\155\1\154\1\163\1\162\1\141\1\uffff\1\155\1\141\1\143\2\60\1\145\1\162\1\164\1\156\2\60\1\145\1\171\1\164\1\141\2\162\2\uffff\1\155\1\146\2\60\2\uffff\2\60\1\151\2\60\1\151\1\145\1\141\4\uffff\1\157\2\uffff\1\160\1\156\1\143\1\156\2\164\1\145\1\60\1\151\1\163\1\60\1\uffff\1\157\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\175\1\165\3\uffff\1\171\2\156\2\uffff\1\156\4\uffff\1\165\1\141\2\165\1\uffff\2\71\4\uffff\1\uffff\1\150\1\142\1\160\1\165\1\160\1\164\1\151\1\165\2\154\1\145\1\164\1\71\1\uffff\1\42\1\uffff\1\145\1\154\1\163\2\145\1\154\1\145\1\165\1\157\1\155\1\154\1\163\1\162\1\141\1\uffff\1\155\1\141\1\143\2\172\1\145\1\162\1\164\1\156\2\172\1\145\1\171\1\164\1\141\2\162\2\uffff\1\155\1\146\2\172\2\uffff\2\172\1\151\2\172\1\151\1\145\1\141\4\uffff\1\157\2\uffff\1\160\1\156\1\143\1\156\2\164\1\145\1\172\1\151\1\163\1\172\1\uffff\1\157\1\172\1\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\3\uffff\1\12\1\13\1\uffff\1\16\1\17\1\20\1\21\4\uffff\1\30\2\uffff\1\32\1\33\1\34\1\35\16\uffff\1\31\1\uffff\1\36\16\uffff\1\37\21\uffff\1\6\1\23\4\uffff\1\14\1\22\10\uffff\1\15\1\11\1\24\1\25\1\uffff\1\1\1\5\13\uffff\1\26\2\uffff\1\10\1\uffff\1\7\1\uffff\1\27";
    static final String DFA16_specialS =
        "\32\uffff\1\0\132\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\1\14\1\32\1\30\2\uffff\1\13\5\uffff\1\31\1\24\1\26\1\uffff\1\26\11\25\1\4\2\uffff\1\10\3\uffff\32\23\1\15\1\uffff\1\16\1\uffff\1\23\1\uffff\4\23\1\12\1\20\2\23\1\6\3\23\1\22\1\17\2\23\1\21\1\23\1\1\1\5\1\7\5\23\1\2\1\11\1\3",
            "\1\33\21\uffff\1\34",
            "",
            "",
            "",
            "\1\36\6\uffff\1\35",
            "\1\37\1\40",
            "\1\41",
            "",
            "",
            "\1\42",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\26\1\uffff\1\26\11\25",
            "\1\26\2\uffff\11\47",
            "",
            "",
            "",
            "",
            "\12\52\1\uffff\2\52\1\uffff\24\52\1\51\71\52\1\uffff\uffa3\52",
            "\1\54\6\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62\3\uffff\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\26\2\uffff\11\47",
            "",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "\1\131",
            "\1\132",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\137",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "",
            "\1\145",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\156",
            "\1\157",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\161",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\163",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_NAME | RULE_INT_VALUE | RULE_FLOAT_VALUE | RULE_WS | RULE_SL_COMMENT | RULE_COMMA | RULE_SL_STRING_VALUE | RULE_ML_STRING_VALUE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_26 = input.LA(1);

                        s = -1;
                        if ( (LA16_26=='\"') ) {s = 41;}

                        else if ( ((LA16_26>='\u0000' && LA16_26<='\t')||(LA16_26>='\u000B' && LA16_26<='\f')||(LA16_26>='\u000E' && LA16_26<='!')||(LA16_26>='#' && LA16_26<='[')||(LA16_26>=']' && LA16_26<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}