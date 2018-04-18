package javaAssignments;

public class StringFunctions {
	public static void main(String[] args) {
		
		String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  //o/p=sachin
		   
		  /* String s1="Sachin";  //this block of code gives o/p = SachinTendulkar
		   s1=s1.concat(" Tendulkar");  
		   System.out.println(s);  
		   */
		   //String comparision
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   //Equals ignore case
		   String s5=" Sachin";  
		   String s6="SACHIN";  
		  //trim
		   System.out.println(s5.trim());
		   System.out.println(s5.equals(s6));//false  
		   System.out.println(s5.equalsIgnoreCase(s6));//true 
		   //charAt
		   System.out.println(s5.charAt(0));
		   //length
		   System.out.println(s.length());
		   //String concat using + or concat method
		   String v1="Sachin ";  
		   String v2="Tendulkar";  
		   String v3=v1.concat(v2);  
		   System.out.println(v3);//Sachin Tendulkar 
		   System.out.println(v3=v1+v2);
		   //substring
		   String ss="SwathiPaidipally";  
		   System.out.println(s.substring(6));//aidipally  
		   System.out.println(s.substring(0,6));//Swathi  
	}

}
