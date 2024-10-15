//sottoclasse di Notifica
public class EmailNotifica extends Notifica{
	
	public EmailNotifica(String messaggio) {
		super(messaggio);
	}
	// Sovrascrivi il metodo invia()
    @Override
	public void Invia() {
		System.out.println("Invio una notifica EMAIL: " + getMessaggio());
//ho messo getMessaggio invece di messaggio perche nella classe Notifica il messaggio era private
	}

}
