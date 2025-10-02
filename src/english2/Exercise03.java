package english2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a length, height, area and perimeter variable
		int length;
		int height;
		int area;
		int perimeter;
		
		//The console asks you to enter length
		System.out.println("Indicate a length: ");
		length = sc.nextInt();
		
		//The console asks you to enter height
		System.out.println("Indicate a height: ");
		height = sc.nextInt();		
		
		//Calculate the area
		area = length * height ;
		
		//Calculate the perimeter
		perimeter = (length * 2) * (height * 2) ;		
		
		//The console show the area and perimeter
		System.out.println("The area is " + area);
		System.out.println("The perimeter is " + perimeter);
		
		//Close the scanner
		sc.close();			
		
	}

}
