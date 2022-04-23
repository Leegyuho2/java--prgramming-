package w3;

import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  x= sc.nextLine();
		String  y= "";
		switch (x) {
			case ("a"):
				y = "Excellent";
				break;
			case ("b"):
				y = "Good";
				break;
			case ("c"):
				y = "Usually";
				break;
			case ("d"):
				y = "Effort";
				break;
			case ("f"):
				y = "Failure";
				break;
			default:
				y = "error";
				break;
		}
		System.out.println(""+ y);

		sc.close();


	}
}
