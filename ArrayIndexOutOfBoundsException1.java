/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
import java.io.*;
public class ArrayIndexOutOfBoundsException1 {

    public static void main(String args[]) {
      try{
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<a.length;i++)
          a[i]=s.nextInt();
        System.out.println("Elements are");
        for(i=0;i<=a.length;i++)
          System.out.println(a[i]);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}
//ArrayIndexOutOfBoundsException occur in this program when for loop iterates to print all elements on console because the size of array is n but for loop iterates n+1 times in this program. 

