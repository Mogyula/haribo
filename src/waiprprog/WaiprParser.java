// $ANTLR 3.5.2 Waipr.g 2014-11-04 01:36:08

	package waiprprog;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class WaiprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ESC_SEQ", "HEX_DIGIT", "ID", 
		"IE", "NUMBER", "OCTAL_ESC", "TEST", "TEXT", "UNICODE_ESC", "WS", "'!'", 
		"'('", "')'", "','", "'.'", "'Behaviors'", "'Behaviours'", "'Handlers'", 
		"'Machine'", "'Statuses'", "'Triggers'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int ESC_SEQ=4;
	public static final int HEX_DIGIT=5;
	public static final int ID=6;
	public static final int IE=7;
	public static final int NUMBER=8;
	public static final int OCTAL_ESC=9;
	public static final int TEST=10;
	public static final int TEXT=11;
	public static final int UNICODE_ESC=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public WaiprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public WaiprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return WaiprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Waipr.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// Waipr.g:16:1: prog : ( machine )+ ;
	public final WaiprParser.prog_return prog() throws RecognitionException {
		WaiprParser.prog_return retval = new WaiprParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope machine1 =null;


		try {
			// Waipr.g:16:5: ( ( machine )+ )
			// Waipr.g:16:9: ( machine )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// Waipr.g:16:9: ( machine )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==22) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Waipr.g:16:9: machine
					{
					pushFollow(FOLLOW_machine_in_prog43);
					machine1=machine();
					state._fsp--;

					adaptor.addChild(root_0, machine1.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class machine_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "machine"
	// Waipr.g:18:1: machine : 'Machine' ID '{' ( block )* '}' -> ^( ID ( block )* ) ;
	public final WaiprParser.machine_return machine() throws RecognitionException {
		WaiprParser.machine_return retval = new WaiprParser.machine_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal2=null;
		Token ID3=null;
		Token char_literal4=null;
		Token char_literal6=null;
		ParserRuleReturnScope block5 =null;

		CommonTree string_literal2_tree=null;
		CommonTree ID3_tree=null;
		CommonTree char_literal4_tree=null;
		CommonTree char_literal6_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// Waipr.g:18:9: ( 'Machine' ID '{' ( block )* '}' -> ^( ID ( block )* ) )
			// Waipr.g:18:11: 'Machine' ID '{' ( block )* '}'
			{
			string_literal2=(Token)match(input,22,FOLLOW_22_in_machine52);  
			stream_22.add(string_literal2);

			ID3=(Token)match(input,ID,FOLLOW_ID_in_machine54);  
			stream_ID.add(ID3);

			char_literal4=(Token)match(input,25,FOLLOW_25_in_machine56);  
			stream_25.add(char_literal4);

			// Waipr.g:18:28: ( block )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 19 && LA2_0 <= 21)||(LA2_0 >= 23 && LA2_0 <= 24)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Waipr.g:18:28: block
					{
					pushFollow(FOLLOW_block_in_machine58);
					block5=block();
					state._fsp--;

					stream_block.add(block5.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			char_literal6=(Token)match(input,26,FOLLOW_26_in_machine61);  
			stream_26.add(char_literal6);

			// AST REWRITE
			// elements: ID, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 18:39: -> ^( ID ( block )* )
			{
				// Waipr.g:18:42: ^( ID ( block )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
				// Waipr.g:18:47: ( block )*
				while ( stream_block.hasNext() ) {
					adaptor.addChild(root_1, stream_block.nextTree());
				}
				stream_block.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "machine"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Waipr.g:20:1: block : ( 'Statuses' '{' ( statdefs )* '}' -> ^( 'Statuses' ( statdefs )* ) | 'Triggers' '{' ( triggers )* '}' -> ^( 'Triggers' ( triggers )* ) | ( 'Behaviors' | 'Behaviours' ) '{' ( behaviordef )* '}' -> ^( 'Behaviors' ( behaviordef )* ) | 'Handlers' '{' ( handler )* '}' -> ^( 'Handlers' ( handler )* ) );
	public final WaiprParser.block_return block() throws RecognitionException {
		WaiprParser.block_return retval = new WaiprParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal7=null;
		Token char_literal8=null;
		Token char_literal10=null;
		Token string_literal11=null;
		Token char_literal12=null;
		Token char_literal14=null;
		Token string_literal15=null;
		Token string_literal16=null;
		Token char_literal17=null;
		Token char_literal19=null;
		Token string_literal20=null;
		Token char_literal21=null;
		Token char_literal23=null;
		ParserRuleReturnScope statdefs9 =null;
		ParserRuleReturnScope triggers13 =null;
		ParserRuleReturnScope behaviordef18 =null;
		ParserRuleReturnScope handler22 =null;

		CommonTree string_literal7_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree char_literal10_tree=null;
		CommonTree string_literal11_tree=null;
		CommonTree char_literal12_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree string_literal15_tree=null;
		CommonTree string_literal16_tree=null;
		CommonTree char_literal17_tree=null;
		CommonTree char_literal19_tree=null;
		CommonTree string_literal20_tree=null;
		CommonTree char_literal21_tree=null;
		CommonTree char_literal23_tree=null;
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_behaviordef=new RewriteRuleSubtreeStream(adaptor,"rule behaviordef");
		RewriteRuleSubtreeStream stream_handler=new RewriteRuleSubtreeStream(adaptor,"rule handler");
		RewriteRuleSubtreeStream stream_statdefs=new RewriteRuleSubtreeStream(adaptor,"rule statdefs");
		RewriteRuleSubtreeStream stream_triggers=new RewriteRuleSubtreeStream(adaptor,"rule triggers");

		try {
			// Waipr.g:20:7: ( 'Statuses' '{' ( statdefs )* '}' -> ^( 'Statuses' ( statdefs )* ) | 'Triggers' '{' ( triggers )* '}' -> ^( 'Triggers' ( triggers )* ) | ( 'Behaviors' | 'Behaviours' ) '{' ( behaviordef )* '}' -> ^( 'Behaviors' ( behaviordef )* ) | 'Handlers' '{' ( handler )* '}' -> ^( 'Handlers' ( handler )* ) )
			int alt8=4;
			switch ( input.LA(1) ) {
			case 23:
				{
				alt8=1;
				}
				break;
			case 24:
				{
				alt8=2;
				}
				break;
			case 19:
			case 20:
				{
				alt8=3;
				}
				break;
			case 21:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Waipr.g:20:9: 'Statuses' '{' ( statdefs )* '}'
					{
					string_literal7=(Token)match(input,23,FOLLOW_23_in_block78);  
					stream_23.add(string_literal7);

					char_literal8=(Token)match(input,25,FOLLOW_25_in_block80);  
					stream_25.add(char_literal8);

					// Waipr.g:20:24: ( statdefs )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==ID) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Waipr.g:20:24: statdefs
							{
							pushFollow(FOLLOW_statdefs_in_block82);
							statdefs9=statdefs();
							state._fsp--;

							stream_statdefs.add(statdefs9.getTree());
							}
							break;

						default :
							break loop3;
						}
					}

					char_literal10=(Token)match(input,26,FOLLOW_26_in_block86);  
					stream_26.add(char_literal10);

					// AST REWRITE
					// elements: statdefs, 23
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 20:39: -> ^( 'Statuses' ( statdefs )* )
					{
						// Waipr.g:20:42: ^( 'Statuses' ( statdefs )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_23.nextNode(), root_1);
						// Waipr.g:20:55: ( statdefs )*
						while ( stream_statdefs.hasNext() ) {
							adaptor.addChild(root_1, stream_statdefs.nextTree());
						}
						stream_statdefs.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Waipr.g:21:4: 'Triggers' '{' ( triggers )* '}'
					{
					string_literal11=(Token)match(input,24,FOLLOW_24_in_block100);  
					stream_24.add(string_literal11);

					char_literal12=(Token)match(input,25,FOLLOW_25_in_block102);  
					stream_25.add(char_literal12);

					// Waipr.g:21:19: ( triggers )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Waipr.g:21:19: triggers
							{
							pushFollow(FOLLOW_triggers_in_block104);
							triggers13=triggers();
							state._fsp--;

							stream_triggers.add(triggers13.getTree());
							}
							break;

						default :
							break loop4;
						}
					}

					char_literal14=(Token)match(input,26,FOLLOW_26_in_block107);  
					stream_26.add(char_literal14);

					// AST REWRITE
					// elements: 24, triggers
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 21:33: -> ^( 'Triggers' ( triggers )* )
					{
						// Waipr.g:21:36: ^( 'Triggers' ( triggers )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_24.nextNode(), root_1);
						// Waipr.g:21:49: ( triggers )*
						while ( stream_triggers.hasNext() ) {
							adaptor.addChild(root_1, stream_triggers.nextTree());
						}
						stream_triggers.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Waipr.g:22:4: ( 'Behaviors' | 'Behaviours' ) '{' ( behaviordef )* '}'
					{
					// Waipr.g:22:4: ( 'Behaviors' | 'Behaviours' )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==19) ) {
						alt5=1;
					}
					else if ( (LA5_0==20) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// Waipr.g:22:5: 'Behaviors'
							{
							string_literal15=(Token)match(input,19,FOLLOW_19_in_block122);  
							stream_19.add(string_literal15);

							}
							break;
						case 2 :
							// Waipr.g:22:19: 'Behaviours'
							{
							string_literal16=(Token)match(input,20,FOLLOW_20_in_block126);  
							stream_20.add(string_literal16);

							}
							break;

					}

					char_literal17=(Token)match(input,25,FOLLOW_25_in_block129);  
					stream_25.add(char_literal17);

					// Waipr.g:22:37: ( behaviordef )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// Waipr.g:22:37: behaviordef
							{
							pushFollow(FOLLOW_behaviordef_in_block131);
							behaviordef18=behaviordef();
							state._fsp--;

							stream_behaviordef.add(behaviordef18.getTree());
							}
							break;

						default :
							break loop6;
						}
					}

					char_literal19=(Token)match(input,26,FOLLOW_26_in_block134);  
					stream_26.add(char_literal19);

					// AST REWRITE
					// elements: behaviordef, 19
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 22:54: -> ^( 'Behaviors' ( behaviordef )* )
					{
						// Waipr.g:22:57: ^( 'Behaviors' ( behaviordef )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_19.nextNode(), root_1);
						// Waipr.g:22:71: ( behaviordef )*
						while ( stream_behaviordef.hasNext() ) {
							adaptor.addChild(root_1, stream_behaviordef.nextTree());
						}
						stream_behaviordef.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Waipr.g:23:4: 'Handlers' '{' ( handler )* '}'
					{
					string_literal20=(Token)match(input,21,FOLLOW_21_in_block149);  
					stream_21.add(string_literal20);

					char_literal21=(Token)match(input,25,FOLLOW_25_in_block151);  
					stream_25.add(char_literal21);

					// Waipr.g:23:19: ( handler )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ID) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// Waipr.g:23:19: handler
							{
							pushFollow(FOLLOW_handler_in_block153);
							handler22=handler();
							state._fsp--;

							stream_handler.add(handler22.getTree());
							}
							break;

						default :
							break loop7;
						}
					}

					char_literal23=(Token)match(input,26,FOLLOW_26_in_block156);  
					stream_26.add(char_literal23);

					// AST REWRITE
					// elements: handler, 21
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 23:32: -> ^( 'Handlers' ( handler )* )
					{
						// Waipr.g:23:35: ^( 'Handlers' ( handler )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_21.nextNode(), root_1);
						// Waipr.g:23:48: ( handler )*
						while ( stream_handler.hasNext() ) {
							adaptor.addChild(root_1, stream_handler.nextTree());
						}
						stream_handler.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class handler_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "handler"
	// Waipr.g:26:1: handler : ID '(' triggersource ')' '{' ( statement )* '}' -> ^( ID triggersource ( statement )* ) ;
	public final WaiprParser.handler_return handler() throws RecognitionException {
		WaiprParser.handler_return retval = new WaiprParser.handler_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID24=null;
		Token char_literal25=null;
		Token char_literal27=null;
		Token char_literal28=null;
		Token char_literal30=null;
		ParserRuleReturnScope triggersource26 =null;
		ParserRuleReturnScope statement29 =null;

		CommonTree ID24_tree=null;
		CommonTree char_literal25_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree char_literal28_tree=null;
		CommonTree char_literal30_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_triggersource=new RewriteRuleSubtreeStream(adaptor,"rule triggersource");

		try {
			// Waipr.g:26:9: ( ID '(' triggersource ')' '{' ( statement )* '}' -> ^( ID triggersource ( statement )* ) )
			// Waipr.g:26:11: ID '(' triggersource ')' '{' ( statement )* '}'
			{
			ID24=(Token)match(input,ID,FOLLOW_ID_in_handler175);  
			stream_ID.add(ID24);

			char_literal25=(Token)match(input,15,FOLLOW_15_in_handler177);  
			stream_15.add(char_literal25);

			pushFollow(FOLLOW_triggersource_in_handler179);
			triggersource26=triggersource();
			state._fsp--;

			stream_triggersource.add(triggersource26.getTree());
			char_literal27=(Token)match(input,16,FOLLOW_16_in_handler181);  
			stream_16.add(char_literal27);

			char_literal28=(Token)match(input,25,FOLLOW_25_in_handler183);  
			stream_25.add(char_literal28);

			// Waipr.g:26:40: ( statement )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==ID) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Waipr.g:26:40: statement
					{
					pushFollow(FOLLOW_statement_in_handler185);
					statement29=statement();
					state._fsp--;

					stream_statement.add(statement29.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			char_literal30=(Token)match(input,26,FOLLOW_26_in_handler188);  
			stream_26.add(char_literal30);

			// AST REWRITE
			// elements: ID, triggersource, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 26:55: -> ^( ID triggersource ( statement )* )
			{
				// Waipr.g:26:58: ^( ID triggersource ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
				adaptor.addChild(root_1, stream_triggersource.nextTree());
				// Waipr.g:26:77: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "handler"


	public static class triggersource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "triggersource"
	// Waipr.g:29:1: triggersource : sender '.' trigger -> ^( sender trigger ) ;
	public final WaiprParser.triggersource_return triggersource() throws RecognitionException {
		WaiprParser.triggersource_return retval = new WaiprParser.triggersource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal32=null;
		ParserRuleReturnScope sender31 =null;
		ParserRuleReturnScope trigger33 =null;

		CommonTree char_literal32_tree=null;
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleSubtreeStream stream_sender=new RewriteRuleSubtreeStream(adaptor,"rule sender");
		RewriteRuleSubtreeStream stream_trigger=new RewriteRuleSubtreeStream(adaptor,"rule trigger");

		try {
			// Waipr.g:30:2: ( sender '.' trigger -> ^( sender trigger ) )
			// Waipr.g:30:4: sender '.' trigger
			{
			pushFollow(FOLLOW_sender_in_triggersource209);
			sender31=sender();
			state._fsp--;

			stream_sender.add(sender31.getTree());
			char_literal32=(Token)match(input,18,FOLLOW_18_in_triggersource211);  
			stream_18.add(char_literal32);

			pushFollow(FOLLOW_trigger_in_triggersource213);
			trigger33=trigger();
			state._fsp--;

			stream_trigger.add(trigger33.getTree());
			// AST REWRITE
			// elements: trigger, sender
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 30:23: -> ^( sender trigger )
			{
				// Waipr.g:30:26: ^( sender trigger )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_sender.nextNode(), root_1);
				adaptor.addChild(root_1, stream_trigger.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggersource"


	public static class sender_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sender"
	// Waipr.g:32:1: sender : ID ;
	public final WaiprParser.sender_return sender() throws RecognitionException {
		WaiprParser.sender_return retval = new WaiprParser.sender_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID34=null;

		CommonTree ID34_tree=null;

		try {
			// Waipr.g:32:8: ( ID )
			// Waipr.g:32:10: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			ID34=(Token)match(input,ID,FOLLOW_ID_in_sender230); 
			ID34_tree = (CommonTree)adaptor.create(ID34);
			adaptor.addChild(root_0, ID34_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sender"


	public static class trigger_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "trigger"
	// Waipr.g:34:1: trigger : sh= ID -> TEST[$sh] ;
	public final WaiprParser.trigger_return trigger() throws RecognitionException {
		WaiprParser.trigger_return retval = new WaiprParser.trigger_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token sh=null;

		CommonTree sh_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// Waipr.g:34:9: (sh= ID -> TEST[$sh] )
			// Waipr.g:34:11: sh= ID
			{
			sh=(Token)match(input,ID,FOLLOW_ID_in_trigger241);  
			stream_ID.add(sh);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 34:17: -> TEST[$sh]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(TEST, sh));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger"


	public static class statdefs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statdefs"
	// Waipr.g:36:1: statdefs : statdef ( ',' statdef )* ';' -> ( statdef )* ;
	public final WaiprParser.statdefs_return statdefs() throws RecognitionException {
		WaiprParser.statdefs_return retval = new WaiprParser.statdefs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal36=null;
		Token char_literal38=null;
		ParserRuleReturnScope statdef35 =null;
		ParserRuleReturnScope statdef37 =null;

		CommonTree char_literal36_tree=null;
		CommonTree char_literal38_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_IE=new RewriteRuleTokenStream(adaptor,"token IE");
		RewriteRuleSubtreeStream stream_statdef=new RewriteRuleSubtreeStream(adaptor,"rule statdef");

		try {
			// Waipr.g:36:9: ( statdef ( ',' statdef )* ';' -> ( statdef )* )
			// Waipr.g:36:11: statdef ( ',' statdef )* ';'
			{
			pushFollow(FOLLOW_statdef_in_statdefs253);
			statdef35=statdef();
			state._fsp--;

			stream_statdef.add(statdef35.getTree());
			// Waipr.g:36:19: ( ',' statdef )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==17) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Waipr.g:36:20: ',' statdef
					{
					char_literal36=(Token)match(input,17,FOLLOW_17_in_statdefs256);  
					stream_17.add(char_literal36);

					pushFollow(FOLLOW_statdef_in_statdefs258);
					statdef37=statdef();
					state._fsp--;

					stream_statdef.add(statdef37.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			char_literal38=(Token)match(input,IE,FOLLOW_IE_in_statdefs262);  
			stream_IE.add(char_literal38);

			// AST REWRITE
			// elements: statdef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 36:38: -> ( statdef )*
			{
				// Waipr.g:36:41: ( statdef )*
				while ( stream_statdef.hasNext() ) {
					adaptor.addChild(root_0, stream_statdef.nextTree());
				}
				stream_statdef.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statdefs"


	public static class triggers_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "triggers"
	// Waipr.g:38:1: triggers : trigger ( ',' trigger )* ';' -> ( trigger )* ;
	public final WaiprParser.triggers_return triggers() throws RecognitionException {
		WaiprParser.triggers_return retval = new WaiprParser.triggers_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal40=null;
		Token char_literal42=null;
		ParserRuleReturnScope trigger39 =null;
		ParserRuleReturnScope trigger41 =null;

		CommonTree char_literal40_tree=null;
		CommonTree char_literal42_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_IE=new RewriteRuleTokenStream(adaptor,"token IE");
		RewriteRuleSubtreeStream stream_trigger=new RewriteRuleSubtreeStream(adaptor,"rule trigger");

		try {
			// Waipr.g:38:9: ( trigger ( ',' trigger )* ';' -> ( trigger )* )
			// Waipr.g:38:11: trigger ( ',' trigger )* ';'
			{
			pushFollow(FOLLOW_trigger_in_triggers274);
			trigger39=trigger();
			state._fsp--;

			stream_trigger.add(trigger39.getTree());
			// Waipr.g:38:19: ( ',' trigger )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==17) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Waipr.g:38:20: ',' trigger
					{
					char_literal40=(Token)match(input,17,FOLLOW_17_in_triggers277);  
					stream_17.add(char_literal40);

					pushFollow(FOLLOW_trigger_in_triggers279);
					trigger41=trigger();
					state._fsp--;

					stream_trigger.add(trigger41.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			char_literal42=(Token)match(input,IE,FOLLOW_IE_in_triggers283);  
			stream_IE.add(char_literal42);

			// AST REWRITE
			// elements: trigger
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 38:38: -> ( trigger )*
			{
				// Waipr.g:38:41: ( trigger )*
				while ( stream_trigger.hasNext() ) {
					adaptor.addChild(root_0, stream_trigger.nextTree());
				}
				stream_trigger.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggers"


	public static class statdef_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statdef"
	// Waipr.g:40:1: statdef : ID ;
	public final WaiprParser.statdef_return statdef() throws RecognitionException {
		WaiprParser.statdef_return retval = new WaiprParser.statdef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID43=null;

		CommonTree ID43_tree=null;

		try {
			// Waipr.g:40:9: ( ID )
			// Waipr.g:40:11: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			ID43=(Token)match(input,ID,FOLLOW_ID_in_statdef296); 
			ID43_tree = (CommonTree)adaptor.create(ID43);
			adaptor.addChild(root_0, ID43_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statdef"


	public static class behaviordef_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "behaviordef"
	// Waipr.g:42:1: behaviordef : ID '(' ( stats )* ')' '{' ( statement )* '}' -> ^( ID ( stats )* ( statement )* ) ;
	public final WaiprParser.behaviordef_return behaviordef() throws RecognitionException {
		WaiprParser.behaviordef_return retval = new WaiprParser.behaviordef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID44=null;
		Token char_literal45=null;
		Token char_literal47=null;
		Token char_literal48=null;
		Token char_literal50=null;
		ParserRuleReturnScope stats46 =null;
		ParserRuleReturnScope statement49 =null;

		CommonTree ID44_tree=null;
		CommonTree char_literal45_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree char_literal48_tree=null;
		CommonTree char_literal50_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_stats=new RewriteRuleSubtreeStream(adaptor,"rule stats");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// Waipr.g:42:12: ( ID '(' ( stats )* ')' '{' ( statement )* '}' -> ^( ID ( stats )* ( statement )* ) )
			// Waipr.g:42:14: ID '(' ( stats )* ')' '{' ( statement )* '}'
			{
			ID44=(Token)match(input,ID,FOLLOW_ID_in_behaviordef303);  
			stream_ID.add(ID44);

			char_literal45=(Token)match(input,15,FOLLOW_15_in_behaviordef305);  
			stream_15.add(char_literal45);

			// Waipr.g:42:21: ( stats )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ID||LA12_0==14) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Waipr.g:42:21: stats
					{
					pushFollow(FOLLOW_stats_in_behaviordef307);
					stats46=stats();
					state._fsp--;

					stream_stats.add(stats46.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			char_literal47=(Token)match(input,16,FOLLOW_16_in_behaviordef310);  
			stream_16.add(char_literal47);

			char_literal48=(Token)match(input,25,FOLLOW_25_in_behaviordef312);  
			stream_25.add(char_literal48);

			// Waipr.g:42:36: ( statement )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==ID) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Waipr.g:42:36: statement
					{
					pushFollow(FOLLOW_statement_in_behaviordef314);
					statement49=statement();
					state._fsp--;

					stream_statement.add(statement49.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			char_literal50=(Token)match(input,26,FOLLOW_26_in_behaviordef317);  
			stream_26.add(char_literal50);

			// AST REWRITE
			// elements: stats, ID, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 42:51: -> ^( ID ( stats )* ( statement )* )
			{
				// Waipr.g:42:54: ^( ID ( stats )* ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
				// Waipr.g:42:59: ( stats )*
				while ( stream_stats.hasNext() ) {
					adaptor.addChild(root_1, stream_stats.nextTree());
				}
				stream_stats.reset();

				// Waipr.g:42:66: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviordef"


	public static class stats_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stats"
	// Waipr.g:44:1: stats : ( stat ( ',' stat )* ) -> ( stat )* ;
	public final WaiprParser.stats_return stats() throws RecognitionException {
		WaiprParser.stats_return retval = new WaiprParser.stats_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal52=null;
		ParserRuleReturnScope stat51 =null;
		ParserRuleReturnScope stat53 =null;

		CommonTree char_literal52_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// Waipr.g:44:7: ( ( stat ( ',' stat )* ) -> ( stat )* )
			// Waipr.g:44:8: ( stat ( ',' stat )* )
			{
			// Waipr.g:44:8: ( stat ( ',' stat )* )
			// Waipr.g:44:9: stat ( ',' stat )*
			{
			pushFollow(FOLLOW_stat_in_stats337);
			stat51=stat();
			state._fsp--;

			stream_stat.add(stat51.getTree());
			// Waipr.g:44:14: ( ',' stat )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==17) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Waipr.g:44:15: ',' stat
					{
					char_literal52=(Token)match(input,17,FOLLOW_17_in_stats340);  
					stream_17.add(char_literal52);

					pushFollow(FOLLOW_stat_in_stats342);
					stat53=stat();
					state._fsp--;

					stream_stat.add(stat53.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			}

			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 44:27: -> ( stat )*
			{
				// Waipr.g:44:30: ( stat )*
				while ( stream_stat.hasNext() ) {
					adaptor.addChild(root_0, stream_stat.nextTree());
				}
				stream_stat.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stats"


	public static class stat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// Waipr.g:46:1: stat : ( globalstat | localstat );
	public final WaiprParser.stat_return stat() throws RecognitionException {
		WaiprParser.stat_return retval = new WaiprParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope globalstat54 =null;
		ParserRuleReturnScope localstat55 =null;


		try {
			// Waipr.g:46:6: ( globalstat | localstat )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==14) ) {
				alt15=1;
			}
			else if ( (LA15_0==ID) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// Waipr.g:46:8: globalstat
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalstat_in_stat358);
					globalstat54=globalstat();
					state._fsp--;

					adaptor.addChild(root_0, globalstat54.getTree());

					}
					break;
				case 2 :
					// Waipr.g:47:4: localstat
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_localstat_in_stat363);
					localstat55=localstat();
					state._fsp--;

					adaptor.addChild(root_0, localstat55.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class globalstat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "globalstat"
	// Waipr.g:49:1: globalstat : '!' ID -> ^( ID '!' ) ;
	public final WaiprParser.globalstat_return globalstat() throws RecognitionException {
		WaiprParser.globalstat_return retval = new WaiprParser.globalstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal56=null;
		Token ID57=null;

		CommonTree char_literal56_tree=null;
		CommonTree ID57_tree=null;
		RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// Waipr.g:49:12: ( '!' ID -> ^( ID '!' ) )
			// Waipr.g:49:14: '!' ID
			{
			char_literal56=(Token)match(input,14,FOLLOW_14_in_globalstat371);  
			stream_14.add(char_literal56);

			ID57=(Token)match(input,ID,FOLLOW_ID_in_globalstat373);  
			stream_ID.add(ID57);

			// AST REWRITE
			// elements: 14, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 49:21: -> ^( ID '!' )
			{
				// Waipr.g:49:24: ^( ID '!' )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
				adaptor.addChild(root_1, stream_14.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "globalstat"


	public static class localstat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "localstat"
	// Waipr.g:51:1: localstat : ID -> ID ;
	public final WaiprParser.localstat_return localstat() throws RecognitionException {
		WaiprParser.localstat_return retval = new WaiprParser.localstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID58=null;

		CommonTree ID58_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// Waipr.g:52:2: ( ID -> ID )
			// Waipr.g:52:4: ID
			{
			ID58=(Token)match(input,ID,FOLLOW_ID_in_localstat391);  
			stream_ID.add(ID58);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 52:7: -> ID
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localstat"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Waipr.g:54:1: statement : behavior ';' !;
	public final WaiprParser.statement_return statement() throws RecognitionException {
		WaiprParser.statement_return retval = new WaiprParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal60=null;
		ParserRuleReturnScope behavior59 =null;

		CommonTree char_literal60_tree=null;

		try {
			// Waipr.g:55:2: ( behavior ';' !)
			// Waipr.g:55:4: behavior ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_behavior_in_statement404);
			behavior59=behavior();
			state._fsp--;

			adaptor.addChild(root_0, behavior59.getTree());

			char_literal60=(Token)match(input,IE,FOLLOW_IE_in_statement406); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class behavior_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "behavior"
	// Waipr.g:57:1: behavior : ID ^ '(' ! invals ')' !;
	public final WaiprParser.behavior_return behavior() throws RecognitionException {
		WaiprParser.behavior_return retval = new WaiprParser.behavior_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID61=null;
		Token char_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope invals63 =null;

		CommonTree ID61_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree char_literal64_tree=null;

		try {
			// Waipr.g:57:9: ( ID ^ '(' ! invals ')' !)
			// Waipr.g:57:11: ID ^ '(' ! invals ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			ID61=(Token)match(input,ID,FOLLOW_ID_in_behavior415); 
			ID61_tree = (CommonTree)adaptor.create(ID61);
			root_0 = (CommonTree)adaptor.becomeRoot(ID61_tree, root_0);

			char_literal62=(Token)match(input,15,FOLLOW_15_in_behavior418); 
			pushFollow(FOLLOW_invals_in_behavior421);
			invals63=invals();
			state._fsp--;

			adaptor.addChild(root_0, invals63.getTree());

			char_literal64=(Token)match(input,16,FOLLOW_16_in_behavior423); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behavior"


	public static class invals_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "invals"
	// Waipr.g:59:1: invals : inval ( ',' inval )* -> ( inval )* ;
	public final WaiprParser.invals_return invals() throws RecognitionException {
		WaiprParser.invals_return retval = new WaiprParser.invals_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal66=null;
		ParserRuleReturnScope inval65 =null;
		ParserRuleReturnScope inval67 =null;

		CommonTree char_literal66_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleSubtreeStream stream_inval=new RewriteRuleSubtreeStream(adaptor,"rule inval");

		try {
			// Waipr.g:59:8: ( inval ( ',' inval )* -> ( inval )* )
			// Waipr.g:59:10: inval ( ',' inval )*
			{
			pushFollow(FOLLOW_inval_in_invals433);
			inval65=inval();
			state._fsp--;

			stream_inval.add(inval65.getTree());
			// Waipr.g:59:16: ( ',' inval )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==17) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Waipr.g:59:17: ',' inval
					{
					char_literal66=(Token)match(input,17,FOLLOW_17_in_invals436);  
					stream_17.add(char_literal66);

					pushFollow(FOLLOW_inval_in_invals438);
					inval67=inval();
					state._fsp--;

					stream_inval.add(inval67.getTree());
					}
					break;

				default :
					break loop16;
				}
			}

			// AST REWRITE
			// elements: inval
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 59:29: -> ( inval )*
			{
				// Waipr.g:59:32: ( inval )*
				while ( stream_inval.hasNext() ) {
					adaptor.addChild(root_0, stream_inval.nextTree());
				}
				stream_inval.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invals"


	public static class inval_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "inval"
	// Waipr.g:61:1: inval : ( ID | NUMBER | TEXT ) ;
	public final WaiprParser.inval_return inval() throws RecognitionException {
		WaiprParser.inval_return retval = new WaiprParser.inval_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set68=null;

		CommonTree set68_tree=null;

		try {
			// Waipr.g:61:7: ( ( ID | NUMBER | TEXT ) )
			// Waipr.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set68=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==NUMBER||input.LA(1)==TEXT ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set68));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inval"

	// Delegated rules



	public static final BitSet FOLLOW_machine_in_prog43 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_machine52 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_machine54 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_machine56 = new BitSet(new long[]{0x0000000005B80000L});
	public static final BitSet FOLLOW_block_in_machine58 = new BitSet(new long[]{0x0000000005B80000L});
	public static final BitSet FOLLOW_26_in_machine61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_block78 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_block80 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_statdefs_in_block82 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_26_in_block86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_block100 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_block102 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_triggers_in_block104 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_26_in_block107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_block122 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_20_in_block126 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_block129 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_behaviordef_in_block131 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_26_in_block134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_block149 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_block151 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_handler_in_block153 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_26_in_block156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_handler175 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_handler177 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_triggersource_in_handler179 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_handler181 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_handler183 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_statement_in_handler185 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_26_in_handler188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sender_in_triggersource209 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_triggersource211 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_trigger_in_triggersource213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_sender230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_trigger241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statdef_in_statdefs253 = new BitSet(new long[]{0x0000000000020080L});
	public static final BitSet FOLLOW_17_in_statdefs256 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_statdef_in_statdefs258 = new BitSet(new long[]{0x0000000000020080L});
	public static final BitSet FOLLOW_IE_in_statdefs262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trigger_in_triggers274 = new BitSet(new long[]{0x0000000000020080L});
	public static final BitSet FOLLOW_17_in_triggers277 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_trigger_in_triggers279 = new BitSet(new long[]{0x0000000000020080L});
	public static final BitSet FOLLOW_IE_in_triggers283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_statdef296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_behaviordef303 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_behaviordef305 = new BitSet(new long[]{0x0000000000014040L});
	public static final BitSet FOLLOW_stats_in_behaviordef307 = new BitSet(new long[]{0x0000000000014040L});
	public static final BitSet FOLLOW_16_in_behaviordef310 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_behaviordef312 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_statement_in_behaviordef314 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_26_in_behaviordef317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stats337 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stats340 = new BitSet(new long[]{0x0000000000004040L});
	public static final BitSet FOLLOW_stat_in_stats342 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_globalstat_in_stat358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localstat_in_stat363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_globalstat371 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_globalstat373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_localstat391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_behavior_in_statement404 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_IE_in_statement406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_behavior415 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_behavior418 = new BitSet(new long[]{0x0000000000000940L});
	public static final BitSet FOLLOW_invals_in_behavior421 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_behavior423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inval_in_invals433 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_invals436 = new BitSet(new long[]{0x0000000000000940L});
	public static final BitSet FOLLOW_inval_in_invals438 = new BitSet(new long[]{0x0000000000020002L});
}
