// $ANTLR 3.4 E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g 2012-01-25 22:10:50
 package c2pproject.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class C2PLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AUTO=4;
    public static final int BECOMES=5;
    public static final int BREAK=6;
    public static final int CASE=7;
    public static final int CHAR=8;
    public static final int COLON=9;
    public static final int COMMA=10;
    public static final int CONST=11;
    public static final int CONTINUE=12;
    public static final int DEFAULT=13;
    public static final int DIGITS=14;
    public static final int DIV=15;
    public static final int DO=16;
    public static final int DOT=17;
    public static final int DOTDOT=18;
    public static final int DOUBLE=19;
    public static final int ELSE=20;
    public static final int ENUM=21;
    public static final int EQUALS=22;
    public static final int EXTERN=23;
    public static final int FLOAT=24;
    public static final int FOR=25;
    public static final int GOTO=26;
    public static final int GT=27;
    public static final int GTE=28;
    public static final int IDENT=29;
    public static final int IF=30;
    public static final int IL_COMMENT=31;
    public static final int INT=32;
    public static final int LBRACKET=33;
    public static final int LETTER=34;
    public static final int LIT_CHAR=35;
    public static final int LIT_FLOAT=36;
    public static final int LIT_INT=37;
    public static final int LIT_STRING=38;
    public static final int LLETTER=39;
    public static final int LONG=40;
    public static final int LPAREN=41;
    public static final int LT=42;
    public static final int LTE=43;
    public static final int L_C_BRACKET=44;
    public static final int MINUS=45;
    public static final int ML_COMMENT=46;
    public static final int NOT_EQUALS=47;
    public static final int PLUS=48;
    public static final int RBRACKET=49;
    public static final int REGISTER=50;
    public static final int RETURN=51;
    public static final int RPAREN=52;
    public static final int R_C_BRACKET=53;
    public static final int SEMI=54;
    public static final int SHORT=55;
    public static final int SIGNED=56;
    public static final int SIZEOF=57;
    public static final int STATIC=58;
    public static final int STRUCT=59;
    public static final int SWITCH=60;
    public static final int TIMES=61;
    public static final int TYPEDEF=62;
    public static final int ULETTER=63;
    public static final int UNDER_SCORES=64;
    public static final int UNION=65;
    public static final int UNSIGNED=66;
    public static final int VOID=67;
    public static final int VOLATILE=68;
    public static final int WHILE=69;
    public static final int WS=70;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public C2PLexer() {} 
    public C2PLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public C2PLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g"; }

    // $ANTLR start "AUTO"
    public final void mAUTO() throws RecognitionException {
        try {
            int _type = AUTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:9:7: ( 'auto' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:9:9: 'auto'
            {
            match("auto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AUTO"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:10:7: ( 'break' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:10:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:11:6: ( 'case' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:11:8: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:12:6: ( 'char' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:12:8: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:13:7: ( 'const' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:13:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:14:9: ( 'continue' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:14:11: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:15:9: ( 'default' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:15:11: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:16:5: ( 'do' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:16:7: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:17:8: ( 'double' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:17:10: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:18:6: ( 'else' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:18:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:19:6: ( 'enum' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:19:8: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "EXTERN"
    public final void mEXTERN() throws RecognitionException {
        try {
            int _type = EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:20:8: ( 'extern' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:20:10: 'extern'
            {
            match("extern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTERN"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:21:7: ( 'float' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:21:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:22:6: ( 'for' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:22:8: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:23:6: ( 'goto' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:23:8: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:24:5: ( 'if' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:24:7: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:25:6: ( 'int' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:25:8: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:26:6: ( 'long' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:26:8: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "REGISTER"
    public final void mREGISTER() throws RecognitionException {
        try {
            int _type = REGISTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:27:9: ( 'register' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:27:11: 'register'
            {
            match("register"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGISTER"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:28:8: ( 'return' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:28:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SHORT"
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:29:7: ( 'short' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:29:9: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHORT"

    // $ANTLR start "SIGNED"
    public final void mSIGNED() throws RecognitionException {
        try {
            int _type = SIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:30:8: ( 'signed' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:30:10: 'signed'
            {
            match("signed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGNED"

    // $ANTLR start "SIZEOF"
    public final void mSIZEOF() throws RecognitionException {
        try {
            int _type = SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:31:8: ( 'sizeof' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:31:10: 'sizeof'
            {
            match("sizeof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZEOF"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:32:8: ( 'static' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:32:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:33:8: ( 'struct' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:33:10: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:34:8: ( 'switch' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:34:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:35:9: ( 'typedef' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:35:11: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPEDEF"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:36:7: ( 'union' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:36:9: 'union'
            {
            match("union"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "UNSIGNED"
    public final void mUNSIGNED() throws RecognitionException {
        try {
            int _type = UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:37:9: ( 'unsigned' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:37:11: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNSIGNED"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:38:6: ( 'void' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:38:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "VOLATILE"
    public final void mVOLATILE() throws RecognitionException {
        try {
            int _type = VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:39:10: ( 'volatile' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:39:11: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOLATILE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:40:7: ( 'while' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:40:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:43:3: ( LETTER ( LETTER | DIGITS )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:43:5: LETTER ( LETTER | DIGITS )*
            {
            mLETTER(); 


            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:43:12: ( LETTER | DIGITS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            int _type = DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:48:7: ( '0' .. '9' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "LLETTER"
    public final void mLLETTER() throws RecognitionException {
        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:52:7: ( 'a' .. 'z' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LLETTER"

    // $ANTLR start "UNDER_SCORES"
    public final void mUNDER_SCORES() throws RecognitionException {
        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:56:7: ( '_' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:56:9: '_'
            {
            match('_'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDER_SCORES"

    // $ANTLR start "ULETTER"
    public final void mULETTER() throws RecognitionException {
        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:60:3: ( 'A' .. 'Z' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ULETTER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:64:3: ( ULETTER | LLETTER | UNDER_SCORES )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "LIT_INT"
    public final void mLIT_INT() throws RecognitionException {
        try {
            int _type = LIT_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:68:3: ( ( DIGITS )+ )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:68:7: ( DIGITS )+
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:68:7: ( DIGITS )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIT_INT"

    // $ANTLR start "LIT_FLOAT"
    public final void mLIT_FLOAT() throws RecognitionException {
        try {
            int _type = LIT_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:72:3: ( ( DIGITS )+ '.' ( DIGITS )+ )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:72:7: ( DIGITS )+ '.' ( DIGITS )+
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:72:7: ( DIGITS )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            match('.'); 

            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:72:21: ( DIGITS )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIT_FLOAT"

    // $ANTLR start "LIT_CHAR"
    public final void mLIT_CHAR() throws RecognitionException {
        try {
            int _type = LIT_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:76:3: ( '\\'' LETTER | DIGITS | UNDER_SCORES '\\'' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt5=1;
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
                alt5=2;
                }
                break;
            case '_':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:76:5: '\\'' LETTER
                    {
                    match('\''); 

                    mLETTER(); 


                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:76:18: DIGITS
                    {
                    mDIGITS(); 


                    }
                    break;
                case 3 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:76:27: UNDER_SCORES '\\''
                    {
                    mUNDER_SCORES(); 


                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIT_CHAR"

    // $ANTLR start "LIT_STRING"
    public final void mLIT_STRING() throws RecognitionException {
        try {
            int _type = LIT_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:80:3: ( '\"' ( LETTER )* '\"' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:80:5: '\"' ( LETTER )* '\"'
            {
            match('\"'); 

            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:80:9: ( LETTER )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIT_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:86:5: ( ( ' ' | '\\t' | '\\f' ) | ( ( '\\r' | '\\n' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\t'||LA7_0=='\f'||LA7_0==' ') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:86:9: ( ' ' | '\\t' | '\\f' )
                    {
                    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:86:27: ( ( '\\r' | '\\n' ) )
                    {
                    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "IL_COMMENT"
    public final void mIL_COMMENT() throws RecognitionException {
        try {
            int _type = IL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:97:3: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:97:5: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 



            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:97:10: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:102:3: ( '/*' ( . )* '*/' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:102:5: '/*' ( . )* '*/'
            {
            match("/*"); 



            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:102:10: ( . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:102:10: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:106:12: ( '.' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:106:14: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "BECOMES"
    public final void mBECOMES() throws RecognitionException {
        try {
            int _type = BECOMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:107:12: ( '=>' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:107:14: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BECOMES"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:108:12: ( ':' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:108:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:109:12: ( ';' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:109:14: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:110:12: ( ',' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:110:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:111:12: ( '=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:111:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:112:12: ( '[' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:112:14: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:113:12: ( ']' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:113:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "DOTDOT"
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:114:12: ( '..' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:114:14: '..'
            {
            match(".."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTDOT"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:115:12: ( '(' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:115:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:116:12: ( ')' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:116:14: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "NOT_EQUALS"
    public final void mNOT_EQUALS() throws RecognitionException {
        try {
            int _type = NOT_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:117:12: ( '/=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:117:14: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUALS"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:118:12: ( '<' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:118:14: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:119:12: ( '<=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:119:14: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:120:12: ( '>' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:120:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:121:12: ( '>=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:121:14: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:122:12: ( '+' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:122:14: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:123:12: ( '-' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:123:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:124:12: ( '*' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:124:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:125:12: ( '/' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:125:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "L_C_BRACKET"
    public final void mL_C_BRACKET() throws RecognitionException {
        try {
            int _type = L_C_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:126:12: ( '{' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:126:14: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_C_BRACKET"

    // $ANTLR start "R_C_BRACKET"
    public final void mR_C_BRACKET() throws RecognitionException {
        try {
            int _type = R_C_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:127:12: ( '}' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:127:14: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_C_BRACKET"

    public void mTokens() throws RecognitionException {
        // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:8: ( AUTO | BREAK | CASE | CHAR | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTERN | FLOAT | FOR | GOTO | IF | INT | LONG | REGISTER | RETURN | SHORT | SIGNED | SIZEOF | STATIC | STRUCT | SWITCH | TYPEDEF | UNION | UNSIGNED | VOID | VOLATILE | WHILE | IDENT | DIGITS | LIT_INT | LIT_FLOAT | LIT_CHAR | LIT_STRING | WS | IL_COMMENT | ML_COMMENT | DOT | BECOMES | COLON | SEMI | COMMA | EQUALS | LBRACKET | RBRACKET | DOTDOT | LPAREN | RPAREN | NOT_EQUALS | LT | LTE | GT | GTE | PLUS | MINUS | TIMES | DIV | L_C_BRACKET | R_C_BRACKET )
        int alt10=63;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:10: AUTO
                {
                mAUTO(); 


                }
                break;
            case 2 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:15: BREAK
                {
                mBREAK(); 


                }
                break;
            case 3 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:21: CASE
                {
                mCASE(); 


                }
                break;
            case 4 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:26: CHAR
                {
                mCHAR(); 


                }
                break;
            case 5 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:31: CONST
                {
                mCONST(); 


                }
                break;
            case 6 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:37: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 7 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:46: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 8 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:54: DO
                {
                mDO(); 


                }
                break;
            case 9 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:57: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 10 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:64: ELSE
                {
                mELSE(); 


                }
                break;
            case 11 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:69: ENUM
                {
                mENUM(); 


                }
                break;
            case 12 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:74: EXTERN
                {
                mEXTERN(); 


                }
                break;
            case 13 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:81: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 14 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:87: FOR
                {
                mFOR(); 


                }
                break;
            case 15 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:91: GOTO
                {
                mGOTO(); 


                }
                break;
            case 16 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:96: IF
                {
                mIF(); 


                }
                break;
            case 17 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:99: INT
                {
                mINT(); 


                }
                break;
            case 18 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:103: LONG
                {
                mLONG(); 


                }
                break;
            case 19 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:108: REGISTER
                {
                mREGISTER(); 


                }
                break;
            case 20 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:117: RETURN
                {
                mRETURN(); 


                }
                break;
            case 21 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:124: SHORT
                {
                mSHORT(); 


                }
                break;
            case 22 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:130: SIGNED
                {
                mSIGNED(); 


                }
                break;
            case 23 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:137: SIZEOF
                {
                mSIZEOF(); 


                }
                break;
            case 24 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:144: STATIC
                {
                mSTATIC(); 


                }
                break;
            case 25 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:151: STRUCT
                {
                mSTRUCT(); 


                }
                break;
            case 26 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:158: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 27 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:165: TYPEDEF
                {
                mTYPEDEF(); 


                }
                break;
            case 28 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:173: UNION
                {
                mUNION(); 


                }
                break;
            case 29 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:179: UNSIGNED
                {
                mUNSIGNED(); 


                }
                break;
            case 30 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:188: VOID
                {
                mVOID(); 


                }
                break;
            case 31 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:193: VOLATILE
                {
                mVOLATILE(); 


                }
                break;
            case 32 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:202: WHILE
                {
                mWHILE(); 


                }
                break;
            case 33 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:208: IDENT
                {
                mIDENT(); 


                }
                break;
            case 34 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:214: DIGITS
                {
                mDIGITS(); 


                }
                break;
            case 35 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:221: LIT_INT
                {
                mLIT_INT(); 


                }
                break;
            case 36 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:229: LIT_FLOAT
                {
                mLIT_FLOAT(); 


                }
                break;
            case 37 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:239: LIT_CHAR
                {
                mLIT_CHAR(); 


                }
                break;
            case 38 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:248: LIT_STRING
                {
                mLIT_STRING(); 


                }
                break;
            case 39 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:259: WS
                {
                mWS(); 


                }
                break;
            case 40 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:262: IL_COMMENT
                {
                mIL_COMMENT(); 


                }
                break;
            case 41 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:273: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 42 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:284: DOT
                {
                mDOT(); 


                }
                break;
            case 43 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:288: BECOMES
                {
                mBECOMES(); 


                }
                break;
            case 44 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:296: COLON
                {
                mCOLON(); 


                }
                break;
            case 45 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:302: SEMI
                {
                mSEMI(); 


                }
                break;
            case 46 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:307: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 47 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:313: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 48 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:320: LBRACKET
                {
                mLBRACKET(); 


                }
                break;
            case 49 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:329: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 50 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:338: DOTDOT
                {
                mDOTDOT(); 


                }
                break;
            case 51 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:345: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 52 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:352: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 53 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:359: NOT_EQUALS
                {
                mNOT_EQUALS(); 


                }
                break;
            case 54 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:370: LT
                {
                mLT(); 


                }
                break;
            case 55 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:373: LTE
                {
                mLTE(); 


                }
                break;
            case 56 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:377: GT
                {
                mGT(); 


                }
                break;
            case 57 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:380: GTE
                {
                mGTE(); 


                }
                break;
            case 58 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:384: PLUS
                {
                mPLUS(); 


                }
                break;
            case 59 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:389: MINUS
                {
                mMINUS(); 


                }
                break;
            case 60 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:395: TIMES
                {
                mTIMES(); 


                }
                break;
            case 61 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:401: DIV
                {
                mDIV(); 


                }
                break;
            case 62 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:405: L_C_BRACKET
                {
                mL_C_BRACKET(); 


                }
                break;
            case 63 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PLexer.g:1:417: R_C_BRACKET
                {
                mR_C_BRACKET(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\20\23\1\100\4\uffff\1\106\1\110\1\112\7\uffff\1\114\1\116"+
        "\5\uffff\6\23\1\126\6\23\1\135\13\23\1\uffff\1\156\15\uffff\7\23"+
        "\1\uffff\4\23\1\173\1\23\1\uffff\1\175\17\23\1\uffff\1\u008d\1\23"+
        "\1\u008f\1\u0090\4\23\1\u0095\1\u0096\2\23\1\uffff\1\u0099\1\uffff"+
        "\1\u009a\13\23\1\u00a6\2\23\1\uffff\1\u00a9\2\uffff\1\u00aa\3\23"+
        "\2\uffff\1\23\1\u00af\2\uffff\2\23\1\u00b2\6\23\1\u00b9\1\23\1\uffff"+
        "\1\23\1\u00bc\2\uffff\2\23\1\u00bf\1\u00c0\1\uffff\1\23\1\u00c2"+
        "\1\uffff\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\23\1\uffff\2"+
        "\23\1\uffff\1\23\1\u00cc\2\uffff\1\23\6\uffff\1\u00ce\2\23\1\u00d1"+
        "\1\uffff\1\u00d2\1\uffff\1\u00d3\1\u00d4\4\uffff";
    static final String DFA10_eofS =
        "\u00d5\uffff";
    static final String DFA10_minS =
        "\1\11\1\165\1\162\1\141\1\145\2\154\1\157\1\146\1\157\1\145\1\150"+
        "\1\171\1\156\1\157\1\150\1\47\1\56\4\uffff\1\52\1\56\1\76\7\uffff"+
        "\2\75\5\uffff\1\164\1\145\1\163\1\141\1\156\1\146\1\60\1\163\1\165"+
        "\1\164\1\157\1\162\1\164\1\60\1\164\1\156\1\147\1\157\1\147\1\141"+
        "\1\151\1\160\3\151\1\uffff\1\56\15\uffff\1\157\1\141\1\145\1\162"+
        "\1\163\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1\60\1\157\1"+
        "\uffff\1\60\1\147\1\151\1\165\1\162\1\156\1\145\1\164\1\165\1\164"+
        "\1\145\1\157\1\151\1\144\1\141\1\154\1\uffff\1\60\1\153\2\60\1\164"+
        "\1\151\1\165\1\154\2\60\1\162\1\164\1\uffff\1\60\1\uffff\1\60\1"+
        "\163\1\162\1\164\1\145\1\157\1\151\2\143\1\144\1\156\1\147\1\60"+
        "\1\164\1\145\1\uffff\1\60\2\uffff\1\60\1\156\1\154\1\145\2\uffff"+
        "\1\156\1\60\2\uffff\1\164\1\156\1\60\1\144\1\146\1\143\1\164\1\150"+
        "\1\145\1\60\1\156\1\uffff\1\151\1\60\2\uffff\1\165\1\164\2\60\1"+
        "\uffff\1\145\1\60\1\uffff\5\60\1\146\1\uffff\1\145\1\154\1\uffff"+
        "\1\145\1\60\2\uffff\1\162\6\uffff\1\60\1\144\1\145\1\60\1\uffff"+
        "\1\60\1\uffff\2\60\4\uffff";
    static final String DFA10_maxS =
        "\1\175\1\165\1\162\2\157\1\170\2\157\1\156\1\157\1\145\1\167\1\171"+
        "\1\156\1\157\1\150\1\47\1\71\4\uffff\1\75\1\56\1\76\7\uffff\2\75"+
        "\5\uffff\1\164\1\145\1\163\1\141\1\156\1\146\1\172\1\163\1\165\1"+
        "\164\1\157\1\162\1\164\1\172\1\164\1\156\1\164\1\157\1\172\1\162"+
        "\1\151\1\160\1\163\1\154\1\151\1\uffff\1\71\15\uffff\1\157\1\141"+
        "\1\145\1\162\1\164\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1"+
        "\172\1\157\1\uffff\1\172\1\147\1\151\1\165\1\162\1\156\1\145\1\164"+
        "\1\165\1\164\1\145\1\157\1\151\1\144\1\141\1\154\1\uffff\1\172\1"+
        "\153\2\172\1\164\1\151\1\165\1\154\2\172\1\162\1\164\1\uffff\1\172"+
        "\1\uffff\1\172\1\163\1\162\1\164\1\145\1\157\1\151\2\143\1\144\1"+
        "\156\1\147\1\172\1\164\1\145\1\uffff\1\172\2\uffff\1\172\1\156\1"+
        "\154\1\145\2\uffff\1\156\1\172\2\uffff\1\164\1\156\1\172\1\144\1"+
        "\146\1\143\1\164\1\150\1\145\1\172\1\156\1\uffff\1\151\1\172\2\uffff"+
        "\1\165\1\164\2\172\1\uffff\1\145\1\172\1\uffff\5\172\1\146\1\uffff"+
        "\1\145\1\154\1\uffff\1\145\1\172\2\uffff\1\162\6\uffff\1\172\1\144"+
        "\1\145\1\172\1\uffff\1\172\1\uffff\2\172\4\uffff";
    static final String DFA10_acceptS =
        "\22\uffff\1\45\1\41\1\46\1\47\3\uffff\1\54\1\55\1\56\1\60\1\61\1"+
        "\63\1\64\2\uffff\1\72\1\73\1\74\1\76\1\77\31\uffff\1\42\1\uffff"+
        "\1\44\1\50\1\51\1\65\1\75\1\62\1\52\1\53\1\57\1\67\1\66\1\71\1\70"+
        "\7\uffff\1\10\6\uffff\1\20\20\uffff\1\43\14\uffff\1\16\1\uffff\1"+
        "\21\17\uffff\1\1\1\uffff\1\3\1\4\4\uffff\1\12\1\13\2\uffff\1\17"+
        "\1\22\13\uffff\1\36\2\uffff\1\2\1\5\4\uffff\1\15\2\uffff\1\25\6"+
        "\uffff\1\34\2\uffff\1\40\2\uffff\1\11\1\14\1\uffff\1\24\1\26\1\27"+
        "\1\30\1\31\1\32\4\uffff\1\7\1\uffff\1\33\2\uffff\1\6\1\23\1\35\1"+
        "\37";
    static final String DFA10_specialS =
        "\u00d5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\25\1\uffff\2\25\22\uffff\1\25\1\uffff\1\24\4\uffff\1\22\1"+
            "\36\1\37\1\44\1\42\1\33\1\43\1\27\1\26\12\21\1\31\1\32\1\40"+
            "\1\30\1\41\2\uffff\32\23\1\34\1\uffff\1\35\1\uffff\1\20\1\uffff"+
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\23\1\10\2\23\1\11\5\23\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\3\23\1\45\1\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51\6\uffff\1\52\6\uffff\1\53",
            "\1\54\11\uffff\1\55",
            "\1\56\1\uffff\1\57\11\uffff\1\60",
            "\1\61\2\uffff\1\62",
            "\1\63",
            "\1\64\7\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70\1\71\12\uffff\1\72\2\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\22",
            "\1\102\1\uffff\12\101",
            "",
            "",
            "",
            "",
            "\1\104\4\uffff\1\103\15\uffff\1\105",
            "\1\107",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\24\23\1\125\5\23",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\136",
            "\1\137",
            "\1\140\14\uffff\1\141",
            "\1\142",
            "\1\143\22\uffff\1\144",
            "\1\145\20\uffff\1\146",
            "\1\147",
            "\1\150",
            "\1\151\11\uffff\1\152",
            "\1\153\2\uffff\1\154",
            "\1\155",
            "",
            "\1\102\1\uffff\12\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\174",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
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
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u008e",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u0097",
            "\1\u0098",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
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
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\u00c1",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\1\u00cd",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00cf",
            "\1\u00d0",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( AUTO | BREAK | CASE | CHAR | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTERN | FLOAT | FOR | GOTO | IF | INT | LONG | REGISTER | RETURN | SHORT | SIGNED | SIZEOF | STATIC | STRUCT | SWITCH | TYPEDEF | UNION | UNSIGNED | VOID | VOLATILE | WHILE | IDENT | DIGITS | LIT_INT | LIT_FLOAT | LIT_CHAR | LIT_STRING | WS | IL_COMMENT | ML_COMMENT | DOT | BECOMES | COLON | SEMI | COMMA | EQUALS | LBRACKET | RBRACKET | DOTDOT | LPAREN | RPAREN | NOT_EQUALS | LT | LTE | GT | GTE | PLUS | MINUS | TIMES | DIV | L_C_BRACKET | R_C_BRACKET );";
        }
    }
 

}