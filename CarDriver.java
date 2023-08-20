package com.jsp.relationship;

public class CarDriver {

	public static void main(String[] args) {
		Car c = new Car("BMW","X1","WHITE",6500000);
		c.setEngine(new Engine("X1","2500CC"));
		c.printCarDetails();
		}
}
