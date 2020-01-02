//SOROUSH AGHAJANI
package chess;

import static java.nio.file.Files.move;
import chess.Pawn;

/**
 *
 * @author aghaj
 */

abstract public class Move {
    static boolean whiteProm = false;
    static boolean blackProm = false;
    static boolean whiteWon = false;
    static boolean blackWon = false;
    static boolean organized = false ;
    static boolean captured = false;
    static boolean moveAllowed = false ;
    static boolean whiteSmallCastle = false ;
    static boolean blackSmallCastle = false ;
    static boolean whiteBigCastle = false ;
    static boolean blackBigCastle = false; 
    static boolean  BlackKingShouldMove = false;
    static boolean GameIsOver = false;
static boolean notMate = false;
static boolean WhiteKingShouldMove = false;
    static int WcheckCount;
    static int BcheckCount;
    boolean HorizontalCheck;
    boolean VerticalCheck;
    static int WXP;
    static int WYP;
    static int BXP;
    static int BYP;
    public static int counter = 0;
    static int countdebug;
    static Move[][] board = new Move[8][8];
    static int[][] ColorOfPice = new int[8][8];
    static boolean[][] empty = new boolean[8][8];
    int Xpos;
    int Ypos;
    static boolean globTurn = true;
    // boolean empty;
    boolean oppExist;
    boolean pinned;
    protected boolean smallCastlable = true;
    protected boolean bsmallCastlable = true;
    protected boolean bigCastlable = true;
    protected boolean bbigCastlable = true;
   //public boolean rNeverMoved;
/**
     *  This function is a public void function 
     * so the player can move on that tile
     * THE NEW COM: It is going to place the primery possition of White piece on the boolen and int board.
 */
    static public void truer() {
        for (int m = 0; m < 8; m++) {
            WXP = 4;
            WYP = 0;
            BXP = 4;
            BYP = 7;
            ColorOfPice[m][0] = 1;
            ColorOfPice[m][1] = 1;
            empty[m][0] = false;
            empty[m][1] = false;
           // board[0][0] = bigrook;
            
        }
    }
/**
 *  This function is a public void function
 * It is going to place the primery position of Black piece on the boolen and int board.
 */
    static public void falser() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                empty[col][7] = false;
                empty[col][6] = false;
                ColorOfPice[col][7] = -1;
                ColorOfPice[col][6] = -1;

            }
        }
    }
/**
 * This function empties the whole chess board in the beginning on the boolen board and int board.CHANGE THIS IN NEW PROJECT
 */
    static public void traverser() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                ColorOfPice[r][c] = 0;
                ColorOfPice[r][c] = 0;
                empty[r][c] = true;
                empty[r][c] = true;

            }
        }
    }
/**
 * We are using this function for moving the pieces on the board. we have displayed 
 * each pieces as a node on gridpane.
 * @param i Is the horizental possition of the destination
 * @param j Is the horizental possition of the destination
 * @param move 
 * @param moved Is instance of piece
 */
    abstract protected void move(int i, int j, boolean move, Move moved);
/**
 * IsMovable is checking your move. It checks If the move you are trying to make with associated piece is a legal move in chess or not.
 * @param i Is the horizental possition of the destination
 * @param j Is the horizental possition of the destination
 * @param movable Is instance of piece
 * @return 
 */
    abstract protected boolean isMovable(int i, int j, Move movable);
/**
 * * Gets the X position Of the gridpane.
 * @return 
 */
    abstract protected int getXPos();
/**
 *  Gets y position of the gridpane.
 * @return  
 */
    abstract protected int getYPos();
    /**
     *  It checks if the destination block of tile is empty or is occupied with any piece.
     * @param i Is the horizental possition of the destination
     * @param j Is the horizental possition of the destination
     * @return 
     */
    static public boolean isEmpty(int i, int j) {
//if(ColorOfPice[i][j]==0)
  //  return true;
//else return false;

/*
if(ColorOfPice[i][j] == 0)
        return true;
else 
    return false;*/

return empty[i][j];
//if(board[i][j] instanceof Move)
  //  return false;
//else return true;
    }

