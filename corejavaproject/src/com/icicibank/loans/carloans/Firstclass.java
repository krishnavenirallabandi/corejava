package com.icicibank.loans.carloans;

public class Firstclass {
	int a=10,b=30,sum=0,diff=0;
	void add()
	{
		sum=a+b;
		
		System.out.println("The addition of  a and b is"+sum);
			}
	void sub() {
		sum=a-b;
		System.out.println("The subtraction of a and b is"+diff);
	}
	

	public static void main(String[] args) {
		System.out.println("Hi this is my first class");
		Firstclass obj1=new Firstclass();
		obj1.add();
		obj1.sub();
		
		
		

	}

}
