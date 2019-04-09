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

    private Lista<Integer> lista;
    private String MSG_LONGITUD;
    private String MSG_VACIA_F;

    public ListaLigadaTest() {
    }

    @Before
    public void setUp() {
        lista = new ListaLigada<>();
        MSG_LONGITUD = "La longitud de la lista es incorrecta";
        MSG_VACIA_F = "La lista no debe estar vacía";
        lista.agregaInicio(5);
        lista.agregaInicio(4);
        lista.agregaInicio(3);
        lista.agregaInicio(2);
        lista.agregaInicio(1);
        lista.agregaInicio(0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of esVacia method, of class ListaDoblementeLigada.
     */
    @Test
    public void testEsVaciaTrue() {
        boolean expResult = true;
        boolean result;
        lista.limpia();
        result = lista.esVacia();
        System.out.println("...................................................");
        System.out.println("Método : esVacia() caso verdadero");
        assertEquals(expResult, result);
        System.out.println("..............................................ÉXITO");
    }

    /**
     * Test of esVacia method, of class ListaDoblementeLigada.
     */
    @Test
    public void testEsVaciaFalse() {
        boolean expResult = false;
        boolean result;
        System.out.println("...................................................");
        System.out.println("Método : esVacia() caso falso");
        try {
            lista.limpia();
            lista.agregaInicio(1);
            lista.elimina(0);
            lista.agregaFinal(2);
            result = lista.esVacia();
            assertEquals(MSG_LONGITUD, 1, lista.daLongitud());
            assertEquals(MSG_VACIA_F, expResult, result);
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("Esta prueba hace uso de agregaInicio | eliminar por índice | agregaFinal");
        }
    }

    /**
     * Test of agregaInicio method, of class ListaDoblementeLigada.
     */
    @Test
    public void testAgregaInicio() {
        try {
            System.out.println("...................................................");
            System.out.println("Método : agregaInicio()");
            assertEquals(MSG_LONGITUD, 6, lista.daLongitud());
            for (int i = 0; i < 6; i++) {
                assertEquals(i, (int) lista.obtenElemento(i));
            }
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("No se pudo verificar la consistencia de la lista, se recomienda"
                    + " revisar también el funcionamiento de obtenElemento");
        }
    }

    /**
     * Test of agregaInicio method, of class ListaDoblementeLigada.
     */
    @Test
    public void testAgregaFinal() {
        try {
            System.out.println("...................................................");
            System.out.println("Método : agregaFinal()");
            lista.limpia();
            lista.agregaFinal(0);
            lista.agregaFinal(1);
            lista.agregaFinal(2);
            lista.agregaFinal(3);
            lista.agregaFinal(4);
            lista.agregaFinal(5);
            assertEquals(MSG_LONGITUD, 6, lista.daLongitud());
            for (int i = 0; i < 6; i++) {
                assertEquals(i, (int) lista.obtenElemento(i));
            }
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("No se pudo verificar la consistencia de la lista, se recomienda"
                    + " revisar también el funcionamiento de obtenElemento");
        }
    }

    /**
     * Test of elimina method, of class ListaLigada.
     */
    @Test
    public void testElimina_GenericType() {
        Integer elemento = 5;
        System.out.println("...................................................");
        System.out.println("Método : elimina(E elemento)");
        try {
            lista.limpia();
            lista.agregaFinal(5);
            lista.agregaFinal(0);
            lista.agregaFinal(1);
            lista.agregaFinal(2);
            lista.agregaFinal(5);
            lista.agregaFinal(5);
            lista.agregaFinal(3);
            lista.agregaFinal(4);
            lista.agregaFinal(5);
            lista.elimina(elemento);
            assertEquals(MSG_LONGITUD, 5, lista.daLongitud());
            for (int i = 0; i < 5; i++) {
                System.out.println(lista.obtenElemento(i));
                assertEquals(i, (int) lista.obtenElemento(i));
            }
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("El error también puede ser causado si no está definido agragaFinal"
                    + " u obtenElemento");
        }
    }

    /**
     * Test of elimina method, of class ListaDoblementeLigada.
     */
    @Test
    public void testElimina_int() {
        System.out.println("...................................................");
        System.out.println("Método : elimina(int indice)");
        try {
            System.out.println("La eliminación...");
            assertEquals(2, (int) lista.elimina(2));
            assertEquals(5, (int) lista.elimina(4));
            assertEquals(0, (int) lista.elimina(0));
            System.out.println("se realizó correctamente"
                    + "\nLa consistencia de los datos...");
            assertEquals(MSG_LONGITUD, 3, lista.daLongitud());
            assertEquals(1, (int) lista.obtenElemento(0));
            assertEquals(3, (int) lista.obtenElemento(1));
            assertEquals(4, (int) lista.obtenElemento(2));
            System.out.println("es correcta."
                    + "\nImportante, verificar que el apuntador ultimo\n"
                    + "esté referenciado a la celda que tiene por elemento 4");
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("El error también puede ser causado si no está definido agragaInicio o"
                    + " por que al eliminar se genera un NullPointerException");
        }
    }

    /**
     * Test of elimina method, of class ListaDoblementeLigada.
     */
    @Test
    public void testElimina_int_Excepcion_Neg() {
        System.out.println("...................................................");
        System.out.println("Método : elimina(int indice) ínidice negativo");
        try {
            lista.elimina(-1);
            fail("Se esperaba una excepción con un mensaje personalizado");
        } catch (IndexOutOfBoundsException e) {
            assertNotEquals("Se esperaba un mensaje referente", e.getMessage(), null);
        }
        System.out.println("..............................................ÉXITO");
    }

    /**
     * Test of elimina method, of class ListaDoblementeLigada.
     */
    @Test
    public void testElimina_int_Excepcion() {
        System.out.println("..................................................."
                + "\nMétodo : elimina(int indice)"
                + "\nCaso   : ínidice mayor a la longitud");
        try {
            lista.elimina(6);
        } catch (IndexOutOfBoundsException e) {
            assertNotEquals("Se esperaba un mensaje referente", e.getMessage(), null);
            System.out.println("..............................................ÉXITO");
        }
    }

    /**
     * Test of agrega method, of class ListaDoblementeLigada.
     */
    @Test
    public void testAgrega() {
        System.out.println("...................................................");
        System.out.println("Método : agrega()");
        try {
            lista.limpia();
            lista.agregaInicio(5);
            lista.agrega(0, 0);
            lista.agrega(2, 1);
            lista.agrega(3, 2);
            lista.agrega(4, 3);
            lista.agrega(1, 1);
            assertEquals(MSG_LONGITUD, 6, lista.daLongitud());
            for (int i = 0; i < 6; i++) {
                assertEquals(i, (int) lista.obtenElemento(i));
            }
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("No se pudo verificar la consistencia de la lista, se recomienda"
                    + " revisar también el funcionamiento de obtenElemento");
        }
    }

    /**
     * Test of elimina method, of class ListaDoblementeLigada.
     */
    @Test
    public void testAgrega_Mayor() {
        System.out.println("..................................................."
                + "\nMétodo : agrega(E elemento, int indice)"
                + "\nCaso   : ínidice mayor a la longitud");
        try {
            lista.limpia();
            lista.agrega(0, 10);
        } catch (IndexOutOfBoundsException e) {
            assertNotEquals("Se esperaba un mensaje referente", e.getMessage(), null);
            System.out.println("..............................................ÉXITO");
        }
    }

    /**
     * Test of elimina method, of class ListaDoblementeLigada.
     */
    @Test
    public void testAgrega_Neg() {
        System.out.println("..................................................."
                + "\nMétodo : agrega(E elemento, int indice)"
                + "\nCaso   : ínidice negativo");
        try {
            lista.agrega(0, -10);
        } catch (IndexOutOfBoundsException e) {
            assertNotEquals("Se esperaba un mensaje referente", e.getMessage(), null);
            System.out.println("..............................................ÉXITO");
        }
    }

    /**
     * Test of estaContenido method, of class ListaDoblementeLigada.
     */
    @Test
    public void testEstaContenido() {
        Integer elemento1 = 3;
        Integer elemento2 = 10;
        boolean result;
        System.out.println("..................................................."
                + "\nMétodo : estaContenido()"
                + "\nCaso   : Verdadero");
        try {
            result = lista.estaContenido(elemento1);
            assertEquals(true, result);
            System.out.println("..............................................ÉXITO");
            System.out.println("..................................................."
                    + "\nMétodo : estaContenido()"
                    + "\nCaso   : False");
            result = lista.estaContenido(elemento2);
            assertEquals(false, result);
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("Esta excepción también pudo haber sido generada por el mal"
                    + " funcionamiento del método agregaInicio.");
        }
    }

    /**
     * Test of obtenElemento method, of class ListaDoblementeLigada.
     */
    @Test
    public void testObtenElemento() {
        System.out.println("..................................................."
                + "\nMétodo : obtenElemento(int indice)");
        try {
            assertEquals(2, (int) lista.obtenElemento(2));
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("Esta excepción también pudo haber sido generada por el mal"
                    + " funcionamiento del método agregaInicio.");
        }
    }

    /**
     * Test of obtenElemento method, of class ListaDoblementeLigada.
     */
    @Test
    public void testObtenElemento_Excepcion() {
        System.out.println("..................................................."
                + "\nMétodo : obtenElemento(int indice)"
                + "\nCaso   : índice igual a la longitud");
        try {
            lista.obtenElemento(6);
        } catch (IndexOutOfBoundsException e) {
            assertNotEquals("Se esperaba un mensaje referente", e.getMessage(), null);
            System.out.println("..............................................ÉXITO");
        }
    }

    /**
     * Test of obtenIndice method, of class ListaDoblementeLigada.
     */
    @Test
    public void testObtenIndice() {
        Integer elemento = 3;
        System.out.println("..................................................."
                + "\nMétodo : obtenIndice(E elemento)");
        try {
            assertEquals(3, lista.obtenIndice(elemento));
            System.out.println("..............................................ÉXITO");
        } catch (NullPointerException e) {
            fail("Esta excepción también pudo haber sido generada por el mal"
                    + " un mal manejo de los índices");
        }

    }

    /**
     * Test of obtenIndice method, of class ListaDoblementeLigada.
     */
    @Test
    public void testObtenIndice_Negativo() {
        boolean result;
        System.out.println("..................................................."
                + "\nMétodo : obtenIndice(E elemento)"
                + "\nCaso   : Negativo");
        lista.limpia();
        result = lista.obtenIndice(2) < 0;
        assertEquals(true, result);
        System.out.println("..............................................ÉXITO");
    }

    /**
     * Test of limpia method, of class ListaDoblementeLigada.
     */
    @Test
    public void testLimpia() {
        System.out.println("..................................................."
                + "\nMétodo : limpia()");
        lista.limpia();
        assertEquals("La lista no es vacía", true, lista.esVacia());
        System.out.println("..............................................ÉXITO");
    }

    /**
     * Test of equals method, of class ListaDoblementeLigada.
     */
    @Test
    public void testEquals() {
        System.out.println("..................................................."
                + "\nMétodo : equals(Object o)");
        Lista<Integer> lista2 = new ListaLigada<>();
        lista2.agregaInicio(5);
        lista2.agregaInicio(4);
        lista2.agregaInicio(3);
        lista2.agregaInicio(2);
        lista2.agregaInicio(1);
        lista2.agregaInicio(0);
        assertEquals(true, lista.equals(lista2));
        lista2.limpia();
        lista2.agregaInicio(5);
        lista2.agregaInicio(4);
        lista2.agregaInicio(3);
        lista2.agregaInicio(2);
        lista2.agregaInicio(0);
        lista2.agregaInicio(1);
        assertEquals(false, lista.equals(lista2));
        System.out.println("..............................................ÉXITO");
    }
}
