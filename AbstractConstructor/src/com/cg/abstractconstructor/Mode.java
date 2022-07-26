package com.cg.abstractconstructor;

abstract class Scooty{
	   Scooty()
	   {
		  System.out.println("Scooty is created");
	   }
       abstract void run();
       void changeGear() {
	   System.out.println("gear changed");
                 
       }

}
class TVS extends Scooty{

	void run() {
		System.out.println("running safely");
	}
	   
}

public class Mode {

	public static void main(String[] args) {
		TVS t = new TVS();
		t.run();
		t.changeGear();
	}
				
}
