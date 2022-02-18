/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculatrice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author ES52281931
 */
public class CalculatriceJenkinsTest {
    
    public CalculatriceJenkinsTest() {
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
     * Test of addition method, of class CalculatriceJenkins.
     */
    @org.junit.jupiter.api.Test
    public void testAddition() {
        System.out.println("addition");
        int a = 0;
        int b = 0;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.addition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of soustraction method, of class CalculatriceJenkins.
     */
    @org.junit.jupiter.api.Test
    public void testSoustraction() {
        System.out.println("soustraction");
        int a = 0;
        int b = 0;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.soustraction(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of multiplication method, of class CalculatriceJenkins.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int a = 0;
        int b = 0;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.multiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class CalculatriceJenkins.
     */
    @org.junit.jupiter.api.Test
    public void testDivision() {
        System.out.println("division");
        int a = 0;
        int b = 9;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}
