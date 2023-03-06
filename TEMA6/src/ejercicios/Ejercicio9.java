package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	private static char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };//Caracteres introducidos
	private static char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };//Caracteres por los que se cambia

	private static char codifica(char conjunto1[], char conjunto2[], char c) {//Se introducen las listas de caracteres a cambiar y el carácter 
		for (int i = 0; i < conjunto1.length; i++) {//Bucle que comprueba si el carácter aparece en la lista
			if (c == conjunto1[i]) {//Si el carácter es igual a la posición del array...
				c = conjunto2[i];//Se sustituye el carácter
				break;
			}
		}
		return c;//Se devuelve el carácter
	}

	public static void main(String[] args) {
		String fraseLiteral;//Frase introducida
		String fraseCodificada = "";//Frase tras ser codificada
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase para ser codificada:");//Pedimos la frase
		fraseLiteral = sc.nextLine();//Frase introducida
		fraseLiteral = fraseLiteral.toLowerCase();//Pasa la frase a minúsculas

		for (int i = 0; i < fraseLiteral.length(); i++) {//Bucle para comprobar cada carácter y cambiarlo si es necesario
			fraseCodificada = fraseCodificada + codifica(conjunto1, conjunto2, fraseLiteral.charAt(i));//Se cambia el carácter si está en la lista y se añade a la cadena resultado
		}

		System.out.println("Tu frase codificada es: " + fraseCodificada);//Mostramos el resultado

		sc.close();
	}

}
