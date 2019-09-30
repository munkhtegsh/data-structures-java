import java.util.*;

public class Trio<T> {
	private T item1, item2, item3;
		
	public Trio(T item1, T item2, T item3) {
		this.item1 = item1;
		this.item2 = item2; 
		this.item3 = item3;
	}
	
	public Trio(T item) {
		this(item, item, item);
	}

	public T getItem1() {
		return item1;
	}

	public void setItem1(T item1) {
		this.item1 = item1;
	}

	public T getItem2() {
		return item2;
	}

	public void setItem2(T item2) {
		this.item2 = item2;
	}

	public T getItem3() {
		return item3;
	}

	public void setItem3(T item3) {
		this.item3 = item3;
	}

	@Override
	public String toString() {
		return "Trio [item1=" + item1 + ", item2=" + item2 + ", item3=" + item3 + "]";
	}
	
	public void reset(T item) {
		// Why can not call constructor from my method? code is duplicating => this(item)
		this.item1 = this.item2 = this.item3 = item;
	}
	
	public int count(T newItem) {
		int count = 0;
		ArrayList<T> list = new ArrayList<T>();
		list.add(item1);
		list.add(item2);
		list.add(item3);
		
		for (T item : list) {
			if (item.equals(newItem)) {
				count++;
			}
		}
		
		return count;
	}
	
	public boolean hasDuplicates() {
		final Set<T> set = new HashSet<T>();
		ArrayList<T> trioList = new ArrayList<T>();
		trioList.add(item1);
		trioList.add(item2);
		trioList.add(item3);
		
		for (T item : trioList) {
			if (!set.contains(item)) {
				set.add(item);
			} else {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Trio<?>) {
			Trio<?> otherTrio = (Trio<?>) other;
			
			ArrayList<T> trioList = new ArrayList<T>();
			trioList.add(item1);
			trioList.add(item2);
			trioList.add(item3);
			
//			ArrayList<?> otherTrioList = new ArrayList<>(); // why is it gives me an error when I put ? in the diamond?
			ArrayList otherTrioList = new ArrayList(); 
			otherTrioList.add(otherTrio.getItem1());
			otherTrioList.add(otherTrio.getItem2());
			otherTrioList.add(otherTrio.getItem3());
			
			for (int i = 0; i < trioList.size(); i++) {
				for (int j = 0; j < otherTrioList.size(); j++) {
					if (trioList.get(i).equals(otherTrioList.get(j))) {
						otherTrioList.remove(j);
						break;
					}
				}
			}
			
			return otherTrioList.size() == 0;
			
		}
		
		return false;
	}
	
}
