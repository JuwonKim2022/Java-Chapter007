package sec07.ex02_promotion_access;

public class Child extends Parent{
	
	@Override
	public void method2() {
		System.out.println("Child-Method2()");
	}
	public void method3() {
		System.out.println("Child-Method3()");
	}

}
