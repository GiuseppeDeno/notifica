
public class SmsNotifica extends Notifica {

	public SmsNotifica(String messaggio) {
		super(messaggio);
		
	}
	
	// Sovrascrivi il metodo invia()
    @Override
	public void Invia() {
		System.out.println("Invio una notifica SMS: " + getMessaggio());
//ho messo getMessaggio invece di messaggio perche nella classe Notifica il messaggio era private
	}


}
