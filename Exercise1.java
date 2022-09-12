//Write a Java program to convert a List/ArrayList(with duplicate elements) into HashSet containing no duplicates.
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
class Exercise1 {
  public static void main(String[] args){
    ArrayList<String> a=new ArrayList<String>();
    a.add("zebra");
    a.add("tiger");
    a.add("lion");
    a.add("elephant");
    a.add("horse");
    a.add("zebra");
    a.add("lion");
    System.out.println("ArrayList with duplicates: \n"+a);
    Iterator i=a.iterator();
    HashSet<String> h=new HashSet<String>();
    while(i.hasNext()){
      String s=(String)i.next();
      h.add(s);
     }
    System.out.println("\n HashSet without duplicates: \n"+h);
  }
}
