package com.jsp.relationship;

public class Engine {
private String brand;
private String cubic_capacity;

public Engine(String brand, String cubic_capacity) {
	this.brand=brand;
	this.cubic_capacity=cubic_capacity;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public String getCubic_capacity() {
	return cubic_capacity;
}
public void setCubic_capacity(String cubic_capacity) {
	this.cubic_capacity = cubic_capacity;
}
public String getBrand() {
	return brand;
}
public void printEngineDetails() {
	System.out.println("===ENGINE DETAILS===");
	System.out.println("Engine brand is "+ brand);
	System.out.println("Engine cc is "+ cubic_capacity);
	}
}
