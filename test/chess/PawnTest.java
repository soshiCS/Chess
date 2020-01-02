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
public class PawnTest {
    
    public PawnTest() {
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
     * Test of isMovable method, of class Pawn.
     */
    @Test
    public void testIsMovable() {
        System.out.println("isMovable");
        int i = 0;
        int j = 0;
        Move pawn = null;
        Pawn instance = new Pawn();
        boolean expResult = false;
        boolean result = instance.isMovable(i, j, instance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of move method, of class Pawn.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int i = 0;
        int j = 0;
        boolean color = false;
        Move pawn = null;
        Pawn instance = new Pawn();
        instance.move(i, j, color, instance);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getXPos method, of class Pawn.
     */
    @Test
    public void testGetXPos() {
        System.out.println("getXPos");
        Pawn instance = new Pawn();
        int expResult = 0;
        int result = instance.getXPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getYPos method, of class Pawn.
     */
    @Test
    public void testGetYPos() {
        System.out.println("getYPos");
        Pawn instance = new Pawn();
        int expResult = 0;
        int result = instance.getYPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setXPos method, of class Pawn.
     */
    @Test
    public void testSetXPos() {
        System.out.println("setXPos");
        int i = 0;
        Pawn instance = new Pawn();
        instance.setXPos(i);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setYPos method, of class Pawn.
     */
    @Test
    public void testSetYPos() {
        System.out.println("setYPos");
        int j = 0;
        Pawn instance = new Pawn();
        instance.setYPos(j);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
