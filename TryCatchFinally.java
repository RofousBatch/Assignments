package javaAssignments;

public class TryCatchFinally {
	public static void main(String[] args)  {

		/*try {
			int a = 10/0;

		}catch(ArithmeticException e) 
		{System.out.println(e);}
		System.out.println("rest of the code");*/
		
		//multiple exceptions
		/* try{  
			    int a[]=new int[5];  
			    a[5]=30/0;  
			   }  
			   catch(Exception e){System.out.println("common task completed");}  
			   System.out.println("rest of the code...");  */
			   
	    //nested try block
		/*try{  
		    try{  
		     System.out.println("going to divide");  
		     int b =39/0;  
		    }catch(ArithmeticException e){System.out.println(e);}  
		   
		    try{  
		    int a[]=new int[5];  
		    a[5]=4;  
		    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
		     
		    System.out.println("other statement");  
		  }catch(Exception e){System.out.println("handeled");}  
		  
		  System.out.println("normal flow..");  
		*/
		//finally block
		/*try{  
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e){System.out.println(e);}  
			  finally{System.out.println("finally block is always executed");}  
			  System.out.println("rest of the code...");  */
		//throw keyword - chked/unchked/custom exception
		

	
	}
}