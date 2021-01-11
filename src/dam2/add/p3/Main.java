package dam2.add.p3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		menuPrincipal();

	}

	public static void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		Operaciones operacion = new Operaciones();

		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("MENU");
			System.out.println("1 - Jugar");
			System.out.println("2 - Anadir Pregunta");
			System.out.println("3 - Importar preguntas");
			System.out.println("4 - Ver records");
			System.out.println("5 - Instrucciones");
			System.out.println("6 - Salir");

			try {
				System.out.println("Introduzca una opcion: ");
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					salir = true;
					break;
				default:
					System.out.println("\nElije del 1 al 6\n");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nDebe insertar un numero\n");
			}
		}
	}

}
