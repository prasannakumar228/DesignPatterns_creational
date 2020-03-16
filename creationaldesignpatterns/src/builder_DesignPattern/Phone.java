package builder_DesignPattern;

public class Phone {

	private String brandName;

	private double battery;
	private String os;
	private int screenSize;
	
	public Phone(String brandName, double battery, String os, int screenSize) {
		super();
		this.brandName = brandName;
		this.battery = battery;
		this.os = os;
		this.screenSize = screenSize;
	}
	
	
	@Override
	public String toString() {
		return "Phone [brandName=" + brandName + ", battery=" + battery + ", os=" + os + ", screenSize=" + screenSize
				+ "]";
	}

	
	
}
