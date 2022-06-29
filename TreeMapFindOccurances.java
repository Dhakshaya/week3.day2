package sample.day1;

import java.util.TreeMap;

public class TreeMapFindOccurances {
	public static void main(String[] args) {
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		TreeMap<Integer,Integer> treeMapref = new TreeMap<Integer,Integer>();
		for(Integer inputs:input)
		{if(treeMapref.containsKey(inputs))
			{
					treeMapref.put(inputs,treeMapref.get(inputs)+1);
				}
			else
			{
				treeMapref.put(inputs, 1);
				}
			}			
			System.out.println(treeMapref);
		
			
			
//			for(int i=0;i<input.length;i++)
//			{
//				if(treeMapref.containsKey(input[i]))
//				{
//					treeMapref.put(input[i],treeMapref.get(input[i])+1);
//				}
//				else
//				{
//					treeMapref.put(input[i], 1);
//				}
//			}			
//			System.out.println(treeMapref);
	//	
	}

}
