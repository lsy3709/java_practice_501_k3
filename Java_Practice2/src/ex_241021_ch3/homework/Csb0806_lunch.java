package ex_241021_ch3.homework;

import java.util.Scanner;

public class Csb0806_lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("======오늘 먹고 싶은 메뉴를 3가지 고르기======");
		String menu[] = new String[3];
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "번째 먹고싶은 메뉴를 입력해주세요");
			menu[i] = scanner.next(); 
		}
		System.out.println("===================");
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println( "먹고싶은 메뉴:" + menu[i]);
		} 
		scanner.close();
		
		
	}

}
