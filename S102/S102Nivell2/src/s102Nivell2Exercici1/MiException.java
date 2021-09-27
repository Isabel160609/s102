package s102Nivell2Exercici1;
public class MiException {

	//metodo f que recoge g y si no puede manda una Exception2
	public void f() throws Exception2 {
		
		try {
			g();
		}catch(Exception1 e){
			
			throw new Exception2();
			
		}
	}
	
	//metodo g que lanza una excepcion
	public void g() throws Exception1 {
			throw new Exception1();
		}
}
