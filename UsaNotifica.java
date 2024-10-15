import java.util.ArrayList;
public class UsaNotifica {

	public static void main(String[] args) {
		// creo un array list di notifiche
		
		ArrayList<Notifica> listaNotifiche= new ArrayList<>();
		
		//aggiungo 3 notifiche seplici
		listaNotifiche.add(new Notifica("ciao"));
		listaNotifiche.add(new Notifica("buongiorno"));
		listaNotifiche.add(new Notifica("buonasera"));

		//aggingo e notifiche email
		listaNotifiche.add(new EmailNotifica("ciao dalla mail"));
		listaNotifiche.add(new Notifica("buongiorno dalla mail "));
		listaNotifiche.add(new Notifica("buonasera dalla mail"));
		
		//aggingo e notifiche sms
				listaNotifiche.add(new EmailNotifica("ciao dalla SMS"));
				listaNotifiche.add(new Notifica("buongiorno dalla SMS "));
				listaNotifiche.add(new Notifica("buonasera dalla SMS"));
				
				
				//con un ciclo for each invoco e faccio stampare 
				
				for (Notifica n : listaNotifiche) {
					n.Invia();
				}


	}

}