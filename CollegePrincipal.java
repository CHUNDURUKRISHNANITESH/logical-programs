/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class

//Add MathTeacher class

//Add EnglishTeacher class

//Add MusicTeacher class

class Teachers
  {
    String Collegename;
    String designation;
    public void work()
    {
      System.out.println("IIT");
    }
  }
class MathTeacher extends Teachers
  {
    void display(){
    System.out.print("Math Teacher       ");
    }
  }
class EnglishTeacher extends Teachers
  {
      void display(){
    System.out.print("English Teacher    ");
      }
  }
class MusicTeacher extends Teachers
  {
     void display(){
    System.out.print("Music Teacher      ");
     }
  }
class CollegePrincipal {
  public static void main(String[] args){

//Add the main method here and create all different types of Teacher objects and print there college name designation.
      MathTeacher ob1=new MathTeacher();
      EnglishTeacher ob2=new EnglishTeacher();
      MusicTeacher ob3=new MusicTeacher();
      ob1.display();
      ob1.work();
      ob2.display();
      ob2.work();
      ob3.display();
      ob3.work();
  }
}