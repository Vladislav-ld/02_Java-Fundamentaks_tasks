package by.htp.les03.HM1n06;

import java.util.Scanner;

public class HM1n06 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		while(!conin.hasNextDouble()) {
			conin.next();
		}
		a = conin.nextDouble();
		
		System.out.println("Enter b: ");
		while(!conin.hasNextDouble()) {
			conin.next();
		}
		b = conin.nextDouble();
		
		c = a + b;
		
		if(c < 180) {
			System.out.println("Треугольник существует");
			if(c == 90 || a == 90 || b == 90) {
				System.out.println("Он рпямоугольный");
			}
		}else {
			System.out.println("Такой треугольник не существует");
		}
		
	}

}
