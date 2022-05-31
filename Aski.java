package Subject;
import java.util.Scanner;
public class Aski {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		int n = sc.nextInt();char ascii = 65;
		
		
		for(int i=0; i<n; i++) {
			char asci = ascii;
			int num = n;
			for(int j=n-1; j>=0; j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print(asci);
					asci +=(num-1);
					num--;
				}
			}
			System.out.println();
			ascii++;
		}
			
		sc.close();

	}

}
