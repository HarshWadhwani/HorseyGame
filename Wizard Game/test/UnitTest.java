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
    public void TestDriverA1() throws AWTException{
        System.out.println("Test A1 begin");
        Robot Jess = new Robot();
        Jess.keyPress(65);
        Jess.delay(300);
        assertEquals(GameDriverInstance.handler.isLeft(), true);
    }
    
    @Test
    public void TestDriverA2() throws AWTException {
        System.out.println("Test A2 begin");
        GameObject G = GameDriverInstance.handler.object.get(64);
        int xBefore = G.getX();
        Robot Jess = new Robot();
        Jess.keyPress(65);
        Jess.delay(300);
        int xAfter = G.getX();
        boolean ans = false;
        if (xBefore != xAfter) {
            ans = true;
        }
        assertEquals(ans, true);
    }
    
    @Test
    public void TestDriverW1() throws AWTException{
        System.out.println("Test W1 begin");
        Robot Jess = new Robot();
        Jess.keyPress(87);
        Jess.delay(300);
        assertEquals(GameDriverInstance.handler.isUp(), true);
    }
    
    @Test
    public void TestDriverW2() throws AWTException {
        System.out.println("Test W2 begin");
        GameObject G = GameDriverInstance.handler.object.get(64);
        int yBefore = G.getY();
        Robot Jess = new Robot();
        Jess.keyPress(87);
        Jess.delay(300);
        int yAfter = G.getY();
        boolean ans = false;
        if (yBefore != yAfter) {
            ans = true;
        }
        assertEquals(ans, true);
    }
    
    @Test
    public void TestDriverS1() throws AWTException{
        System.out.println("Test S1 begin");
        Robot Jess = new Robot();
        Jess.keyPress(83);
        Jess.delay(300);
        assertEquals(GameDriverInstance.handler.isDown(), true);
    }
    
    @Test
    public void TestDriverS2() throws AWTException {
        System.out.println("Test S2 begin");
        GameObject G = GameDriverInstance.handler.object.get(64);
        int yBefore = G.getY();
        Robot Jess = new Robot();
        Jess.keyPress(83);
        Jess.delay(300);
        int yAfter = G.getY();
        boolean ans = false;
        if (yBefore != yAfter) {
            ans = true;
        }
        assertEquals(ans, true);
    }
    
    @Test
    public void TestDriverD1() throws AWTException{
        System.out.println("Test D1 begin");
        Robot Jess = new Robot();
        Jess.keyPress(68);
        Jess.delay(300);
        assertEquals(GameDriverInstance.handler.isRight(), true);
    }
    
    @Test
    public void TestDriverD2() throws AWTException {
        System.out.println("Test D2 begin");
        GameObject G = GameDriverInstance.handler.object.get(64);
        int xBefore = G.getX();
        Robot Jess = new Robot();
        Jess.keyPress(68);
        Jess.delay(300);
        int xAfter = G.getX();
        boolean ans = false;
        if (xBefore != xAfter) {
            ans = true;
        }
        assertEquals(ans, true);
    }
}
