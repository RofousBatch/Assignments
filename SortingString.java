package javaAssignments;
import java.util.ArrayList;
//https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
//import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class SortingString {
	/* // Method to sort a string alphabetically
    public static String sortString(String inputString)
    {
    	// convert input string to char array
    	char tempArray[] = inputString.toCharArray();
    	
    	//sort temparray
    	Arrays.sort(tempArray);
    	
    	//return new sorted string
    	return new String(tempArray);
    }
     //Driver method
    public static void main(String[] args) {
		
    	String inputString = "helloworld";
    	String outputString = sortString(inputString);
    	
    	System.out.println("InputString :: "+inputString);
    	System.out.println("OutputString :: "+outputString);
	}*/
	
	//String sorting using collections
	public static void main(String[] args) {
		
	
	ArrayList<String> al=new ArrayList<String>();  
	al.add("Viru");  
	al.add("Saurav");  
	al.add("Mukesh");  
	al.add("Tahir");  
	  
	Collections.sort(al);  
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	 }  
	}
}
