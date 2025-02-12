package edu.book.javadoit;

public class Ch4Q1 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		//if-else문 활용
		if(operator == '+') {
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		}
		else if(operator == '-') {
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
		}
		else if(operator == '*') {
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);						
		}
		else {
			System.out.printf("%d / %d = %d", num1, num2, num1/num2);						
		}
		System.out.println();
		//switch - case문 활용
		switch(operator) {
		case '+' :
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
				break;
		case '-' :
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
				break;
		case '*' :
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);	
				break;
		default :	
			System.out.printf("%d / %d = %d", num1, num2, num1/num2);						
			
		
		}
		
	}
	

}
