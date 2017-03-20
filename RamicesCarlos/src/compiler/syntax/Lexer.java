
package compiler.syntax;

/**		Utilizei o lexer gerado pelo meus colegas, visto que o meu lexer foi feito manualmente
  *		@author Ikaro Alef e Kenedy Felipe
  */
import java_cup.runtime.Symbol;


public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1, 42,  0,  1,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    11,  0,  0,  0,  0, 23,  0,  6, 13, 14, 21, 19, 15, 20,  5, 22, 
     4,  4,  4,  4,  4,  4,  4,  4,  4,  4, 12, 28, 16, 18, 17,  0, 
     0,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  0,  8,  0,  0,  3, 
     0, 24,  2, 39, 25, 33, 32,  2, 37, 31,  2,  2, 34,  2,  9, 26, 
    40,  2, 27, 35, 10, 38, 41, 36,  2,  2,  2, 29,  0, 30,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\1\1\3\1\1"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\3\3\1\20\1\21\1\22\7\3"+
    "\1\0\1\23\1\0\1\24\1\0\1\3\1\25\1\26"+
    "\1\27\1\0\1\30\1\31\1\3\1\32\2\3\1\33"+
    "\6\3\1\0\1\34\1\0\1\35\1\3\1\36\6\3"+
    "\1\37\1\0\2\3\1\40\1\3\1\41\1\42\1\43"+
    "\1\31\1\3\1\44\1\45\1\31\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[83];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\53\0\53\0\53\0\u0183\0\u01ae\0\53\0\53"+
    "\0\53\0\u01d9\0\53\0\53\0\u0204\0\u022f\0\u025a\0\53"+
    "\0\53\0\53\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c"+
    "\0\u0387\0\327\0\u03b2\0\u03dd\0\u0408\0\u0433\0\u045e\0\53"+
    "\0\53\0\53\0\u0489\0\53\0\u04b4\0\u04df\0\201\0\u050a"+
    "\0\u0535\0\201\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u060c\0\u0637"+
    "\0\u0102\0\201\0\u0662\0\201\0\u068d\0\201\0\u06b8\0\u06e3"+
    "\0\u070e\0\u0739\0\u0764\0\u078f\0\201\0\u07ba\0\u07e5\0\u0810"+
    "\0\201\0\u083b\0\201\0\201\0\201\0\u0866\0\u0891\0\201"+
    "\0\201\0\53\0\201";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[83];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\2\2"+
    "\1\10\1\4\1\3\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\4\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\2\4\1\36\2\4\1\37\1\40\1\41\1\3"+
    "\54\0\1\3\11\0\1\3\36\0\1\3\2\0\3\4"+
    "\2\0\1\4\1\0\2\4\15\0\4\4\3\0\13\4"+
    "\5\0\1\5\1\42\51\0\1\43\50\0\1\44\1\0"+
    "\1\44\1\0\1\45\1\44\1\46\7\44\10\0\4\44"+
    "\3\0\13\44\3\0\3\4\2\0\1\4\1\0\2\4"+
    "\15\0\2\4\1\47\1\4\3\0\13\4\23\0\1\50"+
    "\51\0\1\51\1\52\51\0\1\53\1\54\55\0\1\55"+
    "\27\0\3\4\2\0\1\4\1\0\1\56\1\4\15\0"+
    "\4\4\3\0\13\4\3\0\3\4\2\0\1\4\1\0"+
    "\2\4\15\0\3\4\1\57\3\0\13\4\3\0\3\4"+
    "\2\0\1\4\1\0\2\4\15\0\4\4\3\0\2\4"+
    "\1\60\10\4\3\0\3\4\2\0\1\4\1\0\1\61"+
    "\1\4\15\0\4\4\3\0\1\4\1\62\11\4\3\0"+
    "\3\4\2\0\1\4\1\0\2\4\15\0\4\4\3\0"+
    "\3\4\1\63\7\4\3\0\3\4\2\0\1\4\1\0"+
    "\2\4\15\0\4\4\3\0\3\4\1\64\7\4\3\0"+
    "\3\4\2\0\1\4\1\0\2\4\15\0\4\4\3\0"+
    "\6\4\1\65\4\4\3\0\3\4\2\0\1\4\1\0"+
    "\2\4\15\0\4\4\3\0\6\4\1\66\4\4\3\0"+
    "\3\4\2\0\1\4\1\0\2\4\15\0\3\4\1\67"+
    "\3\0\13\4\3\0\3\4\2\0\1\4\1\0\2\4"+
    "\15\0\1\70\3\4\3\0\13\4\5\0\1\43\1\42"+
    "\53\0\1\45\52\0\1\71\55\0\2\44\42\0\3\4"+
    "\2\0\1\4\1\0\1\4\1\72\15\0\4\4\3\0"+
    "\13\4\1\0\25\73\1\0\25\73\52\55\3\0\3\4"+
    "\2\0\1\4\1\0\2\4\15\0\1\4\1\74\2\4"+
    "\3\0\13\4\3\0\3\4\2\0\1\4\1\0\1\4"+
    "\1\75\15\0\4\4\3\0\13\4\3\0\3\4\2\0"+
    "\1\4\1\0\1\4\1\76\15\0\4\4\3\0\13\4"+
    "\3\0\3\4\2\0\1\4\1\0\2\4\15\0\2\4"+
    "\1\77\1\4\3\0\13\4\3\0\3\4\2\0\1\4"+
    "\1\0\2\4\15\0\4\4\3\0\4\4\1\100\6\4"+
    "\3\0\3\4\2\0\1\4\1\0\2\4\15\0\4\4"+
    "\3\0\1\101\12\4\3\0\3\4\2\0\1\4\1\0"+
    "\2\4\15\0\1\102\3\4\3\0\13\4\3\0\3\4"+
    "\2\0\1\4\1\0\1\103\1\4\15\0\2\4\1\104"+
    "\1\4\3\0\13\4\3\0\3\4\2\0\1\4\1\0"+
    "\2\4\15\0\3\4\1\105\3\0\13\4\1\0\20\73"+
    "\1\106\32\73\2\0\3\4\2\0\1\4\1\0\2\4"+
    "\15\0\4\4\3\0\7\4\1\107\3\4\3\0\3\4"+
    "\2\0\1\4\1\0\2\4\15\0\1\110\3\4\3\0"+
    "\13\4\3\0\3\4\2\0\1\4\1\0\2\4\15\0"+
    "\4\4\3\0\2\4\1\111\10\4\3\0\3\4\2\0"+
    "\1\4\1\0\2\4\15\0\4\4\3\0\3\4\1\112"+
    "\7\4\3\0\3\4\2\0\1\4\1\0\2\4\15\0"+
    "\3\4\1\113\3\0\13\4\3\0\3\4\2\0\1\4"+
    "\1\0\1\4\1\114\15\0\4\4\3\0\13\4\3\0"+
    "\3\4\2\0\1\4\1\0\2\4\15\0\4\4\3\0"+
    "\10\4\1\115\2\4\1\0\20\73\1\116\32\73\2\0"+
    "\3\4\2\0\1\4\1\0\2\4\15\0\3\4\1\117"+
    "\3\0\13\4\3\0\3\4\2\0\1\4\1\0\1\4"+
    "\1\120\15\0\4\4\3\0\13\4\3\0\3\4\2\0"+
    "\1\4\1\0\2\4\15\0\4\4\3\0\2\4\1\121"+
    "\10\4\21\0\1\122\34\0\3\4\2\0\1\4\1\0"+
    "\1\123\1\4\15\0\4\4\3\0\13\4\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2236];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\3\11\2\1\3\11\1\1\2\11"+
    "\3\1\3\11\7\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\3\11\1\0\1\11\14\1\1\0\1\1\1\0"+
    "\12\1\1\0\13\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[83];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { return new Symbol(sym.CHAR_LITERAL, yyline, yycolumn, yytext());
          }
        case 39: break;
        case 22: 
          { return new Symbol(sym.DIFERENTE_QUE, yyline, yycolumn);
          }
        case 40: break;
        case 28: 
          { return new Symbol(sym.NOT, yyline, yycolumn);
          }
        case 41: break;
        case 27: 
          { return new Symbol(sym.KEY_IF, yyline, yycolumn);
          }
        case 42: break;
        case 29: 
          { return new Symbol(sym.AND, yyline, yycolumn);
          }
        case 43: break;
        case 24: 
          { return new Symbol(sym.MAIOR_OU_IGUAL, yyline, yycolumn);
          }
        case 44: break;
        case 8: 
          { return new Symbol(sym.MENOR_QUE, yyline, yycolumn);
          }
        case 45: break;
        case 36: 
          { return new Symbol(sym.KEY_FLOAT, yyline, yycolumn);
          }
        case 46: break;
        case 34: 
          { return new Symbol(sym.KEY_PRINT, yyline, yycolumn);
          }
        case 47: break;
        case 15: 
          { return new Symbol(sym.RESTO, yyline, yycolumn);
          }
        case 48: break;
        case 30: 
          { return new Symbol(sym.KEY_INT, yyline, yycolumn);
          }
        case 49: break;
        case 32: 
          { return new Symbol(sym.KEY_ELSE, yyline, yycolumn);
          }
        case 50: break;
        case 38: 
          { return new Symbol(sym.KEY_RETURN, yyline, yycolumn);
          }
        case 51: break;
        case 31: 
          { return new Symbol(sym.KEY_VAR, yyline, yycolumn);
          }
        case 52: break;
        case 1: 
          { // Casa com qualquer caracter que n�o casar com as expressoes anteriores.
    System.out.println("Illegal character : " + yytext());
	System.out.println("Line: " + yyline);
	System.out.println("Column: " + yycolumn);
          }
        case 53: break;
        case 26: 
          { return new Symbol(sym.OR, yyline, yycolumn);
          }
        case 54: break;
        case 13: 
          { return new Symbol(sym.MULT, yyline, yycolumn);
          }
        case 55: break;
        case 2: 
          { // Caracteres ignorados.
	// Nenhum Symbol � retornado.
          }
        case 56: break;
        case 3: 
          { return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext());
          }
        case 57: break;
        case 18: 
          { return new Symbol(sym.FECHA_CHAVE, yyline, yycolumn);
          }
        case 58: break;
        case 11: 
          { return new Symbol(sym.SOMA, yyline, yycolumn);
          }
        case 59: break;
        case 5: 
          { return new Symbol(sym.ABRE_PAR, yyline, yycolumn);
          }
        case 60: break;
        case 23: 
          { return new Symbol(sym.MENOR_OU_IGUAL, yyline, yycolumn);
          }
        case 61: break;
        case 16: 
          { return new Symbol(sym.PONTO_VIRGULA, yyline, yycolumn);
          }
        case 62: break;
        case 12: 
          { return new Symbol(sym.SUB, yyline, yycolumn);
          }
        case 63: break;
        case 35: 
          { return new Symbol(sym.KEY_PROC, yyline, yycolumn);
          }
        case 64: break;
        case 10: 
          { return new Symbol(sym.IGUAL_QUE, yyline, yycolumn);
          }
        case 65: break;
        case 4: 
          { return new Symbol(sym.INT_LITERAL, yyline, yycolumn, yytext());
          }
        case 66: break;
        case 19: 
          { return new Symbol(sym.FLOAT_LITERAL, yyline, yycolumn, yytext());
          }
        case 67: break;
        case 37: 
          { return new Symbol(sym.KEY_WHILE, yyline, yycolumn);
          }
        case 68: break;
        case 7: 
          { return new Symbol(sym.VIRGULA, yyline, yycolumn);
          }
        case 69: break;
        case 14: 
          { return new Symbol(sym.DIV, yyline, yycolumn);
          }
        case 70: break;
        case 17: 
          { return new Symbol(sym.ABRE_CHAVE, yyline, yycolumn);
          }
        case 71: break;
        case 33: 
          { return new Symbol(sym.KEY_CHAR, yyline, yycolumn);
          }
        case 72: break;
        case 21: 
          { return new Symbol(sym.ATRIBUICAO, yyline, yycolumn);
          }
        case 73: break;
        case 9: 
          { return new Symbol(sym.MAIOR_QUE, yyline, yycolumn);
          }
        case 74: break;
        case 6: 
          { return new Symbol(sym.FECHA_PAR, yyline, yycolumn);
          }
        case 75: break;
        case 25: 
          { 
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {
                // Casa com o fim do arquivo apenas.
	return new Symbol(sym.EOF, yyline, yycolumn);
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}