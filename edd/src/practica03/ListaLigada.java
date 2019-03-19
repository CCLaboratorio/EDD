package edd.practica03;

/**
 * COMÉNTAME...
 * @author 
 * @param <T>
 */
public class ListaLigada<T> implements Lista<T> {
   
    //incluye  las variables de clase
    private Celda<T> inicio;
    private Celda<T> ultimo;
    private int longitud;
    
    /**
     * 
     */
    public ListaLigada() {
        inicio = null;
        ultimo = null;
        longitud = 0;
    }
    
    @Override
    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int daLongitud() {
        return longitud;
    }

    @Override
    public void elimina(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T elimina(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregaInicio(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregaFinal(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agrega(T elemento, int indice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estaContenido(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T obtenElemento(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenIndice(T elemento) {
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

    public Celda getInicio() {
        return inicio;
    }
}
