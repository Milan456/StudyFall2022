package Leetcode.sumOfLeftLeaves;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(3);
        tree.insertNode(9);
        tree.insertNode(20);
        tree.insertNode(10);
        tree.insertNode(2);
        tree.insertNode(15);
        tree.insertNode(7);
        System.out.println(tree.sumOfLeftLeaves(tree.root));
    }
}
