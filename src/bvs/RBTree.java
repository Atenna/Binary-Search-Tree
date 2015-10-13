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
public class RBTree extends BST{
    
    private Node root;
    
    @Override
    public void insert(int newKey) {
        Node newLeaf = new Person(newKey);
        if(this.root == null) {
            this.root = newLeaf;
            return;
        } 
        insertRec(root, newLeaf);
    }
    
    
}
