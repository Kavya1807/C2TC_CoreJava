package com.cg.abstractassignment;

abstract class Movie{
	String title;
	abstract void setTitle(String name);
}

class MyMovie extends Movie{

	
	void setTitle(String name) {
		 title = name;
	}
	 String getTitle() {
		 return title;
	 }
	
}

public class Main {

	public static void main(String[] args) {
		String title = "The Lion King";
		MyMovie m = new MyMovie();
		m.setTitle(title);
		System.out.println("the title of the movie:"+m.getTitle());
		
	}

}
