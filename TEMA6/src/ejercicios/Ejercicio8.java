package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String frase = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("TRADUCTOR JAVALANDÉS");
		System.out.println("INTRODUCE UNA FRASE PARA SABER SI ESTÁ EN JAVALANDÉS: ");// Pedimos frase
		frase = sc.nextLine();// La leemos
		if (frase.startsWith("Javalín, javalón ") || frase.startsWith("Javalín, javalón	")) {// Si inicia con muletilla
			System.out.println("La frase está en Javalandés");// Indicamos que está en el idioma
			frase = frase.replace("Javalín, javalón", "");// Eliminamos la muletilla
			System.out.println("El mensaje es: " + frase);// Imprimimos la frase

		} else if (frase.endsWith(" javalén, len, len") || frase.endsWith("	javalén, len, len")) {// Si termina con
																									// muletilla
			System.out.println("La frase está en Javalandés");// Indicamos que está en el idioma
			frase = frase.replace("javalén, len, len", "");// Eliminamos la muletilla

			frase = frase.trim();

			System.out.println("El mensaje es: " + frase);// Indicamos el mensaje
		} else {// Si no tiene muletilla
			System.out.println("La frase no está en Javalandés");// Decimos que no está en el idioma
		}

		sc.close();
	}

}
