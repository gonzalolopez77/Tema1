package parte1;

import java.util.Scanner;

public class exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable iva
		final int IVA = 21;
		
		//Crea la variable precio
		double precio;
		
		//Crea la variable precioIva
		double precioIVA;		
		
		//La consola imprime que indiques un precio
		System.out.println("Precio: ");
							
		//La consola espera que indiques un precio
		precio = sc.nextDouble();	
		
		//Calculamos el precio con el IVA
		precioIVA = (IVA * precio) / 100;
		precioIVA += precio; 
		
		//La consola imprime el precio con IVA
		System.out.println("Precio con IVA: " + precioIVA);
				
		//Close the scanner
		sc.close();			
	}

}
