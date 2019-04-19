import java.util.*;

public class isPrime {
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static String a;
	public void check(int n) {
		
		for (int i = 2; i < n-1; i++ ) {
			if (n % i != 0) {
				a = "Number is a prime"; };
				
			if (n % i == 0) {
				a = null;
				break;
			};
			}
		
		};
			
public static void main(String[] args) {
	isPrime number = new isPrime();
	number.check(n);
	
		if(a != null) {
			System.out.print(a);
			
		}
		
		else if(a == null && n >= 2) {
			System.out.print("Number is not a prime");
		}
}};