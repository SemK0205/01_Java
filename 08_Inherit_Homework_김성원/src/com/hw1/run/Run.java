package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		Student[] std = new Student[3];
		std[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167, 45, 4, "정보통신공학과");
		
		// 위의 학생 정보 모두 출력
		//for(int i = 0 ; i < std.length ; i++) {
			//System.out.println(std[i].information()); 
		//}
		
		// 향상된 for문
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는
		 * 구조를 제공
		 * 일반적은 for문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 작성할 수 있다
		 * 
		 * for(데이터타입 변수명 : 배열 또는 컬렉션){
		 * 		// 반복해서 실행할 코드
		 * }
		 */
		for(Student i :std) {
			System.out.println(i.information());
		}
		System.out.println("===================================================");
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		Employee[] emp = new Employee[10];
		
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			System.out.println("추가 할 사원 정보 입력");
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salay = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			emp[count] = new Employee(name, age, height, weight, salay, dept);
			// 한 명씩 추가 될 때마다 카운트함
			count++;
			
			if(emp.length == count) {
				break;
			}
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y' 이면 계속 객체 추가
			System.out.print("계속 추가 하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'n'||ch == 'N') {
				break;				
			}
			// 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
		}
		
		// 현재 기록된 사원들의 정보를 모두 출력
		for(int i = 0; i < emp.length ; i++) {
			if(emp[i] == null) {
				break;
			}
			System.out.println(emp[i].information());
			
		}
	}

}
