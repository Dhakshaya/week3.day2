package sample.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class MissingElementArrayUsingMap {
	public static void main(String[] args) 
	{
		
		int[] arr = {1,2,3,4,7,6,8}; //without Array.sort we can use TreeMap it will sort ASCII order
		int sum=0;
		for(int j=0;j<=8;j++)
		{
			sum=sum+j;
			
		}
		System.out.println("Sum of N Natural number:" +sum);
		int sumArrFromKey= 0;
	    
		/*TreeMap - ASCII order so, no need sort the Array using Arrays.sort*/
		TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
	    for(int i=0;i<arr.length;i++) //1
	    {
	    	if(!treeMap.containsKey(arr[i]))
		  {		  		 
			  treeMap.put(arr[i], 1);
		  }	  
		  
	  }
	  System.out.println(treeMap);	// Array sorted using TreeMap
	 
	 //Get only key value from the treeMap and assign to Set for finding Missing array	  
	  for(Map.Entry<Integer,Integer> treeMapEntryset : treeMap.entrySet())
	  {     System.out.print(treeMapEntryset.getKey()+ " ");
	   
	     sumArrFromKey=sumArrFromKey+treeMapEntryset.getKey();
		    //sumArrFromKey+=treeMapEntryset.getKey()
		  }
	  System.out.println();
	  System.out.println("Sum of treeMap keys: " + sumArrFromKey); 
	  int missingArray = sum-sumArrFromKey;
	  System.out.print("Missing Array in the give Array: ");
	  System.out.println(missingArray); 

	  }

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] arr = {1,2,3,4,7,6,8};
//		Arrays.sort(arr);
//		int sum1=0;
//		int sum2=0;
//		int missingArr = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum1=sum1+arr[i];
//			
//			}
//		System.out.println(sum1);
//		
//		for(int i=1;i<=8;i++)
//		{
//			sum2=sum2+i;
//			
//			}
//		
//		missingArr = sum2-sum1;
//		System.out.println(missingArr);
		
		
		}
	


