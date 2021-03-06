/* The following code was generated by JFlex 1.6.1 */



import java.util.List;

/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>flexer.flex</tt>
 */
class Flexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STARTK = 2;
  public static final int ELEMK = 4;
  public static final int STOPK = 6;
  public static final int SEPKS = 8;
  public static final int STARTS = 10;
  public static final int INITS = 12;
  public static final int ELEMS = 14;
  public static final int STOPS = 16;
  public static final int SEPSD = 18;
  public static final int STARTD = 20;
  public static final int INITD = 22;
  public static final int ELEMD = 24;
  public static final int SRCT = 26;
  public static final int SEPSST = 28;
  public static final int SYMT = 30;
  public static final int SEPSDT = 32;
  public static final int DESTT = 34;
  public static final int ENDT = 36;
  public static final int ENDD = 38;
  public static final int STOPD = 40;
  public static final int SEPDS = 42;
  public static final int SS = 44;
  public static final int SEPSF = 46;
  public static final int STARTF = 48;
  public static final int INITF = 50;
  public static final int ELEMF = 52;
  public static final int STOPF = 54;
  public static final int ENDDFA = 56;
  public static final int FINAL = 58;
  public static final int DFA = 60;
  public static final int STATES = 62;
  public static final int STSEP = 64;
  public static final int ALPHABET = 66;
  public static final int ALSEP = 68;
  public static final int DELTA = 70;
  public static final int DSEP = 72;
  public static final int START = 74;
  public static final int STASE = 76;
  public static final int STOP = 78;
  public static final int STOSE = 80;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
          0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7,
          8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15,
          16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23,
          24, 24, 25, 25, 26, 26, 27, 27, 28, 28, 19, 19, 19, 19, 19, 19,
          19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19,
          19, 19
  };

  /**
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
          "\11\0\1\3\1\2\1\13\1\3\1\1\22\0\1\3\1\4\1\4"+
                  "\1\4\1\4\1\4\1\4\1\4\1\6\1\12\1\4\1\4\1\11"+
                  "\1\4\1\4\1\4\12\5\1\4\1\4\1\4\1\4\1\4\1\4"+
                  "\1\4\32\5\1\4\1\4\1\4\1\4\1\5\1\4\32\5\1\7"+
                  "\1\4\1\10\1\4\6\0\1\13\44\0\1\5\12\0\1\5\4\0"+
                  "\1\5\5\0\27\5\1\0\7\5\30\5\1\0\10\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\2\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\2\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\2\5\1\5\1\5\1\5"+
                  "\1\5\3\5\2\5\1\5\1\5\1\5\2\5\1\5\3\5\2\5"+
                  "\4\5\1\5\2\5\1\5\3\5\3\5\2\5\1\5\2\5\1\5"+
                  "\1\5\1\5\1\5\1\5\2\5\1\5\1\5\2\5\1\5\1\5"+
                  "\2\5\1\5\3\5\1\5\1\5\1\5\2\5\2\5\1\0\1\5"+
                  "\3\5\4\0\1\5\1\0\1\5\1\5\1\0\1\5\1\5\1\0"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\2\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\2\5\1\5\1\0\1\5\1\5\1\5"+
                  "\3\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\7\5"+
                  "\2\5\1\5\2\5\2\5\1\5\1\5\4\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\105\5\1\0\44\5\7\0\2\5"+
                  "\36\0\5\5\140\0\1\5\52\0\1\5\1\5\1\5\1\5\2\0"+
                  "\1\5\1\5\2\0\4\5\1\0\1\5\6\0\1\5\1\0\3\5"+
                  "\1\0\1\5\1\0\2\5\1\5\21\5\1\0\11\5\43\5\1\5"+
                  "\2\5\3\5\3\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\5\5\1\5\1\5\1\0"+
                  "\1\5\1\5\2\5\2\5\63\5\60\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\10\0\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\2\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\2\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\0\46\5\12\0\47\5\330\0"+
                  "\12\5\206\0\12\5\306\0\12\5\u019c\0\12\5\166\0\12\5\166\0"+
                  "\12\5\166\0\12\5\166\0\12\5\166\0\12\5\166\0\12\5\166\0"+
                  "\12\5\166\0\12\5\166\0\12\5\140\0\12\5\166\0\12\5\106\0"+
                  "\12\5\u0116\0\12\5\106\0\12\5\6\0\46\5\1\0\1\5\5\0"+
                  "\1\5\u0712\0\12\5\46\0\12\5\u012c\0\12\5\200\0\12\5\246\0"+
                  "\12\5\6\0\12\5\266\0\12\5\126\0\12\5\206\0\12\5\6\0"+
                  "\12\5\246\0\300\5\100\0\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\11\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\11\5\10\5\6\5\2\0\6\5\2\0\10\5\10\5\10\5"+
                  "\10\5\6\5\2\0\6\5\2\0\10\5\1\0\1\5\1\0\1\5"+
                  "\1\0\1\5\1\0\1\5\10\5\10\5\16\5\2\0\10\5\10\0"+
                  "\10\5\10\0\10\5\10\0\5\5\1\0\2\5\4\5\2\0\1\5"+
                  "\3\0\3\5\1\0\2\5\4\5\4\0\4\5\2\0\2\5\4\5"+
                  "\4\0\10\5\5\5\5\0\3\5\1\0\2\5\4\5\54\0\1\13"+
                  "\1\13\107\0\1\5\15\0\1\5\20\0\15\5\145\0\1\5\4\0"+
                  "\1\5\2\0\1\5\3\5\2\5\3\5\1\5\1\0\1\5\3\0"+
                  "\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0\4\5\1\0"+
                  "\1\5\4\5\1\5\4\0\1\5\2\0\2\5\2\5\5\0\1\5"+
                  "\4\5\4\0\1\5\21\0\20\5\20\5\3\0\1\5\1\5\u0331\0"+
                  "\32\5\32\5\u0716\0\57\5\1\0\57\5\1\0\1\5\1\5\3\5"+
                  "\2\5\1\5\1\5\1\5\1\5\1\5\1\5\4\5\1\5\1\5"+
                  "\2\5\1\5\10\5\3\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\2\5\6\0\1\5\1\5\1\5\1\5\3\0\1\5"+
                  "\1\5\14\0\46\5\1\0\1\5\5\0\1\5\u78f2\0\12\5\26\0"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\22\0\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\3\5\204\0\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\3\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\12\5\1\5\1\5\1\5\1\5\2\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\3\0\1\5\1\5\1\5"+
                  "\1\5\1\0\1\5\1\5\1\5\3\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5"+
                  "\1\5\1\5\1\5\1\5\1\5\1\5\4\5\2\0\2\5\106\0"+
                  "\3\5\325\0\12\5\46\0\12\5\306\0\12\5\26\0\12\5\126\0"+
                  "\12\5\326\0\53\5\1\0\4\5\4\0\2\5\212\0\12\5\u4f06\0"+
                  "\7\5\14\0\5\5\u03f8\0\12\5\7\0\32\5\6\0\32\5\u04a5\0"+
                  "\50\5\50\5\120\0\12\5\u0bbc\0\12\5\200\0\12\5\74\0\12\5"+
                  "\220\0\12\5\u0116\0\12\5\u01d6\0\12\5\u0176\0\12\5\146\0\12\5"+
                  "\u01d6\0\40\5\40\5\12\5\u5176\0\12\5\346\0\12\5\u68a6\0\32\5"+
                  "\32\5\32\5\7\5\1\0\22\5\32\5\32\5\1\5\1\0\2\5"+
                  "\2\0\1\5\2\0\2\5\2\0\4\5\1\0\10\5\4\5\1\0"+
                  "\1\5\1\0\7\5\1\0\13\5\32\5\32\5\2\5\1\0\4\5"+
                  "\2\0\10\5\1\0\7\5\1\0\32\5\2\5\1\0\4\5\1\0"+
                  "\5\5\1\0\1\5\3\0\7\5\1\0\32\5\32\5\32\5\32\5"+
                  "\32\5\32\5\32\5\32\5\32\5\32\5\32\5\32\5\34\5\2\0"+
                  "\31\5\1\0\31\5\1\0\6\5\31\5\1\0\31\5\1\0\6\5"+
                  "\31\5\1\0\31\5\1\0\6\5\31\5\1\0\31\5\1\0\6\5"+
                  "\31\5\1\0\31\5\1\0\6\5\1\5\1\5\2\0\62\5\u1930\0"+
                  "\32\5\6\0\32\5\6\0\32\5\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u0e85\0";

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
          "\35\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
                  "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
                  "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
                  "\1\30\1\31\1\32\1\33\1\34\1\35\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[60];
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
          "\0\0\0\14\0\30\0\44\0\60\0\74\0\110\0\124"+
                  "\0\140\0\154\0\170\0\204\0\220\0\234\0\250\0\264"+
                  "\0\300\0\314\0\330\0\344\0\360\0\374\0\u0108\0\u0114"+
                  "\0\u0120\0\u012c\0\u0138\0\u0144\0\u0150\0\u015c\0\u0168\0\u015c"+
                  "\0\u015c\0\u015c\0\u0174\0\u015c\0\u015c\0\u015c\0\u015c\0\u015c"+
                  "\0\u015c\0\u015c\0\u015c\0\u015c\0\u015c\0\u0180\0\u015c\0\u015c"+
                  "\0\u015c\0\u018c\0\u015c\0\u015c\0\u015c\0\u0198\0\u015c\0\u015c"+
                  "\0\u01a4\0\u015c\0\u015c\0\u015c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[60];
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
          "\1\36\1\37\2\40\2\36\1\41\4\36\1\0\1\36"+
                  "\1\37\2\40\3\36\1\42\3\36\1\0\1\36\1\37"+
                  "\2\40\1\36\1\43\5\36\1\0\1\36\1\37\2\40"+
                  "\4\36\1\44\1\42\1\36\1\0\1\36\1\37\2\40"+
                  "\5\36\1\45\1\36\1\0\1\36\1\37\2\40\3\36"+
                  "\1\46\3\36\1\0\1\36\1\37\2\40\2\47\2\36"+
                  "\1\50\2\36\1\0\1\36\1\37\2\40\2\47\5\36"+
                  "\1\0\1\36\1\37\2\40\4\36\1\50\1\51\1\36"+
                  "\1\0\1\36\1\37\2\40\5\36\1\52\1\36\1\0"+
                  "\1\36\1\37\2\40\2\36\1\53\4\36\1\0\1\36"+
                  "\1\37\2\40\2\36\1\54\3\36\1\55\1\0\1\36"+
                  "\1\37\2\40\2\36\1\54\4\36\1\0\1\36\1\37"+
                  "\2\40\1\36\1\56\5\36\1\0\1\36\1\37\2\40"+
                  "\5\36\1\57\1\36\1\0\1\36\1\37\2\40\2\60"+
                  "\5\36\1\0\1\36\1\37\2\40\5\36\1\61\1\36"+
                  "\1\0\1\36\1\37\2\40\1\36\1\62\5\36\1\0"+
                  "\1\36\1\37\2\40\6\36\1\63\1\0\1\36\1\37"+
                  "\2\40\7\36\1\0\1\36\1\37\2\40\5\36\1\64"+
                  "\1\55\1\0\1\36\1\37\2\40\5\36\1\65\1\36"+
                  "\1\0\1\36\1\37\2\40\1\36\1\66\5\36\1\0"+
                  "\1\36\1\37\2\40\5\36\1\67\1\36\1\0\1\36"+
                  "\1\37\2\40\3\36\1\70\3\36\1\0\1\36\1\37"+
                  "\2\40\1\36\1\71\2\36\1\72\2\36\1\0\1\36"+
                  "\1\37\2\40\1\36\1\71\5\36\1\0\1\36\1\37"+
                  "\2\40\4\36\1\72\1\73\1\36\1\0\1\36\1\37"+
                  "\2\40\6\36\1\74\17\0\1\40\16\0\1\43\13\0"+
                  "\1\56\13\0\1\62\13\0\1\66\13\0\1\71\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[432];
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
          "Unknown internal scanner error",
          "Error: could not match input",
          "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
          "\35\0\1\11\1\1\3\11\1\1\12\11\1\1\3\11"+
                  "\1\1\3\11\1\1\2\11\1\1\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[60];
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
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  Solution sol = new Solution();
  State startEdge = new State();
  char edge;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Flexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /**
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 3102) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
              zzBuffer, 0,
              zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
          { System.err.println("Syntax error");
            System.exit(0);
          }
          case 31: break;
          case 2:
          {
          }
          case 32: break;
          case 3:
          { yybegin(STARTK);
          }
          case 33: break;
          case 4:
          { yybegin(ELEMK);
          }
          case 34: break;
          case 5:
          { //TODO: process state
//    System.out.println("State: " + yytext());
            State state = new State();
            state.name = yytext();
            sol.stateList.add(state);
            yybegin(STOPK);
          }
          case 35: break;
          case 6:
          { yybegin(SEPKS);
          }
          case 36: break;
          case 7:
          { yybegin(STARTS);
          }
          case 37: break;
          case 8:
          { //TODO: Done K, starting Sigma
//    System.out.println();
            yybegin(INITS);
          }
          case 38: break;
          case 9:
          { //TODO: Process symbol
//	System.out.println(yycharat(0));
            sol.alphabet.add(yycharat(0));
            yybegin(STOPS);
          }
          case 39: break;
          case 10:
          { yybegin(SEPSD);
          }
          case 40: break;
          case 11:
          { yybegin(ELEMS);
          }
          case 41: break;
          case 12:
          { //TODO: Done Sigma, starting delta
//    System.out.println();
            yybegin(STARTD);
          }
          case 42: break;
          case 13:
          { yybegin(INITD);
          }
          case 43: break;
          case 14:
          { yybegin(SRCT);
          }
          case 44: break;
          case 15:
          { yybegin(SEPDS);
          }
          case 45: break;
          case 16:
          { //TODO: Process source
//    System.out.println("Transition from " + yytext());
            startEdge.name = yytext();
            yybegin(SEPSST);
          }
          case 46: break;
          case 17:
          { yybegin(SYMT);
          }
          case 47: break;
          case 18:
          { //TODO: process symbol
//    System.out.println("Transition on " + yycharat(0));
            edge = yycharat(0);
            yybegin(SEPSDT);
          }
          case 48: break;
          case 19:
          { yybegin(DESTT);
          }
          case 49: break;
          case 20:
          { //TODO: Process destination
//    System.out.println("Transition to " + yytext());
            sol.adjMap.put(new Pair<State, Character>(new State(startEdge), edge), new State(yytext()));
//    System.out.println("from " + startEdge + " on " + edge + " end " + yytext());
//    System.out.println();
            yybegin(ENDT);
          }
          case 50: break;
          case 21:
          { yybegin(STOPD);
          }
          case 51: break;
          case 22:
          { yybegin(ELEMD);
          }
          case 52: break;
          case 23:
          { yybegin(SS);
          }
          case 53: break;
          case 24:
          { //TODO: Process start state
//    System.out.println("Start state " + yytext());
            sol.start.name = yytext();
            yybegin(SEPSF);
          }
          case 54: break;
          case 25:
          { yybegin(STARTF);
          }
          case 55: break;
          case 26:
          { yybegin(INITF);
          }
          case 56: break;
          case 27:
          { //TODO: Process final state
//    System.out.println("Final state " + yytext());
            sol.end.add(new State(yytext()));
            yybegin(STOPF);
          }
          case 57: break;
          case 28:
          { yybegin(ENDDFA);
          }
          case 58: break;
          case 29:
          { yybegin(ELEMF);
          }
          case 59: break;
          case 30:
          { return 0;
          }
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
