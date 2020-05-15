package fonts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Big extends Font {
	public Big() {
		super("Big", "Digital");
	}

	public void printText(String text) {
		char[] breaks = text.toLowerCase().toCharArray();
		for (int line = 0; line <= 7; line++) {
			for (int n = 0; n < breaks.length; n++) {
				char broke = breaks[n];
				switch (broke) {
				case 'a':
					printLineForA(line);
					break;
				case 'n':
					printLineForN(line);
					break;
				case 'i':
					printLineForI(line);
					break;
				case 'j':
					printLineForJ(line);
					break;
				case 'l':
				printLineForL(line);
					break;
				
				}
				System.out.print("   ");
			}
			System.out.println();
		}
	}

	public void printLineForA(int lineNo) {
		String[] lines = { 
				"       ",
				"       ",
				"  __ _ ",
				" / _` |",
				"| (_| |",
				"\\__,__|",
				"       ",
				"       ",
		};

		System.out.print(lines[lineNo]);
	}

	public void printLineForN(int lineNo) {
		String[] lines = { "       ","       "," _ __  ","| '_ \\ ","| | | |","|_| |_|","       ","       "	};

		System.out.print(lines[lineNo]);
	}

	public void printLineForJ(int lineNo) {
		String[] lines = {"   _   ","  (_) ","   _  ","  | | ","  | | ","  | | "," _/ | ","|__/  "};

		System.out.print(lines[lineNo]);
	}

	public void printLineForL(int lineNo) {
		String[] lines = { 
				" _ ",
				"| |",
				"| |",
				"| |",
				"| |",
				"|_|",
				"   ",
				"   ",
				 };

		System.out.print(lines[lineNo]);
	}

	public void printLineForg(int lineNo) {
//			String[] lines = { "  __ _ ", " / _` |", "| __  ", "|___| " };

		List<String> lines = new ArrayList<String>();

		lines.add("[---- ");
		lines.add("|     ");
		lines.add("| __  ");
		lines.add("|___| ");

//			System.out.print(lines[lineNo]);

		if (lines.size() <= lineNo) {
			System.out.print("       ");
		} else {
			System.out.print(lines.get(lineNo));
		}
	}

	

	public void printLineForI(int lineNo) {
		String[] orgLines = { 
				" _ ",
				"(_)",
				" _ ",
				"| |",
				"| |",
				"|_|",
				"   ",
				"   ",
				};

		List<String> lines = Arrays.asList(orgLines);
		if (lines.size() <= lineNo) {
			System.out.print("       ");
		} else {
			System.out.print(lines.get(lineNo));
		}
	}

	public void printLineForY(int lineNo) {
		String[] lines = {"", "", " _   _ ", "| | | |", "| |_| |", "\\__, |", " __/ |", "|___/ " };

		System.out.print(lines[lineNo]);
	}
}
