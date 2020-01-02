//SOROUSH AGHAJANI

package chess;

/**
 *
 * @author aghaj
 */
public class BBishop extends Move {

     private  int i;
    private  int j;
    protected boolean isMovable(int i, int j,Move Bishop){
        boolean isempty = false;
        // if(Math.abs(i-this.i) == 1&& Math.abs(j-this.j)==1&&isOpp(i,j)){
      //       return true;
    //     }
        if(this.i < i && this.j < j&&Math.abs(i-this.i) == Math.abs(j-this.j)){
            isempty = true;
            int p = this.j+1;
            for(int d = this.i +1; d < i ;d++){
                if(!isEmpty(d,p)){
                    
                    isempty = false;
                break;
                }
                isempty= true;
                p++;
            }
        }
        else if (this.i > i && this.j <j&&Math.abs(i-this.i) == Math.abs(j-this.j)){
            isempty = true;
            int p = this.j +1;
            for(int d = this.i -1 ; d> i; d--){
                if(!isEmpty(d,p)){
                    isempty = false;
                    break;
                }
                 isempty= true;
            p++;
        }
        }
        else if(this.i > i && this.j> j&&Math.abs(i-this.i) == Math.abs(j-this.j)){
            isempty = true;
            int q = this.j -1;
            for(int d = this.i -1;d>i;d--){
                if(!isEmpty(d,q)){
                    isempty = false;
                    break;
                }
                q--;
                 isempty= true;
            }
        }
        else if(this.i<i && this.j>j&&Math.abs(i-this.i) == Math.abs(j-this.j)){
            isempty = true;
            int q = this.j -1;
            for(int d = this.i +1; d < i;d++){
                if(!isEmpty(d,q)){
                    isempty = false;
                    break;
                }
                 isempty= true;
            q--;
            }
        }
        return isempty;
    }
    public void move(int i , int j, boolean turn,Move BBishop){
    if( !globTurn &&Math.abs(i - getXPos()) == Math.abs(j - getYPos())&&   isEmpty(i,j) && isMovable(i,j,BBishop)&& notPinned(this.i,this.j,i,j) ){

        marker(i,j,BBishop);
      
moveAllowed = true ;
      
    }
    else if (!globTurn && Math.abs(i - getXPos()) == Math.abs(j - getYPos())&& isOpp(i,j)&& isMovable(i,j,BBishop)&& notPinned(this.i,this.j,i,j)){
        hit(i,j,this.i,this.j,BBishop);

        moveAllowed = true ;
 captured = true;
    }
    else
        wrongMove();
}


    @Override
    protected int getXPos() {
        return this.i;
    }

    @Override
    protected int getYPos() {
return this.j;
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
