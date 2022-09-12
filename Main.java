/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/
import java.util.*;
class Teacher {
    String designation="ComputerTeacher";
    String collegename="IIT";
    void work(){
      System.out.print("Designation");
      System.out.println("          CollegeName");
      System.out.print(designation);
      System.out.println("          "+collegename);
    }
}
class ComputerTeacher extends Teacher
  {
  
    
  }
class Main
   {
      public static void main(String[] args){
        ComputerTeacher obj=new ComputerTeacher();
         obj.work();
   }
 }


