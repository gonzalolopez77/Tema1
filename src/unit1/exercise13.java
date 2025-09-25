package unit1;

import java.util.Scanner;

public class exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable salir
		boolean salir;		
		
		//Crea la variable llueve
		boolean llueve;		
		
		//La consola imprime que indiques si llueve
		System.out.println("¿Esta lloviendo?(true/false)");
							
		//La consola espera que indiques si llueve
		llueve = sc.nextBoolean();		
		
		//Crea la variable biblioteca
		boolean biblioteca;		
		
		//La consola imprime que indiques si vas a la biblioteca
		System.out.println("¿Vas a la biblioteca?(true/false)");
							
		//La consola espera que indiques si vas a la biblioteca
		biblioteca = sc.nextBoolean();		
		
		//Crea la variable tareas
		boolean tarea;		
		
		//La consola imprime que indiques si has hecho la tarea
		System.out.println("¿Has hecho la tarea?(true/false)");
							
		//La consola espera que indiques si has hecho la tarea
		tarea = sc.nextBoolean();	
		
		// 
		salir = (!llueve && tarea) || biblioteca;
		
		//La consola imprime si puedes salir o no
		System.out.println("¿Puedes salir?  "+ salir);
						
		//Close the scanner
		sc.close();				
	}

}
