package w4;

import java.util.Scanner;

public class Subject1 {
	public static void main(String[] args) {
		System.out.print("10개의 문자를 입력하시오: ");		
	
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] arr =  input.split(" ");

		System.out.print(arr[0]+" "+ arr[3] + " " + arr[6]);
		
		sc.close();


	}
}
