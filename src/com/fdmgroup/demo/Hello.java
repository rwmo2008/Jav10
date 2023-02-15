package com.fdmgroup.demo;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, world.");
		
		String name;
		name = "Robert";
		String capitalName = name.toUpperCase();
		char firstLetter = name.charAt(0);
		char lastLetter = name.charAt(5);
		System.out.println(firstLetter);
		
		char char1 = 'x';
		char char2 = 'y';
		char char3 = 'z';
		System.out.println(char1 + char2 + char3);
		String string1 = "z";
		String string2 = "y";
		System.out.println(char1 + char2 + string2);
		System.out.println(char1 + string1 + char3);
	}

}
