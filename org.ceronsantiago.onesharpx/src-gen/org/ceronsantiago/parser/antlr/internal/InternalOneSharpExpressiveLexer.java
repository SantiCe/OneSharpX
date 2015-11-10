package org.ceronsantiago.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOneSharpExpressiveLexer extends Lexer {
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
    public static final int RULE_OS=6;
    public static final int T__10=10;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_DIGIT=8;
    public static final int RULE_LETTER=7;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalOneSharpExpressiveLexer() {;} 
    public InternalOneSharpExpressiveLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOneSharpExpressiveLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:11:7: ( 'write' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:11:9: 'write'
            {
            match("write"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:12:7: ( 'switch' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:12:9: 'switch'
            {
            match("switch"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:13:7: ( 'case' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:13:9: 'case'
            {
            match("case"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:14:7: ( 'end' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:14:9: 'end'
            {
            match("end"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:15:7: ( 'rswitch' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:15:9: 'rswitch'
            {
            match("rswitch"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:16:7: ( 'goto' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:16:9: 'goto'
            {
            match("goto"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:17:7: ( 'call' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:17:9: 'call'
            {
            match("call"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:18:7: ( '(' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:18:9: '('
            {
            match('('); 

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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:19:7: ( ',' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:19:9: ','
            {
            match(','); 

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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:20:7: ( ')' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:20:9: ')'
            {
            match(')'); 

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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:21:7: ( ':' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:21:9: ':'
            {
            match(':'); 

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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:22:7: ( 'int' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:22:9: 'int'
            {
            match("int"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:23:7: ( 'string' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:23:9: 'string'
            {
            match("string"); 


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
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:24:7: ( 'begin' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:24:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:856:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:856:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:858:21: ( '0' .. '9' )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:858:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_OS"
    public final void mRULE_OS() throws RecognitionException {
        try {
            int _type = RULE_OS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:860:9: ( ( '1' | '#' )+ )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:860:11: ( '1' | '#' )+
            {
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:860:11: ( '1' | '#' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='#'||LA1_0=='1') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:
            	    {
            	    if ( input.LA(1)=='#'||input.LA(1)=='1' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OS"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:862:10: ( ( '0' .. '9' )+ )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:862:12: ( '0' .. '9' )+
            {
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:862:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:862:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:864:9: ( ( RULE_LETTER )+ ( RULE_LETTER | RULE_DIGIT | RULE_OS )* )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:864:11: ( RULE_LETTER )+ ( RULE_LETTER | RULE_DIGIT | RULE_OS )*
            {
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:864:11: ( RULE_LETTER )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:864:11: RULE_LETTER
            	    {
            	    mRULE_LETTER(); 

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

            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:864:24: ( RULE_LETTER | RULE_DIGIT | RULE_OS )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt4=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt4=2;
                    }
                    break;
                case '#':
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:864:25: RULE_LETTER
            	    {
            	    mRULE_LETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:864:37: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:864:48: RULE_OS
            	    {
            	    mRULE_OS(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:866:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:866:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:866:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_OS | RULE_INT | RULE_ID | RULE_WS )
        int alt6=18;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:94: RULE_OS
                {
                mRULE_OS(); 

                }
                break;
            case 16 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:102: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:111: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../org.ceronsantiago.onesharpx/src-gen/org/ceronsantiago/parser/antlr/internal/InternalOneSharpExpressive.g:1:119: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\6\20\4\uffff\2\20\1\16\4\uffff\16\20\1\52\2\20\1\55\4"+
        "\20\1\62\1\63\1\uffff\1\20\1\65\1\uffff\1\20\1\67\2\20\2\uffff\1"+
        "\20\1\uffff\1\73\1\uffff\1\74\1\75\1\20\3\uffff\1\77\1\uffff";
    static final String DFA6_eofS =
        "\100\uffff";
    static final String DFA6_minS =
        "\1\11\1\162\1\164\1\141\1\156\1\163\1\157\4\uffff\1\156\1\145\1"+
        "\60\4\uffff\2\151\1\162\1\154\1\144\1\167\2\164\1\147\2\164\1\151"+
        "\1\145\1\154\1\43\1\151\1\157\1\43\1\151\1\145\1\143\1\156\2\43"+
        "\1\uffff\1\164\1\43\1\uffff\1\156\1\43\1\150\1\147\2\uffff\1\143"+
        "\1\uffff\1\43\1\uffff\2\43\1\150\3\uffff\1\43\1\uffff";
    static final String DFA6_maxS =
        "\1\172\1\162\1\167\1\141\1\156\1\163\1\157\4\uffff\1\156\1\145"+
        "\1\71\4\uffff\2\151\1\162\1\163\1\144\1\167\2\164\1\147\2\164\1"+
        "\151\1\145\1\154\1\172\1\151\1\157\1\172\1\151\1\145\1\143\1\156"+
        "\2\172\1\uffff\1\164\1\172\1\uffff\1\156\1\172\1\150\1\147\2\uffff"+
        "\1\143\1\uffff\1\172\1\uffff\2\172\1\150\3\uffff\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\7\uffff\1\10\1\11\1\12\1\13\3\uffff\1\17\1\20\1\21\1\22\30\uffff"+
        "\1\4\2\uffff\1\14\4\uffff\1\3\1\7\1\uffff\1\6\1\uffff\1\1\3\uffff"+
        "\1\16\1\2\1\15\1\uffff\1\5";
    static final String DFA6_specialS =
        "\100\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\2\uffff\1\16\4\uffff\1\7\1"+
            "\11\2\uffff\1\10\3\uffff\1\17\1\15\10\17\1\12\6\uffff\32\20"+
            "\4\uffff\1\20\1\uffff\1\20\1\14\1\3\1\20\1\4\1\20\1\6\1\20\1"+
            "\13\10\20\1\5\1\2\3\20\1\1\3\20",
            "\1\22",
            "\1\24\2\uffff\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "",
            "",
            "",
            "\1\31",
            "\1\32",
            "\1\17\1\15\10\17",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\6\uffff\1\36",
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
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\53",
            "\1\54",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "\1\64",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "\1\66",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72",
            "",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\76",
            "",
            "",
            "",
            "\1\20\14\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_OS | RULE_INT | RULE_ID | RULE_WS );";
        }
    }
 

}