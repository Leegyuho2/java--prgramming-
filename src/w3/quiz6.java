package w3;

import java.util.Scanner;

public class quiz6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("year? ");
		int year = sc.nextInt();
		String what_year = " ";
		
		if(year % 400 == 0) {
			what_year = "leap year";

		}
		else if (year % 4 == 0 && year % 100 != 0) {
			what_year = "leap year";

		}
		
		else {
			what_year = "common year";
			}
		
		System.out.println(year + " is " + what_year);

		
		
		
		sc.close();
	}
}
