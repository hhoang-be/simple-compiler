// $ANTLR 3.4 E:\\workspace\\CompilerAssignment\\src\\C2PParser.g 2012-01-31 00:07:16
 
	package c2pproject.antlr;
	import java.util.Set; 
	import java.util.HashSet;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class C2PParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTO", "BECOMES", "BREAK", "CASE", "CHAR", "COLON", "COMMA", "CONST", "CONTINUE", "DEFAULT", "DIGITS", "DIV", "DO", "DOT", "DOTDOT", "DOUBLE", "D_QUOTE", "ELSE", "ENUM", "EQUALS", "EXCLAM", "EXTERN", "FLOAT", "FOR", "GOTO", "GT", "GTE", "IDENT", "IF", "IL_COMMENT", "INT", "LBRACKET", "LETTER", "LINE_COMMAND", "LIT_CHAR", "LIT_FLOAT", "LIT_INT", "LIT_STRING", "LLETTER", "LONG", "LPAREN", "LT", "LTE", "L_C_BRACKET", "MINUS", "ML_COMMENT", "MOD", "NOT_EQUALS", "PERCENTAGE", "PLUS", "PRINTF", "RBRACKET", "REF", "REGISTER", "RETURN", "RPAREN", "R_C_BRACKET", "SCANF", "SEMI", "SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "TIMES", "TYPEDEF", "ULETTER", "UNDER_SCORES", "UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "WS", "'!='", "'&&'", "'=='", "'||'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public C2PParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public C2PParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return C2PParserParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\workspace\\CompilerAssignment\\src\\C2PParser.g"; }

      
    	ASTNode tree_root = new compoundStatementNode();
    	ASTTree ast_tree = new ASTTree();
    	boolean isFuncCall = false;



    // $ANTLR start "programFile"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:20:1: programFile returns [ASTNode retval] : (source= sourceCode )* EOF ;
    public final ASTNode programFile() throws RecognitionException {
        ASTNode retval = null;


        ASTNode source =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:22:3: ( (source= sourceCode )* EOF )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:22:5: (source= sourceCode )* EOF
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:22:5: (source= sourceCode )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CHAR||LA1_0==CONST||LA1_0==FLOAT||LA1_0==INT||LA1_0==STRUCT||LA1_0==TYPEDEF||LA1_0==VOID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:22:6: source= sourceCode
            	    {
            	    pushFollow(FOLLOW_sourceCode_in_programFile59);
            	    source=sourceCode();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {ast_tree.mergeSibling(tree_root, source);}

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_programFile65); if (state.failed) return retval;

            if ( state.backtracking==0 ) {tree_root.parent = tree_root; retval = tree_root;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programFile"



    // $ANTLR start "sourceCode"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:27:1: sourceCode returns [ASTNode retval] options {k=1; } : ( ( typeName declarator '{' )=>func= functionDefinition |glob= globalDecl );
    public final ASTNode sourceCode() throws RecognitionException {
        ASTNode retval = null;


        ASTNode func =null;

        ASTNode glob =null;



          ASTNode commonRoot = new ASTNode();
          commonRoot.nodeType = "subroot";

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:33:3: ( ( typeName declarator '{' )=>func= functionDefinition |glob= globalDecl )
            int alt2=2;
            switch ( input.LA(1) ) {
            case VOID:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred1_C2PParser()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred1_C2PParser()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA2_3 = input.LA(2);

                if ( (synpred1_C2PParser()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA2_4 = input.LA(2);

                if ( (synpred1_C2PParser()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA2_5 = input.LA(2);

                if ( (synpred1_C2PParser()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case TYPEDEF:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:33:5: ( typeName declarator '{' )=>func= functionDefinition
                    {
                    pushFollow(FOLLOW_functionDefinition_in_sourceCode116);
                    func=functionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {ast_tree.adoptChild(commonRoot, func); retval = commonRoot;}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:34:7: glob= globalDecl
                    {
                    pushFollow(FOLLOW_globalDecl_in_sourceCode130);
                    glob=globalDecl();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = glob;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sourceCode"



    // $ANTLR start "globalDecl"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:38:1: globalDecl returns [ASTNode retval] : ( ( 'typedef' name= typeName varlist= identList SEMI ) | ( (modifier= CONST )? name= typeName initlist= initDeclarationList SEMI ) );
    public final ASTNode globalDecl() throws RecognitionException {
        ASTNode retval = null;


        Token modifier=null;
        TypeDescriptor name =null;

        ASTNode varlist =null;

        ASTNode initlist =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:39:3: ( ( 'typedef' name= typeName varlist= identList SEMI ) | ( (modifier= CONST )? name= typeName initlist= initDeclarationList SEMI ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TYPEDEF) ) {
                alt4=1;
            }
            else if ( (LA4_0==CHAR||LA4_0==CONST||LA4_0==FLOAT||LA4_0==INT||LA4_0==STRUCT||LA4_0==VOID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:39:5: ( 'typedef' name= typeName varlist= identList SEMI )
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:39:5: ( 'typedef' name= typeName varlist= identList SEMI )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:39:6: 'typedef' name= typeName varlist= identList SEMI
                    {
                    match(input,TYPEDEF,FOLLOW_TYPEDEF_in_globalDecl157); if (state.failed) return retval;

                    pushFollow(FOLLOW_typeName_in_globalDecl161);
                    name=typeName();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_identList_in_globalDecl167);
                    varlist=identList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,SEMI,FOLLOW_SEMI_in_globalDecl169); if (state.failed) return retval;

                    }


                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:40:4: ( (modifier= CONST )? name= typeName initlist= initDeclarationList SEMI )
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:40:4: ( (modifier= CONST )? name= typeName initlist= initDeclarationList SEMI )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:40:5: (modifier= CONST )? name= typeName initlist= initDeclarationList SEMI
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:40:5: (modifier= CONST )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==CONST) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:40:6: modifier= CONST
                            {
                            modifier=(Token)match(input,CONST,FOLLOW_CONST_in_globalDecl182); if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_typeName_in_globalDecl190);
                    name=typeName();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_initDeclarationList_in_globalDecl196);
                    initlist=initDeclarationList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,SEMI,FOLLOW_SEMI_in_globalDecl198); if (state.failed) return retval;

                    }


                    if ( state.backtracking==0 ) {retval = ((VarDeclNode)initlist).assignAttributes(modifier, name);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "globalDecl"



    // $ANTLR start "typeName"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:45:1: typeName returns [TypeDescriptor retval] : ( (name= VOID |name= CHAR |name= INT |name= FLOAT ) |structname= structSpecifier );
    public final TypeDescriptor typeName() throws RecognitionException {
        TypeDescriptor retval = null;


        Token name=null;
        ASTNode structname =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:46:3: ( (name= VOID |name= CHAR |name= INT |name= FLOAT ) |structname= structSpecifier )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CHAR||LA6_0==FLOAT||LA6_0==INT||LA6_0==VOID) ) {
                alt6=1;
            }
            else if ( (LA6_0==STRUCT) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:46:5: (name= VOID |name= CHAR |name= INT |name= FLOAT )
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:46:5: (name= VOID |name= CHAR |name= INT |name= FLOAT )
                    int alt5=4;
                    switch ( input.LA(1) ) {
                    case VOID:
                        {
                        alt5=1;
                        }
                        break;
                    case CHAR:
                        {
                        alt5=2;
                        }
                        break;
                    case INT:
                        {
                        alt5=3;
                        }
                        break;
                    case FLOAT:
                        {
                        alt5=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }

                    switch (alt5) {
                        case 1 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:46:6: name= VOID
                            {
                            name=(Token)match(input,VOID,FOLLOW_VOID_in_typeName232); if (state.failed) return retval;

                            if ( state.backtracking==0 ) {retval = new VoidTypeDescriptor();}

                            }
                            break;
                        case 2 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:47:5: name= CHAR
                            {
                            name=(Token)match(input,CHAR,FOLLOW_CHAR_in_typeName246); if (state.failed) return retval;

                            if ( state.backtracking==0 ) {retval = new CharTypeDescriptor();}

                            }
                            break;
                        case 3 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:48:4: name= INT
                            {
                            name=(Token)match(input,INT,FOLLOW_INT_in_typeName257); if (state.failed) return retval;

                            if ( state.backtracking==0 ) {retval = new IntTypeDescriptor();}

                            }
                            break;
                        case 4 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:49:4: name= FLOAT
                            {
                            name=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_typeName268); if (state.failed) return retval;

                            if ( state.backtracking==0 ) {retval = new FloatTypeDescriptor();}

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:50:5: structname= structSpecifier
                    {
                    pushFollow(FOLLOW_structSpecifier_in_typeName282);
                    structname=structSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeName"



    // $ANTLR start "structSpecifier"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:60:1: structSpecifier returns [ASTNode retval] options {k=3; } : ( 'struct' IDENT '{' structDeclList '}' | 'struct' IDENT );
    public final ASTNode structSpecifier() throws RecognitionException {
        ASTNode retval = null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:62:3: ( 'struct' IDENT '{' structDeclList '}' | 'struct' IDENT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==STRUCT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==IDENT) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==L_C_BRACKET) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==COMMA||LA7_2==IDENT||LA7_2==RPAREN) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:62:5: 'struct' IDENT '{' structDeclList '}'
                    {
                    match(input,STRUCT,FOLLOW_STRUCT_in_structSpecifier317); if (state.failed) return retval;

                    match(input,IDENT,FOLLOW_IDENT_in_structSpecifier319); if (state.failed) return retval;

                    match(input,L_C_BRACKET,FOLLOW_L_C_BRACKET_in_structSpecifier321); if (state.failed) return retval;

                    pushFollow(FOLLOW_structDeclList_in_structSpecifier323);
                    structDeclList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,R_C_BRACKET,FOLLOW_R_C_BRACKET_in_structSpecifier325); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:63:5: 'struct' IDENT
                    {
                    match(input,STRUCT,FOLLOW_STRUCT_in_structSpecifier332); if (state.failed) return retval;

                    match(input,IDENT,FOLLOW_IDENT_in_structSpecifier334); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structSpecifier"



    // $ANTLR start "structDeclList"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:67:1: structDeclList returns [ASTNode retval] : ( typeName identList SEMI )+ ;
    public final ASTNode structDeclList() throws RecognitionException {
        ASTNode retval = null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:68:3: ( ( typeName identList SEMI )+ )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:68:5: ( typeName identList SEMI )+
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:68:5: ( typeName identList SEMI )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CHAR||LA8_0==FLOAT||LA8_0==INT||LA8_0==STRUCT||LA8_0==VOID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:68:6: typeName identList SEMI
            	    {
            	    pushFollow(FOLLOW_typeName_in_structDeclList357);
            	    typeName();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    pushFollow(FOLLOW_identList_in_structDeclList359);
            	    identList();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    match(input,SEMI,FOLLOW_SEMI_in_structDeclList361); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structDeclList"



    // $ANTLR start "initDeclarationList"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:71:1: initDeclarationList returns [ASTNode retval] : initDecl_1= initDeclarator ( COMMA initDecl_2= initDeclarator )* ;
    public final ASTNode initDeclarationList() throws RecognitionException {
        ASTNode retval = null;


        ASTNode initDecl_1 =null;

        ASTNode initDecl_2 =null;



        	ASTNode commonRoot = new VarDeclNode();
        	ASTTree tree_adapter = new ASTTree();
        	commonRoot.nodeType = "VarDeclNode";

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:77:3: (initDecl_1= initDeclarator ( COMMA initDecl_2= initDeclarator )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:77:5: initDecl_1= initDeclarator ( COMMA initDecl_2= initDeclarator )*
            {
            pushFollow(FOLLOW_initDeclarator_in_initDeclarationList391);
            initDecl_1=initDeclarator();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {tree_adapter.adoptChild(commonRoot, initDecl_1);}

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:78:3: ( COMMA initDecl_2= initDeclarator )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:78:4: COMMA initDecl_2= initDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_initDeclarationList399); if (state.failed) return retval;

            	    pushFollow(FOLLOW_initDeclarator_in_initDeclarationList405);
            	    initDecl_2=initDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {tree_adapter.adoptChild(commonRoot, initDecl_2);}

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            if ( state.backtracking==0 ) {return commonRoot;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initDeclarationList"



    // $ANTLR start "initDeclarator"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:83:1: initDeclarator returns [ASTNode retval] : declName= declarator ( EQUALS exprValue= expression )? ;
    public final ASTNode initDeclarator() throws RecognitionException {
        ASTNode retval = null;


        ASTNode declName =null;

        ASTNode exprValue =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:84:3: (declName= declarator ( EQUALS exprValue= expression )? )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:84:5: declName= declarator ( EQUALS exprValue= expression )?
            {
            pushFollow(FOLLOW_declarator_in_initDeclarator444);
            declName=declarator();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:84:27: ( EQUALS exprValue= expression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EQUALS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:84:28: EQUALS exprValue= expression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_initDeclarator447); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_initDeclarator453);
                    exprValue=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {retval = (new VarDeclNode(declName, exprValue));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initDeclarator"



    // $ANTLR start "declarator"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:89:1: declarator returns [ASTNode retval] : declaratorName= IDENT (declref= declaratorReference )? ;
    public final ASTNode declarator() throws RecognitionException {
        ASTNode retval = null;


        Token declaratorName=null;
        ASTNode declref =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:90:3: (declaratorName= IDENT (declref= declaratorReference )? )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:90:5: declaratorName= IDENT (declref= declaratorReference )?
            {
            declaratorName=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarator485); if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:90:28: (declref= declaratorReference )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DOT||LA11_0==LBRACKET||LA11_0==LPAREN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:90:29: declref= declaratorReference
                    {
                    pushFollow(FOLLOW_declaratorReference_in_declarator492);
                    declref=declaratorReference();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { if(declref != null){
            		      declref.nameASTNode = declaratorName.getText();
            		      retval = declref;
            		  } else{
            		      retval = new declaratorNode(declaratorName);
            		  }
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarator"



    // $ANTLR start "declaratorReference"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:101:1: declaratorReference returns [ASTNode retval] : ( LBRACKET (expr= expression ) RBRACKET | LPAREN (parameterlist= formalParameterList ) RPAREN | DOT varName= IDENT | LPAREN expr= expression ( COMMA expr= expression )* RPAREN | LPAREN RPAREN );
    public final ASTNode declaratorReference() throws RecognitionException {
        ASTNode retval = null;


        Token varName=null;
        ASTNode expr =null;

        typeItem parameterlist =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:102:3: ( LBRACKET (expr= expression ) RBRACKET | LPAREN (parameterlist= formalParameterList ) RPAREN | DOT varName= IDENT | LPAREN expr= expression ( COMMA expr= expression )* RPAREN | LPAREN RPAREN )
            int alt13=5;
            switch ( input.LA(1) ) {
            case LBRACKET:
                {
                alt13=1;
                }
                break;
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case RPAREN:
                    {
                    alt13=5;
                    }
                    break;
                case CHAR:
                case FLOAT:
                case INT:
                case STRUCT:
                case VOID:
                    {
                    alt13=2;
                    }
                    break;
                case EXCLAM:
                case IDENT:
                case LIT_CHAR:
                case LIT_FLOAT:
                case LIT_INT:
                case LPAREN:
                case MINUS:
                case PLUS:
                    {
                    alt13=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }

                }
                break;
            case DOT:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:103:4: LBRACKET (expr= expression ) RBRACKET
                    {
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_declaratorReference526); if (state.failed) return retval;

                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:103:13: (expr= expression )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:103:14: expr= expression
                    {
                    pushFollow(FOLLOW_expression_in_declaratorReference533);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }


                    match(input,RBRACKET,FOLLOW_RBRACKET_in_declaratorReference536); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new declaratorNode(expr);}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:105:5: LPAREN (parameterlist= formalParameterList ) RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_declaratorReference548); if (state.failed) return retval;

                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:105:12: (parameterlist= formalParameterList )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:105:13: parameterlist= formalParameterList
                    {
                    pushFollow(FOLLOW_formalParameterList_in_declaratorReference555);
                    parameterlist=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_declaratorReference558); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new funcDefNode(parameterlist);}

                    }
                    break;
                case 3 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:107:5: DOT varName= IDENT
                    {
                    match(input,DOT,FOLLOW_DOT_in_declaratorReference570); if (state.failed) return retval;

                    varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaratorReference576); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:109:5: LPAREN expr= expression ( COMMA expr= expression )* RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_declaratorReference590); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_declaratorReference596);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:109:30: ( COMMA expr= expression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:109:31: COMMA expr= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_declaratorReference599); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_declaratorReference605);
                    	    expr=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match(input,RPAREN,FOLLOW_RPAREN_in_declaratorReference609); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new callNode(null,expr);}

                    }
                    break;
                case 5 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:110:5: LPAREN RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_declaratorReference617); if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_declaratorReference619); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {if(isFuncCall){retval = new callNode();} else {retval = new funcDefNode();}}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaratorReference"



    // $ANTLR start "expressionList"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:115:1: expressionList returns [ASTNode retval] : expr= expression ( COMMA expr= expression )* ;
    public final ASTNode expressionList() throws RecognitionException {
        ASTNode retval = null;


        ASTNode expr =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:116:5: (expr= expression ( COMMA expr= expression )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:116:7: expr= expression ( COMMA expr= expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList648);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:116:25: ( COMMA expr= expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:116:26: COMMA expr= expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionList651); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expressionList657);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"



    // $ANTLR start "initializer"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:120:1: initializer returns [ASTNode retval] : EQUALS expression ;
    public final ASTNode initializer() throws RecognitionException {
        ASTNode retval = null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:121:3: ( EQUALS expression )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:121:5: EQUALS expression
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_initializer682); if (state.failed) return retval;

            pushFollow(FOLLOW_expression_in_initializer684);
            expression();

            state._fsp--;
            if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initializer"



    // $ANTLR start "declaratorList"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:124:1: declaratorList : declarator ( COMMA declarator )* ;
    public final void declaratorList() throws RecognitionException {
        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:125:3: ( declarator ( COMMA declarator )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:126:3: declarator ( COMMA declarator )*
            {
            pushFollow(FOLLOW_declarator_in_declaratorList700);
            declarator();

            state._fsp--;
            if (state.failed) return ;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:126:14: ( COMMA declarator )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:126:15: COMMA declarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_declaratorList703); if (state.failed) return ;

            	    pushFollow(FOLLOW_declarator_in_declaratorList705);
            	    declarator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaratorList"



    // $ANTLR start "identList"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:129:1: identList returns [ASTNode retval] : identName= IDENT ( COMMA identName_1= IDENT )* ;
    public final ASTNode identList() throws RecognitionException {
        ASTNode retval = null;


        Token identName=null;
        Token identName_1=null;


            exprsNode temp = null, head = null;

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:133:3: (identName= IDENT ( COMMA identName_1= IDENT )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:133:5: identName= IDENT ( COMMA identName_1= IDENT )*
            {
            identName=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList735); if (state.failed) return retval;

            if ( state.backtracking==0 ) {head = new exprsNode(identName); temp = head;}

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:134:4: ( COMMA identName_1= IDENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:134:5: COMMA identName_1= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identList744); if (state.failed) return retval;

            	    identName_1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList750); if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {temp.more = new exprsNode(identName_1); temp = temp.more;}

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            if ( state.backtracking==0 ) {return head;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identList"



    // $ANTLR start "actualParameterList"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:138:1: actualParameterList returns [ASTNode retval] : expr_1= expression ( COMMA expr_2= expression )* ;
    public final ASTNode actualParameterList() throws RecognitionException {
        ASTNode retval = null;


        ASTNode expr_1 =null;

        ASTNode expr_2 =null;



        	exprsNode temp = null, head = null;

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:142:3: (expr_1= expression ( COMMA expr_2= expression )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:142:5: expr_1= expression ( COMMA expr_2= expression )*
            {
            pushFollow(FOLLOW_expression_in_actualParameterList787);
            expr_1=expression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {head = new exprsNode(expr_1); temp = head;}

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:143:5: ( COMMA expr_2= expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:143:6: COMMA expr_2= expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_actualParameterList797); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_actualParameterList803);
            	    expr_2=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {temp.more = new exprsNode(expr_2); temp = temp.more;}

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            if ( state.backtracking==0 ) {return head;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "actualParameterList"



    // $ANTLR start "formalParameterList"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:147:1: formalParameterList returns [typeItem retval] : paraList= parameterDeclaration ( COMMA paraList= parameterDeclaration )* ;
    public final typeItem formalParameterList() throws RecognitionException {
        typeItem retval = null;


        typeItem paraList =null;



            typeItem temp = null, head = null;

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:151:3: (paraList= parameterDeclaration ( COMMA paraList= parameterDeclaration )* )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:151:5: paraList= parameterDeclaration ( COMMA paraList= parameterDeclaration )*
            {
            pushFollow(FOLLOW_parameterDeclaration_in_formalParameterList839);
            paraList=parameterDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {head = paraList; temp = head;}

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:152:3: ( COMMA paraList= parameterDeclaration )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:152:4: COMMA paraList= parameterDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList848); if (state.failed) return retval;

            	    pushFollow(FOLLOW_parameterDeclaration_in_formalParameterList854);
            	    paraList=parameterDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {temp.next = paraList; temp = paraList;}

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            if ( state.backtracking==0 ) {return head;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"



    // $ANTLR start "parameterDeclaration"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:157:1: parameterDeclaration returns [typeItem retval] : name= typeName (varName= IDENT )? ;
    public final typeItem parameterDeclaration() throws RecognitionException {
        typeItem retval = null;


        Token varName=null;
        TypeDescriptor name =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:158:3: (name= typeName (varName= IDENT )? )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:158:5: name= typeName (varName= IDENT )?
            {
            pushFollow(FOLLOW_typeName_in_parameterDeclaration888);
            name=typeName();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:158:21: (varName= IDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:158:22: varName= IDENT
                    {
                    varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameterDeclaration895); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {retval = (new typeItem(name, varName));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameterDeclaration"



    // $ANTLR start "leftValue"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:167:1: leftValue returns [ASTNode retval] : (name= IDENT |name= IDENT LBRACKET expr= expression RBRACKET );
    public final ASTNode leftValue() throws RecognitionException {
        ASTNode retval = null;


        Token name=null;
        ASTNode expr =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:168:3: (name= IDENT |name= IDENT LBRACKET expr= expression RBRACKET )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==LBRACKET) ) {
                    alt20=2;
                }
                else if ( (LA20_1==EQUALS) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:168:5: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_leftValue930); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new declaratorNode(name);}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:169:7: name= IDENT LBRACKET expr= expression RBRACKET
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_leftValue945); if (state.failed) return retval;

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_leftValue947); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_leftValue953);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_leftValue955); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new declaratorNode(expr); retval.nameASTNode = name.getText();}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "leftValue"



    // $ANTLR start "assignmentStat"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:173:1: assignmentStat returns [ASTNode retval] : decl= leftValue EQUALS (expr= expression SEMI ) ;
    public final ASTNode assignmentStat() throws RecognitionException {
        ASTNode retval = null;


        ASTNode decl =null;

        ASTNode expr =null;



            isFuncCall = true;

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:177:3: (decl= leftValue EQUALS (expr= expression SEMI ) )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:177:5: decl= leftValue EQUALS (expr= expression SEMI )
            {
            pushFollow(FOLLOW_leftValue_in_assignmentStat987);
            decl=leftValue();

            state._fsp--;
            if (state.failed) return retval;

            match(input,EQUALS,FOLLOW_EQUALS_in_assignmentStat989); if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:177:29: (expr= expression SEMI )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:177:30: expr= expression SEMI
            {
            pushFollow(FOLLOW_expression_in_assignmentStat996);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,SEMI,FOLLOW_SEMI_in_assignmentStat998); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval = (new AssignmentNode(decl, expr));}

            }


            if ( state.backtracking==0 ) {isFuncCall = false;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentStat"



    // $ANTLR start "expression"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:183:1: expression returns [ASTNode retval] : logic_1= logicExpression ( (operator= ( '&&' | '||' ) ) logic_2= logicExpression )? ;
    public final ASTNode expression() throws RecognitionException {
        ASTNode retval = null;


        Token operator=null;
        ASTNode logic_1 =null;

        ASTNode logic_2 =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:184:5: (logic_1= logicExpression ( (operator= ( '&&' | '||' ) ) logic_2= logicExpression )? )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:184:7: logic_1= logicExpression ( (operator= ( '&&' | '||' ) ) logic_2= logicExpression )?
            {
            pushFollow(FOLLOW_logicExpression_in_expression1035);
            logic_1=logicExpression();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:184:33: ( (operator= ( '&&' | '||' ) ) logic_2= logicExpression )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==80||LA21_0==82) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:184:34: (operator= ( '&&' | '||' ) ) logic_2= logicExpression
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:184:34: (operator= ( '&&' | '||' ) )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:184:35: operator= ( '&&' | '||' )
                    {
                    operator=(Token)input.LT(1);

                    if ( input.LA(1)==80||input.LA(1)==82 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    pushFollow(FOLLOW_logicExpression_in_expression1054);
                    logic_2=logicExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {if(operator == null){
                       retval = logic_1;
                    } else{
                       retval = new BinaryExprNode(operator, logic_1, logic_2);
                    }
                   }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"



    // $ANTLR start "logicExpression"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:194:1: logicExpression returns [ASTNode retval] : equality_1= equalityExpression ( (operator= ( '==' | '!=' ) ) equality_2= equalityExpression )? ;
    public final ASTNode logicExpression() throws RecognitionException {
        ASTNode retval = null;


        Token operator=null;
        ASTNode equality_1 =null;

        ASTNode equality_2 =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:195:3: (equality_1= equalityExpression ( (operator= ( '==' | '!=' ) ) equality_2= equalityExpression )? )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:195:5: equality_1= equalityExpression ( (operator= ( '==' | '!=' ) ) equality_2= equalityExpression )?
            {
            pushFollow(FOLLOW_equalityExpression_in_logicExpression1092);
            equality_1=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:195:37: ( (operator= ( '==' | '!=' ) ) equality_2= equalityExpression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==79||LA22_0==81) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:195:38: (operator= ( '==' | '!=' ) ) equality_2= equalityExpression
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:195:38: (operator= ( '==' | '!=' ) )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:195:39: operator= ( '==' | '!=' )
                    {
                    operator=(Token)input.LT(1);

                    if ( input.LA(1)==79||input.LA(1)==81 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    pushFollow(FOLLOW_equalityExpression_in_logicExpression1113);
                    equality_2=equalityExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {if(operator == null){
                       retval = equality_1;
                    } else{
                       retval = new BinaryExprNode(operator, equality_1, equality_2);
                    }
                   }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logicExpression"



    // $ANTLR start "equalityExpression"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:205:1: equalityExpression returns [ASTNode retval] : adding_1= addingExpression ( (operator= ( NOT_EQUALS | GT | GTE | LT | LTE ) ) adding_2= addingExpression )? ;
    public final ASTNode equalityExpression() throws RecognitionException {
        ASTNode retval = null;


        Token operator=null;
        ASTNode adding_1 =null;

        ASTNode adding_2 =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:206:5: (adding_1= addingExpression ( (operator= ( NOT_EQUALS | GT | GTE | LT | LTE ) ) adding_2= addingExpression )? )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:206:7: adding_1= addingExpression ( (operator= ( NOT_EQUALS | GT | GTE | LT | LTE ) ) adding_2= addingExpression )?
            {
            pushFollow(FOLLOW_addingExpression_in_equalityExpression1152);
            adding_1=addingExpression();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:206:34: ( (operator= ( NOT_EQUALS | GT | GTE | LT | LTE ) ) adding_2= addingExpression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0 >= GT && LA23_0 <= GTE)||(LA23_0 >= LT && LA23_0 <= LTE)||LA23_0==NOT_EQUALS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:206:35: (operator= ( NOT_EQUALS | GT | GTE | LT | LTE ) ) adding_2= addingExpression
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:206:35: (operator= ( NOT_EQUALS | GT | GTE | LT | LTE ) )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:206:36: operator= ( NOT_EQUALS | GT | GTE | LT | LTE )
                    {
                    operator=(Token)input.LT(1);

                    if ( (input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||input.LA(1)==NOT_EQUALS ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    pushFollow(FOLLOW_addingExpression_in_equalityExpression1176);
                    adding_2=addingExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {if(operator == null){
                       retval = adding_1;
                    } else{
                       retval = new BinaryExprNode(operator, adding_1, adding_2);
                    }
                   }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "addingExpression"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:216:1: addingExpression returns [ASTNode retval] : multiply_1= multiplyingExpression ( (operator= ( PLUS | MINUS ) ) multiply_2= multiplyingExpression )? ;
    public final ASTNode addingExpression() throws RecognitionException {
        ASTNode retval = null;


        Token operator=null;
        ASTNode multiply_1 =null;

        ASTNode multiply_2 =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:217:5: (multiply_1= multiplyingExpression ( (operator= ( PLUS | MINUS ) ) multiply_2= multiplyingExpression )? )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:217:7: multiply_1= multiplyingExpression ( (operator= ( PLUS | MINUS ) ) multiply_2= multiplyingExpression )?
            {
            pushFollow(FOLLOW_multiplyingExpression_in_addingExpression1216);
            multiply_1=multiplyingExpression();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:217:42: ( (operator= ( PLUS | MINUS ) ) multiply_2= multiplyingExpression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==MINUS||LA24_0==PLUS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:217:43: (operator= ( PLUS | MINUS ) ) multiply_2= multiplyingExpression
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:217:43: (operator= ( PLUS | MINUS ) )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:217:44: operator= ( PLUS | MINUS )
                    {
                    operator=(Token)input.LT(1);

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    pushFollow(FOLLOW_multiplyingExpression_in_addingExpression1235);
                    multiply_2=multiplyingExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {if(operator == null){
                       retval = multiply_1;
                    } else{
                       retval = new BinaryExprNode(operator, multiply_1, multiply_2);
                    }
                   }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addingExpression"



    // $ANTLR start "multiplyingExpression"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:227:1: multiplyingExpression returns [ASTNode retval] : sign_1= signExpression ( (operator= ( TIMES | DIV | MOD ) ) sign_2= signExpression )? ;
    public final ASTNode multiplyingExpression() throws RecognitionException {
        ASTNode retval = null;


        Token operator=null;
        ASTNode sign_1 =null;

        ASTNode sign_2 =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:228:5: (sign_1= signExpression ( (operator= ( TIMES | DIV | MOD ) ) sign_2= signExpression )? )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:228:7: sign_1= signExpression ( (operator= ( TIMES | DIV | MOD ) ) sign_2= signExpression )?
            {
            pushFollow(FOLLOW_signExpression_in_multiplyingExpression1272);
            sign_1=signExpression();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:228:31: ( (operator= ( TIMES | DIV | MOD ) ) sign_2= signExpression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==DIV||LA25_0==MOD||LA25_0==TIMES) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:228:32: (operator= ( TIMES | DIV | MOD ) ) sign_2= signExpression
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:228:32: (operator= ( TIMES | DIV | MOD ) )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:228:33: operator= ( TIMES | DIV | MOD )
                    {
                    operator=(Token)input.LT(1);

                    if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==TIMES ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    pushFollow(FOLLOW_signExpression_in_multiplyingExpression1293);
                    sign_2=signExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {if(operator == null){
            		       retval = sign_1;
            		    } else{
            		       retval = new BinaryExprNode(operator, sign_1, sign_2);
            		    }
            		   }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplyingExpression"



    // $ANTLR start "signExpression"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:238:1: signExpression returns [ASTNode retval] : (operator= ( PLUS | MINUS ) )? bool= booleanNegationExpression ;
    public final ASTNode signExpression() throws RecognitionException {
        ASTNode retval = null;


        Token operator=null;
        ASTNode bool =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:239:5: ( (operator= ( PLUS | MINUS ) )? bool= booleanNegationExpression )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:239:7: (operator= ( PLUS | MINUS ) )? bool= booleanNegationExpression
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:239:7: (operator= ( PLUS | MINUS ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==MINUS||LA26_0==PLUS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:239:8: operator= ( PLUS | MINUS )
                    {
                    operator=(Token)input.LT(1);

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_booleanNegationExpression_in_signExpression1344);
            bool=booleanNegationExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {if(operator != null){
              		    retval = (new UnaryExprNode(operator, bool));
              		  } else{
              		    retval = bool;
              		  }
              		  }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signExpression"



    // $ANTLR start "booleanNegationExpression"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:249:1: booleanNegationExpression returns [ASTNode retval] : ( (operator= '!' ) )? primitive= primitiveElement ;
    public final ASTNode booleanNegationExpression() throws RecognitionException {
        ASTNode retval = null;


        Token operator=null;
        ASTNode primitive =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:250:5: ( ( (operator= '!' ) )? primitive= primitiveElement )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:250:7: ( (operator= '!' ) )? primitive= primitiveElement
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:250:7: ( (operator= '!' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EXCLAM) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:250:8: (operator= '!' )
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:250:8: (operator= '!' )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:250:9: operator= '!'
                    {
                    operator=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_booleanNegationExpression1381); if (state.failed) return retval;

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_primitiveElement_in_booleanNegationExpression1390);
            primitive=primitiveElement();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {if(operator != null){
              		      retval = (new UnaryExprNode(operator, primitive));
              		    } else {
              		      retval = primitive; 
              		    }
              		    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanNegationExpression"



    // $ANTLR start "primitiveElement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:260:1: primitiveElement returns [ASTNode retval] : (constexpr= constExpression |decl= declarator | LPAREN expr= expression RPAREN );
    public final ASTNode primitiveElement() throws RecognitionException {
        ASTNode retval = null;


        ASTNode constexpr =null;

        ASTNode decl =null;

        ASTNode expr =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:261:5: (constexpr= constExpression |decl= declarator | LPAREN expr= expression RPAREN )
            int alt28=3;
            switch ( input.LA(1) ) {
            case LIT_CHAR:
            case LIT_FLOAT:
            case LIT_INT:
                {
                alt28=1;
                }
                break;
            case IDENT:
                {
                alt28=2;
                }
                break;
            case LPAREN:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:261:7: constexpr= constExpression
                    {
                    pushFollow(FOLLOW_constExpression_in_primitiveElement1429);
                    constexpr=constExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = constexpr;}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:262:7: decl= declarator
                    {
                    pushFollow(FOLLOW_declarator_in_primitiveElement1443);
                    decl=declarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = decl;}

                    }
                    break;
                case 3 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:263:8: LPAREN expr= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primitiveElement1454); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_primitiveElement1460);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primitiveElement1462); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = expr;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primitiveElement"



    // $ANTLR start "expressionStatement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:267:1: expressionStatement returns [ASTNode retval] : ( SEMI |exprstat= expression SEMI );
    public final ASTNode expressionStatement() throws RecognitionException {
        ASTNode retval = null;


        ASTNode exprstat =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:268:3: ( SEMI |exprstat= expression SEMI )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==SEMI) ) {
                alt29=1;
            }
            else if ( (LA29_0==EXCLAM||LA29_0==IDENT||(LA29_0 >= LIT_CHAR && LA29_0 <= LIT_INT)||LA29_0==LPAREN||LA29_0==MINUS||LA29_0==PLUS) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:268:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_expressionStatement1487); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:269:5: exprstat= expression SEMI
                    {
                    pushFollow(FOLLOW_expression_in_expressionStatement1500);
                    exprstat=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,SEMI,FOLLOW_SEMI_in_expressionStatement1502); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = exprstat;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionStatement"



    // $ANTLR start "constExpression"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:273:1: constExpression returns [ASTNode retval] : (value= LIT_INT |value= LIT_FLOAT |value= LIT_CHAR );
    public final ASTNode constExpression() throws RecognitionException {
        ASTNode retval = null;


        Token value=null;

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:274:3: (value= LIT_INT |value= LIT_FLOAT |value= LIT_CHAR )
            int alt30=3;
            switch ( input.LA(1) ) {
            case LIT_INT:
                {
                alt30=1;
                }
                break;
            case LIT_FLOAT:
                {
                alt30=2;
                }
                break;
            case LIT_CHAR:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:274:5: value= LIT_INT
                    {
                    value=(Token)match(input,LIT_INT,FOLLOW_LIT_INT_in_constExpression1530); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new IntLiteralNode(value);}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:275:4: value= LIT_FLOAT
                    {
                    value=(Token)match(input,LIT_FLOAT,FOLLOW_LIT_FLOAT_in_constExpression1541); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new FloatLiteralNode(value);}

                    }
                    break;
                case 3 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:276:4: value= LIT_CHAR
                    {
                    value=(Token)match(input,LIT_CHAR,FOLLOW_LIT_CHAR_in_constExpression1552); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new CharLiteralNode(value);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constExpression"



    // $ANTLR start "functionDefinition"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:283:1: functionDefinition returns [ASTNode retval] : name= typeName decl= declarator compound= compoundStatement ;
    public final ASTNode functionDefinition() throws RecognitionException {
        ASTNode retval = null;


        TypeDescriptor name =null;

        ASTNode decl =null;

        ASTNode compound =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:284:3: (name= typeName decl= declarator compound= compoundStatement )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:284:5: name= typeName decl= declarator compound= compoundStatement
            {
            pushFollow(FOLLOW_typeName_in_functionDefinition1585);
            name=typeName();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_declarator_in_functionDefinition1591);
            decl=declarator();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_compoundStatement_in_functionDefinition1597);
            compound=compoundStatement();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {((funcDefNode)decl).setReturnType(name);
            		   ((funcDefNode)decl).isFuncDefinition = true;
            		   ast_tree.adoptChild(decl, compound);retval = decl;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"



    // $ANTLR start "statement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:291:1: statement returns [ASTNode retval] : (assignstat= assignmentStat |ifstat= ifStatement |loopstat= loopStatement |jumpstat= jumpStatement |iostat= ioStatement |compstat= compoundStatement |funcName= IDENT LPAREN (paraList= actualParameterList )? RPAREN SEMI );
    public final ASTNode statement() throws RecognitionException {
        ASTNode retval = null;


        Token funcName=null;
        ASTNode assignstat =null;

        ASTNode ifstat =null;

        ASTNode loopstat =null;

        ASTNode jumpstat =null;

        ASTNode iostat =null;

        ASTNode compstat =null;

        ASTNode paraList =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:292:3: (assignstat= assignmentStat |ifstat= ifStatement |loopstat= loopStatement |jumpstat= jumpStatement |iostat= ioStatement |compstat= compoundStatement |funcName= IDENT LPAREN (paraList= actualParameterList )? RPAREN SEMI )
            int alt32=7;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case EQUALS:
                case LBRACKET:
                    {
                    alt32=1;
                    }
                    break;
                case COLON:
                    {
                    alt32=4;
                    }
                    break;
                case LPAREN:
                    {
                    alt32=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }

                }
                break;
            case IF:
                {
                alt32=2;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt32=3;
                }
                break;
            case BREAK:
            case CONTINUE:
            case GOTO:
            case RETURN:
                {
                alt32=4;
                }
                break;
            case PRINTF:
            case SCANF:
                {
                alt32=5;
                }
                break;
            case L_C_BRACKET:
                {
                alt32=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:292:5: assignstat= assignmentStat
                    {
                    pushFollow(FOLLOW_assignmentStat_in_statement1629);
                    assignstat=assignmentStat();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = assignstat;}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:293:5: ifstat= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1641);
                    ifstat=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = ifstat;}

                    }
                    break;
                case 3 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:294:5: loopstat= loopStatement
                    {
                    pushFollow(FOLLOW_loopStatement_in_statement1653);
                    loopstat=loopStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = loopstat;}

                    }
                    break;
                case 4 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:295:5: jumpstat= jumpStatement
                    {
                    pushFollow(FOLLOW_jumpStatement_in_statement1665);
                    jumpstat=jumpStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = jumpstat;}

                    }
                    break;
                case 5 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:296:5: iostat= ioStatement
                    {
                    pushFollow(FOLLOW_ioStatement_in_statement1679);
                    iostat=ioStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = iostat;}

                    }
                    break;
                case 6 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:297:5: compstat= compoundStatement
                    {
                    pushFollow(FOLLOW_compoundStatement_in_statement1691);
                    compstat=compoundStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = compstat;}

                    }
                    break;
                case 7 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:298:5: funcName= IDENT LPAREN (paraList= actualParameterList )? RPAREN SEMI
                    {
                    funcName=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement1703); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_statement1705); if (state.failed) return retval;

                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:298:29: (paraList= actualParameterList )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==EXCLAM||LA31_0==IDENT||(LA31_0 >= LIT_CHAR && LA31_0 <= LIT_INT)||LA31_0==LPAREN||LA31_0==MINUS||LA31_0==PLUS) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:298:30: paraList= actualParameterList
                            {
                            pushFollow(FOLLOW_actualParameterList_in_statement1712);
                            paraList=actualParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_statement1716); if (state.failed) return retval;

                    match(input,SEMI,FOLLOW_SEMI_in_statement1718); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new callNode(funcName, paraList);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"



    // $ANTLR start "compoundStatement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:303:1: compoundStatement returns [ASTNode retval] : '{' (decl= globalDecl )* (statlist= statementList )? '}' ;
    public final ASTNode compoundStatement() throws RecognitionException {
        ASTNode retval = null;


        ASTNode decl =null;

        ASTNode statlist =null;



            compoundStatementNode commonRoot = new compoundStatementNode(); 

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:307:3: ( '{' (decl= globalDecl )* (statlist= statementList )? '}' )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:307:5: '{' (decl= globalDecl )* (statlist= statementList )? '}'
            {
            match(input,L_C_BRACKET,FOLLOW_L_C_BRACKET_in_compoundStatement1746); if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:307:9: (decl= globalDecl )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==CHAR||LA33_0==CONST||LA33_0==FLOAT||LA33_0==INT||LA33_0==STRUCT||LA33_0==TYPEDEF||LA33_0==VOID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:307:10: decl= globalDecl
            	    {
            	    pushFollow(FOLLOW_globalDecl_in_compoundStatement1753);
            	    decl=globalDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {ast_tree.mergeSibling(commonRoot, decl);}

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:308:9: (statlist= statementList )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==BREAK||LA34_0==CONTINUE||LA34_0==DO||(LA34_0 >= FOR && LA34_0 <= GOTO)||(LA34_0 >= IDENT && LA34_0 <= IF)||LA34_0==L_C_BRACKET||LA34_0==PRINTF||LA34_0==RETURN||LA34_0==SCANF||LA34_0==WHILE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:308:10: statlist= statementList
                    {
                    pushFollow(FOLLOW_statementList_in_compoundStatement1773);
                    statlist=statementList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {ast_tree.mergeSibling(commonRoot, statlist);}

                    }
                    break;

            }


            match(input,R_C_BRACKET,FOLLOW_R_C_BRACKET_in_compoundStatement1779); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval = commonRoot;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compoundStatement"



    // $ANTLR start "statementList"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:313:1: statementList returns [ASTNode retval] : (stat= statement )+ ;
    public final ASTNode statementList() throws RecognitionException {
        ASTNode retval = null;


        ASTNode stat =null;



            ASTNode commonRoot = new ASTNode(); 
            commonRoot.nodeType = "statementList";

        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:318:3: ( (stat= statement )+ )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:318:5: (stat= statement )+
            {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:318:5: (stat= statement )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==BREAK||LA35_0==CONTINUE||LA35_0==DO||(LA35_0 >= FOR && LA35_0 <= GOTO)||(LA35_0 >= IDENT && LA35_0 <= IF)||LA35_0==L_C_BRACKET||LA35_0==PRINTF||LA35_0==RETURN||LA35_0==SCANF||LA35_0==WHILE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:318:6: stat= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList1813);
            	    stat=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {ast_tree.adoptChild(commonRoot, stat);}

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            if ( state.backtracking==0 ) {retval = commonRoot;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statementList"



    // $ANTLR start "ifStatement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:324:1: ifStatement returns [ASTNode retval] : IF LPAREN expr= expression RPAREN thenstat= statement ( ( ( ELSE )=> ELSE elsestat= statement ) | () ) ;
    public final ASTNode ifStatement() throws RecognitionException {
        ASTNode retval = null;


        ASTNode expr =null;

        ASTNode thenstat =null;

        ASTNode elsestat =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:325:3: ( IF LPAREN expr= expression RPAREN thenstat= statement ( ( ( ELSE )=> ELSE elsestat= statement ) | () ) )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:325:5: IF LPAREN expr= expression RPAREN thenstat= statement ( ( ( ELSE )=> ELSE elsestat= statement ) | () )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1850); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement1852); if (state.failed) return retval;

            pushFollow(FOLLOW_expression_in_ifStatement1858);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement1860); if (state.failed) return retval;

            pushFollow(FOLLOW_statement_in_ifStatement1866);
            thenstat=statement();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:326:3: ( ( ( ELSE )=> ELSE elsestat= statement ) | () )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ELSE) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred2_C2PParser()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA36_0==BREAK||LA36_0==CONTINUE||LA36_0==DO||(LA36_0 >= FOR && LA36_0 <= GOTO)||(LA36_0 >= IDENT && LA36_0 <= IF)||LA36_0==L_C_BRACKET||LA36_0==PRINTF||LA36_0==RETURN||(LA36_0 >= R_C_BRACKET && LA36_0 <= SCANF)||LA36_0==WHILE) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:326:4: ( ( ELSE )=> ELSE elsestat= statement )
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:326:4: ( ( ELSE )=> ELSE elsestat= statement )
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:326:5: ( ELSE )=> ELSE elsestat= statement
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement1879); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_ifStatement1885);
                    elsestat=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }


                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:327:4: ()
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:327:4: ()
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:327:5: 
                    {
                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {retval = (new ifNode(expr, thenstat, elsestat));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifStatement"



    // $ANTLR start "loopStatement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:332:1: loopStatement returns [ASTNode retval] : ( WHILE LPAREN expr1= expression RPAREN stat1= statement | DO stat2= statement WHILE LPAREN expr2= expression RPAREN | FOR LPAREN exprstat1= assignmentStat exprstat2= expression SEMI expr3= assignmentStat RPAREN '{' (stat3= statement )? '}' );
    public final ASTNode loopStatement() throws RecognitionException {
        ASTNode retval = null;


        ASTNode expr1 =null;

        ASTNode stat1 =null;

        ASTNode stat2 =null;

        ASTNode expr2 =null;

        ASTNode exprstat1 =null;

        ASTNode exprstat2 =null;

        ASTNode expr3 =null;

        ASTNode stat3 =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:333:3: ( WHILE LPAREN expr1= expression RPAREN stat1= statement | DO stat2= statement WHILE LPAREN expr2= expression RPAREN | FOR LPAREN exprstat1= assignmentStat exprstat2= expression SEMI expr3= assignmentStat RPAREN '{' (stat3= statement )? '}' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt38=1;
                }
                break;
            case DO:
                {
                alt38=2;
                }
                break;
            case FOR:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:333:5: WHILE LPAREN expr1= expression RPAREN stat1= statement
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_loopStatement1919); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_loopStatement1921); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_loopStatement1927);
                    expr1=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_loopStatement1929); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_loopStatement1935);
                    stat1=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = (new whileNode(expr1, stat1));}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:335:5: DO stat2= statement WHILE LPAREN expr2= expression RPAREN
                    {
                    match(input,DO,FOLLOW_DO_in_loopStatement1945); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_loopStatement1951);
                    stat2=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,WHILE,FOLLOW_WHILE_in_loopStatement1953); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_loopStatement1955); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_loopStatement1961);
                    expr2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_loopStatement1963); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = (new doWhileNode(expr2, stat2));}

                    }
                    break;
                case 3 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:339:5: FOR LPAREN exprstat1= assignmentStat exprstat2= expression SEMI expr3= assignmentStat RPAREN '{' (stat3= statement )? '}'
                    {
                    match(input,FOR,FOLLOW_FOR_in_loopStatement1979); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_loopStatement1981); if (state.failed) return retval;

                    pushFollow(FOLLOW_assignmentStat_in_loopStatement1987);
                    exprstat1=assignmentStat();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_loopStatement1993);
                    exprstat2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,SEMI,FOLLOW_SEMI_in_loopStatement1995); if (state.failed) return retval;

                    pushFollow(FOLLOW_assignmentStat_in_loopStatement2001);
                    expr3=assignmentStat();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_loopStatement2003); if (state.failed) return retval;

                    match(input,L_C_BRACKET,FOLLOW_L_C_BRACKET_in_loopStatement2005); if (state.failed) return retval;

                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:339:111: (stat3= statement )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==BREAK||LA37_0==CONTINUE||LA37_0==DO||(LA37_0 >= FOR && LA37_0 <= GOTO)||(LA37_0 >= IDENT && LA37_0 <= IF)||LA37_0==L_C_BRACKET||LA37_0==PRINTF||LA37_0==RETURN||LA37_0==SCANF||LA37_0==WHILE) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:339:111: stat3= statement
                            {
                            pushFollow(FOLLOW_statement_in_loopStatement2011);
                            stat3=statement();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,R_C_BRACKET,FOLLOW_R_C_BRACKET_in_loopStatement2014); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = (new forNode(exprstat1, exprstat2, expr3, stat3));}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "loopStatement"



    // $ANTLR start "jumpStatement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:344:1: jumpStatement returns [ASTNode retval] : (stat1= 'goto' label= IDENT SEMI | ( (stat2= 'continue' ) | (stat2= 'break' ) ) SEMI |label= IDENT ':' | 'return' (expr= expression )? SEMI );
    public final ASTNode jumpStatement() throws RecognitionException {
        ASTNode retval = null;


        Token stat1=null;
        Token label=null;
        Token stat2=null;
        ASTNode expr =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:345:3: (stat1= 'goto' label= IDENT SEMI | ( (stat2= 'continue' ) | (stat2= 'break' ) ) SEMI |label= IDENT ':' | 'return' (expr= expression )? SEMI )
            int alt41=4;
            switch ( input.LA(1) ) {
            case GOTO:
                {
                alt41=1;
                }
                break;
            case BREAK:
            case CONTINUE:
                {
                alt41=2;
                }
                break;
            case IDENT:
                {
                alt41=3;
                }
                break;
            case RETURN:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:345:5: stat1= 'goto' label= IDENT SEMI
                    {
                    stat1=(Token)match(input,GOTO,FOLLOW_GOTO_in_jumpStatement2046); if (state.failed) return retval;

                    label=(Token)match(input,IDENT,FOLLOW_IDENT_in_jumpStatement2052); if (state.failed) return retval;

                    match(input,SEMI,FOLLOW_SEMI_in_jumpStatement2054); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new labeledStmtNode(stat1, label);}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:346:6: ( (stat2= 'continue' ) | (stat2= 'break' ) ) SEMI
                    {
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:346:6: ( (stat2= 'continue' ) | (stat2= 'break' ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==CONTINUE) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==BREAK) ) {
                        alt39=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;

                    }
                    switch (alt39) {
                        case 1 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:346:7: (stat2= 'continue' )
                            {
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:346:7: (stat2= 'continue' )
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:346:8: stat2= 'continue'
                            {
                            stat2=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jumpStatement2069); if (state.failed) return retval;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:346:30: (stat2= 'break' )
                            {
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:346:30: (stat2= 'break' )
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:346:31: stat2= 'break'
                            {
                            stat2=(Token)match(input,BREAK,FOLLOW_BREAK_in_jumpStatement2079); if (state.failed) return retval;

                            }


                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_jumpStatement2083); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new labeledStmtNode(stat2, null);}

                    }
                    break;
                case 3 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:347:5: label= IDENT ':'
                    {
                    label=(Token)match(input,IDENT,FOLLOW_IDENT_in_jumpStatement2095); if (state.failed) return retval;

                    match(input,COLON,FOLLOW_COLON_in_jumpStatement2097); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new labeledStmtNode(label, null);}

                    }
                    break;
                case 4 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:348:5: 'return' (expr= expression )? SEMI
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_jumpStatement2105); if (state.failed) return retval;

                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:348:14: (expr= expression )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==EXCLAM||LA40_0==IDENT||(LA40_0 >= LIT_CHAR && LA40_0 <= LIT_INT)||LA40_0==LPAREN||LA40_0==MINUS||LA40_0==PLUS) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:348:15: expr= expression
                            {
                            pushFollow(FOLLOW_expression_in_jumpStatement2112);
                            expr=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_jumpStatement2116); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = new returnNode(expr);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jumpStatement"



    // $ANTLR start "ioStatement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:352:1: ioStatement returns [ASTNode retval] : (scanfstat= scanfStatement |printstat= printfStatement );
    public final ASTNode ioStatement() throws RecognitionException {
        ASTNode retval = null;


        ASTNode scanfstat =null;

        ASTNode printstat =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:353:3: (scanfstat= scanfStatement |printstat= printfStatement )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==SCANF) ) {
                alt42=1;
            }
            else if ( (LA42_0==PRINTF) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:353:5: scanfstat= scanfStatement
                    {
                    pushFollow(FOLLOW_scanfStatement_in_ioStatement2148);
                    scanfstat=scanfStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = scanfstat;}

                    }
                    break;
                case 2 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:354:5: printstat= printfStatement
                    {
                    pushFollow(FOLLOW_printfStatement_in_ioStatement2160);
                    printstat=printfStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval = printstat;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ioStatement"



    // $ANTLR start "scanfStatement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:358:1: scanfStatement returns [ASTNode retval] : SCANF LPAREN formatString= LIT_STRING ( COMMA '&' decl= declarator ) RPAREN SEMI ;
    public final ASTNode scanfStatement() throws RecognitionException {
        ASTNode retval = null;


        Token formatString=null;
        ASTNode decl =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:359:3: ( SCANF LPAREN formatString= LIT_STRING ( COMMA '&' decl= declarator ) RPAREN SEMI )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:359:5: SCANF LPAREN formatString= LIT_STRING ( COMMA '&' decl= declarator ) RPAREN SEMI
            {
            match(input,SCANF,FOLLOW_SCANF_in_scanfStatement2184); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_scanfStatement2186); if (state.failed) return retval;

            formatString=(Token)match(input,LIT_STRING,FOLLOW_LIT_STRING_in_scanfStatement2192); if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:359:44: ( COMMA '&' decl= declarator )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:359:45: COMMA '&' decl= declarator
            {
            match(input,COMMA,FOLLOW_COMMA_in_scanfStatement2195); if (state.failed) return retval;

            match(input,REF,FOLLOW_REF_in_scanfStatement2197); if (state.failed) return retval;

            pushFollow(FOLLOW_declarator_in_scanfStatement2203);
            decl=declarator();

            state._fsp--;
            if (state.failed) return retval;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_scanfStatement2206); if (state.failed) return retval;

            match(input,SEMI,FOLLOW_SEMI_in_scanfStatement2208); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval = new scanfStatementNode(formatString, decl);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scanfStatement"



    // $ANTLR start "printfStatement"
    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:363:1: printfStatement returns [ASTNode retval] : PRINTF LPAREN formatString= LIT_STRING ( COMMA expr= expression )? RPAREN SEMI ;
    public final ASTNode printfStatement() throws RecognitionException {
        ASTNode retval = null;


        Token formatString=null;
        ASTNode expr =null;


        try {
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:364:3: ( PRINTF LPAREN formatString= LIT_STRING ( COMMA expr= expression )? RPAREN SEMI )
            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:364:5: PRINTF LPAREN formatString= LIT_STRING ( COMMA expr= expression )? RPAREN SEMI
            {
            match(input,PRINTF,FOLLOW_PRINTF_in_printfStatement2234); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_printfStatement2236); if (state.failed) return retval;

            formatString=(Token)match(input,LIT_STRING,FOLLOW_LIT_STRING_in_printfStatement2242); if (state.failed) return retval;

            // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:364:45: ( COMMA expr= expression )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==COMMA) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:364:46: COMMA expr= expression
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_printfStatement2245); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_printfStatement2251);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_printfStatement2256); if (state.failed) return retval;

            match(input,SEMI,FOLLOW_SEMI_in_printfStatement2258); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval = new printfStatementNode(formatString, expr);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printfStatement"

    // $ANTLR start synpred1_C2PParser
    public final void synpred1_C2PParser_fragment() throws RecognitionException {
        // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:33:5: ( typeName declarator '{' )
        // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:33:6: typeName declarator '{'
        {
        pushFollow(FOLLOW_typeName_in_synpred1_C2PParser104);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_declarator_in_synpred1_C2PParser106);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        match(input,L_C_BRACKET,FOLLOW_L_C_BRACKET_in_synpred1_C2PParser108); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_C2PParser

    // $ANTLR start synpred2_C2PParser
    public final void synpred2_C2PParser_fragment() throws RecognitionException {
        // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:326:5: ( ELSE )
        // E:\\workspace\\CompilerAssignment\\src\\C2PParser.g:326:6: ELSE
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_C2PParser1874); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_C2PParser

    // Delegated rules

    public final boolean synpred2_C2PParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_C2PParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_C2PParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_C2PParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_sourceCode_in_programFile59 = new BitSet(new long[]{0x0000000404000900L,0x0000000000000848L});
    public static final BitSet FOLLOW_EOF_in_programFile65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_sourceCode116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalDecl_in_sourceCode130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_globalDecl157 = new BitSet(new long[]{0x0000000404000100L,0x0000000000000808L});
    public static final BitSet FOLLOW_typeName_in_globalDecl161 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identList_in_globalDecl167 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalDecl169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_globalDecl182 = new BitSet(new long[]{0x0000000404000100L,0x0000000000000808L});
    public static final BitSet FOLLOW_typeName_in_globalDecl190 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_initDeclarationList_in_globalDecl196 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_globalDecl198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_typeName232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_typeName246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_typeName257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_typeName268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structSpecifier_in_typeName282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_structSpecifier317 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_structSpecifier319 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_L_C_BRACKET_in_structSpecifier321 = new BitSet(new long[]{0x0000000404000100L,0x0000000000000808L});
    public static final BitSet FOLLOW_structDeclList_in_structSpecifier323 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_R_C_BRACKET_in_structSpecifier325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_structSpecifier332 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_structSpecifier334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_structDeclList357 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identList_in_structDeclList359 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_structDeclList361 = new BitSet(new long[]{0x0000000404000102L,0x0000000000000808L});
    public static final BitSet FOLLOW_initDeclarator_in_initDeclarationList391 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_initDeclarationList399 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_initDeclarator_in_initDeclarationList405 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_declarator_in_initDeclarator444 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_EQUALS_in_initDeclarator447 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_initDeclarator453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declarator485 = new BitSet(new long[]{0x0000100800020002L});
    public static final BitSet FOLLOW_declaratorReference_in_declarator492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_declaratorReference526 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_declaratorReference533 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_declaratorReference536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_declaratorReference548 = new BitSet(new long[]{0x0000000404000100L,0x0000000000000808L});
    public static final BitSet FOLLOW_formalParameterList_in_declaratorReference555 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_declaratorReference558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_declaratorReference570 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_declaratorReference576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_declaratorReference590 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_declaratorReference596 = new BitSet(new long[]{0x0800000000000400L});
    public static final BitSet FOLLOW_COMMA_in_declaratorReference599 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_declaratorReference605 = new BitSet(new long[]{0x0800000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_declaratorReference609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_declaratorReference617 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_declaratorReference619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList648 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_expressionList651 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_expressionList657 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_EQUALS_in_initializer682 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_initializer684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_declaratorList700 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_declaratorList703 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_declarator_in_declaratorList705 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_identList735 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identList744 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_identList750 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_actualParameterList787 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_actualParameterList797 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_actualParameterList803 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_parameterDeclaration_in_formalParameterList839 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList848 = new BitSet(new long[]{0x0000000404000100L,0x0000000000000808L});
    public static final BitSet FOLLOW_parameterDeclaration_in_formalParameterList854 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_typeName_in_parameterDeclaration888 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IDENT_in_parameterDeclaration895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_leftValue930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_leftValue945 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LBRACKET_in_leftValue947 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_leftValue953 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_leftValue955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftValue_in_assignmentStat987 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQUALS_in_assignmentStat989 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_assignmentStat996 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_assignmentStat998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicExpression_in_expression1035 = new BitSet(new long[]{0x0000000000000002L,0x0000000000050000L});
    public static final BitSet FOLLOW_set_in_expression1043 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_logicExpression_in_expression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicExpression1092 = new BitSet(new long[]{0x0000000000000002L,0x0000000000028000L});
    public static final BitSet FOLLOW_set_in_logicExpression1100 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_equalityExpression_in_logicExpression1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addingExpression_in_equalityExpression1152 = new BitSet(new long[]{0x0008600060000002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1159 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_addingExpression_in_equalityExpression1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyingExpression_in_addingExpression1216 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_set_in_addingExpression1224 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_multiplyingExpression_in_addingExpression1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signExpression_in_multiplyingExpression1272 = new BitSet(new long[]{0x0004000000008002L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_multiplyingExpression1280 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_signExpression_in_multiplyingExpression1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signExpression1332 = new BitSet(new long[]{0x000011C081000000L});
    public static final BitSet FOLLOW_booleanNegationExpression_in_signExpression1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_booleanNegationExpression1381 = new BitSet(new long[]{0x000011C080000000L});
    public static final BitSet FOLLOW_primitiveElement_in_booleanNegationExpression1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constExpression_in_primitiveElement1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_primitiveElement1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primitiveElement1454 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_primitiveElement1460 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primitiveElement1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_expressionStatement1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement1500 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_expressionStatement1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIT_INT_in_constExpression1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIT_FLOAT_in_constExpression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIT_CHAR_in_constExpression1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_functionDefinition1585 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_declarator_in_functionDefinition1591 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_compoundStatement_in_functionDefinition1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStat_in_statement1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_statement1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpStatement_in_statement1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ioStatement_in_statement1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_statement1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_statement1703 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1705 = new BitSet(new long[]{0x082111C081000000L});
    public static final BitSet FOLLOW_actualParameterList_in_statement1712 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1716 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_statement1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_C_BRACKET_in_compoundStatement1746 = new BitSet(new long[]{0x344080059C011940L,0x0000000000002848L});
    public static final BitSet FOLLOW_globalDecl_in_compoundStatement1753 = new BitSet(new long[]{0x344080059C011940L,0x0000000000002848L});
    public static final BitSet FOLLOW_statementList_in_compoundStatement1773 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_R_C_BRACKET_in_compoundStatement1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList1813 = new BitSet(new long[]{0x2440800198011042L,0x0000000000002000L});
    public static final BitSet FOLLOW_IF_in_ifStatement1850 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement1852 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1858 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement1860 = new BitSet(new long[]{0x2440800198011040L,0x0000000000002000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1866 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1879 = new BitSet(new long[]{0x2440800198011040L,0x0000000000002000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_loopStatement1919 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_loopStatement1921 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_loopStatement1927 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_loopStatement1929 = new BitSet(new long[]{0x2440800198011040L,0x0000000000002000L});
    public static final BitSet FOLLOW_statement_in_loopStatement1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_loopStatement1945 = new BitSet(new long[]{0x2440800198011040L,0x0000000000002000L});
    public static final BitSet FOLLOW_statement_in_loopStatement1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WHILE_in_loopStatement1953 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_loopStatement1955 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_loopStatement1961 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_loopStatement1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_loopStatement1979 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_loopStatement1981 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_assignmentStat_in_loopStatement1987 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_loopStatement1993 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_loopStatement1995 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_assignmentStat_in_loopStatement2001 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_loopStatement2003 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_L_C_BRACKET_in_loopStatement2005 = new BitSet(new long[]{0x3440800198011040L,0x0000000000002000L});
    public static final BitSet FOLLOW_statement_in_loopStatement2011 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_R_C_BRACKET_in_loopStatement2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jumpStatement2046 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_jumpStatement2052 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_jumpStatement2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jumpStatement2069 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_BREAK_in_jumpStatement2079 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_jumpStatement2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_jumpStatement2095 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_jumpStatement2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jumpStatement2105 = new BitSet(new long[]{0x402111C081000000L});
    public static final BitSet FOLLOW_expression_in_jumpStatement2112 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_jumpStatement2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scanfStatement_in_ioStatement2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printfStatement_in_ioStatement2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCANF_in_scanfStatement2184 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_scanfStatement2186 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LIT_STRING_in_scanfStatement2192 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_scanfStatement2195 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_REF_in_scanfStatement2197 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_declarator_in_scanfStatement2203 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_scanfStatement2206 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_scanfStatement2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTF_in_printfStatement2234 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_printfStatement2236 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LIT_STRING_in_printfStatement2242 = new BitSet(new long[]{0x0800000000000400L});
    public static final BitSet FOLLOW_COMMA_in_printfStatement2245 = new BitSet(new long[]{0x002111C081000000L});
    public static final BitSet FOLLOW_expression_in_printfStatement2251 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_printfStatement2256 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_printfStatement2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred1_C2PParser104 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_declarator_in_synpred1_C2PParser106 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_L_C_BRACKET_in_synpred1_C2PParser108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_C2PParser1874 = new BitSet(new long[]{0x0000000000000002L});

}