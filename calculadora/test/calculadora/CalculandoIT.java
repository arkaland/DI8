/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rk
 */
public class CalculandoIT {
    
    public CalculandoIT() {
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

    /************
    TESTS DE SUMA
    ************/
    
    //TEST SUMA 0
    @Test
    public void testAddCero() {
        System.out.println("add");
        double number1 = 0;
        double number2 = 0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);
    }    
         //TEST SUMA HIGH NEGATIVES
    @Test
    public void testAddNegative() {
        System.out.println("add");
        double number1 = -1000000000;
        double number2 = -1000000000;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result,-2000000000.0);
    }
    
    //TEST SUMA HIGH NEGATIVES
     /* CORREGIDO   
    @Test

    public void testAddNegative() {
        System.out.println("add");
        double number1 = -1000000000;
        double number2 = -1000000000;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.add(-number1, number2);
        assertEquals(expResult, result,-2000000000.0);
    }*/
         //TEST SUMA HIGH POSITIVES
    @Test
    public void testAddPositive() {
        System.out.println("add");
        double number1 = 1000000000.0;
        double number2 = 1000000000.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 2000000000.0);
    }

         //TEST SUMA VALORES STANDART
    @Test
    public void testAddStandart() {
        System.out.println("add");
        double number1 = 100.0;
        double number2 = 100.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result,200.0);
    }
             //TEST SUMA VALORES RANDOM
    @Test
    public void testAddRandom() {
        System.out.println("add");
        double number1 = 8.0;
        double number2 = 9800.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 9808.0);
    }
        
    /*************
    TESTS DE RESTA
    *************/  
    
    //TEST RESTA 0
    @Test
    public void testSubtractZero() {
        System.out.println("subtract");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
        //TEST RESTA HIGH NEGATIVE NEGATIVE
    @Test
    public void testSubtractNegative() {
        System.out.println("subtract");
        double number1 = -1000000000.0;
        double number2 = -1000000000.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
            //TEST RESTA HIGH NEGATIVE POSITIVE
    @Test
    public void testSubtractNegPos() {
        System.out.println("subtract");
        double number1 = -1000000000.0;
        double number2 = 1000000000.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, -2000000000.0);
    }
        //TEST RESTA HIGH POSITIVE NEGATIVE
    @Test
    public void testSubtractPosNeg() {
        System.out.println("subtract");
        double number1 = 1000000000.0;
        double number2 = -1000000000.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
        //TEST RESTA STANDART
    @Test
    public void testSubtractStandart() {
        System.out.println("subtract");
        double number1 = 100.0;
        double number2 = 50.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 50.0);
    }
        //TEST RESTA RANDOM
    @Test
    public void testSubtractRandom() {
        System.out.println("subtract");
        double number1 = 218.0;
        double number2 = 68.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 150.0);
    }
    
    /*******************
    TESTS DE MULTIPLICAR
    ********************/    
    
    @Test
    public void testMultiplyZero() {
        System.out.println("multiply");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiplyPositive() {
        System.out.println("multiply");
        double number1 = 1000000.0;
        double number2 = 1000000.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 1000000000000.0);
    }
    @Test
    public void testMultiplyNegative() {
        System.out.println("multiply");
        double number1 = -1000000.0;
        double number2 = -1000000.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 1000000000000.0);
    }
    @Test
    public void testMultiplyStandart() {
        System.out.println("multiply");
        double number1 = 5.0;
        double number2 = 5.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 25.0);
    }
    @Test
    public void testMultiplyRandom() {
        System.out.println("multiply");
        double number1 = 132.0;
        double number2 = 348.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 45936.0);
    }

    /****************
    TESTS DE DIVISION
    ****************/ 
    
    @Test
    public void testDivideZero() {
        System.out.println("divide");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0);
    }
        @Test
    public void testDividePositiveNegative() {
        System.out.println("divide");
        double number1 = 1000000000.0;
        double number2 = -1000000000.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, -1.0);
    }
        @Test
    public void testDivideNegativePositive() {
        System.out.println("divide");
        double number1 = -1000000000.0;
        double number2 = 1000000000.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, -1.0);
    }
        @Test
    public void testDivideStandart() {
        System.out.println("divide");
        double number1 = 100.0;
        double number2 = 4.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 25.0);
    }    @Test
    public void testDivideRandom() {
        System.out.println("divide");
        double number1 = 324.0;
        double number2 = 237.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 1.36708860759);
    }
    
    
}
