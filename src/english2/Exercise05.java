package english2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a weight and height variable
		double weight;
		double height;
		double BMI;
		
		//The console asks you to enter weight
		System.out.println("Indicate a weight(kg): ");
		weight = sc.nextDouble();
		
		//The console asks you to enter height
		System.out.println("Indicate a height(m): ");
		height = sc.nextDouble();		
		
		//Calculate the Body Mass Index
		BMI = weight / (height * height) ;		
		
		//The console show the Body Mass Index
		System.out.println("The Body Mass Index is " + BMI);
		
		//Close the scanner
		sc.close();		
		
	}

}
