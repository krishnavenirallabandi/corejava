package com.icicibank.loans.carloans;

public class Icici implements Rbi{
	
		public static void main(String[] args) {
			Icici i=new Icici();
			i.withdrawl();
			i.deposit();
			

		}

		@Override
		public void withdrawl() {
			System.out.println("I am overridden method  withdrawl of Icici");
			
		}

		@Override
		public void deposit() {
			System.out.println("I am overridden method deposit of Icici");
			
		}

	}



