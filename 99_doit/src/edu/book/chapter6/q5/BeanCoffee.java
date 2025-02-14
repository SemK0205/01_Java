package edu.book.chapter6.q5;

public class BeanCoffee {
	
	int money;
	
	public String brewing(int money) {
		this.money = money;
		
		if(money == Menu.beanLatte) {
			return "콩 다방 라떼를 구입했습니다.";
		}
		else {
			return "금액이 잘못 되었습니다.";
		}
	}

}
