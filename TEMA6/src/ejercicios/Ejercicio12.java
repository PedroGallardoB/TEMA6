package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		String palabra1;//Variable que almacena la primera palabra
		String palabra2;//Variable que almacena la segunda palabra
		Scanner sc = new Scanner(System.in);

		// Solicitamos las dos palabras al usuario
		System.out.print("Introduzca la primera palabra: ");
		palabra1 = sc.nextLine().toLowerCase();//La leemos en minúsculas
		System.out.print("Introduzca la segunda palabra: ");
		palabra2 = sc.nextLine().toLowerCase();//La leemos en minúsculas

		// Verificamos si las dos palabras tienen la misma longitud
		if (palabra1.length() != palabra2.length()) {
			System.out.println("Las palabras no son anagramas");//Indicamos que no es un anagrama
		} else {

			// Convertimos las palabras en arrays y ordenarlos
			char[] palabra1Chars = palabra1.toCharArray();// Palabra 1
			Arrays.sort(palabra1Chars);//Ordenamos el array
			char[] palabra2Chars = palabra2.toCharArray();// Palabra 2
			Arrays.sort(palabra2Chars);//Ordenamos el array

			// Imprimimos el resultado
			if (Arrays.equals(palabra1Chars, palabra2Chars)) {
				System.out.println("Las palabras son anagramas");
			} else {
				System.out.println("Las palabras no son anagramas");
			}
		}

		sc.close();
	}
}
