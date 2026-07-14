package arrayMono;

public class EsempioArray {

	public static void main(String[] args) {
		String[] numeri = new String[2]; // dichiarazione e creazione di un array di String avente dimensione 2
		numeri[0] = "5"; // inserisco "5" come primo elemento dell'array (posizione 0)
		numeri[1] = "4"; // inserisco "4" come secondo elemento dell'array (posizione 1)
		System.out.println("Concatenazione: " + (numeri[0] + numeri[1]));
		
		int[] numeriVeri = new int[2]; // altro array, di int
		numeriVeri[0] = Integer.parseInt(numeri[0]); // tramite la classe Wrapper Integer, si richiama il metodo parseInt() che recupera il valore numerico della String del primo array 
		numeriVeri[1] = Integer.parseInt(numeri[1]); // tramite la classe Wrapper Integer, si richiama il metodo parseInt() che recupera il valore numerico della String del secondo array 
		System.out.println("Totale: " + (numeriVeri[0] + numeriVeri[1])); // parentesi tonde necessarie per evitare che il + effettui la concatenazione a "Totale: " (Java legge da sinistra a destra)
		
		double[] prezzi = {12.99, 32.00, 7.50}; // array di double dichiarato, creato e inizializzato in un'unica istruzione
		System.out.println(prezzi[0]);
	}

}
