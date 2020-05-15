package fonts;

public class Varsity extends Font {
	public Varsity() {
		super("Doh", "digital");
	}

	public void printText(String text) {
		char[] parts = text.toLowerCase().toCharArray();
		for (int line = 0; line <= 6; line++) {
			for (int n = 0; n < parts.length; n++) {
				char part = parts[n];
				switch (part) {
				case 'n':
					printLineForN(line);
					break;
				case 'r':
					printLineForR(line);
					break;
				case 'e':
					printLineForE(line);
					break;
//				 case 'l':
//					 printLineForL(line);
//					 break;
				case 'u':
					printLineForU(line);
					break;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	public void printLineForA(int lineNo) {
		String[] lines = { "       ", "       ", " ,--.  ", "`'_\\ :", "// | |,", "\\'-;_/", "       " };

		System.out.print(lines[lineNo]);
	}

	public void printLineForE(int lineNo) {
		String[] lines = { 
				"       ",
				"       ",
				" .---. ",
				"/ /__\\ ",
				"| \\__. ",
				" '.__.'",
				"      "};

		System.out.print(lines[lineNo]);
	}

	public void printLineForG(int lineNo) {
		String[] lines = { "         ", "         ", " .--./)  ", "/ /'`\\ ;", "\\ \\._//", ".',__`   ", "( ( __)) " };

		System.out.print(lines[lineNo]);
	}

	public void printLineForT(int lineNo) {
		String[] lines = { "  _   ", " / |_ ", "`| |-'", " | |  ", " | |, ", " \\__/", "      " };

		System.out.print(lines[lineNo]);
	}

	public void printLineForI(int lineNo) {
		String[] lines = { "       ","       ","  __ _ "," / _` |","| (_| |"," \\__,_|","       ","       "};

		System.out.print(lines[lineNo]);
	}
	public void printLineForN(int lineNo) {
		String[] lines = { "       ","       "," _ __  ","| '_ \\ ","| | | |","|_| |_|","       ","       "};

		System.out.print(lines[lineNo]);
	}
	public void printLineForR(int lineNo) {
		String[] lines = { "       ",
				"      ",
				" _ __ ",
				"| '__|",
				"| |   ",
				"|_|    ",
				"      ",
				"      "};

		System.out.print(lines[lineNo]);
	}
	public void printLineForU(int lineNo) {
		String[] lines = { "       ",
				"       ",
				" _   _ ",
				"| | | |",
				"| |_| |",
				"\\__,_|",
				"       ",
				"       "};

		System.out.print(lines[lineNo]);
	}
}
