import java.util.*;

public class TestBagInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BagInterface<String> statesBag = new ArrayBag<String>();
		System.out.println(statesBag.isEmpty());
		statesBag.add("alaska");
		statesBag.add("california");
		statesBag.add("delaware");
		statesBag.add("california");
		statesBag.add("georgia");
		statesBag.add("georgia");
		statesBag.add("delaware");
		statesBag.add("delaware");
		statesBag.add("iowa");
		System.out.println("GEO " + getFrequencyOf(statesBag, "california"));

		System.out.println(statesBag.getCurrentSize());
	}
	

	public static int getFrequencyOf(BagInterface <String> bag, String newEntry) {
		BagInterface<String> tempBag = new ArrayBag<>();
		int frequency = 0;
		
		while (bag.contains(newEntry)) {
			tempBag.add(newEntry);
			bag.remove(newEntry);
			frequency++;
		}

		while (!tempBag.isEmpty()) {
			bag.add(newEntry);
			tempBag.remove(newEntry);
		}
		
		return frequency;
	}
	
}




