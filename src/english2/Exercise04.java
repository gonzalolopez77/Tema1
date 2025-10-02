package english2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a kilos variable
		double kilos;
		double pounds;
		
		//The console asks you to enter a pounds
		System.out.println("Indicate a pounds: ");
		pounds = sc.nextInt();
		
		//Calculate the kilos
		kilos = pounds / 2.2 ;	
		
		//The console show the pounds to kilos
		System.out.println("The pounds to kilos is " + kilos + "kg");
		
		//Close the scanner
		sc.close();			
		
	}

}
