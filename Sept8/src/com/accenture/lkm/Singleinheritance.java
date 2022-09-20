package com.accenture.lkm;
class Parent{
	void displayInfo(){
		System.out.println("Parent Class");
	}
}
class Child extends Parent{
	void showInfo() {
		System.out.println("Child Class");
	}	
}
public class Singleinheritance {
	public static void main(String[] args) {
		Child c=new Child();
		c.displayInfo();
		c.showInfo();
	}

}
