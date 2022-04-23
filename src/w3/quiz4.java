package w3;

import java.util.Scanner;

public class quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하시오: ");
		int m = sc.nextInt();
		int d = 0;

		switch(m) {
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case (12):
			d = 31;
		break;
		case(4):
		case(6):
		case(9):
		case(11):
			d = 30;
		break;
		default:
			d = 28;
			break;
		}

		System.out.println(m + " 월의 일수는 " + d + "");
		sc.close();

	}
}
