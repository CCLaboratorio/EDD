package practica06;

/**
 * Excepción acceso incorrecto es lanzada en caso de que exista una 
 * violación de acceso a una estructura de datos o cuando se pretende
 * acceder a elementos inexistentes.
 *
 * @author Leonardo Gallo
 * @version 07/05/2018
 */
public class ExcepcionAccesoIncorrecto extends Exception {

    /**
     * Constructor.
     *
     * @param msg es un mensaje de error dado por el objeto que dispara la
     * excepción.
     */
    public ExcepcionAccesoIncorrecto(String msg) {
        super(msg + "\n");
    }
}
