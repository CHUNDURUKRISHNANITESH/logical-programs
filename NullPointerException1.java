/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
public class NullPointerException1 {

    public static void main(String args[]) {
      try{
        Student nl=new Student();
        nl.getter(null,70,"chennai");
        nl.setter();
    }
      catch(Exception e){
        System.out.println(e);
      }
}
}
 class Student{
  String name;
  String city;
  int marks;
  void getter(String n,int m,String c)
  {
    name=n;
    city=c;
    marks=m;
  }
  void setter(){
    System.out.println("name:"+name.length());
    System.out.println("marks:"+marks);
    System.out.println("city:"+city);
  }
}
//NullPointerException occurs in this program because we are trying to find the length of string variable which is assigned with null value.

