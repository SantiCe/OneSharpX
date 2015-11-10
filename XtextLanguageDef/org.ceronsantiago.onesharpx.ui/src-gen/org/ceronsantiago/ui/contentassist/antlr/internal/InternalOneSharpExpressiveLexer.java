package org.ceronsantiago.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public static final int T__24=24;
    public static final int T__25=25;
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
    public String getGrammarFileName() { return "../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:11:7: ( 'int' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:11:9: 'int'
            {
            match("int"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:12:7: ( 'string' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:12:9: 'string'
            {
            match("string"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:13:7: ( 'write' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:13:9: 'write'
            {
            match("write"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:14:7: ( 'switch' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:14:9: 'switch'
            {
            match("switch"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:15:7: ( 'case' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:15:9: 'case'
            {
            match("case"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:16:7: ( 'end' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:16:9: 'end'
            {
            match("end"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:17:7: ( 'rswitch' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:17:9: 'rswitch'
            {
            match("rswitch"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:18:7: ( 'goto' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:18:9: 'goto'
            {
            match("goto"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:19:7: ( 'call' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:19:9: 'call'
            {
            match("call"); 


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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:20:7: ( '(' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:20:9: '('
            {
            match('('); 

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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:21:7: ( ')' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:21:9: ')'
            {
            match(')'); 

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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:22:7: ( ',' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:22:9: ','
            {
            match(','); 

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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:23:7: ( ':' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:23:9: ':'
            {
            match(':'); 

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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:24:7: ( 'begin' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:24:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2609:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2609:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2611:21: ( '0' .. '9' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2611:23: '0' .. '9'
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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2613:10: ( ( RULE_DIGIT )+ )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2613:12: ( RULE_DIGIT )+
            {
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2613:12: ( RULE_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2613:12: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2615:9: ( ( RULE_LETTER )+ ( RULE_LETTER | RULE_DIGIT | '#' )* )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2615:11: ( RULE_LETTER )+ ( RULE_LETTER | RULE_DIGIT | '#' )*
            {
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2615:11: ( RULE_LETTER )+
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
            	    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2615:11: RULE_LETTER
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

            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2615:24: ( RULE_LETTER | RULE_DIGIT | '#' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='#'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:
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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2617:9: ( '\"' ( '1' | '#' )+ '\"' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2617:11: '\"' ( '1' | '#' )+ '\"'
            {
            match('\"'); 
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2617:15: ( '1' | '#' )+
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
            	    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:
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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2619:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | ';' )+ )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2619:11: ( ' ' | '\\t' | '\\r' | '\\n' | ';' )+
            {
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2619:11: ( ' ' | '\\t' | '\\r' | '\\n' | ';' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' '||LA5_0==';') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)==';' ) {
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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2621:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2621:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2621:24: ( options {greedy=false; } : . )*
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
            	    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2621:52: .
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
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2623:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2623:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2623:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2623:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2623:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2623:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2623:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:2623:41: '\\r'
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
        // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_INT | RULE_ID | RULE_OS | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt10=20;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:94: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:103: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:111: RULE_OS
                {
                mRULE_OS(); 

                }
                break;
            case 18 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:119: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:127: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../org.ceronsantiago.onesharpx.ui/src-gen/org/ceronsantiago/ui/contentassist/antlr/internal/InternalOneSharpExpressive.g:1:143: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\7\16\4\uffff\1\16\5\uffff\11\16\2\uffff\1\47\5\16\1\55"+
        "\3\16\1\uffff\3\16\1\64\1\65\1\uffff\1\16\1\67\3\16\1\73\2\uffff"+
        "\1\16\1\uffff\1\75\1\76\1\77\1\uffff\1\16\3\uffff\1\101\1\uffff";
    static final String DFA10_eofS =
        "\102\uffff";
    static final String DFA10_minS =
        "\1\11\1\156\1\164\1\162\1\141\1\156\1\163\1\157\4\uffff\1\145\4"+
        "\uffff\1\52\1\164\1\162\2\151\1\154\1\144\1\167\1\164\1\147\2\uffff"+
        "\1\43\1\151\2\164\1\145\1\154\1\43\1\151\1\157\1\151\1\uffff\1\156"+
        "\1\143\1\145\2\43\1\uffff\1\164\1\43\1\156\1\147\1\150\1\43\2\uffff"+
        "\1\143\1\uffff\3\43\1\uffff\1\150\3\uffff\1\43\1\uffff";
    static final String DFA10_maxS =
        "\1\172\1\156\1\167\1\162\1\141\1\156\1\163\1\157\4\uffff\1\145"+
        "\4\uffff\1\57\1\164\1\162\2\151\1\163\1\144\1\167\1\164\1\147\2"+
        "\uffff\1\172\1\151\2\164\1\145\1\154\1\172\1\151\1\157\1\151\1\uffff"+
        "\1\156\1\143\1\145\2\172\1\uffff\1\164\1\172\1\156\1\147\1\150\1"+
        "\172\2\uffff\1\143\1\uffff\3\172\1\uffff\1\150\3\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\10\uffff\1\12\1\13\1\14\1\15\1\uffff\1\17\1\20\1\21\1\22\12\uffff"+
        "\1\23\1\24\12\uffff\1\1\5\uffff\1\6\6\uffff\1\5\1\11\1\uffff\1\10"+
        "\3\uffff\1\3\1\uffff\1\16\1\2\1\4\1\uffff\1\7";
    static final String DFA10_specialS =
        "\102\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\20\2\uffff\1\20\22\uffff\1\20\1\uffff\1\17\5\uffff\1\10"+
            "\1\11\2\uffff\1\12\2\uffff\1\21\12\15\1\13\1\20\5\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\1\16\1\14\1\4\1\16\1\5\1\16\1\7\1\16\1"+
            "\1\10\16\1\6\1\2\3\16\1\3\3\16",
            "\1\22",
            "\1\23\2\uffff\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "",
            "",
            "\1\32",
            "",
            "",
            "",
            "",
            "\1\33\4\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\42\6\uffff\1\41",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "",
            "\1\66",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "",
            "",
            "\1\74",
            "",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "",
            "\1\100",
            "",
            "",
            "",
            "\1\16\14\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_INT | RULE_ID | RULE_OS | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );";
        }
    }
 

}