import acm.program.*;

public class ReturnMystery1 extends ConsoleProgram {
	public void run() {
		int a = 4;
		int b = 2;
		int c = 5;
		
		a = mystery(c , b);
		c= mystery (b, a);
		println(a);
		println(b);
		println(c);
	}
	public int mystery (int b, int c) {
		return c + 2 * b;		
	}

}
