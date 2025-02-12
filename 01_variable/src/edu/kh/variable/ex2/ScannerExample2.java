package edu.kh.variable.ex2;

import java.util.Scanner;

// ctrl + shift + o : 현재 파일에서 import 되지 않은 클래스 모두 import 해주는 단축키

public class ScannerExample2 {

	public static void main(String[] args) {
		
		// 사칙연산 계산기
		// -> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 2째 자리까지만 표현
		
		Scanner put = new Scanner(System.in);
		
		System.out.print("첫 번째 실수를 입력하시오 : ");
		double input1 = put.nextDouble();
		
		System.out.print("두 번째 실수를 입력하시오 : ");
		double input2 = put.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n",input1,input2,input1+input2);
		System.out.printf("%.2f - %.2f = %.2f\n",input1,input2,input1-input2);
		System.out.printf("%.2f * %.2f = %.2f\n",input1,input2,input1*input2);
		System.out.printf("%.2f / %.2f = %.2f\n",input1,input2,input1/input2);
		
	}
}
