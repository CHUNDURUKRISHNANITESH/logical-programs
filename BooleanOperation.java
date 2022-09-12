//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.Scanner;
public class BooleanOperation {

//Define main method

//Declare a variable and initialize it as true or false 

//Print the Result using not operator 
   public static void main(String args[]){
     boolean value;
     System.out.println("Enter value:");
     Scanner sc=new Scanner(System.in);
     value=sc.nextBoolean();
     System.out.println("output is: "+!value);
     
   }
}