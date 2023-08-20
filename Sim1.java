package com.jsp.relationship;

public class Sim1 {
private String brand;
private long phone_no;

public Sim1(String brand,long phone_no) {
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
public void printSim1Details() {
	System.out.println("===SIM 1===");
	System.out.println("Sim 1 is "+ brand);
	System.out.println("Mobile number is "+ phone_no);

}

}
