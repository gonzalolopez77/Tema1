package parte1;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
						
		//Crea la variable numero
		int numero;
				
		//Crea la variable par		
		boolean par;
						
		//La consola imprime que indiques un numero
		System.out.println("Introduce un numero:");
							
		//La consola espera que indiques un numero
		numero = sc.nextInt();
		
		//Hacemos que si el numero da 0 al dividirse entre dos es par
		par = numero %2 == 0;
						
		//La consola imprime si es par
		System.out.println("Es par  " + par);
						
		//Close the scanner
		sc.close();
	}

}
