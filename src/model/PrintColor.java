package model;

public class PrintColor {
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	public final static String NXLN  = ESC+"1E";
	public PrintColor() {
		
	}
	public final static int[] TEXT_FORMAT = new int[] 
			{0,1,22,4,24,27,31,32,33,34,35,36,37,
			 40,41,42,43,44,45,46,47,48,90,91,92,93,94,
			 95,96,97,100,101,102,103,104,105,106,107};

	public  void printB(int max,int sleep,int color,String cursor1,String cursor2,int clean) throws InterruptedException {
		char ch = ' ';
		
		int width = 1;
		if(clean == 1) {
			System.out.print(ESC+"2J");//Clear screen
		}
		
		System.out.print(ESC+cursor1+ESC+cursor2);//Cursor in 0,0
		
		//String pass = "";
		Thread.sleep(sleep);
		while(width<80) {
			width++;
			for (int i = 0; i < 8; i++) {
				System.out.print(ESC+TEXT_FORMAT[color]+"m"+ch);
				Thread.sleep(sleep);
				System.out.print(DOWN);
				System.out.print(LEFT);
			}
			System.out.print(ESC+TEXT_FORMAT[color]+"m"+ch);
				Thread.sleep(sleep);
				for (int i = 0; i < 8; i++) {
				System.out.print(ESC+TEXT_FORMAT[color]+"m"+ch);
				Thread.sleep(sleep);
				System.out.print(UP);
				//System.out.print(LEFT);
				}		
		}
	}


}
