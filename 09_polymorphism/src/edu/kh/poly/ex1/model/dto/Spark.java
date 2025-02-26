package edu.kh.poly.ex1.model.dto;

public class Spark extends Car{ // 경차
	
	// 속성
	private double discountOffer;	// 할인혜택
	
	// 기능
	
	public Spark() {}

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString()+" / "+discountOffer;
	}
	
	
}
