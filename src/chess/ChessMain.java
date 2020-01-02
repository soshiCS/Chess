
/*
Group Members : Soroush , andy , Antonio , Prashant, jil
*/
package chess;
import static chess.Move.organized;
import static chess.Move.moveAllowed;
import static chess.Move.ColorOfPice;
import static chess.Move.blackBigCastle;
import static chess.Move.blackSmallCastle;
import static chess.Move.whiteProm;
import static chess.Move.blackProm;
import static chess.Move.blackWon;
import static chess.Move.board;
import static chess.Move.captured;
import static chess.Move.empty;
import static chess.Move.falser;
import static chess.Move.traverser;
import static chess.Move.truer;
import static chess.Move.whiteBigCastle;
import static chess.Move.whiteSmallCastle;
import static chess.Move.whiteWon;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author aghaj
 */

public class ChessMain extends Application {
    GridPane pane = new GridPane();
 void myMove (int x1pos , int y1pos,int x2pos, int y2pos ,int seconedtranslationYpos){
    
              if(captured){
                                            System.out.println("kir to kose khar madare harchi adame lashie " + seconedtranslationYpos);
                                            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
                                        }
                                        removeAndPasteNodeByRowColumnIndex2( x1pos, y1pos,x2pos,y2pos,pane);
                                        //   pane.add(imageview,x2pos,seconedtranslationYpos);
                                        if(blackSmallCastle){
                                            
                                            removeNodeByRowColumnIndex2( 7,0, pane);
                                            Image image = new Image("Brook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 5, 0);
                                            
                                        }
                                        
                                        if(blackBigCastle){
                                            
                                            removeNodeByRowColumnIndex2( 0,0, pane);
                                            Image image = new Image("Brook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 3, 0);
                                            
                                        }
                                        if(whiteSmallCastle){
                                            removeNodeByRowColumnIndex2( 7,7, pane);
                                            Image image = new Image("Wrook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 5, 7);
                                        }
                                        if(whiteBigCastle){
                                            removeNodeByRowColumnIndex2( 0,7, pane);
                                            Image image = new Image("Wrook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 3, 7);
                                        }
                                        // removeNodeByRowColumnIndex(p2,re,  pane, buttonOf.get(0) );
                                        if(whiteWon){
                                            
                                            Text text = new Text("white won");
                                            
                                            pane.add(text,9,7);
                                        }
                                        if(blackWon){
                                            
                                            Text text = new Text("black won");
                                            pane.add(text,9,0);
                                        }
                                        if(blackProm){
                                            
                                            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
                                            Image image = new Image("Bqueen.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv,x2pos,seconedtranslationYpos);
                                            
                                            
                                        }
                                        if(whiteProm){
                                            
                                            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
                                            Image image = new Image("Wqueen.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv,x2pos,seconedtranslationYpos);
                                            
                                        }
                                        
    
}
Button startButton = new Button("start");


static boolean allow = false;   
       private DataInputStream  fromServer   = null; 
    private DataOutputStream toServer     = null; 
          static boolean starterbool = false;

private Socket socket = null;
static int turnerequal = -1;
//try {/* */
    
    


      ArrayList<ImageView> buttonOf = new ArrayList<ImageView>();
        ArrayList<Integer> stack = new ArrayList<Integer>();
        //  ArrayList<Node> but = new ArrayList<Node>();
        ArrayList<Integer> orig = new ArrayList<Integer>();
        ArrayList<Integer> positx = new ArrayList<Integer>();
        ArrayList<Integer> posity = new ArrayList<Integer>();
               // GridPane pane = new GridPane();
GridPane grid = new GridPane();

    boolean bol = true;
    /**
     action will be set on the imageview 
     * @param but  
     */
public  void action(ImageView but){
                      if(stack.size()==0){
                          System.out.println(stack.size()+"that is the fucking size");
                          ImageView b= but;
                                    b.addEventHandler(MouseEvent.MOUSE_CLICKED, 
                        new EventHandler<MouseEvent>() {
                           @Override
                           public void handle(MouseEvent event) {
                              action(b);
                           }
                        });
                                 
                        buttonOf.add(b);
                        int p = pane.getRowIndex(but);//correct
                        orig.add(p);
                        int translation = 0;
                        if (p == 0) {
                            translation = 7;
                        } else if (p == 1) {
                            translation = 6;
                        } else if (p == 2) {
                            translation = 5;
                        } else if (p == 3) {
                            translation = 4;
                        } else if (p == 4) {
                            translation = 3;
                        } else if (p == 5) {
                            translation = 2;
                        } else if (p == 6) {
                            translation = 1;
                        } else if (p == 7) {
                            translation = 0;
                        }
                        //  p= translation;
                        int d = pane.getColumnIndex(but);
                        
                        stack.add(translation);
                        stack.add(d);
                     }
                      /*
                      else  if (stack.size() == 2) {
                          int translation=0;
                          
                            int p =pane.getRowIndex(but);
                            
                                            if (p == 0) {
                            translation = 7;
                        } else if (p == 1) {
                            translation = 6;
                        } else if (p == 2) {
                            translation = 5;
                        } else if (p == 3) {
                            translation = 4;
                        } else if (p == 4) {
                            translation = 3;
                        } else if (p == 5) {
                            translation = 2;
                        } else if (p == 6) {
                            translation = 1;
                        } else if (p == 7) {
                            translation = 0;
                        }
                                            int d =pane.getColumnIndex(but);
stack.add(translation);
stack.add(d);
                            int p1 = stack.get(0);
                            int p2 = stack.get(1);
                            int p3 = stack.get(2);
                            int p4 = stack.get(3);
                            //stack.clear();
                            Button buttoRem = buttonOf.get(0);
                            board[p2][p1].move(p4, p3, true, board[p2][p1]);
                           // removeNodeByRowColumnIndex(p2, orig.get(0), pane, buttoRem);
                            System.out.println("move is done");
//orig.clear();
                       //     buttonOf.clear();
                        //stack.clear();

                        }
                      */
                      else {
                            System.out.println("it works");
                        }
    
}
/**
 * Removes the nodes (Image view) at the specifick coloum and row 
 * @param row
 * @param column
 * @param gridPane
 * @param img 
 */
    public void removeNodeByRowColumnIndex( final int row, final int column, GridPane gridPane, ImageView img) {
        ImageView imageView = img;
        ObservableList<Node> childrens = gridPane.getChildren();
        for (Node node : childrens) {

            if (node instanceof ImageView && gridPane.getRowIndex(node) == column && gridPane.getColumnIndex(node) == row) {
                // use what you want to remove
                gridPane.getChildren().remove(img);
                break;
            }
        }
    }
    /**
     * Removes the nodes at the specifick coloum and row 
     * @param row
     * @param column
     * @param gridPane  
     */
    public void removeNodeByRowColumnIndex2( final int row, final int column, GridPane gridPane) {

        ObservableList<Node> childrens = gridPane.getChildren();
        for (Node node : childrens) {

            if (node instanceof ImageView && gridPane.getRowIndex(node) == column && gridPane.getColumnIndex(node) == row) {
                // use what you want to remove
                gridPane.getChildren().remove(node);
                break;
            }
        }
    }
        public void removeAndPasteNodeByRowColumnIndex2( final int row, final int column,int q,int p, GridPane gridPane) {

        ObservableList<Node> childrens = gridPane.getChildren();
           int translation = 0;
           System.out.println("chet bazi injuri nis " + p + "alaki tarafe dude naro dash " + column);
                            if (p == 0) {
                                translation = 7;
                            } else if (p == 1) {
                                translation = 6;
                            } else if (p == 2) {
                                translation = 5;
                            } else if (p == 3) {
                                translation = 4;
                            } else if (p == 4) {
                                translation = 3;
                            } else if (p == 5) {
                                translation = 2;
                            } else if (p == 6) {
                                translation = 1;
                            } else if (p == 7) {
                                translation = 0;
                            }
                             int translation2 = 0;
                                           if (column == 0) {
                                translation2 = 7;
                            } else if (column == 1) {
                                translation2 = 6;
                            } else if (column == 2) {
                                translation2 = 5;
                            } else if (column == 3) {
                                translation2 = 4;
                            } else if (column == 4) {
                                translation2 = 3;
                            } else if (column == 5) {
                                translation2 = 2;
                            } else if (column == 6) {
                                translation2 = 1;
                            } else if (column == 7) {
                                translation2 = 0;
                            }
        for (Node node : childrens) {

            if (node instanceof ImageView && gridPane.getRowIndex(node) == translation2 && gridPane.getColumnIndex(node) == row) {
                // use what you want to remove
                ImageView image = (ImageView)node;
                gridPane.getChildren().remove(node);
                gridPane.add(image,q,translation);
                break;
            }
        }
    }
       static  String Nameo = "" ;
     static int turner = 0 ;
     static int ready = 0 ;
    @Override // Override the start method in the application class
    public void start(Stage primaryStage) throws FileNotFoundException, IOException, ClassNotFoundException {
 grid.add(startButton,4,4);
 TextField Name = new TextField();
 grid.add(Name,5,5);
startButton.setOnAction((event) -> {
Nameo = Name.getText().trim();

if(Nameo.compareTo("")!=0){
   

                                InputStream inStream = null;
                                OutputStream inDB = null;
               try {
                   try {
                       socket = new Socket("192.168.0.12", 8000);
                       System.out.println("Connected");
                       
                   } catch (IOException ex) {
                       Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   inStream = socket.getInputStream();
                   
                   InputStream  fromServer  = socket.getInputStream();
                  
                   System.out.println("miad");
                   turner = (int)fromServer.read();
                   turnerequal = turner;
                    inDB = socket.getOutputStream();
                   ObjectOutputStream inpdb = new ObjectOutputStream(inDB);
                   if(turnerequal == 1 ){
                       
                                Map<String, Object> database = new HashMap<>();
                                database.put("number",1);
                                database.put("name", Nameo);
                                inpdb.writeObject(database);
                   }else if(turnerequal ==2 ){
                        Map<String, Object> database = new HashMap<>();
                             database.put("number",2);
                                database.put("name", Nameo);
                                inpdb.writeObject(database);
                   }
                   Button newGame = new Button("New Game");
                   pane .add(newGame,9,4);
                   // Create a GridPane
                   TextField whiteName = new TextField();
                   Text white = new Text("WHITE:");
                   Text black = new Text("BLACK:");
                   TextField blackName = new TextField();
                   pane.add(white,9,6);
                   pane.add(black,9,0);
                   pane.add(whiteName,9,7);
                   pane.add(blackName,9,1);
                   Pawn pawn1 = new Pawn();
                   Pawn pawn2 = new Pawn();
                   Pawn pawn3 = new Pawn();
                   Pawn pawn4 = new Pawn();
                   Pawn pawn5 = new Pawn();
                   Pawn pawn6 = new Pawn();
                   Pawn pawn7 = new Pawn();
                   Pawn pawn8 = new Pawn();
                   // TODO code application logic here
                   BPawn bpawn1 = new BPawn();
                   BPawn bpawn2 = new BPawn();
                   BPawn bpawn3 = new BPawn();
                   BPawn bpawn4 = new BPawn();
                   BPawn bpawn5 = new BPawn();
                   BPawn bpawn6 = new BPawn();
                   BPawn bpawn7 = new BPawn();
                   BPawn bpawn8 = new BPawn();
                   bigRook bigrook = new bigRook();
                   horse bigHorse = new horse();
                   Bishop bigBishop = new Bishop();
                   Queen queen = new Queen();
                   King king = new King();
                   Bishop smallBishop = new Bishop();
                   horse smallHorse = new horse();
                   Rook smallRook = new Rook();
                   //black
                   BBigRook bbigrook = new BBigRook();
                   BHorse bbigHorse = new BHorse();
                   BBishop bbigBishop = new BBishop();
                   BQueen bqueen = new BQueen();
                   BKing bking = new BKing();
                   BBishop bsmallBishop = new BBishop();
                   BHorse bsmallHorse = new BHorse();
                   BRook bsmallRook = new BRook();
                   pawn1.marker(0, 1, pawn1);
                   pawn2.marker(1, 1, pawn2);
                   pawn3.marker(2, 1, pawn3);
                   pawn4.marker(3, 1, pawn4);
                   pawn5.marker(4, 1, pawn5);
                   pawn6.marker(5, 1, pawn6);
                   pawn7.marker(6, 1, pawn7);
                   pawn8.marker(7, 1, pawn8);
                   bigrook.marker(0, 0, bigrook);
                   bigHorse.marker(1, 0, bigHorse);
                   bigBishop.marker(2, 0, bigBishop);
                   queen.marker(3, 0, queen);
                   king.marker(4, 0, king);
                   smallBishop.marker(5, 0, smallBishop);
                   smallHorse.marker(6, 0, smallHorse);
                   smallRook.marker(7, 0, smallRook);
                   // black marker
                   bpawn1.marker(0, 6, bpawn1);
                   bpawn2.marker(1, 6, bpawn2);
                   bpawn3.marker(2, 6, bpawn3);
                   bpawn4.marker(3, 6, bpawn4);
                   bpawn5.marker(4, 6, bpawn5);
                   bpawn6.marker(5, 6, bpawn6);
                   bpawn7.marker(6, 6, bpawn7);
                   bpawn8.marker(7, 6, bpawn8);
                   bbigrook.marker(0, 7, bbigrook);
                   bbigHorse.marker(1, 7, bbigHorse);
                   bbigBishop.marker(2, 7, bbigBishop);
                   bqueen.marker(3, 7, bqueen);
                   bking.marker(4, 7, bking);
                   bsmallBishop.marker(5, 7, bsmallBishop);
                   bsmallHorse.marker(6, 7, bsmallHorse);
                   bsmallRook.marker(7, 7, bsmallRook);
                   //board[0][0] = bigrook;
                   traverser();
                   truer();
                   falser();
                   organized = true;
                   System.out.println("sefid " + ColorOfPice[4][0] + " va khone siah hast : " + ColorOfPice[4][7]);
//board[1][0].move(0,3,true,board[1][0]);
//board[6][1].move(6,2,true,board[6][1]);
//board[7][6].move(7,5,true,board[7][6]);
//board[5][0].move(7,2,true,board[5][0]);
//      board[4][1].move(3,2,true,board[4][1]);
//board[7][6].move(7,5,true,board[7][6]);
//board[5][0].move(2,3,true,board[5][0]);
//board[0][6].move(0,5,true,board[0][6]);
//board[3][0].move(5,2,true, board[3][0]);
//board[6][6].move(6,4,true, board[6][6]);
//System.out.println(board[5][6] + " " + empty[5][6] + " "+ ColorOfPice[5][6]);
//board[5][2].move(5,6,true, board[5][2]);
// board[4][1].move(4,3,true,board[4][1]);
//board[3][6].move(3,4,true,board[3][6]);
//board[1][1].move(1,3,true,board[1][1]);
//  board[3][4].move(4,3,true,board[3][4]);


System.out.println("are");
int count = 0;
double s = 75; // side of rectangle
for (int i = 0; i < 8; i++) {
    count++;
    for (int j = 0; j < 8; j++) {
        // Create 64 rectangles and add to pane

        Rectangle r = new Rectangle(s, s, s, s);
        
        r.setFill(Color.WHITE);
        
        r.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (stack.size() == 2) {
                            if(whiteWon){
            
            Text text = new Text("white won");
            
            pane.add(text,9,7);
        }
        if(blackWon){
            
            Text text = new Text("black won");
            pane.add(text,9,0);
        }
                    InputStream inn = null;
                    try {
                        int p = pane.getRowIndex(r);
                        int translation = 0;
                        if (p == 0) {
                            translation = 7;
                        } else if (p == 1) {
                            translation = 6;
                        } else if (p == 2) {
                            translation = 5;
                        } else if (p == 3) {
                            translation = 4;
                        } else if (p == 4) {
                            translation = 3;
                        } else if (p == 5) {
                            translation = 2;
                        } else if (p == 6) {
                            translation = 1;
                        } else if (p == 7) {
                            translation = 0;
                        }
                        //p= translation;
                        int d = pane.getColumnIndex(r);
                        //System.out.println(pane.getRowIndex(r));
                        //  System.out.println(pane.getColumnIndex(r));
                        stack.add(translation);
                        stack.add(d);
                        //  orig.add(p);
                        // buttonOf.add()
                        int p1 = stack.get(0);
                        int p2 = stack.get(1);
                        int p3 = stack.get(2);
                        int p4 = stack.get(3);
                        System.out.println("hala shod p1 " + p1 + " p2 : "  + p2 + " p3:" +p3+" p4 : " +p4);
                        if(turnerequal == turner){
                            allow = false;
                            board[p2][p1].move(p4,p3,true,board[p2][p1]);
                            if(moveAllowed){
                                allow = true;
                                OutputStream out = null;
                                try {
                                    out = socket.getOutputStream();
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
                                    removeNodeByRowColumnIndex(p2, orig.get(0), pane, buttonOf.get(0));
                                    if(turnerequal==1)
                                        turnerequal =2;
                                    else if(turnerequal ==2 )
                                        turnerequal = 1;
                                    Map<String, Object> players = new HashMap<>();
                                    players.put("stat", turnerequal);
                                    players.put("x1", p2);
                                    players.put("y1",p1);
                                    players.put("x2", p4 );
                                    players.put("y2", p3);
                                    players.put("white", whiteWon);
                                    players.put("black",blackWon);
                                    players.put("translation",orig.get(0));
                                    players.put("translation2", p);
                                    
                                    try {
                                        System.out.println("sandwitch");
                                        objectOutputStream.writeObject(players);
                                        System.out.println("in sandwitch ");
                                        objectOutputStream.flush();
                                    } catch (IOException ex) {
                                        Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    
                                    //  Button buttonRem = buttonOf.get(0);
                                    //  board[p2][p1].move(p4, p3, true, board[p2][p1]);
                                    if(captured){
                                        removeNodeByRowColumnIndex2( stack.get(3),p, pane);
                                    }
                                    pane.add(buttonOf.get(0),stack.get(3),p);
                                    if(blackSmallCastle){
                                        
                                        removeNodeByRowColumnIndex2( 7,0, pane);
                                        Image image = new Image("Brook.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv, 5, 0);
                                        
                                    }
                                    if(blackBigCastle){
                                        
                                        removeNodeByRowColumnIndex2( 0,0, pane);
                                        Image image = new Image("Brook.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv, 3, 0);
                                        
                                    }
                                    if(whiteBigCastle){
                                        removeNodeByRowColumnIndex2( 0,7, pane);
                                        Image image = new Image("Wrook.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv, 3, 7);
                                    }
                                    if(whiteSmallCastle){
                                        removeNodeByRowColumnIndex2( 7,7, pane);
                                        Image image = new Image("Wrook.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv, 5, 7);
                                    }
                                    // removeNodeByRowColumnIndex(p2,re,  pane, buttonOf.get(0) );
                                    if(whiteWon){
                                        
                                        Text text = new Text("white won");
                                        
                                        pane.add(text,9,7);
                                    }
                                    if(blackWon){
                                        
                                        Text text = new Text("black won");
                                        pane.add(text,9,0);
                                    }
                                    if(blackProm){
                                        
                                        removeNodeByRowColumnIndex2( stack.get(3),p, pane);
                                        Image image = new Image("Bqueen.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv,stack.get(3),p);
                                        
                                        
                                    }
                                    if(whiteProm){
                                        
                                        removeNodeByRowColumnIndex2( stack.get(3),p, pane);
                                        Image image = new Image("Wqueen.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv,stack.get(3),p);
                                        
                                    }
                                } catch (IOException ex) {
                                    Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                                } finally {
                                    
                                }

                            }
                            System.out.println("move is done");
                            System.out.println(board[2][6]+ " khare maro gaeidiiiiiiiiii  ");
                            stack.clear();
                            orig.clear();
                            buttonOf.clear();
                            System.out.println(" " + p1);
                            moveAllowed = false;
                            captured = false;
                            blackSmallCastle= false;
                            whiteBigCastle = false;
                            whiteSmallCastle = false;
                            blackBigCastle = false;
                            blackProm = false;
                            whiteProm = false;
                        }
                        else{
                            stack.clear();
                            orig.clear();
                            buttonOf.clear();
                            allow = false;
                        }
                        
                        
                        if(allow&&!whiteWon&&!blackWon){
                            inn =socket.getInputStream();
                            ObjectInputStream objectInputStream = new ObjectInputStream(inn);
                       
                            Map<String, Object> playered = new HashMap<>();
                            int x1pos ;
                            int y1pos ;
                            int x2pos ;
                            int y2pos ;
                            try {
                                playered = (Map<String, Object>) objectInputStream.readObject();
                                
                                
                                turnerequal = (int)playered.get("stat");
                                
                                x1pos =(int) playered.get("x1");
                                y1pos =(int) playered.get("y1");
                                x2pos =(int) playered.get("x2");
                                y2pos =(int) playered.get("y2");
                                // ImageView imageview = (ImageView) playered.get("image");
                                int translatedYpos = (int) playered.get("translation");
                                int seconedtranslationYpos = (int) playered.get("translation2");
                                board[x1pos][y1pos].move(x2pos, y2pos, bol,board[x1pos][y1pos]);
                                if(moveAllowed){
                                    //   removeNodeByRowColumnIndex(x1pos, translatedYpos, pane, imageview);
                       
                                    if(captured){
                                        System.out.println("kir to kose khar madare harchi adame lashie " + seconedtranslationYpos);
                                        removeNodeByRowColumnIndex2( x2pos, seconedtranslationYpos, pane);
                                    }
                                    removeAndPasteNodeByRowColumnIndex2( x1pos, y1pos,x2pos,y2pos,pane);
                                    // pane.add(imageview,x2pos,seconedtranslationYpos);
                                    if(blackSmallCastle){
                                        
                                        removeNodeByRowColumnIndex2( 7,0, pane);
                                        Image image = new Image("Brook.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv, 5, 0);
                                        
                                    }
                                    if(blackBigCastle){
                                        
                                        removeNodeByRowColumnIndex2( 0,0, pane);
                                        Image image = new Image("Brook.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv, 3, 0);
                                        
                                    }
                                    if(whiteSmallCastle){
                                        removeNodeByRowColumnIndex2( 7,7, pane);
                                        Image image = new Image("Wrook.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv, 5, 7);
                                    }
                                    if(whiteBigCastle){
                                        removeNodeByRowColumnIndex2( 0,7, pane);
                                        Image image = new Image("Wrook.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv, 3, 7);
                                    }
                                    // removeNodeByRowColumnIndex(p2,re,  pane, buttonOf.get(0) );
                                    if(whiteWon){
                                        
                                        Text text = new Text("white won");
                                        
                                        pane.add(text,9,7);
                                    }
                                    if(blackWon){
                                        
                                        Text text = new Text("black won");
                                        pane.add(text,9,0);
                                    }
                                    if(blackProm){
                                        
                                        removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
                                        Image image = new Image("Bqueen.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv,x2pos,seconedtranslationYpos);
                                        
                                        
                                    }
                                    if(whiteProm){
                                        
                                        removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
                                        Image image = new Image("Wqueen.png",60,60,false,false);
                                        ImageView imgv = new ImageView(image);
                                        imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        action(imgv);
                                                    }
                                                });
                                        pane.add(imgv,x2pos,seconedtranslationYpos);
                                        
                                    }
                                    
                                }
                                System.out.println("move is done");
                                System.out.println(board[2][6]+ " khare maro gaeidiiiiiiiiii  ");
                                stack.clear();
                                orig.clear();
                                buttonOf.clear();
                                System.out.println(" " + p1);
                                moveAllowed = false;
                                captured = false;
                                blackSmallCastle= false;
                                whiteBigCastle = false;
                                whiteSmallCastle = false;
                                blackBigCastle = false;
                                blackProm = false;
                                whiteProm = false;
                                allow = false;
                                //az inj
                                // ta inja
                            } catch (IOException ex) {
                                Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }  }
                    catch (IOException ex) {
                        Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
              
                //System.out.println(stack.peek());
            }
        });//

        if (count % 2 == 0) {
                     if(whiteWon){
            
            Text text = new Text("white won");
            
            pane.add(text,9,7);
        }
        if(blackWon){
            
            Text text = new Text("black won");
            pane.add(text,9,0);
        }
            r.setFill(Color.GREEN);
            r.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    if (stack.size() == 2) {
                        InputStream inn = null;
                        try {
                            int p = pane.getRowIndex(r);
                            int translation = 0;
                            if (p == 0) {
                                translation = 7;
                            } else if (p == 1) {
                                translation = 6;
                            } else if (p == 2) {
                                translation = 5;
                            } else if (p == 3) {
                                translation = 4;
                            } else if (p == 4) {
                                translation = 3;
                            } else if (p == 5) {
                                translation = 2;
                            } else if (p == 6) {
                                translation = 1;
                            } else if (p == 7) {
                                translation = 0;
                            }
                            //p= translation;
                            int d = pane.getColumnIndex(r);
                            //System.out.println(pane.getRowIndex(r));
                            //  System.out.println(pane.getColumnIndex(r));
                            stack.add(translation);
                            stack.add(d);
                            //  orig.add(p);
                            // buttonOf.add()
                            System.out.println("it is in stack ==4");
                            int p1 = stack.get(0);
                            int p2 = stack.get(1);
                            int p3 = stack.get(2);
                            int p4 = stack.get(3);
                            if(turnerequal== turner){
                                board[p2][p1].move(p4,p3,true,board[p2][p1]);
                                if(moveAllowed){
                                    allow = true;
                                    OutputStream out = null;
                                    try {
                                        allow = true;
                                        out = socket.getOutputStream();
                                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
                                        removeNodeByRowColumnIndex(p2, orig.get(0), pane, buttonOf.get(0));
                                        if(turnerequal==1)
                                            turnerequal =2;
                                        else if(turnerequal ==2 )
                                            turnerequal = 1;
                                        Map<String, Object> players = new HashMap<>();
                                        players.put("stat", turnerequal);
                                        players.put("x1", p2);
                                        players.put("y1",p1);
                                        players.put("x2", p4 );
                                        players.put("y2", p3);
                                        players.put("white", whiteWon);
                                        players.put("black", blackWon);
                                        players.put("translation",orig.get(0));
                                        players.put("translation2", p);
                                        //  players.put("image", buttonOf.get(0));
                          
                                        try {
                                            objectOutputStream.writeObject(players);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        
                                        //  Button buttonRem = buttonOf.get(0);
                                        //  board[p2][p1].move(p4, p3, true, board[p2][p1]);
                                        if(captured){
                                            removeNodeByRowColumnIndex2( stack.get(3),p, pane);
                                        }
                                        pane.add(buttonOf.get(0),stack.get(3),p);
                                        if(blackSmallCastle){
                                            
                                            removeNodeByRowColumnIndex2( 7,0, pane);
                                            Image image = new Image("Brook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 5, 0);
                                            
                                        }
                                        if(blackBigCastle){
                                            
                                            removeNodeByRowColumnIndex2( 0,0, pane);
                                            Image image = new Image("Brook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 3, 0);
                                            
                                        }
                                        if(whiteSmallCastle){
                                            removeNodeByRowColumnIndex2( 7,7, pane);
                                            Image image = new Image("Wrook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 5, 7);
                                        }
                                        if(whiteBigCastle){
                                            removeNodeByRowColumnIndex2( 0,7, pane);
                                            Image image = new Image("Wrook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 3, 7);
                                        }
                                        // removeNodeByRowColumnIndex(p2,re,  pane, buttonOf.get(0) );
                                        if(whiteWon){
                                            
                                            Text text = new Text("white won");
                                            
                                            pane.add(text,9,7);
                                        }
                                        if(blackWon){
                                            
                                            Text text = new Text("black won");
                                            pane.add(text,9,0);
                                        }
                                        if(blackProm){
                                            
                                            removeNodeByRowColumnIndex2( stack.get(3),p, pane);
                                            Image image = new Image("Bqueen.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv,stack.get(3),p);
                                            
                                            
                                        }
                                        if(whiteProm){
                                            
                                            removeNodeByRowColumnIndex2( stack.get(3),p, pane);
                                            Image image = new Image("Wqueen.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv,stack.get(3),p);
                                            
                                        }
                                    } catch (IOException ex) {
                                        Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                                    } finally {
                             
                                    }
                                    
                                }
                                stack.clear();
                                orig.clear();
                                buttonOf.clear();
                                
                                System.out.println("move is done");
                                moveAllowed = false;
                                captured = false;
                                blackBigCastle = false ;
                                whiteSmallCastle = false ;
                                blackSmallCastle = false;
                                whiteBigCastle = false;
                                blackProm = false;
                                whiteProm = false;
                            }
                            else{
                                stack.clear();
                                orig.clear();
                                buttonOf.clear();
                                
                            }
               
                            if(allow&&!whiteWon&&!blackWon){
                                inn =socket.getInputStream();
                                ObjectInputStream objectInputStream = new ObjectInputStream(inn);
                                Map<String, Object> playered = new HashMap<>();
                                int x1pos ;
                                int y1pos ;
                                int x2pos ;
                                int y2pos ;
                                try {
                                    playered = (Map<String, Object>) objectInputStream.readObject();
                                    
                                    turnerequal = (int)playered.get("stat");
                                    
                                    x1pos =(int) playered.get("x1");
                                    y1pos =(int) playered.get("y1");
                                    x2pos =(int) playered.get("x2");
                                    y2pos =(int) playered.get("y2");
                                    //   ImageView imageview = (ImageView) playered.get("image");
                                    int translatedYpos = (int) playered.get("translation");
                                    int seconedtranslationYpos = (int) playered.get("translation2");
                                    board[x1pos][y1pos].move(x2pos, y2pos, bol,board[x1pos][y1pos]);
                                    if(moveAllowed){
                  /*                        Thread thread = new Thread(){
    public void run(){
   myMove(x1pos,y1pos,x2pos,y2pos,seconedtranslationYpos);
    }
  };

  thread.start();*/
                                    
                                    
                                        if(captured){
                                            System.out.println("kir to kose khar madare harchi adame lashie " + seconedtranslationYpos);
                                            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
                                        }
                                        removeAndPasteNodeByRowColumnIndex2( x1pos, y1pos,x2pos,y2pos,pane);
                                        //   pane.add(imageview,x2pos,seconedtranslationYpos);
                                        if(blackSmallCastle){
                                            
                                            removeNodeByRowColumnIndex2( 7,0, pane);
                                            Image image = new Image("Brook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 5, 0);
                                            
                                        }
                                        
                                        if(blackBigCastle){
                                            
                                            removeNodeByRowColumnIndex2( 0,0, pane);
                                            Image image = new Image("Brook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 3, 0);
                                            
                                        }
                                        if(whiteSmallCastle){
                                            removeNodeByRowColumnIndex2( 7,7, pane);
                                            Image image = new Image("Wrook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 5, 7);
                                        }
                                        if(whiteBigCastle){
                                            removeNodeByRowColumnIndex2( 0,7, pane);
                                            Image image = new Image("Wrook.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv, 3, 7);
                                        }
                                        // removeNodeByRowColumnIndex(p2,re,  pane, buttonOf.get(0) );
                                        if(whiteWon){
                                            
                                            Text text = new Text("white won");
                                            
                                            pane.add(text,9,7);
                                        }
                                        if(blackWon){
                                            
                                            Text text = new Text("black won");
                                            pane.add(text,9,0);
                                        }
                                        if(blackProm){
                                            
                                            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
                                            Image image = new Image("Bqueen.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv,x2pos,seconedtranslationYpos);
                                            
                                            
                                        }
                                        if(whiteProm){
                                            
                                            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
                                            Image image = new Image("Wqueen.png",60,60,false,false);
                                            ImageView imgv = new ImageView(image);
                                            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                                                    new EventHandler<MouseEvent>() {
                                                        @Override
                                                        public void handle(MouseEvent event) {
                                                            action(imgv);
                                                        }
                                                    });
                                            pane.add(imgv,x2pos,seconedtranslationYpos);
                                            
                                        }
                                        
                                    }
                                    System.out.println("move is done");
                                    System.out.println(board[2][6]+ " khare maro gaeidiiiiiiiiii  ");
                                    stack.clear();
                                    orig.clear();
                                    buttonOf.clear();
                                    System.out.println(" " + p1);
                                    moveAllowed = false;
                                    captured = false;
                                    blackSmallCastle= false;
                                    whiteBigCastle = false;
                                    whiteSmallCastle = false;
                                    blackBigCastle = false;
                                    blackProm = false;
                                    whiteProm = false;
                                    allow = false;
                                    //az inj
                                    // ta inja
                                } catch (IOException ex) {
                                    Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                                }}
                        } catch (IOException ex) {
                            Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
              
                        }
                
                    }
                    
                    
                }
                
            });
            
        }
        pane.add(r, j, i);
        if (i == 0 && j == 0) {
            
            Image image = new Image("Brook.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 0 && j == 1) {
            //Button Bknight = new Button("Bknight");
            Image img = new Image("Bknight.png" ,60,60,false,false);
            
            ImageView imgv = new ImageView(img);
            //  imgv.setOnMousePressed(action);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            //     imgv.setFitWidth(75);
            //   imgv.setFitHeight(75);
            
            // imgv.setFitHeight(50);
            //imgv.setFitWidth(50);
            pane.add(imgv,j,i);
//Text Bknight = new Text("bknight");
//  but.add(Bknight);
//ImageView imagev = new ImageView(new Image("Bapwn.png",60,60,false,true));
//pane.add(Bknight, j, i);



        } else if (i == 0 && j == 2) {
            //  Button BBishop = new Button("Bbishop");
            Image image = new Image("Bbishop.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            //  but.add(BBishop);
            pane.add(imgv, j, i);
            
        } else if (i == 0 && j == 3) {
            
            Image image = new Image("Bqueen.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
            
        } else if (i == 0 && j == 4) {
            
            Image image = new Image("Bking.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
            
        } else if (i == 0 && j == 5) {
            Button Bbishop2 = new Button("Bbishop2");
            Image image = new Image("Bbishop.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
            
        } else if (i == 0 && j == 6) {
            
            Image image = new Image("Bknight.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
            
        } else if (i == 0 && j == 7) {
            Image image = new Image("Brook.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
            
        } else if (i == 1 && j == 0) {
            
            Image image = new Image("Bpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
            
        } else if (i == 1 && j == 1) {
            Image image = new Image("Bpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 1 && j == 2) {
            Image image = new Image("Bpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 1 && j == 3) {
            Image image = new Image("Bpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 1 && j == 4) {
            Image image = new Image("Bpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 1 && j == 5) {
            Button Bpawn6 = new Button("Bpawn6");
            Image image = new Image("Bpawn.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 1 && j == 6) {
            Image image = new Image("Bpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 1 && j == 7) {
            Image image = new Image("Bpawn.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        }
        if (i == 7 && j == 7) {
            Image image = new Image("Wrook.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 7 && j == 6) {
            Image image = new Image("Wknight.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 7 && j == 5) {
            
            Image image = new Image("Wbishop.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 7 && j == 3) {
            Button Wqueen = new Button("Wqueen");
            Image image = new Image("Wqueen.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 7 && j == 4) {
            Image image = new Image("Wking.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 7 && j == 2) {
            Image image = new Image("Wbishop.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 7 && j == 1) {
            
            Image image = new Image("WKnight.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 7 && j == 0) {
            Image image = new Image("Wrook.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 6 && j == 0) {
            
            Image image = new Image("Wpawn.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 6 && j == 1) {
            Image image = new Image("Wpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 6 && j == 2) {
            Image image = new Image("Wpawn.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 6 && j == 3) {
            Image image = new Image("Wpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 6 && j == 4) {
            Image image = new Image("Wpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 6 && j == 5) {
            Image image = new Image("Wpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 6 && j == 6) {
            Image image = new Image("Wpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        } else if (i == 6 && j == 7) {
            Image image = new Image("Wpawn.png" ,60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, j, i);
        }
        count++;
    }
}
Button startbutton = new Button("start");
pane.add(startbutton,9,9);
//startbutton.setOnAction((event) -> {
// Button was clicked, do something...
if(turner == 2){
    InputStream inn = null;
    Map<String, Object> player = new HashMap<>();
    System.out.println("ta fucking inja miad ");
    int x1pos;
    int y1pos;
    int x2pos;
    int y2pos;
    try {
        inn =socket.getInputStream();
        System.out.println("migam amu ye chi bede behet zob beshia ");
        ObjectInputStream objectInputStream = new ObjectInputStream(inn);
        
        Map<String, Object> playered = new HashMap<>();
        player = (Map<String, Object>) objectInputStream.readObject();
        System.out.println("migam amu ye chi bede behet zob beshiaaaaa ");
    } catch (IOException ex) {
        Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
    }
    // Display the stage;
    System.out.println("ahaaan");
    turnerequal = (int)player.get("stat");
    turnerequal =2 ;
    x1pos =(int) player.get("x1");
    y1pos =(int) player.get("y1");
    x2pos =(int) player.get("x2");
    y2pos =(int) player.get("y2");
    // ImageView imageview = (ImageView) player.get("image");
    int translatedYpos = (int) player.get("translation");
    int seconedtranslationYpos = (int) player.get("translation2");
    board[x1pos][y1pos].move(x2pos, y2pos, bol,board[x1pos][y1pos]);
    if(moveAllowed){
        //removeNodeByRowColumnIndex(x1pos, translatedYpos, pane, imageview);
        
        removeAndPasteNodeByRowColumnIndex2( x1pos, y1pos,x2pos,y2pos,pane);
        
        //  Button buttonRem = buttonOf.get(0);
        //  board[p2][p1].move(p4, p3, true, board[p2][p1]);
        if(captured){
            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
        }
        //   pane.add(imageview,x2pos,seconedtranslationYpos);
        if(blackSmallCastle){
            
            removeNodeByRowColumnIndex2( 7,0, pane);
            Image image = new Image("Brook.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, 5, 0);
            
        }
        
        if(whiteBigCastle){
            removeNodeByRowColumnIndex2( 0,7, pane);
            Image image = new Image("Wrook.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv, 2, 7);
        }
        // removeNodeByRowColumnIndex(p2,re,  pane, buttonOf.get(0) );
        if(whiteWon){
            
            Text text = new Text("white won");
            
            pane.add(text,9,7);
        }
        if(blackWon){
            
            Text text = new Text("black won");
            pane.add(text,9,0);
        }
        if(blackProm){
            
            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
            Image image = new Image("Bqueen.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv,x2pos,seconedtranslationYpos);
            
            
        }
        if(whiteProm){
            
            removeNodeByRowColumnIndex2( x2pos,seconedtranslationYpos, pane);
            Image image = new Image("Wqueen.png",60,60,false,false);
            ImageView imgv = new ImageView(image);
            imgv.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            action(imgv);
                        }
                    });
            pane.add(imgv,x2pos,seconedtranslationYpos);
            
        }
    }
}

//});
// Create a scene and place it in the stage
Scene scene = new Scene(pane, 800, 800);
primaryStage.setTitle("Chess"); // Set the stage title
primaryStage.setScene(scene); // Place in scene in the stage
primaryStage.show(); // Display the stage;
                   
               } catch (IOException ex) {
                   Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
               } finally {
        /* try {
             inStream.close();
         } catch (IOException ex) {
             Logger.getLogger(ChessMain.class.getName()).log(Level.SEVERE, null, ex);
         }*/
     }
    

}});
Scene scene2 = new Scene(grid, 800, 800);
primaryStage.setTitle("Chess"); // Set the stage title
primaryStage.setScene(scene2); // Place in scene in the stage
primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
