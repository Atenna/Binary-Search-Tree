/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bvs;

/**
 *
 * @author Carmen
 */
public class RBTree extends BST {

    private Node root;

    @Override
    public void insert(int newKey) {
        Node newLeaf = new Person(newKey);
        newLeaf.setRed();
        if (this.root == null) {
            this.root = newLeaf;
            newLeaf.setBlack();
            return;
        }
        insertRec(root, newLeaf);
    }

    @Override
    public void insertRec(Node newRoot, Node newLeaf) {
        if (newLeaf.isGreaterThan(newRoot)) {
            if (newRoot.getRightChild() != null) {
                Node rightChild = newRoot.getRightChild();
                insertRec(rightChild, newLeaf);
            } else {
                newRoot.setRightChild(newLeaf);
                newLeaf.setParent(newRoot);
                newLeaf.setRightSide();
            }
        } else {
            if (newRoot.getLeftChild() != null) {
                Node leftChild = newRoot.getLeftChild();
                insertRec(leftChild, newLeaf);
            } else {
                newRoot.setLeftChild(newLeaf);
                newLeaf.setParent(newRoot);
                newLeaf.setLeftSide();
            }
        }
        correct(newLeaf);
    }

    private void correct(Node newLeaf) {
        Node node = newLeaf;
        Node parent = newLeaf.parent;
        Node grand = parent.parent;
        Node uncle = parent.side == Side.LEFT ? parent.parent.rightChild : parent.parent.leftChild;

        if (node != null && node != root && parent.color == Color.RED && uncle!=null) {
            // uncle is red
            if (uncle.color == Color.RED) {
                parent.setBlack();
                uncle.setBlack();
                grand.setRed();         
                correct(grand);
            }
            // uncle is black, node is a right child
            if (uncle.color == Color.BLACK && node.side == Side.RIGHT) {
                rotateLeft(node);
            }
            // uncle is black, node is a left child
            if (uncle.color == Color.BLACK && node.side == Side.LEFT) {
                rotateRight(node);
            }
        }

    }

    private void rotateLeft(Node node) {
        Node a = node;
        Node b = a.parent;
        Node c = b.parent;
        Node x = a.leftChild;
        // parent set new node as L child instead of old b node
        c.setLeftChild(a);
        a.setParent(c);
        // b becomes a L child of a node and take a's L child for R child
        b.setParent(a);
        b.setRightChild(x);
        // a becomes a parent of b
        a.setLeftChild(b);
        // x becomes a R child of b
        x.setParent(b); 
        // b is red, parent of b and uncle of b are red
        correct(b);
    }

    private void rotateRight(Node node) {
        Node a = node;
        Node b = a.parent;
        Node c = b.parent;
        Node d = c.rightChild;
        Node y = b.rightChild;
        Node mainRoot = c.parent;
        
        if(c==root) {
            root = b;
            b.setRootSide();
            b.setParent(null);
            
            b.setRightChild(c);
            c.setParent(b);
            c.setRightSide();
        }
        
    }

}
