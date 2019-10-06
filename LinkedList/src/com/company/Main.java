package com.company;

public class Main {

    public static void main(String args[]) {
        NodePlayground a = new NodePlayground(9);
        NodePlayground b = new NodePlayground(8, a);
        NodePlayground c = new NodePlayground(6, b);
        NodePlayground d = new NodePlayground(4, c);
        NodePlayground currentNode = d;

        while (currentNode.next != null) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
        }

        method(d);
    }

    public static void method(NodePlayground firstNode) {
        NodePlayground secondNode = firstNode.next;
        NodePlayground currentNode = secondNode;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void iterate(NodePlayground n) {
        NodePlayground c = n;
        while (c != null) {
            System.out.println(c.data);
            c = c.next;
        }


    }
}
