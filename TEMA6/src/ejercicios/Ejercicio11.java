package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		String frase;//Frase introducida por el usuario
		String palabra;//Variable que almacenará la frase más larga 
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una frase para saber que palabra es más larga:");//Pedimos una frase
		frase=sc.nextLine();//La leemos
		String[] palabras = frase.split(" "); // Separador: espacio en blanco
		palabra=palabras[0];//Iniciamos la palabra más larga en la primera
		for(int i = 1; i<palabras.length-1;i++) {//Comparamos palabra a palabra
			if(palabras[i].length()>palabra.length()) {//Si es más larga...
				palabra=palabras[i];//Se almacena como la más larga
			}
		}
		//Imprimimos el resultado
		System.out.println("La palabra más larga es " + palabra + " y mide " + palabra.length() + " letras.");
		sc.close();
	}
}
