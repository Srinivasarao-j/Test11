package com.accenture;

abstract class Sample12{
	void displayInfo() {
		System.out.println("hii");
	}
	abstract void showInfo();
}
class Sample13 extends Sample12{
	void showInfo() {
		
	}
}
public class Abstract2 {
	public static void main(String[] args) {
		Sample13 s=new Sample13();
		s.displayInfo();
	}

}
