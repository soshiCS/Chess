// SOROUSH AGHAJANI
package chess;

/**
 *
 * @author aghaj
 */
public class King extends Move{
        private  int i;
    private  int j;

    private boolean neverMoved = true;
     protected void move(int i, int j, boolean turn, Move king){
         if(globTurn&& (Math.abs(getXPos()-i) == 1 || getXPos() == i) && (Math.abs(getYPos() - j )== 1 || getYPos()== j)&& isMovable(i,j,king) && !isOpp(i,j)&&!isWhiteKingCheck(i,j) ){
             marker(i,j,king);
             WXP =i;
             WYP = j;
             neverMoved = false;
               moveAllowed = true ;
         }
         else if(globTurn&& (Math.abs(getXPos()-i) == 1 || getXPos() == i )&& (Math.abs(getYPos() - j )== 1 || getYPos()== j )&&isMovable(i,j,king)&& isOpp(i,j)&&!isWhiteKingCheck(i,j)){
             hit(i,j,this.i,this.j,king);
                          WXP =i;
             WYP = j;
             neverMoved = false;
               moveAllowed = true ;
               captured = true;
         }
         else if(globTurn&&neverMoved && smallCastlable &&!isCheck(WXP,WYP,true)&& !isCheck(5,WYP,true)&&!isCheck(6,WYP,true)&&i == 6){
            smallCastle();
            whiteSmallCastle = true ; 
                         WXP =i;
             WYP = j;
             neverMoved = false;
             //should specify it for gui
               moveAllowed = true ;
         }
         else if(globTurn&& neverMoved && bigCastlable &&!isCheck(WXP,WYP,true)&&!isCheck(2,WYP,true)&&!isCheck(3,WYP,true)&&!isCheck(1,WYP,true)&& i == 2){
             bigCastle();
             whiteBigCastle = true;
                          WXP =i;
             WYP = j;
             neverMoved = false;
               moveAllowed = true ;
             
         }
         else 
             wrongMove();
     }
     

/*
     private boolean isSmallCastlable(){
         boolean bool = false;
         if(neverMoved && smallRCastlable(smallCastlable)){
            bool = true;
         }
         return bool;
     }
     */

    protected boolean isMovable(int i,int j,Move king){
        //check to see if the new place is under the range of opponent
        //check to make sure there is not the same type of pice on that spot

        boolean returnval = false;
        if((Math.abs(i-this.i)==1&&Math.abs(j-this.j) == 1)||(Math.abs(i-this.i)==1&& this.j ==j)||(Math.abs(j-this.j)==1&& this.i ==i)){
        if(isEmpty(i,j)||isOpp(i,j))
            returnval = true;
        
        
        }
return returnval;
}

    @Override
    protected int getXPos() {
return this.i;
    }

    @Override
    protected int getYPos() {
return this.j;    }

    @Override
    protected void setXPos(int i) {
         this.i =i;
    }

    @Override
    protected void setYPos(int j) {
        this.j = j;
    }


}
