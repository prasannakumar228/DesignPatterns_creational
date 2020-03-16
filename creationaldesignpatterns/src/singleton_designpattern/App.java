package singleton_designpattern;

public class App {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		singleton.doSomthing();
	
	}

}
