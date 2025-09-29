package parte1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Create a scanner
		Scanner sc = new Scanner(System.in);
				
		//Create a year variable
		int year;
		
		//Create a actualYear variable
		int actualYear;
		
		//Create a age variable
		int age;
				
		//The console waits for us to enter a year
		year = sc.nextInt();
		
		//The console waits for us to enter a actual year
		actualYear = sc.nextInt();
		
		//Your age is calculated
		age = (actualYear) - (year);
				
		//The console prints your age
		System.out.println("Your age is:" + age);
				
		//Close the scanner
		sc.close();

	}

}
