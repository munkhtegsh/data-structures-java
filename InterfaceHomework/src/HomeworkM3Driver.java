import java.util.*;

public class HomeworkM3Driver {

	public static void main(String[] args) {
		
//		System.out.println("******TESTING QUESTION: TESTING IF BAG IS A SET");
//		BagInterface<String> wordBag = new ArrayBag<>();
//		System.out.println("Bag is set? true: " + isSet(wordBag));
//		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[]");
//		System.out.println(Arrays.toString(wordBag.toArray()));
//		
//
//		wordBag.add("hi");
//		System.out.println("Bag is set? true: " + isSet(wordBag));
//		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi]");
//		System.out.println(Arrays.toString(wordBag.toArray()));
//		wordBag.add("HI");
//		wordBag.add("hello");
//		System.out.println("Bag is set? true: " + isSet(wordBag));
//		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi, HI, hello]");
//		System.out.println(Arrays.toString(wordBag.toArray()));
//		wordBag.add("hi");
//		System.out.println("Bag is set? false: " + isSet(wordBag));
//		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi, HI, hello, hi]");
//		System.out.println(Arrays.toString(wordBag.toArray()));
//		wordBag.clear();
//		wordBag.add("a");
//		wordBag.add("c");
//		wordBag.add("b");
//		wordBag.add("d");
//		wordBag.add("a");
//		System.out.println("Bag is set? false: " + isSet(wordBag));
//		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[a, c, b, d, a]");
//		System.out.println(Arrays.toString(wordBag.toArray()));
//		
		System.out.println("\n******TESTING QUESTION: CREATING LIST OF WORDS THAT CONTAIN CHAR");
//		ListInterface<String> wordList = new AList<>();
//		ListInterface<String> shortWordList = createWordListContainChar(wordList,'a');
//		System.out.println("The contents of the list should be: \n[]");
//		System.out.println(Arrays.toString(shortWordList.toArray()));
//		wordList.add("apple");
//		wordList.add("anna");
//		wordList.add("bob"); 
//		wordList.add("ANIMAL");
//		wordList.add("canal");
//		wordList.add("frog");
//		wordList.add("cat");
//		shortWordList = createWordListContainChar(wordList,'a');
//		System.out.println("The contents of the list should be (in THIS ORDER): \n[apple, anna, canal, cat]");
//		System.out.println(Arrays.toString(shortWordList.toArray()));
//		System.out.println("The original list should still contain (in THIS ORDER): \n[apple, anna, bob, ANIMAL, canal, frog, cat]");
//		System.out.println(Arrays.toString(wordList.toArray()));

//		System.out.println("\n******TESTING QUESTION: FINDING LAST POSITION");
//		List<String> itemList = new ArrayList<>();
//		itemList.add("adam");
//		itemList.add("frank");
//		itemList.add("betty");
//		itemList.add("sue");
//		itemList.add("sam");
//		itemList.add("frank");
//		itemList.add("sue");
//		itemList.add("terry");
//		itemList.add("adam");
//		itemList.add("frank");
//		System.out.println("The index should be: \n9\n" + lastPosition(itemList, "frank"));
		
//		System.out.println("\n******TESTING QUESTION: LIST COMPARISON");
//		ListInterface<Integer> numListA = new AList<Integer>();
//		List<Integer> numListB = new ArrayList<Integer>();
//		numListB.add(1);
//		numListB.add(3);
//		numListB.add(1);
//		numListB.add(5);
//		numListB.add(7);
//		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numListA, numListB));		
//		numListA.add(1);
//		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numListA, numListB));	
//		numListA.add(3);
//		numListA.add(1);
//		numListA.add(5);
//		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numListA, numListB));
//		numListA.add(7);
//		System.out.println("Equivalent should be: \ntrue\n" + equivalentLists(numListA, numListB));
//		numListA.add(8);
//		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numListA, numListB));
//		numListB.add(8);
//		numListB.add(10);
//		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numListA, numListB));

		
//		System.out.println("\n******TESTING EXTRA CREDIT QUESTION: MOVE THE MINIMUM TO THE FRONT");
//		List<Integer> numberList = new ArrayList<Integer>();
		List<Integer> wordList = new ArrayList<Integer>();

		wordList.add(2);
		wordList.add(3);
		wordList.add(5);
		wordList.add(4);
		wordList.add(4);
		wordList.add(1);
		prioritizeMinimumValue(wordList);
		System.out.println(wordList);
		
		
		
		
//		prioritizeMinimumValue(numberList);
//		System.out.println("The list should contain: \n[]\n" + numberList);
//		numberList.add(4);
//		prioritizeMinimumValue(numberList);
//		System.out.println("The list should contain: \n[4]\n" + numberList);
//		numberList.add(3);
//		numberList.add(1);
//		numberList.add(5);
//		numberList.add(7);
//		prioritizeMinimumValue(numberList);
//		System.out.println("The list should contain: \n[1, 4, 3, 5, 7]\n" + numberList);
//		numberList.add(0);
//		prioritizeMinimumValue(numberList);
//		System.out.println("The list should contain: \n[0, 1, 4, 3, 5, 7]\n" + numberList);


	}

//	public static boolean isSet(BagInterface<String> wordBag) {
//		BagInterface <String> tempBag = new ArrayBag<>();
//		
//		if (wordBag.isEmpty()) {
//			return true;
//		}
//		
//		while (!wordBag.isEmpty()) {
//			String word = wordBag.remove();
//			if (!tempBag.contains(word)) {
//				tempBag.add(word);
//			} else {
//				while (!tempBag.isEmpty()) {
//					String tempWord = tempBag.remove();
//					wordBag.add(tempWord);
//				}
//				return false;
//			}
//		}
//		
//		while (!tempBag.isEmpty()) {
//			String tempWord = tempBag.remove();
//			wordBag.add(tempWord);
//		}
//
//		return true;
//	}
	
	
	
//	public static ListInterface<String> createWordListContainChar(ListInterface<String> wordList, char key) {
//		ListInterface <String> list = new AList<>();
//		
//		if (wordList.getLength() == 0) {
//			return list;
//		}
//		
//		for (int i = 1; i <= wordList.getLength(); i++) {
//			String word = wordList.getEntry(i);
//			for (int j = 0; j < word.length(); j++) {
//				if (word.charAt(j) == key) {
//					list.add(word);
//					break;
//				}
//			}
//		}
//		
//		return list;
//	}
	
//	public static int lastPosition(List<String> wordList, String targetWord) {
//		if (wordList.isEmpty()) {
//			return 0;
//		}
//		System.out.println(wordList.size());
//		 
//		for (int i = wordList.size() - 1; i > 1; i--) {
//			if (wordList.get(i).equals(targetWord)) {
//				return i;
//			}
//		}
//
//		return 0;
//	}
	
//	public static boolean equivalentLists(ListInterface<Integer> numberListInterface, List<Integer> numberList) {
//		if (numberListInterface.getLength() != numberList.size()) {
//			return false;
//		}
//		
//		for (int i = 0; i < numberList.size(); i++) {
//			if (numberList.get(i) != numberListInterface.getEntry(i + 1)) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	public static void prioritizeMinimumValue(List<Integer> numberList) {
		if (numberList.isEmpty()) {
			System.out.println("The provided list is empty.");
		}

		int minValue = numberList.get(0);
		int minIdx = 0;
		
		for (int i = 1; i < numberList.size(); i++) {
			if (numberList.get(i) < minValue) {
				minValue = numberList.get(i);
				minIdx = i;
			}
		}
		
		numberList.remove(minIdx);
		numberList.add(0, minValue);
	}
	
	
}
