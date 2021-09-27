package s102Nivell1Exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// aqui se captura una excepcion real con un bucle que quiere recorrer
		// mas posiiones de las que hay en la cadena
		int[] numeros = new int[3];

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(numeros[i]);
			} catch (Exception e) {
				System.out.println("aquest index no existeix");
			} finally {
				System.out.println("sempre paso per aqui, tingui l'index o no l'array");
			}
		}

		try {
			throw new Exception("Aixo es una excepcio");
		} catch (Exception e) {
			System.out.println("S'ha produit una excepcio: " + e.getMessage());
		} finally {
			System.out.println("sempre paso per aqui hi haguin errors o no");
		}
	}

}
