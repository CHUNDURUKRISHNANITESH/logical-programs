/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;
import java.util.*;
public class ArraySum {
  public static void main(String args[]){

//Define the main method

//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result
    int sum=0,i;
    Scanner s=new Scanner(System.in);
    //size=s.nextInt();
    int ele[]=new int[10];
    System.out.println("Enter 10 elements");
    for(i=0;i<10;i++)
      {
        ele[i]=s.nextInt();
      }
    System.out.println("sum of array elements is :");
    for(i=0;i<10;i++){
      sum=sum+ele[i];
    }
    System.out.println(sum);
}
}