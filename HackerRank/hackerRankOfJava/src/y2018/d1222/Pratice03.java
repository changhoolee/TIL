package y2018.d1222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pratice03 {
	
	public static void main(String[] args) {
			
		
//			pratice01();
			pratice02();
				
	}
	
	public static void pratice01() {
		
		// 1 2 4 5 3 2 41 2 1 2
		
		// 1.입력하기
		Scanner scan = new Scanner(System.in);
		
		int [] list = new int [10];
		
		for(int i = 0; i < list.length; i++) {
			
			list[i] = scan.nextInt();
		}
		
		// 2. 출력하기
		System.out.print("입력받는 수 : ");
		
		for (int i=0; i<list.length; i++) {
		
			System.out.print(list[i]+", ");
		
		}
	}
	
	public static void pratice02() {
		
//		주석 달아주세요
//		//입력하기 (건드리지 말것 )
//
//		//출력하기 
//		// 1) '입력 받는 수 :' 를 출력한다.
//		// 2) '1 2 4 5 3 2 41 2 1 2' 반복문으로 출력한다.
		
//		// 1. 변수 선언
//		
//		ArrayList <Integer> list = new ArrayList <> ();
		
//		int SIZE = 10;
//		
//		Scanner scan = new Scanner(System.in);
//
//		// 2. 콘솔에 입력받기
//		for(int i =0; i< list.size(); i++) {
//				
//			list.add(scan.nextInt());
//		}
//
		// 3. 출력하기
//		System.out.print("입력 받는 수 : ");
//		for(int i = 0; i < SIZE -1; ++i) {
//			System.out.println(list.get(i)+ ", ") ;
//		}
//		System.out.print(list.get(SIZE-1));
		
		// 1. 변수 선언 2단계
		ArrayList<Integer> list = new ArrayList<>();
		int SIZE = 10;

		//2. 콘솔에서 입력받기 2단계
		Scanner scan = new Scanner(System.in);
		
		for( int i =0; i<SIZE; i++){
			list.add(scan.nextInt());
		}

		// 3. 출력하기 3단계
		System.out.print("입력 받은 수 :");
		
		for( int i=0; i<SIZE-1; i++){
			System.out.print(list.get(i)+","); 
		}
		
		System.out.print(list.get(SIZE-1));
	}
}