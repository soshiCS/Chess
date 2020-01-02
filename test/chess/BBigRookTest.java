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
public class BBigRookTest {
    
    public BBigRookTest() {
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
     * Test of move method, of class BBigRook.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int i = 0;
        int j = 0;
        boolean turn = false;
        Move bigRook = null;
        BBigRook instance = new BBigRook();
        instance.move(i, j, turn, bigRook);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getXPos method, of class BBigRook.
     */
    @Test
    public void testGetXPos() {
        System.out.println("getXPos");
        BBigRook instance = new BBigRook();
        int expResult = 0;
        int result = instance.getXPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getYPos method, of class BBigRook.
     */
    @Test
    public void testGetYPos() {
        System.out.println("getYPos");
        BBigRook instance = new BBigRook();
        int expResult = 0;
        int result = instance.getYPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isMovable method, of class BBigRook.
     */
    @Test
    public void testIsMovable() {
        System.out.println("isMovable");
        int i = 0;
        int j = 0;
        Move bigRook = null;
        BBigRook instance = new BBigRook();
        boolean expResult = false;
        boolean result = instance.isMovable(i, j, bigRook);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setXPos method, of class BBigRook.
     */
    @Test
    public void testSetXPos() {
        System.out.println("setXPos");
        int i = 0;
        BBigRook instance = new BBigRook();
        instance.setXPos(i);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setYPos method, of class BBigRook.
     */
    @Test
    public void testSetYPos() {
        System.out.println("setYPos");
        int j = 0;
        BBigRook instance = new BBigRook();
        instance.setYPos(j);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
