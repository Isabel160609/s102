package s102Nivell1Exercici5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		boolean continuar=true;
		
		while(continuar) {
			try {
				
				System.out.println("introduce un caracter");
				String caracter = sc.nextLine();
				
				//le pedimos que intente convertir el caracter en numero
				int numero=Integer.parseInt(caracter);
				System.out.println("este caracter si es un numero");
				//si lo hace cambiara continuar a false y salimos del bucle
				continuar=false;
			}catch(Exception e) {
				//si no puede por que no es un numero captura el error e imprime que no es un numero
				System.out.println("este caracter no es un numero");
			}
		}
		//como hemos conseguido pasar por el catch hemos salido del bucle
		System.out.println("hemos salido del bucle");
	}

}
