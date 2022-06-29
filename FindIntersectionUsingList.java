package sample.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersectionUsingList {
public static void main(String[] args) {
	
	int[] input1 = {3,2,11,4,6,7};
    int[] input2 = {1,2,8,4,9,7};
//    int arrayDuplicate;
//    int indexofDuplicateValue;
//	
	ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
    ArrayList<Integer> ArrayList2 = new ArrayList<Integer >();
    
    
    for(Integer list1 : input1 )
    {
    	ArrayList1.add(list1);
    	
    }	
    for(Integer list2 : input2 )
    {
    	ArrayList2.add(list2);
    	
    }	
    for(int i=0;i<ArrayList1.size();i++)
    {
    	for(int j=0;j<ArrayList2.size();j++)
    	{
    		if(ArrayList1.get(i).equals(ArrayList2.get(j)))
    		{
             System.out.println(ArrayList2.get(i));
    		 
    		  }
    			
    			
    			
    			
    		}
    	
    		
    	}
    
   
//    arrayDuplicate = ArrayList2.get(i);    
//    indexofDuplicateValue =   ArrayList2.indexOf(ArrayList2.get(i));
//    System.out.println(arrayDuplicate + " " +indexofDuplicateValue); // Index of all duplicate values
//	

		int firstDuplicateIntValue = ArrayList2.get(1);
	int firstDuplicateIndex = ArrayList2.indexOf(1);
System.out.println("First Duplicate value is: " + firstDuplicateIntValue + " " +"Index of first Duplicate " + firstDuplicateIndex); 
		 

    
	
	
	
	
	
	
	
	
//int firstOccurance = ArrayList3.get(0);
//System.out.println(firstOccurance);
//int lastOccurance = ArrayList3.get(ArrayList3.size()-1);
//System.out.println(lastOccurance);
	
//	int[] input1 = {3,2,11,4,6,7};
//	int[] input2 = {1,2,8,4,9,7};
//	int[] input3 = new int[input2.length];
//	
//	
//	
//	for(int i=0;i<input1.length;i++)
//	{
//		for(int j=i;j<input1.length;j++)
//		{
//			if(input1[i]==input2[j])
//			{
//				//input3[j] = input1[i];
//				System.out.println(input2[j]);
//								
//			}
//			
//			
//		}
//		
//		}
	
	
}
}
