package thread;

public class At extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 1000; i++) {
			System.out.print("@");
		}
		System.out.println();
		super.run();
	}
}
