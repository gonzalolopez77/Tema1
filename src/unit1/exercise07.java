package unit1;

import java.util.Scanner;

public class exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		//Crea la variable nombre
		String nombre;
		
		//Crea la variable direccion
		String direccion;
				
		//Crea la variable telefono
		String telefono;
		
		//Imprime por pantalla que introduzcas tu nombre
		System.out.println("Introduce tu nombre");
		
		//La consola espera a que introduzcas tu nombre
		nombre = sc.nextLine();
		
		//Imprime por pantalla que introduzcas tu direccion
		System.out.println("Introduce tu direccion");
				
		//La consola espera a que introduzcas tu direccion
		direccion = sc.nextLine();
				
		//Imprime por pantalla que introduzcas tu telefono
		System.out.println("Introduce tu telefono");
				
		//La consola espera a que introduzcas tu telefono
		telefono = sc.nextLine();
		
		//Imprime por pantalla tu nombre
		System.out.println("Nombre: " + nombre);
		
		//Imprime por pantalla tu direccion
		System.out.println("Direccion: " + direccion);
				
		//Imprime por pantalla tu telefono
		System.out.println("Telefono: " + telefono);
				
		//Close the scanner
		sc.close();
	}

}
