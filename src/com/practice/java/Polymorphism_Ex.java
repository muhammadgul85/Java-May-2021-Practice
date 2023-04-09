package com.practice.java;


class Animalvoice 
{
	void voice ()
	{
		System.out.println("Animal makes noises");
	}
}

class goggi extends Animalvoice 
{
	void voice ()
	{
		System.out.println("goggi barks");
	}
}

class lionn extends Animalvoice
{
	void voice ()
	{
		System.out.println("lionn roars");
	}
}

class horsee extends Animalvoice
{
	void voice ()
	{
		System.out.println("horse neighsss");
	}
}

public class Polymorphism_Ex {
	public static void main(String[] args) {
		
		Animalvoice av = new Animalvoice (); //this is how normally create object from class
		Animalvoice gv= new goggi ();
		Animalvoice lv= new lionn ();
		Animalvoice hv= new horsee();
		
		av.voice(); //calling method of Animalvoice class
		gv.voice();
		lv.voice();
		hv.voice();
		
		
		
		
		
	}

}
