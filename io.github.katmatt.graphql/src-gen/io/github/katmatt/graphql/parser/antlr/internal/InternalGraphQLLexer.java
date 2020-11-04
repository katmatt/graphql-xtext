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

    public InternalGraphQLLexer() {;} 
    public InternalGraphQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGraphQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGraphQL.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:18:7: ( '&' )
            // InternalGraphQL.g:18:9: '&'
            {
            match('&'); 

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
            // InternalGraphQL.g:19:7: ( 'interface' )
            // InternalGraphQL.g:19:9: 'interface'
            {
            match("interface"); 


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
            // InternalGraphQL.g:20:7: ( '(' )
            // InternalGraphQL.g:20:9: '('
            {
            match('('); 

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
            // InternalGraphQL.g:21:7: ( ')' )
            // InternalGraphQL.g:21:9: ')'
            {
            match(')'); 

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
            // InternalGraphQL.g:22:7: ( 'union' )
            // InternalGraphQL.g:22:9: 'union'
            {
            match("union"); 


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
            // InternalGraphQL.g:23:7: ( '=' )
            // InternalGraphQL.g:23:9: '='
            {
            match('='); 

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
            // InternalGraphQL.g:24:7: ( '|' )
            // InternalGraphQL.g:24:9: '|'
            {
            match('|'); 

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
            // InternalGraphQL.g:25:7: ( 'enum' )
            // InternalGraphQL.g:25:9: 'enum'
            {
            match("enum"); 


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
            // InternalGraphQL.g:26:7: ( 'input' )
            // InternalGraphQL.g:26:9: 'input'
            {
            match("input"); 


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
            // InternalGraphQL.g:27:7: ( '!' )
            // InternalGraphQL.g:27:9: '!'
            {
            match('!'); 

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
            // InternalGraphQL.g:28:7: ( '[' )
            // InternalGraphQL.g:28:9: '['
            {
            match('['); 

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
            // InternalGraphQL.g:29:7: ( ']' )
            // InternalGraphQL.g:29:9: ']'
            {
            match(']'); 

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
            // InternalGraphQL.g:30:7: ( 'null' )
            // InternalGraphQL.g:30:9: 'null'
            {
            match("null"); 


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
            // InternalGraphQL.g:31:7: ( 'true' )
            // InternalGraphQL.g:31:9: 'true'
            {
            match("true"); 


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
            // InternalGraphQL.g:32:7: ( 'false' )
            // InternalGraphQL.g:32:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:33:7: ( 'directive' )
            // InternalGraphQL.g:33:9: 'directive'
            {
            match("directive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:34:7: ( 'repeatable' )
            // InternalGraphQL.g:34:9: 'repeatable'
            {
            match("repeatable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:35:7: ( 'on' )
            // InternalGraphQL.g:35:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:36:7: ( 'QUERY' )
            // InternalGraphQL.g:36:9: 'QUERY'
            {
            match("QUERY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:37:7: ( 'MUTATION' )
            // InternalGraphQL.g:37:9: 'MUTATION'
            {
            match("MUTATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:38:7: ( 'SUBSCRIPTION' )
            // InternalGraphQL.g:38:9: 'SUBSCRIPTION'
            {
            match("SUBSCRIPTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:39:7: ( 'FIELD' )
            // InternalGraphQL.g:39:9: 'FIELD'
            {
            match("FIELD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:40:7: ( 'FRAGMENT_DEFINITION' )
            // InternalGraphQL.g:40:9: 'FRAGMENT_DEFINITION'
            {
            match("FRAGMENT_DEFINITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:41:7: ( 'FRAGMENT_SPREAD' )
            // InternalGraphQL.g:41:9: 'FRAGMENT_SPREAD'
            {
            match("FRAGMENT_SPREAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:42:7: ( 'INLINE_FRAGMENT' )
            // InternalGraphQL.g:42:9: 'INLINE_FRAGMENT'
            {
            match("INLINE_FRAGMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:43:7: ( 'VARIABLE_DEFINITION' )
            // InternalGraphQL.g:43:9: 'VARIABLE_DEFINITION'
            {
            match("VARIABLE_DEFINITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:44:7: ( 'SCHEMA' )
            // InternalGraphQL.g:44:9: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:45:7: ( 'SCALAR' )
            // InternalGraphQL.g:45:9: 'SCALAR'
            {
            match("SCALAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:46:7: ( 'OBJECT' )
            // InternalGraphQL.g:46:9: 'OBJECT'
            {
            match("OBJECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:47:7: ( 'FIELD_DEFINITION' )
            // InternalGraphQL.g:47:9: 'FIELD_DEFINITION'
            {
            match("FIELD_DEFINITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:48:7: ( 'ARGUMENT_DEFINITION' )
            // InternalGraphQL.g:48:9: 'ARGUMENT_DEFINITION'
            {
            match("ARGUMENT_DEFINITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:49:7: ( 'INTERFACE' )
            // InternalGraphQL.g:49:9: 'INTERFACE'
            {
            match("INTERFACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:50:7: ( 'UNION' )
            // InternalGraphQL.g:50:9: 'UNION'
            {
            match("UNION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:51:7: ( 'ENUM' )
            // InternalGraphQL.g:51:9: 'ENUM'
            {
            match("ENUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:52:7: ( 'ENUM_VALUE' )
            // InternalGraphQL.g:52:9: 'ENUM_VALUE'
            {
            match("ENUM_VALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:53:7: ( 'INPUT_OBJECT' )
            // InternalGraphQL.g:53:9: 'INPUT_OBJECT'
            {
            match("INPUT_OBJECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:54:7: ( 'INPUT_FIELD_DEFINITION' )
            // InternalGraphQL.g:54:9: 'INPUT_FIELD_DEFINITION'
            {
            match("INPUT_FIELD_DEFINITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:55:7: ( 'query' )
            // InternalGraphQL.g:55:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:56:7: ( 'mutation' )
            // InternalGraphQL.g:56:9: 'mutation'
            {
            match("mutation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:57:7: ( 'subscription' )
            // InternalGraphQL.g:57:9: 'subscription'
            {
            match("subscription"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "RULE_DIRECTIVE_NAME"
    public final void mRULE_DIRECTIVE_NAME() throws RecognitionException {
        try {
            int _type = RULE_DIRECTIVE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:2431:21: ( '@' RULE_NAME )
            // InternalGraphQL.g:2431:23: '@' RULE_NAME
            {
            match('@'); 
            mRULE_NAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECTIVE_NAME"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphQL.g:2433:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGraphQL.g:2433:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGraphQL.g:2433:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalGraphQL.g:2435:16: ( ( '-' )? '1' .. '9' ( '0' .. '9' )* )
            // InternalGraphQL.g:2435:18: ( '-' )? '1' .. '9' ( '0' .. '9' )*
            {
            // InternalGraphQL.g:2435:18: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphQL.g:2435:18: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            matchRange('1','9'); 
            // InternalGraphQL.g:2435:32: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGraphQL.g:2435:33: '0' .. '9'
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
            // InternalGraphQL.g:2437:18: ( ( '-' )? ( '0' | ( '1' .. '9' )* ) '.' ( '0' .. '9' )* ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )* )
            // InternalGraphQL.g:2437:20: ( '-' )? ( '0' | ( '1' .. '9' )* ) '.' ( '0' .. '9' )* ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )*
            {
            // InternalGraphQL.g:2437:20: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphQL.g:2437:20: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalGraphQL.g:2437:25: ( '0' | ( '1' .. '9' )* )
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
                    // InternalGraphQL.g:2437:26: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:2437:30: ( '1' .. '9' )*
                    {
                    // InternalGraphQL.g:2437:30: ( '1' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGraphQL.g:2437:31: '1' .. '9'
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
            // InternalGraphQL.g:2437:47: ( '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGraphQL.g:2437:48: '0' .. '9'
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

            // InternalGraphQL.g:2437:69: ( '+' | '-' )?
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

            // InternalGraphQL.g:2437:80: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGraphQL.g:2437:81: '0' .. '9'
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
            // InternalGraphQL.g:2439:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGraphQL.g:2439:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGraphQL.g:2439:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalGraphQL.g:2441:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGraphQL.g:2441:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalGraphQL.g:2441:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraphQL.g:2441:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGraphQL.g:2441:39: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphQL.g:2441:40: ( '\\r' )? '\\n'
                    {
                    // InternalGraphQL.g:2441:40: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGraphQL.g:2441:40: '\\r'
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
            // InternalGraphQL.g:2443:12: ( ',' )
            // InternalGraphQL.g:2443:14: ','
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
            // InternalGraphQL.g:2445:22: ( '\"' ( RULE_STRING_CHARACTER )* '\"' )
            // InternalGraphQL.g:2445:24: '\"' ( RULE_STRING_CHARACTER )* '\"'
            {
            match('\"'); 
            // InternalGraphQL.g:2445:28: ( RULE_STRING_CHARACTER )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGraphQL.g:2445:28: RULE_STRING_CHARACTER
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
            // InternalGraphQL.g:2447:22: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            // InternalGraphQL.g:2447:24: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
            {
            match("\"\"\""); 

            // InternalGraphQL.g:2447:30: ( options {greedy=false; } : . )*
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
            	    // InternalGraphQL.g:2447:58: .
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
            // InternalGraphQL.g:2449:32: (~ ( ( '\\n' | '\\r' | '\"' | '\\\\' ) ) )
            // InternalGraphQL.g:2449:34: ~ ( ( '\\n' | '\\r' | '\"' | '\\\\' ) )
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
        // InternalGraphQL.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_DIRECTIVE_NAME | RULE_NAME | RULE_INT_VALUE | RULE_FLOAT_VALUE | RULE_WS | RULE_SL_COMMENT | RULE_COMMA | RULE_SL_STRING_VALUE | RULE_ML_STRING_VALUE )
        int alt16=56;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalGraphQL.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalGraphQL.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalGraphQL.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalGraphQL.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalGraphQL.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalGraphQL.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalGraphQL.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalGraphQL.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalGraphQL.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalGraphQL.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalGraphQL.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalGraphQL.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalGraphQL.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalGraphQL.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalGraphQL.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalGraphQL.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalGraphQL.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalGraphQL.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalGraphQL.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalGraphQL.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalGraphQL.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalGraphQL.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalGraphQL.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalGraphQL.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalGraphQL.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalGraphQL.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalGraphQL.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalGraphQL.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalGraphQL.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalGraphQL.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalGraphQL.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalGraphQL.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalGraphQL.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalGraphQL.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalGraphQL.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalGraphQL.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalGraphQL.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalGraphQL.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalGraphQL.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalGraphQL.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalGraphQL.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalGraphQL.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalGraphQL.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalGraphQL.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalGraphQL.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalGraphQL.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalGraphQL.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalGraphQL.g:1:292: RULE_DIRECTIVE_NAME
                {
                mRULE_DIRECTIVE_NAME(); 

                }
                break;
            case 49 :
                // InternalGraphQL.g:1:312: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 50 :
                // InternalGraphQL.g:1:322: RULE_INT_VALUE
                {
                mRULE_INT_VALUE(); 

                }
                break;
            case 51 :
                // InternalGraphQL.g:1:337: RULE_FLOAT_VALUE
                {
                mRULE_FLOAT_VALUE(); 

                }
                break;
            case 52 :
                // InternalGraphQL.g:1:354: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // InternalGraphQL.g:1:362: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalGraphQL.g:1:378: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 55 :
                // InternalGraphQL.g:1:389: RULE_SL_STRING_VALUE
                {
                mRULE_SL_STRING_VALUE(); 

                }
                break;
            case 56 :
                // InternalGraphQL.g:1:410: RULE_ML_STRING_VALUE
                {
                mRULE_ML_STRING_VALUE(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\43\3\uffff\2\43\3\uffff\1\43\2\uffff\1\43\3\uffff\21\43\3\uffff\1\107\5\uffff\14\43\1\130\16\43\1\107\1\uffff\1\111\1\uffff\16\43\1\uffff\21\43\1\uffff\3\43\1\u008d\1\u008e\4\43\1\u0093\1\u0094\21\43\1\u00a7\5\43\2\uffff\2\43\1\u00af\1\u00b0\2\uffff\1\u00b1\2\43\1\u00b4\4\43\1\u00ba\7\43\1\u00c2\1\43\1\uffff\1\u00c4\1\43\1\u00c6\1\u00c7\3\43\3\uffff\2\43\1\uffff\2\43\1\u00cf\1\u00d0\1\43\1\uffff\5\43\1\u00d8\1\43\1\uffff\1\43\1\uffff\1\43\2\uffff\7\43\2\uffff\7\43\1\uffff\10\43\1\u00f2\12\43\1\u00fd\2\43\1\u0100\1\u0101\1\43\1\uffff\4\43\1\u0108\5\43\1\uffff\1\43\1\u010f\2\uffff\1\u0110\5\43\1\uffff\4\43\1\u011a\1\43\2\uffff\11\43\1\uffff\1\u0125\1\u0126\4\43\1\u012b\3\43\2\uffff\4\43\1\uffff\14\43\1\u013f\1\u0140\3\43\1\u0144\1\43\2\uffff\3\43\1\uffff\10\43\1\u0151\1\43\1\u0153\1\u0154\1\uffff\1\43\2\uffff\1\43\1\u0157\1\uffff";
    static final String DFA16_eofS =
        "\u0158\uffff";
    static final String DFA16_minS =
        "\1\11\1\143\3\uffff\1\162\1\155\3\uffff\1\156\2\uffff\1\156\3\uffff\1\165\1\141\1\151\1\145\1\156\2\125\1\103\1\111\1\116\1\101\1\102\1\122\2\116\2\165\2\uffff\2\56\4\uffff\1\0\1\141\1\142\1\160\1\165\2\160\1\151\1\165\2\154\1\162\1\160\1\60\1\105\1\124\1\102\1\101\1\105\1\101\1\114\1\122\1\112\1\107\1\111\1\125\1\145\1\164\1\56\1\uffff\1\42\1\uffff\1\145\1\154\1\163\2\145\1\154\1\145\1\165\1\157\1\155\1\154\1\163\2\145\1\uffff\1\122\1\101\1\123\1\105\2\114\1\107\1\111\1\105\1\125\1\111\1\105\1\125\1\117\1\115\1\162\1\141\1\uffff\1\155\1\141\1\143\2\60\1\145\1\162\1\164\1\156\2\60\1\145\1\143\1\141\1\131\1\124\1\103\1\115\1\101\1\104\1\115\1\116\1\122\1\124\1\101\1\103\1\115\1\116\1\60\1\171\1\164\1\141\2\162\2\uffff\1\155\1\146\2\60\2\uffff\1\60\2\164\1\60\1\111\1\122\1\101\1\122\1\60\2\105\1\106\1\137\1\102\1\124\1\105\1\60\1\126\1\uffff\1\60\1\151\2\60\1\151\1\145\1\141\3\uffff\1\151\1\141\1\uffff\1\117\1\111\2\60\1\104\1\uffff\1\116\1\137\1\101\1\106\1\114\1\60\1\116\1\uffff\1\101\1\uffff\1\157\2\uffff\1\160\1\156\1\143\1\166\1\142\1\116\1\120\2\uffff\1\105\1\124\1\106\1\103\1\102\1\111\1\105\1\uffff\1\124\1\114\1\156\2\164\2\145\1\154\1\60\1\124\1\106\1\137\1\122\1\105\1\112\1\105\2\137\1\125\1\60\1\151\1\163\2\60\1\145\1\uffff\2\111\1\104\1\101\1\60\1\105\1\114\2\104\1\105\1\uffff\1\157\1\60\2\uffff\1\60\1\117\1\116\1\105\1\120\1\107\1\uffff\1\103\1\104\2\105\1\60\1\156\2\uffff\1\116\1\111\1\106\1\122\1\115\1\124\1\137\2\106\1\uffff\2\60\1\124\1\111\2\105\1\60\1\104\2\111\2\uffff\1\111\1\116\1\101\1\116\1\uffff\1\105\2\116\1\117\1\111\1\104\1\124\1\106\2\111\1\116\1\124\2\60\1\111\2\124\1\60\1\111\2\uffff\1\116\2\111\1\uffff\1\117\1\111\2\117\1\116\1\124\2\116\1\60\1\111\2\60\1\uffff\1\117\2\uffff\1\116\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\175\1\165\3\uffff\1\171\1\156\3\uffff\1\156\2\uffff\1\156\3\uffff\1\165\1\141\1\151\1\145\1\156\3\125\1\122\1\116\1\101\1\102\1\122\2\116\2\165\2\uffff\2\71\4\uffff\1\uffff\1\150\1\142\1\160\1\165\1\160\1\164\1\151\1\165\2\154\1\162\1\160\1\172\1\105\1\124\1\102\1\110\1\105\1\101\1\124\1\122\1\112\1\107\1\111\1\125\1\145\1\164\1\71\1\uffff\1\42\1\uffff\1\145\1\154\1\163\2\145\1\154\1\145\1\165\1\157\1\155\1\154\1\163\2\145\1\uffff\1\122\1\101\1\123\1\105\2\114\1\107\1\111\1\105\1\125\1\111\1\105\1\125\1\117\1\115\1\162\1\141\1\uffff\1\155\1\141\1\143\2\172\1\145\1\162\1\164\1\156\2\172\1\145\1\143\1\141\1\131\1\124\1\103\1\115\1\101\1\104\1\115\1\116\1\122\1\124\1\101\1\103\1\115\1\116\1\172\1\171\1\164\1\141\2\162\2\uffff\1\155\1\146\2\172\2\uffff\1\172\2\164\1\172\1\111\1\122\1\101\1\122\1\172\2\105\1\106\1\137\1\102\1\124\1\105\1\172\1\126\1\uffff\1\172\1\151\2\172\1\151\1\145\1\141\3\uffff\1\151\1\141\1\uffff\1\117\1\111\2\172\1\104\1\uffff\1\116\1\137\1\101\1\117\1\114\1\172\1\116\1\uffff\1\101\1\uffff\1\157\2\uffff\1\160\1\156\1\143\1\166\1\142\1\116\1\120\2\uffff\1\105\1\124\1\106\1\103\1\102\1\111\1\105\1\uffff\1\124\1\114\1\156\2\164\2\145\1\154\1\172\1\124\1\106\1\137\1\122\1\105\1\112\1\105\2\137\1\125\1\172\1\151\1\163\2\172\1\145\1\uffff\2\111\1\123\1\101\1\172\1\105\1\114\2\104\1\105\1\uffff\1\157\1\172\2\uffff\1\172\1\117\1\116\1\105\1\120\1\107\1\uffff\1\103\1\104\2\105\1\172\1\156\2\uffff\1\116\1\111\1\106\1\122\1\115\1\124\1\137\2\106\1\uffff\2\172\1\124\1\111\2\105\1\172\1\104\2\111\2\uffff\1\111\1\116\1\101\1\116\1\uffff\1\105\2\116\1\117\1\111\1\104\1\124\1\106\2\111\1\116\1\124\2\172\1\111\2\124\1\172\1\111\2\uffff\1\116\2\111\1\uffff\1\117\1\111\2\117\1\116\1\124\2\116\1\172\1\111\2\172\1\uffff\1\117\2\uffff\1\116\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\2\uffff\1\10\1\12\1\13\1\uffff\1\15\1\16\1\uffff\1\21\1\22\1\23\21\uffff\1\60\1\61\2\uffff\1\63\1\64\1\65\1\66\35\uffff\1\62\1\uffff\1\67\16\uffff\1\31\21\uffff\1\70\42\uffff\1\6\1\25\4\uffff\1\17\1\24\22\uffff\1\51\7\uffff\1\20\1\14\1\26\2\uffff\1\32\5\uffff\1\35\7\uffff\1\50\1\uffff\1\55\1\uffff\1\1\1\5\7\uffff\1\42\1\43\7\uffff\1\44\31\uffff\1\33\12\uffff\1\56\2\uffff\1\11\1\27\6\uffff\1\47\6\uffff\1\7\1\30\11\uffff\1\52\12\uffff\1\57\1\34\4\uffff\1\53\23\uffff\1\37\1\40\3\uffff\1\45\14\uffff\1\36\1\uffff\1\41\1\46\2\uffff\1\54";
    static final String DFA16_specialS =
        "\52\uffff\1\0\u012d\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\1\16\1\52\1\50\2\uffff\1\7\1\uffff\1\10\1\11\2\uffff\1\51\1\44\1\46\1\uffff\1\46\11\45\1\4\2\uffff\1\13\2\uffff\1\42\1\35\3\43\1\37\1\31\2\43\1\32\3\43\1\27\1\43\1\34\1\43\1\26\1\43\1\30\1\43\1\36\1\33\4\43\1\17\1\uffff\1\20\1\uffff\1\43\1\uffff\3\43\1\23\1\15\1\22\2\43\1\6\3\43\1\41\1\21\1\25\1\43\1\40\1\24\1\1\1\5\1\12\5\43\1\2\1\14\1\3",
            "\1\53\21\uffff\1\54",
            "",
            "",
            "",
            "\1\56\6\uffff\1\55",
            "\1\57\1\60",
            "",
            "",
            "",
            "\1\61",
            "",
            "",
            "\1\62",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\73\21\uffff\1\72",
            "\1\74\10\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "\1\46\1\uffff\1\46\11\45",
            "\1\46\2\uffff\11\106",
            "",
            "",
            "",
            "",
            "\12\111\1\uffff\2\111\1\uffff\24\111\1\110\71\111\1\uffff\uffa3\111",
            "\1\113\6\uffff\1\112",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\121\3\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\135\6\uffff\1\134",
            "\1\136",
            "\1\137",
            "\1\140\3\uffff\1\142\3\uffff\1\141",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\46\2\uffff\11\106",
            "",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\43\7\uffff\32\43\4\uffff\1\u00a6\1\uffff\32\43",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b2",
            "\1\u00b3",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\43\7\uffff\32\43\4\uffff\1\u00b9\1\uffff\32\43",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c3",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c5",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d6\10\uffff\1\u00d5",
            "\1\u00d7",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00d9",
            "",
            "\1\u00da",
            "",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00fe",
            "\1\u00ff",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105\16\uffff\1\u0106",
            "\1\u0107",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u011b",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0145",
            "",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0152",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0155",
            "",
            "",
            "\1\u0156",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_DIRECTIVE_NAME | RULE_NAME | RULE_INT_VALUE | RULE_FLOAT_VALUE | RULE_WS | RULE_SL_COMMENT | RULE_COMMA | RULE_SL_STRING_VALUE | RULE_ML_STRING_VALUE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_42 = input.LA(1);

                        s = -1;
                        if ( (LA16_42=='\"') ) {s = 72;}

                        else if ( ((LA16_42>='\u0000' && LA16_42<='\t')||(LA16_42>='\u000B' && LA16_42<='\f')||(LA16_42>='\u000E' && LA16_42<='!')||(LA16_42>='#' && LA16_42<='[')||(LA16_42>=']' && LA16_42<='\uFFFF')) ) {s = 73;}

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