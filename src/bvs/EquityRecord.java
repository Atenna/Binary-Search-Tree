/*
    list vlastnictva
 */
package bvs;

/**
 *
 * @author Carmen
 */
public class EquityRecord extends Node{
    
    private final int id_record;      // primary key of equity record 
    private int []id_land;        // foreign identification keys of lands
    
    public EquityRecord(int id_record) {
        super(id_record, null, null);
        this.id_record = id_record;
    }

    @Override
    int getKey() {
        return id_record;
    }

    EquityRecord getGreater(EquityRecord a, EquityRecord b) {
        return a.getKey()>b.getKey()?a:b;
    }

    @Override
    boolean isGreaterThan(Node b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
