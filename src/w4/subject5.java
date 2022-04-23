package w4;

import java.util.Scanner;

public class subject5 {
	public static void main(String[] args) {
		int num=0, cnt=0;  
		Scanner sc = new Scanner(System.in) ;       
		System.out.print("정수를 입력하세요: ");
		while(true) {
			num = sc.nextInt();
			if(num == 0) {
				break;
			}else{
				if(num%3==0 || num%5==0 ){
					continue;
				}else {
					cnt++;
				}
			}
		}
		System.out.println("3의 배수도 5의 배수도 아닌 정수의 개수: "+cnt);
		sc.close();





	}
}
