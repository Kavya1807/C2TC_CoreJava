package com.cg.scannerclass;

import java.util.*;

public class Student {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)	;
        System.out.println("Enter the student id");
        int studId = sc.nextInt();
        System.out.println("the id is:" +studId );
        sc.nextLine();
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("my name is :"+ name);
        sc.nextLine();
        System.out.println("enter the phone number");
        long ph = sc.nextLong();
        System.out.println("phone number");
        sc.nextLine();
        
	}

}
