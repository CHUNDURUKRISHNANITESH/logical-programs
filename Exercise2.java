/*Write a Java program to extract a portion of an arraylist.

Sample Output:
Original list: [Red, Green, Orange, White, Black]                      
List of first three elements: [Red, Green, Orange]

*/

import java.util.*;
class Exercise2 {
  public static void main(String args[]){
    ArrayList<String> ob=new ArrayList<String>();
    ob.add("Red");
    ob.add("Green");
    ob.add("Orange");
    ob.add("White");
    ob.add("Black");
    System.out.print("Original list: ");
    System.out.println(ob);
    System.out.print("List of first three elements: [");
    int i=0;
    for(String s:ob){
      System.out.print(s);
      i++;
      if(i==3){
        System.out.print("]");
        break;
      }
      System.out.print(", ");     
    }
  }
}