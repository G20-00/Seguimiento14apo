package ui;

import model.PrintColor;
import thread.PrintThread;

public class Main  {

	public static void main(String[] args) throws InterruptedException {
		PrintColor pc= new PrintColor();
		PrintColor pc1= new PrintColor();
		PrintColor pc2= new PrintColor();
		PrintThread pt1 = new PrintThread(pc,12,8,16,"0G","0d",1); 
		PrintThread pt2 = new PrintThread(pc1,12,12,17,"0G","13d",0); 
		PrintThread pt3 = new PrintThread(pc2,12,8,14,"0G","26d",0); 
		pt1.start();
	
		pt2.start();
	
		pt3.start();
	}
	
}
