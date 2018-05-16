import acm.program.ConsoleProgram;

/**
 * 
 * @author ajitj
 *
 */
public class star1 extends ConsoleProgram {
	public void run() {
		int num = readInt ("Enter the number of rows required: ");
		int i=1;
//		for (int i =1; i <= num; i++) {
//			for ( int j =1; j<= i; j++) {
//				print("*");
//			}
//			println();
//		}
		while(i<=num) {
			int j= 1;
			while(j<=i) {
				print("*");
				j++;
			}
			println();
			i++;
		}
	}

}