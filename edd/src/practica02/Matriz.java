/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

import java.io.BufferedReader;

/**
 *
 * @author lgallo
 * @param <T> debe ser un tipo de dato con suma y multiplicación definida
 */
public interface Matriz<T> {
    
    public int getRenglones();
    
    public int getColumnas();
    
    public boolean esCuadrada();
    
    public Matriz<T> sumaMatriz(Matriz<T> m);
    
    public Matriz<T> restaMatriz(Matriz<T> m);
    
    public Matriz<T> multiplicaMatriz(Matriz<T> m);
    
    public Matriz<T> multiplicaMatriz(T escalar);
    
    public T calculaDeterminante();
    
    public T getElemento(int renglon, int columna) throws IndexOutOfBoundsException;
    
    public T setElemento(int renglon, int columna)throws IndexOutOfBoundsException;
    
    public void llenaMatriz(BufferedReader in) throws ExcepcionMatrizVacia;
    
    public void muestraMatriz() throws ExcepcionMatrizVacia;
}
