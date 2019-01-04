package y2018.d1226;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratice01 {
		
	public static void main(String[] args) {
		
		/*
		List로 10개의 정수 입력받고, 아래와 같이 출력하기
		[입력]
		1 3 6 3 8 9 10 2 4 3 

		[출력]
		입력받은 수는 10개 입니다.
		1: 1
		2: 3
		3: 6
		4: 8
		…
		10:3
		*/
		
		// test01();
		test02();
		
		
		}

	public static void test01() {
		
		// 1. 10개의 정수를 입력받는 for문을 입력한다.
		// 1-1 10개가 들어갈 수 있는 리스트 형태를 생성한다.
		ArrayList <Integer> list  = new ArrayList <> ();
		int SIZE = 10;
		// 1-2 만든 리스트 형태를 차례대로 반복해 입력하는 for문을 작성한다.
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i < SIZE; i++) {
			list.add(scan.nextInt());
		}
		
		// 2. 입력받은 10개의 정수의 길이와 1: 1,..., 10: 3 형태로 출력한다.
		// 2-1 입력받은 수를 구하기 위해 SIZE의 길이를 콘솔창에 출력하는 형태를 생성한다.
		System.out.println("입력받은 수는 " + SIZE + "개 입니다.");
		// 2-2 
//		for(int i = 0; i < 10; i++) {
//			System.out.println(list.get(i)+ ": " + list.get(scan.nextInt()));
//		}
//		 : for문에 대한 이해도가 떨어지는 수준을 나타 냄 , 한번에 무언가를 멋지게 나타내려고 함...
		for(int i=0; i<10; i++){
			  System.out.print((i+1)+ ": ");
			  System.out.println(list.get(i));
			}
	}
	
	public static void test02() {
		
		/*
		5개의 단어를 입력받고 출력하기 

		[입력]
		computer
		mouse
		phone
		keyboard
		monitor

		[출력]
		5개의 단어를 입력받았습니다.
		1번째 : computer
		2번째 : mouse
		3번째 : phone
		4번째 : keyboard
		5번째 : monitor

		이 중에 4번째 단어는 Keyboard입니다.
		*/
		
		// 1. 콘솔창에 입력하고자 하는 문자열을 담는다.
		// 1-1 5개의 단어를 담는 리스트를 입력한다.
		ArrayList <String> list = new ArrayList <String> ();
		
		Scanner scan = new Scanner(System.in);
		
		int SIZE = 5;
		
		for(int i = 0; i < SIZE; i++) {
			
			list.add(scan.next());
		}
		
		// 2. 총 3가지 종류의 포맷을 출력한다.
		// 2-1 SIZE의 길이를 출력하는 포맷(1)
		System.out.println(SIZE + "개의 단어를 입력받았습니다.");
		// 2-2 i번째를 출려하는 for문 포맷(2)
		for(int i = 0; i < SIZE; i++) { 
			System.out.println((i+1) + "번째 : " + list.get(i));
		} 
		// 2-3 그 중 4번째를 출력하는 포맷(3)
		System.out.println("이 중에 4번째 단어는 " + list.get(3) + "입니다.");
	}
}
