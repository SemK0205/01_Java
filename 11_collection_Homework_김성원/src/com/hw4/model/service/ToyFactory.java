package com.hw4.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.dto.Toy;

public class ToyFactory {
	
	/*
	 * 유의 사항
	 * 
	 * 1. 장난감은 똑같은 재료를 중복으로 저장할 수 없다. 
	 * 
	 * 2. 똑같은 장난감을 만들 수 없다. 
	 * 
	 * 3. 장난감을 저장할 컬렉션에 중복된 장난감이 있어서는 안된다. << set
	 * 
	 * 4. 재료는 {고유번호 : 재료명} 형식으로 작성되어 있어야 한다.
	 * 
	 * 5. 재료의 고유번호는 중복될 수 없다. << map
	 * 
	 * 6. 재료 등록 시 이미 등록된 고유번호의 재료가 있으면, 
	 *    덮어쓰겠냐는 질문을 하고 y/n 으로 답변을 받아 처리해야 한다.
	 *    
	 * 7. 재료 삭제 시 고유번호가 아닌, 재료명을 입력받아 같은 재료명이 있으면 삭제한다.
	 * 
	 */
	
	// 1. 전체 장난감 조회하기
	
	// 2. 새로운 장난감 만들기
	
	// 3. 장난감 삭제하기
	
	// 4. 장난감 제조일 순으로 조회하기
	
	// 5. 연령별 사용 가능한 장난감 리스트 조회하기
	
	// 6. 재료 추가 - 새로운 재료를 등록하고, 장난감에 해당 재료를 추가
	
	// 7. 재료 제거 - 등록된 재료를 삭제하고, 해당하는 재료를 사용하는 장난감에서 제거
	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toy = new HashSet<>();
	private Map<Integer, String> material = new HashMap<Integer, String>();
	
	public ToyFactory() {
		material.put(1,"면직물");
		material.put(2,"플라스틱");
		material.put(3,"유리");
		material.put(4,"고무");
		
		toy.add(new Toy("마미롱레그",8,36000,"분홍색","19950805", addMaterial(1, 4)));
		toy.add(new Toy("허기워기",5,12000,"파란색","19940312", addMaterial(1,2)));
		toy.add(new Toy("키시미시",5,15000,"분홍색","19940505", addMaterial(1,2)));
		toy.add(new Toy("캣냅",8,27000,"보라색","19960128", addMaterial(1,2)));
		toy.add(new Toy("파피",12,57000,"빨간색","19931225", addMaterial(1,2,4)));
		
	}
	
