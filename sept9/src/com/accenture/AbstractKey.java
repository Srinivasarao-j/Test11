package com.accenture;

interface Sample{
	void displayInfo();    //abstract
	static void getInfo() {
		System.out.println("Static Method");
	}
	default void showInfo(){
		
	}
}
class SampleTest implements Sample{
	public void displayInfo() {
		
	}
	static void getInfo(){
		
	}
}
public class AbstractKey {

	public static void main(String[] args) {
		

	}

}
