package com.cg.assignmentabstract;

abstract class building{
	
	public building()//constructor 
	{
		System.out.println("Building structure");
	}
	
	 abstract void construct();//abstract method
	 static void display() { // non-abstract method
	       System.out.println("Building for rent in Bangalore");
	   }
}

class college extends building { 

	void construct() {
		 System.out.println("college classrooms");
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		
		college c = new college();
	    building.display();
	    c.construct();
	}
}
