package edu.book.chapter8.inheritance;

public class VIPCustomer {
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID; // VIP 고객 담당 상담원 아이디
	double saleRatio; // 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP"; // 고객 등급 VIP
		bonusRatio = 0.05; // 보너스 적립 5%
		saleRatio = 0.1; // 할인율 10%
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price *saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 "+customerGrade + "이며, 보너스 포인트는 "+bonusPoint+"입니다.";
		
	}

}
