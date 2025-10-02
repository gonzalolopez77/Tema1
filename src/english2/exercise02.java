package english2;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a age and year variable
		int age;
		int year;
		
		//The console asks you to enter age
		System.out.println("Indicate your age: ");
		age = sc.nextInt();
		
		//Calculate the year of birth
		year = 2025 - age;
		
		//The console show your year of birth
		System.out.println("Your year of birth is " + year);
		
		//Close the scanner
		sc.close();				
		
	}

}
