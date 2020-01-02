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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author aghaj
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({chess.BHorseTest.class, chess.ChessMainTest.class, chess.BishopTest.class, chess.RookTest.class, chess.PawnTest.class, chess.BBigRookTest.class, chess.BKingTest.class, chess.QueenTest.class, chess.bigRookTest.class, chess.KingTest.class, chess.horseTest.class, chess.BBishopTest.class, chess.BPawnTest.class, chess.BQueenTest.class, chess.MoveTest.class, chess.BRookTest.class})
public class ChessSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
