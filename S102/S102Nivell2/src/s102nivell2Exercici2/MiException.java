package s102nivell2Exercici2;
public class MiException {

	//metodo f que recoge g y si no puede manda una RuntimeException
	public void f() throws RuntimeException {
		
		try {
			g();
		}catch(Exception1 e){
			
			throw new RuntimeException(e);
			
		}
	}
	
	//metodo g que lanza una excepcion
	public void g() throws Exception1 {
			throw new Exception1();
		}
}
