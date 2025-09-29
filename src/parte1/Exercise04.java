package parte1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Create a scanner
		Scanner sc = new Scanner(System.in);
				
		//Create a note1 variable
		int note1;
		
		//Create a note2 variable
		int note2;
		
		//Create a note variable
		double note;
				
		//The console waits for us to enter a note1
		note1 = sc.nextInt();
		
		//The console waits for us to enter a note2
		note2 = sc.nextInt();
		
		//Your note is calculated
		note = (note1) + (note2);
		note = (note) / (2);
				
		//The console prints your note
		System.out.println("Your note is:" + note);
				
		//Close the scanner
		sc.close();
	}

}
