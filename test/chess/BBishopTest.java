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
public class BBishopTest {
    
    public BBishopTest() {
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
     * Test of isMovable method, of class BBishop.
     */
    @Test
    public void testIsMovable() {
        System.out.println("isMovable");
        int i = 0;
        int j = 0;
        Move Bishop = null;
        BBishop instance = new BBishop();
        boolean expResult = false;
        boolean result = instance.isMovable(i, j, Bishop);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of move method, of class BBishop.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int i = 0;
        int j = 0;
        boolean turn = false;
        Move BBishop = null;
        BBishop instance = new BBishop();
        instance.move(i, j, turn, BBishop);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getXPos method, of class BBishop.
     */
    @Test
    public void testGetXPos() {
        System.out.println("getXPos");
        BBishop instance = new BBishop();
        int expResult = 0;
        int result = instance.getXPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getYPos method, of class BBishop.
     */
    @Test
    public void testGetYPos() {
        System.out.println("getYPos");
        BBishop instance = new BBishop();
        int expResult = 0;
        int result = instance.getYPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setXPos method, of class BBishop.
     */
    @Test
    public void testSetXPos() {
        System.out.println("setXPos");
        int i = 0;
        BBishop instance = new BBishop();
        instance.setXPos(i);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setYPos method, of class BBishop.
     */
    @Test
    public void testSetYPos() {
        System.out.println("setYPos");
        int j = 0;
        BBishop instance = new BBishop();
        instance.setYPos(j);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
