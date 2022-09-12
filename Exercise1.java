  //Write a Java program to insert elements into the arraylist at the first and last positions respectively.
import java.util.ArrayList;
import java.util.Iterator;
class Exercise1 {
  public static void main(String[] args){
    ArrayList<String> obj=new ArrayList<String>();
    obj.add("krishna");
    obj.add("nitesh");
    obj.add("coming from tenali");
    obj.add("how are you");
    obj.add(0,"welcome");
    obj.add(4,"okay..");
    Iterator itr=obj.iterator();
    while(itr.hasNext()){
      String s=(String)itr.next();
       System.out.println(s);
    } 
  }
}