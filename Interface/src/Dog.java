
public class Dog extends Animal implements Speaker {
	private int legs;

	public Dog(String animal, String noise, int legs) {
		super(animal, noise);
		this.legs = legs;
	}
	
	@Override
	public void speak() {
		System.out.println(animal + " " + noise + " and has " + legs);
	}
}
