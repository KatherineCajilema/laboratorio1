/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jairo
 */
public class LibreriaTest {
    
    public LibreriaTest() {
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
    
    @Test
    public void testDigit_to_string() {
        System.out.println("digit_to_string");
        int input = 0;
        Libreria instance = new Libreria();
        String expResult = "cero";
        String result = instance.digit_to_string(input);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of echo_array method, of class Libreria.
     */
    @Test
    public void testEcho_array() {
        System.out.println("echo_array");
        int[] input = {1,2,3,4,5};
        Libreria instance = new Libreria();
        int[] expResult = {1,2,3,4,5};
        int[] result = instance.echo_array(input);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of cualquier_cosa method, of class Libreria.
     */
    @Test
    public void testCualquier_cosa() {
        System.out.println("cualquier_cosa");
        boolean input = false;
        Libreria instance = new Libreria();
        Object result = instance.cualquier_cosa(input);
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
     @Test
    public void testCualquier_cosa_inverse() {
        System.out.println("cualquier_cosa");
        boolean input = true;
        Libreria instance = new Libreria();
        Object result = instance.cualquier_cosa(input);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of bit_to_boolean method, of class Libreria.
     */
    @Test
    public void testBit_to_boolean() {
        System.out.println("bit_to_boolean");
        int input = 0;
        Libreria instance = new Libreria();
        boolean result = instance.bit_to_boolean(input);
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    public void testBit_to_boolean_inverse() {
        System.out.println("bit_to_boolean");
        int input = 1;
        Libreria instance = new Libreria();
        boolean result = instance.bit_to_boolean(input);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test(expected = Exception.class)
    public void testException(){
       System.out.println("echo_array");
        int[] input = {1,2,3,4,5};
        Libreria instance = new Libreria();
        int[] expResult = {1,2,3,4,5};
        int[] result = instance.echo_array(input);
        int out=input[20];
        assertArrayEquals(expResult, result);
        
    }
    
    
}
