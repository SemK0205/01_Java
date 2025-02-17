package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc = new Scanner(System.in);
/*
 * 배열(Array)
 * 
 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
 * - 묶여진 변수들은 하나의 배열명으로 불러지고
 * 	구분은 index를 이용함 (index는 0부터 시작하는 정수)
 * 
 */
	public void ex1() {
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num 이라는 이름을 부여.
		
		// 변수 대입
		num=10;
		// 생성된 num이라는 변수공간에 10 이라는 정수값 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값 : "+num);
		
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//----------------------------
		
		// 배열 선언
		int[] arr;
		// int arr[];
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다**
		
		// 배열 할당
		arr = new int[3];
		// new : "new 연산자"라고 하며
		//		Heap 메모리 영역에 새로운 공간을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int 형 변수 3칸짜리 int[] 를 생성(할당)
		
		// arr = new int[3];
		// int[]     int[]  -> 같은 자료형 == 연산가능
		// ? double로 선언 후 int 할당?
		
		System.out.println("arr : "+arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// -> heap 영역에 생성된 공간은 절대 비어있을 수 없다
		// -> JVM 기본값이 들어가져 있다.
		// boolean : false
		// 나머지 : 0
		// 참조형 : null
		
		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		
		// 배열 사용
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// [10, 50, 100] 실제로 arr 배열이 가진 모든 요소의 값을 알고싶을 때
		// Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.toString(arr); // 아무것도 반환되지 않는다
		// 반드시 프린트구문과 같이
		// Arrays.toString(arr) 이 "[10, 50, 100]"으로 완전 치환되는 것과 같다.
		
		
		
	}
	
	public void ex2() {
		
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		// arr[0~3] 전부 JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		//arr[4] = 5000; <- 배열의 인덱스 범위를 벗어남
		
		// 코드에서 빨간줄 에러 : 컴파일 에러
		// 실행했을 때 발생하는 에러 : 런타임 에러
		
		// 배열과 for문
		
		System.out.println("배열의 길이 : "+arr.length);
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i;
			System.out.printf("arr[%d]에 저장된 값 : %d\n",i,arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		// 선언과 동시에 초기화
		int[] arr2 = {1, 2, 3, 4, 5};
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2 라는 이름 부여
		// Heap 메모리 영역에 int 5칸짜리 int[] 을 생성하고
		// 0번 인덱스부터 각 요소에 1~5까지 초기화함(대입)
		// int[] 주소값을 arr2 참조변수가 참조함.
		
		System.out.println(Arrays.toString(arr2));
	
	}
	
	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 163.7
		// ..
		// 5번 키 입력 : 167.2
		// 평균 : 177.02cm
		double sum = 0;
		double avg = 0; 
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		
		for(int i = 0 ; i<5 ; i++) {
			System.out.printf("%d번 키 입력 : ",i+1);
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		avg = sum/5;
		System.out.println("평균 : "+avg);
		
	}
	
	public void ex4() {
		// 입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 100;
		int sum = 0;
		
		System.out.print("입력 받을 인원 수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length ; i++) {
			
			System.out.printf("%d번 점수 입력 : ",i+1);
			int score = sc.nextInt();
			arr[i] = score;
			sum += score;
			if(max<=score) {
				max = score;
			}
			if(min>=score) {
				min = score;
			}
		}
		/* 입력 받는 숫자가 100을 초과하는 경우의 min값
		min = arr[0];
		for(int j = 0; j < arr.length ; j++) {
			if(min>=arr[j]) {
				min = arr[j];
			}
		}
		*/
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f\n",(double)sum/num);
		System.out.println("최고점 : "+max);
		System.out.println("최저점 : "+min);
		
	}

	public void ex5() {
		// 점심 메뉴 뽑기 프로그램
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면"};
		System.out.println("오늘 점심 메뉴 : "+ arr[(int)(Math.random() * 6)]);
		
	}
	
	public void ex6() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		// ex)
		// 정수 입력 : 200
		// 1번째 인덱스에 존재
		
		// 정수 입력 : 5
		// 존재하지 않음
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		boolean flag = false; // 검사전에는 없다고 가정
		
		
		for(int i = 0; i < arr.length ; i++) {
			if(input == arr[i]) {
				System.out.printf("%d번째 인덱스에 존재",i);
				flag = true;
			}
			
		}
		if(flag!=true) {
			System.out.println("존재하지 않음");
		}
		
	}

	public void ex7() {
		// 입력받은 값과 일치하는 값이 있으면 인덱스번호 출력
		// 없으면 "존재하지 않음" 출력
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		boolean flag = false;
		System.out.print("과일 입력 : ");
		String str = sc.next();
		
		for(int i = 0; i< arr.length ; i++) {
			if(str.equals(arr[i])) {
				System.out.printf("%d번 인덱스에 존재",i);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}
	
	public void ex8() {
		
		// String 참조형
		
		String str = "가나다"; // 메모리가 String Constant pool에 저장
		String str2 = new String("가나다"); // 메모리가 Heap에 새 객체로서 저장 
		
		System.out.println(str); // 주소값?
		System.out.println(str2); 
		System.out.println(str.toString());
		
		// String 클래스의 toString() 메서드가 존재
		// toString() 메서드는 자기 자신을 그대로 반환.
		
		// System.out.println(str); 을 실행하면
		// System.out.println(str.toString()); 이 자동으로 호출됨
		// 대입해둔 문자열 값 자체가 반환됨..
		
		// 주소값(객체의 해시코드)을 확인하고 싶다면 아래처럼 사용..
		System.out.println(System.identityHashCode(str));
		
		String[] strArr = {"사과", "바나나", "딸기"};
		// 메모리 구조가 어떻게 생겼을까?
	}

	public void ex9() {
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇 개 존재하는지 확인
		// 단, 일치하는 문자가 없을경우 " 존재하지 않습니다 " 출력
		
		/*
		 * ex)
		 * 
		 * 문자열 입력 : hello
		 * [h, e, l, l, o]
		 * 검색할 문자 입력 : l
		 * 2개 있음 / 존재하지 않습니다
		 * 
		 */
		
		// 사용해야하는 기술, 기능
		// 1) 배열 검색
		// 2) 문자열의 길이 구하기 : String.length();
		//   ex) "hello".length() -> 5
		
		// 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		//   ex) "hello".charAt(1) -> 'e'
		
		// 4) count(숫자세기)
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		int count = 0;
		boolean flag = true;
		
		for(int i = 0 ; i < str.length() ; i++) {
			ch[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
		System.out.print("검색할 문자 입력 : ");
		char a = sc.next().charAt(0);
		// sc.next() -> String형
		// String.chatAt(0) -> String의 0번째 인덱스 문자 하나를 추출해서 char 형태로 반환
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(ch[i]==a) {
				count++;
				flag = false;
			}
		}
		if(flag) {
			System.out.println("존재하지 않습니다");
		}
		else {
			System.out.println(count+"개 있음");
		}
	}
}
