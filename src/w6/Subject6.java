package w6;

import java.util.Scanner;


public class Subject6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 정수를 입력하시오: ");
		int[] arr = new int[10];



		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (min > arr[i])

				min = arr[i];

		}

		System.out.println(min);
		sc.close();
		

	}
}
