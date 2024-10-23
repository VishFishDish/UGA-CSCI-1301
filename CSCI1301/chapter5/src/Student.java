
public class Student {
	private String name;
	private int[] hours = {3, 3, 4, 4};
	private char[] grades = {'B', 'B', 'A', 'C'};
	


	public Student() {
	
	}
	
	public String getName() {
		// this.name refers to the private String name of the Student class
		return this.name;
	}
	
	public void setName(String name) {
		// name refers to the variable that is set as the parameter when calling the method
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Bob");
		
	}
}

