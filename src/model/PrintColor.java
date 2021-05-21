package model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class PrintColor {
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	public final static String NXLN  = ESC+"1E";
	private BufferedWriter print;
	private int color;
	private int velocity;
	private int place;
	private int longe;
	private int clean;
	private char ch = ' ';
	private int width = 1;
	public PrintColor(int color, int velocity,int place,int longe,int clean) {
		this.color=color;
		this.velocity = velocity;
		this.place= place;
		this.longe=longe;
		this.clean=clean;
		print=new BufferedWriter(new OutputStreamWriter(System.out));
	}
	public final static int[] TEXT_FORMAT = new int[] 
			{0,1,22,4,24,27,31,32,33,34,35,36,37,
			 40,41,42,43,44,45,46,47,48,90,91,92,93,94,
			 95,96,97,100,101,102,103,104,105,106,107};

	public   void   printB() throws InterruptedException, IOException  {
		if(clean ==1) {
			//System.out.println(ESC+"2J");
		}
		print.write(ESC+place+";"+0+"f");
		//Thread.sleep(velocity);
		while(width<120) {
		
			
			for (int i = 0; i < longe; i++) {
				print.write(ESC+TEXT_FORMAT[color]+"m"+" ");
				print.flush();
				
				int postionA=place+i;
				Thread.sleep(velocity);
				print.write(ESC+postionA+";"+width+"f");
			}
			print.write(ESC+TEXT_FORMAT[color]+"m"+ch );
			print.flush();			
			print.write(ESC+place+";"+width+"f");
			width++;
		}
	}
	

}
