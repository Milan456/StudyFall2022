package Week5.mergeSort;

import java.util.PriorityQueue;

class Node
{
    public int data;
    public Node next;

    public Node(int data)
    {
        this.data = data;
    }
}


public class LinkedList {

    Node head;

    LinkedList()
    {
        this.head = null;
    }

    public void insertElement(int number)
    {
        Node node = new Node(number);

        if (this.head == null)
        {
            this.head = node;
        }
        else
        {
            Node currentNode = this.head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }
    
    public void print()
    {
        Node currentNode = this.head;

        while (currentNode != null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public Node sortList() {
        if(head == null || head.next == null) {
            return head;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Node curr = head;
        while(curr != null) {
            pq.add(curr.data);
            curr = curr.next;
        }
        head = new Node(pq.remove());
        Node curr1 = head;
        while(!pq.isEmpty()) {
            curr1.next = new Node(pq.remove());
            curr1 = curr1.next;
        }
        return head;
    }
}
