//SOROUSH AGHAJANI

package chess;

/**
 *
 * @author aghaj
 */
public class BPawn  extends Move{
        private  int i ;
    private  int j ;
    boolean movable;
    boolean isKing;
    boolean isUnpasan;
    
    private void Promotion(int i,int j,Move pawn){
        blackProm = true;
           board[i][j] = new BQueen();
           board[i][j].setXPos(i);
            board[i][j].setYPos(j);
    }
    protected boolean isMovable(int i, int j,Move pawn){
       
              if((this.j-j==1&&Math.abs(this.i - i)==1&&(isOpp(i,j)||board[i][j] instanceof King )))
            return true;
        boolean isempty = false;
        if(i== pawn.getXPos()){
        for(int d = j; d < pawn.getYPos();d++){
            
            if(!isEmpty(i,d)){

                isempty = false;
                break;
               
            }
            isempty = true;
        }}
        return isempty;
    }

    private void unpasan(){
        
    }
     @Override
    public void move(int i, int j, boolean color, Move pawn){
        // Moshkelesh az isMovable() hast
        
        if(!globTurn &&i ==  this.i &&( j == 5 || j ==4)&& isMovable(i,j,pawn)&&   isEmpty(i,j) && notPinned(this.i,this.j,i,j)){

        marker(i,j,pawn);
          moveAllowed = true ;
    }
        else if(!globTurn &&i== getXPos()&& j == getYPos()-1 && j <7 && j >=0&&   isEmpty(i,j) && notPinned(this.i,this.j,i,j) && isMovable(i,j,pawn)){
        marker(i,j,pawn);
        if( j == 0){
            Promotion(i,j,pawn);
                    if(globTurn&&isCheck(WXP,WYP,true)&&isCheckMate()){
            System.out.println("black won the game");
        blackWon = true ;
        }
        }
        
          moveAllowed = true ;
          // pic shoud change to queen
    }
        else if(!globTurn &&(getXPos() +1 == i || i == getXPos()-1) && (getYPos() - 1)==j && isOpp(i,j) && notPinned(this.i,this.j,i,j) ){
            hit(i,j,this.i,this.j,pawn);
                    if( j == 0){
            Promotion(i,j,pawn);
                     if(globTurn&&isCheck(WXP,WYP,true)&&isCheckMate()){
            System.out.println("black won the game");
        blackWon = true ;
        }
              //pic should change to queen             
        }
                     moveAllowed = true ;
                     captured = true;
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
