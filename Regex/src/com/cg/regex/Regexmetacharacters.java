package com.cg.regex;

import java.util.regex.*;

public class Regexmetacharacters {

	public static void main(String[] args) {
		System.out.println("Metacharacters.....");
		System.out.println(Pattern.matches("\\d", "0"));
		System.out.println(Pattern.matches("\\d", "111"));
		System.out.println(Pattern.matches("\\d", "12345"));
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "abc123"));
		System.out.println(Pattern.matches("\\d+","1124"));
		System.out.println(Pattern.matches("\\d+", "kavya111"));
		System.out.println(Pattern.matches("\\D*", "KKKK12"));
		System.out.println(Pattern.matches("\\D*", "Kavya"));
		System.out.println(Pattern.matches("\\w", "a"));
		System.out.println(Pattern.matches("\\w", "asha"));
		System.out.println(Pattern.matches("\\w", "3"));
		System.out.println(Pattern.matches("\\W", "123"));
		System.out.println(Pattern.matches("\\W", "*"));
		System.out.println(Pattern.matches("\\w", "#"));
	}

}
