import acm.program.ConsoleProgram;

public class star3 extends ConsoleProgram {
	public void run() {
		int num = readInt ("Enter the number of rows required: ");
//		for (int i =1; i <= num; i++) {
//			for (int j= 1; j <= i-1; j++) {
//				print(" ");
//			}
//			for ( int j =(num+1)-i; j>=1 ; j--) {
//				print("*");
//			}
//			println();
//	}
		int i=1;
		while (i<=num) {
			for (int j= 1; j <= i-1; j++) {
				print(" ");
			}
			for ( int j =(num+1)-i; j>=1 ; j--) {
				print("*");
			}
			println();
			i++;
		}
	}

}