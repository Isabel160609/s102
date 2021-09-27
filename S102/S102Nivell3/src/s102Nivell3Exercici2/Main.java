package s102Nivell3Exercici2;

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean esNumero = false;
//capturem l'error  no sortira del bucle si no es un numero
		while (!esNumero) {

			try {
				FailingConstructor clase = new FailingConstructor();
				esNumero = true;

			} catch (InputMismatchException e) {
				System.out.println("esto no es un numero");
			}
		}

	}

}
