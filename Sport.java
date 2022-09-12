/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      

class  Sports { 

// Create a member variable for Sport name 

// Set member variable for Sport name 
  String Sport_name;
  void display(String Sport_name)
    {
    this.Sport_name=Sport_name;
      System.out.println("Sport name: "+Sport_name);
    }
}
/*class Main{
  void display(String Sport_name){
    this.Sport_name=Sport_name;
  }
}*/

class Sport{
public static void main(String args[]) { 

// Create object for Sport class 

// Print the value of Sport name using "this" reference
 Sports obj=new Sports();
  obj.display("Football");
} 
}

 