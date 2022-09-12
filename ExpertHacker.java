/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.Scanner;
class BankAccount { 
//declare account_number , account_balance
   int account_number;
   double account_balance;
  
//create getters and setters
  void getters(int a,double b){
    account_number=a;
    account_balance=b;
  }
  void setters(){
    System.out.println("BankAccount Number : "+account_number);
    System.out.println("Current Balance    : "+account_balance);
  } 
}  

class ExpertHacker { 

public static void main(String args[]) { 

//main method

//create Scanner object

//Take input from user

//Create an object of BankAccount class and set account_number and the account_balance

// Try accessing fields of BankAcccount class and check whether it's accessible 

// or not. If not then try accessing it with it’s setter and getter methods. 

// Print account_number and account_balance 
 
  Scanner s=new Scanner(System.in);
  System.out.print("Enter BankAccount Number : ");
  int x=s.nextInt();
  System.out.print("Enter current balance    : ");
  double y=s.nextDouble();
  BankAccount obj=new BankAccount();
  //obj.account_number=6789023;
  //obj.account_balance=67000.89;
  obj.getters(x,y);
  obj.setters();
}   
} 