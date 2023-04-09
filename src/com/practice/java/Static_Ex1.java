package com.practice.java;



public class Static_Ex1 {
	
	public static void test ()
	{
		System.out.println("Afzal Ansari");
	}
	
	static
	{
		System.out.println("Static block executes first");
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Static_Ex1 st = new Static_Ex1 ();
		
		test ();
		
		
	}

}
