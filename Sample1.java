// Complete and execute java Program for checking the number of digits in a number
import java.util.*;
class Sample1 {

	public static void main(String args[]) {
		int num =88971;// you can also change the value to test the output
		int l=(num+"").length();
		if(l==2) {
	  		System.out.println("Its a two digit number");
		}
		else if(l==3) {
	  		System.out.println("Its a three digit number");
		}
		else if(l==4) {
	  		System.out.println("Its a four digit number");
		}
		else if(l==5) {
	  		System.out.println("Its a five digit number");			
		}
		else {
	  		System.out.println("number is not between 1 & 99999");			
		}
   	}
}
