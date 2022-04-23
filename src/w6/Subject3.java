package w6;

import java.util.Scanner;

public class Subject3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 숫자를 입력하시오: ");

		double[] arr = {85.6, 79.5, 83.1, 80.0 ,78.2 ,75.0};

		int input1 = sc.nextInt();

		int input2 = sc.nextInt();

		double sum = arr[input1-1] + arr[input2-1];

		System.out.printf("%.1f", sum);
		sc.close();



	}
}
