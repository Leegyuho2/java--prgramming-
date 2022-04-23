package w5;

import java.util.Scanner;

public class Subject1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = 1, sum =0;
		while(j <= i) {
			sum = sum + j++;
			
		}
		System.out.print(sum);
		sc.close();

	}
}
