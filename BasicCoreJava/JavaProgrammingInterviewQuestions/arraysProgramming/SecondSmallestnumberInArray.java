package arraysProgramming;

public class SecondSmallestnumberInArray {

	public static void main(String[] args) {
		
		int[] a = {-5, -4, 0, 2, 10, 30, -3};
		
	    int smallest = Integer.MAX_VALUE;
	    
	    int secondSmallest = Integer.MAX_VALUE;
	    
	    for (int i = 0; i < a.length; i++) 
	    {
	        if(a[i]==smallest)
	        {
	          secondSmallest=smallest;
	        } 
	        else if (a[i] < smallest) 
	        {
	            secondSmallest = smallest;
	            smallest = a[i];
	        } 
	        else if (a[i] < secondSmallest) 
	        {
	            secondSmallest = a[i];
	        }

	    }
	    System.out.println(secondSmallest);
	}

}
