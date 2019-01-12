package y2019.d0112;

import java.util.ArrayList;
import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		review01();
		review02();
		
	}
	
	public static void review01() {
		
		/*
		 민정님 수업 배열, 리스트 복습하기 및 if, for문 원리 설명하기!
		*/
		
		// 1. 배열 선언하기
		
		// 1-1 제일 먼저 scan을 입력하는 값을 설정한다.
		Scanner scan = new Scanner(System.in);
		
		// 1-2 int 타입의 배열에 총 10개의 배열 형태를 할당한다.
		int [] list = new int [10];
		
		
		// 2. for문으로 배열 입력하기
		
		// 2-1 for문의 조건 범위를 이용해 출력하고자 하는 횟수를 지정한 후 Scanner scan 클래스의 nextInt()메소드를 배열 list에 할당한다. 
		for(int i = 0; i < list.length; i++) {
			list [i] = scan.nextInt();
		}
		// 3. 배열 출력하기
		
		// 3-1 for문의 조건 범위를 이용해 출력하고자 하는 횟수를 지정한 후 앞서 입력한 list[i]의 데이터 값을 System.out.print 한다.
		for(int i =0; i < list.length; i++) {
			System.out.print(list[i]);
		}
	}
	
	public static void review02() {
		
		/*
		 * 리스트를 구해보자.
		 */
		
		// 1. 리스트 선언하기
		// 1-1 제일 먼저 Scanner를 구한다.
		Scanner scan = new Scanner(System.in);
		
		ArrayList <Integer> list = new ArrayList <> ();
		// 2. for문을 이용해 리스트 데이터 값 입력하기
		// 2-1 List의 경우 배열과 다르게 범위가 정해져 있는 메소드가 없기에 길이를 갖는 임의의 변수를 입력한다.
		int SIZE = 5;
		// 2-2 for문 조건에 해당되는 제한 범위까지 출력한다.
		for(int i = 0; i < SIZE; i++) {
			list.add(scan.nextInt(i));
		}
		//3. 
		for(int i = 0; i < SIZE; i++) {
			System.out.print(list.get(i));
		}
		
	}

}
