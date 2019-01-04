package y2019.d0104;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratice01 {
	
	public static void main(String[] args) {
		
		pratice01();
		pratice02();
		pratice04();
		
	}
	
	public static void pratice01() {
		
//		1. 콘솔창에 입력하고자 하는 값을 설정한다.
//		1-1 Scanner 클래스를 생성한다.
		Scanner scan = new Scanner(System.in);
//		1-2 내가 만들고자 하는 리스트의 총 길이를 설정하는 변수를 생성한다.
		int SIZE = 10;
//		1-3 만들어 놓은 Scanner 클래스를 ArrayList에 넣어 리스트를 생성한다.
		ArrayList <String> list = new ArrayList <String> ();
//		1-4 해당 리스트의 for문을 이용해 값을 생성해 설정한다.
		for(int i = 0; i < SIZE; i++) {
			list.add(scan.nextLine());
		}
//		2. 콘솔창에 출력하고자 하는 값을 원하는 포맷에 맞게 설정한 후 출력한다.
		System.out.println("나의 리스트의 총 갯수는 " + SIZE + "개");
		for(int i = 0; i < SIZE; i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
	
	public static void pratice02() {
		
//		5개의 단어를 입력받고 출력하기 
//
//		[입력]
//		computer
//		mouse
//		phone
//		keyboard
//		monitor
//
//		[출력]
//		5개의 단어를 입력받았습니다.
//		1번째 : computer
//		2번째 : mouse
//		3번째 : phone
//		4번째 : keyboard
//		5번째 : monitor
//
//		이 중에 4번째 단어는 Keyboard입니다.
		
//		1. 5개의 단어를 입력 받기 위해 리스트 형태를 입력한다.
		ArrayList <String> line = new ArrayList <> ();
//		1-1 리스트 형태를 입력받기 위해 Scanner 클래스를 설정한다.
		Scanner scan = new Scanner(System.in);
//		1-2 리스트의 총 길이를 할당하는 값을 설정한다.
		int SIZE = 5;
//		1-3 이런 형태를 총 길이를 할당하는 값에 for문을 추가해 값을 설정한다.
		for(int i = 0; i < SIZE; i++) {
			line.add(scan.nextLine());
		}
//		2. 총 길이와 3번째에 속하는 인덱스 값을 콘솔창에 출력한다.
		System.out.println(SIZE);
		for(int i = 0; i < SIZE; i++) {
			System.out.println(i+ "번째" + line.get(i));
		}
		System.out.println("4번째" + line.get(3));
	}
	
	public static void pratice04() {
		
//		1. 배열 설정하기
		int [] line = new int [5];
		Scanner scan = new Scanner(System.in);
//		2. 배열 입력하기
		for(int i = 0; i < line.length; i++) {
			line [i] = scan.nextInt();
		}
//		3.배열 출력하기
		for(int i = 0; i < line.length; i++) {
			System.out.println(line[i]);
		}
	}	
}