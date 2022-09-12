import java.util.ArrayList;
import java.util.Iterator;
  public class Sample2 {

    public static void main(String[] args){
      ArrayList<Employee>  emp = new ArrayList<Employee>();
      Employee e1=new Employee(101,"rahul",10000);
      Employee e2=new Employee(102,"kalpana",50000);
      Employee e3=new Employee(103,"john",20000);
      emp.add(e1);
      emp.add(e2);
      emp.add(e3);
      Iterator itr=emp.iterator();
      while(itr.hasNext()){
        Employee e=(Employee)itr.next();
        System.out.println(e.id+" "+e.name+" "+e.sal);
        }
      
      // Create 3 Employee objects and store them in ArrayList
     // Iterate over the ArrayList to print each Employee's details
    }
  }

// Complete the class Employee
class Employee {
  int id,sal;
  String name;
  Employee(int i,String n,int s){
    this.id=i;
    this.name=n;
    this.sal=s;
  }
}

