/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import src.Game;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 14toa
 */
public class HandlerTest {
    
    public HandlerTest() {
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
     * Test of tick method, of class Handler.
     */
   /**   @Test
    public void testTick() {
        System.out.println("tick");
        Handler instance = new Handler();
        instance.tick();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of render method, of class Handler.
     */
    /**
    @Test
    public void testRender() {
        System.out.println("render");
        Graphics g = null;
        Handler instance = new Handler();
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObject method, of class Handler.
     */
    @Test
    public void testIsUp() {
        System.out.println("isUp");
        Game game = new Game();
        Handler instance;
        instance = game.handler;
        boolean expResult = false;
        System.out.println(instance.isUp());
        while(instance.isUp() == false) {
                System.out.println("Waiting");
            }
        System.out.println("Suces");
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}