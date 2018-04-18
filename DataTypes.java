package javaAssignments;

public class DataTypes {
	
	public static void main(String[] args) {
		
		int a=10;  
		int b=10;  
		int c=a+b;  
		System.out.println(c);  
		//widening
		float f=a;  
		System.out.println(a);  
		System.out.println(f);  
		
		//Narrowing (Typecasting)
		
		float f1=10.5f;  
		//int a=f;//Compile time error  
		int a1=(int)f;  
		System.out.println(f1);  
		System.out.println(a1); 
		
		//Overflow
		
		int a2=130;  
		byte b1=(byte)a;  
		System.out.println(a2);  
		System.out.println(b1);
		
		//Adding Lower Type
		
		byte x=10;  
		byte y=10;  
		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
		byte z=(byte)(x+y);  
		System.out.println(z);  
	}

}
