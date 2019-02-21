package ejercicios;

/**
 * Clase para comparar una implementación iterativa
 * y recursiva como solución a un mismo problema.
 * @author lgallo
 */
public class Ejercicio01 {
    
    /**
     * Calcula el factorial haciendo iteraciones.
     * @param n valor a calcularle el factorial, entero largo.
     * @return factorial
     */
    public static long factorialIterativo(long n) {
        long factorial = 1;
        if (n < 0)
            return -1;
        
        for(int i = 1; i <= n; i++){
            factorial = i*factorial;
        }
        return factorial;
    }
    
    /**
     * Calcula el factorial usando recursión.
     * @param n valor a calcularle el factorial, entero largo.
     * @return factorial 
     */
    public static long factorialRecursivo(long n) {
        return  0L;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorialIterativo(5));
    }
    
}
