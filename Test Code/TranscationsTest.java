/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorSystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class TranscationsTest {
    Transcations T;
    
    public TranscationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        T = new Transcations();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class Transcations.
     */
    
    @Test 
    public void testTranscations(){
    assertEquals(500, T.transcations(100, 200, 200));
    }
}
