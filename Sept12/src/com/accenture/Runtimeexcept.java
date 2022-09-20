package com.accenture;

public class Runtimeexcept {
	public static void main(String[] args) {
		try {
		int a=10,b=0,c;
		c=a/b;
		
		System.out.println(c);
		System.out.println("before"); //after try does not works
		
		try {
		int arr[]=new int[5];
		arr[6]=100;
		System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException ao){
			System.out.println(ao);
		}
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("After exception");
		
	}

}
