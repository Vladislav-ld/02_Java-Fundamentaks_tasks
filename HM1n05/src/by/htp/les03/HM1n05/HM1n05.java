package by.htp.les03.HM1n05;

import java.util.Scanner;

public class HM1n05 {
		public static void main(String[] args) {
			int a;
			int b;
			int c;
			
			Scanner conin = new Scanner(System.in);
			
			System.out.println("Enter a: ");
			while(!conin.hasNextInt()) {
				conin.next();
			}
			a = conin.nextInt();
			
			System.out.println("Enter b: ");
			while(!conin.hasNextInt()) {
				conin.next();
			}
			b = conin.nextInt();
			
			if(a < b) {
				System.out.println("Наименьшее число a = " + a);
			} else if(a > b){
				System.out.println("Наименьшее число b = " + b);
			}else {
				System.out.println("Числа равны ");
			}
		}

}
