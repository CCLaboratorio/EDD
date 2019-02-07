package practica00;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author lgallo
 */
public abstract class ProcesadorDeTexto {

    /**
     * Variables y objetos de la clase *
     */
    protected String ruta;

    /**
     *
     * @param nombreArchivo
     * @return
     * @throws java.io.IOException
     */
    public String leeTexto(String nombreArchivo) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(nombreArchivo));
        return "";
    }

    /**
     *
     * @param texto
     * @param nombreArchivo
     * @return
     */
    public abstract String creaArchivo(String[] texto, String nombreArchivo);
}
