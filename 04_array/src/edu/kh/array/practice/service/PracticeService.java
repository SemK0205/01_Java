package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		int[] arr = new int[9];
		int sum=0;
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = i+1;
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : "+sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		int j = 0;
		for(int i = arr.length-1; i>=0 ; i--) {
			arr[j] = i+1;
			if(i%2!=0) {
				sum+=arr[j];
			}
			j++;
		}
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : "+sum);
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		int[] arr = new int[5];
		boolean flag = true;
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("입력 %d : ",i);
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int sch = sc.nextInt();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == sch) {
				System.out.printf("인덱스 : %d",i);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length() ; i++) {
			arr[i] = str.charAt(i);
		}
		System.out.print("문자 : ");
		char sch = sc.next().charAt(0);
		int count = 0;
		boolean flag = true;
		String find = "";
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == sch) {
				count++;
				flag = false;
				find += i+" ";
			}
		}
		if(flag) {
			System.out.println(sch+"는 존재하지 않습니다.");
		}
		else {
			System.out.println(str+"에 "+sch+"가 존재하는 위치(인덱스) : "+find);
			System.out.println(sch+" 개수 : "+count);
		}
	}

	public void practice6() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;
		for(int i = 0; i < arr.length ; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i = 0; i<arr.length ; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}

	public void practice7() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = str.charAt(i);
		}
		for(int i = 0 ; i < arr.length; i++) {
			if(i == 8) {
				System.out.print("******");
				break;
			}
			System.out.print(arr[i]);
		}
	}

	public void practice8() {
		boolean flag = true;
		int input = 0;
		while(flag) {
			System.out.print("정수 : ");
			input = sc.nextInt();
			if(input>2 && input % 2 != 0) {
				flag = false;
			}
			System.out.println("다시 입력하세요.");
		}
		int[] arr = new int[input];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+", ");
			if(i == input/2) {
				for(int j = input/2+1 ; j < arr.length ; j++) {
					i--;
					if(j == arr.length-1) {
						arr[j] = i+1;
						System.out.println(arr[j]);
						break;
					}
					arr[j] = i+1;
					System.out.print(arr[j]+", ");
				}
				break;
			}
		}
		
		
	}

	public void practice9() {
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		
		System.out.print("발생한 난수 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		
		System.out.print("발생한 난수 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		int min = max;
		for(int i = 0 ; i <arr.length ; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : "+max );
		System.out.println("최소값 : "+min );
	}

	public void practice11() {
		int[] arr = new int[10];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10+1);
			for(int x = 0 ; x < i ; x++) {
				if(arr[x] == arr[i]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public void practice12() {
		int[] lotto = new int[6];
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int x = 0 ; x <i ; x++) {
				if(lotto[x] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0 ; i < lotto.length ; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	public void practice13() {
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		int count = 0;
		int j = 0;
		
		
		
		
		for(int i = 0 ; i <str.length(); i++) {
			if(j == str.length()) {
				break;
			}
			arr[i] = str.charAt(j); // 인덱스 범위 초과
			j++;
			for(int x = 0; x < i ; x++) {
				if(arr[x] == arr[i]) {
					i--;
					count++;
					break;
				}
			}
		}		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < arr.length-count;i++) {
			if(i == arr.length-count-1) {
				System.out.println(arr[i]);
				break;
			}
			else{
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println("문자 개수 : "+(str.length()-count));
	}
	
	public void practice14(){
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		String space = sc.nextLine();
		String[] arr = new String[input];
		int newInput = 0;
		int num = 0;
		while(true) {
			for(int i = num; i < input ; i++) {
				System.out.printf("%d번째 문자열 : ",num+1);
				arr[i] = sc.nextLine();
				num++;
			}
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'y'||ch == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				newInput = sc.nextInt();
				String space2 = sc.nextLine();
				arr = Arrays.copyOf(arr, arr.length+newInput);
				input+=newInput;
			}
			else {
				System.out.println(Arrays.toString(arr));
				break;
			}
			
		}
	}
	
}