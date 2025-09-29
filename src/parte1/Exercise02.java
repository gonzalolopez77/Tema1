package parte1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Create a scanner
		Scanner sc = new Scanner(System.in);
				
		//Create a age variable
		int age;
				
		//The console waits for us to enter a age
		age = sc.nextInt();
		
		//One year is added
		age += 1;
				
		//The console prints your age next year
		System.out.println("Your age for the next year is:" + age);
				
		//Close the scanner
		sc.close();

	}

}
