package practica06;

/**
 * Interface con lo métodos de los algoritmos de búsqueda sobre arreglos.
 *
 * @author Leonardo Gallo
 * @version 07/05/2018
 */
public interface AlgoritmoDeBusqueda {

    /**
     * Busca un elemento en un arreglo
     *
     * @param elementos lugar donde realizamos la búsqueda
     * @param elemento especifica la búsqueda
     * @return regresa la posición del elemento, si no está regresa -1
     */
    public int buscaElemento(Comparable[] elementos, Comparable elemento);
}
