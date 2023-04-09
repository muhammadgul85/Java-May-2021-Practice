// Same method different signature is called overloading 
//no duplicate methods allowed within class
package com.practice.java;

class overlooking
{
	public void test (int a, int b)
	{
		System.out.println("value of int a: " +a + " value of int b: " +b);
	}
	
	public void test (int c, int d, float f)
	{
		System.out.println("c: "+ c + " d: " +d+ " float: " +f);
	}
	
	public void test (String a, String b)
	{
		System.out.println("Strig a: "+a+ ", " +" String b: " + b);
	}
}



public class OverLoading {
	public static void main(String[] args) {
		
		
		overlooking ov = new overlooking ();
		
		ov.test(1, 3);
		ov.test(2, 3, 1.11f);
		ov.test("Alpha", "Bravo");
		
		
		
	}

}
