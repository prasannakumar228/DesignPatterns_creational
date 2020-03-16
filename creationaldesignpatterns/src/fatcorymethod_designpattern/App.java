package fatcorymethod_designpattern;

public class App {

	public static void main(String[] args) {
		AnimalsFactory animalsFactory = new AnimalsFactory();
		Animal animal = animalsFactory.getAnimal("cow");
		String sound = animal.getSound();
		System.out.println(sound);
	}
}
