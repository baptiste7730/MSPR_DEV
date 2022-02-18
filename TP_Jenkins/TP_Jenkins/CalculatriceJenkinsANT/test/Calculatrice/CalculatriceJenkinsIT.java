/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Calculatrice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ES52281931
 */
public class CalculatriceJenkinsIT {
    
    public CalculatriceJenkinsIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addition method, of class CalculatriceJenkins.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        int a = 0;
        int b = 0;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.addition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soustraction method, of class CalculatriceJenkins.
     */
    @Test
    public void testSoustraction() {
        System.out.println("soustraction");
        int a = 0;
        int b = 0;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.soustraction(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplication method, of class CalculatriceJenkins.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int a = 0;
        int b = 0;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.multiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class CalculatriceJenkins.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 0;
        int b = 0;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