/**
 * this function checks if the user makes a move and if there is any opponent 
 * is occupying the place if it is then it returns true
 * @param i Is the horizental possition of the destination
 * @param j Is the horizental possition of the destination
 * @return 
 */
    protected boolean isOpp(int i, int j) {
        boolean opp = false;
        if (globTurn && ColorOfPice[i][j] == -1) {
            opp = true;
        } else if (!globTurn && ColorOfPice[i][j] == 1) {
            opp = true;
        } else {
           opp = false;
        }

        return opp;
    }
/**
 * it makes the move of the piece from point i to j
 * @param i Is the horizental possition of the destination
 * @param j Is the horizental possition of the destination
 * @param move  
 */
    public void marker(int i, int j, Move move) {
//System.out.println("counter is "+ counter);
        int s = move.getXPos();
        int b = move.getYPos();
    
        // empty[move.getXPos()][move.getYPos()] = true;
        
        board[i][j] = move;
        empty[i][j] = false;
    ColorOfPice[i][j] =ColorOfPice[s][b];
    ColorOfPice[s][b] =0;
        //System.out.println("previous pice color is " + ColorOfPice[s][b]);
           // Sorakh injaaaaaaaaaaaaaaaaaaaaaast
if(!(s==0&&b==0)){
        board[s][b] = null;
        empty[s][b] = true;
}
        if (globTurn && ColorOfPice[s][b] == 1) {

            ColorOfPice[i][j] = 1;

        } else if (globTurn && ColorOfPice[s][b] == 2) {
            ColorOfPice[i][j] = 2;
        } else if (!globTurn && ColorOfPice[s][b] == -1) {
            ColorOfPice[i][j] = -1;
        } else if (!globTurn && ColorOfPice[s][b] == -2) {
            ColorOfPice[i][j] = -2;
        }

        move.setYPos(j);
        move.setXPos(i);
        if (globTurn) {
            globTurn = false;
        } else {
            globTurn = true;
        }
        //bug injas
        if(!globTurn&&isCheck(BXP,BYP,false)&&isCheckMate()){
          System.out.println("White won the game");
        whiteWon = true;
        }
        else if(globTurn&&isCheck(WXP,WYP,true)&&isCheckMate()){
            System.out.println("black won the game");
        blackWon = true ;
        }
  
    }
    /**
      * set X position on the gridpane.
     * @param i  
     */
    abstract protected void setXPos(int i);
/**
 * set Y position on the gridpane.
 * @param j 
 */
    abstract protected void setYPos(int j);
/**
  * this function capture the opponents piece
 * @param i Is the horizental possition of the destination
 * @param j Is the horizental possition of the destination
 * @param a The horrizontal possition of the captured piece 
 * @param b the vertical possition of the captured piece
 * @param move  
 */
    protected void hit(int i, int j, int a, int b, Move move) {
        board[i][j] = board[a][b];
        marker(i, j, move);
    }
    /**
     * It checks if the king is check by the opponent or not.
     * @param xp horrizontal possition of king
     * @param yp vertical possitionn of king
     * @param turn True checks for white 
     * @return 
     */
