package javaAssignments;

import java.util.Random;

public class FindRandomValueRange100 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		 int n1 = rnd.nextInt(101);
		 System.out.println("Random value of 100 is :: " + n1);
		 int n2 = rndrange(0, 100);
		 System.out.println("Random Range bet 0-100 ::" + n2);
		 
		 
	}
	//random number with a given range 0-100
	public static int rndrange(int start,int finish) {
		Random rnd = new Random();
		int rndint =  rnd.nextInt(finish+1-start)+start;
	return rndint;
	}
	
}
