package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
//comentario
		int max = 80;
		int min = 20;
		int intentos = 0;

		Random rand = new Random();
		int randomNum = rand.nextInt((max - min)) + min;
		System.out.println(randomNum);
		int numero;
		Scanner sc = new Scanner(System.in);
		boolean encontrado = true;

		try {
			do {
				do {
					System.out.println("introduce un numero entre " + max + " y" + min);
					numero = sc.nextInt();
				} while (numero < 20 || numero > 80);

				if (numero == randomNum) {
					encontrado = false;
				} else {
					intentos++;
					System.out.println("has fallado, intento: " + intentos);
					if (numero < randomNum) {
						System.out.println("el numero es mayor");
					} else {
						System.out.println("el numero es menor");
					}
				}
			} while (encontrado && intentos < 10);

			if (encontrado == false) {
				System.out.println("has ganado la partida, has usado :" + intentos + " intentos");
			} else {
				System.out.println("has perdido la partida, has usado los:" + intentos + "");
			}
		} catch (Exception e) {
			System.out.println("Error, introduce un numero, empieza de nuevo.");
		}
	}
}