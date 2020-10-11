package by.htp.les03.HM1n04;

import java.util.*;

public class HM1n03 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		while(!conin.hasNextDouble()) {
			conin.next();
		}
		a = conin.nextDouble();
		
		b = a / 1024;
		c = b / 1024;
		d = c / 1024;
		
		System.out.println("Kb = " + b + ", Mb = " + c + ", Gb = " + d);
	}

}
