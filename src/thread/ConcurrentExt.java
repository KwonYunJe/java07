package thread;

public class ConcurrentExt {

	public static void main(String[] args) {
		Dollar tr1 = new Dollar();
		At tr2 = new At();
		And tr3 = new And();
		
		tr1.run();
		tr2.run();
		tr3.run();

	}

}
