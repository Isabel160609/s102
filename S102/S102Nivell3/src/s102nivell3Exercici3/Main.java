package s102nivell3Exercici3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean esNumero = false;
		boolean esNumero2 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una posicion del 1 al 3");
		int posicion=-1;
		//creamos la variable posicion capturando el posible error de rango distinyto a 0,1,2
		while (!esNumero2) {
			try {
				//lanzo un scanner para pedir numero
				posicion=sc.nextInt();
				//compruebo que este numero sea valido para la posicion
				int resultado= FailingConstructor.numeros[posicion];
				//si es valido saldre del bucle
				esNumero2 = true;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("debe ser un numero entre 1 y 3");
			}
		}
		

		while (!esNumero) {

			try {
				//creem un objecte i capturem el error del numero
				FailingConstructor clase = new FailingConstructor(posicion);
				esNumero = true;

			} catch (InputMismatchException e) {
				System.out.println("esto no es un numero");
			}
		}

	}

}
