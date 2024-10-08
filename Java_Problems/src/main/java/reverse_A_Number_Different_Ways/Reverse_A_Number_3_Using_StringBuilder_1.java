package reverse_A_Number_Different_Ways;

import java.util.Scanner;

public class Reverse_A_Number_3_Using_StringBuilder_1 {
	
//  Java Program to Reverse a Given Number Using Predefined Methods

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("Reverse Number is: " + rev);
	}
}

/**
Note: 
 sb - a class object is created in StringBuilder
 num is appended to the object sb
 we have to access the inversion_Of_A_Sentence_Number number by using object & then inversion_Of_A_Sentence_Number is stored in return StringBuilder type
 
 */