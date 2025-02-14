package edu.book.chapter6.q5;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		this.money = money;
		if(money == Menu.starAmericano) {
			return "별 다방 아메리카노를 구입했습니다.";
		}
		else {
			return "금액이 잘못 되었습니다.";
		}
	}

}
