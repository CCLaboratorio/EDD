package practica03;

/**
 *
 * @author 
 * @param <T>
 */
public class Celda<T> {
    
    /* Has uso del encapsulamiento */
    protected T valor;
    protected Celda<T> siguiente;

    /**
     * Contructor por omisión
     */
    public Celda(){
    }
    
    /**
     * 
     * @param valor 
     */
    public Celda(T valor){
        this.valor = valor;
        this.siguiente = null;
    }
    /**
     * 
     * @param valor 
     * @param siguiente 
     */
    public Celda(T valor, Celda<T> siguiente){
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Celda<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Celda<T> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return valor.toString();
    }
    
}
