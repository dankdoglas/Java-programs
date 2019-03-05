import java.util.Scanner;

public class fibionacci {
	private static Scanner sc;
	private static int a, b, c, d;
	
	public static void main(String[] args) {
	 b = 0;
	 c = 1;
	 sc = new Scanner(System.in);
	 System.out.print("Enter the number you want on the fibionacci sequence:");
	 a = sc.nextInt();
	 sc.close();
	 	if (a == 0) {
	 		System.out.println(0);
	 	}
	 	else if (a < 2 && a > 0) {
	 		System.out.println(1);
	 	}
	 // 112358,13,21
	 	else if (a > 2) {
	 		System.out.print("1 ");
	 	
	 		for (int i = 0; i < a - 1; i++) {
	 			d = b + c;
	 			System.out.print(+ d + " ");
	 			b = c;
	 			c = d;
	 	}
	 	
	
	 
	}}

}
