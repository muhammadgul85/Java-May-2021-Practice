//ABSTRACTION:is the process of hiding the implementation details and showing only functionality to the user.We don't want to show the features to the user, therefore abstraction is used
// * Abstract class we can declare with abstract keyword - that is must
// * In Abstract class we have Abstract method and non Abstract Method
// * Abstract Class is not a 100% concrete class
// * Abstract class is not a complete class , We can't create a object of Abstract class
// * Interface can achieve 100% Abstraction
//*Abstract Method doesn't have a body
//*Abstract class in Java (javaTpoint.com)
//It needs to be extended and its method implemented. It cannot be instantiated means we can't create object of it.
//Points to Remember
//•	An abstract class must be declared with an abstract keyword.
//•	It can have abstract and non-abstract methods (Abstract method is built in, even if you don't declare).
//•	It cannot be instantiated.
//•	It can have constructors and static methods also.
//•	It can have final methods which will force the subclass not to change the body of the method
//Abstract Method cannot have body

package com.practice.java;

abstract class abc1
{
	public void showcard ()
	{
		System.out.println("Show employee card");
	}
	
	abstract void person ();
}

class MuhammadGul extends abc1
{
	public void dresscode ()
	{
		System.out.println("Mo is wearing Chinos");
	}

	@Override
	void person() {
		System.out.println("Abstract method");
		// TODO Auto-generated method stub
		
	}
}

class Afzal1 extends abc1
{
	public void dresscode ()
	{
		System.out.println("Afazl is wearing uniform");
	}

	@Override
	void person() {
		System.out.println("Abst method implementation");
		// TODO Auto-generated method stub
		
	}
}






public class Abstraction_Ex {
	public static void main(String[] args) {
		
		MuhammadGul mg = new MuhammadGul ();
		Afzal1 af1 = new Afzal1 ();
		
		mg.showcard();
		mg.dresscode();
		
		af1.showcard();
		af1.dresscode();
		
		
		//abc1 a = new abc1 (); cannot instantiate i.e. can't create object from abstract class
		
		
		
		
	}

}
