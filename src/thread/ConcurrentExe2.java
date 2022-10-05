package thread;

public class ConcurrentExe2 {

	public static void main(String[] args) {
		ArrThread at = new ArrThread();
		CountThread ct = new CountThread();
		WatchThread wt = new WatchThread();
		
		at.start();
		ct.start();
		wt.start();
	}

}
