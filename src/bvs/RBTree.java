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

        if (node != null && node != root && parent.color == Color.RED) {
            // uncle is red
            if (uncle.color == Color.RED) {
                parent.setBlack();
                uncle.setBlack();
                grand.setRed();         // co ak grand je null?
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

}
