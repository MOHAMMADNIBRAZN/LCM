package LCM;

public class LCM {

	public static void main(String[] args) {
		
		int n1 = 2 , n2 = 2 , lcm;
		lcm = (n1>n2) ? n1 : n2;
		while(true) {
			
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				
				System.out.printf("The lcm of %d and %d is %d.", n1, n2, lcm);
				
				break;
				
				
			}
			++lcm;
		}

	}

}