	public Set<String> addMaterial(int...num){
		Set<String> usedMaterial = new HashSet<String>();
		
		for (int index : num) {
	        usedMaterial.add(material.get(index));
	    }

		return usedMaterial;
		
	}
	
	
	public void displayMenu() {
		
		while(true) {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기\n");
			System.out.println("2. 새로운 장난감 만들기\n");
			System.out.println("3. 장난감 삭제하기\n");
			System.out.println("4. 장난감 제조일 순으로 조회하기\n");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기\n");
			System.out.println("6. 재료 추가\n");
			System.out.println("7. 재료 제거\n");
			System.out.print("선택 : ");
			int input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1 : selectToy(); break;
			case 2 : newToy();break;
			case 3 : removeToy(); break;
			case 4 : date(); break;
			case 5 : age(); break;
			case 6 : updateMaterial(); break;
			case 7 : removeMaterial(); break;
			}
			
		}
		
	}
	
	
	public void selectToy() {
		System.out.println("\n<전체 장난감 목록>\n");
		int num = 1;
		for(Toy t : toy) {
			System.out.println((num++)+". "+t);
		}
	}
	
	public void newToy() {
		System.out.println("\n<새로운 장난감 추가>\n");
		
		System.out.print("장난감 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		String year = sc.next();
		
		Set<Integer> set = new HashSet<Integer>();
		
		char ch = 'q';
		do {
			System.out.print("재료를 입력하세요(종료하려면'q'를 입력하세요) : ");
			String str = sc.next();
			ch = str.charAt(0);
			for(int i = 0; ;i++) {
				if(str.equals(material.get(i))) {
					set.add(i);
					break;
				}else if(i !=0 && ch == 'q') {
					break;
				}
			
			}
		} while (ch != 'q');
		
		Set<String> usedMaterial = new HashSet<String>();
		
		for (int index : set) {
	        usedMaterial.add(material.get(index));
	    }
		
		
		
		toy.add(new Toy(name, age, price, color, year, usedMaterial));
		System.out.println("\n새로운 장난감이 추가되었습니다.\n");
		
	}
	
	public void removeToy() {
		System.out.print("\n삭제할 장난감의 이름을 입력하세요 : ");
		String removeName = sc.next();
		boolean flag = true;
		List<Toy> list = new ArrayList<Toy>(toy);

		for(int i = 0; i < toy.size() ; i++) {
			if(list.get(i).getToyName().equals(removeName)) {
				toy.remove(list.get(i));
				System.out.println("장난감이 삭제되었습니다.\n");
				
				flag = false;
				
				break;
			}
		}
		if(flag) {
			System.out.println("해당하는 장난감은 없습니다.\n");
		}
		
	}
	
	public void date() {
		System.out.println("\n<제조일 순으로 장난감을 정렬>");
		List<Toy> list = new ArrayList<>(toy);

		Collections.sort(list, new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
				
				int i1 = Integer.parseInt(o1.getYear());
				int i2 = Integer.parseInt(o2.getYear());
				
				return i1-i2;
			}
		});
		
		for(Toy t : list) {
			System.out.println(t);
		}
		
	}
	/**
	 * 어떻게 하다보니 됐음....
	 * 
	 */
	public void age() {
		System.out.println("\n<연령별로 사용 가능한 장난감>");
		List<Toy> list = new ArrayList<Toy>(toy);
		Map<Integer,List<Toy>> map = new HashMap<>();
		
		for(Toy a : list) {
			if(map.containsKey(a.getAge())) {
				
			}else {
				map.put(a.getAge(), new ArrayList<>()); // 계속된 에러로 GPT의 도움을 받음..
			}											// 처음에는 new가 아닌 원래 있던 list를 사용 했음 
			map.get(a.getAge()).add(a);
			
		}
		for(Integer age : map.keySet()) {
			System.out.println("[연령 : "+age+"세]");
			List<Toy> toy = map.get(age);
			for(int i = 0; i < toy.size() ; i++) {
				System.out.println((i+1)+". "+toy.get(i));
				
			}
		}
		System.out.println();
		
		
	}
	
	public void updateMaterial() {
		System.out.println("\n<재료 추가>");
		System.out.println("---현재 등록된 재료---");
		Set<Integer> keySet = material.keySet();
		for(Integer key : keySet) {
			System.out.println(key+" : "+material.get(key));
		}
		System.out.print("추가 할 재료의 고유번호 입력 : ");
		int input = sc.nextInt();
		
		System.out.print("추가 할 재료의 이름 입력 : ");
		String str = sc.next();
		if(material.containsKey(input)) {
			System.out.println("이미 등록된 고유번호의 재료가 있습니다.");
			System.out.print("덮어 쓰시겠습니까? (y/n) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			if(ch == 'Y') {
				material.put(input, str);
				System.out.println("\n추가 완료");
				
			}
		}else {
			material.put(input, str);
			System.out.println("\n추가 완료");
		}
		
	}
	
	public void removeMaterial() {
		System.out.println("\n<재료 삭제>");
		System.out.println("---현재 등록된 재료---");
		Set<Integer> set = material.keySet();
		for(Integer key : set) {
			System.out.println(key+" : "+material.get(key));
		}
		System.out.print("삭제 할 재료의 재료명 입력 : ");
		String str = sc.next();
		boolean flag = true;
		for(Integer key : material.keySet()) {
			if(material.get(key).equals(str)) {
				material.remove(key);
				System.out.println("삭제 완료");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
		
		
		
	}

}
