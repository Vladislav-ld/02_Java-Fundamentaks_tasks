package by.htp.les03.HM1n01;

import java.util.*;

public class HM1n01 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double answer;
		double sq;
		double temp;
		
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
		
		if (a != 0) {
			temp = Math.pow(b, 2) + 4 * a * c;
			sq = b + Math.sqrt(temp);
			answer = sq/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println("Answer = " + answer);
		} else {
			System.out.println("Знаменатель равен нулю.");
			answer = Double.NaN;
		}
	}

}
