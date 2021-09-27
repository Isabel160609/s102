package s102Nivell1Exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creem un objecte i li donem valor null
		
		ExceptionNull miExcepcion=null;
		
		
		//intentem ejecutar el metode getNumero() 
		try {
			
			miExcepcion.getNumero();
			
		//	si no es pot imprimim la frase d'error
		}catch (Exception e) {
			
			System.out.println("s'ha produit un error en el metode getNumero()");
		}
		
		//com l'objecta es null mai podra ejecutar miExcepcion.getNumero(); per lo que imprimira el catch
	}

}
