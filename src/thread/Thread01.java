package thread;

import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Thread01 extends Thread{
	@Override
	public void run() {
		for(int i  = 9; i < 1000; i++) {
			System.out.println("Plus : "+ i);
		}
	}
}
