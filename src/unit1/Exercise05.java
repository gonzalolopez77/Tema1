package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a radio variable
		double radio;
		
		//Create a longitud variable
		double longitud;
				
		//The console waits for us to enter a radio
		radio = sc.nextInt();
		
		//Longitud is calculated
		longitud = (3.14 * 2) + (radio);

		//The console prints longitud
		System.out.println("Longitud is:" + longitud);
		
		//Close the scanner
		sc.close();

	}

}
