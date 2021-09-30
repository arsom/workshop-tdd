
public class MyRange {

	private String input;

	public MyRange(String input) {
		this.input = input;
	}

	public boolean startWithInclude() {
		return this.input.startsWith("[");
	}


    public int getStart() {
		if(startWithInclude()){
			return this.input.charAt(1) - 48;
		}
		return this.input.charAt(1) - (48 -1);
    }

	public boolean endWithInclude() {
		return this.input.endsWith("]");
	}
}
