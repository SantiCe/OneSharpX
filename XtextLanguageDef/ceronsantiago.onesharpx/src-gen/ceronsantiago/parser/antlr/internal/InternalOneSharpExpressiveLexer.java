package ceronsantiago.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOneSharpExpressiveLexer extends Lexer {
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_OS=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_DIGIT=8;
    public static final int RULE_LETTER=7;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
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
    public String getGrammarFileName() { return "InternalOneSharpExpressive.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOneSharpExpressive.g:11:7: ( 'write' )
            // InternalOneSharpExpressive.g:11:9: 'write'
            {
            match("write"); 


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
            // InternalOneSharpExpressive.g:12:7: ( 'switch' )
            // InternalOneSharpExpressive.g:12:9: 'switch'
            {
            match("switch"); 


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
            // InternalOneSharpExpressive.g:13:7: ( 'case' )
            // InternalOneSharpExpressive.g:13:9: 'case'
            {
            match("case"); 


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
            // InternalOneSharpExpressive.g:14:7: ( 'end' )
            // InternalOneSharpExpressive.g:14:9: 'end'
            {
            match("end"); 


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
            // InternalOneSharpExpressive.g:15:7: ( 'goto' )
            // InternalOneSharpExpressive.g:15:9: 'goto'
            {
            match("goto"); 


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
            // InternalOneSharpExpressive.g:16:7: ( '(' )
            // InternalOneSharpExpressive.g:16:9: '('
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
            // InternalOneSharpExpressive.g:17:7: ( ',' )
            // InternalOneSharpExpressive.g:17:9: ','
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
            // InternalOneSharpExpressive.g:18:7: ( ')' )
            // InternalOneSharpExpressive.g:18:9: ')'
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
            // InternalOneSharpExpressive.g:19:7: ( ':' )
            // InternalOneSharpExpressive.g:19:9: ':'
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
            // InternalOneSharpExpressive.g:20:7: ( 'int' )
            // InternalOneSharpExpressive.g:20:9: 'int'
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
            // InternalOneSharpExpressive.g:21:7: ( 'string' )
            // InternalOneSharpExpressive.g:21:9: 'string'
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
            // InternalOneSharpExpressive.g:22:7: ( 'begin' )
            // InternalOneSharpExpressive.g:22:9: 'begin'
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
            // InternalOneSharpExpressive.g:987:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // InternalOneSharpExpressive.g:987:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
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
            // InternalOneSharpExpressive.g:989:21: ( '0' .. '9' )
            // InternalOneSharpExpressive.g:989:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOneSharpExpressive.g:991:10: ( '1' .. '9' ( RULE_DIGIT )* )
            // InternalOneSharpExpressive.g:991:12: '1' .. '9' ( RULE_DIGIT )*
            {
            matchRange('1','9'); 
            // InternalOneSharpExpressive.g:991:21: ( RULE_DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOneSharpExpressive.g:991:21: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOneSharpExpressive.g:993:9: ( ( RULE_LETTER )+ ( RULE_LETTER | RULE_DIGIT | '#' )* )
            // InternalOneSharpExpressive.g:993:11: ( RULE_LETTER )+ ( RULE_LETTER | RULE_DIGIT | '#' )*
            {
            // InternalOneSharpExpressive.g:993:11: ( RULE_LETTER )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOneSharpExpressive.g:993:11: RULE_LETTER
            	    {
            	    mRULE_LETTER(); 

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

            // InternalOneSharpExpressive.g:993:24: ( RULE_LETTER | RULE_DIGIT | '#' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='#'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOneSharpExpressive.g:
            	    {
            	    if ( input.LA(1)=='#'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_OS"
    public final void mRULE_OS() throws RecognitionException {
        try {
            int _type = RULE_OS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOneSharpExpressive.g:995:9: ( '\"' ( '1' | '#' )+ '\"' )
            // InternalOneSharpExpressive.g:995:11: '\"' ( '1' | '#' )+ '\"'
            {
            match('\"'); 
            // InternalOneSharpExpressive.g:995:15: ( '1' | '#' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='#'||LA4_0=='1') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOneSharpExpressive.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OS"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOneSharpExpressive.g:997:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOneSharpExpressive.g:997:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOneSharpExpressive.g:997:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalOneSharpExpressive.g:
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOneSharpExpressive.g:999:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOneSharpExpressive.g:999:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOneSharpExpressive.g:999:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOneSharpExpressive.g:999:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOneSharpExpressive.g:1001:17: ( ( '//' | ';' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOneSharpExpressive.g:1001:19: ( '//' | ';' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalOneSharpExpressive.g:1001:19: ( '//' | ';' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                alt7=1;
            }
            else if ( (LA7_0==';') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOneSharpExpressive.g:1001:20: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // InternalOneSharpExpressive.g:1001:25: ';'
                    {
                    match(';'); 

                    }
                    break;

            }

            // InternalOneSharpExpressive.g:1001:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOneSharpExpressive.g:1001:30: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalOneSharpExpressive.g:1001:46: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOneSharpExpressive.g:1001:47: ( '\\r' )? '\\n'
                    {
                    // InternalOneSharpExpressive.g:1001:47: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalOneSharpExpressive.g:1001:47: '\\r'
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

    public void mTokens() throws RecognitionException {
        // InternalOneSharpExpressive.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_INT | RULE_ID | RULE_OS | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt11=18;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalOneSharpExpressive.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalOneSharpExpressive.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalOneSharpExpressive.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalOneSharpExpressive.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalOneSharpExpressive.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalOneSharpExpressive.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalOneSharpExpressive.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalOneSharpExpressive.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalOneSharpExpressive.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalOneSharpExpressive.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalOneSharpExpressive.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalOneSharpExpressive.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalOneSharpExpressive.g:1:82: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // InternalOneSharpExpressive.g:1:91: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalOneSharpExpressive.g:1:99: RULE_OS
                {
                mRULE_OS(); 

                }
                break;
            case 16 :
                // InternalOneSharpExpressive.g:1:107: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalOneSharpExpressive.g:1:115: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalOneSharpExpressive.g:1:131: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\5\15\4\uffff\2\15\6\uffff\10\15\1\uffff\4\15\1\47\1\15\1\51\4\15\1\56\1\uffff\1\57\1\uffff\1\15\1\61\2\15\2\uffff\1\64\1\uffff\1\65\1\66\3\uffff";
    static final String DFA11_eofS =
        "\67\uffff";
    static final String DFA11_minS =
        "\1\11\1\162\1\164\1\141\1\156\1\157\4\uffff\1\156\1\145\4\uffff\1\52\1\uffff\2\151\1\162\1\163\1\144\2\164\1\147\1\uffff\2\164\1\151\1\145\1\43\1\157\1\43\1\151\1\145\1\143\1\156\1\43\1\uffff\1\43\1\uffff\1\156\1\43\1\150\1\147\2\uffff\1\43\1\uffff\2\43\3\uffff";
    static final String DFA11_maxS =
        "\1\172\1\162\1\167\1\141\1\156\1\157\4\uffff\1\156\1\145\4\uffff\1\57\1\uffff\2\151\1\162\1\163\1\144\2\164\1\147\1\uffff\2\164\1\151\1\145\1\172\1\157\1\172\1\151\1\145\1\143\1\156\1\172\1\uffff\1\172\1\uffff\1\156\1\172\1\150\1\147\2\uffff\1\172\1\uffff\2\172\3\uffff";
    static final String DFA11_acceptS =
        "\6\uffff\1\6\1\7\1\10\1\11\2\uffff\1\15\1\16\1\17\1\20\1\uffff\1\22\10\uffff\1\21\14\uffff\1\4\1\uffff\1\12\4\uffff\1\3\1\5\1\uffff\1\1\2\uffff\1\14\1\2\1\13";
    static final String DFA11_specialS =
        "\67\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\1\uffff\1\16\5\uffff\1\6\1\10\2\uffff\1\7\2\uffff\1\20\1\uffff\11\14\1\11\1\21\5\uffff\32\15\4\uffff\1\15\1\uffff\1\15\1\13\1\3\1\15\1\4\1\15\1\5\1\15\1\12\11\15\1\2\3\15\1\1\3\15",
            "\1\22",
            "\1\24\2\uffff\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "",
            "",
            "",
            "\1\30",
            "\1\31",
            "",
            "",
            "",
            "",
            "\1\32\4\uffff\1\21",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\15\14\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\50",
            "\1\15\14\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\15\14\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "\1\15\14\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "\1\60",
            "\1\15\14\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\62",
            "\1\63",
            "",
            "",
            "\1\15\14\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "\1\15\14\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\15\14\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_INT | RULE_ID | RULE_OS | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );";
        }
    }
 

}