static boolean isCheck(int xp,int yp, boolean turn){
    int checkCounter = 0;
  boolean  returnVal = false;
  int coun = 0;
  WhiteKingShouldMove = false;
  BlackKingShouldMove = false;
    if(turn == true){
        for(int i = 0; i < 8;i++){
            for( int j = 0;j < 8;j++){

                if(ColorOfPice[i][j] == -1&&  !(board[i][j] instanceof BPawn)){
                                   //  System.out.println("inisde white check" + coun);
                 coun++;

                   if (board[i][j]!=null && board[i][j].isMovable(xp,yp,board[i][j])){
                      System.out.println(i+" kishesh karde"+j);
                       checkCounter++;
                       return true;
                                      /*    returnVal = true;
                                      if(checkCounter >1 ){
                    WhiteKingShouldMove = true;
                   break;
                                       }*/
                   }
                }
                else if(ColorOfPice[i][j]==-1&&board[i][j] instanceof BPawn){
                    if(board[i][j].getXPos()>0&&WXP == board[i][j].getXPos()-1&&WYP == board[i][j].getYPos()-1||board[i][j].getXPos()<7&&WXP == board[i][j].getXPos()+1&&WYP == board[i][j].getYPos()-1){
                     return true;
                        /*
                        returnVal = true;
                    checkCounter++;
                      if(checkCounter >1 ){
                    WhiteKingShouldMove = true;
                   break;
                                       }*/
                    }
                }
            }
        }
    } else if(turn==false){
        for(int y = 0; y < 8;y++){
            for( int u = 0;u < 8;u++){
                
                if(ColorOfPice[y][u] == 1 && !(board[y][u]instanceof Pawn) && checkCounter < 2){
                      // System.out.println("inside black check" );

                       if(board[y][u].isMovable(xp,yp,board[y][u])){
                        //     System.out.println(board[y][u]);
                        //   checkCounter++;
                           return true;
                  /* returnVal = true;
                        if(checkCounter >1 ){
                         
                    BlackKingShouldMove = true;
                break;
                }*/
                }
                        }                else if(ColorOfPice[y][u]==1 &&board[y][u] instanceof Pawn){
                    if((board[y][u].getXPos()>0&&BXP == board[y][u].getXPos()-1&&BYP == board[y][u].getYPos()+1)||(board[y][u].getXPos()<7&&BXP == board[y][u].getXPos()+1&&BYP == board[y][u].getYPos()+1)){
                        returnVal = true;
                    checkCounter++;
                      if(checkCounter >1 ){
                    BlackKingShouldMove = true;
                   break;
                                       }
                    }
                }
                
                        }

        }
    }
    return returnVal;
}
/* the isBlackCheck function is temporary 
public boolean isBlackCheck(){
   int counter =0; 
    boolean blackCheck = false;
    for(int d = 0; d < 8;d++){
        for(int p=0; p<8;p++){
                           
                            
                             
            if(ColorOfPice[d][p] == 1){
System.out.println("are miad afarin "+ ""+counter);
counter++;
if(board[d][p].isMovable(BXP,BYP,board[d][p]))
                blackCheck = false;
            }
        }
    }
    return blackCheck;
}*/
/**
 * It checks if the king is being checkmate by the opponent or not.
 * @return 
 */
    public boolean isCheckMate() {
        System.out.println("asan inja nemiad dada manmikham az 10 angosht bara type estefade konam");
        boolean bool = true;
        if (globTurn) {
                       
            if(WXP +1 <8&&WYP+1<8&&(isEmpty(WXP + 1,WYP+1)||isOpp(WXP + 1,WYP+1))&& !isWhiteKingCheck(WXP + 1,WYP+1))
                bool = false;
            else if(bool == true && WXP+1 < 8&&(isEmpty(WXP +1, WYP)||isOpp(WXP +1, WYP))&& !isWhiteKingCheck(WXP +1, WYP))
              bool = false;
            else if(bool == true &&WXP + 1 <8&&WYP-1>-1&&(isEmpty(WXP +1, WYP-1)||isOpp(WXP +1, WYP-1))&&!isWhiteKingCheck(WXP +1,WYP-1))
               bool = false;
            else if(bool == true &&WYP-1>-1&&(isEmpty(WXP , WYP-1)||isOpp(WXP , WYP-1))&&!isWhiteKingCheck(WXP,WYP-1))
                bool = false;
            else if(bool == true &&WYP+1<8&&(isEmpty(WXP , WYP+1)||isOpp(WXP , WYP+1))&&!isWhiteKingCheck(WXP,WYP+1))
                bool = false;
            else if(bool == true &&WXP-1>-1 && WYP-1 >-1&&(isEmpty(WXP -1, WYP-1)||isOpp(WXP -1, WYP-1))&&!isWhiteKingCheck(WXP-1,WYP-1))
                    bool = false;
            else if(bool == true &&WXP-1 > -1 &&(isEmpty(WXP -1, WYP)||isOpp(WXP -1, WYP))&&!isWhiteKingCheck(WXP-1,WYP))
                bool = false;
            else if(bool == true &&WXP-1 > -1&&WYP+1<8&&(isEmpty(WXP -1, WYP+1)||isOpp(WXP -1, WYP+1))&&!isWhiteKingCheck(WXP-1,WYP+1))
               bool = false;
                
                if(bool == true && !WhiteKingShouldMove){
                    
            for (int d = 0; d < 8; d++) 
                for (int m = 0; m < 8; m++) {
                    if (bool&&ColorOfPice[d][m] == -1  && !(board[d][m] instanceof BHorse) && board[d][m].isMovable(WXP, WYP, board[d][m])) {
                        if (bool&&WXP > d && WYP > m) {
                            for (int q = 0; q < 8; q++) {
                                for (int b = 0; b < 8; b++) {
                                    if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinnedCheckMate(q, b,WXP-1,WYP-1)) {
                                        int p = WYP - 1;
                                        for (int t = WXP - 1; t >= d; t--) {
                                            if (bool&&board[q][b].isMovable(t, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                        }
                                        p--;
                                    }
                                }
                            }
                        
                        } else if (WXP < d && WYP < m) {
                            for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                    if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinnedCheckMate(q, b,WXP+1,WYP+1)) {
                                        
                                        int p = WYP + 1;
                                        for (int t = WXP + 1; t <= d; t++) {
                                            if (bool&&board[q][b].isMovable(t, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                            p++;
                                        }
                                    }
                                }
                          

                        }
                        else if (WXP < d && WYP > m) {
                           for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                    if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinnedCheckMate(q,b,WXP+1,WYP-1)) {
     
                                        int p = WYP - 1;
                                         for (int t = WXP + 1; t <= d; t++) {
                                            if (bool&&board[q][b].isMovable(t, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                            p--;
                                        }
                                    }
                                }
                        } else if (WXP > d && WYP < m) {
                        for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                    System.out.println("joon");
                                          if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinnedCheckMate(q,b,WXP-1,WYP+1)) {
                                        int p = WYP + 1;
                                        for(int t = WXP-1; t>=d;t--)
                                            if (bool&&board[q][b].isMovable(t, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                            p++;
                                }
                        }
                        
                }else if(WXP == d && WYP > m){
                    for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                    if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinnedCheckMate(q, b,WXP,WYP-1)) {
                                         for(int p = m; p<WYP;p++)
                                            if (bool&&board[q][b].isMovable(d, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                    }
                                }
                    
                }else if(WXP == d && WYP < m){
                    System.out.println("man az khodam darraftam na to ");
                 for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                  if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinnedCheckMate(q, b,WXP,WYP+1)) {
                                         for(int p = WYP+1; p<=m;p++)
                                            if (bool&&board[q][b].isMovable(d, p, board[q][b])) {
                                                System.out.println(" q is " + q +" and b is " + b );
                                                bool = false;
                                                break;
                                            }
                                    }
                                
                                }
                
                }else if(WXP > d && WYP == m){
                 for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                             if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinnedCheckMate(q, b,WXP-1,WYP)) {
                                         for(int p = WXP-1; p>=d;p--)
                                            if (bool&&board[q][b].isMovable(p, m, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                    }
                                
                                }
                }else if(WXP < d && WYP == m){
                 for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                             if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinnedCheckMate(q, b,WXP+1,WYP)) {
                                         for(int p = d; p>WXP;p--)
                                            if (bool && board[q][b].isMovable(p, m, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                    }
                                
                
                                }}
                
                    }
                    else if(bool&&ColorOfPice[d][m] == -1 &&(board[d][m] instanceof BHorse) && board[d][m].isMovable(WXP, WYP, board[d][m])){
                          for (int q = 0; q < 8; q++) {
                                for (int b = 0; b < 8; b++) {
                                   if (bool&&ColorOfPice[q][b] == 1 && !(board[q][b] instanceof King) && notPinned(q, b,d,m)&&board[q][b].isMovable(d,m,board[q][b])){
                                       
                                    bool = false;
                                       break;
                                   }
                    }}}
                }}
       
        }
        // since here on we check to see if black is check
        //**
        //**
        //**
        else if (!globTurn) {
       
            if(BXP+1<8&&BYP+1<8&&(isEmpty(BXP+1,BYP+1)||ColorOfPice[BXP+1][BYP+1] == 1) &&!isBlackKingCheck(BXP + 1,BYP+1)){
                
                bool = false;

            }
            else if(bool == true && BXP+1<8&&(isEmpty(BXP+1,BYP)||ColorOfPice[BXP+1][BYP]==1) &&!isBlackKingCheck(BXP +1, BYP)){

              bool = false;
            }
            else if(bool == true &&BXP+1<8&&BYP-1>-1&&(isEmpty(BXP+1,BYP-1)||ColorOfPice[BXP+1][BYP-1]==1)&&!isBlackKingCheck(BXP +1,BYP-1) ){
                      System.out.println("kharkosde to mikhay begi inja nemiai? " );
               bool = false;

            }
            else if(bool == true&&BYP-1>-1&&(isEmpty(BXP,BYP-1)||ColorOfPice[BXP][BYP-1]==1) &&!isBlackKingCheck(BXP,BYP-1)){
                bool = false;

            }
            else if(bool == true &&BYP+1<8&&(isEmpty(BXP,BYP+1)||ColorOfPice[BXP][BYP+1]==1) &&!isBlackKingCheck(BXP,BYP+1)){
                bool = false;

            }
            else if(bool == true && BXP-1>-1&&BYP-1>-1&&(isEmpty(BXP-1,BYP-1)||ColorOfPice[BXP-1][BYP-1]==1 )&&!isBlackKingCheck(BXP-1,BYP-1)){
         
                    bool = false;

            }
            else if(bool == true &&BXP-1>-1&&(isEmpty(BXP-1,BYP)||ColorOfPice[BXP-1][BYP]==1) &&!isBlackKingCheck(BXP-1,BYP)){
                bool = false;

            }
            else if(bool == true &&BXP-1>-1&&BYP+1<8&&(isEmpty(BXP-1,BYP+1)||ColorOfPice[BXP-1][BYP+1]==1) &&!isBlackKingCheck(BXP-1,BYP+1)){
               bool = false;

            }
                if(bool == true && !BlackKingShouldMove){
System.out.println("azin");
            for (int d = 0; d < 8; d++) 
                for (int m = 0; m < 8; m++) {
                   
                    if (bool&&ColorOfPice[d][m] == 1  && !(board[d][m] instanceof horse) && board[d][m].isMovable(BXP, BYP, board[d][m])) {
System.out.println("nemiad inja bad bakht" + BXP +" and " + BYP +" and d is :" + d + "and  is " + m);
                        if (bool&&BXP > d && BYP > m) {
                             System.out.println("to enqad karet doroste ke niazi nadari be kasi neshon bedi khkh");
                            for (int q = 0; q < 8; q++) {
                                for (int b = 0; b < 8; b++) {
                                    // very Important hint: the notPinned method should not only make previous place empty but also it has to put the pice in new place
                                    if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing)) {
                                        
                                        int p = BYP - 1;
                                        for (int t = BXP - 1; t >= d; t--) {
                                          
                                            if (bool&&board[q][b].isMovable(t, p, board[q][b])) {
                                                 
                                               
                                                bool = false;
                                                break;
                                            }
                                        }
                                        p--;
                                    }
                                }
                            }
                        
                        } else if (BXP < d && BYP < m) {
                           
                            for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                    if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing) && notPinnedCheckMate(q, b,BXP+1,BYP+1)) {
                                        
                                        int p = BYP + 1;
                                        for (int t = BXP + 1; t <= d; t++) {
                                            if (board[q][b].isMovable(t, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                            p++;
                                        }
                                    }
                                }
                          

                        }
                        else if (BXP < d && BYP > m) {
                      System.out.println("miad qatan");
                           for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                    if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing) && notPinnedCheckMate(q, b,BXP+1,BYP-1)) {
                                        int p = BYP - 1;
                                         for (int t = BXP + 1; t <= d; t++) {
                                            if (board[q][b].isMovable(t, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                            p--;
                                        }
                                    }
                                }
                        } else if (BXP > d && BYP < m) {
                        for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                          if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing) && notPinnedCheckMate(q,b,BXP-1,BYP+1)) {
                                        int p = BYP + 1;
                                        for(int t = BXP-1; t>=d;t--)
                                            if (board[q][b].isMovable(t, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                            p++;
                                }
                        }
                        
                }else if(BXP == d && BYP > m){
 
                    for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                    if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing)&& notPinnedCheckMate(q, b,BXP,BYP-1) ) {
                              
                                         for(int p = m; p<BYP;p++)
                                            if (board[q][b].isMovable(d, p, board[q][b])) {
         
                                                bool = false;
                                                break;
                                            }
                                    }
                                }
                    
                }else if(BXP == d && BYP < m){
                
                 for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                  if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing) && notPinnedCheckMate(q, b,BXP,BYP+1)) {
                                         for(int p = BYP; p<=m;p++)
                                            if (board[q][b].isMovable(d, p, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                    }
                                
                                }
                
                }else if(BXP > d && BYP == m){
                 for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                             if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing) && notPinnedCheckMate(q, b,BXP-1,BYP)) {
                                         for(int p = BXP-1; p>=d;p--)
                                            if (board[q][b].isMovable(p, m, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                    }
                                
                                }
                }else if(BXP < d && BYP == m){
                 for (int q = 0; q < 8; q++) 
                                for (int b = 0; b < 8; b++) {
                                             if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing) && notPinnedCheckMate(q, b,BXP+1,BYP)) {
                                         for(int p = d; p>BXP;p--){
                                            if (bool&&board[q][b].isMovable(p, m, board[q][b])) {
                                                bool = false;
                                                break;
                                            }
                                         }
                                    }
                                
                
                                }}
                    } else if(ColorOfPice[d][m] == 1 &&(board[d][m] instanceof horse) && board[d][m].isMovable(BXP, BYP, board[d][m])){
                          for (int q = 0; q < 8; q++) {
                                for (int b = 0; b < 8; b++) {
                                   if (bool &&ColorOfPice[q][b] == -1 && !(board[q][b] instanceof BKing) && notPinned(q, b,d,m)&&board[q][b].isMovable(d,m,board[q][b])){
                                    bool = false;
                                       break;
                                   }
                    }}}
                
                    }}
        }
         return bool;
    }
                    /*else if(turn == false){
                                for(int d = 0;d<8;d++)
                  for(int m = 0;m<8;m++){
              if(ColorOfPice[d][m] == 1&&  (board[d][m] instanceof Queen&&board[d][m].isMovable(BXP, BYP, board[d][m]))){
                  if(BXP> d && BYP >m)
               // MoveShould :     // Move[x] > d &&Move[x] < BXP && Move[y] > m && Move[y] < BYP  && BXP - Move[X] == BYP - Move[y]; 

                   if(true){
                        BcheckCount++;
                     if( board[d][m].isMovable(BXP+1, BYP, board[d][m])||(board[d][m].isMovable(BXP-1, BYP, board[d][m])) )
                         HorizontalCheck = true;
                     if( board[d][m].isMovable(BXP, BYP+1, board[d][m])||(board[d][m].isMovable(BXP, BYP-1, board[d][m])) )
                         VerticalCheck = true;
                     if(BcheckCount == 2)
                       bool = true;
                                break;
                   }
                  }
                  }
              return bool;
          }*/
                
    
    /**
    * this function will only let you move the piece that can save your king after the opponents check move.
     * @param i
     * @param j
     * @param d
     * @param e
     * @return 
     */
    public boolean notPinned(int i, int j,int d, int e) {
        /*
             boolean check = true;
        if(ColorOfPice[i][j] == 1 ){
        empty[i][j] = true;
        empty[d][e] = false;
        ColorOfPice[i][j]= 0;
        ColorOfPice[d][e] = 1 ;
        }else if(ColorOfPice[i][j] == -1 ){
        empty[i][j] = true;
        empty[d][e] = false;
        ColorOfPice[i][j]= 0;
        ColorOfPice[d][e] = -1 ;
        }
        if (globTurn == true&&isCheck(WXP,WYP,globTurn)) {
            check = false;
          //  System.out.println(i +"asb " + j + " "+isCheck(WXP,WYP,true));
        }//else if(globTurn==false&&isCheck(BXP,BYP,globTurn))
        else if(globTurn== false&&isCheck(BXP,BYP,globTurn))
        {
            check = false;
        }
if(ColorOfPice[d][e] ==1 ){
        empty[i][j] = false;
        empty[d][e] = true;
ColorOfPice[i][j] = 1;
ColorOfPice[d][e] = 0 ;
}else if(ColorOfPice[d][e] ==-1 ){
        empty[i][j] = false;
        empty[d][e] = true;
ColorOfPice[i][j] = -1;
ColorOfPice[d][e] = 0 ;
}
        return check;

        
        
        */
        boolean check = true;
        boolean isNotCapture = false ;
        if(ColorOfPice[i][j] == 1 ){
        empty[i][j] = true;
        if(empty[d][e] == true){
        empty[d][e] = false;
                ColorOfPice[i][j]= 0;
        ColorOfPice[d][e] = 1 ;
        isNotCapture = true;
        }else if(empty[d][e] == false){
                 ColorOfPice[i][j]= 0;
        ColorOfPice[d][e] = 1 ;
        }

        }else if(ColorOfPice[i][j] == -1 ){
        empty[i][j] = true;
   if(empty[d][e] == true){
        empty[d][e] = false;
        isNotCapture = true;
           ColorOfPice[i][j]= 0;
        ColorOfPice[d][e] = -1;
        }else if(!empty[d][e] )
                ColorOfPice[i][j]= 0;
        ColorOfPice[d][e] = -1;
        }
        if (globTurn == true&&isCheck(WXP,WYP,globTurn)) {
            check = false;
          //  System.out.println(i +"asb " + j + " "+isCheck(WXP,WYP,true));
        }//else if(globTurn==false&&isCheck(BXP,BYP,globTurn))
        else if(globTurn== false&&isCheck(BXP,BYP,globTurn))
        {
            check = false;
        }
if(ColorOfPice[d][e] ==1 ){
        empty[i][j] = false;
        if(isNotCapture){
        empty[d][e] = true;
        ColorOfPice[d][e] = 0 ;}
        if(!isNotCapture)
            ColorOfPice[d][e] = -1;
        
ColorOfPice[i][j] = 1;

}else if(ColorOfPice[d][e] ==-1 ){
        empty[i][j] = false;
         if(isNotCapture){
        empty[d][e] = true;
        ColorOfPice[d][e] = 0 ;
        
         }
        if(!isNotCapture)
            ColorOfPice[d][e] = 1;         
ColorOfPice[i][j] = -1;

}
        return check;
    }
    /**
     * this function checks if the king is checkmate or no
     * basically pack your bags ;)
     * @param xp
     * @param yp
     * @param xcheck
     * @param ycheck
     * @return 
     */
