package bvs;

/**
 *
 * @author Carmen
 */
public class Person extends Node{

    private final int key;
    private final String name;
    private final String surname;
    private final String id_number;
    
    public Person(int key, String name, String surname, String id_number) {
        this.key = key;
        this.name = name;
        this.surname = surname;
        this.id_number = id_number;
    }
    
    @Override
    public String toString() {
        return "Key "+key;
    }

    @Override
    int getKey() {
        return key;
    }

    @Override
    Node getGreater(Node a, Node b) {
        return a.getKey()>b.getKey()?a:b;
    }

    @Override
    boolean isGreaterThan(Node b) {
        return key>b.getKey();
    }
}
