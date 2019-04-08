package practica03;

/**
 * COMÉNTAME...
 * @author
 * @param <E>
 */
public interface Lista<E> {

    /**
     * COMÉNTAME...
     * @return 
     */
    boolean esVacia();

    /**
     * COMÉNTAME...
     * @return 
     */
    int daLongitud();

    /**
     * COMÉNTAME...
     * @param elemento 
     */
    void elimina(E elemento);

    /**
     * COMÉNTAME...
     * @param indice
     * @return 
     */
    E elimina(int indice) throws IndexOutOfBoundsException;

    /**
     * COMÉNTAME...
     * @param elemento 
     */
    void agregaInicio(E elemento);

    /**
     * COMÉNTAME...
     * @param elemento 
     */
    void agregaFinal(E elemento);
    
    /**
     * COMÉNTAME...
     * @param elemento
     * @param indice 
     */
    void agrega(E elemento, int indice);

    /**
     * COMÉNTAME...
     * @param elemento
     * @return 
     */
    boolean estaContenido(E elemento);

    /**
     * COMÉNTAME...
     * @param indice
     * @return 
     */
    E obtenElemento(int indice);

    /**
     * COMÉNTAME...
     * @param elemento
     * @return 
     */
    int obtenIndice(E elemento);

    /**
     * COMÉNTAME...
     */
    void limpia();
}
