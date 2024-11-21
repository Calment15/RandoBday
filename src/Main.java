import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		String r = "";
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", };
		
		while(true) {
			
		System.out.println("Type in any key to randomize a birth day");
		r = sc.next();
		int m1 = rnd.nextInt(12);
		
		//these are all the months that end in 31 days
		if (m1 == 0 || m1 == 2 || m1 == 4|| m1 == 7|| m1 == 6|| m1 == 9|| m1 == 11) {

			//this randomizes from the year 1924, and 100 years after that 
			int year = rnd.nextInt(100)+1924;
			
			//this randomizes from 31 days, and starts on the first
			int day = rnd.nextInt(31)+1;
			System.out.println("Happy birthday to those born on " + months[m1] + " " + day + "," + " " + year + "!");
			
																					}
		//these months end in 30 days
		if (m1 == 3 || m1 == 5 || m1 == 8 || m1 == 10) {
			int year = rnd.nextInt(100)+1924;
			int day = rnd.nextInt(30)+1;
			System.out.println("Happy birthday to those born on " + months[m1] + " " + day + "," + " " + year + "!");
													   }
		//the only month that ends in 28 or 29
		if (m1 == 1) {
			int year = rnd.nextInt(100)+1924;
			//this calculates if the year is divisible by four, if so, it add an extra day
			int endswithZero = year % 4;
			if (endswithZero == 0) {
				int day = rnd.nextInt(29)+1;
				System.out.println("Happy birthday to those born on " + months[m1] + " " + day + "," + " " + year + "!");
					 }
		else	 {				
				int day = rnd.nextInt(28)+1;
				System.out.println("Happy birthday to those born on " + months[m1] + " " + day + "," + " " + year + "!");
				 }
					}
					}
	}
}