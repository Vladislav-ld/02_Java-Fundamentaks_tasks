package by.htp.les03.HM1n15;

import java.util.Scanner;

public class HM1n15 {

	public static void main(String[] args) {
		int a;
		int b;
		int i;
		
		Scanner conin = new Scanner(System.in);
		
		do 
		{
			System.out.println("Введите число a ");
			while(!conin.hasNextInt()) {
				conin.next();
			}
			a = conin.nextInt();
		}while(a <= 0);
		
		do 
		{
			System.out.println("Введите число b ");
			while(!conin.hasNextInt()) {
				conin.next();
			}
			b = conin.nextInt();
		}while(b <= 0);
		
		if(a <= b) {
			for(i = a;i >= 1; i--) {
				if(a % i == 0 && b % i == 0) {
					break;
				}
			}
		}else {
			for(i = b;i >= 1; i--) {
				if(b % i == 0 && a % i == 0) {
					break;
				}
			}
		}
		System.out.println("НОД " + i);
	}
}
