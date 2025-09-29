package parte1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a radio variable
		double radio;
		
		//Create a length variable
		double length;
		
		//Create a area variable
		double area;
		
		System.out.println("Introduce el radio");
				
		//The console waits for us to enter a radio
		radio = sc.nextInt();
		
		//Length is calculated
		length = (2 * Math.PI) * (radio);
		
		area = (Math.PI	* Math.pow(radio, 2));

		//The console prints length
		System.out.println("Length is:" + length);
		
		//The console prints area
		System.out.println("Area is:" + area);
		
		//Close the scanner
		sc.close();

	}

}
