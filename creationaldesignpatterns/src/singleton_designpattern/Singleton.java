package singleton_designpattern;

public class Singleton {

	
	
	
	static Singleton st=new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		return st;
		
	}
	
	
	public void doSomthing() {
		System.out.println("FDgfrgrgr");
	}
}
