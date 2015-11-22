// Generated from BKOOL.g4 by ANTLR 4.5.1

	package bkool.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BKOOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTS=1, CHARACTER=2, BOOL=3, BREAK=4, CLASS=5, CONTINUE=6, DO=7, ELSE=8, 
		EXTENDS=9, FLOAT=10, IF=11, INTEGER=12, NEW=13, STRING=14, THEN=15, WHILE=16, 
		RETURN=17, TRUE=18, FALSE=19, VOID=20, NULL=21, SELF=22, FINAL=23, STATIC=24, 
		KEYWORDS=25, ID=26, ASS_OP=27, ADD_OP=28, SUB_OP=29, MUL_OP=30, FLOAT_DIV_OP=31, 
		INT_DIV_OP=32, MOD_OP=33, NOT_EQUAL_OP=34, EQUAL_OP=35, EQUAL_OP_2=36, 
		LESS_OP=37, GREATER_OP=38, LESS_EQUAL_OP=39, GREATER_EQUAL_OP=40, OR_OP=41, 
		AND_OP=42, NOT_OP=43, CONCAT_OP=44, OPERATOR=45, LEFT_SQUARE_BRACKET=46, 
		RIGHT_SQUARE_BRACKET=47, LEFT_BRACKET=48, RIGHT_BRACKET=49, COMMA=50, 
		DOT=51, COLON=52, SEMI_COLON=53, LEFT_PARENTHESIS=54, RIGHT_PARENTHESIS=55, 
		SEPARATOR=56, FLOAT_LIT=57, INTEGER_LIT=58, ERROR_UNCLOSE_STRING=59, ERROR_ESCAPE_STRING=60, 
		STRING_LIT=61, WS=62, ERROR_TOKEN=63;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENTS", "CHARACTER", "BOOL", "BREAK", "CLASS", "CONTINUE", "DO", "ELSE", 
		"EXTENDS", "FLOAT", "IF", "INTEGER", "NEW", "STRING", "THEN", "WHILE", 
		"RETURN", "TRUE", "FALSE", "VOID", "NULL", "SELF", "FINAL", "STATIC", 
		"KEYWORDS", "ID", "ASS_OP", "ADD_OP", "SUB_OP", "MUL_OP", "FLOAT_DIV_OP", 
		"INT_DIV_OP", "MOD_OP", "NOT_EQUAL_OP", "EQUAL_OP", "EQUAL_OP_2", "LESS_OP", 
		"GREATER_OP", "LESS_EQUAL_OP", "GREATER_EQUAL_OP", "OR_OP", "AND_OP", 
		"NOT_OP", "CONCAT_OP", "OPERATOR", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", "DOT", "COLON", "SEMI_COLON", 
		"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "SEPARATOR", "FLOAT_LIT", "INTEGER_LIT", 
		"UNCLOSE_STRING", "ERROR_UNCLOSE_STRING", "ESCAPE_STRING", "ERROR_ESCAPE_STRING", 
		"STRING_LIT", "WS", "CHARACTER_ERROR", "CHARACTER_ERROR2", "ERROR_TOKEN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'bool'", "'break'", "'class'", "'continue'", "'do'", 
		"'else'", "'extends'", "'float'", "'if'", "'integer'", "'new'", "'string'", 
		"'then'", "'while'", "'return'", "'true'", "'false'", "'void'", "'null'", 
		"'self'", "'final'", "'static'", null, null, "':='", "'+'", "'-'", "'*'", 
		"'/'", "'\\'", "'%'", "'<>'", "'=='", "'='", "'<'", "'>'", "'<='", "'>='", 
		"'||'", "'&&'", "'!'", "'^'", null, "'['", "']'", "'('", "')'", "','", 
		"'.'", "':'", "';'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENTS", "CHARACTER", "BOOL", "BREAK", "CLASS", "CONTINUE", "DO", 
		"ELSE", "EXTENDS", "FLOAT", "IF", "INTEGER", "NEW", "STRING", "THEN", 
		"WHILE", "RETURN", "TRUE", "FALSE", "VOID", "NULL", "SELF", "FINAL", "STATIC", 
		"KEYWORDS", "ID", "ASS_OP", "ADD_OP", "SUB_OP", "MUL_OP", "FLOAT_DIV_OP", 
		"INT_DIV_OP", "MOD_OP", "NOT_EQUAL_OP", "EQUAL_OP", "EQUAL_OP_2", "LESS_OP", 
		"GREATER_OP", "LESS_EQUAL_OP", "GREATER_EQUAL_OP", "OR_OP", "AND_OP", 
		"NOT_OP", "CONCAT_OP", "OPERATOR", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", "DOT", "COLON", "SEMI_COLON", 
		"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "SEPARATOR", "FLOAT_LIT", "INTEGER_LIT", 
		"ERROR_UNCLOSE_STRING", "ERROR_ESCAPE_STRING", "STRING_LIT", "WS", "ERROR_TOKEN"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BKOOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BKOOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 59:
			ERROR_UNCLOSE_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			ERROR_ESCAPE_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			ERROR_TOKEN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERROR_UNCLOSE_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			if(true) throw new bkool.parser.UncloseString(getText());
			break;
		}
	}
	private void ERROR_ESCAPE_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			if(true) throw new bkool.parser.IllegalEscape(getText());
			break;
		}
	}
	private void ERROR_TOKEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			if(true) throw new bkool.parser.ErrorToken(getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2A\u022a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\7\2\u008e\n"+
		"\2\f\2\16\2\u0091\13\2\3\2\3\2\3\2\3\2\7\2\u0097\n\2\f\2\16\2\u009a\13"+
		"\2\3\2\5\2\u009d\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u00ab\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u0144\n\32\3\33\5\33\u0147\n\33\3\33\7\33\u014a\n\33"+
		"\f\33\16\33\u014d\13\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\5.\u018c\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\39"+
		"\39\39\39\39\39\59\u01ac\n9\3:\6:\u01af\n:\r:\16:\u01b0\3:\3:\7:\u01b5"+
		"\n:\f:\16:\u01b8\13:\3:\3:\7:\u01bc\n:\f:\16:\u01bf\13:\5:\u01c1\n:\3"+
		":\3:\5:\u01c5\n:\3:\6:\u01c8\n:\r:\16:\u01c9\5:\u01cc\n:\3;\6;\u01cf\n"+
		";\r;\16;\u01d0\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u01e3"+
		"\n<\f<\16<\u01e6\13<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\7>\u01fb\n>\f>\16>\u01fe\13>\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0216\n@\f@\16@\u0219\13@\3@\3@\3"+
		"A\6A\u021e\nA\rA\16A\u021f\3A\3A\3B\3B\3C\3C\3D\3D\3D\3\u008f\2E\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w\2y={\2}>\177?\u0081@\u0083\2\u0085\2\u0087A\3\2\r\4\2\f\f\17\17\4"+
		"\2\13\f\16\17\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2GGgg\4\2--//\6\2\n"+
		"\f\16\17$$^^\5\2\13\f\17\17\"\"\n\2\"\"CCEKMRTVYY[[aa\b\2&&()ABbb~~\u0080"+
		"\u0080\u027d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2y\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0087\3\2\2\2\3\u009c\3\2\2"+
		"\2\5\u00a0\3\2\2\2\7\u00ae\3\2\2\2\t\u00b3\3\2\2\2\13\u00b9\3\2\2\2\r"+
		"\u00bf\3\2\2\2\17\u00c8\3\2\2\2\21\u00cb\3\2\2\2\23\u00d0\3\2\2\2\25\u00d8"+
		"\3\2\2\2\27\u00de\3\2\2\2\31\u00e1\3\2\2\2\33\u00e9\3\2\2\2\35\u00ed\3"+
		"\2\2\2\37\u00f4\3\2\2\2!\u00f9\3\2\2\2#\u00ff\3\2\2\2%\u0106\3\2\2\2\'"+
		"\u010b\3\2\2\2)\u0111\3\2\2\2+\u0116\3\2\2\2-\u011b\3\2\2\2/\u0120\3\2"+
		"\2\2\61\u0126\3\2\2\2\63\u0143\3\2\2\2\65\u0146\3\2\2\2\67\u014e\3\2\2"+
		"\29\u0151\3\2\2\2;\u0153\3\2\2\2=\u0155\3\2\2\2?\u0157\3\2\2\2A\u0159"+
		"\3\2\2\2C\u015b\3\2\2\2E\u015d\3\2\2\2G\u0160\3\2\2\2I\u0163\3\2\2\2K"+
		"\u0165\3\2\2\2M\u0167\3\2\2\2O\u0169\3\2\2\2Q\u016c\3\2\2\2S\u016f\3\2"+
		"\2\2U\u0172\3\2\2\2W\u0175\3\2\2\2Y\u0177\3\2\2\2[\u018b\3\2\2\2]\u018d"+
		"\3\2\2\2_\u018f\3\2\2\2a\u0191\3\2\2\2c\u0193\3\2\2\2e\u0195\3\2\2\2g"+
		"\u0197\3\2\2\2i\u0199\3\2\2\2k\u019b\3\2\2\2m\u019d\3\2\2\2o\u019f\3\2"+
		"\2\2q\u01ab\3\2\2\2s\u01ae\3\2\2\2u\u01ce\3\2\2\2w\u01d2\3\2\2\2y\u01e7"+
		"\3\2\2\2{\u01ea\3\2\2\2}\u0202\3\2\2\2\177\u0205\3\2\2\2\u0081\u021d\3"+
		"\2\2\2\u0083\u0223\3\2\2\2\u0085\u0225\3\2\2\2\u0087\u0227\3\2\2\2\u0089"+
		"\u008a\7*\2\2\u008a\u008b\7,\2\2\u008b\u008f\3\2\2\2\u008c\u008e\13\2"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7,"+
		"\2\2\u0093\u009d\7+\2\2\u0094\u0098\7%\2\2\u0095\u0097\n\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\t\2\2\2\u009c\u0089\3\2"+
		"\2\2\u009c\u0094\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\2\2\2\u009f"+
		"\4\3\2\2\2\u00a0\u00aa\7)\2\2\u00a1\u00a2\7^\2\2\u00a2\u00ab\7v\2\2\u00a3"+
		"\u00a4\7^\2\2\u00a4\u00ab\7p\2\2\u00a5\u00a6\7^\2\2\u00a6\u00ab\7h\2\2"+
		"\u00a7\u00a8\7^\2\2\u00a8\u00ab\7t\2\2\u00a9\u00ab\n\3\2\2\u00aa\u00a1"+
		"\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7)\2\2\u00ad\6\3\2\2\2"+
		"\u00ae\u00af\7d\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2"+
		"\7n\2\2\u00b2\b\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7m\2\2\u00b8\n\3\2\2\2\u00b9\u00ba"+
		"\7e\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\f\3\2\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\u00c6\7w\2\2\u00c6\u00c7\7g\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7"+
		"f\2\2\u00c9\u00ca\7q\2\2\u00ca\20\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cf\22\3\2\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7z\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7u\2\2\u00d7\24\3\2\2\2\u00d8"+
		"\u00d9\7h\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7c\2\2"+
		"\u00dc\u00dd\7v\2\2\u00dd\26\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7"+
		"h\2\2\u00e0\30\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7t\2\2\u00e8\32\3\2\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"\u00ec\7y\2\2\u00ec\34\3\2\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7v\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7i\2\2"+
		"\u00f3\36\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7\7"+
		"g\2\2\u00f7\u00f8\7p\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb"+
		"\7j\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\"\3\2\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7w\2\2\u0103\u0104\7t\2\2\u0104\u0105\7p\2\2\u0105$\3\2\2\2\u0106"+
		"\u0107\7v\2\2\u0107\u0108\7t\2\2\u0108\u0109\7w\2\2\u0109\u010a\7g\2\2"+
		"\u010a&\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2"+
		"\2\u010e\u010f\7u\2\2\u010f\u0110\7g\2\2\u0110(\3\2\2\2\u0111\u0112\7"+
		"x\2\2\u0112\u0113\7q\2\2\u0113\u0114\7k\2\2\u0114\u0115\7f\2\2\u0115*"+
		"\3\2\2\2\u0116\u0117\7p\2\2\u0117\u0118\7w\2\2\u0118\u0119\7n\2\2\u0119"+
		"\u011a\7n\2\2\u011a,\3\2\2\2\u011b\u011c\7u\2\2\u011c\u011d\7g\2\2\u011d"+
		"\u011e\7n\2\2\u011e\u011f\7h\2\2\u011f.\3\2\2\2\u0120\u0121\7h\2\2\u0121"+
		"\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2"+
		"\u0125\60\3\2\2\2\u0126\u0127\7u\2\2\u0127\u0128\7v\2\2\u0128\u0129\7"+
		"c\2\2\u0129\u012a\7v\2\2\u012a\u012b\7k\2\2\u012b\u012c\7e\2\2\u012c\62"+
		"\3\2\2\2\u012d\u0144\5\7\4\2\u012e\u0144\5\t\5\2\u012f\u0144\5\13\6\2"+
		"\u0130\u0144\5\r\7\2\u0131\u0144\5\17\b\2\u0132\u0144\5\21\t\2\u0133\u0144"+
		"\5\23\n\2\u0134\u0144\5\25\13\2\u0135\u0144\5\27\f\2\u0136\u0144\5\31"+
		"\r\2\u0137\u0144\5\33\16\2\u0138\u0144\5\35\17\2\u0139\u0144\5\37\20\2"+
		"\u013a\u0144\5!\21\2\u013b\u0144\5#\22\2\u013c\u0144\5%\23\2\u013d\u0144"+
		"\5\'\24\2\u013e\u0144\5)\25\2\u013f\u0144\5+\26\2\u0140\u0144\5-\27\2"+
		"\u0141\u0144\5/\30\2\u0142\u0144\5\61\31\2\u0143\u012d\3\2\2\2\u0143\u012e"+
		"\3\2\2\2\u0143\u012f\3\2\2\2\u0143\u0130\3\2\2\2\u0143\u0131\3\2\2\2\u0143"+
		"\u0132\3\2\2\2\u0143\u0133\3\2\2\2\u0143\u0134\3\2\2\2\u0143\u0135\3\2"+
		"\2\2\u0143\u0136\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u0138\3\2\2\2\u0143"+
		"\u0139\3\2\2\2\u0143\u013a\3\2\2\2\u0143\u013b\3\2\2\2\u0143\u013c\3\2"+
		"\2\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u013f\3\2\2\2\u0143"+
		"\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\64\3\2\2"+
		"\2\u0145\u0147\t\4\2\2\u0146\u0145\3\2\2\2\u0147\u014b\3\2\2\2\u0148\u014a"+
		"\t\5\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\66\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7<\2\2"+
		"\u014f\u0150\7?\2\2\u01508\3\2\2\2\u0151\u0152\7-\2\2\u0152:\3\2\2\2\u0153"+
		"\u0154\7/\2\2\u0154<\3\2\2\2\u0155\u0156\7,\2\2\u0156>\3\2\2\2\u0157\u0158"+
		"\7\61\2\2\u0158@\3\2\2\2\u0159\u015a\7^\2\2\u015aB\3\2\2\2\u015b\u015c"+
		"\7\'\2\2\u015cD\3\2\2\2\u015d\u015e\7>\2\2\u015e\u015f\7@\2\2\u015fF\3"+
		"\2\2\2\u0160\u0161\7?\2\2\u0161\u0162\7?\2\2\u0162H\3\2\2\2\u0163\u0164"+
		"\7?\2\2\u0164J\3\2\2\2\u0165\u0166\7>\2\2\u0166L\3\2\2\2\u0167\u0168\7"+
		"@\2\2\u0168N\3\2\2\2\u0169\u016a\7>\2\2\u016a\u016b\7?\2\2\u016bP\3\2"+
		"\2\2\u016c\u016d\7@\2\2\u016d\u016e\7?\2\2\u016eR\3\2\2\2\u016f\u0170"+
		"\7~\2\2\u0170\u0171\7~\2\2\u0171T\3\2\2\2\u0172\u0173\7(\2\2\u0173\u0174"+
		"\7(\2\2\u0174V\3\2\2\2\u0175\u0176\7#\2\2\u0176X\3\2\2\2\u0177\u0178\7"+
		"`\2\2\u0178Z\3\2\2\2\u0179\u018c\5\67\34\2\u017a\u018c\59\35\2\u017b\u018c"+
		"\5;\36\2\u017c\u018c\5=\37\2\u017d\u018c\5? \2\u017e\u018c\5A!\2\u017f"+
		"\u018c\5C\"\2\u0180\u018c\5E#\2\u0181\u018c\5G$\2\u0182\u018c\5I%\2\u0183"+
		"\u018c\5K&\2\u0184\u018c\5M\'\2\u0185\u018c\5O(\2\u0186\u018c\5Q)\2\u0187"+
		"\u018c\5S*\2\u0188\u018c\5U+\2\u0189\u018c\5W,\2\u018a\u018c\5Y-\2\u018b"+
		"\u0179\3\2\2\2\u018b\u017a\3\2\2\2\u018b\u017b\3\2\2\2\u018b\u017c\3\2"+
		"\2\2\u018b\u017d\3\2\2\2\u018b\u017e\3\2\2\2\u018b\u017f\3\2\2\2\u018b"+
		"\u0180\3\2\2\2\u018b\u0181\3\2\2\2\u018b\u0182\3\2\2\2\u018b\u0183\3\2"+
		"\2\2\u018b\u0184\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u0186\3\2\2\2\u018b"+
		"\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c\\\3\2\2\2\u018d\u018e\7]\2\2\u018e^\3\2\2\2\u018f\u0190\7_"+
		"\2\2\u0190`\3\2\2\2\u0191\u0192\7*\2\2\u0192b\3\2\2\2\u0193\u0194\7+\2"+
		"\2\u0194d\3\2\2\2\u0195\u0196\7.\2\2\u0196f\3\2\2\2\u0197\u0198\7\60\2"+
		"\2\u0198h\3\2\2\2\u0199\u019a\7<\2\2\u019aj\3\2\2\2\u019b\u019c\7=\2\2"+
		"\u019cl\3\2\2\2\u019d\u019e\7}\2\2\u019en\3\2\2\2\u019f\u01a0\7\177\2"+
		"\2\u01a0p\3\2\2\2\u01a1\u01ac\5]/\2\u01a2\u01ac\5_\60\2\u01a3\u01ac\5"+
		"a\61\2\u01a4\u01ac\5c\62\2\u01a5\u01ac\5e\63\2\u01a6\u01ac\5k\66\2\u01a7"+
		"\u01ac\5g\64\2\u01a8\u01ac\5i\65\2\u01a9\u01ac\5m\67\2\u01aa\u01ac\5o"+
		"8\2\u01ab\u01a1\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ab"+
		"\u01a4\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01a7\3\2"+
		"\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac"+
		"r\3\2\2\2\u01ad\u01af\t\6\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2"+
		"\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01cb\3\2\2\2\u01b2\u01b6"+
		"\7\60\2\2\u01b3\u01b5\t\6\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2"+
		"\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01cc\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b9\u01bd\7\60\2\2\u01ba\u01bc\t\6\2\2\u01bb\u01ba\3\2\2\2"+
		"\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1"+
		"\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c4\t\7\2\2\u01c3\u01c5\t\b\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c8\t\6\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01b2\3\2\2\2\u01cb\u01c0\3\2\2\2\u01cc"+
		"t\3\2\2\2\u01cd\u01cf\t\6\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2"+
		"\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1v\3\2\2\2\u01d2\u01e4\7"+
		"$\2\2\u01d3\u01d4\7^\2\2\u01d4\u01e3\7^\2\2\u01d5\u01d6\7^\2\2\u01d6\u01e3"+
		"\7v\2\2\u01d7\u01d8\7^\2\2\u01d8\u01e3\7$\2\2\u01d9\u01da\7^\2\2\u01da"+
		"\u01e3\7p\2\2\u01db\u01dc\7^\2\2\u01dc\u01e3\7h\2\2\u01dd\u01de\7^\2\2"+
		"\u01de\u01e3\7t\2\2\u01df\u01e0\7^\2\2\u01e0\u01e3\7d\2\2\u01e1\u01e3"+
		"\n\t\2\2\u01e2\u01d3\3\2\2\2\u01e2\u01d5\3\2\2\2\u01e2\u01d7\3\2\2\2\u01e2"+
		"\u01d9\3\2\2\2\u01e2\u01db\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e2\u01df\3\2"+
		"\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5x\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\5w<\2\u01e8"+
		"\u01e9\b=\3\2\u01e9z\3\2\2\2\u01ea\u01fc\7$\2\2\u01eb\u01ec\7^\2\2\u01ec"+
		"\u01fb\7^\2\2\u01ed\u01ee\7^\2\2\u01ee\u01fb\7v\2\2\u01ef\u01f0\7^\2\2"+
		"\u01f0\u01fb\7$\2\2\u01f1\u01f2\7^\2\2\u01f2\u01fb\7p\2\2\u01f3\u01f4"+
		"\7^\2\2\u01f4\u01fb\7h\2\2\u01f5\u01f6\7^\2\2\u01f6\u01fb\7t\2\2\u01f7"+
		"\u01f8\7^\2\2\u01f8\u01fb\7d\2\2\u01f9\u01fb\n\t\2\2\u01fa\u01eb\3\2\2"+
		"\2\u01fa\u01ed\3\2\2\2\u01fa\u01ef\3\2\2\2\u01fa\u01f1\3\2\2\2\u01fa\u01f3"+
		"\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7^\2\2\u0200\u0201\n\t\2\2\u0201"+
		"|\3\2\2\2\u0202\u0203\5{>\2\u0203\u0204\b?\4\2\u0204~\3\2\2\2\u0205\u0217"+
		"\7$\2\2\u0206\u0207\7^\2\2\u0207\u0216\7^\2\2\u0208\u0209\7^\2\2\u0209"+
		"\u0216\7v\2\2\u020a\u020b\7^\2\2\u020b\u0216\7$\2\2\u020c\u020d\7^\2\2"+
		"\u020d\u0216\7p\2\2\u020e\u020f\7^\2\2\u020f\u0216\7h\2\2\u0210\u0211"+
		"\7^\2\2\u0211\u0216\7t\2\2\u0212\u0213\7^\2\2\u0213\u0216\7d\2\2\u0214"+
		"\u0216\n\t\2\2\u0215\u0206\3\2\2\2\u0215\u0208\3\2\2\2\u0215\u020a\3\2"+
		"\2\2\u0215\u020c\3\2\2\2\u0215\u020e\3\2\2\2\u0215\u0210\3\2\2\2\u0215"+
		"\u0212\3\2\2\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021b\7$\2\2\u021b\u0080\3\2\2\2\u021c\u021e\t\n\2\2\u021d\u021c\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\bA\2\2\u0222\u0082\3\2\2\2\u0223\u0224\n\13"+
		"\2\2\u0224\u0084\3\2\2\2\u0225\u0226\t\f\2\2\u0226\u0086\3\2\2\2\u0227"+
		"\u0228\13\2\2\2\u0228\u0229\bD\5\2\u0229\u0088\3\2\2\2\34\2\u008f\u0098"+
		"\u009c\u00aa\u0143\u0146\u0149\u014b\u018b\u01ab\u01b0\u01b6\u01bd\u01c0"+
		"\u01c4\u01c9\u01cb\u01d0\u01e2\u01e4\u01fa\u01fc\u0215\u0217\u021f\6\b"+
		"\2\2\3=\2\3?\3\3D\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}