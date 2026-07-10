package esercizioClock;

public class Clock { 
	private int ore = 14; // numeri per testare il programma
	private int minuti = 30; // numeri per testare il programma
	
	
	// Metodo per calcolare il periodo
	public void displayPartOfDay() {
		String risultato = (ore < 0 || ore > 23 || minuti < 0 || minuti > 59) ? "Errore: orario inesistente":
							(ore >= 6 && ore <= 11 ) ? "Mattina" :
							(ore >= 12 && ore  <= 17 ) ? "Pomeriggio" :
							(ore >= 18 && ore <= 22 ) ? "Sera" :
														"Notte";
		
	// Stampare risultato
	System.out.println(risultato);
		
	}
}
