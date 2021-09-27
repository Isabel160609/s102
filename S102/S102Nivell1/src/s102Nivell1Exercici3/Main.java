package s102Nivell1Exercici3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {0, 1, 2};

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(numeros[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("aquest index no existeix dona l'error: " + e.getMessage());
			
			}
		}
	}

}
