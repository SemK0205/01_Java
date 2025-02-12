package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("가격을 입력 하세요 : ");
		int p = sc.nextInt();
		
		
		System.out.printf("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		boolean str = sc.nextBoolean();
		System.out.println();
		
		double sale = (str == true) ? p*0.9: p*0.95;
		
		System.out.printf("할인을 포함한 최종금액 : %.1f원\n", sale);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("출금할 금액 입력 : ");
		int i = sc.nextInt();
		int a = i/50000 == 0 ? 0 : i/50000;
		int a1 = i%50000;
		int b = a1 < 10000 ? 0 : a1/10000;
		int b1 = a1 % 10000;
		int c = b1 <5000 ? 0 : b1/5000;
		int c1 = b1 %5000;
		int d = c1 < 1000 ? 0 : c1/1000;
		System.out.printf("50000원 : %d\n",a);
		System.out.printf("10000원 : %d\n",b);
		System.out.printf("5000원 : %d\n",c);
		System.out.printf("1000원 : %d\n",d);
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫 번째 수 : ");
		int i = sc.nextInt();
		System.out.printf("두 번째 수 : ");
		int j = sc.nextInt();
		System.out.printf(i%j == 0?"배수입니다.":"배수가 아닙니다.");
	}

}
