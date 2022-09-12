/*Write a program to remove and return the first element of a linkedlist.

Sample Output:
Original linked  list: [Red, Green, Black, White, Pink]                
Removed element: Red                                                   
Linked list after pop operation: [Green, Black, White, Pink]

*/
import java.util.*;
class Exercise3 {
  public static void main(String args[]){
    LinkedList <String> arr=new LinkedList <String>();
    arr.add("Red");
    arr.add("Green");
    arr.add("Black");
    arr.add("White");
    arr.add("Pink");
    System.out.println("Original linked list: "+arr);
    System.out.println();
    System.out.println("Removed element: "+arr.removeFirst());
    System.out.println();
    System.out.println("Linked list after pop operation: "+arr);
    System.out.println();  
  }
}