package practica02;

import java.io.BufferedReader;

/**
 * COMÉNTAME...
 * @author Leonardo Gallo
 * @param <T> debe ser un tipo de dato con suma y multiplicación definida
 */
public interface Matriz<T extends Operable> {
    
    /**
     * COMÉNTAME...
     * @return 
     */
    public int getRenglones();
    
    /**
     * COMÉNTAME... 
     * @return 
     */
    public int getColumnas();
    
    /**
     * COMÉNTAME... 
     * @return 
     */
    public boolean esCuadrada();
    
    /**
     * COMÉNTAME... 
     * @param m
     * @return 
     */
    public Matriz<T> sumaMatriz(Matriz<T> m);
    
    /**
     * COMÉNTAME... 
     * @param m
     * @return 
     */
    public Matriz<T> restaMatriz(Matriz<T> m);
    
    /**
     * COMÉNTAME... 
     * @param m
     * @return 
     */
    public Matriz<T> multiplicaMatriz(Matriz<T> m);
    
    /**
     * COMÉNTAME... 
     * @param escalar
     * @return 
     */
    public Matriz<T> multiplicaMatriz(T escalar);
    
    /**
     * COMÉNTAME... 
     * @return 
     * @throws practica02.ExcepcionMatriz 
     */
    public T calculaDeterminante() throws ExcepcionMatriz;
    
    /**
     * COMÉNTAME... 
     * @param renglon
     * @param columna
     * @return
     * @throws IndexOutOfBoundsException 
     */
    public T getElemento(int renglon, int columna) throws IndexOutOfBoundsException;
    
    /**
     * COMÉNTAME... 
     * @param renglon
     * @param columna
     * @return
     * @throws IndexOutOfBoundsException 
     */
    public void setElemento(int renglon, int columna)throws IndexOutOfBoundsException;
    
    /**
     * COMÉNTAME... 
     * @param in
     * @throws ExcepcionMatriz 
     */
    public void llenaMatriz(BufferedReader in) throws ExcepcionMatriz;
    
    /**
     * COMÉNTAME... 
     * @throws ExcepcionMatriz 
     */
    public void muestraMatriz() throws ExcepcionMatriz;
}
