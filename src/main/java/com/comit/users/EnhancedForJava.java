package com.comit.users;

public class EnhancedForJava {
public static void main(String[] args)
{
	int [] numbers= {10,20,30,40,50};
	for(int x : numbers)
	{
		System.out.print(x);
		System.out.print(",");
		
	}
	System.out.print("\n");
	String[] names = { "Gopal", "Khushi", "Reyan", "Shahid", "Sanjeeta"};
	
	for(String y : names)
	{
		System.out.print(y);
		System.out.print(",");
	}
}
}