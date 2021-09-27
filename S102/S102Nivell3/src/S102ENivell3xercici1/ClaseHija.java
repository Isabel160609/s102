package S102ENivell3xercici1;

public class ClaseHija extends ClasePadre {

	
	//lo haga como lo haga solo con super o intentando capturar el error con try catch no me deja heredar el constuctor
	public ClaseHija () throws Excepcion1 {
		super();
		
		//no puedes hacer sobreescritura pq la primera cosa a poner es el super por lo que no puedes capturar en try catch
		/*try {
			super();
			
			
		}catch(Excepcion1 e) {
			
			System.out.println("capturamos la excepcion");
		}*/
	}
}
