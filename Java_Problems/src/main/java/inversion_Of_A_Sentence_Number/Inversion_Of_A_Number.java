package inversion_Of_A_Sentence_Number;

public class Inversion_Of_A_Number {

	public static void main(String[] args) {
		
		int[] a= {7,8,9,3,4,45,67,98,455,678,98};
		
		int k=a.length-1;
		
		for(k=a.length-1; k>=0; k--)
		{
			System.out.print(a[k]  + " ");
		}

	}

}
