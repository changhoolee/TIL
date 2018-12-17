package y2018.d1214;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pratice01 {

	public static void main(String[] args) {
		
		// 숫자가 10, 40, 50, 20, 69이 담긴 리스트 만들기
		// 평균이 30.5, 65.5, 72.0, 82.4가 담긴 배열 만들기
		
//		pratice01();
//		pratice02();
//		pratice03();
		pratice04();
	}
	
	public static void pratice01() {
		
		Scanner scan = new Scanner(System.in);
		
		int [] list = new int [6];
		
		for(int i = 1; i < list.length; i++) {
			list [i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(list));
		
	}
		
	
	public static void pratice02() {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList <Integer> myList = new ArrayList <Integer> ();
		System.out.print("Enter some numbers.");
		while(scan.hasNextInt()) {
			myList.add(scan.nextInt());
		}
		
		System.out.println(myList);
		
	}
	
	public static void pratice03() {
		
		Scanner list = new Scanner(System.in);
		
		ArrayList <Integer> myList = new ArrayList <Integer> ();
		
		while(list.hasNextInt()) {
			
			myList.add(list.nextInt());
		}
		System.out.println(myList);
		
	}
	
	public static void pratice04() {
		
		for(int i = 2; i < 2; ++i) {
			for(int j = 1; j < 10; ++j) {
				System.out.println(i+ "*" + j +  "=" + i*j);
				System.out.println("\t");
			}
			System.out.println();
		}
		
	}
}
