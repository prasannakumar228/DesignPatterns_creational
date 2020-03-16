package builder_DesignPattern;

public class PhoneBuilder {

	
	private String brandName;
	private double battery;
	private String os;
	private int screenSize;
	
	public PhoneBuilder setBrandName(String brandName) {
		this.brandName = brandName;
		return this;
	}
	public PhoneBuilder setBattery(double battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	
	public Phone getPhone() {
		return new Phone(brandName,battery,os,screenSize);
	}
	
	
}
