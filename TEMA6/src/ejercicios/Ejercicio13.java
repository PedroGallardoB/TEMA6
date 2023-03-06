package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		String frase; // Variable que almacena la frase introducida por el usuario
		int apariciones; // Variable que almacena la cantidad de veces que aparece una letra
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase:"); // Pedimos una frase
		frase = sc.nextLine().toLowerCase(); // Leemos la frase
		frase = frase.replace(" ", "");//Eliminamos espacios
		char[] fraseChars = frase.toCharArray();//Los carácteres se almacenan en un array
		Arrays.sort(fraseChars); // Ordenamos el array

		for (int i = 0; i < fraseChars.length; i++) {
			apariciones = 1; // Inicializamos el contador de apariciones
			// Comprobamos si la letra actual es igual a la siguiente
			while (i < fraseChars.length - 1 && fraseChars[i] == fraseChars[i + 1]) {
				apariciones++; // Incrementamos el contador de apariciones
				i++; // Pasamos a la siguiente letra
			}
			System.out.println("La letra " + fraseChars[i] + " aparece " + apariciones + " veces."); // Mostramos el
																										// resultado
		}

		sc.close();
	}
}
