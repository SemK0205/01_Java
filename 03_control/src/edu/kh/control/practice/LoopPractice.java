package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String result = "";
		for(int i = 1; i<=num ;i++ ) {
			result +=i+" ";
		}
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요");			
		}
		else {
			System.out.println(result);
		}
	}
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String result="";
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		for(; num > 0 ;num--) {
			result += num+" ";
			if(num == 1) {
				System.out.println(result);
			}
		}
	}
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		String result = "";
		int sum = 0;
		
		for(int i = 1; i<=input; i++) {
			if(i<input) {
				result+=i+" + ";
			}
			else {
				result+=i+" = ";
			}
			sum += i;
		}
		System.out.println(result+sum);
	}
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		String result = "";
		int max=0;
		int min=0;
		if(num1<1 || num2<1 ) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		if(num1>num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
			
		}
		for(;min>0&&min<=max;min++) {
			result +=min+" "; 
		}
		System.out.println(result);
		
	}
	public void practice5() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.printf("===== %d단 =====\n", dan);
		for(int i = 1; i<10 ; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
	public void practice6() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		if(dan>1 && dan<10) {
			for(; dan<10 ; dan++) {
				System.out.printf("===== %d단 =====\n", dan);			
				for(int j=1;j<10;j++ ) {
					System.out.printf("%d * %d = %d\n",dan,j,dan*j);
				}
			}
		}
		else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
	}
	public void practice7() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		//층과 별을 따로 생각
		// 별의 개수 j
		for(int i = 1 ; i <= input ;i++ ) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice8() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int k = input;
		
		for(int i = 1 ; i<= input; i++) {
			for(int j = 1 ; j <= k; j++) {
				System.out.print("*");
			}
			System.out.println();
			k--;
		}
	}
	public void practice9() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= input ;i++ ) {
			
			
			for(int k = input-i;k > 0 ;k--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	public void practice10() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int m = input;
		for(int i = 1 ; i <= input ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i == input) {
				for(int k = 1; k <= input ; k++) {
					for(int l = 1;l < m ;l++ ) {
						System.out.print("*");
					}
					System.out.println();
					m--;
				}
			
			}
	}
		
}
	public void practice11() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int space = input;
		for(int i = 1 ; i<=input; i++) {
			for(int j = 0 ; j <space ; j ++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < i*2-1 ; k++) {
				System.out.print("*");
			}
			space--;
			System.out.println();
		}
		
	}
	public void practice12() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= input ; i++) {
			if(i == 1 || i == input) {
				for(int j = 0 ; j < input ; j++ ) {
					System.out.print("*");
				}
			}
			else {
				for(int k = 1 ; k <= input ; k++) {
						if(k==1||k==input) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				
			}
			System.out.println();
		}
		
	}
	public void practice13() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int n = sc.nextInt();
		int count = 0;
		String result = "";
		
		for(int i = 1; i <= n ; i++) {
			if(i%2 == 0 || i%3 == 0) {
				result += i + " ";	
			}
			if(i%2 ==0 && i%3 ==0) {
				count++;
			}
		}
		System.out.println(result);
		System.out.println("count : "+count);
		
	}
}
