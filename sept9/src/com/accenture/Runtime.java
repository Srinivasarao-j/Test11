package com.accenture;

public class Runtime {
	public static void main(String[] args)
{
		//ArithmeticException
		//NullPointerException
		//ArrayIndexOutOfBoundsException
		
		try
		{
			int a=10,b=0,c;
			c=a/b;	
		}
		/*try {
			String s=null;
			System.out.println(s.length());	
		}
		try {
			int arr[]=new int[2];
			arr[3]=100;
			System.out.println(arr[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);		
		}
		catch(NullPointerException ne) {
			System.out.println(ne);
		}*/
		catch(ArithmeticException ae) {		
			System.out.println(ae);
		}
		
		finally 
		{
			System.out.println("finally block exicuted");
		}
		

		//int a[2]= {10,20,30};
		//for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);


	}
}
