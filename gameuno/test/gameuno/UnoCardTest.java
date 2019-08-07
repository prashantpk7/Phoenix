/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameuno;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Prashant Khanna
 */
public class UnoCardTest {
    
    public UnoCardTest() {
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
     * Test of getFace method, of class UnoCard.
     */
    @Test
    public void testGetFaceGood() {
        System.out.println("getFace");
        UnoCard instance = new UnoCard(6,"Red"); //randomly generated uno Card
        String expResult = "[Red 6]";
        String result = instance.getFace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetFaceBoundary() {
        System.out.println("getFace");
        UnoCard instance = new UnoCard(0,"Red"); //randomly generated uno Card
        String expResult = "[Red 0]";
        String result = instance.getFace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetFaceBad() {
        System.out.println("getFace");
        UnoCard instance = new UnoCard(-1,"Blue"); //randomly generated uno Card
        String expResult = "[Blue -1]";
        String result = instance.getFace();
        assertTrue("Invalid Face Value", result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of canPlace method, of class UnoCard.
     */
    @Test
    public void testCanPlaceGood() {
        System.out.println("canPlace");
        UnoCard o = new UnoCard(4,"Red");
        String c = "Red";
        UnoCard instance = new UnoCard(3,"Red");
        boolean expResult = true;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
        public void testCanPlaceBoundary() {
        System.out.println("canPlace");
        UnoCard o = new UnoCard(4,"Red");
        String c = "none";
        UnoCard instance = new UnoCard(0,"none");
        boolean expResult = true;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test    
        public void testCanPlaceBad() {
        System.out.println("canPlace");
        UnoCard o = new UnoCard(-1,"Blue");
        String c = "Red";
        UnoCard instance = new UnoCard(-1,"Blue");
        boolean expResult = true;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
