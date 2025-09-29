package parte1;

import java.util.Scanner;

public class exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		//Crea la variable nombre
		String nombre;
		
		//Crea la variable edad
		String edad;
		
		//Imprime por pantalla que introduzcas tu nombre
		System.out.println("Introduce tu nombre");
		
		//La consola espera a que introduzcas tu nombre
		nombre = sc.nextLine();
		
		//Imprime por pantalla que introduzcas tu edad
		System.out.println("Introduce tu edad");
		
		//La consola espera a que introduzcas tu edad
		edad = sc.nextLine();
		
		//Imprime por pantalla el mensaje que dice tu nombre y tu edad
		System.out.println("Hola "+ nombre + ",tienes " + edad + " años, ¡que mayor eres!");
				
		//Close the scanner
		sc.close();
	}

}
