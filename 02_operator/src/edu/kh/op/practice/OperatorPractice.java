package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		/*
		 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 인원 수와 사탕 개수를 키보드로 입력 받고
		 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 
		 남은 사탕의 개수를 출력하세요.
		*/
		//인원 수 29
		// 사탕 개수 100
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.printf("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		int i = input2 / input1;
		System.out.println();
		System.out.println("1인당 사탕 개수 : "+i);
		System.out.println("남는 사탕 개수 : "+(input2 - input1*i));
		
		
		
		
	}

	public void practice2() {
		//키보드로 입력 받은 값들을 변수에 기록하고 
		//저장된 변수 값을 화면에 출력하여 확인하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int cs = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int i = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String m = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double j = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",grade,cs,i,name,m,j);
		
	}
	
	public void practice3() {
		//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		//세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어 : ");
		int k = sc.nextInt();
		System.out.printf("영어 : ");
		int e = sc.nextInt();
		System.out.printf("수학 : ");
		int m = sc.nextInt();
		System.out.println();
		int sum = k+e+m;
		double av = sum/3;
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f", av);
		
		// 각 과목이 40점 이상, 평균 60점이상이어야 합격
		// 그 외 불합격 출력
		
		String str = k>=40&&e>=40?(m>=40&&sum>=60?"합격":"불합격") :"불합격" ;
		System.out.println();
		System.out.println(str);
		
		
	}

}
