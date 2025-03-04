package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;


public class Service{
	
	private List<Book> book = new ArrayList();
	private List<Book> favoritesBook = new ArrayList();
	
	private Scanner sc = new Scanner(System.in);
	public Service() {
		book.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		book.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		book.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		book.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		book.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}
	public void displayMenu() {
		int input = 0;
		
		do {
			System.out.println("===도서 목록 프로그램===\n");
			System.out.println("1. 도서 등록\n");
			System.out.println("2. 도서 조회\n");
			System.out.println("3. 도서 수정\n");
			System.out.println("4. 도서 삭제\n");
			System.out.println("5. 즐겨찾기 추가\n");
			System.out.println("6. 즐겨찾기 삭제\n");
			System.out.println("7. 즐겨찾기 조회\n");
			System.out.println("8. 추천도서 뽑기\n");
			System.out.println("0. 프로그램 종료\n");
			System.out.print("메뉴를 입력하세요 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : newBook(); break;
			case 2 : selectBook();break;
			case 3 : updateBook(); break;
			case 4 : removeBook(); break;
			case 5 : newFavoritesBook(); break;
			case 6 : removeFavoritesBook(); break;
			case 7 : selectFavoritesBook(); break;
			case 8 : randomFavoritesBook(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : ;
			}
		} while (input != 0);
		
	}
	
	public void newBook() {
		System.out.println("\n======도서 등록======");
		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.print("도서 제목 : ");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		System.out.println();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		System.out.println();
		
		if(book.add(new Book(num, name, author, price, publisher))) {
			System.out.println("등록 완료");
		}
	}
	
	public void selectBook() {
		if(book.isEmpty()) {
			System.out.println("도서 목록이 비어있습니다. 도서를 등록해주세요.");
		}
		for(Book b : book) {
			System.out.println(b.getNum()+"번 도서 : "+b+"\n");
		}
	}

	public void updateBook() {
		System.out.println("\n======도서 수정======");
		System.out.println();
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		System.out.println();
		boolean flag = true;
		for(Book b : book) {
			if(b.getNum() == input) {
				flag =false;
				System.out.println("1. 도서명");
				System.out.println();
				System.out.println("2. 도서 저자");
				System.out.println();
				System.out.println("3. 도서 가격");
				System.out.println();
				System.out.println("4. 도서 출판사");
				System.out.println();
				System.out.println("0. 수정 종료");
				System.out.println();
				
				System.out.print("어떤 정보를 수정하시겠습니까?");
				int updateInput = sc.nextInt();
				
				switch(updateInput) {
				case 1: System.out.println("\n======도서명 수정======");
						System.out.println();
						System.out.print("수정할 도서명을 입력하세요 : ");
						String updateName =sc.nextLine();
						b.setName(updateName);
					break;
				case 2: System.out.println("\n======도서 저자 수정======");
						System.out.println();
						System.out.print("수정할 도서 저자를 입력하세요 : ");
						String updateAuthor = sc.nextLine();
						b.setAuthor(updateAuthor);
					break;
				case 3: System.out.println("\n======도서 가격 수정======");
						System.out.println();
						System.out.print("수정할 도서 가격을 입력하세요 : ");
						int updatePrice = sc.nextInt();
						sc.nextLine();
						b.setPrice(updatePrice);
					break;
				case 4: System.out.println("\n======도서 출판사 수정======");
						System.out.println();
						System.out.print("수정할 도서 출판사를 입력하세요 : ");
						String updatePublisher = sc.nextLine();
						b.setPublisher(updatePublisher);
					break;
				case 0: System.out.println("프로그램 종료"); 
					break;
				default : ;
				}
				System.out.println("\n수정완료");
			}
		}
		if(flag) {
			System.out.println("해당 도서번호는 존재하지 않습니다.");
			
		}
		
	}
	
	public void removeBook() {
		System.out.println("\n삭제할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		System.out.println();
		System.out.println();
		boolean flag = true;
		for(Book b : book) {
			if(b.getNum() == input) {
				System.out.print("정말 삭제 하시겠습니까?(Y/N) : ");
				char ch = sc.next().toUpperCase().charAt(0);
				System.out.println();
				if(ch =='Y') {
					book.remove(b);
					flag = false;
					System.out.println("삭제 완료");
					break;
				}
				
			}
		}
		if(flag) {
			System.out.println("해당 번호의 도서가 없습니다.");
		}
		
	}

	public void newFavoritesBook() {
		System.out.print("\n즐겨찾기에 추가 할 도서번호를 입력하세요 : ");
		int input = sc.nextInt();
		System.out.println();
		boolean flag = true;
		
		for(Book b : book) {
			if(b.getNum() == input) {
				favoritesBook.add(b);
				System.out.println("즐겨찾기 추가 성공");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("해당 번호의 도서가 없습니다.");
		}
		
	}
	
	public void removeFavoritesBook() {
		System.out.print("\n즐겨찾기에서 삭제할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		System.out.println();
		boolean flag = true;
		for(Book b : favoritesBook) {
			if(b.getNum() == input) {
				System.out.print("정말 삭제 하시겠습니까?(Y/N) : ");
				char ch = sc.next().toUpperCase().charAt(0);
				if(ch =='Y') {
					book.remove(b);
					flag = false;
					System.out.println("삭제 완료");
					break;
				}
				
			}
		}
		if(flag) {
			System.out.println("해당 번호의 도서가 없습니다.");
		}
		
	}
	
	public void selectFavoritesBook() {
		for(Book b : favoritesBook) {
			System.out.println(b.getNum()+"번 도서 : "+b+"\n");
		}
		
	}
	
	public void randomFavoritesBook() {
		int random = (int)(Math.random()*book.size());
		System.out.println(random);
		System.out.println("추천 도서는 "+book.get(random).getName()+" 입니다");
	}
}
