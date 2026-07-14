package ifelse;

public class Ascensore {
	// variabili globali
	public boolean portaAperta = false; // porta chiusa per "sicurezza"
	public int pianoCorrente = 0; // l'ascensore parte dal piano terra
	public final int PIANO_MIN = 0; // piano più basso (terra)
	public final int PIANO_MAX = 10; // piano più alto
	
	// metodi
	public void apriPorta() {
		System.out.println("Sto aprendo la porta");
		portaAperta = true;
		System.out.println("La porta è aperta");
	
	}
	
	public void chiudiPorta() {
		System.out.println("Sto chiudendo la porta");
		portaAperta = false;
		System.out.println("La porta è chiusa");
	}
	
	public void vaiSu() {
		System.out.println("Sto salendo di un piano");
		pianoCorrente++; // ++ aggiorna automaticamente la variabile
		System.out.println("Piano: " + pianoCorrente);
	}
	
	public void vaiGiu() {
		System.out.println("Sto scendendo di piano");
		pianoCorrente--;
		System.out.println("Piano: " + pianoCorrente);
	}
}
