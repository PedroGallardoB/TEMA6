package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	static String invertir(String frase) {

		String fraseInvertida = "";//Empieza la frase que almacenará la frase invertida como vacía
		for (int i = frase.length() - 1; i >= 0; i--) {//Comprueba los carácteres de la palabra 
			fraseInvertida += frase.charAt(i);//Los suma del revés
		}
		return fraseInvertida;//Devuelve la frase del revés
	}

	public static void main(String[] args) {
		String frase = "";//Frase que iniciamos vacía y será la que introduciremos
		String fraseInvertida = "";//Frase dada la vuelta
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase para saber si es palíndroma:");//Pedimos la frase
		frase = sc.nextLine();//Leemos la frase
		frase=frase.replace(" ", "");//Eliminamos los espacios
		
		fraseInvertida = invertir(frase);//Guardamos la frase invertida
		if (frase.equalsIgnoreCase(fraseInvertida)) {//Comprobamos la frase invertida con la original
			System.out.println("La frase es palíndroma");//Si coincide indicamos que es palíndroma
		} else {
			System.out.println("La frase no es palíndroma");//Si no coincide indicamos que no es palíndroma
		}

		sc.close();
	}
}
