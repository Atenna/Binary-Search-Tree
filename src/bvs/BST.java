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
    
    public void insert(Node newRoot, int newKey) {
        Node newLeaf = new Person(newKey);
        if(this.root == null) {
            root = newLeaf;
        } 
        else {
            Node root       = newRoot;
            Node rightChild = root.getRightChilds();
            Node leftChild  = root.getLeftChild();
                if(newLeaf.isGreaterThan(root)) {
                    insert(rightChild, newKey);
                }
                else {
                    insert(leftChild, newKey);
                }
        }
    }
    
    public Node find(int key) {
        return root;
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
