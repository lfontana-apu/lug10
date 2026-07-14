package arrayBi;

public class arrayBidimensionale {

	public static void main(String[] args) {
		// definisco le dimensioni dell'array bidimensionale
		int anni = 5, trimestri = 4;
		int [][] venditeAnnuali; // dicbiarazione di array bidimensionale
		venditeAnnuali = new int[anni][trimestri]; // creo l'array bidimensionale
		venditeAnnuali[0][0] = 1000; // 1° trimetre del 1° anno (indici sempre -1)
		venditeAnnuali[0][1] = 1500; // 2° trimetre del 1° anno (indici sempre -1)
		venditeAnnuali[0][2] = 1800; // 3° trimetre del 1° anno (indici sempre -1)
		venditeAnnuali[1][0] = 1000; // 1° trimetre del 2° anno (indici sempre -1)
		venditeAnnuali[3][3] = 4500; // 4° trimetre del 4° anno (indici sempre -1)
		
		// per stampare decentemente l'array bidimensionale, si usa un ciclo for annidato in un altro ciclo for
		for (int i = 0; i < anni; i++) {// ciclo che scandisce gli anni
			System.out.println("Vendite anno " + (i + 2020) + ":");
			for (int j = 0; j < trimestri; j++ ) {
				System.out.println("trimestre " + (j+1) + "; " + venditeAnnuali[i][j]);
			}
		}
	}

}
