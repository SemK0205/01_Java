package edu.book.chapter8.inheritance;

public class VIPCustomer2 extends Customer {

	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율
	
	public void VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public int getAgentID() {
		return agentID;
	}
}
