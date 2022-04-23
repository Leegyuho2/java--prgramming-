package w4;

import java.util.Scanner;

public class Subject1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를입력하시오: ");
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		for(int i = 1;sum < n; i ++) {
			if(i%2==1) {
				sum+=i;
				cnt++;
			}
		}
		System.out.printf("%d %d",cnt,sum);
		sc.close();
	}
	
}
