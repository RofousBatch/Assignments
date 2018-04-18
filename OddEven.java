package javaAssignments;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		int num=0;
		System.out.println("enter the number :: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		if(num%2 == 0) {
			System.out.println("Even Number...");
		}else
			System.out.println("Odd Number...");
	}
}
