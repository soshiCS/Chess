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
public class BQueenTest {
    
    public BQueenTest() {
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
     * Test of move method, of class BQueen.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int i = 0;
        int j = 0;
        boolean turn = false;
        Move BQueen = null;
        BQueen instance = new BQueen();
        instance.move(i, j, turn, BQueen);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isMovable method, of class BQueen.
     */
    @Test
    public void testIsMovable() {
        System.out.println("isMovable");
        int i = 0;
        int j = 0;
        Move queen = null;
        BQueen instance = new BQueen();
        boolean expResult = false;
        boolean result = instance.isMovable(i, j, queen);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getXPos method, of class BQueen.
     */
    @Test
    public void testGetXPos() {
        System.out.println("getXPos");
        BQueen instance = new BQueen();
        int expResult = 0;
        int result = instance.getXPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getYPos method, of class BQueen.
     */
    @Test
    public void testGetYPos() {
        System.out.println("getYPos");
        BQueen instance = new BQueen();
        int expResult = 0;
        int result = instance.getYPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setXPos method, of class BQueen.
     */
    @Test
    public void testSetXPos() {
        System.out.println("setXPos");
        int i = 0;
        BQueen instance = new BQueen();
        instance.setXPos(i);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setYPos method, of class BQueen.
     */
    @Test
    public void testSetYPos() {
        System.out.println("setYPos");
        int j = 0;
        BQueen instance = new BQueen();
        instance.setYPos(j);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