public boolean notPinnedCheckMate(int xp, int yp,int xcheck,int ycheck){
    boolean bool = true;
boolean save= empty[xcheck][ycheck];
int saved = ColorOfPice[xcheck][ycheck];
Move moveSaved = board[xcheck][ycheck];
    if(ColorOfPice[xp][yp]==1){
        board[xcheck][ycheck] = board[xp][yp];
            empty[xp][yp] = true;
    empty[xcheck][ycheck] = false;
    ColorOfPice[xcheck][ycheck]=1;
    ColorOfPice[xp][yp]=0;
    }
    else if(ColorOfPice[xp][yp]==-1){
         board[xcheck][ycheck] = board[xp][yp];
            empty[xp][yp] = true;
    empty[xcheck][ycheck] = false;
    ColorOfPice[xcheck][ycheck]=-1;
    ColorOfPice[xp][yp]=0;
    }
    if(globTurn == false &&isCheck(BXP,BYP,false))
        bool = false;
    if(globTurn == true &&isCheck(WXP,WYP,true))
        bool =false;
    

    if(ColorOfPice[xcheck][ycheck] == 1){
         board[xcheck][ycheck] = moveSaved;
        ColorOfPice[xcheck][ycheck]=saved;
    ColorOfPice[xp][yp] = 1;
        empty[xp][yp] = false;
    empty[xcheck][ycheck] = save;}
    else if(ColorOfPice[xcheck][ycheck] == -1){
        board[xcheck][ycheck] = moveSaved;
        ColorOfPice[xcheck][ycheck]= saved;
     ColorOfPice[xp][yp] = -1;
        empty[xp][yp] = false;
    empty[xcheck][ycheck] = save;}
    return bool;

}
/**
 * this function checks if the black colored king is checked or no
 * @param bkxp
 * @param bkyp
 * @return 
 */
