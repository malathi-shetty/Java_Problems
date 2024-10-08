package count_The_Consecutive_Characters_aaabbcdddd_a2b3c1;

public class Count_The_Consecutive_Characters {

	public static void main(String[] args) {
		// 

		String s="aaabbbacccaaa";
	//	String s="";
		String encoded=encodeString(s);
		System.out.println("Encoded String: " + encoded);
	}

	private static String encodeString(String s) 
	{
		if(s == null || s.isEmpty()) 
		{
		return "";	
		}
	/*The Above encodeString method begins by checking if the input string s is null or empty. If so, it immediately returns an empty string.*/
		
		StringBuilder sb = new StringBuilder();//Initialize a StringBuilder named sb to store the encoded result
		int count =1; //an integer count_Number_of_Words_in_a_String to keep track of consecutive occurrences of each character.
		
		// iterate through the String
		for(int i=1; i<=s.length(); i++)//The for loop iterates through the string s (which is "aaabbbacccaaa")
		{
			//check if current character is same as previous
			if(i<s.length() && s.charAt(i) == s.charAt(i-1)) //Inside the loop, it checks if the current character s.charAt(i) is the same as the previous character s.charAt(i - 1).
				{
				 count++; //If they are the same, it increments the count_Number_of_Words_in_a_String variable.
				}
			else
				{
				 //Append previous character and its count_Number_of_Words_in_a_String
					sb.append(s.charAt(i-1));//If they are different or if it's the end of the string (i == s.length())
					sb.append(count);// it appends the previous character and its count_Number_of_Words_in_a_String (count_Number_of_Words_in_a_String) to sb
					
				 //Reset count_Number_of_Words_in_a_String for next character
					count = 1; //resets count_Number_of_Words_in_a_String to 1.
				}
			
		} //After the loop, the last character and its count_Number_of_Words_in_a_String are appended to sb.
	
		return sb.toString(); 
		// Finally, convert sb to a regular string using toString() method of StringBuilder and return it.
	}
		
}

	
	
	
	
	
	
	
	
	
	
	