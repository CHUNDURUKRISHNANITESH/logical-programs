/*   JFM1T12_Assignment5:

     Write a program to build any collection containing duplicates. Create its copy with all duplicates removed. 
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     4
     Enter Number 0
     4
     Enter Number 1
     3
     Enter Number 2
      3
     Enter Number 3
     4
     
     Expected Output:
     After removing duplicates: [4, 3]
*/     

import java.util.*; 
import java.util.ArrayList; 

class Duplicate  { 
  
//main method
  public static void main(String[] args){

//create Scanner object
    Scanner s=new Scanner(System.in);

//take input from user
    System.out.println("Enter how many numbers you want:");
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++){
      System.out.println("Enter Number "+i);
      a[i]=s.nextInt();
    }

//creat an object of LinkedHashSet class 
    LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
    for(int i=0;i<a.length;i++)
      h.add(a[i]);
//creat an object of ArrayList class and pass LinkedHashSet object
    ArrayList<Integer> al=new ArrayList<Integer>(h);

//Print result
    System.out.println(al);
  }
}