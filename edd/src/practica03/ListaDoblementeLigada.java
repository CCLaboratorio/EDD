package practica03;

/**
 * COMÉNTAME...
 * @author 
 * @param <E>
 */
public class ListaDoblementeLigada<E> implements Lista<E> {
    
    //incluye  las variables de clase
    private CeldaDoble<E> inicio;
    private CeldaDoble<E> ultimo;
    private int longitud;
    
    /**
     * 
     */
    public ListaDoblementeLigada() {
        inicio = null;
        ultimo = null;
        longitud = 0;
    }
    //incluye los métodos de la interfaz Lista

    @Override
    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int daLongitud() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void elimina(E elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E elimina(int indice) throws IndexOutOfBoundsException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregaInicio(E elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregaFinal(E elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agrega(E elemento, int indice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estaContenido(E elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E obtenElemento(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenIndice(E elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * COMÉNTAME...
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
