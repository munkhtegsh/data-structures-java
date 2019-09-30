import java.util.*;
public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie <String> movie1 = new Movie<>("Chrek", "2013");
		Movie <String> movie2 = new Movie<>("Apple", "2013");
		Movie <String> movie3 = new Movie<>("Banana", "2011");
		Movie <String> movie4 = new Movie<>("Tomato", "2012");
		Movie <String> movie5 = new Movie<>("Banana", "2016");
//		Comparable <Movie <String>> movie1 = new Movie<>("Shrek", 2003);
//		Comparable <Movie <String>> movie2 = new Movie<>("Apple", 2001);
		
		List<Movie<String>> list = new ArrayList<Movie<String>>();
		list.add(movie1);
		list.add(movie2);
		list.add(movie3);
		list.add(movie4);
		list.add(movie5);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(movie1.compareTo(movie2));

	}


}
