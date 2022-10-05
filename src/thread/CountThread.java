package thread;

public class CountThread extends Thread {
	@Override
	public void run() {
		for(int i =500; i>=0; i--) {
			System.out.println("Count : " + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
