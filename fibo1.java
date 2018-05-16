import acm.program.*;

public class fibo1 extends ConsoleProgram {
	
	/**
	 * This is fibonacci
	 */
	public void run() {
        int num1= 0; 
        int num2= 1;
        int sum = num1 + num2 ;
        println(num1+ "\n" + num2);
        for(int i=3; i<=100; i++) {
        	println(sum);
        	num1= num2;
        	num2 = sum;
        	sum = num1 +num2;
        	
        }
	}

}