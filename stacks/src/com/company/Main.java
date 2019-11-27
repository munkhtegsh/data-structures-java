package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome("mooomo"));

        ArrayStack<Integer> arr = new ArrayStack<>();
        System.out.println(arr.peekNext());
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            System.out.println("Empty string");
            return true;
        }

        s = s.toLowerCase();
        Stack stack = new Stack();
        int mid = s.length() / 2;
        for (int i = 0; i < mid; i++) {
            stack.push(s.charAt(i));
        }


        for (int j = mid; j < s.length(); j++) {
            if (s.length() % 2 == 0) {
                if (!stack.pop().equals(s.charAt(j))) {
                    return false;
                }
            } else {
                if (j++ < s.length() && !stack.pop().equals(s.charAt(j++))) {
                    return false;
                }
            }

        }

        return true;
    }
}
