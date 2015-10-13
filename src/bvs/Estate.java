/*
    nehnutelnost
 */
package bvs;

/**
 *
 * @author Carmen
 */
public class Estate extends Node{

    private final int id_estate;
    private String address;
    
    public Estate(int id_estate) {
        super(id_estate);
        this.id_estate = id_estate;
    }
    
    @Override
    int getKey() {
        return id_estate;
    }

    @Override
    boolean isGreaterThan(Node b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
