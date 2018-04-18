package javaAssignments;



public class ConvertingStrtoIntAndInttoStr {
	
	public static void main(String[] args) {
		
		//Converting String to Integer
		
		String s = "1235";
		int i = Integer.parseInt(s);
		System.out.println(s+100);//it's a string
		System.out.println(i+100);//it's an integer after converting
		
		//Converting Integer to String
		
		int j = 100;
		String str = String.valueOf(j);
		System.out.println(j+100);//200 because it's binary " + "operator
		System.out.println(str+100);//100100 because it's string concatenation
		
	}

}
