package Leetcode.sumOfLeftLeaves;

import java.util.Stack;


class Node
{
    int value;
    Node left;
    Node right;

    Node(int value)
    {
        this.value = value;
    }
}

public class BinarySearchTree 
{
    Node root;

    public void insertNode(int value)
    {
        Node node = new Node(value);

        if (root == null)
        {
            root = node;
        }
        else
        {
            Node currentNode = root;
            Node parent;
            while (true)
            {
                parent = currentNode;
                if (value < currentNode.value)
                {
                    currentNode = currentNode.left;
                    if (currentNode == null)
                    {
                        parent.left = node;
                        return;
                    }
                }
                else
                {
                    currentNode = currentNode.right;
                    if (currentNode == null)
                    {
                        parent.right = node;
                        return;
                    }
                }
            }
        }

        // Time Complexity if O(n)
        // Space Complexity is O(n)
    }

    public void printNodes()
    {
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;

        while (currentNode!=null || !stack.empty())
        {
            if (currentNode!=null)
            {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            else
            {
                currentNode = stack.pop();
                System.out.println(currentNode.value);
                currentNode = currentNode.right;
            }
        }

        // Time Complexity if O(n)
        // Space Complexity is O(n)
    }
    public int sumOfLeftLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        int temp = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            temp = root.left.value;
        }
        return temp + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}


