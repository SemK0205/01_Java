package edu.book.javadoit2;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person ps = new Person();
		ps.age = 40;
		ps.name = "James";
		ps.isMarried = true;
		ps.numberOfChildren = 3;
		
		System.out.println("나이 : "+ps.age);
		System.out.println("이름 : "+ps.name);
		System.out.println("결혼 여부 : "+ps.isMarried);
		System.out.println("자녀 수 : "+ps.numberOfChildren);
		
	}

}
