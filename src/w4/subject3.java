package w4;

import java.util.Scanner;

public class subject3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한개의 자연수를 입력하시오: ");

		int number = sc.nextInt();



		for(int i = number; i <= number * 10; i += number) {

			System.out.print(i + " ");

			sc.close();


		}
	}
}