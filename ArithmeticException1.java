/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException1 {

    public static void main(String args[]) { 
      //int x,y,result;
      ArithmeticException1 obj=new ArithmeticException1();
      obj.calculate(10,0);
      }
    void calculate(int a,int b){
      int x,y,result;
      try{
          x=a;
          y=b;
          result=x/y;
          System.out.println(result);
        }
      catch(ArithmeticException e){
        System.out.println(e);
      }
    }
}
//ArithmeticException occurred in this program because we performed division operation whose denominator value is 0.