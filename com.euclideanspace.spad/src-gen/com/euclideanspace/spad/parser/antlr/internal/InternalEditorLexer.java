package com.euclideanspace.spad.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEditorLexer extends Lexer {
    public static final int RULE_TILDE=44;
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=46;
    public static final int RULE_PERCENT=32;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int RULE_COLONDASH=52;
    public static final int T__94=94;
    public static final int RULE_LARROW=57;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_BACKSLASHSLASH=36;
    public static final int T__90=90;
    public static final int RULE_LPAREN=14;
    public static final int RULE_GT=19;
    public static final int RULE_BACKSLASH=54;
    public static final int RULE_CARAT=28;
    public static final int RULE_AMPERSAND=26;
    public static final int RULE_RBRACKET=48;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_GE=21;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_ATAT=53;
    public static final int T__80=80;
    public static final int RULE_RBRACE=13;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_EXIT=35;
    public static final int RULE_HASH=45;
    public static final int RULE_COMMA=15;
    public static final int RULE_ELLIPSIS=59;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_TIMES=24;
    public static final int RULE_MACROVALUE=29;
    public static final int RULE_MINUS=23;
    public static final int RULE_STRING=34;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_BAR=27;
    public static final int RULE_CANGLE=51;
    public static final int RULE_SLASH=25;
    public static final int RULE_RPAREN=16;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int RULE_AT=5;
    public static final int T__77=77;
    public static final int RULE_GIVES=58;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_COERCE=41;
    public static final int RULE_SEMICOLON=11;
    public static final int RULE_OANGLE=50;
    public static final int RULE_LBRACKET=47;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_LT=18;
    public static final int RULE_DOT=42;
    public static final int RULE_LE=20;
    public static final int RULE_SEG=39;
    public static final int RULE_INT=33;
    public static final int RULE_SLASHBACKSLASH=37;
    public static final int RULE_LBRACE=10;
    public static final int RULE_POWER=40;
    public static final int RULE_NOTEQUAL=38;
    public static final int RULE_DOLAR=43;
    public static final int RULE_MDEF=12;
    public static final int RULE_BECOMES=30;
    public static final int RULE_PLUS=22;
    public static final int RULE_NL=9;
    public static final int RULE_EQUAL=17;
    public static final int RULE_SL_COMMENT=49;
    public static final int RULE_BACKSLASHBACKSLASH=56;
    public static final int RULE_COLON=7;
    public static final int RULE_SLASHSLASH=55;
    public static final int RULE_ARROW=31;
    public static final int RULE_DEF=8;
    public static final int RULE_WS=4;

    // delegates
    // delegators

    public InternalEditorLexer() {;} 
    public InternalEditorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEditorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g"; }

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11:7: ( ')abbrev' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11:9: ')abbrev'
            {
            match(")abbrev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:12:7: ( 'category' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:12:9: 'category'
            {
            match("category"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:13:7: ( 'Category' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:13:9: 'Category'
            {
            match("Category"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:14:7: ( 'package' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:14:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:15:7: ( 'domain' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:15:9: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:16:7: ( 'where' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:16:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:17:7: ( 'with' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:17:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:18:7: ( 'add' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:18:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:19:7: ( 'Type' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:19:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:20:7: ( 'Record' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:20:9: 'Record'
            {
            match("Record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:21:7: ( 'Union' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:21:9: 'Union'
            {
            match("Union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:22:7: ( 'Join' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:22:9: 'Join'
            {
            match("Join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:23:7: ( 'Lisp' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:23:9: 'Lisp'
            {
            match("Lisp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:24:7: ( 'for' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:24:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:25:7: ( 'in' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:25:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:26:7: ( 'repeat' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:26:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:27:7: ( 'while' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:27:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:28:7: ( 'do' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:28:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:29:7: ( 'iterate' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:29:9: 'iterate'
            {
            match("iterate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:30:7: ( 'break' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:30:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:31:7: ( 'return' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:31:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:32:7: ( 'if' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:32:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:33:7: ( 'then' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:33:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:34:7: ( 'else' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:34:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:35:7: ( 'or' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:35:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:36:7: ( 'and' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:36:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:37:7: ( 'not' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:37:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:38:7: ( 'has' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:38:9: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:39:7: ( 'case' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:39:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:40:7: ( '^=' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:40:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:41:7: ( 'is' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:41:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:42:7: ( 'isnt' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:42:9: 'isnt'
            {
            match("isnt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:43:7: ( 'exquo' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:43:9: 'exquo'
            {
            match("exquo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:44:7: ( 'quo' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:44:9: 'quo'
            {
            match("quo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:45:7: ( 'mod' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:45:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:46:7: ( 'rem' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:46:9: 'rem'
            {
            match("rem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:47:7: ( 'pretend' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:47:9: 'pretend'
            {
            match("pretend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:48:7: ( '\\'' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:48:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:49:7: ( 'true' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:49:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:50:7: ( 'false' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:50:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' . ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )* ( '!' )? ( '?' )? )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )* ( '!' )? ( '?' )?
            {
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . )
            int alt1=3;
            switch ( input.LA(1) ) {
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
                alt1=1;
                }
                break;
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
                {
                alt1=2;
                }
                break;
            case '_':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:12: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:21: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:30: '_' .
                    {
                    match('_'); 
                    matchAny(); 

                    }
                    break;

            }

            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
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
                    alt2=1;
                    }
                    break;
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
                    {
                    alt2=2;
                    }
                    break;
                case '_':
                    {
                    alt2=3;
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
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:38: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:47: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:56: '_' .
            	    {
            	    match('_'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:62: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:73: ( '!' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='!') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:73: '!'
                    {
                    match('!'); 

                    }
                    break;

            }

            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:78: ( '?' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='?') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7545:78: '?'
                    {
                    match('?'); 

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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7547:9: ( ( ' ' | '\\t' )+ )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7547:11: ( ' ' | '\\t' )+
            {
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7547:11: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7549:9: ( ( '\\r' | '\\n' ) )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7549:11: ( '\\r' | '\\n' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7551:17: ( ( '--' | '++' ) (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7551:19: ( '--' | '++' ) (~ ( ( '\\n' | '\\r' ) ) )*
            {
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7551:19: ( '--' | '++' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            else if ( (LA6_0=='+') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7551:20: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7551:25: '++'
                    {
                    match("++"); 


                    }
                    break;

            }

            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7551:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7551:31: ~ ( ( '\\n' | '\\r' ) )
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_MACROVALUE"
    public final void mRULE_MACROVALUE() throws RecognitionException {
        try {
            int _type = RULE_MACROVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7553:17: ( '===>' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7553:19: '===>' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("===>"); 

            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7553:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7553:26: ~ ( ( '\\n' | '\\r' ) )
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MACROVALUE"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7555:13: ( '\"' (~ ( '\"' ) )* '\"' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7555:15: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7555:19: (~ ( '\"' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7555:19: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7557:10: ( ( '0' .. '9' )+ )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7557:12: ( '0' .. '9' )+
            {
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7557:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7557:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7559:13: ( '(' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7559:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7561:13: ( ')' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7561:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7563:13: ( '{' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7563:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7565:13: ( '}' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7565:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7567:15: ( '[' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7567:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7569:15: ( ']' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7569:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_OANGLE"
    public final void mRULE_OANGLE() throws RecognitionException {
        try {
            int _type = RULE_OANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7571:13: ( '<<' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7571:15: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OANGLE"

    // $ANTLR start "RULE_CANGLE"
    public final void mRULE_CANGLE() throws RecognitionException {
        try {
            int _type = RULE_CANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7573:13: ( '>>' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7573:15: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CANGLE"

    // $ANTLR start "RULE_MDEF"
    public final void mRULE_MDEF() throws RecognitionException {
        try {
            int _type = RULE_MDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7575:11: ( '==>' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7575:13: '==>'
            {
            match("==>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MDEF"

    // $ANTLR start "RULE_BAR"
    public final void mRULE_BAR() throws RecognitionException {
        try {
            int _type = RULE_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7577:10: ( '|' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7577:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BAR"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7579:10: ( '.' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7579:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COERCE"
    public final void mRULE_COERCE() throws RecognitionException {
        try {
            int _type = RULE_COERCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7581:13: ( '::' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7581:15: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COERCE"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7583:12: ( ':' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7583:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_COLONDASH"
    public final void mRULE_COLONDASH() throws RecognitionException {
        try {
            int _type = RULE_COLONDASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7585:16: ( ':-' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7585:18: ':-'
            {
            match(":-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLONDASH"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7587:9: ( '@' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7587:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_ATAT"
    public final void mRULE_ATAT() throws RecognitionException {
        try {
            int _type = RULE_ATAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7589:11: ( '@@' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7589:13: '@@'
            {
            match("@@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATAT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7591:12: ( ',' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7591:14: ','
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

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7593:16: ( ';' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7593:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_POWER"
    public final void mRULE_POWER() throws RecognitionException {
        try {
            int _type = RULE_POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7595:12: ( '**' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7595:14: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POWER"

    // $ANTLR start "RULE_TIMES"
    public final void mRULE_TIMES() throws RecognitionException {
        try {
            int _type = RULE_TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7597:12: ( '*' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7597:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIMES"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7599:11: ( '+' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7599:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7601:12: ( '-' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7601:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7603:9: ( '<' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7603:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7605:9: ( '>' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7605:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_LE"
    public final void mRULE_LE() throws RecognitionException {
        try {
            int _type = RULE_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7607:9: ( '<=' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7607:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LE"

    // $ANTLR start "RULE_GE"
    public final void mRULE_GE() throws RecognitionException {
        try {
            int _type = RULE_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7609:9: ( '>=' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7609:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GE"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7611:12: ( '=' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7611:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NOTEQUAL"
    public final void mRULE_NOTEQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7613:15: ( '~=' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7613:17: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTEQUAL"

    // $ANTLR start "RULE_TILDE"
    public final void mRULE_TILDE() throws RecognitionException {
        try {
            int _type = RULE_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7615:12: ( '~' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7615:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TILDE"

    // $ANTLR start "RULE_CARAT"
    public final void mRULE_CARAT() throws RecognitionException {
        try {
            int _type = RULE_CARAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7617:12: ( '^' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7617:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARAT"

    // $ANTLR start "RULE_SEG"
    public final void mRULE_SEG() throws RecognitionException {
        try {
            int _type = RULE_SEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7619:10: ( '..' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7619:12: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEG"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7621:11: ( '#' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7621:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_AMPERSAND"
    public final void mRULE_AMPERSAND() throws RecognitionException {
        try {
            int _type = RULE_AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7623:16: ( '&' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7623:18: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMPERSAND"

    // $ANTLR start "RULE_DOLAR"
    public final void mRULE_DOLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7625:12: ( '$' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7625:14: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLAR"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7627:12: ( '/' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7627:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_BACKSLASH"
    public final void mRULE_BACKSLASH() throws RecognitionException {
        try {
            int _type = RULE_BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7629:16: ( '\\\\' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7629:18: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKSLASH"

    // $ANTLR start "RULE_SLASHSLASH"
    public final void mRULE_SLASHSLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASHSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7631:17: ( '//' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7631:19: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASHSLASH"

    // $ANTLR start "RULE_BACKSLASHBACKSLASH"
    public final void mRULE_BACKSLASHBACKSLASH() throws RecognitionException {
        try {
            int _type = RULE_BACKSLASHBACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7633:25: ( '\\\\\\\\' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7633:27: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKSLASHBACKSLASH"

    // $ANTLR start "RULE_SLASHBACKSLASH"
    public final void mRULE_SLASHBACKSLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASHBACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7635:21: ( '/\\\\' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7635:23: '/\\\\'
            {
            match("/\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASHBACKSLASH"

    // $ANTLR start "RULE_BACKSLASHSLASH"
    public final void mRULE_BACKSLASHSLASH() throws RecognitionException {
        try {
            int _type = RULE_BACKSLASHSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7637:21: ( '\\\\/' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7637:23: '\\\\/'
            {
            match("\\/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKSLASHSLASH"

    // $ANTLR start "RULE_EXIT"
    public final void mRULE_EXIT() throws RecognitionException {
        try {
            int _type = RULE_EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7639:11: ( '=>' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7639:13: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXIT"

    // $ANTLR start "RULE_BECOMES"
    public final void mRULE_BECOMES() throws RecognitionException {
        try {
            int _type = RULE_BECOMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7641:14: ( ':=' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7641:16: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BECOMES"

    // $ANTLR start "RULE_DEF"
    public final void mRULE_DEF() throws RecognitionException {
        try {
            int _type = RULE_DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7643:10: ( '==' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7643:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEF"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7645:12: ( '->' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7645:14: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_LARROW"
    public final void mRULE_LARROW() throws RecognitionException {
        try {
            int _type = RULE_LARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7647:13: ( '<-' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7647:15: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LARROW"

    // $ANTLR start "RULE_GIVES"
    public final void mRULE_GIVES() throws RecognitionException {
        try {
            int _type = RULE_GIVES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7649:12: ( '+->' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7649:14: '+->'
            {
            match("+->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GIVES"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7651:14: ( '%' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7651:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_ELLIPSIS"
    public final void mRULE_ELLIPSIS() throws RecognitionException {
        try {
            int _type = RULE_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7653:15: ( '...' )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7653:17: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELLIPSIS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7655:16: ( . )
            // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:7655:18: .
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
        // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:8: ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_ID | RULE_WS | RULE_NL | RULE_SL_COMMENT | RULE_MACROVALUE | RULE_STRING | RULE_INT | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_OANGLE | RULE_CANGLE | RULE_MDEF | RULE_BAR | RULE_DOT | RULE_COERCE | RULE_COLON | RULE_COLONDASH | RULE_AT | RULE_ATAT | RULE_COMMA | RULE_SEMICOLON | RULE_POWER | RULE_TIMES | RULE_PLUS | RULE_MINUS | RULE_LT | RULE_GT | RULE_LE | RULE_GE | RULE_EQUAL | RULE_NOTEQUAL | RULE_TILDE | RULE_CARAT | RULE_SEG | RULE_HASH | RULE_AMPERSAND | RULE_DOLAR | RULE_SLASH | RULE_BACKSLASH | RULE_SLASHSLASH | RULE_BACKSLASHBACKSLASH | RULE_SLASHBACKSLASH | RULE_BACKSLASHSLASH | RULE_EXIT | RULE_BECOMES | RULE_DEF | RULE_ARROW | RULE_LARROW | RULE_GIVES | RULE_PERCENT | RULE_ELLIPSIS | RULE_ANY_OTHER )
        int alt11=96;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:10: T__60
                {
                mT__60(); 

                }
                break;
            case 2 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:16: T__61
                {
                mT__61(); 

                }
                break;
            case 3 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:22: T__62
                {
                mT__62(); 

                }
                break;
            case 4 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:28: T__63
                {
                mT__63(); 

                }
                break;
            case 5 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:34: T__64
                {
                mT__64(); 

                }
                break;
            case 6 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:40: T__65
                {
                mT__65(); 

                }
                break;
            case 7 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:46: T__66
                {
                mT__66(); 

                }
                break;
            case 8 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:52: T__67
                {
                mT__67(); 

                }
                break;
            case 9 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:58: T__68
                {
                mT__68(); 

                }
                break;
            case 10 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:64: T__69
                {
                mT__69(); 

                }
                break;
            case 11 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:70: T__70
                {
                mT__70(); 

                }
                break;
            case 12 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:76: T__71
                {
                mT__71(); 

                }
                break;
            case 13 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:82: T__72
                {
                mT__72(); 

                }
                break;
            case 14 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:88: T__73
                {
                mT__73(); 

                }
                break;
            case 15 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:94: T__74
                {
                mT__74(); 

                }
                break;
            case 16 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:100: T__75
                {
                mT__75(); 

                }
                break;
            case 17 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:106: T__76
                {
                mT__76(); 

                }
                break;
            case 18 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:112: T__77
                {
                mT__77(); 

                }
                break;
            case 19 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:118: T__78
                {
                mT__78(); 

                }
                break;
            case 20 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:124: T__79
                {
                mT__79(); 

                }
                break;
            case 21 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:130: T__80
                {
                mT__80(); 

                }
                break;
            case 22 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:136: T__81
                {
                mT__81(); 

                }
                break;
            case 23 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:142: T__82
                {
                mT__82(); 

                }
                break;
            case 24 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:148: T__83
                {
                mT__83(); 

                }
                break;
            case 25 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:154: T__84
                {
                mT__84(); 

                }
                break;
            case 26 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:160: T__85
                {
                mT__85(); 

                }
                break;
            case 27 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:166: T__86
                {
                mT__86(); 

                }
                break;
            case 28 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:172: T__87
                {
                mT__87(); 

                }
                break;
            case 29 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:178: T__88
                {
                mT__88(); 

                }
                break;
            case 30 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:184: T__89
                {
                mT__89(); 

                }
                break;
            case 31 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:190: T__90
                {
                mT__90(); 

                }
                break;
            case 32 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:196: T__91
                {
                mT__91(); 

                }
                break;
            case 33 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:202: T__92
                {
                mT__92(); 

                }
                break;
            case 34 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:208: T__93
                {
                mT__93(); 

                }
                break;
            case 35 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:214: T__94
                {
                mT__94(); 

                }
                break;
            case 36 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:220: T__95
                {
                mT__95(); 

                }
                break;
            case 37 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:226: T__96
                {
                mT__96(); 

                }
                break;
            case 38 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:232: T__97
                {
                mT__97(); 

                }
                break;
            case 39 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:238: T__98
                {
                mT__98(); 

                }
                break;
            case 40 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:244: T__99
                {
                mT__99(); 

                }
                break;
            case 41 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:250: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:258: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:266: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 44 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:274: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:290: RULE_MACROVALUE
                {
                mRULE_MACROVALUE(); 

                }
                break;
            case 46 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:306: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:318: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 48 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:327: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 49 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:339: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 50 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:351: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 51 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:363: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 52 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:375: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 53 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:389: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 54 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:403: RULE_OANGLE
                {
                mRULE_OANGLE(); 

                }
                break;
            case 55 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:415: RULE_CANGLE
                {
                mRULE_CANGLE(); 

                }
                break;
            case 56 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:427: RULE_MDEF
                {
                mRULE_MDEF(); 

                }
                break;
            case 57 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:437: RULE_BAR
                {
                mRULE_BAR(); 

                }
                break;
            case 58 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:446: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 59 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:455: RULE_COERCE
                {
                mRULE_COERCE(); 

                }
                break;
            case 60 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:467: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 61 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:478: RULE_COLONDASH
                {
                mRULE_COLONDASH(); 

                }
                break;
            case 62 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:493: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 63 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:501: RULE_ATAT
                {
                mRULE_ATAT(); 

                }
                break;
            case 64 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:511: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 65 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:522: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 66 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:537: RULE_POWER
                {
                mRULE_POWER(); 

                }
                break;
            case 67 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:548: RULE_TIMES
                {
                mRULE_TIMES(); 

                }
                break;
            case 68 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:559: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 69 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:569: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 70 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:580: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 71 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:588: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 72 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:596: RULE_LE
                {
                mRULE_LE(); 

                }
                break;
            case 73 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:604: RULE_GE
                {
                mRULE_GE(); 

                }
                break;
            case 74 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:612: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 75 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:623: RULE_NOTEQUAL
                {
                mRULE_NOTEQUAL(); 

                }
                break;
            case 76 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:637: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 77 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:648: RULE_CARAT
                {
                mRULE_CARAT(); 

                }
                break;
            case 78 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:659: RULE_SEG
                {
                mRULE_SEG(); 

                }
                break;
            case 79 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:668: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 80 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:678: RULE_AMPERSAND
                {
                mRULE_AMPERSAND(); 

                }
                break;
            case 81 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:693: RULE_DOLAR
                {
                mRULE_DOLAR(); 

                }
                break;
            case 82 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:704: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 83 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:715: RULE_BACKSLASH
                {
                mRULE_BACKSLASH(); 

                }
                break;
            case 84 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:730: RULE_SLASHSLASH
                {
                mRULE_SLASHSLASH(); 

                }
                break;
            case 85 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:746: RULE_BACKSLASHBACKSLASH
                {
                mRULE_BACKSLASHBACKSLASH(); 

                }
                break;
            case 86 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:770: RULE_SLASHBACKSLASH
                {
                mRULE_SLASHBACKSLASH(); 

                }
                break;
            case 87 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:790: RULE_BACKSLASHSLASH
                {
                mRULE_BACKSLASHSLASH(); 

                }
                break;
            case 88 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:810: RULE_EXIT
                {
                mRULE_EXIT(); 

                }
                break;
            case 89 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:820: RULE_BECOMES
                {
                mRULE_BECOMES(); 

                }
                break;
            case 90 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:833: RULE_DEF
                {
                mRULE_DEF(); 

                }
                break;
            case 91 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:842: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 92 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:853: RULE_LARROW
                {
                mRULE_LARROW(); 

                }
                break;
            case 93 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:865: RULE_GIVES
                {
                mRULE_GIVES(); 

                }
                break;
            case 94 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:876: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 95 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:889: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 96 :
                // ../com.euclideanspace.spad/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:903: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\73\24\75\1\133\2\75\3\uffff\1\71\2\uffff\1\143\1\145"+
        "\1\150\1\71\6\uffff\1\163\1\166\1\uffff\1\171\1\175\1\177\2\uffff"+
        "\1\u0083\1\u0085\3\uffff\1\u008b\1\u008e\4\uffff\1\75\1\uffff\3"+
        "\75\1\u0096\13\75\1\u00a3\1\75\1\u00a5\1\u00a7\6\75\1\u00b0\2\75"+
        "\2\uffff\2\75\10\uffff\1\u00b7\21\uffff\1\u00b9\27\uffff\6\75\1"+
        "\uffff\3\75\1\u00c3\1\u00c4\5\75\1\u00ca\1\75\1\uffff\1\75\1\uffff"+
        "\1\75\1\uffff\2\75\1\u00d0\5\75\1\uffff\1\u00d6\1\u00d7\1\u00d8"+
        "\1\u00d9\5\uffff\1\75\1\u00db\6\75\1\u00e2\2\uffff\1\u00e3\2\75"+
        "\1\u00e6\1\u00e7\1\uffff\2\75\1\u00ea\2\75\1\uffff\1\75\1\u00ee"+
        "\1\u00ef\1\u00f0\1\75\4\uffff\1\75\1\uffff\4\75\1\u00f7\1\u00f8"+
        "\2\uffff\1\75\1\u00fa\2\uffff\1\u00fb\1\75\1\uffff\2\75\1\u00ff"+
        "\3\uffff\1\u0100\4\75\1\u0105\2\uffff\1\u0106\2\uffff\1\75\1\u0108"+
        "\1\u0109\2\uffff\2\75\1\u010c\1\u010d\2\uffff\1\u010e\2\uffff\1"+
        "\u010f\1\u0110\5\uffff";
    static final String DFA11_eofS =
        "\u0111\uffff";
    static final String DFA11_minS =
        "\1\0\4\141\1\157\1\150\1\144\1\171\1\145\1\156\1\157\1\151\1\141"+
        "\1\146\1\145\1\162\1\150\1\154\1\162\1\157\1\141\1\75\1\165\1\157"+
        "\3\uffff\1\0\2\uffff\1\55\1\53\1\75\1\0\6\uffff\1\55\1\75\1\uffff"+
        "\1\56\1\55\1\100\2\uffff\1\52\1\75\3\uffff\2\57\4\uffff\1\163\1"+
        "\uffff\1\164\1\143\1\145\1\41\1\145\1\164\2\144\1\160\1\143\2\151"+
        "\1\163\1\162\1\154\1\41\1\145\2\41\1\155\2\145\1\165\1\163\1\161"+
        "\1\41\1\164\1\163\2\uffff\1\157\1\144\10\uffff\1\75\21\uffff\1\56"+
        "\27\uffff\3\145\1\153\1\164\1\141\1\uffff\1\162\1\154\1\150\2\41"+
        "\1\145\2\157\1\156\1\160\1\41\1\163\1\uffff\1\162\1\uffff\1\164"+
        "\1\uffff\1\145\1\165\1\41\1\141\1\156\2\145\1\165\1\uffff\4\41\5"+
        "\uffff\1\147\1\41\1\147\1\141\1\145\1\151\2\145\1\41\2\uffff\1\41"+
        "\1\162\1\156\2\41\1\uffff\1\145\1\141\1\41\1\141\1\162\1\uffff\1"+
        "\153\3\41\1\157\4\uffff\1\157\1\uffff\1\157\1\147\2\156\2\41\2\uffff"+
        "\1\144\1\41\2\uffff\1\41\1\164\1\uffff\1\164\1\156\1\41\3\uffff"+
        "\1\41\2\162\1\145\1\144\1\41\2\uffff\1\41\2\uffff\1\145\2\41\2\uffff"+
        "\2\171\2\41\2\uffff\1\41\2\uffff\2\41\5\uffff";
    static final String DFA11_maxS =
        "\1\uffff\3\141\1\162\1\157\1\151\1\156\1\171\1\145\1\156\1\157\1"+
        "\151\1\157\1\164\1\145\2\162\1\170\1\162\1\157\1\141\1\75\1\165"+
        "\1\157\3\uffff\1\uffff\2\uffff\1\76\1\55\1\76\1\uffff\6\uffff\1"+
        "\75\1\76\1\uffff\1\56\1\75\1\100\2\uffff\1\52\1\75\3\uffff\2\134"+
        "\4\uffff\1\164\1\uffff\1\164\1\143\1\145\1\172\1\151\1\164\2\144"+
        "\1\160\1\143\2\151\1\163\1\162\1\154\1\172\1\145\2\172\1\164\2\145"+
        "\1\165\1\163\1\161\1\172\1\164\1\163\2\uffff\1\157\1\144\10\uffff"+
        "\1\76\21\uffff\1\56\27\uffff\3\145\1\153\1\164\1\141\1\uffff\1\162"+
        "\1\154\1\150\2\172\1\145\2\157\1\156\1\160\1\172\1\163\1\uffff\1"+
        "\162\1\uffff\1\164\1\uffff\1\145\1\165\1\172\1\141\1\156\2\145\1"+
        "\165\1\uffff\4\172\5\uffff\1\147\1\172\1\147\1\141\1\145\1\151\2"+
        "\145\1\172\2\uffff\1\172\1\162\1\156\2\172\1\uffff\1\145\1\141\1"+
        "\172\1\141\1\162\1\uffff\1\153\3\172\1\157\4\uffff\1\157\1\uffff"+
        "\1\157\1\147\2\156\2\172\2\uffff\1\144\1\172\2\uffff\1\172\1\164"+
        "\1\uffff\1\164\1\156\1\172\3\uffff\1\172\2\162\1\145\1\144\1\172"+
        "\2\uffff\1\172\2\uffff\1\145\2\172\2\uffff\2\171\2\172\2\uffff\1"+
        "\172\2\uffff\2\172\5\uffff";
    static final String DFA11_acceptS =
        "\31\uffff\1\46\2\51\1\uffff\1\52\1\53\4\uffff\1\57\1\60\1\62\1\63"+
        "\1\64\1\65\2\uffff\1\71\3\uffff\1\100\1\101\2\uffff\1\117\1\120"+
        "\1\121\2\uffff\1\136\1\140\1\1\1\61\1\uffff\1\51\34\uffff\1\36\1"+
        "\115\2\uffff\1\46\1\52\1\53\1\54\1\133\1\105\1\135\1\104\1\uffff"+
        "\1\130\1\112\1\56\1\57\1\60\1\62\1\63\1\64\1\65\1\66\1\110\1\134"+
        "\1\106\1\67\1\111\1\107\1\71\1\uffff\1\72\1\73\1\75\1\131\1\74\1"+
        "\77\1\76\1\100\1\101\1\102\1\103\1\113\1\114\1\117\1\120\1\121\1"+
        "\124\1\126\1\122\1\125\1\127\1\123\1\136\6\uffff\1\22\14\uffff\1"+
        "\17\1\uffff\1\26\1\uffff\1\37\10\uffff\1\31\4\uffff\1\55\1\70\1"+
        "\132\1\137\1\116\11\uffff\1\10\1\32\5\uffff\1\16\5\uffff\1\44\5"+
        "\uffff\1\33\1\34\1\42\1\43\1\uffff\1\35\6\uffff\1\7\1\11\2\uffff"+
        "\1\14\1\15\2\uffff\1\40\3\uffff\1\27\1\47\1\30\6\uffff\1\6\1\21"+
        "\1\uffff\1\13\1\50\3\uffff\1\24\1\41\4\uffff\1\5\1\12\1\uffff\1"+
        "\20\1\25\2\uffff\1\4\1\45\1\23\1\2\1\3";
    static final String DFA11_specialS =
        "\1\0\33\uffff\1\2\5\uffff\1\1\u00ee\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\71\1\35\1\36\2\71\1\36\22\71\1\35\1\71\1\42\1\63\1\65\1"+
            "\70\1\64\1\31\1\44\1\1\1\61\1\40\1\57\1\37\1\54\1\66\12\43\1"+
            "\55\1\60\1\51\1\41\1\52\1\71\1\56\2\33\1\3\6\33\1\13\1\33\1"+
            "\14\5\33\1\11\1\33\1\10\1\12\5\33\1\47\1\67\1\50\1\26\1\34\1"+
            "\71\1\7\1\20\1\2\1\5\1\22\1\15\1\32\1\25\1\16\3\32\1\30\1\24"+
            "\1\23\1\4\1\27\1\17\1\32\1\21\2\32\1\6\3\32\1\45\1\53\1\46\1"+
            "\62\uff81\71",
            "\1\72",
            "\1\74",
            "\1\76",
            "\1\77\20\uffff\1\100",
            "\1\101",
            "\1\102\1\103",
            "\1\104\11\uffff\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\114\15\uffff\1\113",
            "\1\117\7\uffff\1\115\4\uffff\1\120\1\116",
            "\1\121",
            "\1\122",
            "\1\123\11\uffff\1\124",
            "\1\125\13\uffff\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "\0\75",
            "",
            "",
            "\1\141\20\uffff\1\142",
            "\1\141\1\uffff\1\144",
            "\1\146\1\147",
            "\0\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162\16\uffff\1\160\1\161",
            "\1\165\1\164",
            "",
            "\1\170",
            "\1\173\14\uffff\1\172\2\uffff\1\174",
            "\1\176",
            "",
            "",
            "\1\u0082",
            "\1\u0084",
            "",
            "",
            "",
            "\1\u0089\54\uffff\1\u008a",
            "\1\u008d\54\uffff\1\u008c",
            "",
            "",
            "",
            "",
            "\1\u0091\1\u0090",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\14\75\1\u0095\15\75",
            "\1\u0097\3\uffff\1\u0098",
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
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00a4",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\15\75\1\u00a6\14\75",
            "\1\u00aa\2\uffff\1\u00a8\3\uffff\1\u00a9",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b5\1\u00b6",
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
            "",
            "",
            "",
            "\1\u00b8",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "",
            "",
            "",
            "\1\u00da",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00e4",
            "\1\u00e5",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00f1",
            "",
            "",
            "",
            "",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\u00f9",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\u0107",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
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
            return "1:1: Tokens : ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_ID | RULE_WS | RULE_NL | RULE_SL_COMMENT | RULE_MACROVALUE | RULE_STRING | RULE_INT | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_OANGLE | RULE_CANGLE | RULE_MDEF | RULE_BAR | RULE_DOT | RULE_COERCE | RULE_COLON | RULE_COLONDASH | RULE_AT | RULE_ATAT | RULE_COMMA | RULE_SEMICOLON | RULE_POWER | RULE_TIMES | RULE_PLUS | RULE_MINUS | RULE_LT | RULE_GT | RULE_LE | RULE_GE | RULE_EQUAL | RULE_NOTEQUAL | RULE_TILDE | RULE_CARAT | RULE_SEG | RULE_HASH | RULE_AMPERSAND | RULE_DOLAR | RULE_SLASH | RULE_BACKSLASH | RULE_SLASHSLASH | RULE_BACKSLASHBACKSLASH | RULE_SLASHBACKSLASH | RULE_BACKSLASHSLASH | RULE_EXIT | RULE_BECOMES | RULE_DEF | RULE_ARROW | RULE_LARROW | RULE_GIVES | RULE_PERCENT | RULE_ELLIPSIS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0==')') ) {s = 1;}

                        else if ( (LA11_0=='c') ) {s = 2;}

                        else if ( (LA11_0=='C') ) {s = 3;}

                        else if ( (LA11_0=='p') ) {s = 4;}

                        else if ( (LA11_0=='d') ) {s = 5;}

                        else if ( (LA11_0=='w') ) {s = 6;}

                        else if ( (LA11_0=='a') ) {s = 7;}

                        else if ( (LA11_0=='T') ) {s = 8;}

                        else if ( (LA11_0=='R') ) {s = 9;}

                        else if ( (LA11_0=='U') ) {s = 10;}

                        else if ( (LA11_0=='J') ) {s = 11;}

                        else if ( (LA11_0=='L') ) {s = 12;}

                        else if ( (LA11_0=='f') ) {s = 13;}

                        else if ( (LA11_0=='i') ) {s = 14;}

                        else if ( (LA11_0=='r') ) {s = 15;}

                        else if ( (LA11_0=='b') ) {s = 16;}

                        else if ( (LA11_0=='t') ) {s = 17;}

                        else if ( (LA11_0=='e') ) {s = 18;}

                        else if ( (LA11_0=='o') ) {s = 19;}

                        else if ( (LA11_0=='n') ) {s = 20;}

                        else if ( (LA11_0=='h') ) {s = 21;}

                        else if ( (LA11_0=='^') ) {s = 22;}

                        else if ( (LA11_0=='q') ) {s = 23;}

                        else if ( (LA11_0=='m') ) {s = 24;}

                        else if ( (LA11_0=='\'') ) {s = 25;}

                        else if ( (LA11_0=='g'||(LA11_0>='j' && LA11_0<='l')||LA11_0=='s'||(LA11_0>='u' && LA11_0<='v')||(LA11_0>='x' && LA11_0<='z')) ) {s = 26;}

                        else if ( ((LA11_0>='A' && LA11_0<='B')||(LA11_0>='D' && LA11_0<='I')||LA11_0=='K'||(LA11_0>='M' && LA11_0<='Q')||LA11_0=='S'||(LA11_0>='V' && LA11_0<='Z')) ) {s = 27;}

                        else if ( (LA11_0=='_') ) {s = 28;}

                        else if ( (LA11_0=='\t'||LA11_0==' ') ) {s = 29;}

                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {s = 30;}

                        else if ( (LA11_0=='-') ) {s = 31;}

                        else if ( (LA11_0=='+') ) {s = 32;}

                        else if ( (LA11_0=='=') ) {s = 33;}

                        else if ( (LA11_0=='\"') ) {s = 34;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 35;}

                        else if ( (LA11_0=='(') ) {s = 36;}

                        else if ( (LA11_0=='{') ) {s = 37;}

                        else if ( (LA11_0=='}') ) {s = 38;}

                        else if ( (LA11_0=='[') ) {s = 39;}

                        else if ( (LA11_0==']') ) {s = 40;}

                        else if ( (LA11_0=='<') ) {s = 41;}

                        else if ( (LA11_0=='>') ) {s = 42;}

                        else if ( (LA11_0=='|') ) {s = 43;}

                        else if ( (LA11_0=='.') ) {s = 44;}

                        else if ( (LA11_0==':') ) {s = 45;}

                        else if ( (LA11_0=='@') ) {s = 46;}

                        else if ( (LA11_0==',') ) {s = 47;}

                        else if ( (LA11_0==';') ) {s = 48;}

                        else if ( (LA11_0=='*') ) {s = 49;}

                        else if ( (LA11_0=='~') ) {s = 50;}

                        else if ( (LA11_0=='#') ) {s = 51;}

                        else if ( (LA11_0=='&') ) {s = 52;}

                        else if ( (LA11_0=='$') ) {s = 53;}

                        else if ( (LA11_0=='/') ) {s = 54;}

                        else if ( (LA11_0=='\\') ) {s = 55;}

                        else if ( (LA11_0=='%') ) {s = 56;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||LA11_0=='?'||LA11_0=='`'||(LA11_0>='\u007F' && LA11_0<='\uFFFF')) ) {s = 57;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_34 = input.LA(1);

                        s = -1;
                        if ( ((LA11_34>='\u0000' && LA11_34<='\uFFFF')) ) {s = 105;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_28 = input.LA(1);

                        s = -1;
                        if ( ((LA11_28>='\u0000' && LA11_28<='\uFFFF')) ) {s = 61;}

                        else s = 57;

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