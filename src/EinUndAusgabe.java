public class EinUndAusgabe {

	/**
	 * Die Mainmethode ermoeglicht den Aufruf der einzelnen Uebungen ueber einen Abfragedialog
	 */
	public static void main(String[] args) {

		boolean ende = false;
		while (!ende) {

			int nr = Benutzereingabe.frageNachIntUeberDialog("Bitte Uebungsnr eingeben (1-5, 0 zum Beenden):");

			if (nr == 1) {
				uebung1();
			}
			if (nr == 2) {
				uebung2();
			}
			if (nr == 3) {
				uebung3();
			}
			if (nr == 4) {
				uebung4();
			}
			if (nr == 5) {
				uebung5();
			}
			if (nr == 0) {
				System.exit(0);
			}
		}

	}

	public static void uebung1() {
		// TODO Implementieren Sie die Uebung 1
	}

	public static void uebung2() {
		// TODO Implementieren Sie die Uebung 2
	}

	public static void uebung3() {
		// TODO Implementieren Sie die Uebung 3
	}

	public static void uebung4() {
		// TODO Implementieren Sie die Uebung 4
	}

	public static void uebung5() {
		// TODO Implementieren Sie die Uebung 5
	}

}
