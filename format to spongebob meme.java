import java.util.Scanner; 
public class spongebob {

public Scanner sentence;
public String change;
public static char [] changes2;

	public void input() {

	 sentence = new Scanner(System.in); 
	 change = sentence.nextLine(); 
	 changes2 = change.toCharArray();
	 
	 		}
	 		
	public void finalize( ) {
	for (int j = 0; j < changes2.length; j ++) {
		
			if (j % 2 == 0)
				System.out.print(Character.toUpperCase(changes2[j]));
			
				else if (true) { 
		System.out.print(changes2[j]);
	}}
	}
	
	 public static void main(String[] args) {
		spongebob d = new spongebob();
		d.input();
		d.finalize();
		
	}}


	