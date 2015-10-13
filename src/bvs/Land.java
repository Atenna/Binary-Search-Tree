/*
    katastralne uzemie
 */
package bvs;

/**
 *
 * @author Carmen
 */
public class Land extends Node{
    
    private final int id_land;
    private String name;

    public Land(int id_land) {
        super(id_land);
        this.id_land = id_land;
    }
    
    public Land(int id_land, String name) {
        super(id_land);
        this.id_land = id_land;
        this.name = name;
    }

    @Override
    int getKey() {
        return id_land;
    }

    Land getGreater(Land a, Land b) {
        return a.getKey()>b.getKey()?a:b;
    }

    @Override
    boolean isGreaterThan(Node b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
