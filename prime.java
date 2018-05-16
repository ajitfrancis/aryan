import acm.program.*;

public class prime extends ConsoleProgram {
	public void run() {
		int num = readInt("How many prime numbers to be printed? ");
		int count = 0;
		for (int i = 2; count < num; i++) {
			if (isPrime(i)== true) {
				println (i);
				count++;
			}else {
			}
			}
		}
		
	public boolean isPrime(int n) {
			for (int i= 2; i<=n-1; i++) {
				if (n%i==0) {
					return false;
				}else {
										
				}
			}
			return true;
	
	}

}
