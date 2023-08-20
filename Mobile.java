package com.jsp.relationship;

public class Mobile {
	private String brand;
	private long price;
    private Sim1 sim1;
    private Sim2 sim2;
    
	public Mobile(String brand,long price) {
		this .brand=brand;
		this.price=price;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Sim1 getSim1() {
		return sim1;
	}

	public void setSim1(Sim1 sim1) {
		this.sim1 = sim1;
	}

	public Sim2 getSim2() {
		return sim2;
	}

	public void setSim2(Sim2 sim2) {
		this.sim2 = sim2;
	}

	public void printMobileDetails() {
		System.out.println("===MOBILE===");
		System.out.println(brand);
		System.out.println(price);
		if(sim1!=null) {
			sim1.printSim1Details();
		}else {
			System.out.println("Sim 1 is not active");
		}
		if(sim2!=null) {
			sim2.printSim2Details();
		}else {
			System.out.println("Sim 2 is not active");
		}
		System.out.println("=======");
	}

}
