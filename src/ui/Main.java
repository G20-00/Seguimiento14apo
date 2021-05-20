package ui;

import model.PrintColor;
import thread.PrintThread;

public class Main  {

	public static void main(String[] args) {
		PrintColor pc= new PrintColor();
		PrintThread pt1 = new PrintThread(pc,12,8,16,"0G","0d",1); 
		PrintThread pt2 = new PrintThread(pc,12,8,22,"13G","0d",0); 
		PrintThread pt3 = new PrintThread(pc,12,8,1,"26G","0d",0); 
		pt1.run();
		pt2.run();
		pt3.run();
	}
	
}
