package unit1;

import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
						
		//Crea la variable pesetas
		double kgManzanas;
				
		//Crea la variable euros		
		double kgPeras;
		
		//Crea la variable conversion
		final double precioManzanas = 2.35;
		
		//Crea la variable conversion
		final double precioPeras = 1.95;	
		
		//Crea la variable conversion
		double precio1;
		
		//Crea la variable conversion
		double precio2;
		
		//La consola imprime que indiques un numero de pesetas
		System.out.println("Introduce cuantos kg de manzanas se han vendido:");
							
		//La consola espera que indiques un numero de pesetas
		kgManzanas = sc.nextInt();
		
		//La consola imprime que indiques un numero de pesetas
		System.out.println("Introduce cuantos kg de peras se han vendido:");
							
		//La consola espera que indiques un numero de pesetas
		kgPeras = sc.nextInt();
		
		//Dividimos nuestras pesetas entre el factor de conversion
		precio1 = kgManzanas * precioManzanas;
		precio2 = kgPeras * precioPeras;
		precio1 += precio2;
		
		//La consola imprime tu numero de euros
		System.out.println("Son" + precio1 + ("€"));
						
		//Close the scanner
		sc.close();			
	}

}
