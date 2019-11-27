package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(isPalindrome("odoo"));

        // homework 1
        ArrayQueue q1 = new ArrayQueue();
        ArrayQueue q2 = new ArrayQueue();

        q1.enqueue(1);
        q1.enqueue(null);
        q1.enqueue(3);

//        q2.enqueue(4);
//        q2.enqueue(5);
//        q2.enqueue(6);

//        splice(q1, q2);
//
//        System.out.println(q2.dequeue());
//        System.out.println(q2.dequeue());
//        System.out.println(q2.dequeue());

        q1.splice(q2);
        System.out.println(q1.toArray());






    }

    public static boolean isPalindrome(String s) {
        DequeInterface<Character> chars = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            chars.addToBack(Character.toLowerCase(s.charAt(i)));
        }

        while (!chars.isEmpty()) {
           char frontChar = chars.removeFront();

            if (chars.isEmpty()) {
                return true;
            }

            char backChar = chars.removeBack();

            if (frontChar != backChar) {
                return false;
            }
        }

        return true;
    }

//    public static void splice(QueueInterface firstQueue, QueueInterface secondQueue) {
//        QueueInterface newQ = new ArrayQueue();
//        while (!secondQueue.isEmpty()) {
//            newQ.enqueue(secondQueue.getFront());
//            firstQueue.enqueue(secondQueue.dequeue());
//        }
//
//        while (!newQ.isEmpty()) {
//            secondQueue.enqueue(newQ.dequeue());
//        }
//    }


}
