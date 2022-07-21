package sec07.ex02_promotion_access;

public class ChildEx {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		child.method3();
		
	}

}
