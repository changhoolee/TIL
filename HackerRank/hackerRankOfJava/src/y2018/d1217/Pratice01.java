package y2018.d1217;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Pratice01 {

	public static void main(String[] args) {
		
		pratice01();
		pratice02();
		pratice03();
	}
	
	public static void pratice01() {
		// 콘솔창에 데이터 값 설정하기
				Scanner scan = new Scanner(System.in);
				
				String A = scan.nextLine();
				
				scan.close();
				
				// 비교하고자하는 데이터 값 설정하기
				
				int first = 0;
				int back = A.length()-1;
				
				// 설정 데이터들을 이용해 흐름 출력하기
				
				while(first <= back) {
					if(A.charAt(first)==A.charAt(back)) {
						++first;
						--back;
					} else {
					System.out.println("No");
					break;
					}
				}
				
				if(first > back) {
					System.out.println("Yes");
				}
	}
	
	public static void pratice02() {
		
		Scanner scan = new Scanner(System.in);
		
		String A = scan.nextLine();
		
		String Revese = new StringBuilder(A).reverse().toString();
		
		if(A.equals(Revese)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void pratice03() {
		
		Scanner scan = new Scanner(System.in);
		
		double payment = scan.nextDouble();
		
		scan.close();
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US); // 자바의 신 - 클래스 설명 다시 보기, String 같은 존재이군아!
		NumberFormat canada = NumberFormat.getCurrencyInstance(Locale.CANADA);
		
		System.out.println(us.format(payment));
		System.out.println(canada.format(payment));
	}
}