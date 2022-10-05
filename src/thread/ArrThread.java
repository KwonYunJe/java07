package thread;

public class ArrThread extends Thread{
	@Override
	public void run() {
		String[] s = {"Coffee", "Ramen", "Chocolate", "Pizza"};
		for(int i =0; i<s.length; i++) {
			System.out.println("Food : " + s[i]);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
