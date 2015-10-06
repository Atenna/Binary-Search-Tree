package bvs;

/**
 *
 * @author Carmen
 */
public abstract class Node {

    protected Node leftChild;
    protected Node rightChild;
    
    protected Node(Node leftChild, Node rigthChild) {
        this.leftChild = leftChild;
        this.rightChild = rigthChild;
    }
    
    protected Node() {
        this(null, null);
    }
    
    abstract int getKey();
    abstract Node getGreater(Node a, Node b);
    
    public Node getLeftChild() {
        return leftChild;
    }
    
    public Node getRightChilds() {
        return rightChild;
    }
    
    public void setLeftChild(Node leftNewChhild) {
        this.leftChild = leftNewChhild;
    }
    
    public void setRightChild(Node rightNewChild) {
        this.rightChild = rightNewChild;
    }
}
