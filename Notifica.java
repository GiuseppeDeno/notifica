
//Crea una classe base chiamata Notifica con i seguenti attributi e metodi:
//
//Attributo messaggio di tipo void. ?????(ho messo string)
//Metodo invia() che stampa il messaggio "Invio una notifica generica: [messaggio]".
//Crea due sottoclassi che estendono Notifica:
//
//EmailNotifica: rappresenta una notifica via email. Sovrascrivi il metodo invia() in modo che stampi "Invio una notifica email: [messaggio]".
//SMSNotifica: rappresenta una notifica via SMS. Sovrascrivi il metodo invia() in modo che stampi "Invio una notifica SMS: [messaggio]".
//Nel metodo main della tua applicazione, creiamo un arraylist di notifiche gli aggiungiamo 3 notifiche semplici, 3 notifiche mail, 3 notifiche sms.
//Con un ciclo for invocare il metodo invia() su tutti gli elementi dell’array
import java.util.ArrayList;

// Classe base Notifica
public class Notifica {

	
	private String messaggio;

	public String getMessaggio() {
		return messaggio;
	}


	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}


	public Notifica(String messaggio) {
	
		this.messaggio = messaggio;
	}
	
	
	//metodo invia
	
	public void Invia() {
		System.out.println("Invio una notifica generica: " +messaggio);
	}
	
	
}
