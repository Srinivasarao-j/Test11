package com.accenture.lkm;

public class Constructor {
	 Constructor()
	{
		System.out.println("Deafult Constructor");
	}
	Constructor(int a){
		System.out.println("a value is "+a);
	}
	Constructor(int a,int b){
		System.out.println("a and b values are "+a+" "+b);
	}
	public void showInfo()
	{
		System.out.println("Simple Method");
	}
	public static void main(String[] args) {
		Constructor d= new Constructor();
		/*Constructor d1= new Constructor(10);
		Constructor d2= new Constructor(10,20);*/
		
		d.showInfo();
		
	}

}
