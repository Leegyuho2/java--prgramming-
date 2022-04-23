package w5;

import java.util.Scanner;

public class Subject6 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int base = sc.nextInt();
    		int height = sc.nextInt();
    		float triangleWidth = (float)base * height / 2;
    		
    		System.out.printf("Base  Height  = Triangle width = %.1f\n", triangleWidth);
    		
    		System.out.print("Continue? ");
    		char exit = sc.next().charAt(0);
    		
    		if(exit != 'Y' && exit != 'y') {
    			break;
    		}
    	}
    	
    	sc.close();

	}
}
