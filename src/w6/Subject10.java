package w6;

import java.util.Scanner;

public class Subject10 {
	public static void main(String[] args) {
		int[][] arr = new int[4][2];



		Scanner sc = new Scanner(System.in);
		System.out.print("4행 2열의 배열을 입력하시오: ");

		int result = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = sc.nextInt();

			}

		}



		for (int i = 0; i < arr.length; i++) {

			int sum = 0;

			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];

			}

			result += sum;

			System.out.print((sum / 2) + " ");

		}

		System.out.println();

		for (int i = 0; i < 2; i++) {

			int sum = 0;

			for (int j = 0; j < 4; j++) {

				sum += arr[j][i];

			}

			System.out.print((sum / 4) + " ");

		}

		System.out.println();

		System.out.println(result / 8);
		sc.close();



	}
}
