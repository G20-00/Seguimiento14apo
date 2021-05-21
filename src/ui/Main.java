package ui;
import thread.PrintThread;


public class Main  {
	public final static String ESC   = "\u001b[";
	public static void main(String[] args) throws InterruptedException {
		System.out.println(ESC+"2J");
		PrintThread pt1 = new PrintThread(16,7,1,12,1); 
		PrintThread pt2 = new PrintThread(17,15,13,9,0); 
		PrintThread pt3 = new PrintThread(14,27,22,7,0); 
		pt1.start();
	    pt2.start();	
		pt3.start();
	}
	
}
