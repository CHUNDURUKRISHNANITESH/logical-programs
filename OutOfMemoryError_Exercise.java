/* 4. Write a program to add Random values into HashMap using infinite loop. To get OutOfMemoryError, 
   create HashMap class and use Random class to add random values into HashMap.
*/
import java.util.*;
public class OutOfMemoryError_Exercise {

    public static void main(String args[]) {
      HashMap hm=new HashMap();
      Random r=new Random();
      while(true)
         hm.put(r.nextInt(),r.nextInt());
    }
}