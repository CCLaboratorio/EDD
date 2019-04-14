package practica05;

/**
 * COMÉNTAME...
 * 
 * @author Leonardo Gallo
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
    //incluye el nivel del nodo en caso de ser necesario
    
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
