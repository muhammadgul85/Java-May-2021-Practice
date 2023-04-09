package com.practice.java;

class cons1
{
	cons1(int a, int b)
	{
		System.out.println("a: "+ " b: "+b);
	}
	
	cons1(long a, long b)
	{
		System.out.println("long a: "+ " long b: "+ b);
	}
	
	void test1()
	{
		System.out.println("Method inside the class");
	}
}




public class Constructuor_ex1 {
	
	public static void main(String[] args) {
		cons1 c= new cons1 (1, 1);
		cons1 d = new cons1 (12L, 22L);
		
		c.test1();
		d.test1();
	}

}
