package bvs;

/**
 *
 * @author Carmen
 */
public class Person extends Node{

    private final int key;
    private String name;
    private String surname;
    private String id_number;
    
    public Person(int key, String name, String surname, String id_number) {
        super(key);
        this.key = key;
        this.name = name;
        this.surname = surname;
        this.id_number = id_number;
    }
    
    public Person(int key) {
        super(key);
        this.key = key;
    }
    
    @Override
    public String toString() {
        return "Key "+key;
    }

    @Override
    int getKey() {
        return key;
    }

    Person getGreater(Person a, Person b) {
        return a.getKey()>b.getKey()?a:b;
    }

    @Override
    boolean isGreaterThan(Node b) {
        return key>b.getKey();
    }
}
