package com.accenture;
import java.util.Scanner;

public class Localvariable {
	public void ShowInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value :");
		//local variable
		int a = sc.nextInt();
		System.out.println("a value is ="+a);			
	}
public static void main(String[] args) {
	Localvariable d=new Localvariable();
	d.ShowInfo();
}


}
