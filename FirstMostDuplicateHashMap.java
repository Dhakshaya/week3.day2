package sample.day1;

import java.util.HashMap;

public class FirstMostDuplicateHashMap {

public static void main(String[] args) {
	
     String str= "abbaba";
     int counthashmapset=0;
     HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
     char[] ch = str.toCharArray(); //['a', 'b' ,'b' , 'a', 'b' ,'a']
   
     for(int i=0;i<ch.length;i++) //a
     {
    	 if(hashmap.containsKey(ch[i])) //a 
    	 {
    		 counthashmapset++;
    		 if(counthashmapset>=1)
    		 {
    			 System.out.println(ch[i]);
    			 break;
    		 }
    		 
    	 }
    	 else
    	 {    		 
    		 hashmap.put(ch[i], 1);//a ,b 
    	 }
    	 
    	 
     }
     
     
     
     
     
     
     
     
//     for(Character ch1 : ch)
//     {    	 if(hashmap.containsKey(ch1))
//    	 {
//    		 hashmap.put(ch1,hashmap.get(ch1)+1);
//    	   		
//    	 }
//    	 else
//    	 {
//    		 hashmap.put(ch1,1);
//    	 }
//     }
//     //Key - Character/String & Values - Integer
//     
//   System.out.println(hashmap);
//   System.out.println(hashmap.entrySet());
//     
   
     //first most duplicate 
//     int count = 0;
//     int max=1;
//     int min=0;
//     for(int i=0;i<ch.length;i++)
//     { //  
//    	count=1;
//    	 for(int j=i+1;i<ch.length;j++) // //['a', 'b' ,'b' , 'a', 'b' ,'a']
//    	 {
//    		
//    		 if(ch[i]!=ch[j])
//    		 {
//    		max++;
//    		max=min;;
//    		
//    		}
//    		 else
//    		 {
//    			 count++;
//    		 }
//    		
//    		 if(max==0)
//        	 {
//        		 System.out.println(ch[j]);
//        		 
//        	 }
//    		 break;	 
//    		 
//    	 }
//    	 
//    	 break;	 
//     }
 
     //most duplicate occurances
//     char[] ch = str.toCharArray(); 
//     for(int i=0;i<ch.length;i++) // [a,b,b,a,b,a]
//    {   int count =1 ;
//         if(ch[i]!='0')
//         {
//    	 for(int j=i+1;j<ch.length;j++) //[b]
//    	 {
//    		 if(ch[i]==ch[j])
//    		 {
//    			 count++;
//    			 ch[j]= '0';
//    		 }
//    	 }
//    	 if(count>1)
//    	 {
//    		 System.out.println(ch[i] +" " +count);
//    	 }
//     }
//    }
//    
}
}
