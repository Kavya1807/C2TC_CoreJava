package com.cg.regex;

import java.util.regex.*;

public class Matcherclass{

      public static void main(String args[]){

    	  boolean b = Pattern.matches("..a", "aga");
    	  boolean b1 = Pattern.matches(".ma", "ast");
    	  boolean b2 = Pattern.matches("s.a", "saa");
    	  boolean b3= Pattern.matches("..a", "kata");
    	  System.out.println(b+" "+b1+" "+b2+ " "+b3);
    }
          
}