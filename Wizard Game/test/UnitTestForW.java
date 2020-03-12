/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import MyGame.*;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import static junit.framework.Assert.assertEquals;
import java.awt.event.KeyAdapter;
import java.awt.Robot;
/**
 *
 * @author aaronramirez
 */
public class UnitTest {
    Game GameDriverInstance;
    KeyInput MyKeyInput;

    
    
    @Before
    public void setUpClass() {
        System.out.println("Gamer test before: Before method test()");
        GameDriverInstance = new Game();
    }
    
    @After
    public void tearDownClass() {
        System.out.println("Gamer test after: After method test()");
        GameDriverInstance = null;                
    }
    
    @Test
    public void TestDriverA() throws AWTException{
        System.out.println("Test A begin");
        Robot Jess = new Robot();
        Jess.keyPress(87);
        Jess.delay(3);
        assertEquals(GameDriverInstance.handler.isUp(), true);
    }
    
    @Test
    public void TestDriverB() throws AWTException {
        System.out.println("Test B begin");
        GameObject G = GameDriverInstance.handler.object.get(64);
        int xBefore = G.getY();
        Robot Jess = new Robot();
        Jess.keyPress(87);
        Jess.delay(300);
        int xAfter = G.getY();
        boolean ans = false;
        if (xBefore != xAfter) {
            ans = true;
        }
        assertEquals(ans, true);
    }
}