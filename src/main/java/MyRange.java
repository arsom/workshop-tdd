
public class MyRange {

	private String input;

	public MyRange(String input) {
		this.input = input;
	}

	public boolean startWithInclude() {
		return this.input.startsWith("[");
	}


    public int getStart() {
		return this.input.charAt(1) - 48;
    }
}
