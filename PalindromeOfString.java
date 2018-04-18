package javaAssignments;

import java.util.Scanner;

public class PalindromeOfString {
	
	public static void main(String[] args) {
		
		String rev = "";
		System.out.println("please enter the string :: ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		
		for(int i = original.length()-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		
		if(original.equals(rev))
			System.out.println("String is a palindrome");
		else
			System.out.println("String is not a palindrome");
	}

}
