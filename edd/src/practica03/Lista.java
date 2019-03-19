package edd.practica03;

/**
 * COMÉNTAME...
 * @author
 * @param <T>
 */
public interface Lista<T> {

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
    void elimina(T elemento);

    /**
     * COMÉNTAME...
     * @param indice
     * @return 
     */
    T elimina(int indice);

    /**
     * COMÉNTAME...
     * @param elemento 
     */
    void agregaInicio(T elemento);

    /**
     * COMÉNTAME...
     * @param elemento 
     */
    void agregaFinal(T elemento);
    
    /**
     * COMÉNTAME...
     * @param elemento
     * @param indice 
     */
    void agrega(T elemento, int indice);

    /**
     * COMÉNTAME...
     * @param elemento
     * @return 
     */
    boolean estaContenido(T elemento);

    /**
     * COMÉNTAME...
     * @param indice
     * @return 
     */
    T obtenElemento(int indice);

    /**
     * COMÉNTAME...
     * @param elemento
     * @return 
     */
    int obtenIndice(T elemento);

    /**
     * COMÉNTAME...
     */
    void limpia();
}
