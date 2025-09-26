package examen;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable horas
		int horas;	
		
		//Crea la variable sueldo
		double sueldo;			
		
		//La consola imprime que indiques cuantas horas trabajas
		System.out.println("Horas: ");
							
		//La consola espera que indiques cuantas horas trabajas
		horas = sc.nextInt();	
		
		//La consola imptime que indiques tu sueldo por hora
		System.out.println("Sueldo por hora: ");
		
		//La consola espera que indiques tu sueldo por hora
		sueldo = sc.nextDouble();			
		
		//Calculamos el precio con el IVA
		precioIVA = (IVA * precio) / 100;
		precioIVA += precio; 
		
		//La consola imprime el precio con IVA
		System.out.println("Precio con IVA: " + precioIVA);
				
		//Close the scanner
		sc.close();		
	}

}
