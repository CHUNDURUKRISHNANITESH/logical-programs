/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;
import java.util.*;
public class Temperature{
  public static void main(String[] args){

//Define the main method

//Declare the variables and initialize

//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result
    int i,j,days;
    float lowest;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number of days");
    days=s.nextInt();
    float val[]=new float[days];
    for(i=0;i<days;i++){
      for(j=0;j<1;j++){
      System.out.println("Enter the temperature of Day : "+ (i+1));
      val[j+i]=s.nextFloat();
    }
    }
    lowest=val[0];
    for(i=0;i<days;i++){
      if(val[i]<lowest){
        lowest=val[i];
      }
    }
    for(i=0;i<days;i++){
    if(val[i]==lowest)
      System.out.println("The lowest temperature of the week "+(i+1)+" is "+ lowest+" celsius");
    }
}
}