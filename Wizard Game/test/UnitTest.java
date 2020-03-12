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
        Jess.keyPress(65);
        System.out.println("Hello World" + GameDriverInstance.handler.isLeft());

        assertEquals(GameDriverInstance.handler.isLeft(), true);
    }


}
