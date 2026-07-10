package esercizioData;

public class Data {
	public int giorno;
		
	public void mostraGiorno() {
			
		switch(giorno) {
			case 1:
				System.out.print("Lunedì");
				break;
			case 2:
				System.out.print("Martedì");
				break;
			case 3:
				System.out.print("Mercoledì");
				break;
			case 4:
				System.out.print("Giovedì");
				break;
			case 5:
				System.out.print("Venerdì");
				break;
			case 6:
				System.out.print("Sabato");
				break;
			case 7:
				System.out.print("Domenica");
				break;
			default:
				System.out.println("Giorno inesistente!");
		}
	}
}
