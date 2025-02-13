package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input>0&&input%2==0) {
			System.out.println("짝수입니다.");
		}
		else if(input>0&&input%2!=0) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}

	public void practice2() {
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		int sum = korean + math + english;
		double avg = (korean + math + english)/3;
		
		if(korean>=40&&math>=40&&english>=40&&avg>=60) {
				System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n",korean,math,english,sum,avg);
				System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		
	}
	
	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : System.out.printf("%d월은 31일까지 있습니다.",month);break;
		case 2 : System.out.printf("%d월은 28일까지 있습니다.",month);break;
		case 3 : System.out.printf("%d월은 31일까지 있습니다.",month);break;
		case 4 : System.out.printf("%d월은 30일까지 있습니다.",month);break;
		case 5 : System.out.printf("%d월은 31일까지 있습니다.",month);break;
		case 6 : System.out.printf("%d월은 30일까지 있습니다.",month);break;
		case 7 : System.out.printf("%d월은 31일까지 있습니다.",month);break;
		case 8 : System.out.printf("%d월은 31일까지 있습니다.",month);break;
		case 9 : System.out.printf("%d월은 30일까지 있습니다.",month);break;
		case 10 : System.out.printf("%d월은 31일까지 있습니다.",month);break;
		case 11 : System.out.printf("%d월은 30일까지 있습니다.",month);break;
		case 12 : System.out.printf("%d월은 31일까지 있습니다.",month);break;
		default : System.out.printf("%d월은 잘못 입력된 달입니다.",month);
		}
		
	}
	
	public void practice4() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight/(height*height);
		if(bmi<18.5) {
			System.out.println("저체중");
		}
		else if(bmi<23) {
			System.out.println("정상체중");
		}
		else if(bmi<25) {
			System.out.println("과체중");
		}
		else if(bmi<30) {
			System.out.println("비만");
		}
		else {
			System.out.println("고도 비만");
		}
	}
	
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		double testM = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double testE = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double homeW = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int ass = sc.nextInt();
	
		double sum = testM*0.2 + testE*0.3 + homeW*0.3 + ass;
		
		System.out.println("=================결과=================");
		
		if(ass<=14) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)",ass);
		}
		else {
			
			System.out.println("중간 고사 점수(20) : "+testM*0.2);
			System.out.println("기말 고사 점수(30) : "+testE*0.3);
			System.out.println("과제      점수(30) : "+homeW*0.3);
			System.out.println("출석      점수(20) : "+ass);
			System.out.println("총점 : "+sum);
			
			if(sum>=70) {
				System.out.println("PASS");
			}
			else {
				System.out.println("Fail [점수 미달]");
			}
		}
		
		
		
	}
}
