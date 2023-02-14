package com.comit.users;

public class MyClass {
	int num;
	String x;
	//No argument Constructor
	MyClass()
	{
		num= 100;
	}
	
	//Parameterized Constructor
	private void Class(String i) {
		// TODO Auto-generated method stub
		x=i;
		
	}
	
	
	public static void main(String[] args)
	{
		MyClass t1 =new MyClass();
		MyClass t2 = new MyClass();
		System.out.println(t1.num + " " + t2.num);
		
		t1.Class("s");
		t2.Class("g");
		
		
		
		System.out.println(t1.x + " " +t2.x);
	}

	

}
