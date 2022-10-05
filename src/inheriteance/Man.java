package inheriteance;

public class Man extends Human{
	int size;
	
	public void Run() {
		System.out.println("Run fast");
	}

	@Override
	public String toString() {
		return "Man [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
	
	
}
