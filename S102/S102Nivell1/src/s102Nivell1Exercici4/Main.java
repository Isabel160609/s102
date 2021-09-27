package s102Nivell1Exercici4;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//lanzo mi propia excepcion
			 throw new ExceptionIsabel("Esta es mi propia Excepción");
			 
		}catch(ExceptionIsabel e) {
			//es capturada por catch
			System.out.println("excepcion capturada");
		}
	}

}
