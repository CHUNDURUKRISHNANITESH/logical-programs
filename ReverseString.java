/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args){

//main method

//declare variables and take input from user

//creat stringbuffer object for string reversing

//reverse input string

//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result
    int i;
    Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    StringBuffer s2=new StringBuffer(s1);
    System.out.println("reversing entire string : "+s2.reverse());
    String s3[]=s1.split(" ");
    StringBuffer s4[]=new StringBuffer[s3.length];
    for(i=0;i<s3.length;i++)
         s4[i]=new StringBuffer(s3[i]);
    System.out.print("reversing each word at its place : ");
    for(i=0;i<s4.length;i++)
        System.out.print(s4[i].reverse()+ " ");
    
  }

}