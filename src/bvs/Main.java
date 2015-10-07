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
