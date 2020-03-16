package builder_DesignPattern;

public class Shop {

	public static void main(String[] args) {


		Phone phone = new PhoneBuilder().setBrandName("prasanna").setBattery(333.3).getPhone();
		System.out.println(phone);
	}

}
