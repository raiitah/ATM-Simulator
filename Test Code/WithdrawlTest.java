/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorSystem;

import java.awt.event.ActionEvent;
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
public class WithdrawlTest {
    Withdrawl W;
    
    public WithdrawlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        W = new Withdrawl();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class Withdrawl.
     */
    @Test
    public void testWithdrawl() {
        assertEquals(0, W.withdrawl(200, 200));
    }
    
}
