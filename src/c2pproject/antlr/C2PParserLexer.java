// $ANTLR 3.4 E:\\workspace\\CompilerAssignment\\src\\C2PParser.g 2012-01-31 00:07:16

	package c2pproject.antlr;     


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class C2PParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
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
    public static final int D_QUOTE=20;
    public static final int ELSE=21;
    public static final int ENUM=22;
    public static final int EQUALS=23;
    public static final int EXCLAM=24;
    public static final int EXTERN=25;
    public static final int FLOAT=26;
    public static final int FOR=27;
    public static final int GOTO=28;
    public static final int GT=29;
    public static final int GTE=30;
    public static final int IDENT=31;
    public static final int IF=32;
    public static final int IL_COMMENT=33;
    public static final int INT=34;
    public static final int LBRACKET=35;
    public static final int LETTER=36;
    public static final int LINE_COMMAND=37;
    public static final int LIT_CHAR=38;
    public static final int LIT_FLOAT=39;
    public static final int LIT_INT=40;
    public static final int LIT_STRING=41;
    public static final int LLETTER=42;
    public static final int LONG=43;
    public static final int LPAREN=44;
    public static final int LT=45;
    public static final int LTE=46;
    public static final int L_C_BRACKET=47;
    public static final int MINUS=48;
    public static final int ML_COMMENT=49;
    public static final int MOD=50;
    public static final int NOT_EQUALS=51;
    public static final int PERCENTAGE=52;
    public static final int PLUS=53;
    public static final int PRINTF=54;
    public static final int RBRACKET=55;
    public static final int REF=56;
    public static final int REGISTER=57;
    public static final int RETURN=58;
    public static final int RPAREN=59;
    public static final int R_C_BRACKET=60;
    public static final int SCANF=61;
    public static final int SEMI=62;
    public static final int SHORT=63;
    public static final int SIGNED=64;
    public static final int SIZEOF=65;
    public static final int STATIC=66;
    public static final int STRUCT=67;
    public static final int SWITCH=68;
    public static final int TIMES=69;
    public static final int TYPEDEF=70;
    public static final int ULETTER=71;
    public static final int UNDER_SCORES=72;
    public static final int UNION=73;
    public static final int UNSIGNED=74;
    public static final int VOID=75;
    public static final int VOLATILE=76;
    public static final int WHILE=77;
    public static final int WS=78;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public C2PParserLexer() {} 
    public C2PParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public C2PParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "E:\\workspace\\CompilerAssignment\\src\\C2PParser.g"; }

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:6:7: ( '!=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:6:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:7:7: ( '&&' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:7:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:8:7: ( '==' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:8:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:9:7: ( '||' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:9:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "AUTO"
    public final void mAUTO() throws RecognitionException {
        try {
            int _type = AUTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:373:7: ( 'auto' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:373:9: 'auto'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:374:7: ( 'break' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:374:9: 'break'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:375:6: ( 'case' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:375:8: 'case'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:376:6: ( 'char' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:376:8: 'char'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:377:7: ( 'const' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:377:9: 'const'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:378:9: ( 'continue' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:378:11: 'continue'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:379:9: ( 'default' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:379:11: 'default'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:380:5: ( 'do' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:380:7: 'do'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:381:8: ( 'double' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:381:10: 'double'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:382:6: ( 'else' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:382:8: 'else'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:383:6: ( 'enum' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:383:8: 'enum'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:384:8: ( 'extern' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:384:10: 'extern'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:385:7: ( 'float' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:385:9: 'float'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:386:6: ( 'for' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:386:8: 'for'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:387:6: ( 'goto' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:387:8: 'goto'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:388:5: ( 'if' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:388:7: 'if'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:389:6: ( 'int' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:389:8: 'int'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:390:6: ( 'long' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:390:8: 'long'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:391:9: ( 'register' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:391:11: 'register'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:392:8: ( 'return' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:392:10: 'return'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:393:7: ( 'short' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:393:9: 'short'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:394:8: ( 'signed' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:394:10: 'signed'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:395:8: ( 'sizeof' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:395:10: 'sizeof'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:396:8: ( 'static' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:396:10: 'static'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:397:8: ( 'struct' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:397:10: 'struct'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:398:8: ( 'switch' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:398:10: 'switch'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:399:9: ( 'typedef' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:399:11: 'typedef'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:400:7: ( 'union' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:400:9: 'union'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:401:9: ( 'unsigned' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:401:11: 'unsigned'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:402:6: ( 'void' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:402:8: 'void'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:403:9: ( 'volatile' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:403:11: 'volatile'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:404:9: ( 'while' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:404:11: 'while'
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

    // $ANTLR start "PRINTF"
    public final void mPRINTF() throws RecognitionException {
        try {
            int _type = PRINTF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:405:8: ( 'printf' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:405:10: 'printf'
            {
            match("printf"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINTF"

    // $ANTLR start "SCANF"
    public final void mSCANF() throws RecognitionException {
        try {
            int _type = SCANF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:406:9: ( 'scanf' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:406:11: 'scanf'
            {
            match("scanf"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCANF"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:407:6: ( 'mod' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:407:9: 'mod'
            {
            match("mod"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:411:3: ( LETTER ( LETTER | DIGITS )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:411:5: LETTER ( LETTER | DIGITS )*
            {
            mLETTER(); 


            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:411:12: ( LETTER | DIGITS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:418:7: ( '0' .. '9' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "LLETTER"
    public final void mLLETTER() throws RecognitionException {
        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:422:7: ( 'a' .. 'z' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:426:7: ( '_' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:426:9: '_'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:430:3: ( 'A' .. 'Z' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:434:3: ( ULETTER | LLETTER | UNDER_SCORES )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:438:6: ( ( DIGITS )+ )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:438:10: ( DIGITS )+
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:438:10: ( DIGITS )+
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
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:442:3: ( ( DIGITS )+ '.' ( DIGITS )+ )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:442:7: ( DIGITS )+ '.' ( DIGITS )+
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:442:7: ( DIGITS )+
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
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:442:21: ( DIGITS )+
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
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:446:3: ( '\\'' ( LETTER | DIGITS | UNDER_SCORES ) '\\'' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:446:5: '\\'' ( LETTER | DIGITS | UNDER_SCORES ) '\\''
            {
            match('\''); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:450:6: ( '\"' (~ ( '\\n' | '\\r' | '\"' ) )* '\"' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:450:8: '\"' (~ ( '\\n' | '\\r' | '\"' ) )* '\"'
            {
            match('\"'); 

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:450:12: (~ ( '\\n' | '\\r' | '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop5;
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:455:5: ( ( ' ' | '\\t' | '\\u000C' | '\\r' | '\\n' ) )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:455:9: ( ' ' | '\\t' | '\\u000C' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel = HIDDEN;

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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:461:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:461:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:461:12: (~ ( '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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
            	    break loop6;
                }
            } while (true);


            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:461:26: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:461:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel = HIDDEN;

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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:466:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:466:7: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:466:12: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:466:39: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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

    // $ANTLR start "LINE_COMMAND"
    public final void mLINE_COMMAND() throws RecognitionException {
        try {
            int _type = LINE_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:470:7: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:470:9: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:470:13: (~ ( '\\n' | '\\r' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:
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
            	    break loop9;
                }
            } while (true);


            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:470:27: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:470:27: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMAND"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:475:12: ( '.' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:475:14: '.'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:476:12: ( '=>' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:476:14: '=>'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:477:12: ( ':' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:477:14: ':'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:478:12: ( ';' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:478:14: ';'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:479:12: ( ',' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:479:14: ','
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:480:12: ( '=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:480:14: '='
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:481:12: ( '[' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:481:14: '['
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:482:12: ( ']' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:482:14: ']'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:483:12: ( '..' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:483:14: '..'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:484:12: ( '(' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:484:14: '('
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:485:12: ( ')' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:485:14: ')'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:486:12: ( '/=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:486:14: '/='
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:487:12: ( '<' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:487:14: '<'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:488:12: ( '<=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:488:14: '<='
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:489:12: ( '>' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:489:14: '>'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:490:12: ( '>=' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:490:14: '>='
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:491:12: ( '+' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:491:14: '+'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:492:12: ( '-' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:492:14: '-'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:493:12: ( '*' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:493:14: '*'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:494:12: ( '/' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:494:14: '/'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:495:12: ( '{' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:495:14: '{'
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
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:496:12: ( '}' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:496:14: '}'
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

    // $ANTLR start "D_QUOTE"
    public final void mD_QUOTE() throws RecognitionException {
        try {
            int _type = D_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:497:12: ( '\"' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:497:14: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_QUOTE"

    // $ANTLR start "PERCENTAGE"
    public final void mPERCENTAGE() throws RecognitionException {
        try {
            int _type = PERCENTAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:498:12: ( '%' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:498:14: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENTAGE"

    // $ANTLR start "REF"
    public final void mREF() throws RecognitionException {
        try {
            int _type = REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:499:9: ( '&' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:499:11: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REF"

    // $ANTLR start "EXCLAM"
    public final void mEXCLAM() throws RecognitionException {
        try {
            int _type = EXCLAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:500:11: ( '!' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:500:13: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXCLAM"

    public void mTokens() throws RecognitionException {
        // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:8: ( T__79 | T__80 | T__81 | T__82 | AUTO | BREAK | CASE | CHAR | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTERN | FLOAT | FOR | GOTO | IF | INT | LONG | REGISTER | RETURN | SHORT | SIGNED | SIZEOF | STATIC | STRUCT | SWITCH | TYPEDEF | UNION | UNSIGNED | VOID | VOLATILE | WHILE | PRINTF | SCANF | MOD | IDENT | LIT_INT | LIT_FLOAT | LIT_CHAR | LIT_STRING | WS | IL_COMMENT | ML_COMMENT | LINE_COMMAND | DOT | BECOMES | COLON | SEMI | COMMA | EQUALS | LBRACKET | RBRACKET | DOTDOT | LPAREN | RPAREN | NOT_EQUALS | LT | LTE | GT | GTE | PLUS | MINUS | TIMES | DIV | L_C_BRACKET | R_C_BRACKET | D_QUOTE | PERCENTAGE | REF | EXCLAM )
        int alt11=74;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:10: T__79
                {
                mT__79(); 


                }
                break;
            case 2 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:16: T__80
                {
                mT__80(); 


                }
                break;
            case 3 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:22: T__81
                {
                mT__81(); 


                }
                break;
            case 4 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:28: T__82
                {
                mT__82(); 


                }
                break;
            case 5 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:34: AUTO
                {
                mAUTO(); 


                }
                break;
            case 6 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:39: BREAK
                {
                mBREAK(); 


                }
                break;
            case 7 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:45: CASE
                {
                mCASE(); 


                }
                break;
            case 8 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:50: CHAR
                {
                mCHAR(); 


                }
                break;
            case 9 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:55: CONST
                {
                mCONST(); 


                }
                break;
            case 10 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:61: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 11 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:70: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 12 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:78: DO
                {
                mDO(); 


                }
                break;
            case 13 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:81: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 14 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:88: ELSE
                {
                mELSE(); 


                }
                break;
            case 15 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:93: ENUM
                {
                mENUM(); 


                }
                break;
            case 16 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:98: EXTERN
                {
                mEXTERN(); 


                }
                break;
            case 17 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:105: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 18 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:111: FOR
                {
                mFOR(); 


                }
                break;
            case 19 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:115: GOTO
                {
                mGOTO(); 


                }
                break;
            case 20 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:120: IF
                {
                mIF(); 


                }
                break;
            case 21 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:123: INT
                {
                mINT(); 


                }
                break;
            case 22 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:127: LONG
                {
                mLONG(); 


                }
                break;
            case 23 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:132: REGISTER
                {
                mREGISTER(); 


                }
                break;
            case 24 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:141: RETURN
                {
                mRETURN(); 


                }
                break;
            case 25 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:148: SHORT
                {
                mSHORT(); 


                }
                break;
            case 26 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:154: SIGNED
                {
                mSIGNED(); 


                }
                break;
            case 27 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:161: SIZEOF
                {
                mSIZEOF(); 


                }
                break;
            case 28 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:168: STATIC
                {
                mSTATIC(); 


                }
                break;
            case 29 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:175: STRUCT
                {
                mSTRUCT(); 


                }
                break;
            case 30 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:182: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 31 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:189: TYPEDEF
                {
                mTYPEDEF(); 


                }
                break;
            case 32 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:197: UNION
                {
                mUNION(); 


                }
                break;
            case 33 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:203: UNSIGNED
                {
                mUNSIGNED(); 


                }
                break;
            case 34 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:212: VOID
                {
                mVOID(); 


                }
                break;
            case 35 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:217: VOLATILE
                {
                mVOLATILE(); 


                }
                break;
            case 36 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:226: WHILE
                {
                mWHILE(); 


                }
                break;
            case 37 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:232: PRINTF
                {
                mPRINTF(); 


                }
                break;
            case 38 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:239: SCANF
                {
                mSCANF(); 


                }
                break;
            case 39 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:245: MOD
                {
                mMOD(); 


                }
                break;
            case 40 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:249: IDENT
                {
                mIDENT(); 


                }
                break;
            case 41 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:255: LIT_INT
                {
                mLIT_INT(); 


                }
                break;
            case 42 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:263: LIT_FLOAT
                {
                mLIT_FLOAT(); 


                }
                break;
            case 43 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:273: LIT_CHAR
                {
                mLIT_CHAR(); 


                }
                break;
            case 44 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:282: LIT_STRING
                {
                mLIT_STRING(); 


                }
                break;
            case 45 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:293: WS
                {
                mWS(); 


                }
                break;
            case 46 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:296: IL_COMMENT
                {
                mIL_COMMENT(); 


                }
                break;
            case 47 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:307: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 48 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:318: LINE_COMMAND
                {
                mLINE_COMMAND(); 


                }
                break;
            case 49 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:331: DOT
                {
                mDOT(); 


                }
                break;
            case 50 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:335: BECOMES
                {
                mBECOMES(); 


                }
                break;
            case 51 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:343: COLON
                {
                mCOLON(); 


                }
                break;
            case 52 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:349: SEMI
                {
                mSEMI(); 


                }
                break;
            case 53 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:354: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 54 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:360: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 55 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:367: LBRACKET
                {
                mLBRACKET(); 


                }
                break;
            case 56 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:376: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 57 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:385: DOTDOT
                {
                mDOTDOT(); 


                }
                break;
            case 58 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:392: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 59 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:399: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 60 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:406: NOT_EQUALS
                {
                mNOT_EQUALS(); 


                }
                break;
            case 61 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:417: LT
                {
                mLT(); 


                }
                break;
            case 62 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:420: LTE
                {
                mLTE(); 


                }
                break;
            case 63 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:424: GT
                {
                mGT(); 


                }
                break;
            case 64 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:427: GTE
                {
                mGTE(); 


                }
                break;
            case 65 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:431: PLUS
                {
                mPLUS(); 


                }
                break;
            case 66 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:436: MINUS
                {
                mMINUS(); 


                }
                break;
            case 67 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:442: TIMES
                {
                mTIMES(); 


                }
                break;
            case 68 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:448: DIV
                {
                mDIV(); 


                }
                break;
            case 69 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:452: L_C_BRACKET
                {
                mL_C_BRACKET(); 


                }
                break;
            case 70 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:464: R_C_BRACKET
                {
                mR_C_BRACKET(); 


                }
                break;
            case 71 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:476: D_QUOTE
                {
                mD_QUOTE(); 


                }
                break;
            case 72 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:484: PERCENTAGE
                {
                mPERCENTAGE(); 


                }
                break;
            case 73 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:495: REF
                {
                mREF(); 


                }
                break;
            case 74 :
                // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:1:499: EXCLAM
                {
                mEXCLAM(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\56\1\60\1\63\1\uffff\21\26\1\uffff\1\120\1\uffff\1\123"+
        "\1\uffff\1\127\1\uffff\1\131\7\uffff\1\133\1\135\15\uffff\6\26\1"+
        "\145\6\26\1\154\16\26\16\uffff\7\26\1\uffff\4\26\1\u008c\1\26\1"+
        "\uffff\1\u008e\21\26\1\u00a0\1\u00a1\1\26\1\u00a3\1\u00a4\4\26\1"+
        "\u00a9\1\u00aa\2\26\1\uffff\1\u00ad\1\uffff\1\u00ae\14\26\1\u00bb"+
        "\3\26\2\uffff\1\u00bf\2\uffff\1\u00c0\3\26\2\uffff\1\26\1\u00c5"+
        "\2\uffff\2\26\1\u00c8\5\26\1\u00ce\1\26\1\u00d0\1\26\1\uffff\1\26"+
        "\1\u00d3\1\26\2\uffff\2\26\1\u00d7\1\u00d8\1\uffff\1\26\1\u00da"+
        "\1\uffff\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\1\uffff\1\26\1"+
        "\uffff\2\26\1\uffff\1\u00e3\1\26\1\u00e5\2\uffff\1\26\6\uffff\1"+
        "\u00e7\2\26\1\uffff\1\u00ea\1\uffff\1\u00eb\1\uffff\1\u00ec\1\u00ed"+
        "\4\uffff";
    static final String DFA11_eofS =
        "\u00ee\uffff";
    static final String DFA11_minS =
        "\1\11\1\75\1\46\1\75\1\uffff\1\165\1\162\1\141\1\145\2\154\1\157"+
        "\1\146\1\157\1\145\1\143\1\171\1\156\1\157\1\150\1\162\1\157\1\uffff"+
        "\1\56\1\uffff\1\0\1\uffff\1\52\1\uffff\1\56\7\uffff\2\75\15\uffff"+
        "\1\164\1\145\1\163\1\141\1\156\1\146\1\60\1\163\1\165\1\164\1\157"+
        "\1\162\1\164\1\60\1\164\1\156\1\147\1\157\1\147\1\141\1\151\1\141"+
        "\1\160\4\151\1\144\16\uffff\1\157\1\141\1\145\1\162\1\163\1\141"+
        "\1\142\1\uffff\1\145\1\155\1\145\1\141\1\60\1\157\1\uffff\1\60\1"+
        "\147\1\151\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\156\1\145"+
        "\1\157\1\151\1\144\1\141\1\154\1\156\2\60\1\153\2\60\1\164\1\151"+
        "\1\165\1\154\2\60\1\162\1\164\1\uffff\1\60\1\uffff\1\60\1\163\1"+
        "\162\1\164\1\145\1\157\1\151\2\143\1\146\1\144\1\156\1\147\1\60"+
        "\1\164\1\145\1\164\2\uffff\1\60\2\uffff\1\60\1\156\1\154\1\145\2"+
        "\uffff\1\156\1\60\2\uffff\1\164\1\156\1\60\1\144\1\146\1\143\1\164"+
        "\1\150\1\60\1\145\1\60\1\156\1\uffff\1\151\1\60\1\146\2\uffff\1"+
        "\165\1\164\2\60\1\uffff\1\145\1\60\1\uffff\5\60\1\uffff\1\146\1"+
        "\uffff\1\145\1\154\1\uffff\1\60\1\145\1\60\2\uffff\1\162\6\uffff"+
        "\1\60\1\144\1\145\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\4\uffff";
    static final String DFA11_maxS =
        "\1\175\1\75\1\46\1\76\1\uffff\1\165\1\162\2\157\1\170\2\157\1\156"+
        "\1\157\1\145\1\167\1\171\1\156\1\157\1\150\1\162\1\157\1\uffff\1"+
        "\71\1\uffff\1\uffff\1\uffff\1\75\1\uffff\1\56\7\uffff\2\75\15\uffff"+
        "\1\164\1\145\1\163\1\141\1\156\1\146\1\172\1\163\1\165\1\164\1\157"+
        "\1\162\1\164\1\172\1\164\1\156\1\164\1\157\1\172\1\162\1\151\1\141"+
        "\1\160\1\163\1\154\2\151\1\144\16\uffff\1\157\1\141\1\145\1\162"+
        "\1\164\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1\172\1\157\1"+
        "\uffff\1\172\1\147\1\151\1\165\1\162\1\156\1\145\1\164\1\165\1\164"+
        "\1\156\1\145\1\157\1\151\1\144\1\141\1\154\1\156\2\172\1\153\2\172"+
        "\1\164\1\151\1\165\1\154\2\172\1\162\1\164\1\uffff\1\172\1\uffff"+
        "\1\172\1\163\1\162\1\164\1\145\1\157\1\151\2\143\1\146\1\144\1\156"+
        "\1\147\1\172\1\164\1\145\1\164\2\uffff\1\172\2\uffff\1\172\1\156"+
        "\1\154\1\145\2\uffff\1\156\1\172\2\uffff\1\164\1\156\1\172\1\144"+
        "\1\146\1\143\1\164\1\150\1\172\1\145\1\172\1\156\1\uffff\1\151\1"+
        "\172\1\146\2\uffff\1\165\1\164\2\172\1\uffff\1\145\1\172\1\uffff"+
        "\5\172\1\uffff\1\146\1\uffff\1\145\1\154\1\uffff\1\172\1\145\1\172"+
        "\2\uffff\1\162\6\uffff\1\172\1\144\1\145\1\uffff\1\172\1\uffff\1"+
        "\172\1\uffff\2\172\4\uffff";
    static final String DFA11_acceptS =
        "\4\uffff\1\4\21\uffff\1\50\1\uffff\1\53\1\uffff\1\55\1\uffff\1\60"+
        "\1\uffff\1\63\1\64\1\65\1\67\1\70\1\72\1\73\2\uffff\1\101\1\102"+
        "\1\103\1\105\1\106\1\110\1\1\1\112\1\2\1\111\1\3\1\62\1\66\34\uffff"+
        "\1\51\1\52\1\54\1\107\1\56\1\57\1\74\1\104\1\71\1\61\1\76\1\75\1"+
        "\100\1\77\7\uffff\1\14\6\uffff\1\24\37\uffff\1\22\1\uffff\1\25\21"+
        "\uffff\1\47\1\5\1\uffff\1\7\1\10\4\uffff\1\16\1\17\2\uffff\1\23"+
        "\1\26\14\uffff\1\42\3\uffff\1\6\1\11\4\uffff\1\21\2\uffff\1\31\5"+
        "\uffff\1\46\1\uffff\1\40\2\uffff\1\44\3\uffff\1\15\1\20\1\uffff"+
        "\1\30\1\32\1\33\1\34\1\35\1\36\3\uffff\1\45\1\uffff\1\13\1\uffff"+
        "\1\37\2\uffff\1\12\1\27\1\41\1\43";
    static final String DFA11_specialS =
        "\31\uffff\1\0\u00d4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\32\1\uffff\2\32\22\uffff\1\32\1\1\1\31\1\34\1\uffff\1\54"+
            "\1\2\1\30\1\43\1\44\1\51\1\47\1\40\1\50\1\35\1\33\12\27\1\36"+
            "\1\37\1\45\1\3\1\46\2\uffff\32\26\1\41\1\uffff\1\42\1\uffff"+
            "\1\26\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\26\1\14\2\26"+
            "\1\15\1\25\2\26\1\24\1\26\1\16\1\17\1\20\1\21\1\22\1\23\3\26"+
            "\1\52\1\4\1\53",
            "\1\55",
            "\1\57",
            "\1\61\1\62",
            "",
            "\1\64",
            "\1\65",
            "\1\66\6\uffff\1\67\6\uffff\1\70",
            "\1\71\11\uffff\1\72",
            "\1\73\1\uffff\1\74\11\uffff\1\75",
            "\1\76\2\uffff\1\77",
            "\1\100",
            "\1\101\7\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\111\4\uffff\1\105\1\106\12\uffff\1\107\2\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\121\1\uffff\12\27",
            "",
            "\12\122\1\uffff\2\122\1\uffff\ufff2\122",
            "",
            "\1\125\4\uffff\1\124\15\uffff\1\126",
            "",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\134",
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
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\24\26\1\144\5\26",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\155",
            "\1\156",
            "\1\157\14\uffff\1\160",
            "\1\161",
            "\1\162\22\uffff\1\163",
            "\1\164\20\uffff\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171\11\uffff\1\172",
            "\1\173\2\uffff\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
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
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u008d",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
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
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00a2",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "\1\u00c4",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00cf",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d4",
            "",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00d9",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00e4",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\u00e6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
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
            return "1:1: Tokens : ( T__79 | T__80 | T__81 | T__82 | AUTO | BREAK | CASE | CHAR | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTERN | FLOAT | FOR | GOTO | IF | INT | LONG | REGISTER | RETURN | SHORT | SIGNED | SIZEOF | STATIC | STRUCT | SWITCH | TYPEDEF | UNION | UNSIGNED | VOID | VOLATILE | WHILE | PRINTF | SCANF | MOD | IDENT | LIT_INT | LIT_FLOAT | LIT_CHAR | LIT_STRING | WS | IL_COMMENT | ML_COMMENT | LINE_COMMAND | DOT | BECOMES | COLON | SEMI | COMMA | EQUALS | LBRACKET | RBRACKET | DOTDOT | LPAREN | RPAREN | NOT_EQUALS | LT | LTE | GT | GTE | PLUS | MINUS | TIMES | DIV | L_C_BRACKET | R_C_BRACKET | D_QUOTE | PERCENTAGE | REF | EXCLAM );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_25 = input.LA(1);

                        s = -1;
                        if ( ((LA11_25 >= '\u0000' && LA11_25 <= '\t')||(LA11_25 >= '\u000B' && LA11_25 <= '\f')||(LA11_25 >= '\u000E' && LA11_25 <= '\uFFFF')) ) {s = 82;}

                        else s = 83;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}