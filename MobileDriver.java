package com.jsp.relationship;

public class MobileDriver {
   public static void main(String args[]) {
	   Mobile m = new Mobile("Iphone",80000);
	   m.setSim1(new Sim1("AIRTEL",9768));
	   m.setSim2(new Sim2("VI",77388));
	   m.printMobileDetails();
   }
}
