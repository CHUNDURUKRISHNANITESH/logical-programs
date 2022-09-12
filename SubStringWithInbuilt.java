/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {
  public static void main(String[] args){

//main method

//declare variables

//take input from user

//check if the string contains substring or not if contains print found else print not found
    int i,j;
    boolean v=true;
    Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    String s2[]=s1.split(" ");
    System.out.println("Enter search string");
    String s3=s.next();
    for(i=0;i<s2.length;i++){
           v=s2[i].equals(s3);
           if(v==true)
                   break;
    }
    if(v)
       System.out.println(s3 + " is found");
    else
       System.out.println(s3 + " is not found");
  }
}