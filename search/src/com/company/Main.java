package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node <Comparable> node1 = new Node<>(1,
                new Node(2,
                        new Node(3,null)));
//                                new Node(4,
//                                        new Node(7, null)))));

//        System.out.println(sortedness(node1));

        int [] arr = {12,15	,19	,23	,25	,27	,36	,39	,47	,58	,62	,67};
        System.out.println(binarySearchRecursive(arr, 33));
        System.out.println(Arrays.toString(arr));
    }

    public static double sortedness(Node<Comparable> node) {
        int chain = 0;
        int countSorted = 0;
        Node<Comparable> current = node;
        while (current.next != null) {
            if (current.getData().compareTo(current.next.getData()) <= 0) {
                countSorted++;
            }

            chain++;
            current = current.next;
        }

        return ((double) countSorted / chain) * 100 ;
    }

    public static int binarySearchIterative(int[] numbers, int target) {
        boolean found = false;
        int first = 0;
        int last = numbers.length - 1;
        int targetLocation = -1;

        while (first <= last && !found) {
            int mid = (first + last) / 2;

            if (numbers[mid] == target) {
                targetLocation = mid;
                found = true;
            } else if (numbers[mid] < target) {
                first = mid + 1;
            } else { // numbers[mid] > target
                last = mid - 1;
            }
        }
        return targetLocation;
    }

    public static int binarySearchRecursive(int[] numbers, int target) {
        return binarySearchRecursiveHelper(numbers, target, 0, numbers.length - 1);
    }

    private static int binarySearchRecursiveHelper(int[] numbers, int target, int first, int last) {
        int mid = ((last - first) / 2) + first;
        System.out.println("MID " + mid);

        if (first > last) {
            return -1; // indices cross over
        } else if (target == numbers[mid]) {
            return mid; // we found it!
        } else if (target < numbers[mid]) {
            return binarySearchRecursiveHelper(numbers, target, first, mid - 1);
        } else { // target > numbers[mid]
            return binarySearchRecursiveHelper(numbers, target, mid + 1, last);
        }
    }

}
