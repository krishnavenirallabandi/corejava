package com.core1;

import com.core.A;
import com.core.B;

public class C extends B{
	public void m3() {
		System.out.println("I am m3 method in class c  ");
	}

	public static void main(String[] args) {
		C c=new C();
	     c.m3();
	     c.m1();
	     c.add();
		

	}

}
