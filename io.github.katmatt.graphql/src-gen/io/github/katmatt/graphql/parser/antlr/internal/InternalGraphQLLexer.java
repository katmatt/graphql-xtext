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

    public InternalGraphQLLexer() {;} 
    public InternalGraphQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGraphQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGraphQL.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:11:6: ( 'schema' )
            // InternalGraphQL.g:11:8: 'schema'
            {
            match("schema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:12:6: ( '{' )
            // InternalGraphQL.g:12:8: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:17:7: ( 'interface' )
            // InternalGraphQL.g:17:9: 'interface'
            {
            match("interface"); 


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
            // InternalGraphQL.g:18:7: ( 'union' )
            // InternalGraphQL.g:18:9: 'union'
            {
            match("union"); 


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
            // InternalGraphQL.g:19:7: ( '=' )
            // InternalGraphQL.g:19:9: '='
            {
            match('='); 

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
            // InternalGraphQL.g:20:7: ( '|' )
            // InternalGraphQL.g:20:9: '|'
            {
            match('|'); 

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
            // InternalGraphQL.g:21:7: ( 'enum' )
            // InternalGraphQL.g:21:9: 'enum'
            {
            match("enum"); 


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
            // InternalGraphQL.g:22:7: ( 'input' )
            // InternalGraphQL.g:22:9: 'input'
            {
            match("input"); 


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
            // InternalGraphQL.g:23:7: ( 'query' )
            // InternalGraphQL.g:23:9: 'query'
            {
            match("query"); 


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
            // InternalGraphQL.g:24:7: ( 'mutation' )
            // InternalGraphQL.g:24:9: 'mutation'
            {
            match("mutation"); 


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
            // InternalGraphQL.g:25:7: ( 'subscription' )
            // InternalGraphQL.g:25:9: 'subscription'
            {
            match("subscription"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:823:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGraphQL.g:823:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGraphQL.g:823:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:825:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGraphQL.g:825:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGraphQL.g:825:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // InternalGraphQL.g:827:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGraphQL.g:827:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalGraphQL.g:827:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGraphQL.g:827:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop3;
                }
            } while (true);

            // InternalGraphQL.g:827:39: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphQL.g:827:40: ( '\\r' )? '\\n'
                    {
                    // InternalGraphQL.g:827:40: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalGraphQL.g:827:40: '\\r'
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
            // InternalGraphQL.g:829:12: ( ',' )
            // InternalGraphQL.g:829:14: ','
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

    public void mTokens() throws RecognitionException {
        // InternalGraphQL.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_NAME | RULE_WS | RULE_SL_COMMENT | RULE_COMMA )
        int alt6=19;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalGraphQL.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalGraphQL.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // InternalGraphQL.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalGraphQL.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // InternalGraphQL.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // InternalGraphQL.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // InternalGraphQL.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // InternalGraphQL.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // InternalGraphQL.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // InternalGraphQL.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // InternalGraphQL.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // InternalGraphQL.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // InternalGraphQL.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // InternalGraphQL.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // InternalGraphQL.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // InternalGraphQL.g:1:98: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 17 :
                // InternalGraphQL.g:1:108: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalGraphQL.g:1:116: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalGraphQL.g:1:132: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\15\3\uffff\3\15\2\uffff\3\15\4\uffff\25\15\1\60\3\15\1\64\5\15\1\uffff\1\15\1\73\1\74\1\uffff\1\75\1\15\1\77\1\100\2\15\3\uffff\1\15\2\uffff\5\15\1\111\1\15\1\113\1\uffff\1\15\1\uffff\1\15\1\116\1\uffff";
    static final String DFA6_eofS =
        "\117\uffff";
    static final String DFA6_minS =
        "\1\11\1\143\3\uffff\1\171\2\156\2\uffff\1\156\2\165\4\uffff\1\141\1\142\2\160\1\151\1\165\1\145\1\164\1\145\1\154\1\163\2\145\1\165\1\157\1\155\1\162\1\141\1\155\1\141\1\143\1\60\1\162\1\164\1\156\1\60\1\171\1\164\1\141\2\162\1\uffff\1\146\2\60\1\uffff\1\60\1\151\2\60\1\151\1\141\3\uffff\1\157\2\uffff\1\160\1\143\1\156\1\164\1\145\1\60\1\151\1\60\1\uffff\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\175\1\165\3\uffff\1\171\2\156\2\uffff\1\156\2\165\4\uffff\1\150\1\142\1\160\1\164\1\151\1\165\1\145\1\164\1\145\1\154\1\163\2\145\1\165\1\157\1\155\1\162\1\141\1\155\1\141\1\143\1\172\1\162\1\164\1\156\1\172\1\171\1\164\1\141\2\162\1\uffff\1\146\2\172\1\uffff\1\172\1\151\2\172\1\151\1\141\3\uffff\1\157\2\uffff\1\160\1\143\1\156\1\164\1\145\1\172\1\151\1\172\1\uffff\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\1\4\3\uffff\1\11\1\12\3\uffff\1\20\1\21\1\22\1\23\37\uffff\1\6\3\uffff\1\13\6\uffff\1\14\1\10\1\15\1\uffff\1\1\1\5\10\uffff\1\16\1\uffff\1\7\2\uffff\1\17";
    static final String DFA6_specialS =
        "\117\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\16\2\uffff\1\16\22\uffff\1\16\2\uffff\1\17\10\uffff\1\20\15\uffff\1\4\2\uffff\1\10\3\uffff\32\15\4\uffff\1\15\1\uffff\4\15\1\12\3\15\1\6\3\15\1\14\3\15\1\13\1\15\1\1\1\5\1\7\5\15\1\2\1\11\1\3",
            "\1\21\21\uffff\1\22",
            "",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "",
            "",
            "",
            "\1\32\6\uffff\1\31",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\76",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\112",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "\1\114",
            "",
            "\1\115",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_NAME | RULE_WS | RULE_SL_COMMENT | RULE_COMMA );";
        }
    }
 

}