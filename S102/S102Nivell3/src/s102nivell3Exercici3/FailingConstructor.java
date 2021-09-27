package s102nivell3Exercici3;


import java.util.*;

public class FailingConstructor {
	//creo el array static para ver el array y poder recoger el error
	static int [] numeros= {1,2,3};

	private int numero;
	private int otroNumero;
	
	public FailingConstructor(int posicion) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero");
		//si introducimos un numero dara error
		numero= sc.nextInt();
		//si introducimos una posicion distinta a 0,1,2 dara error
		otroNumero=numeros[posicion];
	}

	@Override
	public String toString() {
		return "FailingConstructor [numero=" + numero + ", otroNumero=" + otroNumero + "]";
	}
	
}
