package practica02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * COMÉNTAME...
 * @author Leonardo Gallo
 */
public class MatrizArreglosTest {

    Racional[][] matrizA = new Racional[2][3];

    @Before
    public void setUp() {
        matrizA[0][0] = new Racional(1);
        matrizA[0][1] = new Racional(0);
        matrizA[0][2] = new Racional(0);
        matrizA[1][0] = new Racional(0);
        matrizA[1][1] = new Racional(1);
        matrizA[1][2] = new Racional(1);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getRenglones method, of class MatrizArreglos.
     */
    @Test
    public void testGetRenglones() {
        System.out.println("getRenglones");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        int expResult = 2;
        int result = instance.getRenglones();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColumnas method, of class MatrizArreglos.
     */
    @Test
    public void testGetColumnas() {
        System.out.println("getColumnas");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        int expResult = 3;
        int result = instance.getColumnas();
        assertEquals(expResult, result);
    }

    /**
     * Test of esCuadrada method, of class MatrizArreglos.
     */
    @Test
    public void testEsCuadrada() {
        System.out.println("esCuadrada");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        boolean expResult = false;
        boolean result = instance.esCuadrada();
        assertEquals(expResult, result);
    }

    /**
     * Test of sumaMatriz method, of class MatrizArreglos.
     */
    @Test
    public void testSumaMatriz() {
        System.out.println("sumaMatriz");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        Matriz result = instance.sumaMatriz(instance);
        assertEquals(result.getElemento(0, 0), new Racional(2));
        assertEquals(result.getElemento(0, 1), new Racional(0));
        assertEquals(result.getElemento(0, 2), new Racional(0));
        assertEquals(result.getElemento(1, 0), new Racional(0));
        assertEquals(result.getElemento(1, 1), new Racional(2));
        assertEquals(result.getElemento(1, 2), new Racional(2));
    }

    /**
     * Test of restaMatriz method, of class MatrizArreglos.
     */
    @Test
    public void testRestaMatriz() {
        System.out.println("sumaMatriz");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        Matriz result = instance.sumaMatriz(instance);
        assertEquals(result.getElemento(0, 0), new Racional(0));
        assertEquals(result.getElemento(0, 1), new Racional(0));
        assertEquals(result.getElemento(0, 2), new Racional(0));
        assertEquals(result.getElemento(1, 0), new Racional(0));
        assertEquals(result.getElemento(1, 1), new Racional(0));
        assertEquals(result.getElemento(1, 2), new Racional(0));
    }

    /**
     * Test of multiplicaMatriz method, of class MatrizArreglos.
     */
    @Test
    public void testMultiplicaMatriz_Matriz() {
        System.out.println("multiplicaMatriz");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        Racional[][] matrizB = new Racional[3][2];
        matrizB[0][0] = new Racional(2);
        matrizB[0][1] = new Racional(0);
        matrizB[1][0] = new Racional(0);
        matrizB[1][1] = new Racional(2);
        matrizB[3][0] = new Racional(0);
        matrizB[3][1] = new Racional(2);
        Matriz result = instance.sumaMatriz(instance);
        assertEquals(result.getElemento(0, 0), new Racional(3));
        assertEquals(result.getElemento(0, 1), new Racional(0));
        assertEquals(result.getElemento(1, 0), new Racional(0));
        assertEquals(result.getElemento(1, 1), new Racional(4));

    }

    /**
     * Test of multiplicaMatriz method, of class MatrizArreglos.
     */
    @Test
    public void testMultiplicaMatriz_GenericType() {
        System.out.println("multiplicaMatriz");
        Racional escalar = new Racional(5);
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        Racional[][] matrizB = new Racional[2][3];
        matrizB[0][0] = new Racional(5);
        matrizB[0][1] = new Racional(0);
        matrizB[0][2] = new Racional(0);
        matrizB[1][0] = new Racional(0);
        matrizB[1][1] = new Racional(5);
        matrizB[1][2] = new Racional(5);
        Matriz expResult = new MatrizArreglos<>(matrizB);
        Matriz result = instance.multiplicaMatriz(escalar);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculaDeterminante method, of class MatrizArreglos.
     */
    @Test
    public void testCalculaDeterminante() {
        try {
            System.out.println("calculaDeterminante");
            Racional[][] matrizB = new Racional[3][3];
            matrizB[0][0] = new Racional(3);
            matrizB[0][1] = new Racional(2);
            matrizB[0][2] = new Racional(1);
            matrizB[1][0] = new Racional(0);
            matrizB[1][1] = new Racional(2);
            matrizB[1][2] = new Racional(-5);
            matrizB[2][0] = new Racional(-2);
            matrizB[2][1] = new Racional(1);
            matrizB[2][2] = new Racional(4);
            Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
            Racional expResult = new Racional(63);
            Racional result = instance.calculaDeterminante();
            assertEquals(expResult, result);
        } catch (ExcepcionMatriz ex) {
        }
    }

    /**
     * Test of getElemento method, of class MatrizArreglos.
     */
    @Test
    public void testGetElementoExcepcion() {
        System.out.println("getElemento");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        try {
            instance.getElemento(3, 3);
            fail("No se generó correctamente la prueba");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Se generó correctamente la excepción");
        }
    }

    /**
     * Test of getElemento method, of class MatrizArreglos.
     */
    @Test
    public void testGetElemento() {
        System.out.println("getElemento");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        try {
            Racional result = instance.getElemento(1, 2);
            Racional expResult = new Racional(1);
            assertEquals(expResult, result);
        } catch (IndexOutOfBoundsException e) {
        }
    }

    /**
     * Test of setElemento method, of class MatrizArreglos.
     */
    @Test
    public void testSetElemento() {
        System.out.println("setElemento");
        int renglon = 1;
        int columna = 2;
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
        Racional expResult = new Racional(4);
        instance.setElemento(renglon, columna);
        assertEquals(expResult, instance.getElemento(1, 2));
    }

    /**
     * Test of llenaMatriz method, of class MatrizArreglos.
     */
    @Test
    public void testLlenaMatrizExcepcion() {
        System.out.println("Excepción método llenaMatriz");
        Matriz<Racional> instance = new MatrizArreglos<>(new Racional[3][3]);
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            instance.llenaMatriz(in);
            fail("No se generó correctamente la prueba");
        } catch (ExcepcionMatriz ex) {
            System.out.println("Se generó correctamente la excepción");
        }
    }

    /**
     * Test of muestraMatriz method, of class MatrizArreglos.
     */
    @Test
    public void testMuestraMatriz() {
        System.out.println("muestraMatriz");
        Matriz<Racional> instance = new MatrizArreglos<>(matrizA);
    }

}
