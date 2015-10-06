/*

 */
package bvs;

/**
 *
 * @author Carmen
 */
public class BST {
    
    private Node root;
    
    public BST() {
    }
    
    public void insert(Node node, int newKey) {
        Node newLeaf = new Person(newKey);
        if(this.root == null) {
            this.root = newLeaf;
        } 
        else {
            Node newRoot    = node;
            Node rightChild = newRoot.getRightChilds();
            Node leftChild  = newRoot.getLeftChild();
                if(newLeaf.isGreaterThan(newRoot)) {
                    insert(rightChild, newKey);
                }
                else {
                    insert(leftChild, newKey);
                }
        }
    }
    
    public Node find(Node node, int key) {
        if(this.root==null) {
            return null;
        } 
        else {
            Node searchedNode = new Person(key);
            Node newRoot    = node;
            Node rightChild = newRoot.getRightChilds();
            Node leftChild  = newRoot.getLeftChild();
            if(searchedNode.isGreaterThan(newRoot)) {
                if(rightChild!=null) {
                    find(rightChild, key);
                } else {
                    return rightChild;
                }
            } 
            else {
                if(leftChild!=null) {
                    find(leftChild, key);
                } else {
                    return leftChild;
                }
            }
        }
    }
    
    public void inorder() {
        
    }
    
    public void preorder() {
        
    }
    
    public void postorder() {
        
    }
    
    public boolean delete(Node a) {
        return true;
    }
}
