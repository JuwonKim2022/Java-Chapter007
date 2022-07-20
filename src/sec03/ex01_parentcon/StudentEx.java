package sec03.ex01_parentcon;

public class StudentEx {

	public static void main(String[] args) {
		
		Student student = new Student("홍길동","12345-67890",1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);

	}

}
