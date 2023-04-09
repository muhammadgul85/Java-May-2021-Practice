package com.practice.java;

public class Java_operators {
	
	public static void main(String[] args) {
		
		int x = 100 + 40;
		System.out.println(x);
		
		int x1 = x + 100;
		
		int x2 = x + x1;
		System.out.println(x1);
		System.out.println(x2);
//		
//		x+=5;
//		
//		System.out.println("print value of x: " + x);
//		
		x= x-10;
		System.out.println("print value of -x: " + x);
		
		x = x * 2;
		System.out.println("multiply: " +x);
		
		x = x/2;
		System.out.println("div: " + x);
		
		x = x % 4;
		System.out.println("modulus: "+x);
		
	}

}
