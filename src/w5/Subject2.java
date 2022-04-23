package w5;

import java.util.Scanner;

public class Subject2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("6명의 몸무게를 입력하시오: ");



		double[] arr = new double[6];

		double sum = 0;

		double average = 0;

		for (int i = 0; i < 6; i++) {

			arr[i] = sc.nextDouble();

			sum += arr[i];

		}

		average = sum / 6;

		Math.round(average);

		System.out.printf("%.1f", average);
		sc.close();



	}
	
}
