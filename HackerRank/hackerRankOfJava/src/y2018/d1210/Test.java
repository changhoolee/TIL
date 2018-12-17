package y2018.d1210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		
	}
	
	//  배열 [1, 3, 4, 5 ,... 20]을 구하시오
	public static void pratice1() {
		
		// 내가 입력하고자 하는 값 담기
		Scanner sc = new Scanner (System.in);
		
		// 배열 그릇 만들기
		int [] list = new int [20];
		
		// 만들어진 배열을 통해 내가 입력하고자하는 값 집어넣기 
		for(int i = 1; i < list.length; ++i) {
			sc.nextInt(); // 내가 입력하고자 하는 값을 배열의 총 길이까지 할당하기
		}
		
		// Arrays 클래스의 toString()메소드를 통해 배열 list 출력하기
		System.out.println(Arrays.toString(list));
		
	}
	
	// 리스트를 10, 30 , 40, 50을 구하시오
	public static void pratice2() {
		
		Scanner sc = new Scanner(System.in);
		
		// Class type can only insert Integer, String, Float type.
		ArrayList <Integer> list = new ArrayList <Integer> ();
		
		// First Loop
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		
		// Value put in Index to Integer type.
		Integer [] index = new Integer [5];
		
		// Twice Loop - index!
		for(int j = 0; j < index.length; ++j) {
			index [j] = sc.nextInt();
		}
		
		// Print Arrays class in toString ()!
		System.out.println(Arrays.toString(index));
	}
}