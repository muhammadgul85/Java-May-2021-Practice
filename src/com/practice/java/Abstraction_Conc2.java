package com.practice.java;

abstract class Bike 
{
	abstract void run ();
}


class Honda4 extends Bike 
{

	@Override
	void run() {
		System.out.println("running safely");
		// TODO Auto-generated method stub
		
	}
	
}

public class Abstraction_Conc2 {
	
	public static void main(String[] args) {
		
		Bike b = new Honda4 ();
		b.run();
		
		
		
	}

}
