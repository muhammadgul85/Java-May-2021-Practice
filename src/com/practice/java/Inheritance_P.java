package com.practice.java;

class Grandfather 
{
	public void Grandfather1()
	{
		System.out.println("Grandfather properties");
	}
}

class Father extends Grandfather
{
	public void Father1()
	{
		System.out.println("Father inheriting prop of Grandpa class");
	}
}


class child extends Father
{
	public void child1()
	{
		System.out.println("Child inheriting prop of father");
	}
}

public class Inheritance_P {
	
	public static void main(String[] args) {
		
		child C = new child ();
		C.Grandfather1();
		C.Father1();
		C.child1();
		
		
	}

}
