package com.company;

public class NodeRecursion2 {
    public static void main(String[] args) {
        Node<Integer> chain =
                new Node<Integer>(
//                        Integer.valueOf(4),
//                        new Node<Integer>(Integer.valueOf(6),
//                                new Node<Integer>(
                                        Integer.valueOf(5),
                                        new Node<Integer>(Integer.valueOf(3),
                                                new Node<Integer>(Integer.valueOf(2))));
        recMethod(chain);

    }

    public static void recMethod(Node firstNode) {
        System.out.println(firstNode.toString());
        if(firstNode.next!= null) {

            firstNode.data = (Integer) firstNode.data * 2;

            recMethod(firstNode.next.next);

        } else {
            System.out.println("Done");
        }
//		print the chain of nodes headed by firstNode
        System.out.println(firstNode.toString());
    }
}
