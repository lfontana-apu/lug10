package esempioswitch;

public class ControllaMese {
	public int mese;
	
	public void calcolaGiorni() {
		
		switch(mese) { // nelle parentesi tonde dello switch metto l'entita che voglio confrontare
			case 1: // gennaio
			case 3: // marzo
			case 5: // maggio
			case 7: // luglio
			case 8: // agosto
			case 10: // ottobre
			case 12: // dicembre
				System.out.println("Ci sono 31 giorni in questo mese");
				break; // con break esco dallo switch senza effettuare altri confronti inutili
			case 2:
				System.out.println("Ci sono 28 o 29 giorni in questo mese");
			case 4: // arile
			case 6: // giugno
			case 9: // settembre
			case 11: // novembre
				System.out.println("Ci sono 30 giorni in questo mese");
				break;
			default: // finisco qui se nessuno dei case è verificato
				System.out.println("Numero del mese errato!");
				// break opzionale, lo switch termina comunque qui
		}
	}
}
