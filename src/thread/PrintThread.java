package thread;

import java.io.IOException;

import model.PrintColor;

public class PrintThread extends Thread{
	private PrintColor printC;


	public PrintThread(int color, int velocity,int position,int longed,int clean) {
		printC = new PrintColor(color,velocity,position,longed,clean);
		
	}
	
	public void run() {		
		//System.out.println(ESC+"2J");
				try {
				 printC.printB();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	
		
		
	}
	

}
