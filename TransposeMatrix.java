/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String[] args){
    
//Define the main method

//Declare the variables

//Take input from user to enter rows and column values

//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j
    int row,col,i,j;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number of rows");
    row=s.nextInt();
    System.out.println("Enter number columns");
    col=s.nextInt();
    int a[][]=new int[row][col];
    System.out.println("Enter elements");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        System.out.print("Elements ["+i+","+j+"] : ");
        a[i][j]=s.nextInt();
      }
    }
    System.out.println("Ater Transpose Matrix");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        System.out.print(a[j][i]+ "  ");
    }
      System.out.println("");
    }
}
}