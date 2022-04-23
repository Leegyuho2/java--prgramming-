package w2;
import java.util.Scanner;
public class quesiton2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        if ((x > y && x > z ))
        {   
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }
        if (x == y && y == z) {
        	System.out.println(true);
        	
        }
        else {
        	System.out.println(false);
        	sc.close();
        }
	}
}
