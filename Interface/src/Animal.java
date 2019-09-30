
public class Animal {
	
	public String animal;
	public String noise;
	
	public Animal(String animal, String noise) {
		this.animal = animal;
		this.noise = noise;
	}

	public void speak() {
		System.out.println(animal + " " + noise);
	}
}
