/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INE
 */
public class ArbolAVLTest {

    private ArbolAVL<Integer> arbol;
    private String MSG_ALTURA;
    
    public ArbolAVLTest() {
    }

    @Before
    public void setUp() {
        arbol = new ArbolAVL();
        MSG_ALTURA = "la altura del árbol no es la esperada";
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esVacio method, of class ArbolAVL.
     */
    @Test
    public void testEsVacio() {
        System.out.println("Prueba esVacio ");
        boolean expResult = true;
        boolean result = arbol.esVacio();
        assertEquals(expResult, result);
    }

    /**
     * Test of daAltura method, of class ArbolAVL.
     */
    @Test
    public void testDaAltura() {
        System.out.println("daAltura");
        int expResult = 0;
        int result = arbol.daAltura();
        System.out.println("La altura es : " + arbol.daAltura());
        assertEquals(expResult, result);
        arbol.inserta(13);
        System.out.println("La altura es : " + arbol.daAltura());
    }

    /**
     * Test of inserta method, of class ArbolAVL.
     */
    @Test
    public void testInserta() {
        System.out.println("inserta");
        arbol = new ArbolAVL<>();
        arbol.inserta(13);
        arbol.inserta(4);
        arbol.inserta(8);
        arbol.inserta(2);
        arbol.inserta(1);
        arbol.inserta(3);
        arbol.inserta(15);
        arbol.inserta(12);
        arbol.inserta(9);
        assertEquals(MSG_ALTURA,4, arbol.daAltura());
        System.out.println("Los valores en el árbol" + arbol.toString());
    }

    /**
     * Test of elimina method, of class ArbolAVL.
     */
    @Test
    public void testElimina() {
        System.out.println("elimina");
        arbol = new ArbolAVL<>();
        arbol.inserta(13);
        arbol.inserta(4);
        arbol.inserta(8);
        arbol.inserta(2);
        arbol.inserta(1);
        arbol.inserta(3);
        arbol.inserta(15);
        arbol.inserta(12);
        arbol.inserta(9);
        assertEquals(MSG_ALTURA,4, arbol.daAltura());
        System.out.println("Los valores en el árbol" + arbol.toString());
        arbol.elimina(15);
        assertEquals(MSG_ALTURA,4, arbol.daAltura());
        System.out.println("Los valores en el árbol" + arbol.toString());
        arbol.elimina(4);
        System.out.println("Los valores en el árbol" + arbol.toString());
        assertEquals(MSG_ALTURA,3, arbol.daAltura());
        System.out.println("Los valores en el árbol" + arbol.toString());
    }

    /**
     * Test of busca method, of class ArbolAVL.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        arbol = new ArbolAVL<>();
        arbol.inserta(13);
        arbol.inserta(4);
        arbol.inserta(8);
        arbol.inserta(2);
        arbol.inserta(1);
        arbol.inserta(3);
        arbol.inserta(15);
        arbol.inserta(12);
        arbol.inserta(9);
        Nodo<Integer> raiz = arbol.busca(13);
        assertEquals("El valor de la raiz no coincide",4, (int)raiz.getValor());
        assertEquals(13, (int)raiz.getDerecho().getValor());
        assertEquals(2, (int)raiz.getIzquierdo().getValor());
        assertEquals(15, (int)raiz.getDerecho().getDerecho().getValor());
        assertEquals(9, (int)raiz.getDerecho().getIzquierdo().getValor());
        assertEquals(12, (int)raiz.getDerecho().getIzquierdo().getDerecho().getValor());
        assertEquals(8, (int)raiz.getDerecho().getIzquierdo().getIzquierdo().getValor());
        assertEquals(3, (int)raiz.getIzquierdo().getDerecho().getValor());
        assertEquals(1, (int)raiz.getIzquierdo().getIzquierdo().getValor());
    }
}
