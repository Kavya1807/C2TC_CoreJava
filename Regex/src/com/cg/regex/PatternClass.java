package com.cg.regex;

import java.util.regex.*;

public class PatternClass {
      
	public static void main(String[] args) 
	{
	
		System.out.println(Pattern.matches("[stu]","s"));
		System.out.println(Pattern.matches("[^abc]","e"));
		System.out.println(Pattern.matches("[a-pA-P]","t"));
		System.out.println(Pattern.matches("[a-s&&[def]]", "e"));
		System.out.println(Pattern.matches("[m-z&&[pqr]]", "q"));
		System.out.println(Pattern.matches("[m-z&&[pqr]]", "pq"));
		System.out.println(Pattern.matches("[g-z&&[^mn]]","s"));
		System.out.println(Pattern.matches("[g-z&&[^mn]]","sm"));
		System.out.println(Pattern.matches("[A-Z&&[^s-x]]","U"));
		System.out.println(Pattern.matches("[A-Z&&[^s-x]]","z"));
		
	}
}
