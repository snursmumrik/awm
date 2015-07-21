package ac.soton.awm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAWMLexer extends Lexer {
    public static final int RULE_ID=13;
    public static final int RULE_ADDR=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_OR=10;
    public static final int RULE_IMPLY=9;
    public static final int RULE_AND=11;
    public static final int RULE_COMMENT=5;
    public static final int RULE_SL_COMMENT=16;
    public static final int EOF=-1;
    public static final int RULE_REG=8;
    public static final int RULE_NOT=12;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=14;
    public static final int RULE_INT=7;
    public static final int RULE_PROC=4;
    public static final int RULE_WS=17;

    // delegates
    // delegators

    public InternalAWMLexer() {;} 
    public InternalAWMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAWMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:11:7: ( ':' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:11:9: ':'
            {
            match(':'); 

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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:12:7: ( 'ld' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:12:9: 'ld'
            {
            match("ld"); 


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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:13:7: ( ',' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:13:9: ','
            {
            match(','); 

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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:14:7: ( 'st' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:14:9: 'st'
            {
            match("st"); 


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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:15:7: ( 'd_ld' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:15:9: 'd_ld'
            {
            match("d_ld"); 


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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:16:7: ( 'd_st' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:16:9: 'd_st'
            {
            match("d_st"); 


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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:17:7: ( 'wait' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:17:9: 'wait'
            {
            match("wait"); 


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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:18:7: ( 'fence' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:18:9: 'fence'
            {
            match("fence"); 


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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:19:7: ( 'outcome:' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:19:9: 'outcome:'
            {
            match("outcome:"); 


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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:20:7: ( '(' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:20:9: '('
            {
            match('('); 

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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:21:7: ( ')' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:21:9: ')'
            {
            match(')'); 

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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:22:7: ( '=' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:22:9: '='
            {
            match('='); 

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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:23:7: ( '.' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_IMPLY"
    public final void mRULE_IMPLY() throws RecognitionException {
        try {
            int _type = RULE_IMPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1205:12: ( '=>' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1205:14: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPLY"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1207:9: ( 'or' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1207:11: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1209:10: ( 'and' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1209:12: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1211:10: ( 'not' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1211:12: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_PROC"
    public final void mRULE_PROC() throws RecognitionException {
        try {
            int _type = RULE_PROC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1213:11: ( ( 'P' | 'p' ) RULE_INT )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1213:13: ( 'P' | 'p' ) RULE_INT
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROC"

    // $ANTLR start "RULE_REG"
    public final void mRULE_REG() throws RecognitionException {
        try {
            int _type = RULE_REG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1215:10: ( ( 'R' | 'r' ) RULE_INT )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1215:12: ( 'R' | 'r' ) RULE_INT
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REG"

    // $ANTLR start "RULE_ADDR"
    public final void mRULE_ADDR() throws RecognitionException {
        try {
            int _type = RULE_ADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1217:11: ( ( 'A' | 'a' ) RULE_INT )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1217:13: ( 'A' | 'a' ) RULE_INT
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDR"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1219:14: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1219:16: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(';'); 
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1219:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1219:20: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1219:36: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1219:37: ( '\\r' )? '\\n'
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1219:37: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1219:37: '\\r'
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
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1221:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1221:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1221:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1221:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1221:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:
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
            	    break loop5;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1223:10: ( ( '0' .. '9' )+ )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1223:12: ( '0' .. '9' )+
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1223:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1223:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1225:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1227:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1227:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1227:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1227:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1229:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1229:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1229:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1229:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1229:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1229:41: ( '\\r' )? '\\n'
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1229:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1229:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1231:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1231:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1231:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1233:16: ( . )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1233:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_IMPLY | RULE_OR | RULE_AND | RULE_NOT | RULE_PROC | RULE_REG | RULE_ADDR | RULE_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=28;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:88: RULE_IMPLY
                {
                mRULE_IMPLY(); 

                }
                break;
            case 15 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:99: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 16 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:107: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 17 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:116: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 18 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:125: RULE_PROC
                {
                mRULE_PROC(); 

                }
                break;
            case 19 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:135: RULE_REG
                {
                mRULE_REG(); 

                }
                break;
            case 20 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:144: RULE_ADDR
                {
                mRULE_ADDR(); 

                }
                break;
            case 21 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:154: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 22 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:167: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:175: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:184: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:196: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:212: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:228: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1:236: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\2\uffff\1\35\1\uffff\5\35\2\uffff\1\50\1\uffff\5\35\1\uffff\1\32\2\uffff\3\32\3\uffff\1\65\2\uffff\1\66\4\35\1\74\5\uffff\1\35\1\76\1\35\1\100\1\101\10\uffff\5\35\1\uffff\1\107\1\uffff\1\110\2\uffff\1\111\1\112\1\113\2\35\5\uffff\1\116\1\35\1\uffff\2\35\1\uffff";
    static final String DFA15_eofS =
        "\122\uffff";
    static final String DFA15_minS =
        "\1\0\1\uffff\1\144\1\uffff\1\164\1\137\1\141\1\145\1\162\2\uffff\1\76\1\uffff\1\60\1\157\3\60\1\uffff\1\101\2\uffff\2\0\1\52\3\uffff\1\60\2\uffff\1\60\1\154\1\151\1\156\1\164\1\60\5\uffff\1\144\1\60\1\164\2\60\10\uffff\1\144\2\164\2\143\1\uffff\1\60\1\uffff\1\60\2\uffff\3\60\1\145\1\157\5\uffff\1\60\1\155\1\uffff\1\145\1\72\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\uffff\1\144\1\uffff\1\164\1\137\1\141\1\145\1\165\2\uffff\1\76\1\uffff\1\156\1\157\3\71\1\uffff\1\172\2\uffff\2\uffff\1\57\3\uffff\1\172\2\uffff\1\172\1\163\1\151\1\156\1\164\1\172\5\uffff\1\144\1\172\1\164\2\172\10\uffff\1\144\2\164\2\143\1\uffff\1\172\1\uffff\1\172\2\uffff\3\172\1\145\1\157\5\uffff\1\172\1\155\1\uffff\1\145\1\72\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\5\uffff\1\12\1\13\1\uffff\1\15\5\uffff\1\25\1\uffff\1\26\1\27\3\uffff\1\33\1\34\1\1\1\uffff\1\26\1\3\6\uffff\1\12\1\13\1\16\1\14\1\15\5\uffff\1\25\1\27\1\30\1\31\1\32\1\33\1\2\1\4\5\uffff\1\17\1\uffff\1\24\1\uffff\1\22\1\23\5\uffff\1\20\1\21\1\5\1\6\1\7\2\uffff\1\10\2\uffff\1\11";
    static final String DFA15_specialS =
        "\1\2\25\uffff\1\1\1\0\72\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\1\11\1\12\2\32\1\3\1\32\1\14\1\30\12\25\1\1\1\22\1\32\1\13\3\32\1\21\16\24\1\17\1\24\1\20\10\24\3\32\1\23\1\24\1\32\1\15\2\24\1\5\1\24\1\7\5\24\1\2\1\24\1\16\1\10\1\17\1\24\1\20\1\4\3\24\1\6\3\24\uff85\32",
            "",
            "\1\34",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\44\2\uffff\1\43",
            "",
            "",
            "\1\47",
            "",
            "\12\53\64\uffff\1\52",
            "\1\54",
            "\12\55",
            "\12\56",
            "\12\53",
            "",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\61",
            "\0\61",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\67\6\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\12\53\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\77",
            "\12\55\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\56\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_IMPLY | RULE_OR | RULE_AND | RULE_NOT | RULE_PROC | RULE_REG | RULE_ADDR | RULE_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_23 = input.LA(1);

                        s = -1;
                        if ( ((LA15_23>='\u0000' && LA15_23<='\uFFFF')) ) {s = 49;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_22 = input.LA(1);

                        s = -1;
                        if ( ((LA15_22>='\u0000' && LA15_22<='\uFFFF')) ) {s = 49;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0==':') ) {s = 1;}

                        else if ( (LA15_0=='l') ) {s = 2;}

                        else if ( (LA15_0==',') ) {s = 3;}

                        else if ( (LA15_0=='s') ) {s = 4;}

                        else if ( (LA15_0=='d') ) {s = 5;}

                        else if ( (LA15_0=='w') ) {s = 6;}

                        else if ( (LA15_0=='f') ) {s = 7;}

                        else if ( (LA15_0=='o') ) {s = 8;}

                        else if ( (LA15_0=='(') ) {s = 9;}

                        else if ( (LA15_0==')') ) {s = 10;}

                        else if ( (LA15_0=='=') ) {s = 11;}

                        else if ( (LA15_0=='.') ) {s = 12;}

                        else if ( (LA15_0=='a') ) {s = 13;}

                        else if ( (LA15_0=='n') ) {s = 14;}

                        else if ( (LA15_0=='P'||LA15_0=='p') ) {s = 15;}

                        else if ( (LA15_0=='R'||LA15_0=='r') ) {s = 16;}

                        else if ( (LA15_0=='A') ) {s = 17;}

                        else if ( (LA15_0==';') ) {s = 18;}

                        else if ( (LA15_0=='^') ) {s = 19;}

                        else if ( ((LA15_0>='B' && LA15_0<='O')||LA15_0=='Q'||(LA15_0>='S' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='b' && LA15_0<='c')||LA15_0=='e'||(LA15_0>='g' && LA15_0<='k')||LA15_0=='m'||LA15_0=='q'||(LA15_0>='t' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 20;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 21;}

                        else if ( (LA15_0=='\"') ) {s = 22;}

                        else if ( (LA15_0=='\'') ) {s = 23;}

                        else if ( (LA15_0=='/') ) {s = 24;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 25;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||LA15_0=='-'||LA15_0=='<'||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}