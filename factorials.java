import acm.program.*;

public class factorials extends ConsoleProgram {
	public void run() {
		int i,fact=1;
		int num = readInt("The number of Factorial to display? ");
		for (i=1; i<=num; i++) {
			fact =fact*i;
			print(i + "x");
		}
		println(fact);
	}

}
