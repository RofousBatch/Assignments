package javaAssignments;

public class BubbleSorting {
	public static void main(String[] args) {
		 int a[]={5,4,3,2,10},temp;//2,3,4,5,10
	        for(int i =0 ;i<a.length;i++)
	            for(int j=i+1;j<a.length;j++)
	                if(a[i]>a[j])
	                {
	                    //Swapping 
	                    temp = a[j];
	                    a[j]=a[i];
	                    a[i]=temp;
	                }
	        System.out.println("Printing the numbers in sorting order");
	        for(int i=0;i<a.length;i++)
	            System.out.println(a[i]);
	 
	}

}
