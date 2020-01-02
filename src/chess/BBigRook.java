//SOROUSH AGHAJANI
package chess;

import static chess.Move.counter;
import static chess.Move.isEmpty;

/**
 *
 * @author aghaj
 */
public class BBigRook extends Move {
      
  private  int i;
    private  int j;
    protected void move(int i, int j, boolean turn ,Move bigRook){
        counter++;
         if ( !globTurn && getXPos() == i && getYPos() < j && j < 8 && j >= 0 && isMovable(i, j, bigRook)  && notPinned(this.i,this.j,i,j) &&  isEmpty(i,j) ) {
            marker(i, j, bigRook);
               bbigCastlable = false;
               moveAllowed = true ;

        } 
        else if ( !globTurn && getXPos() == i && getYPos() > j && j < 8 && j >= 0 && isMovable(i, j, bigRook)  && notPinned(this.i,this.j,i,j) &&  isEmpty(i,j) ) {
            marker(i, j, bigRook);
               bbigCastlable = false;
               moveAllowed = true ;
        } 
        // inja be baad

        else if(!globTurn &&getYPos() == j &&   getXPos() > i && i < 8 && i >= 0 &&isMovable(i,j,bigRook)&&   isEmpty(i,j) && notPinned(this.i,this.j,i,j)  ){
        marker(i,j,bigRook);
           bbigCastlable = false;
           moveAllowed = true ;
        }
             else if(!globTurn &&getYPos() == j &&  getXPos() < i  && i < 8 && i >= 0 &&isMovable(i,j,bigRook)&& isEmpty(i,j) && notPinned(this.i,this.j,i,j) ){
        marker(i,j,bigRook);
          bbigCastlable = false;
          moveAllowed = true ;
        }
                else if(!globTurn &&getYPos() == j &&  getXPos() > i && i < 8 && i >= 0 &&isMovable(i,j,bigRook)&& notPinned(this.i,this.j,i,j) &&  isOpp(i,j) ){
        hit(i,j,this.i,this.j, bigRook);
        moveAllowed = true ;
      bbigCastlable = false;
      captured = true;
                }
                 else if(!globTurn &&getYPos() == j &&  getXPos() < i && i < 8 && i >= 0 &&isMovable(i,j,bigRook)&& notPinned(this.i,this.j,i,j) &&  isOpp(i,j) ){
        hit(i,j,this.i,this.j, bigRook);
          bbigCastlable = false;
          moveAllowed = true ;
          captured = true;
                }
              else if(!globTurn &&getXPos()==i && getYPos() < j  && j < 8 && j >= 0 &&isMovable(i,j,bigRook)&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
            hit(i,j,this.i,this.j, bigRook);
              bbigCastlable = false;
              moveAllowed = true ;
              captured = true;
              }
                        else if(!globTurn &&getXPos()==i &&  getYPos() > j && j < 8 && j >= 0 &&isMovable(i,j,bigRook)&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
            hit(i,j,this.i,this.j, bigRook);
            moveAllowed = true ;
               bbigCastlable = false;
               captured = true;
              }
    }
        // men baad man bad
       
    





    @Override
    protected int getXPos() {
return this.i;
    }

    @Override
    protected int getYPos() {

return this.j;
    }


     protected boolean isMovable(int i,int j, Move bigRook){
         System.out.println("the this.i for rook is: " +this.i +"and this.j is  " + this.j);
         boolean isempty = false;
         if(getXPos() < i && getYPos() == j){
             if(getXPos()+1 == i&&(isOpp(i,j)||isEmpty(i,j)||board[i][j]instanceof King))
                 return true;
           System.out.println("gamon konam tu hamin kossher miad ");
        for(int d = getXPos()+1 ; d < i; d++ ){
            if(!isEmpty(d,j)){
                isempty = false;
                break;
            }          
            isempty = true;
        }
         }
       else if(getXPos() > i && getYPos() == j){
           if(getXPos()-1 == i&&(isOpp(i,j)||isEmpty(i,j)||board[i][j]instanceof King))
                 return true;
           System.out.println("gamon konam tu hamin kossher miad ");
        for(int d = getXPos() - 1 ; d > i; d-- ){
            if(!isEmpty(d,j)){
                isempty = false;
                break;
            }                
            isempty = true;
        }
         }
                else if(getYPos() < j && getXPos() == i){
                    if(getYPos()+1 == j&&(isOpp(i,j)||isEmpty(i,j)||board[i][j]instanceof King))
                 return true;
                  System.out.println("gamon konam tu hamin kossher miad ");
        for(int d = getYPos() +1 ; d < j; d++ ){
            if(!isEmpty(i,d)){
                isempty = false;
                break;
            }                
            isempty = true;
        }
         }
                else if(getYPos() > j && getXPos() == i){
                    if(getYPos()-1 == j&&(isOpp(i,j)||isEmpty(i,j)||board[i][j]instanceof King))
                 return true;
                        System.out.println("gamon konam tu hamin kossher miad. dg gamon nemikhad malome");
        for(int d = getYPos() - 1 ; d > j; d-- ){
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