protected boolean isBlackKingCheck(int bkxp,int bkyp ){
    int savex = BXP;
    int savey = BYP;
    boolean bool ;
     Move bkingholder =  board[BXP][BYP];
    BXP = bkxp;
    BYP = bkyp;
   board[savex][savey] = null;
    ColorOfPice[savex][savey] = 0 ; 
    empty[savex][savey] = true;
     if(isCheck(bkxp,bkyp,false))
         bool = true;
     else
         bool = false;
     
     System.out.println("bool is : " + bool + " BXP is : " + BXP + "BYP is : " + BYP );
     BXP = savex;
     BYP = savey;
     board[BXP][BYP] = bkingholder;
     ColorOfPice[BXP][BYP] = -1;
     empty[BXP][BYP] = false ;
    return bool;
}
/**
 * this function checks if the white colored king is checked or no
 * @param bkxp
 * @param bkyp
 * @return 
 */
protected boolean isWhiteKingCheck(int bkxp,int bkyp ){
    int savex = WXP;
    int savey = WYP;
    boolean bool ;
     Move kingholder =  board[WXP][WYP];
    WXP = bkxp;
    WYP = bkyp;
   board[savex][savey] = null;
    ColorOfPice[savex][savey] = 0 ; 
    empty[savex][savey] = true;
     if(isCheck(bkxp,bkyp,true))
         bool = true;
     else
         bool = false;
     
     System.out.println("bool is : " + bool + " BXP is : " + BXP + "BYP is : " + BYP );
     WXP = savex;
     WYP = savey;
     board[WXP][WYP] = kingholder;
     ColorOfPice[WXP][WYP] = 1;
     empty[WXP][WYP] = false ;
    return bool;
}
    //abstract  public void newPos(int i, int j,Move move);
