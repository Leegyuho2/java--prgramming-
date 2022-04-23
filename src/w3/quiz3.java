package w3;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number? ");
		int num = sc.nextInt();
		String animal = " ";
		switch (num) {
		case(1):
			animal = "dog";
		break;
		case(2):
			animal = "cat";
		break;
		case(3):
			animal = "chick";
		break;
		default:
			animal = "I don't know";
			break;


		}
		System.out.println(animal + "");
		sc.close();
	}
}
