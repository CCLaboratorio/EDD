package edd.practica01;

/**
 * Clase que implementa 3 métodos distintos para resolver un mismo problema.
 * @author Leonardo
 */
public class SecuenciaDeEnteros {
    
    /**
     * Primer algoritmo para encontrar la subsecuencia de suma maxima.
     * @param a Es un arreglo que contiene la secuencia de enteros
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum1(int[ ] a ) {
        int maxSum = 0;
        int sumAct;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sumAct = 0;
                for (int k = i; k <= j; k++) {
                    sumAct += a[k];
                    //System.out.println("Suma parcial: " + sumAct);
                }
                if (sumAct > maxSum)
                    maxSum = sumAct;
            }
        }
	return maxSum;
    }
    
    /**
     * Segundo algoritmo para encontrar la subsecuencia de suma maxima.
     * @param a Es un arreglo que contiene la secuencia de enteros
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum2(int[ ] a) {
        int maxSum = 0;
        int sumAct;
            
        for (int i = 0; i < a.length; i++) {
            sumAct  = 0;
            for (int j = i; j < a.length; j++) {
                sumAct += a[ j ];
                //System.out.println("Suma parcial: " + sumAct);
                if (sumAct > maxSum)
                    maxSum = sumAct;
            }
        }
        return maxSum;
    }
    
    /**
     * Tercer algoritmo para encontrar la subsecuencia de suma maxima.
     * @param a Es un arreglo que contiene la secuencia de enteros
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum3(int[ ] a) {
        int maxSum = 0;
        int sumAct = 0;

        for (int j = 0; j < a.length; j++ ) {
            sumAct += a[j];
            if (sumAct > maxSum)
                maxSum = sumAct;
            else if (sumAct < 0)
                sumAct = 0;
        }
        return maxSum;
    }
}
