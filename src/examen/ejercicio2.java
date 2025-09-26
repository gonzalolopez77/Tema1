package examen;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable porcentaje1
		final int porcentaje1 = 10;	
		
		//Crea la variable porcentaje2
		final int porcentaje2 = 15;			
		
		//Crea la variable horas
		int horas;	
		
		//Crea la variable sueldo
		double sueldo;	
		
		//Crea la variable sueldoDescontado
		double sueldoDescontado;
		
		//La consola imprime que indiques cuantas horas trabajas
		System.out.println("Horas: ");
							
		//La consola espera que indiques cuantas horas trabajas
		horas = sc.nextInt();	
		
		//La consola imptime que indiques tu sueldo por hora
		System.out.println("Sueldo por hora: ");
		
		//La consola espera que indiques tu sueldo por hora
		sueldo = sc.nextDouble();			
		
		//Calculamos tu sueldo semanal 
		sueldo = (sueldo) * (horas);
		
		//Calculamos tu sueldo con impuestos
		 sueldoDescontado = sueldo<1000 ? (sueldo * porcentaje1) /100 - sueldo: (sueldo * porcentaje2) /100 - sueldo ;
		
		//La consola imprime el sueldo con impuestos
		System.out.println("Sueldo con impuestos: " + sueldoDescontado);
				
		//Close the scanner
		sc.close();		
	}

}
