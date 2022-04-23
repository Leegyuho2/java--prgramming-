package w6;

import java.util.Scanner;

public class Subject1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 문자를 입력받으시오: ");

		String input =sc.nextLine();

		String[] 
				a =  input.split(" ");

		System.out.print(a[0]+" "+ a[3] + " " + a[6]);
		sc.close();
		
	}

}
