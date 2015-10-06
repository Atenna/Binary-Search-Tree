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
        strom.insert(null, 1);
        strom.insert(null, 5);
        strom.insert(null, 3);
        strom.insert(null, 7);
        strom.print();
    }
}
