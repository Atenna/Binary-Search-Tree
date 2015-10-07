/*

 */
package bvs;

import java.util.ArrayList;

/**
 *
 * @author Carmen
 */
public class BST {
    
    private Node root;
    private ArrayList<Node> inorderList;
    private ArrayList<Node> preorderList;
    private ArrayList<Node> postorderList;
    
    public BST() {
        inorderList = new ArrayList<>();
        preorderList = new ArrayList<>();
        postorderList = new ArrayList<>();
    }
    
    public void insert(Node node, int newKey) {
        Node newLeaf = new Person(newKey);
        if(this.root == null) {
            this.root = newLeaf;
            return;
        } 
        insertRec(root, newLeaf);
    }
    
        public void insertRec(Node newRoot, Node newLeaf) {
            if(newLeaf.isGreaterThan(newRoot)) {
                if(newRoot.getRightChild()!=null) {
                    Node rightChild = newRoot.getRightChild();
                    insertRec(rightChild, newLeaf);
                } else {
                    newRoot.setRightChild(newLeaf);
                    return;
                }
            }
            else {
                if(newRoot.getLeftChild()!=null) {
                    Node leftChild = newRoot.getLeftChild();
                    insertRec(leftChild, newLeaf);
                } else {
                    newRoot.setLeftChild(newLeaf);
                    return;
                }
            }
    }
    
    public Node find(Node node, int key) {
        if(this.root==null) {
            return null;
        } 
        if(node.getKey()==key) {
            return node;
        }
        else {
            Node searchedNode = new Person(key);
            Node newRoot    = node;
            Node rightChild = newRoot.getRightChild();
            Node leftChild  = newRoot.getLeftChild();
            if(searchedNode.isGreaterThan(newRoot)) {
                find(rightChild, key);
            } 
            else {
                find(leftChild, key);
            } 
        }
        return null;
    }
    
    public void inorder(Node current) {
        if(current == null) {
            return;
        }
        inorder(current.getLeftChild());
        //inorderList.add(current);
        System.out.println(current.getKey()+" ");
        inorder(current.getRightChild());
    }
    
    public void preorder(Node current) {
        if(current == null) {
            return;
        }
        System.out.println(current.getKey()+" ");
        preorder(current.getLeftChild());
        //preorderList.add(current);
        preorder(current.getRightChild());
    }
    
    public void postorder(Node current) {
        if(current == null) {
            return;
        }
        postorder(current.getLeftChild());
        //postorderList.add(current);
        postorder(current.getRightChild());
        System.out.println(current.getKey()+" ");
    }
    
    public void print() {
        System.out.println("INORDER");
        inorder(root);
        for(int i= 0; i < inorderList.size();i++) {
            System.out.print(inorderList.get(i).getKey());
        }
        System.out.println("PREORDER");
        preorder(root);
        for(int i= 0; i < preorderList.size();i++) {
            System.out.print(preorderList.get(i).getKey());
        }
        System.out.println("POSTORDER");
        postorder(root);
        for(int i= 0; i < postorderList.size();i++) {
            System.out.print(postorderList.get(i).getKey());
        }
    }
    
    public boolean delete(Node a) {
        return true;
    }
}
