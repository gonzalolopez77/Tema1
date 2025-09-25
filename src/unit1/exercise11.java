package unit1;

import java.util.Scanner;

public class exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
						
		//Crea la variable pesetas
		int pesetas;
				
		//Crea la variable euros		
		float euros;
		
		//Crea la variable conversion
		final float conversion = 166;
		
		//La consola imprime que indiques un numero de pesetas
		System.out.println("Introduce un numero de pesetas:");
							
		//La consola espera que indiques un numero de pesetas
		pesetas = sc.nextInt();
		
		//Dividimos nuestras pesetas entre el factor de conversion
		euros = pesetas / conversion;
						
		//La consola imprime tu numero de euros
		System.out.println("Son" + euros + ("€"));
						
		//Close the scanner
		sc.close();		
	}

}
