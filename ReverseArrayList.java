/*  JFM1T12_Assignmwnt4:

    Write a Java program to reverse elements in an arraylist.
    Prompt the user input from the terminal.
     
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    995
    Enter Number 1
    367
    Enter Number 2
    511
    Enter Number 3
    789
    Enter Number 4
    111
    
    Expected Output:
    Elements after reversing:111 789 511 367 995  

 */

import java.util.*; 
import java.util.ArrayList; 

class ReverseArrayList  {  

//Take an arraylist as a parameter and returns a reversed arraylist 

//Arraylist for storing reversed elements

//Append the elements in reverse order 

//Return the reversed arraylist

//Iterate through all the elements and print

//main method

//creat an object of ReverseArrayList class 

//take input from user

//creat an object of ArrayList class

//call reverseArrayList method

//call printElement method
  public static void main(String args[]){
    int i;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter how many numbers you want:");
    int n=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++){
      System.out.println("Enter Number "+i);
      a[i]=s.nextInt();
    }
    ArrayList<Integer> arr1=new ArrayList<Integer>();
    for(i=0;i<a.length;i++)
      arr1.add(a[i]);
     Collections.reverse(arr1);
    Iterator itr=arr1.iterator();
    System.out.print("Elements after reversing:");
    while(itr.hasNext())
      System.out.print(itr.next()+" ");
     }
}