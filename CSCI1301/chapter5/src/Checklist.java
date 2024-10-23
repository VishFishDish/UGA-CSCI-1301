public class Checklist {

	public static int MAX_CAPACITY = 10;
	
	// instance variables
	private String[] itemNames;
	private boolean[] isChecked;
	
	// The new keyword returns the address of our object after calling
	// its constructor
	
	// The default/paramter-less constructor
	
	/*
	 * Post-conditions: checklist has a capacity for MAX_CAPACITY items
	 */
	public Checklist() {
		// refers to the class Checklists' private instance variables created "itemNames" & "isChecked"
		this.itemNames = new String[MAX_CAPACITY];
		this.isChecked = new boolean[MAX_CAPACITY];
	}

	/*
	 * Pre conditions are true before a method is called
	 * Post conditions are true after a method is called
	 * 
	 * This method adds an item to the checklist if the list and marks it 
	 * as incomplete.
	 * 
	 * Pre-Condition: list is not full and itemName is not null
	 * Post-Condition: itemName is added to the list 
	 */
	
	public void addItem(String itemName){
		int itemIndex = this.indexOf(itemName);
		
		if(!isFull() && itemName != null && !itemName.equals("")) {
			int index = this.indexOf(null);
		
		}
		
		
	}
		
	public int indexOf(String itemName) {
		return -1;
	}
	
	public boolean isFull(){
		for (int i = 0; i < MAX_CAPACITY; i++) {
			if(itemNames[i] == null) {
				// List is not full
				return false;
			}
		}
		return true;
	}
	
	
	// Tell the JVM we are specifically writing
	// our own toString method
	@Override
	public String toString() {
		String res = "";
		
		return res;
	}
	
	
}
