/* 3. Write a program to create HashMap object and Random class object. Add random values as a key in 
   HashMap and some string as a value of HashMap. To get OutOfMemoryError add values into HashMap without termination condition.
*/

import java.util.*;
public class OutOfMemoryError_Sample {
    
    public static void main(String args[]) {
    // create object for HashMap and Random classes
      HashMap hm=new HashMap();
      Random r=new Random();
        while (true) 
            // add values into HashMap
          hm.put(r.nextInt(),"nitesh");
    }
}
