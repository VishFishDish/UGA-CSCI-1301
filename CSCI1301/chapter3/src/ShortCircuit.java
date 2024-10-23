
public class ShortCircuit {
	public static final int LIMIT = 10;
	
	public static void main(String[] args) {
		String name = "John Doe";
		name = null;
		int numComparisons = 0;
		
		if (name.length() < LIMIT && name != null){
			System.out.printf("Hello %s.\n", name);
		}
		else {
			System.out.println("Invalid name.");
		}
		
	}

}
