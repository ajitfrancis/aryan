import acm.program.*;

public class star4 extends ConsoleProgram {
	public void run() {
		int num = readInt ("Enter the number of rows required: ");
//		for (int i =1; i <= num; i++) {
//			for (int j= 1; j <= num-i; j++) {
//				print(" ");
//			}
//			for ( int j =1; j<= 2*i -1; j++) {
//				print("*");
//			}
//			println();
//	}
		int i=1;
		while ( i<=num) {
			for (int j= 1; j <= num-i; j++) {
				print(" ");
			}
			for ( int j =1; j<= 2*i -1; j++) {
				print("*");
			}
			println();
			i++;
		}
	}

}
