package by.htp.les03.HM1n02;

import java.util.*;

public class HM1n02 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double answer;
		
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
		
		System.out.println("Enter d: ");
		while(!conin.hasNextDouble()) {
			conin.next();		
		}
		d = conin.nextDouble();
		
		if (c != 0 && d != 0) {
			answer = (a / c) * (b / d) - (a * b - c)/(c * d);
			System.out.println("Answer = " + answer);
		} else {
			System.out.println("Знаменатель равен нулю.");
			answer = Double.NaN;
		}
	}

}
