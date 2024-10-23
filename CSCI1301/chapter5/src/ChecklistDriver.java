
public class ChecklistDriver {
	public static void main(String[] args) {
		Checklist list = new Checklist();
		list.addItem("Go to store.");
		
		String task1 = "Go to store";
		String task2 = "Go home";
		
		list.addItem(task1);
		list.addItem(null);

		list.addItem(task2);
		list.addItem(null);
		
		
		for(int i = 0; i < Checklist.MAX_CAPACITY; i++) {
			list.addItem("Repeat");
		}
		
		System.out.println(list.isFull());
		System.out.println(list);
	}
}
