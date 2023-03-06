package ejercicios;

import java.util.Scanner;
//Programa que compara dos frases e indica cual es más larga

public class Ejercicio1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String frase1="";//Primera frase a comparar
	String frase2="";//Segunda frase a comparar
	int longit1;//Longitud de la primera frase
	int longit2;//Longitud de la segunda frase
	System.out.println("Introduzca la primera frase: ");//Pide la primera frase
	frase1=sc.nextLine();//Lee la primera frase
	longit1= frase1.length();//Guarda su tamaño
	System.out.println("Introduzca la segunda frase: ");//Pide la segunda frase
	frase2=sc.nextLine();//Lee la segunda frase
	longit2= frase2.length();//Guarda su tamaño
	if(longit1>longit2) {//Si la longitud del primero es mayor...
	System.out.println(frase2+ " es la frase más corta");//Lo indicamos
	}else if(longit2>longit1) {//Si la longitud del segundo es mayor...
		System.out.println(frase1+ " es la frase más corta");//Lo indicamos
		}else {//Si ninguno es mayor...
			System.out.println("Ambas frases son igual de largas");//Indicamos el empate
		}
	sc.close();
}
}
