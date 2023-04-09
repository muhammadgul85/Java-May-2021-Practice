package com.practice.java;

interface concept11 
{
	void test11();//no {} given, it's not implemented
}

interface concept12
{
	void test12();//no {} given, it's not implemented
}
interface concept13 extends concept11, concept12
{
	void test13();//no {} given, it's not implemented
	
}

class inter1 implements concept13 
{

	@Override
	public void test11() {
		// TODO Auto-generated method stub
		System.out.println("method of interface concept11 implemented here");
		
	}

	@Override
	public void test12() {
		// TODO Auto-generated method stub
		System.out.println("method of interface concept12 implemented here");
	}

	@Override
	public void test13() {
		// TODO Auto-generated method stub
		System.out.println("method of concept13 implemented here");
		
	}
	
}

class objj implements concept11 
{

	@Override
	public void test11() {
		// TODO Auto-generated method stub
		System.out.println("method of interface concept11 implemented here");
	}
	
}



public class Interface_Ex1 {
	
	public static void main(String[] args) {
		
		
		inter1 a = new inter1 ();
		objj   b = new objj ();
		
		a.test11();
		a.test12();
		a.test13();
		System.out.println("********");
		
		b.test11();
		
		
		
		
		
	}

}
