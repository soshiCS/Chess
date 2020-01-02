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
public class horseTest {
    
    public horseTest() {
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
     * Test of isMovable method, of class horse.
     */
    @Test
    public void testIsMovable() {
        System.out.println("isMovable");
        int i = 0;
        int j = 0;
        Move horse = null;
        horse instance = new horse();
        boolean expResult = false;
        boolean result = instance.isMovable(i, j, horse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of move method, of class horse.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int i = 0;
        int j = 0;
        boolean color = false;
        Move horse = null;
        horse instance = new horse();
        instance.move(i, j, color, horse);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getXPos method, of class horse.
     */
    @Test
    public void testGetXPos() {
        System.out.println("getXPos");
        horse instance = new horse();
        int expResult = 0;
        int result = instance.getXPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getYPos method, of class horse.
     */
    @Test
    public void testGetYPos() {
        System.out.println("getYPos");
        horse instance = new horse();
        int expResult = 0;
        int result = instance.getYPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setXPos method, of class horse.
     */
    @Test
    public void testSetXPos() {
        System.out.println("setXPos");
        int i = 0;
        horse instance = new horse();
        instance.setXPos(i);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setYPos method, of class horse.
     */
    @Test
    public void testSetYPos() {
        System.out.println("setYPos");
        int j = 0;
        horse instance = new horse();
        instance.setYPos(j);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
