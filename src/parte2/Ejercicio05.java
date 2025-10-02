package parte2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable segIniciales, seg, min y horas
		int segIniciales;
		int seg;
		int min;
		int horas;
		
		//La consola te pide que indiques un numero de segundos
		System.out.println("Introduce un numero de segundos:");
		segIniciales = sc.nextInt();
		
		// Pasamos los segundos a minutos y a horas y utilizamos el resto para los segundos y minutos restantes.
		min = (segIniciales / 60);
		seg = (segIniciales % 60);
		horas = (min / 60);
		min = (min % 60);
		
		//La consola imprime por pantalla tus segundos en horas, minutos y segundos.
		System.out.println("Son: " + horas + "horas " + min + "minutos y " + seg + "segundos.");
		
		//Cierra el scanner
		sc.close();
		
	}

}
