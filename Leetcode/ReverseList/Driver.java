package Leetcode.ReverseList;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class Driver {
    // Method for reversing the linked list


    public static void main(String[] args) {
        LinkedList head = new LinkedList();
        head.insertElement(1);
        head.insertElement(2);
        head.insertElement(3);
        head.insertElement(4);
        head.insertElement(5);
        head.print();
        head.reverse();
        head.print();
    }
}
