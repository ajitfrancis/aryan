import acm.program.*;
/**
 * 
 * @author Ajit Francis Joy
 *
 */
public class highest extends ConsoleProgram {
	public void run() {
		int t , hcf;
		int a = readInt ("Enter first number: ");
		int b = readInt ("Enter second number: ");
		while(b!= 0) {
			t =b ;
			b = a%b;
			a=t;
		}
		hcf =a;
		println("HCF = " +hcf);
	}
}