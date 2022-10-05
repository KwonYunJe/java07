package inheriteance;

public class Human extends Object {
	String gender;
	String name;
	
	public void eat() {
		System.out.println("Eat");
	}
	
	public void sleep() {
		System.out.println("Sleep.");
	}

	@Override
	public String toString() {
		return "Human [gender=" + gender + ", name=" + name + "]";
	}
	
	
}
