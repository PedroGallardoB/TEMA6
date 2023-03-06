package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	

	public static void main(String[] args) {
		String palabra="";//Palabra a añadir a la frase
		String frase="";//Frase que mostraremos
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra para añadirla a la frase, o fin para terminar: ");//Pedimos palabras
		palabra=sc.nextLine();//Las leemos

		while(!palabra.equalsIgnoreCase("fin")) {//Mientras no sean fin
			System.out.println("Introduzca una palabra para añadirla a la frase, o fin para terminar: ");//Pedimos palabras
			frase+=palabra+" ";//Las sumamos a la frase
			palabra=sc.nextLine();//La leemos
		}
		
	
		System.out.println("Resultado: "+ frase);//Mostramos el resultado
		sc.close();
	}
		

	}

