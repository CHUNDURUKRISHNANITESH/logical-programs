// Complete this java program to iterate a linked list in reverse order.

//import java.util.LinkedList;
//import java.util.Iterator;
import java.util.*;
  public class Sample3 {

    public static void main(String[] args) {
    
     LinkedList<String> l_list = new LinkedList<String>();
     // Use add() method to add values in the linked list
      l_list.add("pen");
      l_list.add("pencil");
      l_list.add("book");
      l_list.add("eraser");
      l_list.add("scale");
      ListIterator i=l_list.listIterator();
    
      // Print original list
      System.out.println("original list: ");
        while(i.hasNext())
          System.out.println(i.next());
     System.out.println();
      // Print list elements in reverse order
      System.out.println("list elements in reverse order:");  
      while(i.hasPrevious())
          System.out.println(i.previous());
    }
   }
  
