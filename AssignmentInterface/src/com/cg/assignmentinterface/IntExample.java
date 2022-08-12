package com.cg.assignmentinterface;

interface Rectangle  //interface declaration by rectangle
{
	void getArea(int length,int breadth);   //abstract method
}

interface Triangle  //interface declaration by triangle
{
	void getOtherArea(int base,int height);	 //abstract method
}


class polygon implements Rectangle,Triangle 
{
     public void getOtherArea(int base, int height) 
{
	 System.out.println("The area of the triangle is " +(0.5* base * height));
		
}
     public void getArea(int length, int breadth)
{
	 System.out.println("The area of the Rectangle is " +(length * breadth));
		
}

}

public class IntExample {
	
public static void main(String[] args) {
	
	polygon obj = new polygon();   //object creation
	
	obj.getArea(10,8 ); //area of rectangle
	
	obj.getOtherArea(15, 6);//area of triangle
}
}
