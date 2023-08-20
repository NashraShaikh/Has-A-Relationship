package com.jsp.relationship;

public class Sim2 {
	private String brand;
	private long phone_no;

	public Sim2(String brand,long phone_no) {
		this .brand=brand;
		this.phone_no=phone_no;

	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public void printSim2Details() {
		System.out.println("===SIM 2===");
		System.out.println("Sim 2 is "+ brand);
		System.out.println("Mobile number is "+ phone_no);
	}

}
