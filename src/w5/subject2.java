package w5;

import java.util.Scanner;

public class subject2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int n;
		System.out.print("100이하 정수를 입력하시오 : ");
		n= sc.nextInt();
		if (n<=100) {
			for (int i = n; i <=100; i ++){
				sum = sum +  i;
			}
			System.out.print(sum);

		}
		else {
			System.out.print("잘못 입력였습니다.");
		}
		sc.close();


	}
}
