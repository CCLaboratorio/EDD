package practica00;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgallo
 */
public class ProcesadorDeTextoTest {
    
    public ProcesadorDeTextoTest() {
    }

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of leeTexto method, of class ProcesadorDeTexto.
     * @throws java.lang.Exception
     */
    @Test
    public void testLeeTexto() throws Exception {
        System.out.println("leeTexto");
        String nombreArchivo = "/home/lgallo/Documents/s2019-2/Poema.txt";
        ProcesadorDeTexto instance = new ProcesadorDeTextoImpl();
        String[] expResult = {"Los amorosos","","(...)","El amor es el silencio más fino,","el más tembloroso, el más insoportable.","(...)","","-Jaime Sabines-"};
        String[] result = instance.leeTexto("/home/lgallo/Documents/s2019-2/Poema.txt");
        assertArrayEquals(expResult, result);
        System.out.println("Archivo procesado correctamente");
    }

    public class ProcesadorDeTextoImpl extends ProcesadorDeTexto {

        public String creaArchivo(String[] texto, String nombreArchivo) {
            return "";
        }
    }
    
}
