// $ANTLR 3.5.1 C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g 2014-11-04 01:32:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WaiprLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public WaiprLexer() {} 
	public WaiprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public WaiprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g"; }

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:2:7: ( '!' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:2:9: '!'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:3:7: ( '(' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:3:9: '('
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:4:7: ( ')' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:4:9: ')'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:5:7: ( ',' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:5:9: ','
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:6:7: ( '.' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:6:9: '.'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:7:7: ( 'Behaviors' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:7:9: 'Behaviors'
			{
			match("Behaviors"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:8:7: ( 'Behaviours' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:8:9: 'Behaviours'
			{
			match("Behaviours"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:9:7: ( 'Handlers' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:9:9: 'Handlers'
			{
			match("Handlers"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:10:7: ( 'Machine' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:10:9: 'Machine'
			{
			match("Machine"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:11:7: ( 'Statuses' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:11:9: 'Statuses'
			{
			match("Statuses"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:12:7: ( 'Triggers' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:12:9: 'Triggers'
			{
			match("Triggers"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:13:7: ( '{' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:13:9: '{'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:14:7: ( '}' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:14:9: '}'
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
	// $ANTLR end "T__26"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:64:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:64:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:64:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "IE"
	public final void mIE() throws RecognitionException {
		try {
			int _type = IE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:65:5: ( ';' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:65:7: ';'
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
	// $ANTLR end "IE"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:66:8: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:66:12: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:66:12: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:
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
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:66:24: ( '.' ( '0' .. '9' )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:66:25: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:66:29: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:
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
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:4: ( ( ( '//' ( . )+ ( ( '\\r' )? '\\n' ) ) | ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:6: ( ( '//' ( . )+ ( ( '\\r' )? '\\n' ) ) | ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:6: ( ( '//' ( . )+ ( ( '\\r' )? '\\n' ) ) | ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=6;
				switch ( input.LA(1) ) {
				case '/':
					{
					alt7=1;
					}
					break;
				case ' ':
					{
					alt7=2;
					}
					break;
				case '\t':
					{
					alt7=3;
					}
					break;
				case '\n':
					{
					alt7=4;
					}
					break;
				case '\r':
					{
					alt7=5;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:7: ( '//' ( . )+ ( ( '\\r' )? '\\n' ) )
					{
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:7: ( '//' ( . )+ ( ( '\\r' )? '\\n' ) )
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:8: '//' ( . )+ ( ( '\\r' )? '\\n' )
					{
					match("//"); 

					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:13: ( . )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='\r') ) {
							alt5=2;
						}
						else if ( (LA5_0=='\n') ) {
							alt5=2;
						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:13: .
							{
							matchAny(); 
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:16: ( ( '\\r' )? '\\n' )
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:17: ( '\\r' )? '\\n'
					{
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:17: ( '\\r' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='\r') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:17: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:30: ' '
					{
					match(' '); 
					}
					break;
				case 3 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:35: '\\t'
					{
					match('\t'); 
					}
					break;
				case 4 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:41: '\\n'
					{
					match('\n'); 
					}
					break;
				case 5 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:67:47: '\\r'
					{
					match('\r'); 
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:69:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:69:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:69:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\\') ) {
					alt8=1;
				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:69:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:69:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:74:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:78:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt9=1;
					}
					break;
				case 'u':
					{
					alt9=2;
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
					{
					alt9=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:78:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:79:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:80:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:85:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\\') ) {
				int LA10_1 = input.LA(2);
				if ( ((LA10_1 >= '0' && LA10_1 <= '3')) ) {
					int LA10_2 = input.LA(3);
					if ( ((LA10_2 >= '0' && LA10_2 <= '7')) ) {
						int LA10_4 = input.LA(4);
						if ( ((LA10_4 >= '0' && LA10_4 <= '7')) ) {
							alt10=1;
						}

						else {
							alt10=2;
						}

					}

					else {
						alt10=3;
					}

				}
				else if ( ((LA10_1 >= '4' && LA10_1 <= '7')) ) {
					int LA10_3 = input.LA(3);
					if ( ((LA10_3 >= '0' && LA10_3 <= '7')) ) {
						alt10=2;
					}

					else {
						alt10=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:85:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:86:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:87:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:92:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:92:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | IE | NUMBER | WS | TEXT )
		int alt11=18;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:10: T__14
				{
				mT__14(); 

				}
				break;
			case 2 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:16: T__15
				{
				mT__15(); 

				}
				break;
			case 3 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:22: T__16
				{
				mT__16(); 

				}
				break;
			case 4 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:28: T__17
				{
				mT__17(); 

				}
				break;
			case 5 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:34: T__18
				{
				mT__18(); 

				}
				break;
			case 6 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:40: T__19
				{
				mT__19(); 

				}
				break;
			case 7 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:46: T__20
				{
				mT__20(); 

				}
				break;
			case 8 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:52: T__21
				{
				mT__21(); 

				}
				break;
			case 9 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:58: T__22
				{
				mT__22(); 

				}
				break;
			case 10 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:64: T__23
				{
				mT__23(); 

				}
				break;
			case 11 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:70: T__24
				{
				mT__24(); 

				}
				break;
			case 12 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:76: T__25
				{
				mT__25(); 

				}
				break;
			case 13 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:82: T__26
				{
				mT__26(); 

				}
				break;
			case 14 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:88: ID
				{
				mID(); 

				}
				break;
			case 15 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:91: IE
				{
				mIE(); 

				}
				break;
			case 16 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:94: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 17 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:101: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\Waipr.g:1:104: TEXT
				{
				mTEXT(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\6\uffff\5\15\7\uffff\33\15\1\63\4\15\1\70\1\uffff\1\71\1\72\1\73\1\15"+
		"\4\uffff\1\75\1\uffff";
	static final String DFA11_eofS =
		"\76\uffff";
	static final String DFA11_minS =
		"\1\11\5\uffff\1\145\2\141\1\164\1\162\7\uffff\1\150\1\156\1\143\1\141"+
		"\1\151\1\141\1\144\1\150\1\164\1\147\1\166\1\154\1\151\1\165\1\147\1\151"+
		"\1\145\1\156\1\163\1\145\1\157\1\162\2\145\2\162\1\163\1\101\3\163\1\162"+
		"\1\101\1\uffff\3\101\1\163\4\uffff\1\101\1\uffff";
	static final String DFA11_maxS =
		"\1\175\5\uffff\1\145\2\141\1\164\1\162\7\uffff\1\150\1\156\1\143\1\141"+
		"\1\151\1\141\1\144\1\150\1\164\1\147\1\166\1\154\1\151\1\165\1\147\1\151"+
		"\1\145\1\156\1\163\1\145\1\157\1\162\2\145\1\162\1\165\1\163\1\172\3\163"+
		"\1\162\1\172\1\uffff\3\172\1\163\4\uffff\1\172\1\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
		"\41\uffff\1\11\4\uffff\1\10\1\12\1\13\1\6\1\uffff\1\7";
	static final String DFA11_specialS =
		"\76\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\1\1\21\5\uffff\1\2\1\3\2\uffff\1\4"+
			"\1\uffff\1\5\1\20\12\17\1\uffff\1\16\5\uffff\1\15\1\6\5\15\1\7\4\15\1"+
			"\10\5\15\1\11\1\12\6\15\6\uffff\32\15\1\13\1\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60\2\uffff\1\61",
			"\1\62",
			"\32\15\6\uffff\32\15",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\32\15\6\uffff\32\15",
			"",
			"\32\15\6\uffff\32\15",
			"\32\15\6\uffff\32\15",
			"\32\15\6\uffff\32\15",
			"\1\74",
			"",
			"",
			"",
			"",
			"\32\15\6\uffff\32\15",
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

	protected class DFA11 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | IE | NUMBER | WS | TEXT );";
		}
	}

}
