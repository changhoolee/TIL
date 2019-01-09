package y2019.d0107;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratice01 {
	
	public static void main(String[] args) {
			
		pratice01();
		pratice02();
		
	}
	
	public static void pratice01() {
		
		// 10개의 문자열이 담긴 배열 만들기
		
		// 1. 10개의 배열 인덱스에 입력하기 위한 Scannner 클래스 생성하기
		//1-1 
		Scanner scan = new Scanner(System.in);
		// 2. 10개의 배열을 만들기 위한 배열 생성하기
		//1-2
		String [] list = new String [10];
		// 3. 10개의 배열을 차례대로 입력하기 위한 for()문 생성하기
		for(int i = 1; i < list.length; i++) {
			list[i] = scan.nextLine();
		}
		
		// 4. 10개의 배열을 인덱스 1부터 10까지를 출력하기 위한 for()문 생성하기
		for(int i = 1; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
	public static void pratice02() {
		
		// 5개의 정수가 담긴 리스트 만들기
		
		// 1. Scanner 클래스 생성하기
		Scanner scan = new Scanner(System.in);
		// 2. ArrayList <Integer> 생성하기
		ArrayList <Integer> list = new ArrayList <Integer>(); 
		// 2-1 임의의 list 사이즈를 갖는 변수 생성하기
		int SIZE = 6;
		// 3. for문을 이용해 List에 할당 된 값 하나씩 입력하기
		for(int i = 1; i < SIZE; i++) {
			list.add(scan.nextInt());
		}
		// 4. List에 할당 된 값 출력하기
		for(int i = 1; i < SIZE; i++) {
			System.out.println(list);
		}
	}
	
	// 사람 - class
	//  * Jin - object 
	
	
}
