
public class Pair<T> {
	
	private T item1, item2;
	
	public Pair(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getItem1() {
		return item1;
	}
	public T getItem2() {
		return item2;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	
	@Override
	public String toString() {
		return item1.toString() + "\t" + item2.toString();
	}
	

	// Question 1:
	@Override
	public boolean equals(Object other) {
		if (other instanceof Pair<?>) {
			Pair<?> otherPair = (Pair<?>) other;
			boolean isEqualInOrder = item1.equals(otherPair.getItem1()) && item2.equals(otherPair.getItem2());
			boolean isEqualNotInOrder = item1.equals(otherPair.getItem2()) && item2.equals(otherPair.getItem1());
			return isEqualInOrder || isEqualNotInOrder;
		} else {
			return false;
		}
	}
	
	public boolean sameItems() {
		return item1.equals(item2);
		// return item1==item2; INCORRECT! tests for aliases, not logical equivalence
	}

}
