package w3;

import java.util.Scanner;

public class quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		String b = "";
		int age = 0;

		System.out.print("성별: ");
		b = sc.nextLine();
		System.out.print("나이: ");
		age = sc.nextInt();

		switch (b) {
		case "f":
			if (age > 0) {
				if (age >= 18){
				
					a = "woman";
				}
				
				else {
					a = "girl";
				}
			}

			else {
				System.out.println("나이가 잘못되었습니다. ");
			}
			break; 
		case "m":
			if (age > 0) {
				if (age >= 18) {
					a = "man";
				}
				else {
					a ="boy";

				}

			}
			else {
				System.out.println("나이가 잘못되었습니다. ");

			}
			break;
		default:
			
			System.out.println("성별을 다시 입력세요 ");
			
			
			
			
			
			
			


		}
		System.out.println(a);
		sc.close();
	}
}

