package com.practice.java;

public class Type_Casting {
	
	public static void main(String[] args) {
		
		int myint = 10;
		double myNum = myint;//Widening is automatically done
		System.out.println(myint);
		System.out.println(myNum);
		
		double abc = 10.12d;
		int alpha = (int) abc; //needs to be done manually e.g. int is required here(Narrowing)
		System.out.println(abc);
		System.out.println(alpha);
		
	}

}
