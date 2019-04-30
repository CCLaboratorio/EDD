package practica06;

import java.io.FileNotFoundException;
import java.util.Scanner;
//import ejercicio02.LectorDeArchivos;
import java.io.IOException;

/**
 * Interfaz de usuario para probar los algoritmos de ordenamiento y búsqueda.
 *
 * @author Leonardo Gallo
 * @version 07/05/2018
 */
public class UsoAlgoritmos {

    /* Mensajes del sistema */
    public static final String MSG_INICIO = "Bienvenido";
    public static final String MSG_SALIDA = "Vuelve pronto";

    /**
     * Método principal.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        /* variables */
        Scanner sc = new Scanner(System.in);
        String[] elementos = null;
        String opcion;
        boolean archivoLeido = false;

        //INICIO UI
        System.out.println(MSG_INICIO);
        for (;;) {
            try {
                muestraInstruccionesUso();
                opcion = sc.nextLine() + ".txt";
//                elementos = LectorDeArchivos.leeArchivo(opcion);

                muestraMenuOpciones();
                opcion = sc.nextLine();
                ejecutaEleccion(elementos, opcion);
                break;
                //Manejo de excepciones
            } catch (FileNotFoundException f) {
                System.out.println(f.getMessage());
            } catch (Exception ex) {
                System.out.println("Has ingresado una opción inválida, intenta de nuevo");
                archivoLeido = true;
            }
        }
        System.out.println(MSG_SALIDA);
        //FIN UI
    }

    /**
     * Método que muestra las instrucciones de uso de la interfaz de la
     * aplicación.
     */
    public static void muestraInstruccionesUso() {
        System.out.println("Esta aplicación corre algoritmos sobre elementos "
                + "comparables, leídos de un archivo de texto plano, previamente"
                + "ubicado en la carpeta resources del proyecto."
                + "\nIntroduce el nombre del archivo sin incluir la extensión.");
    }

    /**
     * Método que muestra las opciones disponibles, algoritmos soportados.
     */
    public static void muestraMenuOpciones() {
        //implementación...
    }

    /**
     * Método que ejecuta el algoritmo seleccionado.
     *
     * @param elementos arreglo de elementos a pasar como parámetro al algoritmo
     * @param opcion algoritmo seleccionado por el usuario
     * @throws java.io.IOException
     */
    public static void ejecutaEleccion(String[] elementos, String opcion) throws Exception {
        //implementación...
    }
}
