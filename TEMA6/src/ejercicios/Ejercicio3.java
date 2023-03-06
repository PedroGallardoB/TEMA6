package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String frase;//Almacena la frase a introducir
		int contador=0;//Contador de palabras
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase:");//Pide la frase
		
		frase=sc.nextLine();//Lee la frase
		for(int i=0;i<frase.length();i++) { //Bucle que llega hasta el final de la clase
			if (frase.charAt(i)==' ') {//Si el carácter es un espacio
				contador++;//Sumar uno al contador de palabras
			}
		}
		
		System.out.println("Hay "+contador+ " espacios.");//Imprimimos el resultadp
		sc.close();
	}

}
