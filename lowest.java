import acm.program.*;
/**
 * 
 * @author Ajit Francis Joy
 *
 */
public class lowest extends ConsoleProgram {
	public void run() {
		int a , b, t1, t2 , lcm;
		int x = readInt ("Enter first number: ");
		int y = readInt ("Enter second number: ");
		boolean lcmFound = false;
		a=x;
		b=y;
//		
//		while(b!= 0) {
//			t =b ;
//			b = a%b;
//			a=t;
//		}
//		hcf =a;
//		lcm = (x*y)/hcf;
//		println("HCF = " +hcf);
//		println("LCM = " +lcm);
		
//		while (a%2!=0 && b%2!= 0) {
//			t1=a;
//			a=a/2;
//			
//			t2=b;
//			b=b/2;
//			
		if (b>a) {
			lcm=b;
		}else {
			lcm=a;
		}
		
		while(!lcmFound) // do while lcm is not found
        {
            if( lcm % a == 0 && lcm % b == 0 )
            {
                println ("LCM = " +lcm);
                lcmFound = true;
            }
            ++lcm;
        }
			
		}
		
		
	}


