//Same method same signature but different implementation is called a method overriding and we can achieve this with inheritance
//Same methods different signature is called method over loading


package com.practice.java;

class OverRide1 
{
	public void or1 (int a, int b)
	{
		System.out.println("Value of a: " +a + " Value of b: " + b);
	}
}

class OverRide2 extends OverRide1 
{
	public void or1 (int a, int b)
	{
		System.out.println("\"Passing two integer value\"");
		//super.or1(10, 3);
	}
}


public class Overriding_Ex {
	
	public static void main(String[] args) {
		
		OverRide1 OR = new OverRide2 ();
		OR.or1(2, 6);
	}

	
	
	
}
