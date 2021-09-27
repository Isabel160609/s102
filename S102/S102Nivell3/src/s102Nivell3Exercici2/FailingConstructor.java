package s102Nivell3Exercici2;

import java.util.*;



public class FailingConstructor {

	int numero;
	
	public FailingConstructor() {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		//creem un parametre que llençara un error si no es un numero
		numero= sc.nextInt();
	}
}
