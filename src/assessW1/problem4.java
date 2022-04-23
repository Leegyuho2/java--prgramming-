package assessW1;
import java.util.Scanner;

public class problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		int avg = sum/3;
		
		//System.out.printf("a = %d b = %d c = %d\n",a,b,c);
		System.out.printf("sum = %d\navg = %d",sum, avg);
		sc.close();
	}
}
 