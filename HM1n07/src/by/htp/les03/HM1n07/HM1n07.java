package by.htp.les03.HM1n07;

import java.util.Scanner;

public class HM1n07 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		int counter = 0;
		
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
		
		System.out.println("Enter c: ");
		while(!conin.hasNextDouble()) {
			conin.next();
		}
		c = conin.nextDouble();
		
		if(a < 0) {
			counter++;
		}
		if(b < 0) {
			counter++;
		}
		if(c < 0) {
			counter++;
		}
		System.out.println("Количество отрицательных чисел " + counter);
	}
}
