package javaAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FindingDuplcateChintotalqa {
	
	public static void main(String[] args) {
		
		//to find the character count in  a String
	    
	        String s = "raviiiran";  
	        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();      
	        for(int i =0 ;i<s.length();i++)
	        {
	            //System.out.println(s.charAt(i));
	            if(hashMap.containsKey(s.charAt(i)))
	            {
	                System.out.println("Duplicate Character :: "+ s.charAt(i));
	                System.out.println("test the existing get value "+hashMap.get(s.charAt(i)));
	                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
	                System.out.println("test the new get value "+ hashMap.get(s.charAt(i)));
	            }
	            else
	            {
	                hashMap.put(s.charAt(i),1);
	            }
	        }
	        //Retrieve the elements from hash map
	        
	        Set<Character> set = hashMap.keySet();
	        Iterator<Character> it = set.iterator();
	        while(it.hasNext())
	        {
	            Character ch = it.next();
	            int value = hashMap.get(ch);
	            System.out.println("Character :: " + ch + ":: Occurance::: " + value);
	        }
	         
	         
	}
}
