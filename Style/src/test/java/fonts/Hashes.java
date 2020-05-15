package fonts;

public class Hashes extends Font {
	public Hashes() {
		super("haseshaser", "dashes");
	}

	public void printText(String text) {
		for (int i = 0; i < text.length()+4; i++) {
			System.out.print("#");
		}
		System.out.println("");

		System.out.println("# " + text + " #");

		for (int j = 0; j < text.length()+4; j++) {
			System.out.print("#");
		}
		System.out.println("");
	}
}
