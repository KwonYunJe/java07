package thread;

import java.util.Date;

public class WatchThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<500; i++) {
			Date date = new Date(); 
			System.out.println("Now : " + date);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		super.run();
	}
}
