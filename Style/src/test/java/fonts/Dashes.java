package fonts;

public class Dashes extends Font {
	public Dashes()
	{
		super("Dashes", "dashes");
	}
	
	public void printText(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		System.out.println(text);
		

		for (int j = 0; j < text.length(); j++) {
			System.out.print("-");
		}
		System.out.println("");
		
	}

}
