package caesar;

import java.util.Scanner;

public class Verschluesselung {
	public static void caesarverschluesselung () {
		System.out.println("Geben Sie die Anzahl der Verschiebungen an(1-26):");
		Scanner eingabe = new Scanner(System.in);
		int verschiebungswert = eingabe.nextInt();
		System.out.println("Geben Sie den zu verschlüsselnden Text ein:");
		Scanner eingabet = new Scanner(System.in);
		String eingabetext = eingabet.nextLine();
		eingabe.close();
		eingabet.close();
		
		
		String[] caesar = {
				"abcdefghijklmnopqrstuvwxyz",  //Index 0
				"zabcdefghijklmnopqrstuvwxy",	//1
				"yzabcdefghijklmnopqrstuvwx",
				"xyzabcdefghijklmnopqrstuvw",
				"wxyzabcdefghijklmnopqrstuv",
				"vwxyzabcdefghijklmnopqrstu",
				"uvwxyzabcdefghijklmnopqrst",
				"tuvwxyzabcdefghijklmnopqrs",
				"stuvwxyzabcdefghijklmnopqr",
				"rstuvwxyzabcdefghijklmnopq",
				"pqrstuvwxyzabcdefghijklmno",
				"opqrstuvwxyzabcdefghijklmn",
				"nopqrstuvwxyzabcdefghijklm",
				"mnopqrstuvwxyzabcdefghijkl",
				"lmnopqrstuvwxyzabcdefghijk",
				"klmnopqrstuvwxyzabcdefghij",
				"ijklmnopqrstuvwxyzabcdefgh",
				"hijklmnopqrstuvwxyzabcdefg",
				"ghijklmnopqrstuvwxyzabcdef",
				"fghijklmnopqrstuvwxyzabcde",
				"efghijklmnopqrstuvwxyzabcd",
				"defghijklmnopqrstuvwxyzabc",
				"cdefghijklmnopqrstuvwxyzab",
				"bcdefghijklmnopqrstuvwxyza",
		};
					
			
		String ergebnis = "";
		for (int j =0; j < eingabetext.length();j++) {
			for (int k = 0; k < caesar[0].length();k++ ) {
				if (eingabetext.charAt(j) == caesar[0].charAt(k)) {
					ergebnis  += caesar[verschiebungswert].charAt(k);
					
				}
				
			}
				
		}
		System.out.println("Verschlüsselter Text:");
		System.out.println(ergebnis);
	}

}
