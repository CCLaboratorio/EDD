package practica05;

import java.util.Collection;

/**
 * Biblioteca de objetos ordenables.
 * @author Leonardo Gallo
 * @param <E>
 */
public class Biblioteca<E extends Comparable<E>> {
    
    //Arbol con los objetos ordenados,
    private ArbolAVL<E> arbol;
    
    /**
     * COMÉNTAME...
     * @param <U>
     * @param coleccion
     */
    public <U extends Collection<E>> void llenaAcervo(U coleccion) {
        //implementación
    }
    
    /**
     * COMÉNTAME...
     * @param elemento 
     */
    public void agrega(E elemento) {
        //implementación
    }
    
    /**
     * COMÉNTAME...
     * @param elemento
     */
    public void elimina(E elemento) {
        //implementación
    }
    
    /**
     * COMÉNTAME...
     * @return 
     */
    public String muestraAcervo() {
        //implementación
        return null;
    }
}