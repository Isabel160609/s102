package s102Nivell2Exercici1;

import s102nivell2Exercici2.Exception1;

public class Main {

	public static void main(String[] args) throws Exception2 {
		// TODO Auto-generated method stub
		
		//probamos de lanzar
		try {
			
		new MiException().f();
		
		//si no podemos atrapamos la excepcion
		}catch(Exception2 e){
			
			System.out.println(new Exception2().msg);
		}
	}

}
