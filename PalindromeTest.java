package net.thisbit.javatester;
import java.util.Scanner;
public class PalindromeTest {
	
	public static void main(String[] args) {
		int i = 0;
		boolean isPalindrome = true;
		System.out.println("Palindrome test");
		String myString = getInput();
		String revString = new String();
		StringBuilder sb = new StringBuilder(myString);
		sb.reverse();
		revString = sb.toString();
		System.out.println("The reversed string: " + revString);
		System.out.println("The normal string: " + myString);
		System.out.println("Testing...");
		while(i < myString.length()) {
			System.out.println("Testing if " + myString.charAt(i) + " and " + revString.charAt(i) + " are the same.");
			if(myString.charAt(i) != revString.charAt(i)) {
				System.out.println("Not a palindrome");
				isPalindrome = false;
				break;
			}
		i++;
		} 
		if(isPalindrome) {
			System.out.println("Yes, " + myString + " is a palindrome!");
		}
		
	}
	
	
	public static String getInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String line = in.nextLine().toLowerCase();
		System.out.println("You typed: " + line);
		// close Scanner
		in.close();
		// return the line
		return line;
	}
}
