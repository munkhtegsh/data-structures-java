package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Comparable [] arr = {15,24,25,11,10,26,19,32};

        quickSort(arr);
//        System.out.println(sortedness(array));
    }

    public static double sortedness(Comparable[] array) {
        if (array.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < array.length && i + 1 < array.length; i++) {
            if (array[i].compareTo(array[i + 1]) <= 0) {
                count++;
            }
        }

        return (((double) count) / (array.length - 1)) * 100;
    }

// ******************************* QUICK SORT

    public static final int MIN_SIZE = 5; // for quick sort

    public static void quickSort(Comparable[] array) {
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(Comparable[] array, int first, int last) {
        if (last - first + 1 < MIN_SIZE) {
            insertionSort(array, first, last+1);
        } else {
            // create the partition: Smaller | Pivot | Larger
            int pivotIndex = partition(array, first, last);

            // sort subarrays Smaller and Larger
            quickSort(array, first, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, last);
            System.out.println(pivotIndex + " " + first + " " + last);
        }
    }

    private static int partition(Comparable[] array, int first, int last) {
        int mid = (first + last) / 2;
        sortFirstMiddleLast(array, first, mid, last);

        swap(array, mid, last - 1);
        int pivotIndex = last - 1;

        Comparable pivot = array[pivotIndex];

        int indexFromLeft = first + 1;
        int indexFromRight = last - 2;
        boolean done = false;
        while (!done) {

            while (array[indexFromLeft].compareTo(pivot) < 0) {
                indexFromLeft++;
            }

            while (array[indexFromRight].compareTo(pivot) > 0) {
                indexFromRight--;
            }

            assert array[indexFromLeft].compareTo(pivot) >= 0
                    && array[indexFromRight].compareTo(pivot) <= 0;

            if (indexFromLeft < indexFromRight) {
                swap(array, indexFromLeft, indexFromRight);
                indexFromLeft++;
                indexFromRight--;

            } else {
                done = true;
            }
        }

        swap(array, pivotIndex, indexFromLeft);
        pivotIndex = indexFromLeft;

        return pivotIndex;
    }

    private static void sortFirstMiddleLast(Comparable[] array, int first, int mid, int last) {
        if (array[first].compareTo(array[mid]) > 0) {
            swap(array, first, mid);
        }
        if (array[mid].compareTo(array[last]) > 0) {
            swap(array, mid, last);
        }
        if (array[first].compareTo(array[mid]) > 0) {
            swap(array, first, mid);
        }
    }

    private static void swap(Comparable[] array, int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void insertionSort(Comparable[] array, int first, int last) {

        for (int unsortedIndex = first+1; unsortedIndex < last; unsortedIndex++) {
            Comparable unsortedElement = array[unsortedIndex];
            int lowestSortedIndex = 0;
            int highestSortedIndex = unsortedIndex-1;
            int index = highestSortedIndex;

            while( index >= lowestSortedIndex &&
                    unsortedElement.compareTo(array[index]) < 0 ) {
                array[index+1] = array[index]; // make room
                index--;
            }
            array[index+1] = unsortedElement;
        }
    }



}
