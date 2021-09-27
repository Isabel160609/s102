package s102nivell2Exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//probamos de lanzar 
		try {
			
		new MiException().f();
		
		//si no podemos atrapamos la excepcion
		}catch(RuntimeException e){
			
			System.out.println(new Exception1().msg);

		}
	}

}
