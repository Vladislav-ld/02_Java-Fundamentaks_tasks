package by.htp.les03.HM1n14;

import java.util.Scanner;

public class HM1n14 {

	public static void main(String[] args) {
			int a;
			int sum = 1;
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
			
			
			for(i = 1; i <= a; i++) {
				if((sum * i) >= sum) {
					sum*=i;;
				}else {
					System.out.println("Вышли за границы " + sum);
					break;
				}
			}
			System.out.println("Ответ " + sum);
	}

}
