package parte1;

import java.util.Scanner;

public class exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
				
		//Crea la variable edad
		int edad;
		
		//Crea la variable mayor
		boolean mayor;
				
		//La consola imprime que indiques tu edad
		System.out.println("Introduce tu edad:");
					
		//La consola espera que indiques tu edad
		edad = sc.nextInt();
		
		//Hacemos que mayor sea true si edad es mayor o igual que 18
		mayor = edad>= 18;
				
		//La consola imprime
		System.out.println("Es mayor de edad  " + mayor);
				
		//Close the scanner
		sc.close();
	}

}
