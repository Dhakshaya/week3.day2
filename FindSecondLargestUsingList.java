package sample.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondLargestUsingList {

	
	public static void main(String[] args) {
		
		int[] arrElement = {3,2,11,4,6,7};
		//Converting Array to Arraylist 
		ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
		for(Integer listValues : arrElement)
		{
			ArrayList1.add(listValues);
		}
		//Converting List to Set using TreeSet class so it will sort by Ascending order
		
		TreeSet<Integer> setlistvalues = new TreeSet<Integer>();
		for(Integer setlist : ArrayList1)
		{
			setlistvalues.add(setlist);
		}
		//System.out.println(setlistvalues);  o/p: [2, 3, 4, 6, 7, 11]
		
		//converting to list because we dont have index method in set
		
		for(Integer listvalues1 : setlistvalues)
		{
			ArrayList2.add(listvalues1);
		}
		System.out.println(ArrayList2); // after sorted the list is o/p: [2, 3, 4, 6, 7, 11]
		
		//Pick the 2nd element from the last and print it
		
		
		System.out.println(ArrayList2.get(4));
		
		
		
		
		
		
		
		
//		//Without List
//		int[] arrElement = {3,2,11,4,6,7};4
//	    Arrays.sort(arrElement);
//	    int arrElementSize = arrElement.length;
//		
//	    System.out.println("Ascending Order:" );
//	    for(int i=0;i<arrElementSize;i++)
//		{ 
//	    	
//			System.out.println(arrElement[i]);
//			
//		}
//		
//	    System.out.println();
//	    System.out.println("Second Largest number in the given arr:" +arrElement[arrElementSize-2]);
	}
}
