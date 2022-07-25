package sec08.ex02_abstractmethod;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍");
	}
}
