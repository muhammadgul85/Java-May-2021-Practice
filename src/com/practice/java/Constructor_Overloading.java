//It is a special type of method which is used to initialize the object.
//
//Every time an object is created using the new() keyword, at least one constructor is called.
//
//It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.


package com.practice.java;

class Student5
{
	int id;
	String name;
	int age;
	
	//creating two argument constructor
	
	Student5(int i, String n)
	{
		id = i;
		name =n;
		
		
	}
	//creating three argument constructor 
	
	Student5(int i, String n, int a)
	{
			id = i;
			name =n;
			age =a;
		
	}
	
	void display ()
	{
		System.out.println(id + "  "+ name + "  "+ age);
	}
}




public class Constructor_Overloading {
	public static void main(String[] args) {
		
		
		Student5 s1 = new Student5(6, " Hadi ");
		Student5 s2 = new Student5(7, " Adeeba ", 2);
		s1.display();
		s2.display();
		
	}

}
