package java_ProgrammingInterview_Questions;

public class RemoveSpecial_JunkCharactersFromAString {

	
	//Use Regular Expressions
	public static void main(String[] args) {
		
		
		String S= "@^#aBhishek123^&%$&22";
		
		 S = S.replaceAll("[^a-zA-Z0-1]", "");
		
		System.out.println(S);
		
	}

}
