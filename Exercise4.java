//Write a program to create a vector collection with initial capacity of 5 and add more than 5 elements into it. At last print both size and capacity.
import java.util.*;
class Exercise4 {
  public static void main(String[] args){
    Vector<String> v=new Vector<String>(5);
    v.add("apple");
    v.add("banana");
    v.add("guava");
    v.add("grapes");
    v.add("pineapple");
    v.add("orange");
    System.out.println("Array size: "+v.size());
    System.out.println("Array capacity: "+v.capacity());
  }
}