package find_duplicates_Integers_In_An_Array;

import java.util.HashMap;

public class Duplicate_INTEGERS_InAnArray_UsingHashMap {

	public static void main(String[] args) {

		int []a = {1,3,3,2,2,4,5,5, 10,3, 99};
		
		HashMap<Integer,Integer> newobj = new HashMap<Integer,Integer>();
		//Hashmap stores in the form of keys & values
		// keys is the character & value is the number
		
		int count =1;
		for(int i=0; i<a.length; i++ )
		{
			if(!newobj.containsKey(a[i]))
			{
				newobj.put(a[i], count);
				
			}else 
			{
				newobj.put(a[i], newobj.get(a[i])+1);
			}
		}
		
		for(Integer i: newobj.keySet())
		{
			System.out.println("duplicate number are: " + i + " --> " + newobj.get(i));
		}

	}

}
