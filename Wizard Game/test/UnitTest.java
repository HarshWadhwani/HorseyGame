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
    
    @Test/*
    public void TestDriverA() throws AWTException{
        System.out.println("Test A begin");
        Robot Jess = new Robot();
        Jess.keyPress(65);
        System.out.println("Hello World" + GameDriverInstance.handler.isLeft());
        Jess.setAutoDelay(2000);

        assertEquals(GameDriverInstance.handler.isLeft(), true);
    }*/
    
    public void TesrDriverVelA() throws AWTException{
       
        System.out.println("Test VelA begin");
        Robot Jess = new Robot();
        Jess.keyPress(65);
        GameObject G = GameDriverInstance.handler.object.get(64);
        int xBefore = G.getX();
        Jess.delay(3000);
        int xAfter = G.getX();
        System.out.println(xBefore);
        System.out.println(xAfter);
        boolean ans = false;
        if (xBefore != xAfter){
            ans = true;
        }
        assertEquals(ans, true);
        
    }
    
    @Test    
    public void TesrDriverVelA2() throws AWTException{
       
        System.out.println("Test VelA begin");
        Robot Jess = new Robot();
        Jess.keyPress(65);
        GameObject G = GameDriverInstance.handler.object.get(64);
        int xBefore = G.getX();
        Jess.delay(2000);
        int xAfter = G.getX();
        System.out.println(xBefore);
        System.out.println(xAfter);
        boolean ans = false;
        if (xBefore != xAfter){
            ans = true;
        }
        assertEquals(ans, true);
        
    }


}
