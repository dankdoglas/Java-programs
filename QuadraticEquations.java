
class QuadraticEquations {
	
	double a = 1.0, b = -4.0, c = 0.0;
	double Mid = -b/(2*a);
	double Vertex = (a)*(Mid*Mid) + (b*Mid) + c;
	double Root = (b*b)-(4.0*a*c);
	double QuadFormula1 = (b*-1.0 + Math.sqrt(Root))/(2*a);
	double QuadFormula2 = (b*-1.0 - Math.sqrt(Root))/(2*a);
	//Change a, b, c according to Equation
	
	public void Discriminant() {
		if (b*b-(4.0*a*c) < 0)
		{ System.out.println("The parabola have no x intercepts");}
		else if (b*b-4.0*a*c > 0)
		{ System.out.println("The parabola have two x intercepts");}
		else if (b*b-4.0*a*c == 0)
		{ System.out.println("The parabola have one intercepts");}}
	
	public void midpoint() {
		System.out.println("The mid point of the Quadratic is " +  Mid);}
	
	public void vertex() {
		if (a > 0)
		System.out.println("The Minimum point of Parabola is " + Vertex);
		else if (a < 0)
		System.out.println("The Maximum point of Parabola is " + Vertex);}
	
	public void QuadFormula() {
		System.out.println("x equal to " + QuadFormula1 + " or x equal to " + QuadFormula2);}

	public void yintercept() {
		System.out.println("The y-intercept is " + c );}
	
	public static void main(String[] args) {
		QuadraticEquation find = new QuadraticEquation();
		//call the operation using find."operation"
		find.yintercept();
		find.QuadFormula();
		find.midpoint();
		find.vertex();
		find.Discriminant();
