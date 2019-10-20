package com.company;

import com.company.AList;
import com.company.ListInterface;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Scanner;

public class ListInterfaceRecursionExample {

	public static void main(String[] args) {
		ListInterface<Integer> list = new AList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
//		System.out.println(list.contains(1));
//		System.out.println(list.contains(4));
//		System.out.println(list.contains(2));
//		System.out.println(list.contains(5));


		BagInterface<Integer> ll = new LinkedBag<>();
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(3);
		System.out.println(Arrays.toString(ll.toArray()));

		System.out.println(ll.getFrequencyOf(6));

		countPositives(ll);

		ll.getFirstNode();



	}

	public static boolean listContains(ListInterface list, Object item) {
		return listContainsHelper(list, item, 1, list.getLength());
	}

	private static boolean listContainsHelper(ListInterface list, Object item,
			int start, int end) {
		if (start <= end) { // recursive case
			Object currentItem = list.getEntry(start);
			if (currentItem.equals(item)) {
				return true;
			} else {
				return listContainsHelper(list, item, start + 1, end);
			}

		} else { // base case: start > end
			return false;
		}
	}

	public static int countPositives(BagInterface<Integer> bag) {
		int count = 0;
	    if (!bag.isEmpty()) {
	        if (bag.firstNode.data > 0) {
				int removedItem = bag.remove();
				count = 1 + countPositives(bag);
				bag.add(removedItem);
			}
		}

	    return count;
	}


}
