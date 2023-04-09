//https://www.javatpoint.com/static-keyword-in-java
package com.practice.java;

class Student
{
	int rollno;//instance variable
	String name;
	
	static String college = "ITS"; //static variable 
	
	
	//construtctor
	
	Student (int r, String n)
	{
		rollno =r;
		name =n;
	}
	
	void display ()
	{
		////method to display the values  
		System.out.println(rollno + " " + name+ " " + college);
	}
}



public class Static_Var_Ex {
	public static void main(String[] args) {
		
		Student s1 = new Student(15, "Muhammad Gul");
		Student s2 = new Student(13, "Furqan");
		//we can change the college of all objects by the single line of code  
		//Student.college="BBDIT";  
		
		s1.display();
		s2.display();
		
		
		
		
		
	}

}
