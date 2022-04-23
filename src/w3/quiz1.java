package w3;

import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if(x < 0) 
		{
			System.out.print("minus");
		}
		else if (x >0) 
		{
			System.out.print("plus");
		}
		else
		{

			System.out.print("zero");
		}
		sc.close();
	}
}