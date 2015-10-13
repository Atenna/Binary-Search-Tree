package bvs;

/**
 *
 * @author Carmen
 */
public abstract class Node {
    
    private int id;
    protected Node leftChild;
    protected Node rightChild;
    
    protected Node(int id, Node leftChild, Node rigthChild) {
        this.id = id;
        this.leftChild = leftChild;
        this.rightChild = rigthChild;
    }
    
    protected Node(int id) {
        this(id, null, null);
        this.id = id;
    }
    
    abstract int getKey();
    protected Node getGreater(Node a, Node b) {
        return a.getKey()>b.getKey()?a:b;   
    };
    
    abstract boolean isGreaterThan(Node b);
    
    public Node getLeftChild() {
        return leftChild;
    }
    
    public Node getRightChild() {
        return rightChild;
    }
    
    public void setLeftChild(Node leftNewChhild) {
        this.leftChild = leftNewChhild;
    }
    
    public void setRightChild(Node rightNewChild) {
        this.rightChild = rightNewChild;
    }
}
