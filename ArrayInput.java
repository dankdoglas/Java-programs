import java.util.Scanner;

public class ArrayInput {
	private static Scanner input;
	
	void twoDimension() {
		input = new Scanner(System.in);
		System.out.println("Input the first dimension of the array:");
		int a = input.nextInt();
		System.out.println("Input the second dimension of the array:");
		int b = input.nextInt();
		int arr[][] = new int[a][b];
		for (int i = 0; i < a; i++) {
			System.out.println("Input the Integers in this dimension of the array");
			for (int j = 0; j < b; j++) {
				arr[i][j] = input.nextInt();
		}
		}

		for (int k = 0; k < a; k++) {
			for (int f = 0; f < b; f++) {
				System.out.print(arr[k][f] + " ");
		}
		}
	}

	public static void main(String[] args) {
		ArrayInput obj = new ArrayInput();
		obj.twoDimension();
		
	}
}

