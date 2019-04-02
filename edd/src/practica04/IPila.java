package practica04;

/**
 * COMÉNTAME...
 * @author 
 * @param <E> 
 */
public interface IPila<E> {
    
    /**
     * 
     * @return 
     */
    boolean esVacia();
    
    /**
     * 
     * @return 
     */
    int longitud();
    
    /**
     * 
     */
    void push();
    
    /**
     * 
     * @return 
     */
    E pop();
    
    /**
     * 
     * @return 
     */
    E top();
    
}
