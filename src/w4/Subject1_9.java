package w4;

import java.util.Scanner;

public class Subject1_9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하시오: ");
		
		int a = sc.nextInt();
		int b = 1;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print(b + " ");
				b = (b+2 )%10;
			}
			System.out.println();
			sc.close();
		}

	}
}
