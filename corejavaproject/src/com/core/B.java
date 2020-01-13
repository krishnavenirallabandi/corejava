package com.core;
public   class B extends A{
	                                    // public,<default>,final abstract,strictfp

  public  int a;                       //public protected private,default,final static transient volatile
	public  void add() {              // pub,pri,pro,def,final,abstract,static,synchronized,native,strictfp
		int  a=5;
		int b=6;
		int c=0;
		c=a+b;
		System.out.println("addition is "+c); 
	}
	public void m1() {
		System.out.println("I am overridden method of m1");
		
	}

	public static void main(String[] args) {
		B b=new B();
		b.add();
		b.m1();
		
		
		
		
	
		
		

	}
}
