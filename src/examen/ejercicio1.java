package examen;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable nota1
		int num1;		
		
		//Crea la variable nota2
		int num2;	
		
		//Crea la variable nota3
		int num3;		
		
		//Crea la variable notaEntera
		double notaMedia;			
		
		//La consola imprime que indiques un numero entero
		System.out.println("Un numero entero: ");
							
		//La consola espera que indiques un numero entero
		num1 = sc.nextInt();	
		
		//La consola imprime que indiques otro numero entero
		System.out.println("Otro numero entero: ");
							
		//La consola espera que indiques otro numero entero
		num2 = sc.nextInt();	
		
		//La consola imprime que indiques otro numero entero
		System.out.println("Y otro numero entero: ");
							
		//La consola espera que indiques otro numero entero
		num3 = sc.nextInt();	
		
		//Calculamos la nota media
		notaMedia =(double) ((num1) + (num2) + (num3)) /3;
		
		//La consola imprime tu nota decimal
		System.out.println("Nota media: "+ notaMedia);
		
		//Close the scanner
		sc.close();		
	}

}
