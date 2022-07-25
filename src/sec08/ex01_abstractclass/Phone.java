package sec08.ex01_abstractclass;

public abstract class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOFf() {
		System.out.println("폰 전원을 끕니다.");
	}

}
