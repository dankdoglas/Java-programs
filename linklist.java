import java.util.LinkedList;
import java.util.Scanner;

public class linklist {
	static Scanner sc;
	static int a,b,c;
	static String d;
	static LinkedList<Integer> object = new LinkedList<Integer>();
	void input() {
		
		System.out.println("How many element is in your linked list?");
		a = sc.nextInt();
		for (int i = 0; i <= a; i ++) {
			System.out.println("Input your element: ");
			b = sc.nextInt();
			object.add(b);
		}
		System.out.print(object);
	}
	
	void remove() {
		System.out.println("Which item do you want to remove in your linked list? Type in the index");
		c = sc.nextInt();
		object.remove(c);
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		linklist dank = new linklist();
		System.out.println("Do you want input, or remove operation on your linkedlist?");
		d = sc.next();
		d.toLowerCase();
		
		switch(d) {
		case "input": 
			dank.input();
			break;
		
		case "remove":
			dank.remove();
			break;
			
		}
		}
		
		
		
		

	}


