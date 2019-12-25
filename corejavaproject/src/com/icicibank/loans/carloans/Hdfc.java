package com.icicibank.loans.carloans;

public class Hdfc implements Rbi{

	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawl();
		
	}

	@Override
	public void withdrawl() {
		System.out.println("I am overridden withdrawl method of Hdfc");
		
		
	}

	@Override
	public void deposit() {
		System.out.println("I am overridden deposit method of hdfc");
		
	}

}
