//SOROUSH AGHAJANI
package chess;

/**
 *
 * @author aghaj
 */
public class Rook extends Move {
    private  int i;
    private  int j;
    protected void move(int i, int j, boolean turn, Move Rook){
          if ( globTurn&& getXPos() == i && getYPos() < j && j < 8 && j >= 0 && isMovable(i, j, Rook) &&  isEmpty(i,j) && notPinned(this.i,this.j,i,j)  ) {
            marker(i, j, Rook);
            smallCastlable = false;
              moveAllowed = true ;
        } 
        else if ( globTurn&& getXPos() == i && getYPos() > j && j < 8 && j >= 0 && isMovable(i, j, Rook) &&  isEmpty(i,j) && notPinned(this.i,this.j,i,j)  ) {
            marker(i, j, Rook);
            smallCastlable = false;
              moveAllowed = true ;
        } 
        // inja be baad

        else if(globTurn&&getYPos() == j &&   getXPos() > i && i < 8 && i >= 0 &&isMovable(i,j,Rook) &&  isEmpty(i,j)&& notPinned(this.i,this.j,i,j)  ){
        marker(i,j,Rook);
        smallCastlable = false;
          moveAllowed = true ;
        }
             else if(globTurn&&getYPos() == j &&  getXPos() < i  && i < 8 && i >= 0 &&isMovable(i,j,Rook)&&  isEmpty(i,j)&& notPinned(this.i,this.j,i,j) ){
        marker(i,j,Rook);
        smallCastlable = false;
          moveAllowed = true ;
          
        }
                else if(globTurn&&getYPos() == j &&  getXPos() > i && i < 8 && i >= 0 &&isMovable(i,j,Rook)&& notPinned(this.i,this.j,i,j) &&  isOpp(i,j) ){
        hit(i,j,this.i,this.j,Rook);
        smallCastlable = false;
          moveAllowed = true ;
          captured = true;
                }
                 else if(globTurn&&getYPos() == j &&  getXPos() < i && i < 8 && i >= 0 &&isMovable(i,j,Rook)&& notPinned(this.i,this.j,i,j) &&  isOpp(i,j) ){
        hit(i,j,this.i,this.j,Rook);
        smallCastlable = false;
          moveAllowed = true ;
          captured = true;
                }
              else if(globTurn&&getXPos()==i && getYPos() < j  && j < 8 && j >= 0 &&isMovable(i,j,Rook)&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
            hit(i,j,this.i,this.j,Rook);
            smallCastlable = false;
              moveAllowed = true ;
              captured = true;
              }
                        else if(globTurn&&getXPos()==i &&  getYPos() > j && j < 8 && j >= 0 &&isMovable(i,j,Rook)&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
            hit(i,j,this.i,this.j,Rook);
            smallCastlable = false;
              moveAllowed = true ;
              captured = true;
              }
                        else {
                            wrongMove();
                        }
    }
    

    @Override
    protected int getXPos() {
return this.i;
    }

    @Override
    protected int getYPos() {

return this.j;
    }


     protected boolean isMovable(int i,int j,Move Rook){
         boolean isempty = false;
         if(getXPos() < i && getYPos() == j){
             if(getXPos()+1 == i&&(isOpp(i,j)||isEmpty(i,j)||board[i][j]instanceof BKing))
                 return true;
        for(int d = getXPos()+1 ; d < i; d++ ){
            if(!isEmpty(d,j)){
                isempty = false;
                break;
            }                
            isempty = true;
        }
         }
       else if(getXPos() > i && getYPos() == j){
           if(getXPos()-1 == i&&(isOpp(i,j)||isEmpty(i,j)||board[i][j]instanceof BKing))
                 return true;
        for(int d = getXPos()-1 ; d > i; d-- ){
            if(!isEmpty(d,j)){
                isempty = false;
                break;
            }              
            isempty = true;
        }
         }
                else if(getYPos() < j && getXPos() == i){
                    if(getYPos()+1 == j&&(isOpp(i,j)||isEmpty(i,j)||board[i][j]instanceof BKing))
                 return true;
        for(int d = getYPos() + 1 ; d < j; d++ ){
            if(!isEmpty(i,d)){
                isempty = false;
                break;
            }              
            isempty = true;
        }
         }
                else if(getYPos() > j && getXPos() == i){
                    if(getYPos()-1 == j&&(isOpp(i,j)||isEmpty(i,j)||board[i][j]instanceof BKing))
                 return true;
        for(int d = getYPos() -1 ; d > j; d-- ){
            if(!isEmpty(i,d)){
                isempty = false;
                break;
            }              
            isempty = true;
        }
         }
         return isempty;
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
