package com.accenture;
//bean class or pojo class
public class Demogetset {
	private int empid ;
	private String empname;
	private String empaddress;
	private double empsalery;
	private int age;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public double getEmpsalery() {
		return empsalery;
	}
	public void setEmpsalery(double empsalery) {
		this.empsalery = empsalery;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Demogetset [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + ", empsalery="
				+ empsalery + ", age=" + age + "]";//tostring
	}
	

}
