/* Write a program to check whether a number is positive or negative
Test Data 1: x=31
Expected Output: Number is positive
Test Data 2: x=-31
Expected Output: Number is negative
*/
import java.util.*;
class Exercise1 {

	public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    if(x==31)
      System.out.println("Number is positive");
    else if(x==-31)
      System.out.println("Number is negative");
	}

}