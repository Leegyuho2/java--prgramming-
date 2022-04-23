package w4;

import java.util.Scanner;

public class Subject1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1=0, num2=0;

		System.out.println("서로 다른 두 개의 정수를 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();



		for (int i = 1; i < 10; i++) {
			if(num1>num2){
				for (int j=num1; j >= num2; j--) {
					System.out.println(j+" * "+i+" = "+(i*j)+"\t");
				}
			}else if(num2>num1){
				for (int j=num2; j >= num1; j--) {
					System.out.print(j+" * "+i+" = "+(i*j)+"\t");
				}

				System.out.print(" ");
				sc.close();


			}

		}
	}
}