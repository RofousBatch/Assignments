package javaAssignments;

public class FiveDigitRandomNumber {

	public static void main(String[] args) {
	      /**
	       * random() generates a number between 0.0000 and 0.99999
	       * we want this number to be between 10000 and 99999
	       * 
	       * random() * 89999 + 10000
	       * 
	       * let's check the lower limit:
	       * round(0 * 89999) + 10000 = 10000 OK!
	       * 
	       * let's check the higher limit:
	       * round(0.99999 * 89999) + 10000 = 99999 
	       */       
	        for (int i = 0; i < 10; i++) {
	            System.out.println(Math.round(Math.random() * 89999) + 10000);
	        }
	}
}
