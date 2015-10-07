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
public class Main {
    public static void main(String[] args) {
        BST strom = new BST();
        strom.insert(1);
        strom.insert(5);
        strom.insert(3);
        strom.insert(7);
        strom.printInorder();
        strom.printPostorder();
        strom.printPreorder();
    }
}
