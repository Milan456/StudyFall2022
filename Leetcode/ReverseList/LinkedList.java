package Leetcode.ReverseList;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

    Node head;

    LinkedList() {
        this.head = null;
    }

    public void insertElement(int number) {
        Node node = new Node(number);

        if (this.head == null) {
            this.head = node;
        } else {
            Node currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    public void print() {
        Node currentNode = this.head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public Boolean search(int number)
    {
        Boolean found = false;

        Node currentNode = this.head;

        while (currentNode != null)
        {
            if (currentNode.data == number)
            {
                found = true;
                break;
            }
            currentNode = currentNode.next;
        }

        return found;
    }

    public void delete(int number)
    {
        Node currentNode = this.head;
        Node previousNode = this.head;

        if (this.head == null)
        {
            System.out.println("List is empty");
        }

        if (head.data == number)
        {
            this.head = this.head.next;
        }

        while (currentNode != null)
        {
            if (currentNode.data != number)
            {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            else
            {
                previousNode.next = currentNode.next;
                currentNode = null;
            }
        }

        
    }
    Node reverse() {
        Node previous = null;
        Node curr = this.head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        this.head = previous;
        return this.head;
    }
}
