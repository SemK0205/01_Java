package edu.book.javadoit;

public class SwitchCasePractice {
	public static void main(String[] args) {
		
		int f1 = 5;
		
		switch(f1) {
		case 1 : 
			System.out.println(f1+"층 약국 입니다.");
				break;
		case 2 : 
			System.out.println(f1+"층 정형외과 입니다.");
				break;
		case 3 : 
			System.out.println(f1+"층 피부과 입니다.");
				break;
		case 4 : 
			System.out.println(f1+"층 치과 입니다.");
				break;
		case 5 : 
			System.out.println(f1+"층 헬스 클럽 입니다.");
				break;
		default :
			System.out.println(f1+"층은 없습니다.");
		
		}
		 
		
	}

}
