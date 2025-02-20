package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		Hero h1 = new Hero("이구역짱","전사", 200, 20, 1, 0); // 1
		Hero h2 = new Hero("Zi존위자드","마법사",100,100,1,0); // 2
		
		System.out.println("===========캐릭터 생성===========");
		System.out.println(h1.getJob()+" 직업으로'"+h1.getNickname()+"'님이 생성되었습니다.");
		System.out.println(h1);
		System.out.println("===========캐릭터 생성===========");
		System.out.println(h2.getJob()+" 직업으로'"+h2.getNickname()+"'님이 생성되었습니다.");
		System.out.println(h2);
		
		System.out.println("==========="+h1.getNickname() +" 시점===========");
		System.out.print("'"+h1.getNickname()+"'");
		h1.attack(100);
		System.out.print("'"+h1.getNickname()+"'");
		h1.attack(50.5);
		System.out.print("'"+h1.getNickname()+"'");
		h1.attack(49.5);
		System.out.print("'"+h1.getNickname()+"'");
		h1.dash();
		System.out.print("'"+h1.getNickname()+"'");
		h1.dash();
		System.out.print("'"+h1.getNickname()+"'");
		h1.dash();
		
		System.out.println("======='"+h1.getNickname()+"'님의 정보=======");
		System.out.println(h1);
		
		
		
		System.out.println("==========="+h2.getNickname() +" 시점===========");
		System.out.print("'"+h2.getNickname()+"'");
		h2.attack(300);
		System.out.print("'"+h2.getNickname()+"'");
		h2.dash();
		System.out.print("'"+h2.getNickname()+"'");
		h2.attack(300);
		System.out.print("'"+h2.getNickname()+"'");
		h2.attack(300);
		System.out.println("======='"+h2.getNickname()+"'님의 정보=======");
		System.out.println(h2);
	}
	

}
