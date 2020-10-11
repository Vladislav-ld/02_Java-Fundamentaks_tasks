package by.htp.les03.HM1n09;

import java.util.Scanner;

public class HM1n09 {
	public static void main(String[] args) {
		double fun;
		double x;
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		while(!conin.hasNextDouble()) {
			conin.next();
		}
		x = conin.nextDouble();
		
		if(x <= 3) {
			fun = Math.pow(x, 2) - 3 * x + 9;
		} else {
			fun = 1/(Math.pow(x, 3) + 6);
		}
		
		System.out.println("F(x) = " + fun);
	}

}
