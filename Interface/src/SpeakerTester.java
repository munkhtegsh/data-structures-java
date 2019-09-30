import java.util.*;

public class SpeakerTester {

	public static void main(String[] args) {
		Dog dog = new Dog("Dog", "woof", 4);
		Cat cat = new Cat("Cat", "miaow");

		Speaker[] speakers = new Speaker[2];
		speakers[0] = dog;
		speakers[1] = cat;

		System.out.println(speakers.length);

//		for (Speaker s : speakers) {
//			s.speak();
//		}
	}

}
