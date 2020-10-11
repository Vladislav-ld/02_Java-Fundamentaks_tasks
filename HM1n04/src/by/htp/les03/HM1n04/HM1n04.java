package by.htp.les03.HM1n04;

import java.util.*;

public class HM1n04 {
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
			c = 7;
		} else {
			c = 8;
		}
		
		System.out.println("c = " + c);
	}

}
