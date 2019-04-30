package practica06;

/**
 * Interfaz con la firma de los métodos de los algoritmos de ordenamiento.
 *
 * @author Leonardo Gallo
 * @version 07/05/2018
 */
public interface AlgoritmoDeOrdenamiento {

    /**
     * Establece el arreglo a ordenar.
     *
     * @param elementos es la instancia del arreglo que se deberá ordenar.
     * @throws ExcepcionAccesoIncorrecto si el arreglo es vacío.
     */
    public void setElementos(Comparable[] elementos) 
            throws ExcepcionAccesoIncorrecto;

    /**
     * Ordena un arreglo de elementos comparables
     *
     * @param creciente determina si el arreglo debe ordenarse
     * creciente (true) o decrecientemente (false).
     * @return regresa los elementos ordenados en un arreglo.
     * @throws ExcepcionAccesoIncorrecto
     */
    public Comparable[] ordenaElementos(boolean creciente) 
            throws ExcepcionAccesoIncorrecto;
}
