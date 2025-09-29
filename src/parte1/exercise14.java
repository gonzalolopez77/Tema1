package parte1;

import java.util.Scanner;

public class exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable nota1
		float nota1;		
		
		//Crea la variable nota2
		float nota2;	
		
		//Crea la variable nota3
		float nota3;		
		
		//Crea la variable notaEntera
		int notaEntera;	
					
		
		//Crea la variable notaDecimal
		float notaDecimal;			
		
		//La consola imprime que indiques tu nota del primer trimestre
		System.out.println("Nota del primer trimestre");
							
		//La consola espera que indiques tu nota
		nota1 = sc.nextFloat();	
		
		//La consola imprime que indiques tu nota del segundo trimestre
		System.out.println("Nota del segundo trimestre");
							
		//La consola espera que indiques tu nota
		nota2 = sc.nextFloat();		
		
		//La consola imprime que indiques tu nota del tercer trimestre
		System.out.println("Nota del tercer trimestre");
							
		//La consola espera que indiques tu nota
		nota3 = sc.nextFloat();		
		
		//Calculamos la nota entera
		notaEntera =(int) ((nota1) + (nota2) + (nota3)) /3;
		
		//La consola imprime tu nota entera
		System.out.println("Nota entera: "+ notaEntera);
		
		//Calculamos la nota entera
		notaDecimal =(float) ((nota1) + (nota2) + (nota3)) /3;
		
		//La consola imprime tu nota decimal
		System.out.println("Nota entera: "+ notaDecimal);
		
		//Close the scanner
		sc.close();			
	}

}
