import acm.program.*;

public class fibonacci extends ConsoleProgram {
	public void run() {
        int num1= 0; 
        int num2= 1;
        int sum = num1 + num2 ;
        println(num1+ "\n" + num2);
        while (sum < 10000) {
        	println(sum);
        	num1= num2;
        	num2 = sum;
        	sum = num1 +num2;
        	
        }
	}

}
