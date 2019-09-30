
public class Cat extends Animal implements Speaker {
	public Cat(String animal, String noise) {
		super(animal, noise);
	}
	
	@Override
	public void speak() {
		System.out.println(animal + " " + noise);
	}
}
