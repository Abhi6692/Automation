package PatternsQuestions;

public class PatternProgram4 {

	//1 
	//2 3 
	//4 5 6 
	//7 8 9 10 
	//11 12 13 14 15 
	
	
	public static void main(String[] args) {
		printNums(5);

	}
	
	public static void printNums(int n) 
    { 
        // initialising starting number 
        int num=1; 
          
        // outer loop to handle number of rows 
        // n in this case 
        for(int i=0; i<n; i++) 
        { 
  
            // without re assigning num 
            // num = 1; 
            for(int j=0; j<=i; j++) 
            { 
                // printing num with a space 
                System.out.print(num+ " "); 
                  
                // incrementing num at each column 
                num = num + 1; 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
    } 


}
