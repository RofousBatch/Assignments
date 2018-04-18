package javaAssignments;

public class Print1to10Recursion {
	
	static int n=0;  
	static void print(){  
	n++;  
	if(n<=10){  
	System.out.println(n);  
	print();  
	}  
	}  
	public static void main(String[] args) {  
	print();  
	}  

}
