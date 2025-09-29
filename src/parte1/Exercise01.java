package parte1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a number variable
		int number;
		
		//The console waits for us to enter a number
		number = sc.nextInt();
		
		//The console prints the enter number
		System.out.println("The enter number is:" + number);
		
		//Close the scanner
		sc.close();
	}

}