/**
 * This function is called whenever There is a wrong move being made.
 */
    protected void wrongMove() {
        System.out.println("wrong move");
    }
/**
 * this is one of the special move lets you make smallCastle
 */
    static public void smallCastle() {
        if(globTurn){
        board[4][0].marker(6, 0, board[4][0]);
            globTurn = true;
           board[7][0].marker(5 , 0,board[7][0]);
        
        }        
       else if(!globTurn){
        board[4][7].marker(6, 7,board[4][7]);
            globTurn = false;
           board[7][7].marker(5, 7,board[7][7]);
        
        }  
    }
/**
 * this is one of the special move lets you make bigCastle
 */
    public void bigCastle() {
   if(globTurn){
        board[4][0].marker(2, 0, board[4][0]);
         //   globTurn = true;
          board [3][0] =  board[0][0];
          board[0][0] = null;
          board[3][0].setXPos(3);
          board[3][0].setYPos(0);
          empty [3][0] = false;
          empty[0][0] = true;
          
          ColorOfPice[3][0] = 1;
          ColorOfPice[0][0]= 0;
          //.marker( 2, 0, board[0][0]);
        
        }        
       else if(!globTurn){
        board[4][7].marker(2, 7,board[4][7]);
           // globTurn = false;
           board[3][7] = board[0][7];
           board[0][7] = null;
           board[3][7].setXPos(3);
           board[3][7].setYPos(7);
           empty[3][7] = false;
           empty[0][7] = true;
           ColorOfPice[0][7] = 0;
           ColorOfPice[3][7]= -1;
           //.marker(2, 7,board[7][0]);
        
        }  
    }
}
/*
** notes:
Make sure you fix notPinned Method (it has to give new position to of pice) : Done
unpasan
Upgrading of Pawn : Done
check for Pawn CheckMate : Done
Thats ALL (HOPEFULLY)
*/