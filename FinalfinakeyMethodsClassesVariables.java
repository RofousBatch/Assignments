package javaAssignments;

public class FinalfinakeyMethodsClassesVariables {
	
	//final variable
	
	final int speedlimit=90;//final variable  
	 void run(){  
	  System.out.println("speedlimit final var ::"+speedlimit);}
	 
	 //final method
	 
	 final void run1(){System.out.println("running final method ::" );}  
	
	 //final class
	 
	 final class Bike{}  
	  
	// class Honda1 extends Bike{  //cannot extend final class
	   void run3(){System.out.println("final class: running safely with 100kmph");}  
	     
	 public static void main(String[] args) {
		
		 FinalfinakeyMethodsClassesVariables fk = new FinalfinakeyMethodsClassesVariables();
		 fk.run();
		 fk.run1();
		 fk.run3();
	}
	
	 

}
