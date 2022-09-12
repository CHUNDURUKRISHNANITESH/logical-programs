// Complete this java program demonstrating Vector class.

import java.util.*;  
public class Sample4 {  
   public static void main(String args[]) {  
       //Create an empty vector with initial capacity 4  
       Vector<String> vec = new Vector<String>(4);  
       //Adding elements to a vector  
       vec.add("Vijaywada");  
       vec.add("Chennai");  
       vec.add("Bengaluru");  
       vec.add("Ooty");  
       //Print size and capacity 
     System.out.println("size is: "+vec.size());
     System.out.println("capacity is: "+vec.capacity());
      
       //Display Vector elements  
     System.out.println(vec);
         
       vec.addElement("Vellore");  
       vec.addElement("Coimbatore");  
       vec.addElement("Pondicherry");  
       //Again check size and capacity after new insertions  
       System.out.println("size is: "+vec.size());
       System.out.println("capacity is: "+vec.capacity());    
       
       //Display Vector elements again  
          System.out.println(vec);
     
       //Check if Coimbatore is present or not in this vector  
     Iterator itr=vec.iterator();
     while(itr.hasNext())
        if(itr.next().equals("Coimbatore"))
             System.out.println("Coimbatore is present in this vector");
       
       //Get the first element
     //vec.get(0);
    System.out.println("first element: "+vec.firstElement()); 
       //Get the last element  
    System.out.println("last element: "+vec.lastElement());
   }  
}  