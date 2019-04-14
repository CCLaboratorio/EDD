package practica05;

/**
 * COMÉNTAME...
 * @author Leonardo Gallo
 * @param <E>
 */
public class ArbolAVL<E extends Comparable<E>> implements ArbolBinario<E> {
    
    /*
        Has uso de encapsulamiento e incluye los 
        métodos get y set para cada variable
    */
    Nodo<E> raiz;
    //...otras variables u objetos
    
    /**
     * COMÉNTAME...
     */
    public ArbolAVL() {
       //implementación 
    }

    @Override
    public boolean esVacio() {
        //elimina esta excepción e implementa
        throw new UnsupportedOperationException("Aún no soportado");
    }

    @Override
    public int daAltura() {
        //elimina esta excepción e implementa
        throw new UnsupportedOperationException("Aún no soportado");
    }

    @Override
    public void inserta(E elemento) {
        //elimina esta excepción e implementa
        throw new UnsupportedOperationException("Aún no soportado");
    }

    @Override
    public void elimina(E elemento) {
        //elimina esta excepción e implementa
        throw new UnsupportedOperationException("Aún no soportado");
    }
    
    /**
     * COMÉNTAME...
     * @param pivote
     */
    private void rotaIzquierda(Nodo pivote) {
       //implementación 
    }
    
    /**
     * COMÉNTAME...
     * @param pivote
     */
    private void rotaDerecha(Nodo pivote) {
       //implementación 
    }
    
    /**
     * COMÉNTAME...
     * @param elemento
     * @return 
     */
    public Nodo busca(E elemento) {
        return null;
    }
    
    @Override
    public String toString() {
        //implementación
        return null;
    }
}