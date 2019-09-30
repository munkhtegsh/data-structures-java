import java.util.ArrayList;

public class TrioTester {

	public static void main(String[] args) {

		Trio<Integer> numberTrio = new Trio<Integer>(3, 4, 5);
		
		System.out.println(calc("32", 1));
		
	}
	
	public static int calc(String str, int num2) {
		return Integer.parseInt(str) + num2;
	}
	
	public static int calc(int num) {
		return num += 1;
	}

}
