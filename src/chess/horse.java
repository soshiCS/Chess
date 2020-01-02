//SOROUSH AGHAJANI
package chess;

/**
 *
 * @author aghaj
 */
public class horse extends Move{
    private  int i;
    private  int j;
    
    protected boolean isMovable(int i, int j,Move horse){

        boolean isempty= false;
        
            if((Math.abs(this.i - i) == 2 &&Math.abs(this.j - j)==1) ||(Math.abs(this.j - j) == 2 &&Math.abs(this.i - i)==1) )
        isempty = true;
        
        return isempty;
    }
    public void move(int i,int j,boolean color,Move horse){
        System.out.println("kharkosde pas chi kar mikoni " + empty[i][j] );
        if(globTurn&& ColorOfPice[i][j] == 0&&(getXPos()+ 2) == i && (getYPos()+1) == j&&notPinned(this.i,this.j,i,j)){
            
            marker(i,j,horse);
          moveAllowed = true ;}
        else if(globTurn&&(getXPos()+ 2) == i && (getYPos()-1) == j&& ColorOfPice[i][j] == 0 && notPinned(this.i,this.j,i,j)){
            marker(i,j,horse);
          moveAllowed = true ;
        }
        else if(globTurn&&(getXPos()+ 1) == i && (getYPos()+2) == j&& ColorOfPice[i][j] == 0 &&notPinned(this.i,this.j,i,j)){
            marker(i,j,horse);  
          moveAllowed = true ;
        }
        else if(globTurn&&(getXPos()+ 1) == i && (getYPos()-2) == j&& ColorOfPice[i][j] == 0 && notPinned(this.i,this.j,i,j)){
            marker(i,j,horse);
          moveAllowed = true ;
        }
        else if(globTurn&&(getXPos()- 2) == i && (getYPos()-1) == j&& ColorOfPice[i][j] == 0 && notPinned(this.i,this.j,i,j)){
            marker(i,j,horse);
          moveAllowed = true ;
        }
        else if(globTurn&&(getXPos()- 2) == i && (getYPos()+1) == j&& ColorOfPice[i][j] == 0 && notPinned(this.i,this.j,i,j)){
            marker(i,j,horse);
          moveAllowed = true ;
        }
        else if(globTurn&&(getXPos()- 1) == i && (getYPos()-2) == j&& ColorOfPice[i][j] == 0 && notPinned(this.i,this.j,i,j)){
            marker(i,j,horse);
          moveAllowed = true ;
        }
        else if(globTurn&&(getXPos()- 1) == i && (getYPos()+2) == j&& ColorOfPice[i][j] == 0 &&notPinned(this.i,this.j,i,j)){
            marker(i,j,horse);
              moveAllowed = true ;
        }
               else if(globTurn&&(getXPos()+ 2) == i && (getYPos()+1) == j&& notPinned(this.i,this.j,i,j)&&isOpp(i,j)){
            hit(i,j,this.i,this.j,horse);
                 moveAllowed = true ;
               captured = true;}
        else if(globTurn&&(getXPos()+ 2) == i && (getYPos()-1) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
            hit(i,j,this.i,this.j,horse);
          moveAllowed = true ;
          captured = true;
        }
        else if(globTurn&&(getXPos()+ 1) == i && (getYPos()+2) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,horse);
               moveAllowed = true ;
               captured = true;
        }
        else if(globTurn&&(getXPos()+ 1) == i && (getYPos()-2) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
            hit(i,j,this.i,this.j,horse);
          moveAllowed = true ;
          captured = true;
        }
        else if(globTurn&&(getXPos()- 2) == i && (getYPos()-1) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,horse);
          moveAllowed = true ;
          captured = true;
        }
        else if(globTurn&&(getXPos()- 2) == i && (getYPos()+1) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,horse);
          moveAllowed = true ;
          captured = true;
        }
        else if(globTurn&&(getXPos()- 1) == i && (getYPos()-2) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,horse);
          moveAllowed = true ;
          captured = true;
        }
        else if(globTurn&&(getXPos()- 1) == i && (getYPos()+2) == j&& notPinned(this.i,this.j,i,j)&& isOpp(i,j)){
             hit(i,j,this.i,this.j,horse);
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
