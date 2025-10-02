package english2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a weight and height variable
		int students;
		int group;
		int withoutTeam;
		int teams;
		
		//The console asks you to enter a number of students
		System.out.println("Indicate a number of students: ");
		students = sc.nextInt();
		
		//The console asks you to enter a number of groups
		System.out.println("Indicate a number of groups: ");
		group = sc.nextInt();		
		
		//Calculate the teams
		teams = students / group ;		
		
		//Calculate the students without a group
		withoutTeam = students % group; 
		
		//The console show the teams and the students without a team
		System.out.println("The number of teams is " + teams);
		System.out.println("The number of students without a team " + withoutTeam);
		
		//Close the scanner
		sc.close();			
		
	}

}
