package net.thisbit.javatester;

import java.util.Scanner;

public class PalindromeTest {
	
	public static void main(String[] args) {
		if(isPalindrome(getInput()) ) {
			System.out.println("Yes, your string is a palindrome!" );
		} else {
			System.out.println("No, not a palindrome.");
		}
		
	}
	
	
	public static String getInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String line = in.nextLine();
		System.out.println("You typed: " + line);
		// close Scanner
		in.close();
		// return the line
		return line.toLowerCase();
	}
	
	public static Boolean isPalindrome(String s) {
		int i = 0;
		Boolean isPalindrome = true;
		String myString = s;
		String revString = new String();
		StringBuilder sb = new StringBuilder(myString);
		revString = sb.reverse().toString();
		System.out.println("The reversed string: " + revString);
		System.out.println("The normal string: " + myString);
		System.out.println("Testing...");
		while(i < myString.length()) {
			if(myString.charAt(i) != revString.charAt(i)) {
				isPalindrome = false;
				break;
			}
		i++;
		} 
		return isPalindrome;
	}
}
