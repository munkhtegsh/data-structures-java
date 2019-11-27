package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedQueue q = new LinkedQueue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.getSecond());

    }
}
