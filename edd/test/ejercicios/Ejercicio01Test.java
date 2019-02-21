package ejercicios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para probar la implementación del factorial
 * en su versión iterativa y recursiva.
 * @author lgallo
 */
public class Ejercicio01Test {
    
    public Ejercicio01Test() {
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
     * Prueba del método factorialIterativo, de la clase Ejercicio01.
     * En esta prueba hay exceso de lineas de código, se implementa así
     * para dar énfasis a lo que se evalua en cada parte.
     */
    @Test
    public void testFactorialIterativo() {
        System.out.println("factorialIterativo");
        long n = 0L;
        long expResult = 1L;
        long result = Ejercicio01.factorialIterativo(n);
        System.out.println("Pruebas aprovadas:");
        
        /*  Evaluamos el factorial de cero  */
        assertEquals(expResult, result);
        System.out.println("Factorial de cero");
        
        /* 
            Evaluamos que la implementación soporte la entrada
            de números negativos
        */
        n = -10L;
        expResult = -1L;
        result = Ejercicio01.factorialIterativo(n);
        assertEquals(expResult, result);
        System.out.println("Maneja entrada de números negativos");
        
        /*  Evaluamos un caso conocido del factorial.  */
        n = 4L;
        expResult = 24L;
        result = Ejercicio01.factorialIterativo(n);
        assertEquals(expResult, result);
        System.out.println("Factorial de un número entero positivo, 4");
        
        //fail("The test case is a prototype.");
    }

}
