/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cpaulins
 */
public class InterfazCalculadoraTest {
    
    public InterfazCalculadoraTest() {
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
     * Test of setCadena method, of class InterfazCalculadora.
     */
    @Test
    public void testSetCadena() {
        System.out.println("setCadena");
        String s = "";
        InterfazCalculadora instance = new InterfazCalculadora();
        instance.setCadena(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCadena method, of class InterfazCalculadora.
     */
    @Test
    public void testGetCadena() {
        System.out.println("getCadena");
        InterfazCalculadora instance = new InterfazCalculadora();
        String expResult = "";
        String result = instance.getCadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUniversal method, of class InterfazCalculadora.
     */
    @Test
    public void testGetUniversal() {
        System.out.println("getUniversal");
        InterfazCalculadora instance = new InterfazCalculadora();
        String expResult = "";
        String result = instance.getUniversal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUniversal method, of class InterfazCalculadora.
     */
    @Test
    public void testSetUniversal() {
        System.out.println("setUniversal");
        String univ = "";
        InterfazCalculadora instance = new InterfazCalculadora();
        instance.setUniversal(univ);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrayList method, of class InterfazCalculadora.
     */
    @Test
    public void testGetArrayList() {
        System.out.println("getArrayList");
        InterfazCalculadora instance = new InterfazCalculadora();
        String expResult = "";
        String result = instance.getArrayList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregaArrayList method, of class InterfazCalculadora.
     */
    @Test
    public void testAgregaArrayList() {
        System.out.println("agregaArrayList");
        String s = "";
        InterfazCalculadora instance = new InterfazCalculadora();
        instance.agregaArrayList(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificaArray method, of class InterfazCalculadora.
     */
    @Test
    public void testModificaArray() {
        System.out.println("modificaArray");
        String s = "";
        int n = 0;
        InterfazCalculadora instance = new InterfazCalculadora();
        instance.modificaArray(s, n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class InterfazCalculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InterfazCalculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
