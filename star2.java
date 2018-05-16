import acm.program.ConsoleProgram;

public class star2 extends ConsoleProgram {
	public void run() {
		int num = readInt ("Enter the number of rows required: ");
		
//		for (int i =1; i <= num; i++) {
//			for (int j= 1; j <= num-i; j++) {
//				print(" ");
//			}
//			for ( int j =1; j<= i; j++) {
//				print("*");
//			}
//			println();
//	}
		int i= 1;
		while( i<= num) {
			int j=1, k=1;
			while( j<= num-i) {
				print(" ");
				j++;
			}
			while (k<= i) {
				print("*");
				k++;
			}
			println();
			i++;
		}
	}

}