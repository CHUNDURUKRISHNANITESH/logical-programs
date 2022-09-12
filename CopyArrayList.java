/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:  
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/

import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList  {
  
//main method
  public static void main(String args[]){

//declare variables
    int n,i;

//create Scanner object
    Scanner s=new Scanner(System.in);
    System.out.println("Enter how many numbers you want:");
    n=s.nextInt();
    int a[]=new int[n];

//take input from user
    for(i=0;i<a.length;i++){
      System.out.println("Enter Number "+i);
      a[i]=s.nextInt();
    }

// Assign the first reference to second
    ArrayList<Integer> arr1=new ArrayList<Integer>();
    for(i=0;i<a.length;i++)
      arr1.add(a[i]);
    ArrayList<Integer> arr2=new ArrayList<Integer>(arr1);
    Iterator itr=arr2.iterator();

// Iterat over second ArrayList and print
    System.out.println("-----Iterating over the second ArrayList----");
    while(itr.hasNext())
      System.out.println(itr.next());
}
}