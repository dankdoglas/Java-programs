
import java.util.Scanner;

public class quadratic {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double Mid = -b/(2*a);
		double Vertex = a*(Mid*Mid) + (b*Mid) + c;
		double Root = (b*b) - (4.0 * a * c);
		double QuadFormula1 = (b *-1.0 + Math.sqrt(Root))/(2*a);
		double QuadFormula2 = (b *-1.0 - Math.sqrt(Root))/(2*a);	
		
			System.out.println("The y-intercept is " + c );
			System.out.println("x equal to " + QuadFormula1 + " or x equal to " + QuadFormula2);
			System.out.println("The mid point of the Quadratic is " +  Mid);
	
			if (a > 0) {
				System.out.println("The Minimum point of Parabola is " + Vertex);}
			else if (a < 0) {
				System.out.println("The Maximum point of Parabola is " + Vertex);}
			else if (b*b-(4.0*a*c) < 0){ 
				System.out.println("The parabola have no x intercepts");}
			else if (b*b-4.0*a*c > 0){
				System.out.println("The parabola have two x intercepts");}
			else if (b*b - 4.0*a*c == 0){
				System.out.println("The parabola have one intercepts");}
		}
}

