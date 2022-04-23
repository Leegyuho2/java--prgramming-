package w4;

import java.util.Scanner;

public class Subject1_5 {
	public static void main(String[] args) {
		int line;
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하시오 : ");
		line = sc.nextInt();

		for(int i=0, add=line-1; i<line; i++, add--) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<line-i+add; j++) {
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}



	}
}




