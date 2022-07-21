package sec06.ex01_protect2;

import sec06.ex01_protect1.A;

public class D extends A {
	public D() {
		super();
		this.field = "value";
		this.method();
	}
	
	public void method() {
		
		this.field = "value";
		this.method();
	}

}
