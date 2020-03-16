package fatcorymethod_designpattern;

public class AnimalsFactory {

	
	public Animal getAnimal(String str){
		String s=str;
		if(s.equals("dog")) {
			return new Dog();
		}else if(s.equals("cat")) {
			return new Cat();
		}else {
			return new Cow();
		}
	}
}
