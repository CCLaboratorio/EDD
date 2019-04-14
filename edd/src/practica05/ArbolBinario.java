package practica05;

/**
 * COMÉNTAME...
 * @author Leonardo Gallo
 * @param <E>
 */
public interface ArbolBinario<E> {
    
    /**
     * COMÉNTAME...
     * @return 
     */
    boolean esVacio();
    
    /**
     * COMÉNTAME...
     * @return 
     */
    int daAltura();
    
    /**
     * COMÉNTAME...
     * @param elemento
     */
    void inserta(E elemento);
    
    /**
     * COMÉNTAME...
     * @param elemento
     */
    void elimina(E elemento);
}
