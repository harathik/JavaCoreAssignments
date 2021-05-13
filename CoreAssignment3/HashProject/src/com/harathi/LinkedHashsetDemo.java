package com.harathi;

import java.util.Iterator;  
import java.util.LinkedHashSet;  
  
public class LinkedHashsetDemo {   
	
     public static void main(String args[]){ 
    	 
            LinkedHashSet<String> lh=new LinkedHashSet(); // Implementing HashSet     
                   lh.add("Harathi");    // Adding elements  
                   lh.add("Bharathi");      
                   lh.add("Capgemini");
                   lh.add("paris");
                   lh.add("America");    
                   lh.add("shitzu");  
                   lh.add("Saibaba");
                   
                   Iterator<String> i=lh.iterator(); // Traversing objects    
                   
                   while(i.hasNext()) // Return true if the Scanner has another token input    
                   {    
                   System.out.println(i.next());// printing elements     
                   }    
     }    
    }   
