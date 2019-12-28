package com.icicibank.loans.carloans;

public class Firstclass {
	int a=10,b=30,sum=0,diff=0,mul=0;
	void add()
	{
		sum=a+b;
		
		System.out.println("The addition of  a and b is"+sum);
			}
	void sub() {
		diff=a-b;
		System.out.println("The subtraction of a and b is"+diff);
	}
	void mul() {
		mul=a*b;
		System.out.println("The multiplication if a and b is"+mul);
		
	}
	

	public static void main(String[] args) {
		System.out.println("Hi this is my first class");
		Firstclass obj1=new Firstclass();
		obj1.add();
		obj1.sub();
		obj1.mul();
		
		
		

	}

}
