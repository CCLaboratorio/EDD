package practica05;

/**
 * COMÉNTAME...
 * 
 * @author Leonardo
 * @param <T>
 */
public class Nodo<T> {
    
    /*  
        Has uso del encapsulamiento e incluye los
        métodos get y set para cada variable.
    */
    T valor;
    Nodo<T> izquierdo;
    Nodo<T> derecho;
    //Nodo<T> padre; //opcional
    //incluye nivel del nodo
    
    /**
     * COMÉNTAME...
     */
    public Nodo() {
        //implementación
    }
    
    @Override
    public String toString() {
        //implementación
        return null;
    }
}
