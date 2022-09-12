/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args){

//main method

//declare varible

//take input from user

/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/
    
    int i,j;
    Scanner s=new Scanner(System.in);
    String s1=s.next();
    char arr[]=s1.toCharArray();
    int a=arr.length/2;
    System.out.println(a);
    char first_half[]=new char[a+1];
    char second_half[]=new char[a+1];
    for(i=0;i<=arr.length/2;i++){
       first_half[i] = arr[i];
    System.out.println(first_half[i]);
    }
    for(i=0;i<=arr.length/2;i++){
          j=(arr.length/2)+i;
          second_half[i]=arr[j];
    }
    String f=new String(first_half);
    String g=new String(second_half);
    StringBuffer k=new StringBuffer(g);
    StringBuffer l=new StringBuffer(f);
    k.reverse();
    String z=k.toString();
    boolean value=z.equals(f);
    if(value)
      System.out.println("palindrome");
    else
      System.out.println("not palindrome");   
}
}