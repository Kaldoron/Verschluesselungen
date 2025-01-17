package caesar;

import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		System.out.println("Möchten Sie einen Text\n"
				+ "1. Verschlüsseln\n"
				+ "2. Entschlüsseln\n");
		Scanner eingabe = new Scanner(System.in);
		int auswahl = eingabe.nextInt();
		if (auswahl == 1) {
			Verschluesselung.caesarverschluesselung();
		}
		if (auswahl == 2) {
			Entschluesselung.caesarentschluesselung();
		}
		
		eingabe.close();
		

	}

}
