/*  JFM1T12_Assignment1:

    Write a program to search an element in an arraylist.  
    Prompt the user input from the terminal.
    
    Sample Input 1:
    Enter how many Elements you want: 
    5
    Enter Elements: 
    Red
    Green
    Orange
    White
    Black
    
    Enter Search Element: 
    Red
    
    Expected Output:
    Red Element is present

    Sample Input 2: 
    Enter Search Element: 
    yellow
    
    Expected Output:
    yellow Element is not present

*/

import java.util.Scanner;
import java.util.ArrayList; 

class SearchingElement {

//main method
  public static void main(String[] args){

//declare variables
    int n,i;

//create scanner object
    Scanner s=new Scanner(System.in);
    
//take input from user
    System.out.println("Enter how many Elements you want:");
    n=s.nextInt();
    String st[]=new String[n];
    System.out.println("Enter Elements:");
    for(i=0;i<n;i++)
      st[i]=s.next();

//creat an object of LinkedHashSet class 
    ArrayList<String> l=new ArrayList<String>();
    for(i=0;i<n;i++)
      l.add(st[i]);

//check if the search element is present on the list using contains method
    System.out.println("Enter Search Element:");
    String s1=s.next();
     
//If element found then print element is present else then print element not present
    if(l.contains(s1))
      System.out.println(s1+" Element is present");
    else
      System.out.println(s1+" Element is not present");
}
}