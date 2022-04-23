package w4;

import java.util.Scanner;

public class Subject1_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 부터 100까지 정수 한개를 입력하시오: ");

		int a = sc.nextInt();

		for (int i = 1; a*i <= 100;i++) {
			System.out.print(a*i + " ");

			if((a*i)%10 == 0) {
				break;

			}
		}

		sc.close();
	}
}
