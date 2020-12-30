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
public class DepositTest {
    Deposit D;
    
    public DepositTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        D = new Deposit();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of depositedCash method, of class Deposit.
     */
    @Test
    public void testDepositedCash() {
        assertEquals(500, D.depositedCash(250,250));
        
    }
    
}
