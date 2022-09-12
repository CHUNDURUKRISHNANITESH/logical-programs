/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
class NumberFormatException1 {

    public static void main(String args[]) {
      NumberFormatException1 nf=new NumberFormatException1();
       nf.test();
      }
  void test(){
    String a,b;
    Scanner s=new Scanner(System.in);
    a=s.next();
    b=s.next();
    try{
      int x=Integer.parseInt(a);
      int y=Integer.parseInt(b);
      System.out.println(x+y);
    }
    catch(NumberFormatException e){
        System.out.println(e);
    }
  }
}
//NumberFormatException occurred in this program because when we give float values to string type variables and tried to convert them into integers.