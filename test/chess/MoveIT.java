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
public class MoveIT {
    
    public MoveIT() {
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
     * Test of truer method, of class Move.
     */
    @Test
    public void testTruer() {
        System.out.println("truer");
        Move.truer();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of falser method, of class Move.
     */
    @Test
    public void testFalser() {
        System.out.println("falser");
        Move.falser();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of traverser method, of class Move.
     */
    @Test
    public void testTraverser() {
        System.out.println("traverser");
        Move.traverser();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of move method, of class Move.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int i = 0;
        int j = 0;
        boolean move = false;
        Move moved = null;
        Move instance = new MoveImpl();
        instance.move(i, j, move, moved);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isMovable method, of class Move.
     */
    @Test
    public void testIsMovable() {
        System.out.println("isMovable");
        int i = 0;
        int j = 0;
        Move movable = null;
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.isMovable(i, j, movable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getXPos method, of class Move.
     */
    @Test
    public void testGetXPos() {
        System.out.println("getXPos");
        Move instance = new MoveImpl();
        int expResult = 0;
        int result = instance.getXPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getYPos method, of class Move.
     */
    @Test
    public void testGetYPos() {
        System.out.println("getYPos");
        Move instance = new MoveImpl();
        int expResult = 0;
        int result = instance.getYPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isEmpty method, of class Move.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        int i = 0;
        int j = 0;
        boolean expResult = false;
        boolean result = Move.isEmpty(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isOpp method, of class Move.
     */
    @Test
    public void testIsOpp() {
        System.out.println("isOpp");
        int i = 0;
        int j = 0;
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.isOpp(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of marker method, of class Move.
     */
    @Test
    public void testMarker() {
        System.out.println("marker");
        int i = 0;
        int j = 0;
        Move move = null;
        Move instance = new MoveImpl();
        instance.marker(i, j, move);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setXPos method, of class Move.
     */
    @Test
    public void testSetXPos() {
        System.out.println("setXPos");
        int i = 0;
        Move instance = new MoveImpl();
        instance.setXPos(i);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setYPos method, of class Move.
     */
    @Test
    public void testSetYPos() {
        System.out.println("setYPos");
        int j = 0;
        Move instance = new MoveImpl();
        instance.setYPos(j);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of hit method, of class Move.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        int i = 0;
        int j = 0;
        int a = 0;
        int b = 0;
        Move move = null;
        Move instance = new MoveImpl();
        instance.hit(i, j, a, b, move);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isCheck method, of class Move.
     */
    @Test
    public void testIsCheck() {
        System.out.println("isCheck");
        int xp = 0;
        int yp = 0;
        boolean turn = false;
        boolean expResult = false;
        boolean result = Move.isCheck(xp, yp, turn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isCheckMate method, of class Move.
     */
    @Test
    public void testIsCheckMate() {
        System.out.println("isCheckMate");
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.isCheckMate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of notPinned method, of class Move.
     */
    @Test
    public void testNotPinned() {
        System.out.println("notPinned");
        int i = 0;
        int j = 0;
        int d = 0;
        int e = 0;
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.notPinned(i, j, d, e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of notPinnedCheckMate method, of class Move.
     */
    @Test
    public void testNotPinnedCheckMate() {
        System.out.println("notPinnedCheckMate");
        int xp = 0;
        int yp = 0;
        int xcheck = 0;
        int ycheck = 0;
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.notPinnedCheckMate(xp, yp, xcheck, ycheck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isBlackKingCheck method, of class Move.
     */
    @Test
    public void testIsBlackKingCheck() {
        System.out.println("isBlackKingCheck");
        int bkxp = 0;
        int bkyp = 0;
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.isBlackKingCheck(bkxp, bkyp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isWhiteKingCheck method, of class Move.
     */
    @Test
    public void testIsWhiteKingCheck() {
        System.out.println("isWhiteKingCheck");
        int bkxp = 0;
        int bkyp = 0;
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.isWhiteKingCheck(bkxp, bkyp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of wrongMove method, of class Move.
     */
    @Test
    public void testWrongMove() {
        System.out.println("wrongMove");
        Move instance = new MoveImpl();
        instance.wrongMove();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of smallRCastlable method, of class Move.
     */
    /*@Test
    public void testSmallRCastlable() {
        System.out.println("smallRCastlable");
        boolean small = false;
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.smallRCastlable(small);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }/*

    /**
     * Test of bigRCastlable method, of class Move.
     */
    /*@Test
    public void testBigRCastlable() {
        System.out.println("bigRCastlable");
        boolean big = false;
        Move instance = new MoveImpl();
        boolean expResult = false;
        boolean result = instance.bigRCastlable(big);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of smallCastle method, of class Move.
     */
    @Test
    public void testSmallCastle() {
        System.out.println("smallCastle");
        Move.smallCastle();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of bigCastle method, of class Move.
     */
    @Test
    public void testBigCastle() {
        System.out.println("bigCastle");
        Move instance = new MoveImpl();
        instance.bigCastle();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    public class MoveImpl extends Move {

        public void move(int i, int j, boolean move, Move moved) {
        }

        public boolean isMovable(int i, int j, Move movable) {
            return false;
        }

        public int getXPos() {
            return 0;
        }

        public int getYPos() {
            return 0;
        }

        public void setXPos(int i) {
        }

        public void setYPos(int j) {
        }
    }
    
}
