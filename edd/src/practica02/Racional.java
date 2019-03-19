package practica02;

/**
 * COMÉNTAME...
 * @author Leonardo Gallo
 */
public class Racional extends Operable{
        
    protected final double q;
    
    /**
     * COMÉNTAME...
     * @param q 
     */
    protected Racional(double q){
        this.q = q;
    }

    @Override
    public Operable suma(Operable op) {
        return new Racional(this.q + ((Racional)op).q);
    }

    @Override
    public Operable resta(Operable op) {
        return new Racional(this.q - ((Racional)op).q);
    }

    @Override
    public Operable multiplica(Operable op) {
        return new Racional(this.q * ((Racional)op).q);
    }

    @Override
    public Operable divide(Operable op) {
        return new Racional(this.q / ((Racional)op).q);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Racional )
            return this.q == ((Racional) o).q;
        return false;
    }

}
