package com.hw4.model.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Toy {
	private String toyName; // 장난감 이름
	private int age; // 사용 연령
	private int price; // 가격
	private String color; // 색상
	private String year; // 제조년월일
	private Set<String> usedMatter = new HashSet<String>() ; // 사용재료
	
	public Toy() {}

	public Toy(String toyName, int age, int price, String color, String year, Set<String> usedMatter) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.year = year;
		this.usedMatter = usedMatter;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Set<String> getUsedMatter() {
		return usedMatter;
	}

	public void setUsedMatter(Set<String> usedMatter) {
		this.usedMatter = usedMatter;
	}

	@Override
	public String toString() {
		return "[이름 : " + toyName + " / 가격 : " + price +" / 색상 : "+color+ " / 사용가능연령 : " + age + " / 제조년월일 : "
				+ year + " / 재료 : " + usedMatter() + "]";
	}
	
	public String usedMatter() {
		List<String> list = new ArrayList<String>(usedMatter);
		String str = "";
		for(int i = 0 ; i<list.size() ; i++) {
			if(i == 0) {
				str += list.get(i);
			}else {
				str +=(", "+list.get(i));
			}
		}
		return str;
	}

	
	
}
