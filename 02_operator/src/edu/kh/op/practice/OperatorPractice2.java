package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
	public void practice4() {
		/*
		키보드로 나이를 입력받아 
		20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
		입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
		입력받은 값이 65세 이상이거나, 12세 이하면 
		"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("당신의 나이는 ? : ");
		int age = sc.nextInt();
		String str = age>=20? "저는 성인입니다" : "저는 미성년 입니다";
		System.out.println(str);
		String str1 = age>=13&&age<=19 ? "true":"false";
		System.out.printf("청소년 입니까? %s\n", str1 );
		String str2 = age>=65 || age<=12 ? "true" : "false";
		System.out.printf("노인이거나 어린이 입니까? %s\n",str2);
		
		
	}
	

}
