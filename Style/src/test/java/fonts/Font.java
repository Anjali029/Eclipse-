package fonts;

public class Font {
	private String name;
	private String style;

	
	public Font() {
		this.name = "Simple";
		this.style = "Simple";
	}
	
	protected Font (String name, String style) {
		this.name = name;
		this.style = style;
	}
	
	
	public void printText(String text) {
		System.out.println(text);
	}
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
