package edd.practica01;

/**
 * Clase Main para probar métodos sobre secuencias de enteros
 * @author Leonardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int a[ ] = { -2, 11, -4, 13, -5, -2, 2, -2, 10, 5, 2, 3, -4, 2, -5, 10, 11, -3, 4, 5, 2, -1, 4, 7, 2, 1, 3, -5, -2, 2, -1, 2, 3, 2,-5, 2, 10, 50, -20, -10, 1, 5, 6, 9, 11, 20, 12, 9, -3, -2, -2, 1, -2, -5, 2, 5, 8, -3, 15, 12, 1, 10, -30, -2, -5, 12, 10, -1, -4, 2, 10, -2, 12, -3, 10, 8, -6};
        //int a[] = {-2, 11, -4, 13, -5, -2};
        // La subsecuencia de suma maxima es: {11, -4, 13} = 20
        int a[] = {-1,3,-6};
        int maxSum;
        SecuenciaDeEnteros secuencia = new SecuenciaDeEnteros();
        
        maxSum = secuencia.getMaxSum1(a);        
        System.out.println( "La suma máxima para getMaxSum1 es: " + maxSum );
        
        maxSum = secuencia.getMaxSum2(a);
        System.out.println( "La suma máxima para getMaxSum2 es: " + maxSum );
        
        maxSum = secuencia.getMaxSum3(a);
        System.out.println( "La suma máxima para getMaxSum3 es: " + maxSum );
    }
    
}
