package bvs;

/**
 *
 * @author Carmen
 */
public class Person extends Node{

    private final int key;
    
    public Person(int key) {
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

    @Override
    Node getGreater(Node a, Node b) {
        return a.getKey()>b.getKey()?a:b;
    }
}
