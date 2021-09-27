package s102Nivell1Exercici4;

//generamos una clase hija de Exception
public class ExceptionIsabel extends Exception {
	
	//creamos mensaje error
	String MensajeError;
	
	public ExceptionIsabel(String MensajeError) {
		
		
		this.MensajeError=MensajeError;
	}

	//creamos metodo para que devuelva el mensaje
	public String getMensajeError() {
		return MensajeError;
	}

}
