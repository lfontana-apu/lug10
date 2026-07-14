package esempioswitch;

public class ControllaMeseTest {

	public static void main(String[] args) {
		ControllaMese mioMese = new ControllaMese();
		mioMese.mese = 7;
		mioMese.calcolaGiorni();
		mioMese.mese = -44;
		mioMese.calcolaGiorni();
	}

}
