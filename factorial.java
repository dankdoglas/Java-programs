import java.util.Scanner;

public class factorial {
	private static Scanner sc;
	private static int a, b, c, d;
	public static void main(String[] args) {
		System.out.println("Find the Factorial(!) of:");
		sc = new Scanner(System.in);
		a = sc.nextInt();
		b = 1;
			if (a ==  1 && a == 0) {
				System.out.println(1);
			}
		
			else {
				for (int i = 1; i <= a; i++) {
					b *= i;
					
				}
				System.out.print("The factorial of " + a + " is: "   + b);
			}
	}

}
