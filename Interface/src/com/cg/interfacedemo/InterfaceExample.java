package com.cg.interfacedemo;

    interface Bike
{
	void getMilage();
}
    class R15 implements Bike
{
	    public void getMilage()
	    {
		    System.out.println("Mileage is 40Km/L");
       	}
	
}

public class InterfaceExample {
    public static void main(String[] args) {
    	R15 bike = new R15();
    	bike.getMilage();
	}

}
