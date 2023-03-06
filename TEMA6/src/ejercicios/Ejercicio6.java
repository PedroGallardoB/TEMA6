package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra="";//Palabra que queremos contar en la frase
		String frase="";//Frase en la que la queremos contar
		int contador=0;//Contador de veces en las que la palabra aparece
		
		System.out.println("Introduzca una frase y una palabra para saber cuántas veces aparece esa palabra dentro."); //Pide la palabra para contar cuanto aparece
		System.out.print("FRASE: ");//La frasen a introducir
		frase=sc.nextLine();
		System.out.print("PALABRA: ");
		palabra=sc.nextLine();
		
		String[] palabras = frase.split(" "); // Separador: espacio en blanco
		for(int i =0; i<palabras.length-1;i++) {//Recorre la frase buscando la palabra
			if(palabras[i].equals(palabra)) {
				contador++;//Suma si aparece
			}
		}
		System.out.println("Aparece " + contador + " veces.");//Imprimimos el resultado
		sc.close();
	}

}
