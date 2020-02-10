package Java_Basics;

import java.util.*;
public class Duplicate {

	public static void main(String args[]) 
	{  
        List<String> Li = new ArrayList<String>();  
        Li.add("apple");  
        Li.add("mango");  
        Li.add("banana");  
        Li.add("grapes");
        Li.add("grapes");
       
        for(String l4 :Li)
        	{ 
        		System.out.println(l4.toString()); // Here .to string() returns the value in the same Sequence
        	}
        
        
        Set<String> S1 = new HashSet<String>(Li);  // Hash set only contains unique elements 
        System.out.println("After removing copies we get:"+S1);  
	}
}