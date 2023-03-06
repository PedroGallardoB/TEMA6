package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	
	static String invertir(String frase) {//Parámetro frase a invertir
		String fraseInvertida="";//Frase donde se almacena la frase introducida pero invertida
	for(int i=frase.length()-1;i>=0;i--) {//Bucle que va del final al principio de la frase
		fraseInvertida+=frase.charAt(i);//Sumamos los caracteres empezando por el final a la cadena vacía
				}
	return fraseInvertida;//Devolvemos la frase invertida
	}

	public static void main(String[] args) {
		String frase;//frase introducida por usuario
		String fraseInvertida;//frase invertida
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase para invertirla: ");//Pedimos la frase
		frase=sc.nextLine();//La leemos 
		
		fraseInvertida=invertir(frase);//La invertimos con la función
	
		System.out.println("Resultado: "+ fraseInvertida);//Imprimimos el resultado
		sc.close();
	}
		

	}

