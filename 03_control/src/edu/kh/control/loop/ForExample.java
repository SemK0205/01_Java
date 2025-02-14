package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { // 기능 제공용 클래스

	Scanner sc = new Scanner(System.in);
	public void ex1() {
		
		// 1~10 까지 콘솔에 출력하기
		for(int i = 1 ; i<11 ; i++) {
			// 수행될 코드 (반복 수행될 코드)
			System.out.println(i);
		}
	}
	public void ex2() {
		// 영어 알파벳 A 부터 Z까지 한줄로 출력
		// ex)
		// ABCDEFG ....
		for(char i = 65; i<91;i++) {
			System.out.print(i);
		}
		System.out.println("\n=================================");
		for(int i = 'A'; i<='Z';i++) {
			System.out.print((char)i);
		}
		System.out.println("\n=================================");

		for(char i = 'A'; i <= 'Z';i++) {
			System.out.print(i);
		}
	}
	public void ex3() {
		// 1부터 입력받은수까지 1씩 증가하며 출력
		System.out.print("정수를 입력하시오. : ");
		int input = sc.nextInt();
		for(int i = 1; i<=input;i++) {
			System.out.print(i+" ");
		}
	}
	public void ex4() {
		// 정수 5개를 입력받아서 합계 구하기
		
		// [실행화면]
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150
		int sum=0;
		for(int i = 1; i<6;i++) {
			System.out.print("입력 : "+i);
			int input = sc.nextInt();
			sum += input;
		}
		System.out.println("합계 : "+sum);
	}
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		
		// [실행화면]
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) ....
		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<21 ; i++) {
			
			if(i%input == 0) {
				System.out.printf("(%d) ",i);
			}
			else {
				System.out.printf("%d ",i);
			}
			
		}
		
	}
	public void ex6() {
		// 해당 단을 출력
		// 단, 입력받은 수가 2~9 사이 숫자가 아니라면
		// "잘못 입력하셨습니다" 출력
		
		// [실행화면]
		// 단 입력 : 5
		// 5x1=5
		
		//====
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		if(dan>1 && dan<10) {
			for(int i = 1; i<10 ; i++) {
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void ex7() {
		// 숫자 세기 count
		
		// 1부터 20까지 1씩 증가하면서
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		int sum=0;
		for(int i = 1; i<21 ; i++) {
			if(i%input ==0) {
			System.out.printf("%d ",i);
			sum +=i;
			}
		}
		System.out.printf(": %d개\n",20/input);
		
		System.out.println(input+"의 배수 합계 : "+sum);
	}
	public void ex8() {
		
		System.out.print("배수 입력 : ");
		
		int input = sc.nextInt();
		
		int count =0;
		
		int sum=0;
		
		String result ="";
		for(int i = 1; i<21 ; i++) {
		
			if(i%input ==0) {
			
				count ++;
				result += i + " ";
				sum +=i;
			}
			
		}
		
		
		System.out.printf(result+": %d개\n",count);
		
		System.out.println(input+"의 배수 합계 : "+sum);
	
	}
	public void ex9() {
		
		// 구구단 모두 출력하기
		/*
		for(int i = 2 ; i<10 ; i++) {
			for(int j = 1; j<10 ; j++) {
				System.out.printf("%d x %d = %2d ",i,j,i*j);
			}
			System.out.println();
		}
		*/
		for(int i = 9 ; i>1 ; i--) {
			for(int j = 1; j<10 ; j++) {
				System.out.printf("%d x %d = %2d ",i,j,i*j);
			}
			System.out.println();
		}
		
	}
	public void ex10() {
		
	}
	public void ex11() {
		
	}
	public void ex12() {
		
	}

}
