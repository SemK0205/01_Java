package edu.book.chapter6.q5;

public class Person {
	
	String name;
	int money;
	
	Person(String name, int money){
		this.money = money;
		this.name = name;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
			if(message != null) {
				this.money -= money;
				System.out.println(name + " 님이"+money+"으로 "+message);
			}
		}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + " 님이"+money+"으로 "+message);
		}
	}
	}


