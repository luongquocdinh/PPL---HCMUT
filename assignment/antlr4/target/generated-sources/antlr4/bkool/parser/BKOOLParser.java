// Generated from BKOOL.g4 by ANTLR 4.5.1

	package bkool.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BKOOLParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_classDecl = 1, RULE_listmember = 2, RULE_attribute = 3, 
		RULE_declare1 = 4, RULE_declare = 5, RULE_type = 6, RULE_type1 = 7, RULE_constDeclare = 8, 
		RULE_varDeclare = 9, RULE_listID = 10, RULE_methodDecl = 11, RULE_listparameter = 12, 
		RULE_listpara_member = 13, RULE_expression = 14, RULE_expression2 = 15, 
		RULE_expression1 = 16, RULE_fact = 17, RULE_list_expression = 18, RULE_stmt = 19, 
		RULE_block_stmt = 20, RULE_assign_stmt = 21, RULE_if_stmt = 22, RULE_while_stmt = 23, 
		RULE_break_stmt = 24, RULE_continue_stmt = 25, RULE_return_stmt = 26, 
		RULE_invocation_stmt = 27;
	public static final String[] ruleNames = {
		"program", "classDecl", "listmember", "attribute", "declare1", "declare", 
		"type", "type1", "constDeclare", "varDeclare", "listID", "methodDecl", 
		"listparameter", "listpara_member", "expression", "expression2", "expression1", 
		"fact", "list_expression", "stmt", "block_stmt", "assign_stmt", "if_stmt", 
		"while_stmt", "break_stmt", "continue_stmt", "return_stmt", "invocation_stmt"
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

	@Override
	public String getGrammarFileName() { return "BKOOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BKOOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				classDecl();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(BKOOLParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(BKOOLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BKOOLParser.ID, i);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(BKOOLParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(BKOOLParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode EXTENDS() { return getToken(BKOOLParser.EXTENDS, 0); }
		public List<ListmemberContext> listmember() {
			return getRuleContexts(ListmemberContext.class);
		}
		public ListmemberContext listmember(int i) {
			return getRuleContext(ListmemberContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CLASS);
			setState(62);
			match(ID);
			setState(65);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(63);
				match(EXTENDS);
				setState(64);
				match(ID);
				}
			}

			setState(67);
			match(LEFT_PARENTHESIS);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRING) | (1L << VOID) | (1L << FINAL) | (1L << STATIC) | (1L << ID))) != 0)) {
				{
				{
				setState(68);
				listmember();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListmemberContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public ListmemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listmember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterListmember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitListmember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitListmember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListmemberContext listmember() throws RecognitionException {
		ListmemberContext _localctx = new ListmemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listmember);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				methodDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public ListIDContext listID() {
			return getRuleContext(ListIDContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BKOOLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(BKOOLParser.SEMI_COLON, 0); }
		public TerminalNode STATIC() { return getToken(BKOOLParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(BKOOLParser.FINAL, 0); }
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public TerminalNode EQUAL_OP_2() { return getToken(BKOOLParser.EQUAL_OP_2, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(80);
					match(STATIC);
					}
				}

				setState(83);
				listID();
				setState(84);
				match(COLON);
				setState(85);
				type();
				setState(86);
				match(SEMI_COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(88);
					match(STATIC);
					}
				}

				setState(91);
				match(FINAL);
				setState(92);
				type();
				setState(93);
				match(ID);
				setState(94);
				match(EQUAL_OP_2);
				setState(95);
				expression();
				setState(96);
				match(SEMI_COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare1Context extends ParserRuleContext {
		public ConstDeclareContext constDeclare() {
			return getRuleContext(ConstDeclareContext.class,0);
		}
		public VarDeclareContext varDeclare() {
			return getRuleContext(VarDeclareContext.class,0);
		}
		public Declare1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterDeclare1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitDeclare1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitDeclare1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare1Context declare1() throws RecognitionException {
		Declare1Context _localctx = new Declare1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare1);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				constDeclare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				varDeclare();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareContext extends ParserRuleContext {
		public ConstDeclareContext constDeclare() {
			return getRuleContext(ConstDeclareContext.class,0);
		}
		public VarDeclareContext varDeclare() {
			return getRuleContext(VarDeclareContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare);
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				constDeclare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				varDeclare();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(BKOOLParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode INTEGER_LIT() { return getToken(BKOOLParser.INTEGER_LIT, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(BKOOLParser.RIGHT_SQUARE_BRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type1();
			setState(112);
			_la = _input.LA(1);
			if (_la==LEFT_SQUARE_BRACKET) {
				{
				setState(109);
				match(LEFT_SQUARE_BRACKET);
				setState(110);
				match(INTEGER_LIT);
				setState(111);
				match(RIGHT_SQUARE_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type1Context extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BKOOLParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(BKOOLParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(BKOOLParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(BKOOLParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public TerminalNode VOID() { return getToken(BKOOLParser.VOID, 0); }
		public Type1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitType1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitType1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type1Context type1() throws RecognitionException {
		Type1Context _localctx = new Type1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_type1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRING) | (1L << VOID) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclareContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(BKOOLParser.FINAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public TerminalNode EQUAL_OP_2() { return getToken(BKOOLParser.EQUAL_OP_2, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(BKOOLParser.SEMI_COLON, 0); }
		public TerminalNode STATIC() { return getToken(BKOOLParser.STATIC, 0); }
		public ConstDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterConstDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitConstDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitConstDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclareContext constDeclare() throws RecognitionException {
		ConstDeclareContext _localctx = new ConstDeclareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(116);
				match(STATIC);
				}
			}

			setState(119);
			match(FINAL);
			setState(120);
			type();
			setState(121);
			match(ID);
			setState(122);
			match(EQUAL_OP_2);
			setState(123);
			expression();
			setState(124);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclareContext extends ParserRuleContext {
		public ListIDContext listID() {
			return getRuleContext(ListIDContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BKOOLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(BKOOLParser.SEMI_COLON, 0); }
		public TerminalNode STATIC() { return getToken(BKOOLParser.STATIC, 0); }
		public VarDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterVarDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitVarDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitVarDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclareContext varDeclare() throws RecognitionException {
		VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(126);
				match(STATIC);
				}
			}

			setState(129);
			listID();
			setState(130);
			match(COLON);
			setState(131);
			type();
			setState(132);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIDContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BKOOLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BKOOLParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BKOOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BKOOLParser.COMMA, i);
		}
		public ListIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterListID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitListID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitListID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListIDContext listID() throws RecognitionException {
		ListIDContext _localctx = new ListIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				match(ID);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(BKOOLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(BKOOLParser.RIGHT_BRACKET, 0); }
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(BKOOLParser.STATIC, 0); }
		public ListparameterContext listparameter() {
			return getRuleContext(ListparameterContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(142);
				type();
				}
				break;
			}
			setState(146);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(145);
				match(STATIC);
				}
			}

			setState(148);
			match(ID);
			setState(149);
			match(LEFT_BRACKET);
			setState(151);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(150);
				listparameter();
				}
			}

			setState(153);
			match(RIGHT_BRACKET);
			setState(154);
			block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListparameterContext extends ParserRuleContext {
		public List<Listpara_memberContext> listpara_member() {
			return getRuleContexts(Listpara_memberContext.class);
		}
		public Listpara_memberContext listpara_member(int i) {
			return getRuleContext(Listpara_memberContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(BKOOLParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(BKOOLParser.SEMI_COLON, i);
		}
		public ListparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterListparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitListparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitListparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparameterContext listparameter() throws RecognitionException {
		ListparameterContext _localctx = new ListparameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			listpara_member();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(157);
				match(SEMI_COLON);
				setState(158);
				listpara_member();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Listpara_memberContext extends ParserRuleContext {
		public ListIDContext listID() {
			return getRuleContext(ListIDContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BKOOLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Listpara_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listpara_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterListpara_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitListpara_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitListpara_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listpara_memberContext listpara_member() throws RecognitionException {
		Listpara_memberContext _localctx = new Listpara_memberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listpara_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			listID();
			setState(165);
			match(COLON);
			setState(166);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Expression2Context> expression2() {
			return getRuleContexts(Expression2Context.class);
		}
		public Expression2Context expression2(int i) {
			return getRuleContext(Expression2Context.class,i);
		}
		public TerminalNode LESS_OP() { return getToken(BKOOLParser.LESS_OP, 0); }
		public TerminalNode GREATER_OP() { return getToken(BKOOLParser.GREATER_OP, 0); }
		public TerminalNode LESS_EQUAL_OP() { return getToken(BKOOLParser.LESS_EQUAL_OP, 0); }
		public TerminalNode GREATER_EQUAL_OP() { return getToken(BKOOLParser.GREATER_EQUAL_OP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				expression2();
				setState(169);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_OP) | (1L << GREATER_OP) | (1L << LESS_EQUAL_OP) | (1L << GREATER_EQUAL_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(170);
				expression2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				expression2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression2Context extends ParserRuleContext {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode EQUAL_OP() { return getToken(BKOOLParser.EQUAL_OP, 0); }
		public TerminalNode NOT_EQUAL_OP() { return getToken(BKOOLParser.NOT_EQUAL_OP, 0); }
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression2);
		int _la;
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				expression1(0);
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==NOT_EQUAL_OP || _la==EQUAL_OP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(177);
				expression1(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				expression1(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression1Context extends ParserRuleContext {
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
	 
		public Expression1Context() { }
		public void copyFrom(Expression1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayCellContext extends Expression1Context {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(BKOOLParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(BKOOLParser.RIGHT_SQUARE_BRACKET, 0); }
		public ArrayCellContext(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterArrayCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitArrayCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitArrayCell(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary2Context extends Expression1Context {
		public TerminalNode NOT_OP() { return getToken(BKOOLParser.NOT_OP, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Unary2Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterUnary2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitUnary2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitUnary2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary1Context extends Expression1Context {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode ADD_OP() { return getToken(BKOOLParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(BKOOLParser.SUB_OP, 0); }
		public Unary1Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterUnary1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitUnary1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitUnary1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExprContext extends Expression1Context {
		public TerminalNode NEW() { return getToken(BKOOLParser.NEW, 0); }
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public List_expressionContext list_expression() {
			return getRuleContext(List_expressionContext.class,0);
		}
		public NewExprContext(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccess1Context extends Expression1Context {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode DOT() { return getToken(BKOOLParser.DOT, 0); }
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public FieldAccess1Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterFieldAccess1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitFieldAccess1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitFieldAccess1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fact1Context extends Expression1Context {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public Fact1Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterFact1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitFact1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitFact1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary1Context extends Expression1Context {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode CONCAT_OP() { return getToken(BKOOLParser.CONCAT_OP, 0); }
		public Binary1Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterBinary1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitBinary1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitBinary1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary2Context extends Expression1Context {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode INT_DIV_OP() { return getToken(BKOOLParser.INT_DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(BKOOLParser.MOD_OP, 0); }
		public TerminalNode FLOAT_DIV_OP() { return getToken(BKOOLParser.FLOAT_DIV_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(BKOOLParser.MUL_OP, 0); }
		public Binary2Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterBinary2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitBinary2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitBinary2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary3Context extends Expression1Context {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode ADD_OP() { return getToken(BKOOLParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(BKOOLParser.SUB_OP, 0); }
		public Binary3Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterBinary3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitBinary3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitBinary3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpr1Context extends Expression1Context {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode DOT() { return getToken(BKOOLParser.DOT, 0); }
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public List_expressionContext list_expression() {
			return getRuleContext(List_expressionContext.class,0);
		}
		public CallExpr1Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterCallExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitCallExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitCallExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary4Context extends Expression1Context {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode AND_OP() { return getToken(BKOOLParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(BKOOLParser.OR_OP, 0); }
		public Binary4Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterBinary4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitBinary4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitBinary4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		return expression1(0);
	}

	private Expression1Context expression1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression1Context _localctx = new Expression1Context(_ctx, _parentState);
		Expression1Context _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch (_input.LA(1)) {
			case ADD_OP:
			case SUB_OP:
				{
				_localctx = new Unary1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				_la = _input.LA(1);
				if ( !(_la==ADD_OP || _la==SUB_OP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(184);
				expression1(7);
				}
				break;
			case NOT_OP:
				{
				_localctx = new Unary2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(NOT_OP);
				setState(186);
				expression1(6);
				}
				break;
			case NEW:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(NEW);
				setState(188);
				match(ID);
				setState(189);
				match(LEFT_BRACKET);
				setState(191);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << SELF) | (1L << ID) | (1L << ADD_OP) | (1L << SUB_OP) | (1L << NOT_OP) | (1L << LEFT_BRACKET) | (1L << FLOAT_LIT) | (1L << INTEGER_LIT) | (1L << STRING_LIT))) != 0)) {
					{
					setState(190);
					list_expression();
					}
				}

				setState(193);
				match(RIGHT_BRACKET);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case SELF:
			case ID:
			case LEFT_BRACKET:
			case FLOAT_LIT:
			case INTEGER_LIT:
			case STRING_LIT:
				{
				_localctx = new Fact1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				fact();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Binary1Context(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						match(CONCAT_OP);
						setState(199);
						expression1(6);
						}
						break;
					case 2:
						{
						_localctx = new Binary2Context(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL_OP) | (1L << FLOAT_DIV_OP) | (1L << INT_DIV_OP) | (1L << MOD_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(202);
						expression1(5);
						}
						break;
					case 3:
						{
						_localctx = new Binary3Context(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						_la = _input.LA(1);
						if ( !(_la==ADD_OP || _la==SUB_OP) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(205);
						expression1(4);
						}
						break;
					case 4:
						{
						_localctx = new Binary4Context(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						_la = _input.LA(1);
						if ( !(_la==OR_OP || _la==AND_OP) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(208);
						expression1(3);
						}
						break;
					case 5:
						{
						_localctx = new CallExpr1Context(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(209);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(210);
						match(DOT);
						setState(211);
						match(ID);
						{
						setState(212);
						match(LEFT_BRACKET);
						setState(214);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << SELF) | (1L << ID) | (1L << ADD_OP) | (1L << SUB_OP) | (1L << NOT_OP) | (1L << LEFT_BRACKET) | (1L << FLOAT_LIT) | (1L << INTEGER_LIT) | (1L << STRING_LIT))) != 0)) {
							{
							setState(213);
							list_expression();
							}
						}

						setState(216);
						match(RIGHT_BRACKET);
						}
						}
						break;
					case 6:
						{
						_localctx = new FieldAccess1Context(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(217);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(218);
						match(DOT);
						setState(219);
						match(ID);
						}
						break;
					case 7:
						{
						_localctx = new ArrayCellContext(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(220);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(221);
						match(LEFT_SQUARE_BRACKET);
						setState(222);
						expression1(0);
						setState(223);
						match(RIGHT_SQUARE_BRACKET);
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public TerminalNode FLOAT_LIT() { return getToken(BKOOLParser.FLOAT_LIT, 0); }
		public TerminalNode INTEGER_LIT() { return getToken(BKOOLParser.INTEGER_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(BKOOLParser.STRING_LIT, 0); }
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public TerminalNode SELF() { return getToken(BKOOLParser.SELF, 0); }
		public TerminalNode TRUE() { return getToken(BKOOLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BKOOLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(BKOOLParser.NULL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fact);
		try {
			setState(242);
			switch (_input.LA(1)) {
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(FLOAT_LIT);
				}
				break;
			case INTEGER_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(INTEGER_LIT);
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(STRING_LIT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(ID);
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(SELF);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(NULL);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 9);
				{
				setState(238);
				match(LEFT_BRACKET);
				setState(239);
				expression();
				setState(240);
				match(RIGHT_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BKOOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BKOOLParser.COMMA, i);
		}
		public List_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterList_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitList_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitList_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_expressionContext list_expression() throws RecognitionException {
		List_expressionContext _localctx = new List_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			expression();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				expression();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public Invocation_stmtContext invocation_stmt() {
			return getRuleContext(Invocation_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt);
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				break_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				continue_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				return_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				block_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				invocation_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_stmtContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(BKOOLParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(BKOOLParser.RIGHT_PARENTHESIS, 0); }
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitBlock_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitBlock_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LEFT_PARENTHESIS);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					declare();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << IF) | (1L << NEW) | (1L << WHILE) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << SELF) | (1L << ID) | (1L << ADD_OP) | (1L << SUB_OP) | (1L << NOT_OP) | (1L << LEFT_BRACKET) | (1L << LEFT_PARENTHESIS) | (1L << FLOAT_LIT) | (1L << INTEGER_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				{
				setState(269);
				stmt();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASS_OP() { return getToken(BKOOLParser.ASS_OP, 0); }
		public TerminalNode SEMI_COLON() { return getToken(BKOOLParser.SEMI_COLON, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expression();
			setState(278);
			match(ASS_OP);
			setState(279);
			expression();
			setState(280);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BKOOLParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BKOOLParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BKOOLParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(IF);
			setState(283);
			expression();
			setState(284);
			match(THEN);
			setState(285);
			stmt();
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(286);
				match(ELSE);
				setState(287);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BKOOLParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(BKOOLParser.DO, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(WHILE);
			setState(291);
			expression();
			setState(292);
			match(DO);
			setState(293);
			stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(BKOOLParser.BREAK, 0); }
		public TerminalNode SEMI_COLON() { return getToken(BKOOLParser.SEMI_COLON, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(BREAK);
			setState(296);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(BKOOLParser.CONTINUE, 0); }
		public TerminalNode SEMI_COLON() { return getToken(BKOOLParser.SEMI_COLON, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(CONTINUE);
			setState(299);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BKOOLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(BKOOLParser.SEMI_COLON, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(RETURN);
			setState(302);
			expression();
			setState(303);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Invocation_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(BKOOLParser.DOT, 0); }
		public TerminalNode ID() { return getToken(BKOOLParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(BKOOLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(BKOOLParser.RIGHT_BRACKET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(BKOOLParser.SEMI_COLON, 0); }
		public List_expressionContext list_expression() {
			return getRuleContext(List_expressionContext.class,0);
		}
		public Invocation_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).enterInvocation_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BKOOLListener ) ((BKOOLListener)listener).exitInvocation_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BKOOLVisitor ) return ((BKOOLVisitor<? extends T>)visitor).visitInvocation_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invocation_stmtContext invocation_stmt() throws RecognitionException {
		Invocation_stmtContext _localctx = new Invocation_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_invocation_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			expression();
			setState(306);
			match(DOT);
			setState(307);
			match(ID);
			setState(308);
			match(LEFT_BRACKET);
			setState(310);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << SELF) | (1L << ID) | (1L << ADD_OP) | (1L << SUB_OP) | (1L << NOT_OP) | (1L << LEFT_BRACKET) | (1L << FLOAT_LIT) | (1L << INTEGER_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(309);
				list_expression();
				}
			}

			setState(312);
			match(RIGHT_BRACKET);
			setState(313);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression1_sempred((Expression1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression1_sempred(Expression1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\3\3"+
		"\3\3\3\3\3\5\3D\n\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\4\3\4\5"+
		"\4Q\n\4\3\5\5\5T\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5e\n\5\3\6\3\6\5\6i\n\6\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3"+
		"\b\5\bs\n\b\3\t\3\t\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13"+
		"\u0082\n\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16"+
		"\f\u008f\13\f\3\r\5\r\u0092\n\r\3\r\5\r\u0095\n\r\3\r\3\r\3\r\5\r\u009a"+
		"\n\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00b0\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00b7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00c2\n\22\3\22\3\22\5\22\u00c6\n\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d9"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e4\n\22\f\22"+
		"\16\22\u00e7\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00f5\n\23\3\24\3\24\3\24\7\24\u00fa\n\24\f\24\16\24\u00fd"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0107\n\25\3\26\3"+
		"\26\7\26\u010b\n\26\f\26\16\26\u010e\13\26\3\26\7\26\u0111\n\26\f\26\16"+
		"\26\u0114\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0123\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0139\n\35"+
		"\3\35\3\35\3\35\3\35\2\3\"\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668\2\b\b\2\5\5\f\f\16\16\20\20\26\26\34\34\3\2\'*\3"+
		"\2$%\3\2\36\37\3\2 #\3\2+,\u0154\2;\3\2\2\2\4?\3\2\2\2\6P\3\2\2\2\bd\3"+
		"\2\2\2\nh\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20t\3\2\2\2\22w\3\2\2\2\24\u0081"+
		"\3\2\2\2\26\u0088\3\2\2\2\30\u0091\3\2\2\2\32\u009e\3\2\2\2\34\u00a6\3"+
		"\2\2\2\36\u00af\3\2\2\2 \u00b6\3\2\2\2\"\u00c5\3\2\2\2$\u00f4\3\2\2\2"+
		"&\u00f6\3\2\2\2(\u0106\3\2\2\2*\u0108\3\2\2\2,\u0117\3\2\2\2.\u011c\3"+
		"\2\2\2\60\u0124\3\2\2\2\62\u0129\3\2\2\2\64\u012c\3\2\2\2\66\u012f\3\2"+
		"\2\28\u0133\3\2\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">\3\3\2\2\2?@\7\7\2\2@C\7\34\2\2AB\7\13\2\2BD\7\34\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DE\3\2\2\2EI\78\2\2FH\5\6\4\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JL\3\2\2\2KI\3\2\2\2LM\79\2\2M\5\3\2\2\2NQ\5\b\5\2OQ\5\30\r\2PN\3"+
		"\2\2\2PO\3\2\2\2Q\7\3\2\2\2RT\7\32\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2U"+
		"V\5\26\f\2VW\7\66\2\2WX\5\16\b\2XY\7\67\2\2Ye\3\2\2\2Z\\\7\32\2\2[Z\3"+
		"\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\31\2\2^_\5\16\b\2_`\7\34\2\2`a\7&\2\2"+
		"ab\5\36\20\2bc\7\67\2\2ce\3\2\2\2dS\3\2\2\2d[\3\2\2\2e\t\3\2\2\2fi\5\22"+
		"\n\2gi\5\24\13\2hf\3\2\2\2hg\3\2\2\2i\13\3\2\2\2jm\5\22\n\2km\5\24\13"+
		"\2lj\3\2\2\2lk\3\2\2\2m\r\3\2\2\2nr\5\20\t\2op\7\60\2\2pq\7<\2\2qs\7\61"+
		"\2\2ro\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tu\t\2\2\2u\21\3\2\2\2vx\7\32\2\2"+
		"wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\31\2\2z{\5\16\b\2{|\7\34\2\2|}\7&\2"+
		"\2}~\5\36\20\2~\177\7\67\2\2\177\23\3\2\2\2\u0080\u0082\7\32\2\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5\26"+
		"\f\2\u0084\u0085\7\66\2\2\u0085\u0086\5\16\b\2\u0086\u0087\7\67\2\2\u0087"+
		"\25\3\2\2\2\u0088\u008d\7\34\2\2\u0089\u008a\7\64\2\2\u008a\u008c\7\34"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\5\16\b"+
		"\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095"+
		"\7\32\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0097\7\34\2\2\u0097\u0099\7\62\2\2\u0098\u009a\5\32\16\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\63"+
		"\2\2\u009c\u009d\5*\26\2\u009d\31\3\2\2\2\u009e\u00a3\5\34\17\2\u009f"+
		"\u00a0\7\67\2\2\u00a0\u00a2\5\34\17\2\u00a1\u009f\3\2\2\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\7\66\2\2\u00a8\u00a9\5"+
		"\16\b\2\u00a9\35\3\2\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\t\3\2\2\u00ac"+
		"\u00ad\5 \21\2\u00ad\u00b0\3\2\2\2\u00ae\u00b0\5 \21\2\u00af\u00aa\3\2"+
		"\2\2\u00af\u00ae\3\2\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00b3"+
		"\t\4\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\5\"\22\2"+
		"\u00b6\u00b1\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b9\b"+
		"\22\1\2\u00b9\u00ba\t\5\2\2\u00ba\u00c6\5\"\22\t\u00bb\u00bc\7-\2\2\u00bc"+
		"\u00c6\5\"\22\b\u00bd\u00be\7\17\2\2\u00be\u00bf\7\34\2\2\u00bf\u00c1"+
		"\7\62\2\2\u00c0\u00c2\5&\24\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c3\3\2\2\2\u00c3\u00c6\7\63\2\2\u00c4\u00c6\5$\23\2\u00c5\u00b8"+
		"\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00e5\3\2\2\2\u00c7\u00c8\f\7\2\2\u00c8\u00c9\7.\2\2\u00c9\u00e4\5\""+
		"\22\b\u00ca\u00cb\f\6\2\2\u00cb\u00cc\t\6\2\2\u00cc\u00e4\5\"\22\7\u00cd"+
		"\u00ce\f\5\2\2\u00ce\u00cf\t\5\2\2\u00cf\u00e4\5\"\22\6\u00d0\u00d1\f"+
		"\4\2\2\u00d1\u00d2\t\7\2\2\u00d2\u00e4\5\"\22\5\u00d3\u00d4\f\f\2\2\u00d4"+
		"\u00d5\7\65\2\2\u00d5\u00d6\7\34\2\2\u00d6\u00d8\7\62\2\2\u00d7\u00d9"+
		"\5&\24\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00e4\7\63\2\2\u00db\u00dc\f\13\2\2\u00dc\u00dd\7\65\2\2\u00dd\u00e4"+
		"\7\34\2\2\u00de\u00df\f\n\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1\5\"\22"+
		"\2\u00e1\u00e2\7\61\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00c7\3\2\2\2\u00e3"+
		"\u00ca\3\2\2\2\u00e3\u00cd\3\2\2\2\u00e3\u00d0\3\2\2\2\u00e3\u00d3\3\2"+
		"\2\2\u00e3\u00db\3\2\2\2\u00e3\u00de\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6#\3\2\2\2\u00e7\u00e5\3\2\2\2"+
		"\u00e8\u00f5\7;\2\2\u00e9\u00f5\7<\2\2\u00ea\u00f5\7?\2\2\u00eb\u00f5"+
		"\7\34\2\2\u00ec\u00f5\7\30\2\2\u00ed\u00f5\7\24\2\2\u00ee\u00f5\7\25\2"+
		"\2\u00ef\u00f5\7\27\2\2\u00f0\u00f1\7\62\2\2\u00f1\u00f2\5\36\20\2\u00f2"+
		"\u00f3\7\63\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00e8\3\2\2\2\u00f4\u00e9\3"+
		"\2\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4"+
		"\u00ed\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2"+
		"\2\2\u00f5%\3\2\2\2\u00f6\u00fb\5\36\20\2\u00f7\u00f8\7\64\2\2\u00f8\u00fa"+
		"\5\36\20\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\'\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0107\5"+
		",\27\2\u00ff\u0107\5.\30\2\u0100\u0107\5\60\31\2\u0101\u0107\5\62\32\2"+
		"\u0102\u0107\5\64\33\2\u0103\u0107\5\66\34\2\u0104\u0107\5*\26\2\u0105"+
		"\u0107\58\35\2\u0106\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0100\3\2"+
		"\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107)\3\2\2\2\u0108\u010c\78\2\2\u0109"+
		"\u010b\5\f\7\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u0112\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0111\5(\25\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\79\2\2\u0116+\3\2\2\2\u0117\u0118\5\36\20\2\u0118\u0119\7\35\2"+
		"\2\u0119\u011a\5\36\20\2\u011a\u011b\7\67\2\2\u011b-\3\2\2\2\u011c\u011d"+
		"\7\r\2\2\u011d\u011e\5\36\20\2\u011e\u011f\7\21\2\2\u011f\u0122\5(\25"+
		"\2\u0120\u0121\7\n\2\2\u0121\u0123\5(\25\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123/\3\2\2\2\u0124\u0125\7\22\2\2\u0125\u0126\5\36\20\2\u0126"+
		"\u0127\7\t\2\2\u0127\u0128\5(\25\2\u0128\61\3\2\2\2\u0129\u012a\7\6\2"+
		"\2\u012a\u012b\7\67\2\2\u012b\63\3\2\2\2\u012c\u012d\7\b\2\2\u012d\u012e"+
		"\7\67\2\2\u012e\65\3\2\2\2\u012f\u0130\7\23\2\2\u0130\u0131\5\36\20\2"+
		"\u0131\u0132\7\67\2\2\u0132\67\3\2\2\2\u0133\u0134\5\36\20\2\u0134\u0135"+
		"\7\65\2\2\u0135\u0136\7\34\2\2\u0136\u0138\7\62\2\2\u0137\u0139\5&\24"+
		"\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\7\63\2\2\u013b\u013c\7\67\2\2\u013c9\3\2\2\2!=CIPS[dhlrw\u0081\u008d"+
		"\u0091\u0094\u0099\u00a3\u00af\u00b6\u00c1\u00c5\u00d8\u00e3\u00e5\u00f4"+
		"\u00fb\u0106\u010c\u0112\u0122\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}