package practica02;

import java.io.BufferedReader;

/**
 * COMÉNTAME...
 * @author lgallo
 * @param <T>
 */
public class MatrizArreglos<T extends Operable> implements Matriz<T> {

    /**
     * Matriz de objetos
     */
    private Object[][] matriz;

    /**
     * COMÉNTAME...
     * @param renglones
     * @param columnas
     */
    public MatrizArreglos(int renglones, int columnas) {
        matriz = new Object[renglones][columnas];
    }

    /**
     * COMÉNTAME...
     * @param matriz
     */
    public MatrizArreglos(T[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public int getRenglones() {
        return 0;
    }

    @Override
    public int getColumnas() {
        return 0;
    }

    @Override
    public boolean esCuadrada() {
        return false;
    }

    @Override
    public Matriz<T> sumaMatriz(Matriz<T> m) {
        Operable[][] newMatriz = new Operable[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                newMatriz[i][j] = m.getElemento(i, j).suma((Operable) matriz[i][j]);
            }
        }
        return new MatrizArreglos(newMatriz);
    }

    @Override
    public Matriz<T> restaMatriz(Matriz<T> m) {
        return null;
    }

    @Override
    public Matriz<T> multiplicaMatriz(Matriz<T> m) {
        return null;
    }

    @Override
    public Matriz<T> multiplicaMatriz(T escalar) {
        return null;
    }

    @Override
    public T calculaDeterminante() throws ExcepcionMatriz {
        if (!this.esCuadrada()) {
            throw new ExcepcionMatriz("La matriz debe ser cuadrada para calcular el determinante");
        }
        return null;
    }

    @Override
    public T getElemento(int renglon, int columna) throws IndexOutOfBoundsException {
        return (T) matriz[renglon][columna];
    }

    @Override
    public void setElemento(int renglon, int columna) throws IndexOutOfBoundsException {
    }

    @Override
    public void llenaMatriz(BufferedReader in) throws ExcepcionMatriz {
    }

    @Override
    public void muestraMatriz() throws ExcepcionMatriz {
    }

}
