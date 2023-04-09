package com.practice.java;

public class String_Ex {
	
	public static void main(String[] args) {
		
		
		String ab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println("String length is: " + ab.length());
		
		System.out.println("print to lowercase: " + ab.toLowerCase());
		
		System.out.println("index of D: " + ab.indexOf("E"));
		
		//concatination 
		
		String fname = "Muhammad";
		String lname = "Gul";
		
		System.out.println(fname + " " + lname);
		//another way to concat
		System.out.println(fname.concat(lname));
		//special character 
		
		String txt = "We are the so-called  \"Vikings\" of the north "; 
		System.out.println(txt);
		
		//double backslash to single 
		
		String t = " The Character \\ is lovely";
		System.out.println(t);
		
		String p = "What a big-joke it is";
		
		System.out.println(p);
		
		String n = " Hello \n to the world";
		System.out.println(n);
		
	}

}
