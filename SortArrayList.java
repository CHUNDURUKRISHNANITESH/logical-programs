/*  JFM1T12_Assignment2:

    Write a program to sort a given arraylist of integers in ascending order.   
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    467
    Enter Number 1
    342
    Enter Number 2
    167
    Enter Number 3
    511
    Enter Number 4
    204
    
    Expected Output:
    ArrayList After Sorting:
    167
    204
    342
    467
    511

*/     

import java.util.*;  

public class SortArrayList  {  

//main method
  public static void main(String[] args){

//declare variables
    int n,i;

//create Scanner object
    Scanner s=new Scanner(System.in);
    System.out.println("Enter how many numbers you want:");
    n=s.nextInt();
    int ar[]=new int[n];
 
//take input from user
    for(i=0;i<ar.length;i++){
      System.out.println("Enter Number "+i);
      ar[i]=s.nextInt();
    }

//create an object of ArrayList class
    ArrayList<Integer> al=new ArrayList<Integer>();
    for(i=0;i<ar.length;i++)
      al.add(ar[i]);

//sort ArrayList in ascending oeder
    Collections.sort(al);

//print Array list
    System.out.println("ArayList After Sorting:");
    for(Integer i1:al)
      System.out.println(i1);
}
}