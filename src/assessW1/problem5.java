package assessW1;
import java.util.Scanner;

public class problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard?");
		double y = sc.nextDouble();
		double cm = 91.44*y;
		
		System.out.printf("%.1f yard = %.1f cm",y,cm);
		sc.close();
		
		
	}
}
