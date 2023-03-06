package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String textoOriginal = "";// Texto que introduce el jugador 1
		String anagrama = "";// Anagrama generado
		String respuesta = "";// Respuesta del jugador 2
		char arrayChars[];
		int indiceAleatorio;

		// Pedimos al jugador 1 que introduzca una palabra o frase

		System.out.print("Jugador 1, introduce una palabra o frase: ");// Pedimos el texto
		textoOriginal = sc.nextLine();// Lo leemos
		arrayChars = textoOriginal.toCharArray();
		// Generamos un anagrama del texto original

		while (arrayChars.length > 0) {

			indiceAleatorio = (int) (Math.random() * arrayChars.length);// Posición que de no estar ocupada pasará
																				// al anagrama
			anagrama += arrayChars[indiceAleatorio];
			System.arraycopy(arrayChars, indiceAleatorio + 1, arrayChars, indiceAleatorio, arrayChars.length - (1 + indiceAleatorio));
			arrayChars=Arrays.copyOf(arrayChars, arrayChars.length-1);
		}
		System.out.println("Tu anagrama es: " + anagrama);

		// Pedimos al jugador 2 que adivine el texto original
		System.out.print("Jugador 2, intenta adivinar la palabra: ");
		respuesta = sc.nextLine();

		// Comprobamos si la adivinanza es correcta
			while (!respuesta.equalsIgnoreCase(textoOriginal)) {
				System.out.println("Lo siento, incorrecto");// Indicamos error
				System.out.println("Inténtelo de nuevo");
				respuesta = sc.nextLine();// Volvemos a leer intento
			}
			System.out.println("¡Correcto!");// Indicamos acierto

		sc.close();
	}
}
