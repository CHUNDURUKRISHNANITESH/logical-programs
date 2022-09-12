/* Write a program to find number of days in a month
Test Data: 
month number=2
year=2020
Expected Output: February 2020 has 29 days
*/
import java.util.Scanner;
class Exercise2 {

	public static void main(String args[]) {
    int month,year;
    Scanner s=new Scanner(System.in);
    month=s.nextInt();
    year=2020;
    switch(month)
      {
      case 1:
        System.out.println("January " + year + " has 30 days");
          break;
      case 2:
        System.out.println("February " + year + " has 29 days");
        break;
        case 3:
        System.out.println("March " + year +" has 31 days");
          break;
      case 4:
        System.out.println("April " + year +" has 30 days");
          break;
      case 5:
        System.out.println("May " + year +" has 31 days");
          break;
      case 6:
        System.out.println("June " + year + " has 30 days");
          break;
      case 7:
        System.out.println("July " + year + " has 31 days");
          break;
      case 8:
        System.out.println("August " + year + " has 30 days");
          break;
      case 9:
        System.out.println("September " + year + " has 31 days");
          break;
      case 10:
        System.out.println("October " + year + " has 30 days");
          break;
      case 11:
        System.out.println("November " + year + " has 31 days");
          break;
      case 12:
        System.out.println("December " + year + " has 31 days");
          break;
      default:
        System.out.println("invalid input");
      
    }
	}

}