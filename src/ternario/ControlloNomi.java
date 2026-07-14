package ternario;

public class ControlloNomi {

	public static void main(String[] args) {
		String nome1 = "Giulia";
		String nome2 = "Antony";
		                  // condizione booleana      true             false
		String risposta = nome1.equals(nome2) ? "Sono omonimi" : "Non sono omonimi";
		System.out.println(risposta);
	}

}
