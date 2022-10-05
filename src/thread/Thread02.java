package thread;

public class Thread02 extends Thread{
	@Override
	public void run() {
		for(int i = 100; i > 0; i--) {
			System.out.println("Minus : " + i);
		}
	}
}
