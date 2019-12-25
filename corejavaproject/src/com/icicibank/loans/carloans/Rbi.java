package com.icicibank.loans.carloans;

public interface Rbi {
	public abstract void withdrawl();
	public abstract void deposit();
	public static void main(String[] args ) {
		Rbi r1=new Hdfc();
		r1.deposit();
		r1.withdrawl();
		
		Rbi r2=new Icici();
		r2.deposit();
		r2.withdrawl();
		
		
	}
	
	

}
