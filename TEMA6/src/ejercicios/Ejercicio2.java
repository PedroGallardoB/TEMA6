package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		String contrasena = "";//Contraseña correcta
		String intento = "";//Intento del usuario
		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1, introduzca una contraseña para que el jugador 2 la adivine.");//Pedimos que se introduzca la contraseña.
		contrasena = sc.nextLine();//Leemos la contraseña
		System.out.print("CONTRASEÑA: ");
		for (int i = 0; i < contrasena.length(); i++) {//Mostramos la longitud de la contraseña
			System.out.print("*");//Ponemos carácteres para indicar la longitud
			}

		while (!intento.equals(contrasena)) {//Mientras el intento no sea igual a la contraseña
			System.out.println(" Jugador 2, introduzca un intento de adivinarla.");//Pedimos al jugador 2 que introduzca la contraseña del jugador 1
			intento = sc.nextLine();//Leemos el intento
			if(contrasena.length()!=intento.length()) {//Si la contraseña no coincide en longitud
			System.out.print("Las longitud de la contraseña no coincide.");//Lo indicamos
			}else {//De otro modo
				
				//Mostramos los carácteres que coinciden en posición
			for (int i = 0; i < contrasena.length(); i++) {
				
				if(contrasena.charAt(i)==intento.charAt(i)) {
					System.out.print(contrasena.charAt(i));
				}else {
				System.out.print("*");
				}
				

			}
			System.out.print(" ");
			if (!intento.equals(contrasena)) {//Si la contraseña es incorrecta
				System.out.print(" Contraseña incorrecta. ");//Lo indicamos
			}
		}
		
	}
		System.out.println(", ¡ESO ES, FELICITACIONES ACERTASTES!");//Si la contraseña es correcta lo indicamos
		
		sc.close();
}
}
