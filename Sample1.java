// Complete and execute java Program for Narrow/Explicit Type-casting

class Sample1 {
	public static void main(String args[])
	{
		// Initialize a variable to store your marks of Computer Science subject- out of 50
		
		// Calculate the percentage of marks and store it in a float variable
		
		// Cast the percentage to int(whole number, decimal points removed)
		
		// Print the casted percentage
    int marks=40;
    int total=50;
    float percent=(marks*100/total);
    int val=(int)percent;
		System.out.println("Percentage of marks in CS = "+val );
	}

}
