package com.accenture.lkm;

class Ex1{        // final class can not inherit parent class
	int age=20;    // variable cannot modified
Ex1(){
	System.out.println("parent default constructor");
}
	void displayInfo() {
		System.out.println("parent class method");
	}
}
class Ex2 extends Ex1 {
	Ex2(){
		super();
	}
	void showInfo(){
		// int age=30; //local variable not used
		System.out.println(super.age); //invoke parent class variable
		super.displayInfo();
	}
}
public class Superexp {
	public static void main(String[] args) {
		Ex2 e=new Ex2();
		e.showInfo();
		e.displayInfo();
	}
}
