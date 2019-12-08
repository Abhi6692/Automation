package PatternsQuestions;

public class PatternProgram3 {


	//1 
	//1 2 
	//1 2 3 
	//1 2 3 4 
	//1 2 3 4 5 

	public static void main(String[] args) {
		printNums(5);

	}


	public static void printNums(int n) 
	{ 
	
		// outer loop to handle number of rows 
		//  n in this case 
		for(int i=0; i<n; i++) 
		{ 
			// initialising starting number 
			int num=1; 

			//  inner loop to handle number of columns 
			//  values changing acc. to outer loop 
			for(int j=0; j<=i; j++) 
			{ 
				// printing num with a space  
				System.out.print(num + " "); 

				//incrementing value of num 
				num = num + 1; 
			} 

			// ending line after each row 
			System.out.println(); 
		} 
	} 




}
