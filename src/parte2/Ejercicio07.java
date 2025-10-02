package parte2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable infantil
		final double infantil = 15.50;
		
		//Creamos la variable adulto
		final double adulto = 20;
	
		//Creamos la variable entradasAdulto
		int entradasAdulto;
		
		//Creamos la variable entradasInfantil
		int entradasInfantil;		
		
		//Creamos la avriable entradasInfantil
		double importeTotal;
		
		//Creamos la avriable entradasInfantil
		double descuento;
		
		//La consola te pide que indiques el numero de entradas de adultos
		System.out.println("Indica el numero de entradas para adultos que quieres comprar:");
		entradasAdulto = sc.nextInt();
		
		//La consola te pide que indiques el numero de entradas de niños
		System.out.println("Indica el numero de entradas para niños que quieres comprar:");
		entradasInfantil = sc.nextInt();		
		
		//Calculamos el importe total
		importeTotal = (entradasAdulto * adulto) + (entradasInfantil * infantil);
		
		//Calculamos el 5%
		descuento = importeTotal * 0.05; 
		
		//Usamos el ternario para que si el importe total 
		//es mayor a 100 te hagan un 5% de descuento
		importeTotal = importeTotal > 100 ? importeTotal - descuento : importeTotal;
		
		//Imprime por pantalla el importe total
		System.out.println("El importe total es: " + importeTotal + "€");
		
		//Cierra el scanner
		sc.close();
		
	}

}
