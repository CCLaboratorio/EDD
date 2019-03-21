/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo Gallo
 */
public class ListaLigadaTest {
    
    
    private ListaLigada instance;
    private Celda c1;
    private Celda c2;
    private Celda c3;
    private Celda c4;
    private Celda c5;
    private Celda c6;
    private Celda c7;
    private Celda c8;
    private Celda c9;
    
    public ListaLigadaTest() {
        
    }
    
    @Before
    public void setUp() {
        Celda c9 = new Celda("1",null);
        Celda c8 = new Celda("1",c9);
        Celda c7 = new Celda("1",c8);
        Celda c6 = new Celda("5",c7);
        Celda c5 = new Celda("1",c6);
        Celda c4 = new Celda("3",c5);
        Celda c3 = new Celda("1",c4);
        Celda c2 = new Celda("1",c3);
        Celda c1 = new Celda("1",c2);
        instance = new ListaLigada(c1,c9,9);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of elimina method, of class ListaLigada.
     */
    @Test
    public void testElimina_GenericType() {
        System.out.println("elimina");
        String elemento = "1";;
        instance.elimina(elemento);
        assertEquals(instance.getInicio(),c4);
        assertEquals(instance.getInicio(),c6);
        assertEquals(instance.daLongitud(), 2);
    }

}
