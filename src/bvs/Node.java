package bvs;

/**
 *
 * @author Carmen
 */
public abstract class Node {
    
    private int id;
    protected Node leftChild;
    protected Node rightChild;
    protected Node parent;
    protected Color color;
    protected Side side;
    
    protected Node(int id, Node leftChild, Node rigthChild) {
        this.id = id;
        this.leftChild = leftChild;
        leftChild.setBlack();
        this.rightChild = rigthChild;
        rightChild.setBlack();
    }
    
    protected Node(int id) {
        this(id, null, null);
        this.id = id;
    }
    
    protected void setBlack() {
        this.color = Color.BLACK;
    }
    
    protected void setRed() {
        this.color = Color.RED;
    }
    
    protected void setLeftSide() {
        this.side = Side.LEFT;
    }
    
    protected void setRightSide() {
        this.side = Side.RIGHT;
    }
    
    protected void setParent(Node root) {
        this.parent = root;
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
