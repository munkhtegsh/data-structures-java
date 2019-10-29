package com.company;

import com.company.Student;

import java.util.Arrays;
import java.util.Random;

public class SortTester {

	
	public static void main(String[] args) {

		Random generator = new Random();
		Integer[] numbers = new Integer[1000];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = generator.nextInt(100);
		}
//		System.out.println(Arrays.toString(numbers));
		SlowerSorts.selectionSort(numbers);
		//SlowerSorts.insertionSort(numbers);
		//SlowerSorts.shellSort(numbers);
		//FasterSorts.mergeSort(numbers);
		//FasterSorts.quickSort(numbers);
//		System.out.println(Arrays.toString(numbers));
		
		Student s1 = new Student("Jane Jones", "C123");
		Student s2 = new Student("Sam Smith", "A654");
		Student s3 = new Student("Al Adams", "Q777");
		Student s4 = new Student("Ray Rogers", "B519");
		Student[] students = {s1, s2, s3, s4};
//		System.out.println(Arrays.toString(students));
//		SlowerSorts.selectionSort(students);
		//SlowerSorts.insertionSort(students);
		//SlowerSorts.shellSort(students);
		//FasterSorts.mergeSort(students);
		//FasterSorts.quickSort(students);
//		System.out.println(Arrays.toString(students));

		// --------------------------------

		Comparable [] arr = {15,24,25,11,10,26,19,32};

//		System.out.println(Arrays.toString(arr));
	}


// ******************************* SHELL SORT

	public static void shellSort(Comparable[] array)  {
		int space = array.length/2;
		while(space > 0) {
			if (space % 2 == 0) { // if space is even, add 1- efficiency improvement
				space++;
			}
			for (int begin = 0; begin < space; begin++) {
				incrementalInsertionSort(array, begin, array.length-1, space);
				System.out.println("BEFRE" + Arrays.toString(array));
			}

			space = space/2;
		}
	}

	// compare this to insertionSort- it's the same algorithm when space==1!
	private static void incrementalInsertionSort(Comparable[] array, int first, int last, int space) {

		for (int unsortedIndex = first+space; unsortedIndex <= last; unsortedIndex = unsortedIndex+space) {

			Comparable nextToInsert = array[unsortedIndex];
			int index = unsortedIndex-space;

			while ((index >= first) && (nextToInsert.compareTo(array[index]) < 0)) {
				array[index + space] = array[index];
				index = index - space;
			}


			array[index + space] = nextToInsert;
		}
	}

	// ******************************* MERGE SORT

	public static void mergeSort(Comparable[] array) {
		Comparable[] tempArray = new Comparable[array.length];
		mergeSortHelper(array, tempArray, 0, array.length-1);
	}

	private static void mergeSortHelper(Comparable[] array, Comparable[] tempArray, int first, int last) {
		if (first < last) {
			int mid = (first+last) / 2;
			mergeSortHelper(array, tempArray, first, mid); // the divide/splitting steps
			mergeSortHelper(array, tempArray, mid+1, last);

			if (array[mid].compareTo(array[mid+1]) > 0) { // efficiency improvement- when this fails, there is no need to merge
				merge(array, tempArray, first, mid, last); // merging together of the solutions
				System.out.println("FIRST " + Arrays.toString(tempArray));
			}
		}
	}

	private static void merge(Comparable[] array, Comparable[] tempArray, int first, int mid, int last) {

		int beginHalf1 = first;
		int endHalf1 = mid;
		int beginHalf2 = mid+1;
		int endHalf2 = last;

		int index = beginHalf1;

		// there are more elements still in both lists
		while((beginHalf1 <= endHalf1) && (beginHalf2 <= endHalf2) ) {
			if (array[beginHalf1].compareTo(array[beginHalf2]) < 0) {
				tempArray[index] = array[beginHalf1];
				beginHalf1++;
			} else {
				tempArray[index] = array[beginHalf2];
				beginHalf2++;
			}
			index++;
		}


		// elements remaining in left half
		while (beginHalf1 <= endHalf1) {
			tempArray[index] = array[beginHalf1];
			beginHalf1++;
			index++;
		}

		// elements remaining in right half
		while(beginHalf2 <= endHalf2) {
			tempArray[index] = array[beginHalf2];
			beginHalf2++;
			index++;
		}

		// copy the result back into the original array
		for (index = first; index <= last; index++) {
			array[index] = tempArray[index];
		}

	}

	public static void selectionSort(Comparable[] array) {
		for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
			int minIndex = getIndexOfSmallest(array, currentIndex, array.length);
			System.out.println(Arrays.toString(array));
			swap(array, currentIndex, minIndex);
		}
	}

	private static int getIndexOfSmallest(Comparable[] array, int firstPosition, int lastPosition) {
		Comparable min = array[firstPosition];
		int indexOfMin = firstPosition;

		for (int index = firstPosition + 1; index < lastPosition; index++) {
			if (array[index].compareTo(min) < 0) { // asks: is the current value smaller than min? if so, it's the new min
				min = array[index];
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}

	private static void swap(Comparable[] array, int i, int j) {
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}


//
//	partition(array, int first, int last)
//
//	mid = index of middle entry
//	sortFirstMiddleLast(array, first, mid, last)
//	swap a[mid] and a[last-1]
//
//	pivotIndex = last-1 // Line A: Start Here!
//	pivotValue = array[pivotIndex]
//
//	indexFromLeft = first+1
//	indexFromRight = last-2
//
//	done = false
//
//			while(!done) { // Outer Loop Starts Here
//
//		while(array[indexFromLeft] < pivotValue) {
//			indexFromLeft++
//		}
//
//		while(array[indexFromRight] > pivotValue) {
//			indexFromRight--
//		}
//
//		if(indexFromLeft < indexFromRight) {
//			swap array[indexFromLeft] and array[indexFromRight] // Line B: In-Loop Swap
//			indexFromLeft++
//			indexFromRight--
//		} else {
//			done = true;
//		}
//	} // Outer Loop Stops Here
//
//	swap array[pivotIndex] and array[indexFromLeft] // Line C: Out-Of-Loop Swap
//
//	pivotIndex = indexFromLeft
//   return pivotIndex // Line D: Return Statement

}






