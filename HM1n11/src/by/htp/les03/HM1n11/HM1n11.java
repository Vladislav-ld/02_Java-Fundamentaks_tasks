package by.htp.les03.HM1n11;

import java.util.*;

public class HM1n11 {

	public static void main(String[] args) {
		double a;
		double b;
		double h = 0;
		double x = 0;
		double i;
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Введите a: ");
		while(!conin.hasNextDouble()) {
			conin.next();
		}
		a = conin.nextDouble();
		
		System.out.println("Введите b: ");
		while(!conin.hasNextDouble()) {
			conin.next();
		}
		b = conin.nextDouble();
		
		do {
			System.out.println("Введите h: ");
			while(!conin.hasNextDouble()) {
				conin.next();
			}
			h = conin.nextDouble();
		}while(Math.abs(b - a) >= Math.abs(h) && h <= 0);
		
		for(i = a;i <=b; i+=h) {
			if(i > 2) {
				x += i;
			}else {
				x -= i;
			}
		}
		
		System.out.println("Ответ: " + x);
	}

}
