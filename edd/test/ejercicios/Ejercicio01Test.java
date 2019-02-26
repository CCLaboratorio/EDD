package ejercicios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para probar la implementación del factorial en su versión iterativa y
 * recursiva.
 *
 * @author lgallo
 */
public class Ejercicio01Test {
    
    private final long[] expResult = new long[6];

    @Before
    public void setUp() {
        expResult[0] = 1L;
        expResult[1] = 1L;
        expResult[2] = 2L;
        expResult[3] = 6L;
        expResult[4] = 24L;
        expResult[5] = 120L;
    }

    @After
    public void tearDown() {
    }
    
    /**
     * Prueba del método factorialIterativo, de la clase Ejercicio01,
     * para entradas mayores o iguales a cero.
     * 
     * @throws ejercicios.ExcepcionFactorial
     */ 
    @Test
    public void testFactorial() throws ExcepcionFactorial {
        System.out.println("Factorial para entradas mayores o iguales a cero");
        long[] result = new long[6];
        
        /*  Evaluamos el factorial hasta 5  */
        for (int i = 0; i <= 5; i++) {
            result[i] = Ejercicio01.factorialIterativo(i);
        }
        assertArrayEquals(expResult, result);
        System.out.println("\t-> Se calculó correctamente el factorial");
    }
    
    /**
     * Prueba del método factorialIterativo, de la clase Ejercicio01,
     * para entradas negativas.
     * 
     * @throws ejercicios.ExcepcionFactorial
     */
    @Test
    public void testExcepcionFactorial() {
        System.out.println("Factorial para entradas negativas");
        long n = -10L;
        try {
            Ejercicio01.factorialIterativo(n);
            fail("Se esperaba ExcepcionFactorial");
        } catch (ExcepcionFactorial ex) {
            System.out.println("\t-> Se lanzó correctamente la excepción");
        }
    }

}
