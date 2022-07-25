package sec08.ex01_abstractclass;

public class PhoneEx {

	public static void main(String[] args) {
		
//		Phone phone = new Phone();//추상 클래스라 생성안
		
		SmartPhone sp = new SmartPhone("홍길동");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOFf();

	}

}
