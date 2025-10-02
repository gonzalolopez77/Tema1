package english2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a price and tax variable
		double price;
		double tax;
		
		//The console asks you to enter price
		System.out.println("Indicate a price: ");
		price = sc.nextInt();
		
		//The console asks you to enter tax
		System.out.println("Indicate a tax: ");
		tax = sc.nextInt();
		
		//Calculate the price with tax
		price = price * (1 + tax / 100);
		
		//The console show the price with tax
		System.out.println("The price with tax is " + price);
		
		//Close the scanner
		sc.close();			
		
	}

}
