//SOROUSH AGHAJANI
package chess;

/**
 *
 * @author aghaj
 */
public class Pawn extends Move {
    //MoveInstable moves = new MoveInstable();
    private  int i ;
    private  int j ;
    boolean movable;
    boolean isKing;
    boolean isUnpasan;
    
    private void Promotion(int i,int j,Move pawn){
        whiteProm = true;
            //pawn = new Queen();
            //Queen newQueen =  new Queen();
            board[i][j] = new Queen();
           board[i][j].setXPos(i);
            board[i][j].setYPos(j);
            
        
        
    }
    protected boolean isMovable(int i, int j,Move pawn){
       
        boolean isempty = false;
        if((this.j-j==-1&&Math.abs(this.i - i)==1)&&((isOpp(i,j))||board[i][j] instanceof BKing))
            return true;
         if(i== pawn.getXPos()){
        for(int d = j; d > pawn.getYPos();d--){
            if(!isEmpty(i,d)){
                isempty = false;
                break;
               
            }
             isempty = true;
        }}
        return isempty;
    }

    private boolean isUnpasan(){
        return isUnpasan;
    }
    private void unpasan(){
        
    }
     @Override
    public void move(int i, int j, boolean color, Move pawn){
        
        if(globTurn&&i==  pawn.getXPos() && (j == 3 || j ==2)&& notPinned(this.i,this.j,i,j)&& isMovable(i,j,pawn)&& !isOpp(i,j)){
        marker(i,j,pawn);
          moveAllowed = true ;
    }
        else if(globTurn&&i== pawn.getXPos()&& j == pawn.getYPos()+1 &&  j<8 && j >3&& notPinned(this.i,this.j,i,j) && isMovable(i,j,pawn)&& !isOpp(i,j) ){
        marker(i,j,pawn);
        if( j == 7){
            Promotion(i,j,pawn);
           // globTurn = true;
           
          if(!globTurn&&isCheck(BXP,BYP,false)&&isCheckMate()){
          System.out.println("White won the game");
        whiteWon = true;
        }
        }
          moveAllowed = true ;
    }
        else if(globTurn&&((getXPos() +1) == i || i == (getXPos() - 1)) && j ==(getYPos()+1) && isOpp(i,j) && notPinned(this.i,this.j,i,j) ){
            hit(i,j,this.i,this.j,pawn);
                   if( j == 7){
            Promotion(i,j,pawn);

                             if(!globTurn&&isCheck(BXP,BYP,false)&&isCheckMate()){
          System.out.println("White won the game");
        whiteWon = true;}}
                     moveAllowed = true ;
                     captured = true;
        }
        else if(globTurn&&isUnpasan()){
            unpasan();
        }
        else 
            wrongMove();
    }

         
  

    @Override
    protected int getXPos() {
        
        return i;
    }

    @Override
    protected int getYPos() {
        return j;
    }

    @Override
    protected void setXPos(int i) {
        
       this.i =i;
    }

    @Override
    protected void setYPos(int j) {
        this.j = j;
    }








}
