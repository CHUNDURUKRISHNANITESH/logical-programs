/* 5.Write a program to find factorial of a given number using recursive function. 
   Do not provide termination condition to get StackOverFlowError.
*/

public class StackOverFlowError_Exercise {

  public void factorial(int num)
  {
    int fact=1,n;
    n=num;
    while(true){
      fact=fact*n;
      n--;
      factorial(n);
    }
  }
  public static void main(String args[]) {
    new StackOverFlowError_Exercise().factorial(5);
    }
}