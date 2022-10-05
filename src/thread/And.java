package thread;

public class And extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 1000; i++) {
			System.out.print("&");
		}
		System.out.println();
		super.run();
	}
}
