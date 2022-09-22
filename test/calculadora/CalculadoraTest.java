/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Cesar Paulin
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of imprimeArray method, of class Calculadora.
     */
    @Test
    public void testImprimeArray() {
        System.out.println("imprimeArray");
        ArrayList<String> arre = new ArrayList();
        arre.add("5");
        arre.add("+");
        arre.add("7");
        arre.add("*");
        arre.add("2");
        String expResult = "5+7*2";
        String result = Calculadora.imprimeArray(arre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarUltimoElemento method, of class Calculadora.
     */
    @Test
    public void testQuitarUltimoElemento() {
        System.out.println("quitarUltimoElemento");
        String s = "5";
        String expResult = "5";
        String result = Calculadora.quitarUltimoElemento(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiaDeSigno method, of class Calculadora.
     */
    @Test
    public void testCambiaDeSigno() {
        System.out.println("cambiaDeSigno");
        String s = "674";
        String expResult = "-674";
        String result = Calculadora.cambiaDeSigno(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revisaArray method, of class Calculadora.
     */
    @Test
    public void testRevisaArray() {
        System.out.println("revisaArray");
        ArrayList<String> arr = new ArrayList();
        arr.add("(");
        arr.add("5");
        arr.add("-");
        arr.add("2");
        arr.add("(");
        arr.add("7");
        arr.add(")");
        boolean expResult = false; //no esta balanceado
        boolean result = Calculadora.revisaArray(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esOperador method, of class Calculadora.
     */
    @Test
    public void testEsOperador() {
        System.out.println("esOperador");
        String c = "+";
        boolean expResult = true;
        boolean result = Calculadora.esOperador(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escribePostfijo method, of class Calculadora.
     */
    @Test
    public void testEscribePostfijo() {
        System.out.println("escribePostfijo");
        ArrayList<String> infijo = new ArrayList();
        ArrayList<String> expResult = new ArrayList();
        ArrayList<String> result = Calculadora.escribePostfijo(infijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
