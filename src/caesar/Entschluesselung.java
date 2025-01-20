package caesar;

import java.util.Scanner;

public class Entschluesselung {

	public static void caesarentschluesselung() {
		System.out.println("Geben Sie die Anzahl der Verschiebungen an(1-90):");
		Scanner eingabe = new Scanner(System.in);
		int verschiebungswert = eingabe.nextInt();
		System.out.println("Geben Sie den zu entschlüsselnden Text ein:");
		Scanner eingabet = new Scanner(System.in);
		String eingabetext = eingabet.nextLine();
		eingabe.close();
		eingabet.close();
		
		
		String[] caesar = {
				"aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦",	// 1
				"AbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦a",	// 2
				"bBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aA",	// 3
				"BcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAb",	// 4
				"cCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbB",	// 5
				"CdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBc",	// 6
				"dDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcC",	// 7
				"DeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCd",	// 8
				"eEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdD",	// 9
				"EfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDe",	// 10
				"fFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeE",	// 11
				"FgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEf",	// 12
				"gGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfF",	// 13
				"GhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFg",	// 14
				"hHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgG",	// 15
				"HiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGh",	// 16
				"iIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhH",	// 17
				"IjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHi",	// 18
				"jJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiI",	// 19
				"JkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIj",	// 20
				"kKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJ",	// 21
				"KlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJk",	// 22
				"lLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkK",	// 23
				"LmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKl",	// 24
				"mMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlL",	// 25
				"MnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLm",	// 26
				"nNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmM",	// 27
				"NoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMn",	// 28
				"oOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnN",	// 29
				"OpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNo",	// 30
				"pPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoO",	// 31
				"PqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOp",	// 32
				"qQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpP",	// 33
				"QrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPq",	// 34
				"rRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQ",	// 35
				"RsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQr",	// 36
				"sStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrR",	// 37
				"StTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRs",	// 38
				"tTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsS",	// 39
				"TuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsSt",	// 40
				"uUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStT",	// 41
				"UvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTu",	// 42
				"vVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuU",	// 43
				"VwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUv",	// 44
				"wWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvV",	// 45
				"WxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVw",	// 46
				"xXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwW",	// 47
				"XyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWx",	// 48
				"yYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxX",	// 49
				"YzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXy",	// 50
				"zZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyY",	// 51
				"Z `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYz",	// 52
				" `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ",	// 53
				"`~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ ",	// 54
				"~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `",	// 55
				"!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~",	// 56
				"@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!",	// 57
				"#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@",	// 58
				"$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#",	// 59
				"%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$",	// 60
				"^&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%",	// 61
				"&*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^",	// 62
				"*()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&",	// 63
				"()-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*",	// 64
				")-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*(",	// 65
				"-_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()",	// 66
				"_=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-",	// 67
				"=+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_",	// 68
				"+[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=",	// 69
				"[{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+",	// 70
				"{]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[",	// 71
				"]}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{",	// 72
				"}\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]",	// 73
				"\\|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}",	// 74
				"|;:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\",	// 75
				";:'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|",	// 76
				":'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;",	// 77
				"'\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:",	// 78
				"\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'",	// 79
				"\",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\"",	// 80 
				",<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\"",	// 81
				"<.>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",",	// 82
				".>/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<",	// 83
				">/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.",	// 84
				"/?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>",	// 85
				"?°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/",	// 86
				"°§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?",	// 87
				"§¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°",	// 88
				"¬¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§",	// 89
				"¦aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?°§¬",	// 90
				};
					
			
		String ergebnis = "";
		for (int j =0; j < eingabetext.length();j++) {
			for (int k = 0; k < caesar[verschiebungswert].length();k++ ) {
				if (eingabetext.charAt(j) == caesar[verschiebungswert].charAt(k)) {
					ergebnis  += caesar[0].charAt(k);
					
				} 
				
			}
				
		}
		System.out.println("Verschlüsselter Text:");
		System.out.println(ergebnis);
	}



	}


