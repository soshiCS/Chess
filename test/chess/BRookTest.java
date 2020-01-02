/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

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
public class BRookTest {
    
    public BRookTest() {
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
     * Test of move method, of class BRook.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int i = 0;
        int j = 0;
        boolean turn = false;
        Move Rook = null;
        BRook instance = new BRook();
        instance.move(i, j, turn, Rook);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getXPos method, of class BRook.
     */
    @Test
    public void testGetXPos() {
        System.out.println("getXPos");
        BRook instance = new BRook();
        int expResult = 0;
        int result = instance.getXPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getYPos method, of class BRook.
     */
    @Test
    public void testGetYPos() {
        System.out.println("getYPos");
        BRook instance = new BRook();
        int expResult = 0;
        int result = instance.getYPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isMovable method, of class BRook.
     */
    @Test
    public void testIsMovable() {
        System.out.println("isMovable");
        int i = 0;
        int j = 0;
        Move Rook = null;
        BRook instance = new BRook();
        boolean expResult = false;
        boolean result = instance.isMovable(i, j, Rook);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setXPos method, of class BRook.
     */
    @Test
    public void testSetXPos() {
        System.out.println("setXPos");
        int i = 0;
        BRook instance = new BRook();
        instance.setXPos(i);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setYPos method, of class BRook.
     */
    @Test
    public void testSetYPos() {
        System.out.println("setYPos");
        int j = 0;
        BRook instance = new BRook();
        instance.setYPos(j);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
