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
        Jess.keyPress(83);
        System.out.println("Hello World" + GameDriverInstance.handler.isLeft());
        
        Jess.delay(1000);
        assertEquals(GameDriverInstance.handler.isDown(), true);
    }
   
    @Test
    public void TestDriverD() throws AWTException {
        System.out.println("Test D begin");
        Robot Jess = new Robot();
        Jess.keyPress(68);
        System.out.println("we better get here");
        Jess.delay(6900);
    
        assertEquals(GameDriverInstance.handler.isRight(), true);
		
        System.out.println("Test B begin");
        GameObject G = GameDriverInstance.handler.object.get(0);
        int xBefore = G.getX();
        Robot Jess2 = new Robot();
        Jess2.keyPress(68);
        Jess2.delay(3);
        int xAfter = G.getX();
    } 
}
