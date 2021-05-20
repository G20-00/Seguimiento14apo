package thread;

import model.PrintColor;

public class PrintThread implements Runnable{
	private PrintColor printC;
	private int max;
	private int sleep;
	private int color;
	private String cursor1;
	private String cursor2;
	private int clean;
	public PrintThread(PrintColor prin,int max,int sleep,int color,String cursor1,String cursor2,int clean) {
		printC = prin;
		this.max=max;
		this.sleep=sleep;
		this.color=color;
		this.cursor1= cursor1;
		this.cursor2 =cursor2;
		this.clean= clean;
	}
	public PrintColor getPrintC() {
		return printC;
	}
	public void setPrintC(PrintColor printC) {
		this.printC = printC;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getSleep() {
		return sleep;
	}
	public void setSleep(int sleep) {
		this.sleep = sleep;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public String getCursor1() {
		return cursor1;
	}
	public void setCursor1(String cursor1) {
		this.cursor1 = cursor1;
	}
	public String getCursor2() {
		return cursor2;
	}
	public void setCursor2(String cursor2) {
		this.cursor2 = cursor2;
	}
	public int getClean() {
		return clean;
	}
	public void setClean(int clean) {
		this.clean = clean;
	}

	public void run() {

			try {
				printC.printB(max, sleep, color, cursor1, cursor2, clean);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		
	}


}
