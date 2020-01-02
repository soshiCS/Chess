/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aghaj
 */
public class ChessMainTest {
    
    public ChessMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of action method, of class ChessMain.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        ImageView but = null;
        ChessMain instance = new ChessMain();
        instance.action(but);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of removeNodeByRowColumnIndex method, of class ChessMain.
     */
    @Test
    public void testRemoveNodeByRowColumnIndex() {
System.out.println("removeNodeByRowColumnIndex");
        int row = 0;
        int column = 0;
        GridPane gridPane = new GridPane();
        ImageView img = null;
        ChessMain instance = new ChessMain();
        instance.removeNodeByRowColumnIndex(row, column, gridPane, img);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of removeNodeByRowColumnIndex2 method, of class ChessMain.
     */
    @Test
    public void testRemoveNodeByRowColumnIndex2() {
        System.out.println("removeNodeByRowColumnIndex2");
               int row = 0;
        int column = 0;
        GridPane gridPane = new GridPane();
        ImageView img = null;
        ChessMain instance = new ChessMain();
        instance.removeNodeByRowColumnIndex2(row, column, gridPane);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of start method, of class ChessMain.
     * @throws java.lang.Exception
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage primaryStage = null;
        ChessMain instance = new ChessMain();
        instance.start(primaryStage);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of main method, of class ChessMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ChessMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
