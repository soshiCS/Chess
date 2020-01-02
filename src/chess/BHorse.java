//SOROUSH AGHAJANI

package chess;

/**
 *
 * @author aghaj
 */
public class BHorse extends Move {

 private  int i;
    private  int j;
    
    protected boolean isMovable(int i, int j,Move horse){
        boolean isempty= false;
        if(isEmpty(i,j)|| board[i][j] instanceof King || isOpp(i,j) ){
            if((Math.abs(this.i - i) == 2 &&Math.abs(this.j - j)==1) ||(Math.abs(this.j - j) == 2 &&Math.abs(this.i - i)==1) )
        isempty = true;
        }
        return isempty;
    }
    public void move(int i,int j,boolean color,Move BHorse){
        System.out.println(" i is : " + i + " j is : "+ j + "and color of pice is : " + ColorOfPice[i][j] + "piece is : "+board[i][j] + " boolean is " + empty[i][j] + " and board is " + board [getXPos()][getYPos()] +"  " + empty[getXPos()][getYPos()]+ " and color " + ColorOfPice[getXPos()][getYPos()] );
        if(!globTurn &&(getXPos()+ 2) == i && (getYPos()+1) == j&& ColorOfPice[i][j] == 0&& notPinned(this.i,this.j,i,j)){
            marker(i,j,BHorse);
        moveAllowed = true ;
        }
        else if(!globTurn &&(getXPos()+ 2) == i && (getYPos()-1) == j&&ColorOfPice[i][j] == 0&& notPinned(this.i,this.j,i,j)){
            marker(i,j,BHorse);
        moveAllowed = true ;}
        else if(!globTurn &&(getXPos()+ 1) == i && (getYPos()+2) == j&&  ColorOfPice[i][j] == 0&&notPinned(this.i,this.j,i,j)){
            marker(i,j,BHorse);
        moveAllowed = true ;
        }
        else if(!globTurn &&(getXPos()+ 1) == i && (getYPos()-2) == j&&ColorOfPice[i][j] == 0&& notPinned(this.i,this.j,i,j)){
            marker(i,j,BHorse);
        moveAllowed = true ;
        }
        else if(!globTurn &&(getXPos()- 2) == i && (getYPos()-1) == j&& ColorOfPice[i][j] == 0&&notPinned(this.i,this.j,i,j)){
            marker(i,j,BHorse);
        moveAllowed = true ;
        }
        else if(!globTurn &&(getXPos()- 2) == i && (getYPos()+1) == j&& ColorOfPice[i][j] == 0&& notPinned(this.i,this.j,i,j)){
            marker(i,j,BHorse);
        moveAllowed = true ;
        }
        else if(!globTurn &&(getXPos()- 1) == i && (getYPos()-2) == j&&ColorOfPice[i][j] == 0&& notPinned(this.i,this.j,i,j)){
            marker(i,j,BHorse);
        moveAllowed = true ;
        }
        else if(!globTurn &&(getXPos()- 1) == i && (getYPos()+2) == j&& ColorOfPice[i][j] == 0&& notPinned(this.i,this.j,i,j)){
            marker(i,j,BHorse);
            moveAllowed = true ;
        }
               else if(!globTurn &&(getXPos()+ 2) == i && (getYPos()+1) == j&& notPinned(this.i,this.j,i,j)&&isOpp(i,j)){
            hit(i,j,this.i,this.j,BHorse);
               moveAllowed = true ;
               captured = true;}
        else if(!globTurn &&(getXPos()+ 2) == i && (getYPos()-1) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
            hit(i,j,this.i,this.j,BHorse);
        moveAllowed = true ;
        captured = true;}
        else if(!globTurn &&(getXPos()+ 1) == i && (getYPos()+2) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,BHorse);
        moveAllowed = true ;
        captured = true;
        }
        else if(!globTurn &&(getXPos()+ 1) == i && (getYPos()-2) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
            hit(i,j,this.i,this.j,BHorse);
        moveAllowed = true ;
        captured = true;
        }
        else if(!globTurn &&(getXPos()- 2) == i && (getYPos()-1) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,BHorse);
        moveAllowed = true ;
        captured = true;
        }
        else if(!globTurn &&(getXPos()- 2) == i && (getYPos()+1) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,BHorse);
        moveAllowed = true ;
        captured = true;
        }
        else if(!globTurn &&(getXPos()- 1) == i && (getYPos()-2) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,BHorse);
        moveAllowed = true ;
        captured = true;
        }
        else if(!globTurn &&(getXPos()- 1) == i && (getYPos()+2) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,BHorse);
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
