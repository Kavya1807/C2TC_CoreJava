package com.cg.regex;

import java.util.regex.Pattern;

public class RegexQuantifiers {

	public static void main(String[] args) {
		System.out.println("Quantifiers ?....");
		System.out.println(Pattern.matches("[asu]?", "u"));
		System.out.println(Pattern.matches("[ssav]?","a"));
		System.out.println(Pattern.matches("[amn]?","aazzta"));
		System.out.println(Pattern.matches("[pka]","ak"));
		System.out.println(Pattern.matches("[amn]?", "aaammmnnn"));
		System.out.println("Quantifiers +.....");
		System.out.println(Pattern.matches("[stu]+","s"));
		System.out.println(Pattern.matches("[stu]+","sss"));
		System.out.println(Pattern.matches("[stu]+","sssstttuuu"));
		System.out.println(Pattern.matches("[stu]+","sssvvv"));
		System.out.println(Pattern.matches("[stu]+","s"));
		System.out.println("Quantifiers *.....");
		System.out.println(Pattern.matches("[wxy]*","w"));
		System.out.println(Pattern.matches("[wxy]*",""));
		System.out.println(Pattern.matches("[wxy]*","wwww"));
		System.out.println(Pattern.matches("[wxy]*","v"));
		System.out.println(Pattern.matches("[wxy]*","wxa"));
	}

}
