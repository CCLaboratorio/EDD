package ejercicios;

/**
 *
 * @author lgallo
 */
public class Ejercicio01 {
    
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorialIterativo(5));
    }
    
}
