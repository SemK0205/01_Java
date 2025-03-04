package com.hw2.run;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
		// Zoo 객체 생성
		Zoo z = new Zoo();
		
		// Tiger 객체 생성하여 zoo에 추가
		Tiger t = new Tiger();
		z.addAnimal(new Tiger("호랑이"));
		
		// Monkey 객체 생성하여 zoo에 추가
		Monkey m = new Monkey();
		z.addAnimal(new Monkey("원숭이"));
		
		// 동물원 메뉴 출력하여 입력한 값 대로 코드 수행
		z.displayMenu();
		
		
	}

}
