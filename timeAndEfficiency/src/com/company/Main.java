package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
        // I recommend changing these to smaller numbers to start with!
        // Then once you think you have a good solution, you can increase them for more robust testing.
        public static final int LIST_SIZE = 100;
        public static final int SINGLE_DUPLICATE_NUMBERS = 10; // minimum number of numbers on the list that will appear twice (have a "single duplicate"
        public static final int DOUBLE_DUPLICATE_NUMBERS = 5;  // minimum number of numbers on the list that will appear three times (have a "duplicate duplicate")

    public static void main(String[] args) {
        // set up an Integer list that is guaranteed to have some single and double duplicates
        List<Integer> numbers = new ArrayList<>();
        Random generator = new Random();
        int max = 5 * LIST_SIZE;
        int min = -1 * max;
        int randomRange = max - min + 1;

        // add the first round of numbers
        int originalNumbersToAdd = LIST_SIZE - SINGLE_DUPLICATE_NUMBERS - DOUBLE_DUPLICATE_NUMBERS;
        numbers.add(min); // adding the min and max number to help test for array out of bounds errors
        numbers.add(min);
        numbers.add(max);
        numbers.add(max);
        numbers.add(0);  // adding 0 as a special test casenumbers.add(0); originalNumbersToAdd-=6;
        for(int i=0; i<originalNumbersToAdd; i++) {
            numbers.add(generator.nextInt(randomRange) + min);
        }
        // add duplicate numbers
        Collections.sort(numbers);
        System.out.println("The original list:");
        System.out.println(numbers);
        Collections.shuffle(numbers);
        // the results should be the same for both methods
        System.out.println("\nThe duplicate lists from both methods- these should match!");
        List<Integer> duplicateList = findDuplicatesBad(numbers);
        Collections.sort(duplicateList);
        System.out.println(duplicateList);
        duplicateList = findDuplicatesLinear(numbers);
        Collections.sort(duplicateList);
        System.out.println(duplicateList);

    }

    public static List<Integer> findDuplicatesBad(List<Integer> numbers) {
        List<Integer> duplicateList = new ArrayList<Integer>(); // creates a new list 1 assignment
        for(int i=0; i<numbers.size(); i++) { // 1 assignment + (n + 1) condition + n(2)
            int numberEvaluating = numbers.get(i); // 2
            boolean duplicateFound = false; // 1 assignment

            for(int j=i+1; j<numbers.size() && !duplicateFound; j++) { // 1 assignment + (n) comparison and n condition + n(2)
                int numberChecking = numbers.get(j); // 2

                if(numberEvaluating==numberChecking && !duplicateList.contains(numberEvaluating)) { // 1 condition and n
                    duplicateFound = true; // 1

                    for(int k=j; k<numbers.size(); k++) { // 1 + n
                        if(numberChecking==Integer.valueOf(numbers.get(k))) {
                            duplicateList.add(numberChecking);
                        }
                    }
                }
            }
        }
        return duplicateList;
    }

    public static List<Integer> findDuplicatesLinear(List<Integer> numbers) {
        // YOUR CODE HERE
        int idx = 0;
        List<Integer> duplicateList = new ArrayList<Integer>();
        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(idx))) {
                duplicateList.add(numbers.get(i));
            } else {
                idx = i;
            }
        }

        return duplicateList;
    }
}
