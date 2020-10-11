package by.htp.les03.HM1n13;

import java.util.*;
public class HM1n13 {

	public static void main(String[] args) {
		int a;
		int sum = 0;
		int i;
		
		Scanner conin = new Scanner(System.in);
		
		do 
		{
			System.out.println("Введите число ");
			while(!conin.hasNextInt()) {
				conin.next();
			}
			a = conin.nextInt();
		}while(a <= 0);
		
		
		for(i = 0; i <= a; i++) {
			if((sum + a) > sum) {
				sum+=i;;
			}else {
				System.out.println("Вышли за границы ");
				break;
			}
		}
		System.out.println("Ответ " + sum);
	}

}
