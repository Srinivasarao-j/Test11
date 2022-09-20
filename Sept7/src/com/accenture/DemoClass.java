package com.accenture;

public class DemoClass {
		private int empid;//data member1
		private String empname;//member2
		private String empaddress;
		public void showInfo() {
			System.out.println(empid +" "+empname+" "+empaddress);
		}
		public static void main(String[] args) {
			/*DemoClass d=new DemoClass();
			d.empid=13551561;
			d.empname="srinu";
			d.empaddress="Madinapadu";
			d.showInfo();*/
			DemoClass dc1=new DemoClass();
			DemoClass d=dc1;
			d.empid=13551561;
			d.empname="srinu";
			d.empaddress="Madinapadu";
			d.showInfo();
		}

}
